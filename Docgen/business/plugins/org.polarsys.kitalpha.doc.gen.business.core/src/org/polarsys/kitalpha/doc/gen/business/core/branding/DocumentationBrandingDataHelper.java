/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.branding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.URIUtil;
import org.polarsys.kitalpha.doc.gen.business.core.branding.DocumentationBrandingDataException.ExceptionCause;

/**
 * @author Boubekeur Zendagui
 */

public class DocumentationBrandingDataHelper {

	/**
	 * Hidden constructor
	 */
	private DocumentationBrandingDataHelper() {
	}
	
	/**
	 * 
	 * @param projectName
	 * @param outputFolder
	 * @param logoPath
	 */
	public static void copyLogoFile(String projectName, String outputFolder, String logoPath){
		final IFolder imgFolder = getImgFolder(projectName, outputFolder);
		if (imgFolder != null && imgFolder.exists())
		{
			InputStream sourceFileIputStr = null;
			try {
				sourceFileIputStr = getIconInputStream(logoPath);
			} catch (DocumentationBrandingDataException e) {
				e.printStackTrace();
			}
			
			if (sourceFileIputStr != null) 
			{
				IFile destinationFile = imgFolder.getFile("logo.gif");
				try {
					if (! destinationFile.exists()) {
						destinationFile.create(sourceFileIputStr, true, null);
					} else {
						destinationFile.setContents(sourceFileIputStr, IFile.REPLACE, null);
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 
	 * @param logoPath
	 * @return
	 * @throws DocumentationBrandingDataException
	 */
	private static InputStream getIconInputStream(String logoPath) throws DocumentationBrandingDataException{
		if (logoPath.startsWith("platform:/plugin"))
		{// We deal with bundled file 
			return getBundledIconInputStream(logoPath);
		}
		else
		{
			try {
				URI uri = URIUtil.fromString(logoPath);
				if (uri.isAbsolute())
				{
					// We deal with a local file system
					return getLocalFileInputStream(logoPath);
				}
				else
				{
					// We deal with a workspace file
					return getWorkspaceIconInputStream(logoPath);
				}
				
			} catch (FileNotFoundException e) {
				throw new DocumentationBrandingDataException(ExceptionCause.FileDoesntExist, "", e);
			} catch (URISyntaxException e) {
				throw new DocumentationBrandingDataException(ExceptionCause.MalformatedURL, "", e);
			}
		}
	}
	
	/**
	 * 
	 * @param logoPath path of the icon. This path format is "platform:/plugin/BundleID/Folders/FileName" 
	 * @return content of the icon file
	 * @throws DocumentationBrandingDataException 
	 */
	private static InputStream getBundledIconInputStream(String logoPath) throws DocumentationBrandingDataException{
		try {
			URL url = new URL(logoPath);
			return url.openConnection().getInputStream();
		} catch (MalformedURLException e) {
			throw new DocumentationBrandingDataException(DocumentationBrandingDataException.ExceptionCause.MalformatedURL, logoPath, e);
		} catch (IOException e) {
			throw new DocumentationBrandingDataException(DocumentationBrandingDataException.ExceptionCause.CantLoadContent, logoPath, e);
		}
	}
	
	/**
	 * 
	 * @param logoPath
	 * @return
	 * @throws URISyntaxException
	 * @throws FileNotFoundException
	 * @throws DocumentationBrandingDataException
	 */
	private static InputStream getLocalFileInputStream(String logoPath) throws URISyntaxException, FileNotFoundException{
		URI uri = URIUtil.fromString(logoPath).normalize();
		// Add file scheme if it not exists
		if (! logoPath.startsWith("file:")) {
			uri = URIUtil.fromString("file://"+logoPath).normalize();
		}

		// handle the file
		final File file = URIUtil.toFile(uri);
		return new FileInputStream(file);
	}
	
	/**
	 * 
	 * @param logoPath
	 * @return
	 * @throws DocumentationBrandingDataException 
	 */
	private static InputStream getWorkspaceIconInputStream(String logoPath) throws DocumentationBrandingDataException{
		IPath sourcePath = new Path(logoPath);
		IFile sourceFile = ResourcesPlugin.getWorkspace().getRoot().getFile(sourcePath);
		if (sourceFile.exists())
		{
			try {
				return sourceFile.getContents();
			} catch (CoreException e) {
				throw new DocumentationBrandingDataException(DocumentationBrandingDataException.ExceptionCause.CantLoadContent, logoPath, e);
			}
		}
		else
		{
			throw new DocumentationBrandingDataException(DocumentationBrandingDataException.ExceptionCause.FileDoesntExist, logoPath);
		}
	}
	
	
	/**
	 * 
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	private static IFolder getImgFolder(String projectName, String outputFolder){
		IFolder imgFolder = null;
		final String rootFolder = getRootFolder(outputFolder);
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (project.exists())
		{
			final IFolder folder = project.getFolder(rootFolder);
			if (folder.exists())
			{
				imgFolder = folder.getFolder("img");
				if (! imgFolder.exists())
				{
					try {
						imgFolder.create(true, false, new NullProgressMonitor());
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return imgFolder;
	}
	
	/**
	 * 
	 * @param folderPath
	 * @return
	 */
	private static String getRootFolder(String folderPath){
		String[] segment = folderPath.split("/");
		if (segment.length > 0)
		{
			return segment[0];
		}
		return "output";
	}
}
