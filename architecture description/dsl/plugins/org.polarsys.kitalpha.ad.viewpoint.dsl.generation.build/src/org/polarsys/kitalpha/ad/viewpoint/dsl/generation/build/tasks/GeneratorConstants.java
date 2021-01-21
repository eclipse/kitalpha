/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
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

import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.IContractProvider;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class GeneratorConstants {

	public static final String BUILD_MODEL_FOLDER= "model";
	
	public static final String RELENG_SCRIPTS_OUTPUT= "releng-scripts";
	
	public static final String LVPS_MODEL = IContractProvider.VPDESC_MODEL; //"lvpsModel";
	
	public static final String LVPS_ROOT_PROJECT_NAME = IContractProvider.ROOT_PROJECT_NAME; //"root.project.name";
	
	public static final String LVPS_SHORT_NAME = IContractProvider.SHORT_NAME; //"lvpsShortName";
	
	public static final String TARGET_LOCATION = "target.location";
	
	public static final String REPOSITORY_LOCATION = "repository.location";
	
	public static final String REPOSITORY_PROTOCOL = "repository.protocol";
	
	public static final String BUILD_MODEL_PATH = "build.model.path";
	
	public static final String BUILD_RUNNER_URI = "build.runner.uri";
	
	public static final String DEFAULT_OUTPUT = "DEFAULT_OUTPUT";
	
	public static final String EXECUTION_ENVIRONMENT = "execution.environment";
	
	public static final String SOURCE_FOLDERS = "source.folders";
	
	public static final String USERS = "build.users";
	
	public static final String HUDSON_PROPERTIES = "hudson.properties";
	
	public static final String CRON_TRIGGERS = "cron.triggers";
	
	public static final String SCM_TRIGGERS = "scm.triggers";
	
	public static final String GENERATION_LOCATION = "generation.location";
	
	public static final String RELENG_PROJECT_NAME = "releng.project.name";
}
