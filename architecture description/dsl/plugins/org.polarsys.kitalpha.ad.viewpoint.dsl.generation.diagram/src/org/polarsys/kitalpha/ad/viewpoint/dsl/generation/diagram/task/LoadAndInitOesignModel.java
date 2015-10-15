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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.mappingimport.MappingImportManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.resource.DoremiResourceManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.GenerationUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.VSMGenerationUtil;

/**
 * @author Boubekeur Zendagui
 */

public class LoadAndInitOesignModel implements ITaskProduction{

	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

	public void doExecute(ITaskProductionContext productionContext,	IProgressMonitor monitor) throws InvocationException {
		final String modelName = productionContext.getInputValue("design.model.name", String.class);
		final String projectName = productionContext.getInputValue("design.project.name", String.class);
		// Unload data of the previous generation session
		GenerationUtil.clear();
		DoremiResourceManager.clear();
		MappingImportManager.clear();
		
		// Load and initialize new data for the current generation
		if (VSMGenerationUtil.canExecuteTask(productionContext))
			DoremiResourceManager.loadAndInitODesignModel(projectName, "description", modelName);
		else
			DoremiResourceManager.loadODesignModel(projectName, "description", modelName);
	}

	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

}
