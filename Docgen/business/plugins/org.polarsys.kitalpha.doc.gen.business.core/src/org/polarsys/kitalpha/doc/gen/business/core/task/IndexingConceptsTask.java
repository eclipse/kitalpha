/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.polarsys.kitalpha.doc.gen.business.core.Activator;
import org.polarsys.kitalpha.doc.gen.business.core.services.IndexItem;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.MonitorServices;


public class IndexingConceptsTask implements ITaskProduction {

	private static final String LOG_PROPERTY = "org.polarsys.kitalpha.doc.gen.business.core/debug";
	private static final boolean DO_TRACE = isLogFeatureSetted();
	private static final Logger logger = Logger.getLogger(IndexingConceptsTask.class.getName());
	private static final String INDEXING_PREF = "[INDEXING] ";

	private Map<IndexItem, List<String>> conceptsToPageTitle = new HashMap<>();

	private Map<IndexItem, List<String>> conceptsToPageParagraph = new HashMap<>();

	private Map<IndexItem, List<String>> conceptsToPageList = new HashMap<>();

	private Map<IndexItem, List<String>> conceptsToPageTable = new HashMap<>();
	
	/* 
	 * Not needed while index items maps file to concepts information
	 * 
	 * @Depricated
	 */
	@Deprecated
	private Map<String, String> fileNameToTitle = new HashMap<>();
	


	//Regexp patterns
	private static final Pattern pTable = Pattern.compile("<table>(.*?)</table>", Pattern.DOTALL); 	//table
	private static final Pattern pTitle = Pattern.compile(".*<title>(.*?)</title>.*", Pattern.DOTALL); 	//title
	private static final Pattern pHeaderOne = Pattern.compile(".*<h1>(.*?)</h1>.*", Pattern.DOTALL); 			//title head <h1>
	private static final Pattern pParagraphe = Pattern.compile("<p>(.*?)</p>", Pattern.DOTALL); 	//paragraph
	private static final Pattern pListStartEnd = Pattern.compile("((<ul.*?>)|(</ul>))", Pattern.DOTALL);	//indexed list

	//Matchers
	private static Matcher mTable = pTable.matcher(""); //for table
	private static Matcher mTitle = pTitle.matcher(""); //for title
	private static Matcher mPHeaderOne = pHeaderOne.matcher(""); //for title head h1
	private static Matcher mParagraphe = pParagraphe.matcher(""); //for paragraph
	private static Matcher mListStartEnd = pListStartEnd.matcher(""); //for lists


	private static final String HEADER = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>"
			+ "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\""
			+ "\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">"
			+ "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">"
			+

			"<head>"
			+ "<meta http-equiv=\"content-type\" content=\"text/html;charset=ISO-8859-1\" />"
			+ "<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />"
			+

			"<title>Index</title>		"
			+ "<link title=\"default\" rel=\"stylesheet\" type=\"text/css\" media=\"screen, projection\" href=\"../../../css/content.css\"></link>"
			+ "</head><body><div id=\"content\">";
	private static final String FOOTER = "</div></body></html>";

	@Override
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

	}

	public boolean isFileAModelHtmlPage(String fileName){
		return !(isFooterOrHeaderPage(fileName) || 			//$NON-NLS-1$
				isIndexPage(fileName));						//$NON-NLS-1$
	}

	private boolean isFooterOrHeaderPage(String fileName) {
		return fileName.equals("footer.html") || 			//$NON-NLS-1$
				fileName.equals("header.html");				//$NON-NLS-1$
	}

	private boolean isIndexPage(String fileName) {
		return fileName.equals("index.html") ||			//$NON-NLS-1$
				fileName.equals("searchIndex.html") ||	//$NON-NLS-1$
				fileName.equals("sidebar.html");		//$NON-NLS-1$
	}

	@Override
	@SuppressWarnings("unchecked")
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

		// get Contracts values
		String projectName = productionContext.getInputValue("projectName", String.class);
		String outputFolder = productionContext.getInputValue("outputFolder", String.class);
		Map<String, IndexItem> indexItems = productionContext.getInputValue("indexItems", Map.class);
		
		if (DO_TRACE) {
			logger.info(INDEXING_PREF + "Start indexing at: " + Calendar.getInstance().get(Calendar.MINUTE));
			logger.info(INDEXING_PREF + "Project: " + projectName);
			logger.info(INDEXING_PREF + "Output folder: " + outputFolder);
		}

		// Treat all files available in the output Folder
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projectName);
		IFolder folder = project.getFolder(new Path(outputFolder));
		try {
			IResource[] content = folder.members();

			MonitorServices.init(content.length);
			indexResources(indexItems, content);
			
			if (DO_TRACE) {
				logger.info(INDEXING_PREF + "Starting generating index pages");
			}

			MonitorServices.init(indexItems.size());
			generatingConceptsPages(projectName, outputFolder, indexItems, monitor);

			if (DO_TRACE) {
				logger.info(INDEXING_PREF + "End generating index pages");
			}

		} catch (CoreException e) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		}
	}

	private void indexResources(Map<String, IndexItem> indexItems, IResource[] content) throws CoreException {
		for (IResource currentResource : content) 
		{
			if (currentResource instanceof IFile) 
			{
				indexFile(indexItems, currentResource);
			}
			MonitorServices.workSubMonitor("Computing index pages content");
		}
	}

	private void indexFile(Map<String, IndexItem> indexItems, IResource currentResource) throws CoreException {
		IFile file = (IFile) currentResource;
		if (file.getName().endsWith(".html") &&	isFileAModelHtmlPage(file.getName())) 
		{
			if (DO_TRACE) {
				logger.info(INDEXING_PREF + "Starting indexing page: " + file.getName());
			}

			indexPage(indexItems, file);

			if (DO_TRACE) {
				logger.info(INDEXING_PREF + "Ending indexing page: " + file.getName());
			}
		}
	}

	private void generatingConceptsPages(String projectName,
			String outputFolder, Map<String, IndexItem> indexItems, IProgressMonitor monitor) {
		int i = 0;
		List<String> indexItemsToRemove = new ArrayList<String>();
		for (Entry<String, IndexItem> currentConcept : indexItems.entrySet()) 
		{
			if (!isToRemoveIndexItem(currentConcept.getValue())) {
				i ++;
				StringBuffer buffer = new StringBuffer();
				buffer.append(HEADER);
				buffer.append("<h1>" + currentConcept.getValue().getConceptName() + "</h1>");
				
				generateLinkTowardConcept(indexItems, currentConcept.getValue(), buffer);
	
				// Title
				List<String> currentConceptPages = conceptsToPageTitle.get(currentConcept.getValue());
				generateTitle(currentConcept.getValue(), indexItems, buffer, currentConceptPages);
	
				// Paragraph
				currentConceptPages = conceptsToPageParagraph.get(currentConcept.getValue());
				generateParagraph(currentConcept.getValue(), indexItems, buffer, currentConceptPages);
	
				// List
				currentConceptPages = conceptsToPageList.get(currentConcept.getValue());
				generateList(currentConcept.getValue(), indexItems, buffer, currentConceptPages);
	
				// Table
				currentConceptPages = conceptsToPageTable.get(currentConcept.getValue());
				generateTable(currentConcept.getValue(), indexItems, buffer, currentConceptPages);
				
				
				buffer.append(FOOTER);
	
				DocGenHtmlUtil.writeFilePatternContent(i+"_"+DocGenHtmlUtil.getValidFileName(currentConcept.getValue().getConceptName()),
						projectName, outputFolder + "/concepts", buffer.toString());
			} else {
				indexItemsToRemove.add(currentConcept.getKey());
			}
			MonitorServices.workSubMonitor("Generating index pages");
		}

		// Clean IndexItems
		doClean(indexItems, indexItemsToRemove);
	}
	
	private boolean isToRemoveIndexItem (IndexItem item) {
		boolean noPage = true;
		final List<String> inPages = conceptsToPageTitle.get(item);
		noPage = inPages == null || inPages.isEmpty(); 

		boolean noPageParagraph = true;
		final List<String> inPageParagraph = conceptsToPageParagraph.get(item);
		noPageParagraph = inPageParagraph == null || inPageParagraph.isEmpty();

		boolean noPageList = true;
		final List<String> inList = conceptsToPageList.get(item);
		noPageList = inList == null || inList.isEmpty(); 

		boolean noPageTable = true;
		final List<String> inTable = conceptsToPageTable.get(item);
		noPageTable = inTable == null || inTable.isEmpty(); 
		
		return noPage && noPageParagraph && noPageList && noPageTable;
	}

	private void doClean(Map<String, IndexItem> indexItems, List<String> indexItemsToRemove) {
		if (!indexItemsToRemove.isEmpty()) {
			for (String item: indexItemsToRemove) {
				indexItems.remove(item);
			}
		}
	}

	private void generateLinkTowardConcept(Map<String, IndexItem> indexItems, IndexItem indexItem,
			StringBuffer buffer) {
		String iconTag = indexItem.getIconTag();
		String linkTagTowardPageElement = indexItem.getLinkTagTowardPageElement();
		/*
		 * Generate the section which has the link to the element in the case
		 * of link Tag is specified
		 */
		if (linkTagTowardPageElement != null && !linkTagTowardPageElement.isEmpty()) {
			buffer.append("<h2>Direct link toward element page</h2>");
			buffer.append("<ul class=\"generatedList\"><li>");
			if (iconTag != null) {
				buffer.append(iconTag).append(" ");
			}
			buffer.append(linkTagTowardPageElement);
			buffer.append("</li></ul>");
		}
	}

	private void generateTable(IndexItem indexItem, Map<String, IndexItem> indexItems, StringBuffer buffer, List<String> currentConceptPages) {
		if (currentConceptPages != null) 
		{
			doGenerateTables(indexItem, indexItems, buffer, currentConceptPages);
		}
	}

	private void generateList(IndexItem indexItem, Map<String, IndexItem> indexItems, StringBuffer buffer, List<String> currentConceptPages) {
		if (currentConceptPages != null) 
		{
			doGenerateLists(indexItem, buffer, indexItems, currentConceptPages);
		}
	}

	private void generateParagraph(IndexItem indexItem, Map<String, IndexItem> indexItems, StringBuffer buffer, List<String> currentConceptPages) {
		if (currentConceptPages != null) 
		{
			doGenerateParagraphs(indexItem, indexItems, buffer);
		}
	}

	private void generateTitle(IndexItem indexItem, Map<String, IndexItem> indexItems, StringBuffer buffer, List<String> currentConceptPages) {
		if (currentConceptPages != null) 
		{
			doGenerateTitles(indexItem, indexItems, buffer);
		}
	}
	
	private Optional<IndexItem> generateImageTag(String fileName, Map<String, IndexItem> indexItems, StringBuffer buffer) {
		IndexItem matchingItem = indexItems.get(fileName.substring(0, fileName.indexOf(".")));
		if (matchingItem != null) {
			String iconTag = matchingItem.getIconTag();
			if (iconTag != null && !iconTag.isEmpty()) {
				buffer.append(iconTag).append(" ");
			}
			return Optional.of(matchingItem);
		} else {
			return Optional.empty();
		}
	}

	private void doGenerateTables(IndexItem indexItem, Map<String, IndexItem> indexItems, StringBuffer buffer, List<String> currentConceptPages) {
		buffer.append("<h2>Tables referencing the Element</h2>");
		buffer.append("<ul class=\"generatedList\">");
		for (String fileName : currentConceptPages) 
		{
			doGenerateHtmlListItem(indexItems, buffer, fileName);
		}

		buffer.append("</ul>");
	}


	private void doGenerateLists(IndexItem indexItem, StringBuffer buffer, Map<String, IndexItem> indexItems, List<String> currentConceptPages) {
		buffer.append("<h2>Lists referencing the Element</h2>");
		buffer.append("<ul class=\"generatedList\">");
		for (String fileName : currentConceptPages) 
		{
			doGenerateHtmlListItem(indexItems, buffer, fileName);
		}

		buffer.append("</ul>");
	}

	private void doGenerateParagraphs(IndexItem indexItem, Map<String, IndexItem> indexItems, StringBuffer buffer) {
		buffer.append("<h2>Paragraphs referencing the Element</h2>");
		buffer.append("<ul class=\"generatedList\">");
		for (String fileName : conceptsToPageParagraph.get(indexItem)) 
		{
			doGenerateHtmlListItem(indexItems, buffer, fileName);
		}
		buffer.append("</ul>");
	}

	private void doGenerateTitles(IndexItem indexItem, Map<String, IndexItem> indexItems, StringBuffer buffer) {
		buffer.append("<h2>Titles referencing the Element</h2>");
		buffer.append("<ul class=\"generatedList\">");
		for (String fileName : conceptsToPageTitle.get(indexItem)) 
		{
			doGenerateHtmlListItem(indexItems, buffer, fileName);
		}
		buffer.append("</ul>");
	}

	private void doGenerateHtmlListItem(Map<String, IndexItem> indexItems, StringBuffer buffer, String fileName) {
		buffer.append("<li>");
		Optional<IndexItem> findedItem = generateImageTag(fileName, indexItems, buffer);
		if (findedItem.isPresent()) {
			IndexItem item = findedItem.get();
			buffer.append("<a href=\"../" + fileName + "\">" + item.getConceptType() + " - " + item.getConceptName() + "</a>");
		} else {
			buffer.append("<a href=\"../" + fileName + "\">" + fileNameToTitle.get(fileName) + "</a>");
		}
		buffer.append("</li>");
	}
	

	private String getPageContent(IFile file) throws CoreException {
		StringBuffer buffer = new StringBuffer();
		InputStream inputStream = null;
		try {
			inputStream = file.getContents();
			InputStreamReader reader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				buffer.append(line);
			}
			inputStream.close();
		} catch (IOException | CoreException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		return buffer.toString();
	}

	private void indexPage(Map<String, IndexItem> indexItems, IFile file)
			throws CoreException {
		String fileName = file.getName();

		String pageContent = getPageContent(file);
		// Page title
		mTitle = mTitle.reset(pageContent);
		if (mTitle.matches()) {
			String title = mTitle.group(1);
			fileNameToTitle.put(fileName, title);

			if (DO_TRACE) {
				logger.info(INDEXING_PREF + "Title index: " + title + " in file: " + fileName);
			}
		}

		// index H1
		mPHeaderOne = mPHeaderOne.reset(pageContent);
		if (mPHeaderOne.matches()) 
		{
			for (Entry<String, IndexItem> entry : indexItems.entrySet()) 
			{
				String title = mPHeaderOne.group(1);
				String currentConcept_html = entry.getValue().getEscapedForHTMLConceptName();
				if (title.contains(currentConcept_html)) {
					indexTitle(fileName, entry.getValue());
				}
			}
		}

		// index paragraph

		if (DO_TRACE) {
			logger.info(INDEXING_PREF + "Starting indexing paragraphs of file: " + fileName);
		}

		mParagraphe = mParagraphe.reset(pageContent);
		while (mParagraphe.find()) {
			for (Entry<String, IndexItem> entry : indexItems.entrySet()) {
				String currentConcept_html = entry.getValue().getEscapedForHTMLConceptName();
				for (int i = 1; i <= mParagraphe.groupCount(); i++) {
					String paragraph = mParagraphe.group(i);
					if (paragraph.contains(currentConcept_html)) {
						indexParagraph(fileName, entry.getValue());
						break;
					}
				}
			}
		}

		if (DO_TRACE) {
			logger.info(INDEXING_PREF + "End indexing paragraphs of file: " + fileName);
		}

		if (DO_TRACE) {
			logger.info(INDEXING_PREF + "Start indexing Lists of file: " + fileName);
		}

		// Index lists
		mListStartEnd = mListStartEnd.reset(pageContent);
		int level = 0;
		int listStartIndex = -1;
		while (mListStartEnd.find())
		{
			if (mListStartEnd.groupCount() > 1 && mListStartEnd.group(2) != null) 
			{
				// A list start
				level += 1;
				if (level == 1) 
				{
					listStartIndex = mListStartEnd.start(2);
				}
			} 
			else 
			{
				// A list end
				level -= 1;
				if (level == 0) {
					final int listEndIndex = mListStartEnd.end(3);
					final String listText = pageContent.substring(listStartIndex, listEndIndex);
					for (Entry<String, IndexItem> entry : indexItems.entrySet())
					{
						String currentConcept_html = entry.getValue().getEscapedForHTMLConceptName();
						if (listText.contains(currentConcept_html)) 
						{
							indexList(fileName, entry.getValue());
						}
					}
				}
			}
		}

		if (DO_TRACE) {
			logger.info(INDEXING_PREF + "End indexing Lists of file: " + fileName);
		}

		if (DO_TRACE) {
			logger.info(INDEXING_PREF + "Start indexing Table of file: " + fileName);
		}

		// Index tables
		mTable = mTable.reset(pageContent);
		while (mTable.find()) 
		{
			for (Entry<String, IndexItem> entry : indexItems.entrySet()) {
				String currentConcept_html = entry.getValue().getEscapedForHTMLConceptName();
				for (int i = 1; i <= mTable.groupCount(); i++) {
					String listGroup = mTable.group(i);
					if (listGroup.contains(currentConcept_html)) {
						indexTable(fileName, entry.getValue());
						break;
					}
				}
			}
		}

		if (DO_TRACE) {
			logger.info(INDEXING_PREF + "End indexing Table of file: " + fileName);
		}
	}

	private void indexList(String fileName, IndexItem indexItem) {
		List<String> list = conceptsToPageList.get(indexItem);
		if (list != null && ! list.contains(fileName)) {
			list.add(fileName);
		} else {
			List<String> localList = new ArrayList<String>();
			localList.add(fileName);
			conceptsToPageList.put(indexItem, localList);
		}

		if (DO_TRACE) {
			logger.info(INDEXING_PREF + "Concept: " + indexItem + " is indexed in file: " + fileName);
		}
	}

	private void indexParagraph(String fileName, IndexItem indexItem) {
		List<String> list = conceptsToPageParagraph.get(indexItem);
		if (list != null && ! list.contains(fileName)) {
			list.add(fileName);
		} else {
			List<String> localList = new ArrayList<String>();
			localList.add(fileName);
			conceptsToPageParagraph.put(indexItem, localList);
		}

		if (DO_TRACE) {
			logger.info(INDEXING_PREF + "Concept: " + indexItem.getConceptName() + " is indexed in file: " + fileName);
		}
	}

	private void indexTitle(String fileName, IndexItem currentConcept) {

		List<String> list = conceptsToPageTitle.get(currentConcept);
		if (list != null && ! list.contains(fileName)) {
			list.add(fileName);
		} else {
			List<String> localList = new ArrayList<String>();
			localList.add(fileName);
			conceptsToPageTitle.put(currentConcept, localList);
		}
		
		if (DO_TRACE) {
			logger.info(INDEXING_PREF + "Concept: " + currentConcept + " is indexed in file: " + fileName);
		}
	}

	private void indexTable(String fileName, IndexItem indexItem) {

		List<String> list = conceptsToPageTable.get(indexItem);
		if (list != null && ! list.contains(fileName)) {
			list.add(fileName);
		} else {
			List<String> localList = new ArrayList<String>();
			localList.add(fileName);
			conceptsToPageTable.put(indexItem, localList);
		}
		if (DO_TRACE) {
			logger.info(INDEXING_PREF + "Concept: " + indexItem + " is indexed in file: " + fileName);
		}
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

	}

	private static boolean isLogFeatureSetted(){
		String property = Platform.getDebugOption(LOG_PROPERTY);
		return property != null && property.equalsIgnoreCase("true"); //$NON-NLS-1$
	}

}
