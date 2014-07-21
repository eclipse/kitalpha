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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.constant.Constant;

/**
 * @author Boubekeur Zendagui
 */

public class ECoreFileInformation {
	
	private String _projectName;
	private String _folderName;
	private String _metaModelName;
	
	public ECoreFileInformation(String projectName, String modelFolder, String eCoreFileName) throws Exception {
		_projectName = projectName;
		_folderName = modelFolder;
		_metaModelName = eCoreFileName;
		if (! checkInforamtions())
		{
			throw new Exception();
		}
	}
	
	public boolean EcoreFileExist(){
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(_projectName);
		if (project.exists())
		{
			IFolder folder = project.getFolder(_folderName);
			if (folder.exists())
			{
				IFile file = folder.getFile(_metaModelName+".ecore");
				return file.exists();
			}
		}
		return false;
	}
	
	public URI getEcoreFileURI(){
		String strUri = getEcoreFilePathName();
		return checkInforamtions() ? URI.createFileURI(strUri)	: null;
	}
	
	public URI getEcorePlatformResourceURI(){
		String strUri = getEcoreFilePathName();
		return checkInforamtions() ? URI.createPlatformResourceURI(strUri, false)	: null;
	}
	
	private String getCorrectECoreFileName(String fileName){
		if (fileName.endsWith("."+Constant.ECORE_FILE_EXTENSION))
			return fileName;
		else
			return fileName+"."+Constant.ECORE_FILE_EXTENSION;
	}
	
	private boolean checkInforamtions(){
		return (_projectName != "" && _folderName != "" && _metaModelName != "") ? true : false;
	}
	
	private String getEcoreFilePathName(){
		return "/"+_projectName+
				"/"+
				_folderName+
				"/"+
				getCorrectECoreFileName(_metaModelName);
	}
	
//	public URI getEcoreFilePlatformeURI(){
//		String strUri = getEcoreFilePathName();
//		return checkInforamtions() ? URI.createPlatformResourceURI(strUri, false)	: null;
//	}
}
