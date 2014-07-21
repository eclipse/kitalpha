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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.task;

import java.io.File;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;

/**
 * @author Boubekeur Zendagui
 */

public class ModelFolderCreationTask extends TaskProductionAdapter {
	
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		
		String modelFolder = productionContext.getInputValue(MODEL_FOLDER, String.class);
		String lvpsProjectName = productionContext.getInputValue(ROOT_PROJECT_NAME, String.class);
		
		IContainer pFolder = ResourcesPlugin.getWorkspace().getRoot().getProject(lvpsProjectName);
		
		IPath modelFolderPath = new Path(pFolder.getLocation().toString());
		modelFolderPath.append(new Path(modelFolder));
		
		if (pFolder.getFolder(modelFolderPath) != null){
			new File(pFolder.getLocation().toString() +"/"+ modelFolder).mkdir();
//			ECoreResourceManager.INSTRANCE.initialize();
		}
		
		try {
			pFolder.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
}
