/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.tasks;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.project.AfProjectManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.utils.AfConstants;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.pde.PDEUtility;

/**
 * @author Boubekeur Zendagui
 */

public class AfProjectUpdateManifestTask implements ITaskProduction {

	public static final String CONTRACT_PLUGINS_LIST = "plugins.names.list"; //$NON-NLS-0$
	
	@Override
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		String projectName = (String) productionContext.getInputValue(AfConstants.CONTRACT_PROJECT_NAME, String.class);
		if (projectName != null && projectName.trim().length() > 0)
		{
			Viewpoint vp = AfProjectManager.INSTANCE.getViewpoint();
			List<String> requiredBundles = getRequiredBundlesFor(vp);
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			if (project != null && project.exists()) {
				PDEUtility.updateRequiredBundles(project, requiredBundles, monitor);
			}
		}
	}
	
	 private List<String> getRequiredBundlesFor(Viewpoint viewpoint){
		List<String> result = new ArrayList<String>();
		final List<Viewpoint> referencedViewpoints = new ArrayList<Viewpoint>();
		// Handle viewpoint dependencies
		final List<Viewpoint> dependenciesViewpoints = viewpoint.getDependencies();
		if (dependenciesViewpoints != null && dependenciesViewpoints.size() > 0) {
			referencedViewpoints.addAll(dependenciesViewpoints);
		}

		// Handle viewpoint parents
		final List<Viewpoint> parentsViewpoints = viewpoint.getParents();
		if (parentsViewpoints != null && parentsViewpoints.size() > 0) {
			referencedViewpoints.addAll(parentsViewpoints);
		}

		// Required dependencies construction 
		for (Viewpoint iViewpoint : referencedViewpoints) 
		{
			String bundleID = iViewpoint.eResource().getURI().segment(1);
			result.add(bundleID);
		}
		
		return result;
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

}
