/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.tasks;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.util.PluginUtil;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class AddPluginInformationTask implements ITaskProduction{
	
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		// TODO Auto-generated method stub	
	}

	public void doExecute(ITaskProductionContext productionContext,	IProgressMonitor monitor) throws InvocationException {
		//root project name
		String rootProjectName = productionContext.getInputValue(GeneratorConstants.LVPS_ROOT_PROJECT_NAME, String.class);
		if (rootProjectName == null || "".equals(rootProjectName)) {
			throw new InvocationException(Messages.GeneratorError_ProjectNameNotFound);
		}
		//viewpoint short name
		String lvpsShortName = productionContext.getInputValue(GeneratorConstants.LVPS_SHORT_NAME, String.class);
		if (lvpsShortName == null || "".equals(lvpsShortName)) {
			throw new InvocationException(Messages.GeneratorError_ViewpointShortNameNotFound);
		}
		String projectName = rootProjectName + "." + "releng"; //$NON-NLS-1$ //$NON-NLS-2$
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (project.exists()) {
			PluginUtil.doCreateManifest(project, lvpsShortName);
		}
	}

	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		// TODO Auto-generated method stub		
	}
}
