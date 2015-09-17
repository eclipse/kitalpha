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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.util.BuildVPConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.util.JavaUtil;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class CreateRelengPluginTask implements ITaskProduction {
	
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {	
	}

	public void doExecute(ITaskProductionContext productionContext,	IProgressMonitor monitor) throws InvocationException {
		
		List<Repository> mapped_repositories = new ArrayList<Repository>();
		String target_location = null;
		
		List<String> sourceFolders	= null;
		List<String> cronTrigger 	= null;
		List<String> scmTrigger 	= null;
		Map<String, String> users 	= null;
		Map<String, String> hudsonProperties = null;
		Map<String, String> generationLocation = null;
		
		String executionEnvironment = productionContext.getInputValue(GeneratorConstants.EXECUTION_ENVIRONMENT, String.class);
		if (executionEnvironment == null || "".equals(executionEnvironment))
			throw new InvocationException(Messages.GeneratorError_ExecutionEnvironmentNotFound);
		String rootProjectName = productionContext.getInputValue(GeneratorConstants.LVPS_ROOT_PROJECT_NAME, String.class);
		if (rootProjectName == null || "".equals(rootProjectName))
			throw new InvocationException(Messages.GeneratorError_ProjectNameNotFound); 
		EMFDomain model = productionContext.getInputValue(GeneratorConstants.LVPS_MODEL, EMFDomain.class);
		if (!model.getContent().isEmpty()) {
			Viewpoint viewpoint = (Viewpoint) model.getContent().get(0);
			EList<Aspect> vp_Aspects = viewpoint.getVP_Aspects();
			for (Aspect aspect: vp_Aspects) {
				if (aspect instanceof Build) {
					Build build = (Build) aspect;
					mapped_repositories = build.getMapped_repositories();
					target_location = build.getTarget_platform();
					
					//FIXME: build.getMapped_repositories().get(0) => use 1 to 1 relation or take all repos??
					
					if (build.getMapped_repositories() != null && !build.getMapped_repositories().isEmpty())
						sourceFolders = BuildVPConfigurationHelper.getSourceFolders(build.getMapped_repositories().get(0).getFolders());
					
					if (build.getHudsonDeployment() != null){
						cronTrigger = BuildVPConfigurationHelper.getCronTriggers(build.getHudsonDeployment().getTriggers());
						scmTrigger = BuildVPConfigurationHelper.getScmTriggers(build.getHudsonDeployment().getTriggers());
						users = BuildVPConfigurationHelper.getUsers(build.getHudsonDeployment().getUsers());
						hudsonProperties = BuildVPConfigurationHelper.getHudsonProperties(build.getHudsonDeployment());
						generationLocation = BuildVPConfigurationHelper.getGenerationLocation(build.getHudsonDeployment().getGenerationLocation());
					}
					break;
				}
			}	
			if (!mapped_repositories.isEmpty()) {
				String projectId = rootProjectName + "." + "releng" ;
				JavaUtil.createJavaProject(projectId, executionEnvironment, monitor);
				JavaUtil.convertJavaProjectToPlugin(projectId, monitor);
				productionContext.setOutputValue(GeneratorConstants.TARGET_LOCATION, target_location);
				productionContext.setOutputValue(GeneratorConstants.REPOSITORY_LOCATION, mapped_repositories.get(0).getLocation());
				productionContext.setOutputValue(GeneratorConstants.REPOSITORY_PROTOCOL, mapped_repositories.get(0).getProtocol().getName());
				
				productionContext.setOutputValue(GeneratorConstants.SOURCE_FOLDERS, sourceFolders);
				productionContext.setOutputValue(GeneratorConstants.CRON_TRIGGERS, cronTrigger);
				productionContext.setOutputValue(GeneratorConstants.SCM_TRIGGERS, scmTrigger);
				productionContext.setOutputValue(GeneratorConstants.USERS, users);
				productionContext.setOutputValue(GeneratorConstants.HUDSON_PROPERTIES, hudsonProperties);
				productionContext.setOutputValue(GeneratorConstants.GENERATION_LOCATION, generationLocation);
			}
		}
	}

	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		// TODO Auto-generated method stub
	}
}
