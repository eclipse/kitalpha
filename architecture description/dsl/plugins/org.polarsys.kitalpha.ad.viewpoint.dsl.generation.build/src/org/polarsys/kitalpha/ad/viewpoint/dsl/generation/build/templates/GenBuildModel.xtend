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
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.templates

import java.util.ArrayList
import java.util.Collection
import org.eclipse.egf.portfolio.eclipse.build.buildcore.Chain
import org.eclipse.egf.portfolio.eclipse.build.buildcore.Job
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.util.BuildDataConfigContainer

class GenBuildModel {
	
	
	def Chain doGenerate(String targetLocation, String repositoryLocation, String protocol, String rootProjectName, String lvpsShortName, BuildDataConfigContainer<String> buildConfig) {
		
		val Job mainJob = EGFBuildHelper::createMainJob("viewpoint", protocol, rootProjectName, lvpsShortName, repositoryLocation, buildConfig);
		val Job buildJob = EGFBuildHelper::createViewpointBuildJob(targetLocation, repositoryLocation, protocol, rootProjectName, lvpsShortName, buildConfig);
		
		val Collection<Job> jobs = new ArrayList
		
		jobs.add(mainJob);
		jobs.add(buildJob);
		
		return EGFBuildHelper::createChainOfJobs(jobs, lvpsShortName)
	}
}