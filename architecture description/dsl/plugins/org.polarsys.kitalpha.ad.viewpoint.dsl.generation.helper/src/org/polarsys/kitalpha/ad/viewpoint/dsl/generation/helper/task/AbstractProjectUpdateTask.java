/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.task;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;

public abstract class AbstractProjectUpdateTask implements ITaskProduction {

	protected static final String PORJECT_ID_CONTRACT = "project.id";
	
	protected String projectID;
	
	/**
	 * This method is used to apply a change on the given project. The change kind is not specified there.
	 * It should be implemented by derived tasks.
	 * 
	 * @param project the {@link IProject} on witch a modification will be done 
	 * @param productionContext the current {@link ITaskProductionContext} context
	 * @param monitor an {@link IProgressMonitor}
	 * @throws InvocationException thrown if a problem occurs
	 */
	public abstract void updateProject(IProject project, ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException;
	
	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {
		projectID = productionContext.getInputValue(PORJECT_ID_CONTRACT, String.class);
	}

	@Override
	public final void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
//		Assert.isNotNull(projectID, "Project ID Contract should have a value"); //$NON-NLS-1$
		if (projectID == null)
			return ;
		
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectID);
		if (project.exists())
		{
			updateProject(project, productionContext, monitor);
		}
		else
		{
			// TODO: should log an error but not throws an exception because it will block the steps after
			//throw new InvocationException("Project " + projectID + " doesn't exists");
		}
	}
	
	@Override
	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
	}
	
	protected String getProjectID(){
		return this.projectID;
	}
}
