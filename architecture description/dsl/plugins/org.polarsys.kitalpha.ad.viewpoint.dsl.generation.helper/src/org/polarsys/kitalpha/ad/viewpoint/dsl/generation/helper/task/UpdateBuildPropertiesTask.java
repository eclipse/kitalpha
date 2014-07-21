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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.task;

import java.security.InvalidParameterException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.Activator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.pde.PDEUtility;

/**
 * @author Boubekeur Zendagui
 */
public class UpdateBuildPropertiesTask extends AbstractPdeHelperTask {

	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.task.AbstractPdeHelperTask#doExecute(ITaskProductionContext, IProgressMonitor)
	 */
	@Override
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		 String pluginID = (String)productionContext.getInputValue(PLUGIN_ID_CONTRACT, String.class);
		 if (pluginID == null || (pluginID != null && pluginID.trim().length() < 1))
			 throw new InvalidParameterException(Messages.bind(Messages.Pde_Helper__Contract_Value_Required, PLUGIN_ID_CONTRACT));
		 
		 String entryName = (String)productionContext.getInputValue(ENTRY_NAME_CONTRACT, String.class);
		 if (entryName == null || (entryName != null && entryName.trim().length() < 1))
			 throw new InvalidParameterException(Messages.bind(Messages.Pde_Helper__Contract_Value_Required, ENTRY_NAME_CONTRACT));
		 
		 Boolean isFolder = (Boolean)productionContext.getInputValue(IS_FOLDER_CONTRACT, Boolean.class);
		 if (isFolder == null)
			 isFolder = false;
		 
		 Boolean silent = (Boolean)productionContext.getInputValue(SILENT_CONTRACT, Boolean.class);
		 if (silent == null)
			 silent = true;
		 
		 
		 IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(pluginID);
		 if (project.exists())
		 {
			 boolean doUpdate = false;
			 // Check if the resource exists
			 if (isFolder)
			 { // Case Folder
				 IFolder folder = project.getFolder(entryName);
				 doUpdate = folder.exists();
			 }
			 else
			 {// Case File
				 IFile file = project.getFile(entryName);
				 doUpdate = file.exists();
			 }
			 
			 if (doUpdate)
				 PDEUtility.updateBuild_BinInclude(project, entryName, isFolder, monitor);
			 else
			 {
				 if (! silent)
				 {
					 Object[] binding = {entryName, pluginID};
					 String errorMessage = Messages.bind(Messages.Pde_Helper__Update_Bin, binding);
					 Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, errorMessage);
					 Activator.getDefault().getLog().log(status);
				 }
				
			 }
				 
		 }
	}

	

}
