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
			IPath sourcePath = new Path(logoPath);
			IFile sourceFile = ResourcesPlugin.getWorkspace().getRoot().getFile(sourcePath);

			if (sourceFile.exists()){
				IFile destinationFile = imgFolder.getFile("logo.gif");
				try {
					if (destinationFile.exists() == false)
						destinationFile.create(sourceFile.getContents(), true, null);
					else
						destinationFile.setContents(sourceFile.getContents(), IFile.REPLACE, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}else{
				throw new RuntimeException("Unable to find the icon : " + logoPath);
			}
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
