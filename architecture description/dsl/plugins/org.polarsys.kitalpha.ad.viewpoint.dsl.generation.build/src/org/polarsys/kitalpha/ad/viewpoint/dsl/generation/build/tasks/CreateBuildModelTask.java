/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.egf.portfolio.eclipse.build.buildcore.Chain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.templates.GenBuildModel;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.util.BuildDataConfigContainer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.util.JavaUtil;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class CreateBuildModelTask implements ITaskProduction {
	
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
	}

	@SuppressWarnings("unchecked")
	public void doExecute(ITaskProductionContext productionContext,IProgressMonitor monitor) throws InvocationException {
		//target location
		String targetLocation = productionContext.getInputValue(GeneratorConstants.TARGET_LOCATION, String.class);
		if (targetLocation == null || "".equals(targetLocation)) {
			throw new InvocationException(Messages.GeneratorError_TargetPlatformNotFound);
		}
		//repository location
		String repositoryLocation = productionContext.getInputValue(GeneratorConstants.REPOSITORY_LOCATION, String.class);
		if (repositoryLocation == null || "".equals(repositoryLocation)) {
			throw new InvocationException(Messages.GeneratorError_RepositoryLocationNotFound);
		} 
		//repository protocol
		String repositoryProtocol = productionContext.getInputValue(GeneratorConstants.REPOSITORY_PROTOCOL, String.class);
		if (repositoryProtocol == null || "".equals(repositoryProtocol)) {
			throw new InvocationException(Messages.GeneratorError_RepositoryProtocolNotFound);
		}
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
		
		List<String> sourceFolders = productionContext.getInputValue(GeneratorConstants.SOURCE_FOLDERS, List.class);
		List<String> cronTriggers = productionContext.getInputValue(GeneratorConstants.CRON_TRIGGERS, List.class);
		List<String> scmTriggers = productionContext.getInputValue(GeneratorConstants.SCM_TRIGGERS, List.class);
		Map<String, String> users = productionContext.getInputValue(GeneratorConstants.USERS, Map.class);
		Map<String, String> hudsonProperties = productionContext.getInputValue(GeneratorConstants.HUDSON_PROPERTIES, Map.class);
		Map<String, String> generationLocation = productionContext.getInputValue(GeneratorConstants.GENERATION_LOCATION, Map.class);
		
		
		//generate build model resource
		String projectId = rootProjectName + "." + "releng";
		JavaUtil.createFolder(projectId, GeneratorConstants.BUILD_MODEL_FOLDER);
		String buildModelPath = projectId + "/" + GeneratorConstants.BUILD_MODEL_FOLDER + "/" + lvpsShortName + ".egfbuild";
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource egfBuildResource = resourceSet.createResource(URI.createPlatformResourceURI(buildModelPath, false));	
		
		
		BuildDataConfigContainer<String> buildConfig = new BuildDataConfigContainer<String>();
		buildConfig.addList(GeneratorConstants.SOURCE_FOLDERS, sourceFolders);
		buildConfig.addList(GeneratorConstants.CRON_TRIGGERS, cronTriggers);
		buildConfig.addList(GeneratorConstants.SCM_TRIGGERS, scmTriggers);
		buildConfig.addMap(GeneratorConstants.USERS, users);
		buildConfig.addMap(GeneratorConstants.HUDSON_PROPERTIES, hudsonProperties);
		buildConfig.addMap(GeneratorConstants.GENERATION_LOCATION, generationLocation);
		
		
		GenBuildModel generator = new GenBuildModel();
		Chain chain = generator.doGenerate(targetLocation, repositoryLocation, repositoryProtocol, rootProjectName, lvpsShortName, buildConfig);	
		egfBuildResource.getContents().add(chain);
		try {
			egfBuildResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		//set the output parameters
		productionContext.setOutputValue(GeneratorConstants.BUILD_MODEL_PATH, buildModelPath);
	}
	
	public void postExecute(ITaskProductionContext productionContext,IProgressMonitor monitor) throws InvocationException {
	}
}
