/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.explorer.contextual.task;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.explorer.contextual.common.ContextualExplorerTaskProductionAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.explorer.contextual.util.ClassUtils;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.pde.PDEUtility;

/**
 * @author Boubekeur Zendagui
 */
public class ManifestUpdateTask extends ContextualExplorerTaskProductionAdapter {

	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		String rootProjectName = productionContext.getInputValue(ROOT_PROJECT_NAME, String.class);
		String pluginNameSufix = productionContext.getInputValue(PLUGIN_NAME_SUFIX, String.class);
		
		Assert.isNotNull(rootProjectName);
		
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(rootProjectName+ "." + pluginNameSufix);
		
		List<String> requiredBundles = new ArrayList<String>(); 
		requiredBundles.add("org.eclipse.emf.ecore");
		requiredBundles.add("org.eclipse.amalgam.explorer.contextual.core");
		requiredBundles.add(ClassUtils.INSTANCE.getEditPluginName());
		
		PDEUtility.updateRequiredBundles(project, requiredBundles, monitor);
	}
}
