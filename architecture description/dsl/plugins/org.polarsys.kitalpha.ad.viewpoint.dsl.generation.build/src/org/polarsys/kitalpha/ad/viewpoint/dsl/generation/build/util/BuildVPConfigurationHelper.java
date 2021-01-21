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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Cron;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.GenerationLocation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.SCM;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.SourceFolder;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Trigger;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.User;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.UserPermission;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage;

/**
 * Helper to get build configuration from Build meta-model
 * @author Faycal Abka
 *
 */
public class BuildVPConfigurationHelper {
	

	public static List<String> getSourceFolders(EList<SourceFolder> folders) {
		return getListOfFolders(folders);
	}


	private static List<String> getListOfFolders(EList<SourceFolder> folders) {
		
		List<String> sourceFolders = null;
		
		if (folders != null && !folders.isEmpty()){
			sourceFolders = new ArrayList<String>();
			for (SourceFolder sourceFolder : folders) {
				sourceFolders.add(sourceFolder.getName());
			}
		}
		return sourceFolders;
	}


	public static Map<String, String> getUsers(EList<User> theusers) {
		return getMapOfUsers(theusers);
	}


	private static Map<String, String> getMapOfUsers(EList<User> theusers) {
		
		Map<String, String> users = null;
		
		if (theusers != null && !theusers.isEmpty()){
			users = new HashMap<String, String>();
			for (User user : theusers) {
				if (user.getPermission() != null) {
					users.put(user.getLogin(), user.getPermission().getName());
				} else {
					users.put(user.getLogin(), UserPermission.READ.getName());
				}
			}
		}
		return users;
	}


	public static Map<String, String> getHudsonProperties(HudsonDeployment hudson) {
		return getMapOfHudsonProperties(hudson);
	}


	private static Map<String, String> getMapOfHudsonProperties(HudsonDeployment hudson) {
		
		Map<String, String> hudsonProperties = null;
		
		if (hudson != null){
			hudsonProperties = new HashMap<String, String>();
			
			hudsonProperties.put(hudson.eClass().getEStructuralFeature(VpbuildPackage.HUDSON_DEPLOYMENT__ANT_NAME).getName(), 
					hudson.getAntName());
			hudsonProperties.put(hudson.eClass().getEStructuralFeature(VpbuildPackage.HUDSON_DEPLOYMENT__ASSIGNED_NODE).getName(),
					hudson.getAssignedNode());
			hudsonProperties.put(hudson.eClass().getEStructuralFeature(VpbuildPackage.HUDSON_DEPLOYMENT__BUILD_ID).getName(),
					hudson.getBuild_id());
			hudsonProperties.put(hudson.eClass().getEStructuralFeature(VpbuildPackage.HUDSON_DEPLOYMENT__ENABLED).getName(),
					hudson.isEnabled()?"true":"false");
			hudsonProperties.put(hudson.eClass().getEStructuralFeature(VpbuildPackage.HUDSON_DEPLOYMENT__JDK_NAME).getName(),
					hudson.getJdkName());
			hudsonProperties.put(hudson.eClass().getEStructuralFeature(VpbuildPackage.HUDSON_DEPLOYMENT__USER_DEPLOY_JOB_NAME).getName(),
					hudson.getUserDeployJobName());
			hudsonProperties.put(hudson.eClass().getEStructuralFeature(VpbuildPackage.HUDSON_DEPLOYMENT__USER_DEPLOY_SERVER_URL).getName(),
					hudson.getUserDeployServerUrl());
		}
		return hudsonProperties;
	}

	
	public static List<String> getCronTriggers(EList<Trigger> eList) {
		return getListOfTypeTriggers(eList, "CRON");
	}


	private static List<String> getListOfTypeTriggers(EList<Trigger> triggers,
			String type) {
		
		List<String> theTriggers = null;
		
		if (triggers != null && !triggers.isEmpty()){
			if (type.equals("CRON")){
				theTriggers = new ArrayList<String>();
				for (Trigger trigger : triggers) {
					if (trigger instanceof Cron){
						theTriggers.add(((Cron)trigger).getPlanning());
					}
				}
				if (!theTriggers.isEmpty()) {
					return theTriggers;
				}
			}
			if (type.equals("SCM")){
				theTriggers = new ArrayList<String>();
				for (Trigger trigger : triggers) {
					if (trigger instanceof SCM){
						theTriggers.add(((SCM)trigger).getPlanning());
					}
				}
				if (!theTriggers.isEmpty()) {
					return theTriggers;
				}
			}
		}
		return null;
	}


	public static List<String> getScmTriggers(EList<Trigger> triggers) {
		return getListOfTypeTriggers(triggers, "SCM");
	}


	public static Map<String, String> getGenerationLocation(GenerationLocation gl) {
		return getMapOfGenerationLocation(gl);
	}


	private static Map<String, String> getMapOfGenerationLocation(GenerationLocation gl) {
		
		Map<String, String> generationLocation = null;
		
		if (gl != null){
			generationLocation = new HashMap<String, String>();
			generationLocation.put(gl.getFolder(), gl.getUrl());
		}
		return generationLocation;
	}
	
	

}
