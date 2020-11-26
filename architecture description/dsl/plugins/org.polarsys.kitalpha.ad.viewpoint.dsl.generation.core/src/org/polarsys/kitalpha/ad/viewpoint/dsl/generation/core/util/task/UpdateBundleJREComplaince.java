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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.util.task;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.pde.PDEUtility;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.pde.RequiredExecutionEnvironment;

/**
 * @author Boubekeur Zendagui
 */
public class UpdateBundleJREComplaince implements ITaskProduction {

	@Override
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

	@Override
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		String bundleId = productionContext.getInputValue("bundle.id", String.class);
		String ee = productionContext.getInputValue("execution.environment", String.class);
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(bundleId);
		if (project.exists() && (ee != null && ee.trim().length() > 0))
		{
			RequiredExecutionEnvironment ree = RequiredExecutionEnvironment.getExecutionEnvironment(ee);
			PDEUtility.updateManifestModel(project, null, ree, false, monitor);
		} else {
			throw new RuntimeException();
		}
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

}
