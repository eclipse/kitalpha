/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.tasks;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.templates.GenBuildModelRunner;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.util.JavaUtil;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class CreateBuildModelRunnerTask implements ITaskProduction {
	
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
	}

	public void doExecute(ITaskProductionContext productionContext,IProgressMonitor monitor) throws InvocationException {
		//build model path
		String buildModelPath = productionContext.getInputValue(GeneratorConstants.BUILD_MODEL_PATH, String.class);
		if (buildModelPath == null || "".equals(buildModelPath))
			throw new InvocationException(Messages.GeneratorError_BuildModelNotFound);
		//root project name
		String rootProjectName = productionContext.getInputValue(GeneratorConstants.LVPS_ROOT_PROJECT_NAME, String.class);
		if (rootProjectName == null || "".equals(rootProjectName))
			throw new InvocationException(Messages.GeneratorError_ProjectNameNotFound);
		//viewpoint short name
		String lvpsShortName = productionContext.getInputValue(GeneratorConstants.LVPS_SHORT_NAME, String.class);
		if (lvpsShortName == null || "".equals(lvpsShortName))
			throw new InvocationException(Messages.GeneratorError_ViewpointShortNameNotFound);
		//generate build runner resource
		String projectId = rootProjectName + "." + "releng" ;
		JavaUtil.createFolder(projectId, "egf");	
		String buildModelRunnerPath = projectId + "/egf/" + "run_" + lvpsShortName + ".fcore";
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource egfBuildRunnerResource = resourceSet.createResource(URI.createPlatformResourceURI(buildModelRunnerPath, false));	
		GenBuildModelRunner generator = new GenBuildModelRunner();
		//generated code folder
		JavaUtil.createFolder(projectId, GeneratorConstants.RELENG_SCRIPTS_OUTPUT);
		String generationPath = projectId + "/" + GeneratorConstants.RELENG_SCRIPTS_OUTPUT;
		FactoryComponent fc = generator.doGenerate(buildModelPath, lvpsShortName, generationPath);	
		egfBuildRunnerResource.getContents().add(fc);		
		try {
			egfBuildRunnerResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//referesh workspace
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectId);
		if (project != null && project.exists()) {
			try {
				project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}		
		//set the output parameters
		String buildRunnerURI = URI.createPlatformPluginURI(buildModelRunnerPath, false).toString() + "#" + fc.getID();
		productionContext.setOutputValue(GeneratorConstants.BUILD_RUNNER_URI, buildRunnerURI);
	}
	
	public void postExecute(ITaskProductionContext productionContext,IProgressMonitor monitor) throws InvocationException {
	}
}
