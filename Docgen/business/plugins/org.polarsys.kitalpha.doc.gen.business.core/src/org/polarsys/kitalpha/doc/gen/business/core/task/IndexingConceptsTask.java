/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.EscapeChars;


public class IndexingConceptsTask implements ITaskProduction {

	private Map<String, List<String>> conceptsToPageTitle = new HashMap<String, List<String>>();

	private Map<String, List<String>> conceptsToPageParagraph = new HashMap<String, List<String>>();

	private Map<String, List<String>> conceptsToPageList = new HashMap<String, List<String>>();

	private Map<String, List<String>> conceptsToPageTable = new HashMap<String, List<String>>();

	private Map<String, String> fileNameToTitle = new HashMap<String, String>();

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

	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

	}
	
	public boolean isFileAModelHtmlPage(String fileName){
		return !(fileName.equals("footer.html") || 
				 fileName.equals("header.html") ||
				 fileName.equals("index.html") ||
				 fileName.equals("searchIndex.html") ||
				 fileName.equals("sidebar.html"));
//		return false;
	}

	@SuppressWarnings("unchecked")
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

		// get Contracts values
		String projectName = productionContext.getInputValue("projectName", String.class);
		String outputFolder = productionContext.getInputValue("outputFolder", String.class);
		List<String> concepts = productionContext.getInputValue("concepts", List.class);
		
		// Treat all files available in the output Folder
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projectName);
		IFolder folder = project.getFolder(new Path(outputFolder));
		try {
			IResource[] content = folder.members();
			for (IResource currentResource : content) 
			{
				if (currentResource instanceof IFile) 
				{
					IFile file = (IFile) currentResource;
					if (file.getName().endsWith(".html") &&	isFileAModelHtmlPage(file.getName())) 
					{
						// if (!pageToTile.containsKey(file.getName())) {
						indexPage(concepts, file);
						// }
					}
				}
			}
			
			concepts = removeConceptsWithEmptyPages(concepts);
			
			productionContext.setOutputValue("concepts.with.pages", concepts);
			
			generatingConceptsPages(projectName, outputFolder, concepts);

		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * [BZE] this method keep only concepts with search index page containing some links
	 */
	public List<String> removeConceptsWithEmptyPages(List<String> concepts){
	List<String> conceptsToRemove = new ArrayList<String>();
		for (String currentConcept : concepts) 
		{
			boolean noPage = true;
			final List<String> inPages = conceptsToPageTitle.get(currentConcept);
			noPage = inPages == null || (inPages != null && inPages.isEmpty()); 
			
			boolean noPageParagraph = true;
			final List<String> inPageParagraph = conceptsToPageParagraph.get(currentConcept);
			noPageParagraph = inPageParagraph == null || (inPageParagraph != null && inPageParagraph.isEmpty());
			
			boolean noPageList = true;
			final List<String> inList = conceptsToPageList.get(currentConcept);
			noPageList = inList == null || (inList != null && inList.isEmpty()); 
			
			boolean noPageTable = true;
			final List<String> inTable = conceptsToPageTable.get(currentConcept);
			noPageTable = inTable == null || (inTable != null && inTable.isEmpty()); 
			
			if (noPage && noPageParagraph && noPageList && noPageTable)
				conceptsToRemove.add(currentConcept);
		}
		
		if (conceptsToRemove.isEmpty() == false)
			concepts.removeAll(conceptsToRemove);
		
		return concepts;
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
			if (currentConceptPages != null) 
			{
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

			// Paragraph
			currentConceptPages = conceptsToPageParagraph.get(currentConcept);
			if (currentConceptPages != null) 
			{
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

			// List
			currentConceptPages = conceptsToPageList.get(currentConcept);
			if (currentConceptPages != null) 
			{
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

			// Table
			currentConceptPages = conceptsToPageTable.get(currentConcept);
			if (currentConceptPages != null) 
			{
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
			buffer.append(FOOTER);
			
			DocGenHtmlUtil.writeFilePatternContent(i+"_"+DocGenHtmlUtil.getValidFileName(currentConcept),
					projectName, outputFolder + "/concepts", buffer.toString());

		}
	}

	private String getPageContent(IFile file) throws CoreException {
		StringBuffer buffer = new StringBuffer();
		InputStream inputStream = file.getContents();
		InputStreamReader reader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String line;
		try {
			while ((line = bufferedReader.readLine()) != null) {
				buffer.append(line);
			}
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return buffer.toString();
	}
	
	private void indexPage(List<String> concepts, IFile file)
			throws CoreException {
		String fileName = file.getName();

		String pageContent = getPageContent(file);
		// Page title
		Pattern pTitle = Pattern.compile(".*<title>(.*)</title>.*");
		Matcher mTitle = pTitle.matcher(pageContent);
		if (mTitle.matches()) {
			fileNameToTitle.put(fileName, mTitle.group(1));
		}

		// index H1
		Pattern pH1 = Pattern.compile(".*<h1>(.*)</h1>.*");
		Matcher m = pH1.matcher(pageContent);
		if (m.matches()) 
		{
			for (String currentConcept : concepts) 
			{
				String title = m.group(1);
				String currentConcept_html = EscapeChars.forHTML(currentConcept);
				if (title.contains(currentConcept_html))
					indexTitle(fileName, currentConcept);
			}
		}
		
		// index paragraph
		Pattern pParagraphe = Pattern.compile(".*<p>(.*?)</p>.*");
		Matcher mParagraphe = pParagraphe.matcher(pageContent);
		if (mParagraphe.matches()) {
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
		// Index lists
		Pattern pList = Pattern.compile(".*<ul (.*?)</ul>.*");
		Matcher mList = pList.matcher(pageContent);
		if (mList.matches()) {
			for (String currentConcept : concepts) {
				for (int i = 1; i <= mList.groupCount(); i++) {
					String listGroup = mList.group(i);
					String currentConcept_html = EscapeChars.forHTML(currentConcept);
					if (listGroup.contains(currentConcept_html)) {
						indexList(fileName, currentConcept);
					}
				}
			}
		}

		// Index tables
		Pattern pTable = Pattern.compile(".*<table>(.*?)</table>.*");
		Matcher mTable = pTable.matcher(pageContent);
		if (mTable.matches()) {
			for (String currentConcept : concepts) {
				for (int i = 1; i <= mTable.groupCount(); i++) {
					String listGroup = mTable.group(i);
					String currentConcept_html = EscapeChars.forHTML(currentConcept);
					if (listGroup.contains(currentConcept_html)) {
						indexTable(fileName, currentConcept);
					}
				}
			}
		}

	}

	private void indexList(String fileName, String currentConcept) {
		List<String> list = conceptsToPageList.get(currentConcept);
		if (list != null) {
			list.add(fileName);
		} else {
			List<String> localList = new ArrayList<String>();
			localList.add(fileName);
			conceptsToPageList.put(currentConcept, localList);
		}

	}

	private void indexParagraph(String fileName, String currentConcept) {
		List<String> list = conceptsToPageParagraph.get(currentConcept);
		if (list != null) {
			list.add(fileName);
		} else {
			List<String> localList = new ArrayList<String>();
			localList.add(fileName);
			conceptsToPageParagraph.put(currentConcept, localList);
		}
	}

	private void indexTitle(String fileName, String currentConcept) {

		List<String> list = conceptsToPageTitle.get(currentConcept);
		if (list != null) {
			list.add(fileName);
		} else {
			List<String> localList = new ArrayList<String>();
			localList.add(fileName);
			conceptsToPageTitle.put(currentConcept, localList);
		}

	}

	private void indexTable(String fileName, String currentConcept) {

		List<String> list = conceptsToPageTable.get(currentConcept);
		if (list != null) {
			list.add(fileName);
		} else {
			List<String> localList = new ArrayList<String>();
			localList.add(fileName);
			conceptsToPageTable.put(currentConcept, localList);
		}

	}

	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

	}

}
