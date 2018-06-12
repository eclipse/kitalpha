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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.CoreModelHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.exception.ViewpointResourceException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl.ViewpointResourceProviderRegistry;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.types.ResourceFileInformation;

/**
 * @author Boubekeur Zendagui
 */

public final class ViewpointCoreResourceLocator {
	
	private static final String FILE_EXTENSION_ECORE = "ecore"; //$NON-NLS-N$
	private static final String FILE_EXTENSION_GENMODEL = "genmodel"; //$NON-NLS-N$
	private static final String FILE_EXTENSION_GENERATIONCHAIN = "generationchain"; //$NON-NLS-N$
	private static final String MODEL_FOLDER = "models"; //$NON-NLS-N$

	/**
	 * 
	 * @param viewpoint the {@link Viewpoint} containg the description of the Viewpoint 
	 * @return A  {@link ResourceFileInformation} object containing information about the ECore resource
	 * @throws ViewpointResourceException
	 */
	public static ResourceFileInformation getECoreFileInformation(Viewpoint viewpoint) 
	throws ViewpointResourceException{
		ResourceFileInformation ecoreInformation = null;
		String projectName = VpDslConfigurationHelper.getRootProjectName(viewpoint);
		String folderName = MODEL_FOLDER;
		String fileName = CoreModelHelper.getViewpointShortName(viewpoint);
		String fileExtension = FILE_EXTENSION_ECORE;
		ecoreInformation = new ResourceFileInformation(projectName, folderName, fileName, fileExtension);
		return ecoreInformation;
	}

	/**
	 * 
	 * @param viewpoint
	 * @return
	 * @throws ViewpointResourceException
	 */
	public static ResourceFileInformation getGenchainFileInformation(Viewpoint viewpoint) 
	throws ViewpointResourceException{
		ResourceFileInformation genchainInformation = null;
		String projectName = VpDslConfigurationHelper.getRootProjectName(viewpoint);
		String folderName = MODEL_FOLDER;
		String fileName = CoreModelHelper.getViewpointShortName(viewpoint);
		String fileExtension = FILE_EXTENSION_GENERATIONCHAIN;
		genchainInformation = new ResourceFileInformation(projectName, folderName, fileName, fileExtension);
		return genchainInformation;
	}
	
	/**
	 * 
	 * @param viewpoint
	 * @return
	 * @throws ViewpointResourceException
	 */
	public static ResourceFileInformation getGenmodelFileInformation(Viewpoint viewpoint) throws ViewpointResourceException{
		ResourceFileInformation genmodelInformation = null;
		
		String projectName = "";
		ViewpointResourceProviderRegistry provider = ViewpointResourceProviderRegistry.getInstance();
		if (provider != null && provider.isGenchainProviderInitialized())
			projectName = provider.getGenchainProvider().getModelProjectName();
		
		String folderName = MODEL_FOLDER;
		String fileName = CoreModelHelper.getViewpointShortName(viewpoint);
		String fileExtension = FILE_EXTENSION_GENMODEL;
		genmodelInformation = new ResourceFileInformation(projectName, folderName, fileName, fileExtension);
		return genmodelInformation;
	}
	
	public static boolean checkResourceFileExistence(ResourceFileInformation information){
		if (information == null)
			return false;
		
		final String projectName = information.getProjectName();
		final String folderName = information.getFolderName();
		final String fileName = information.getFileName();
		final String fileExtension = information.getFileExtension();
		
		if (projectName.trim().length() == 0 || 
			folderName.trim().length() == 0 ||
			fileName.trim().length() == 0 || 
			fileExtension.trim().length() == 0)
		{
			return false;
		}
		
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (project.exists())
		{
			IFolder folder = project.getFolder(folderName);
			if (folder.exists())
			{
				IFile file = folder.getFile(fileName+"."+fileExtension);
				if (file.exists())
					return true;
			}
		}
		return false;
	}
	
}
