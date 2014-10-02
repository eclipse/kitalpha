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
package org.polarsys.kitalpha.doc.gen.business.core.branding;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;

/**
 * @author Boubekeur Zendagui
 */

public class DocumentationBrandingDataHelper {

	/**
	 * 
	 * @param projectName
	 * @param outputFolder
	 * @param logoPath
	 */
	public static void copyLogoFile(String projectName, String outputFolder, String logoPath){
		final IFolder imgFolder = getImgFolder(projectName, outputFolder);
		if (imgFolder.exists())
		{
//			logoPath = logoPath.toLowerCase();
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
					if (destinationFile.exists() == false)
						destinationFile.create(sourceFileIputStr, true, null);
					else
						destinationFile.setContents(sourceFileIputStr, IFile.REPLACE, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
//			else
//			{
//				throw new RuntimeException("Unable to get icon : " + logoPath);
//			}
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
		{// We deal with workspace file
			return getWorkspaceIconInputStream(logoPath);
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
				if (imgFolder.exists() == false)
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
