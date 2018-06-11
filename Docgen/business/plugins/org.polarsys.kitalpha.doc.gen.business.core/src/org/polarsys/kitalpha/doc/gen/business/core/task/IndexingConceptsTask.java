/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.EscapeChars;


public class IndexingConceptsTask implements ITaskProduction {

	private static final String LOG_PROPERTY = "org.polarsys.kitalpha.doc.gen.business.core/debug";
	private static final boolean DO_TRACE = isLogFeatureSetted();
	private static final Logger logger = Logger.getLogger(IndexingConceptsTask.class.getName());
	private static final String INDEXING_PREF = "[INDEXING] ";

	private Map<String, List<String>> conceptsToPageTitle = new HashMap<String, List<String>>();

	private Map<String, List<String>> conceptsToPageParagraph = new HashMap<String, List<String>>();

	private Map<String, List<String>> conceptsToPageList = new HashMap<String, List<String>>();

	private Map<String, List<String>> conceptsToPageTable = new HashMap<String, List<String>>();

	private Map<String, String> fileNameToTitle = new HashMap<String, String>();


	//Regexp patterns
	private static final Pattern pTable = Pattern.compile("<table>(.*?)</table>"); 	//table
	private static final Pattern pTitle = Pattern.compile(".*<title>(.*)</title>.*"); 	//title
	private static final Pattern pHeaderOne = Pattern.compile("<h1>(.*)</h1>"); 			//title head <h1>
	private static final Pattern pParagraphe = Pattern.compile("<p>(.*?)</p>"); 	//paragraph
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
		List<String> concepts = productionContext.getInputValue("concepts", List.class);

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
			
			indexResources(concepts, content);

			concepts = removeConceptsWithEmptyPages(concepts);

			productionContext.setOutputValue("concepts.with.pages", concepts);

			if (DO_TRACE) {
				logger.info(INDEXING_PREF + "Starting generating index pages");
			}

			generatingConceptsPages(projectName, outputFolder, concepts);

			if (DO_TRACE) {
				logger.info(INDEXING_PREF + "End generating index pages");
			}

		} catch (CoreException e) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		}
	}

	private void indexResources(List<String> concepts, IResource[] content) throws CoreException {
		for (IResource currentResource : content) 
		{
			if (currentResource instanceof IFile) 
			{
				indexFile(concepts, currentResource);
			}
		}
	}

	private void indexFile(List<String> concepts, IResource currentResource) throws CoreException {
		IFile file = (IFile) currentResource;
		if (file.getName().endsWith(".html") &&	isFileAModelHtmlPage(file.getName())) 
		{
			if (DO_TRACE) {
				logger.info(INDEXING_PREF + "Starting indexing page: " + file.getName());
			}

			indexPage(concepts, file);

			if (DO_TRACE) {
				logger.info(INDEXING_PREF + "Ending indexing page: " + file.getName());
			}
		}
	}

	/**
	 * [BZE] this method keep only concepts with search index page containing some links
	 */
	public List<String> removeConceptsWithEmptyPages(List<String> concepts){
		List<String> conceptsToRemove = new ArrayList<String>();
		
		collectEmptyPages(concepts, conceptsToRemove);

		doClean(concepts, conceptsToRemove);

		return concepts;
	}

	private void doClean(List<String> concepts, List<String> conceptsToRemove) {
		if (!conceptsToRemove.isEmpty()) {
			concepts.removeAll(conceptsToRemove);
		}
	}

	private void collectEmptyPages(List<String> concepts, List<String> conceptsToRemove) {
		for (String currentConcept : concepts) 
		{
			boolean noPage = true;
			final List<String> inPages = conceptsToPageTitle.get(currentConcept);
			noPage = inPages == null || inPages.isEmpty(); 

			boolean noPageParagraph = true;
			final List<String> inPageParagraph = conceptsToPageParagraph.get(currentConcept);
			noPageParagraph = inPageParagraph == null || inPageParagraph.isEmpty();

			boolean noPageList = true;
			final List<String> inList = conceptsToPageList.get(currentConcept);
			noPageList = inList == null || inList.isEmpty(); 

			boolean noPageTable = true;
			final List<String> inTable = conceptsToPageTable.get(currentConcept);
			noPageTable = inTable == null || inTable.isEmpty(); 

			if (noPage && noPageParagraph && noPageList && noPageTable) {
				conceptsToRemove.add(currentConcept);
			}
		}
	}

	private void generatingConceptsPages(String projectName,
			String outputFolder, List<String> concepts) {
		int i = 0;
		for (String currentConcept : concepts) 
		{
			i ++;
			StringBuffer buffer = new StringBuffer();
			buffer.append(HEADER);
			buffer.append("<h1>" + currentConcept + "</h1>");

			// Title
			List<String> currentConceptPages = conceptsToPageTitle.get(currentConcept);
			generateTitle(currentConcept, buffer, currentConceptPages);

			// Paragraph
			currentConceptPages = conceptsToPageParagraph.get(currentConcept);
			generateParagraph(currentConcept, buffer, currentConceptPages);

			// List
			currentConceptPages = conceptsToPageList.get(currentConcept);
			generateList(buffer, currentConceptPages);

			// Table
			currentConceptPages = conceptsToPageTable.get(currentConcept);
			generateTable(buffer, currentConceptPages);
			
			
			buffer.append(FOOTER);

			DocGenHtmlUtil.writeFilePatternContent(i+"_"+DocGenHtmlUtil.getValidFileName(currentConcept),
					projectName, outputFolder + "/concepts", buffer.toString());

		}
	}

	private void generateTable(StringBuffer buffer, List<String> currentConceptPages) {
		if (currentConceptPages != null) 
		{
			doGenerateTables(buffer, currentConceptPages);
		}
	}

	private void generateList(StringBuffer buffer, List<String> currentConceptPages) {
		if (currentConceptPages != null) 
		{
			doGenerateLists(buffer, currentConceptPages);
		}
	}

	private void generateParagraph(String currentConcept, StringBuffer buffer, List<String> currentConceptPages) {
		if (currentConceptPages != null) 
		{
			doGenerateParagraphs(currentConcept, buffer);
		}
	}

	private void generateTitle(String currentConcept, StringBuffer buffer, List<String> currentConceptPages) {
		if (currentConceptPages != null) 
		{
			doGenerateTitles(currentConcept, buffer);
		}
	}

	private void doGenerateTables(StringBuffer buffer, List<String> currentConceptPages) {
		buffer.append("<h2>Concept referenced in Table</h2>");
		buffer.append("<ul>");
		for (String fileName : currentConceptPages) 
		{
			buffer.append("<li>");
			buffer.append("<a href=\"../" + fileName + "\">" + fileNameToTitle.get(fileName) + "</a>");
			buffer.append("</li>");
		}

		buffer.append("</ul>");
	}

	private void doGenerateLists(StringBuffer buffer, List<String> currentConceptPages) {
		buffer.append("<h2>Concept referenced in list</h2>");
		buffer.append("<ul>");
		for (String fileName : currentConceptPages) 
		{
			buffer.append("<li>");
			buffer.append("<a href=\"../" + fileName + "\">" + fileNameToTitle.get(fileName) + "</a>");
			buffer.append("</li>");
		}

		buffer.append("</ul>");
	}

	private void doGenerateParagraphs(String currentConcept, StringBuffer buffer) {
		buffer.append("<h2>Concept referenced in paraphraph</h2>");
		buffer.append("<ul>");
		for (String fileName : conceptsToPageParagraph.get(currentConcept)) 
		{
			buffer.append("<li>");
			buffer.append("<a href=\"../" + fileName + "\">" + fileNameToTitle.get(fileName) + "</a>");
			buffer.append("</li>");
		}

		buffer.append("</ul>");
	}

	private void doGenerateTitles(String currentConcept, StringBuffer buffer) {
		buffer.append("<h2>Concept referenced in title</h2>");
		buffer.append("<ul>");
		for (String fileName : conceptsToPageTitle.get(currentConcept)) 
		{
			buffer.append("<li>");
			buffer.append("<a href=\"../" + fileName + "\">" + fileNameToTitle.get(fileName) + "</a>");
			buffer.append("</li>");
		}

		buffer.append("</ul>");
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

	private void indexPage(List<String> concepts, IFile file)
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
			for (String currentConcept : concepts) 
			{
				String title = mPHeaderOne.group(1);
				String currentConcept_html = EscapeChars.forHTML(currentConcept);
				if (title.contains(currentConcept_html)) {
					indexTitle(fileName, currentConcept);
				}
			}
		}

		// index paragraph

		if (DO_TRACE) {
			logger.info(INDEXING_PREF + "Starting indexing paragraphs of file: " + fileName);
		}

		mParagraphe = mParagraphe.reset(pageContent);
		while (mParagraphe.find()) {
			for (String currentConcept : concepts) {
				for (int i = 1; i <= mParagraphe.groupCount(); i++) {
					String paragraph = mParagraphe.group(i);
					String currentConcept_html = EscapeChars.forHTML(currentConcept);
					if (paragraph.contains(currentConcept_html)) {
						indexParagraph(fileName, currentConcept);
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
					for (final String currentConcept : concepts) 
					{
						String currentConcept_html = EscapeChars.forHTML(currentConcept);
						if (listText.contains(currentConcept_html)) 
						{
							indexList(fileName, currentConcept);
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
			for (String currentConcept : concepts) {
				String currentConcept_html = EscapeChars.forHTML(currentConcept);
				for (int i = 1; i <= mTable.groupCount(); i++) {
					String listGroup = mTable.group(i);
					if (listGroup.contains(currentConcept_html)) {
						indexTable(fileName, currentConcept);
						break;
					}
				}
			}
		}

		if (DO_TRACE) {
			logger.info(INDEXING_PREF + "End indexing Table of file: " + fileName);
		}
	}

	private void indexList(String fileName, String currentConcept) {
		List<String> list = conceptsToPageList.get(currentConcept);
		if (list != null && ! list.contains(fileName)) {
			list.add(fileName);
		} else {
			List<String> localList = new ArrayList<String>();
			localList.add(fileName);
			conceptsToPageList.put(currentConcept, localList);
		}

		if (DO_TRACE) {
			logger.info(INDEXING_PREF + "Concept: " + currentConcept + " is indexed in file: " + fileName);
		}
	}

	private void indexParagraph(String fileName, String currentConcept) {
		List<String> list = conceptsToPageParagraph.get(currentConcept);
		if (list != null && ! list.contains(fileName)) {
			list.add(fileName);
		} else {
			List<String> localList = new ArrayList<String>();
			localList.add(fileName);
			conceptsToPageParagraph.put(currentConcept, localList);
		}

		if (DO_TRACE) {
			logger.info(INDEXING_PREF + "Concept: " + currentConcept + " is indexed in file: " + fileName);
		}
	}

	private void indexTitle(String fileName, String currentConcept) {

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

	private void indexTable(String fileName, String currentConcept) {

		List<String> list = conceptsToPageTable.get(currentConcept);
		if (list != null && ! list.contains(fileName)) {
			list.add(fileName);
		} else {
			List<String> localList = new ArrayList<String>();
			localList.add(fileName);
			conceptsToPageTable.put(currentConcept, localList);
		}
		if (DO_TRACE) {
			logger.info(INDEXING_PREF + "Concept: " + currentConcept + " is indexed in file: " + fileName);
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
