/**
 * Copyright (c) 2010, 2020 Thales Corporate Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * Thales Corporate Services S.A.S - initial API and implementation
 */

package org.polarsys.kitalpha.doc.gen.business.core.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.doc.gen.business.core.Activator;

/**
 * @author Benoit Langlois
 * 
 */

public class DocGenHtmlUtil {

	/**
	 * Hidden constructor
	 */
	private DocGenHtmlUtil(){
	}
	
	private static final String UNKNOWN_ELEMENT = "unknown"; //$NON-NLS-1$

	public static String getModelName(EMFDomain domain) {
		EList<Object> content = domain.getContent();
		if (!content.isEmpty() && content.get(0) instanceof EObject) {
			return getModelName((EObject) content.get(0));
		}
		return "";
	}

	public static String getModelName(EObject element) {
		if (element.eContainer() == null) {
			return LabelProviderHelper.getText(element);
		} else {
			return getModelName(element.eContainer());
		}
	}

	/**
	 * Ensures the file name is valid
	 * 
	 * @param fileName
	 * @return
	 */
	public static String getValidFileName(String fileName) {

		if (fileName == null || (fileName.trim().length() == 0)) {
			return UNKNOWN_ELEMENT;
		}

		fileName = fileName.replaceAll("[^a-zA-Z 0-9 _]","");
		return fileName;
	}

	/**
	 * Get file where output contents is written
	 * 
	 * @param fileName
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */

	public static IFile getFile(String fileName, String projectName,
			String outputFolder) throws CoreException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projectName);

		// build the class resource path
		IPath path = new Path(""); //$NON-NLS-1$
		
// 		removing split on "." character (prod00102010) 
		for (String member : outputFolder.split("/|\\\\")) { //$NON-NLS-1$
			path = path.append(member);
			IFolder folder = project.getFolder(path);
			if (!folder.exists()) {
				folder.create(true, true, null);
			}
		}

		path = path.append(fileName);
		path = path.addFileExtension(DocGenHtmlConstants.HTML_FILE_EXTENSION);

		return project.getFile(path);
	}

	/**
	 * Write file content
	 * 
	 * @param fileName
	 * @param projectName
	 * @param outputFolder
	 * @param content
	 * @return
	 */

	public static void writeFilePatternContent(String fileName,
			String projectName, String outputFolder, String content) {

		ByteArrayInputStream outputContent = new ByteArrayInputStream(content
				.getBytes());
		try {
			IFile file = DocGenHtmlUtil.getFile(fileName, projectName,
					outputFolder);
			if (file.exists()) {
				file.setContents(outputContent, true, false, null);
			} else {
				file.create(outputContent, true, null);
			}
		} catch (CoreException e) {
			Activator.logError(e.getMessage(), e);
		}
	}

	/**
	 * Read file content
	 * 
	 * @param fileName
	 * @param projectName
	 * @param outputFolder
	 * @return String
	 * @throws IOException
	 */

	public static String readFileContent(String fileName, String projectName,
			String outputFolder) throws IOException {

		try {
			IFile file = DocGenHtmlUtil.getFile(fileName, projectName,
					outputFolder);
			if (file.exists()) {
				Writer writer = new StringWriter();
				char[] buffer = new char[1024];
				try {
					Reader reader = new BufferedReader(new InputStreamReader(
							file.getContents()));
					int n;
					while ((n = reader.read(buffer)) != -1) {
						writer.write(buffer, 0, n);
					}
				} catch (Exception e) {
					Activator.logError(e.getMessage(), e);
				} 
				return writer.toString();
			}

		} catch (CoreException e) {
			Activator.logError(e.getMessage(), e);
		}
		return "";

	}

	/**
	 * Read sidebar file content
	 * 
	 * @param fileName
	 * @param projectName
	 * @param outputFolder
	 * @return String
	 */

	public static String readSidebarFileContent(String projectName, String outputFolder) {
		try {
			return DocGenHtmlUtil.readFileContent(
					DocGenHtmlConstants.SIDEBAR_FILENAME, projectName,
					outputFolder);
		} catch (IOException e) {
			Activator.logError(e.getMessage(), e);
		}

		return "";
	}

	/**
	 * Ensures the string to be displayed is valid
	 * 
	 * @param value
	 * @return
	 */
	public static String displayValidString(String value) {

		if (value == null) {
			return DocGenHtmlConstants.EMPTY_STRING;
		}

		return value;
	}

}
