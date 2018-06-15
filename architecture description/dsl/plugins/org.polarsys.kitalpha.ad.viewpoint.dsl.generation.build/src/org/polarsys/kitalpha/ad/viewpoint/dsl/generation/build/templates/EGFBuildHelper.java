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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.templates;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.egf.portfolio.eclipse.build.buildcore.BuildcoreFactory;
import org.eclipse.egf.portfolio.eclipse.build.buildcore.Chain;
import org.eclipse.egf.portfolio.eclipse.build.buildcore.Job;
import org.eclipse.egf.portfolio.eclipse.build.buildcore.Property;
import org.eclipse.egf.portfolio.eclipse.build.buildcore.PropertyType;
import org.eclipse.egf.portfolio.eclipse.build.buildcore.SCM;
import org.eclipse.egf.portfolio.eclipse.build.builddeploy.BuilddeployFactory;
import org.eclipse.egf.portfolio.eclipse.build.builddeploy.CronTrigger;
import org.eclipse.egf.portfolio.eclipse.build.builddeploy.HudsonDeployment;
import org.eclipse.egf.portfolio.eclipse.build.builddeploy.PermissionType;
import org.eclipse.egf.portfolio.eclipse.build.builddeploy.SCMTrigger;
import org.eclipse.egf.portfolio.eclipse.build.builddeploy.User;
import org.eclipse.egf.portfolio.eclipse.build.buildscm.BuildscmFactory;
import org.eclipse.egf.portfolio.eclipse.build.buildscm.GIT;
import org.eclipse.egf.portfolio.eclipse.build.buildscm.GITBuildLocation;
import org.eclipse.egf.portfolio.eclipse.build.buildscm.GITGenerationLocation;
import org.eclipse.egf.portfolio.eclipse.build.buildscm.GITLocation;
import org.eclipse.egf.portfolio.eclipse.build.buildscm.GITProtocol;
import org.eclipse.egf.portfolio.eclipse.build.buildscm.SVN;
import org.eclipse.egf.portfolio.eclipse.build.buildscm.SVNBuildLocation;
import org.eclipse.egf.portfolio.eclipse.build.buildscm.SVNGenerationLocation;
import org.eclipse.egf.portfolio.eclipse.build.buildscm.SVNLocation;
import org.eclipse.egf.portfolio.eclipse.build.buildscm.SVNProtocol;
import org.eclipse.egf.portfolio.eclipse.build.buildstep.BuildStep;
import org.eclipse.egf.portfolio.eclipse.build.buildstep.BuildstepFactory;
import org.eclipse.egf.portfolio.eclipse.build.buildstep.CLEAN_TYPE;
import org.eclipse.egf.portfolio.eclipse.build.buildstep.CleanStep;
import org.eclipse.egf.portfolio.eclipse.build.buildstep.Feature;
import org.eclipse.egf.portfolio.eclipse.build.buildstep.InstallStep;
import org.eclipse.egf.portfolio.eclipse.build.buildstep.PublishStep;
import org.eclipse.egf.portfolio.eclipse.build.buildstep.TargetPlatformBuildLocation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.UserPermission;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.tasks.GeneratorConstants;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.util.BuildDataConfigContainer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.preferences.kitalphaPreferences.PreferencesConstants;

/**
 * 
 * @author Faycal Abka
 * 
 */

public class EGFBuildHelper {
	
	
	
	private final static String PROTOCOL_SVN = "svn";
	private final static String PROTOCOL_SSH = "svnssh";
			
	
	
	public static Chain createChainOfJobs(Collection<Job> jobs, String lvpShortName){
		Chain chain = BuildcoreFactory.eINSTANCE.createChain();
		
		chain.setName(lvpShortName);
		chain.setEnabled(true);
		
		if (jobs != null){
			Iterator<Job> it = jobs.iterator();
			while (it.hasNext()){
				chain.getJobs().add(it.next());
			}
		}
		
		return chain;
	}
	
	
	public static Job createMainJob(String installStepId, String protocol, String rootProjectName, String lvpsShortName, String repositoryLocation, BuildDataConfigContainer<String> conf){
		Job mainJob = BuildcoreFactory.eINSTANCE.createJob();
		
		//set the name
		mainJob.setName("main");
		
		//create and add a clean step to the job
		mainJob.getSteps().add(createCleanStep());
		
		//create an install step
		InstallStep install = createInstallStep("viewpoint_" + lvpsShortName);
		install.setName("viewpoint_" + lvpsShortName);
		install.setProfile("SDKProfil");
		
		
		//add the install step to the job
		mainJob.getSteps().add(install);
		
		SCM scm = null;
		
		//create hudson deployment
		if (conf.iscanManageCronTriggers() || conf.iscanManageGenerationLocation() || conf.iscanManageHudsonProperties()
				|| conf.iscanManageSCMTriggers() ||  conf.iscanManageUsers()){
			HudsonDeployment hudson = createHudsonDeployment(conf, scm, lvpsShortName, protocol, rootProjectName, repositoryLocation);

			//add hudson deployment to the main job
			mainJob.setDeployment(hudson);
		}
		
		return mainJob;
	}
	
	/**
	 * Create a job for viewpoint
	 * @param targetLocation
	 * @param repositoryLocation
	 * @param rootProjectName
	 * @param lvpsShortName
	 * @param conf
	 * @return
	 */
	public static Job createViewpointBuildJob(
			String targetLocation,
			String repositoryLocation,
			String protocol,
			String rootProjectName,
			String lvpsShortName,
			BuildDataConfigContainer<String> conf){
		
		Job buildJob = BuildcoreFactory.eINSTANCE.createJob();
		
		buildJob.setName("build_" + lvpsShortName);
		
		//add properties
		buildJob.getProperties().add(createProperty(GeneratorConstants.TARGET_LOCATION, targetLocation, PropertyType.INLINED));
		buildJob.getProperties().add(createProperty(GeneratorConstants.REPOSITORY_LOCATION, repositoryLocation, PropertyType.RUNTIME));
		
		BuildStep buildStep = null;
		
		if (protocol.contains("svn")){ //$NON-NLS-1$
			//add SVN Location
			SVN svn = BuildscmFactory.eINSTANCE.createSVN();
			SVNLocation svnLocation = createSVNLocation("svn_viewpoint", protocol);
			svn.getLocations().add(svnLocation);

			//add SVN to the job
			buildJob.setScms(svn);
			
			buildStep = createBuildStep(conf, svnLocation);
		} else {
			GIT git = BuildscmFactory.eINSTANCE.createGIT();
			GITLocation gitLocation = createGITLocation("git_viewpoint", protocol);
			
			git.setLocations(gitLocation);
			gitLocation.setBranch("master");
			
			buildJob.setScms(git);
			buildStep = createBuildStep(conf, gitLocation);
		}
		
		//add a clean step to the job
		buildJob.getSteps().add(createCleanStep());
		
		
		
		buildStep.setName(lvpsShortName);
		
		//create a target platform
		TargetPlatformBuildLocation targePlatform = BuildstepFactory.eINSTANCE.createTargetPlatformBuildLocation();
		targePlatform.setPath("${"+GeneratorConstants.TARGET_LOCATION+"}");
		
		//create the feature
		Feature feature = BuildstepFactory.eINSTANCE.createFeature();
		feature.setId(PreferencesConstants.getBuildPreferences(PreferencesConstants.FEATURES_ROOT_PATH));
		
		
		//add the target and the feature to build step
		buildStep.getBuildLocations().add(targePlatform);
		buildStep.getComponents().add(feature);
		
		//add the build step to the job
		buildJob.getSteps().add(buildStep);
		
		//create publish step
		PublishStep publish = BuildstepFactory.eINSTANCE.createPublishStep();
		publish.setComponent(feature);
		publish.setEnabled(true);
		publish.setGenerateDropins(true);
		publish.setGenerateSources(false);
		
		//add publish step to the job
		buildJob.getSteps().add(publish);
		
		//create install step
		InstallStep install = createInstallStep("viewpoint_" + lvpsShortName);
		install.setName(lvpsShortName + " feature");
		install.setProfile("SDKProfil");
		
		//add install step to the job
		buildJob.getSteps().add(install);
		
		return buildJob;
	}
	
	
	private static BuildStep createBuildStep(BuildDataConfigContainer<String> conf, GITLocation gitLocation) {
		BuildStep build = BuildstepFactory.eINSTANCE.createBuildStep();
		
		List<String> sourceFolders = conf.getList(GeneratorConstants.SOURCE_FOLDERS);
		if (sourceFolders != null){
			for(String folder: sourceFolders){
				GITBuildLocation gitBuildLocation = BuildscmFactory.eINSTANCE.createGITBuildLocation();
				gitBuildLocation.setFolderName(folder);
				gitBuildLocation.setGitLocation(gitLocation);
				build.getBuildLocations().add(gitBuildLocation);
			}
		}

		return build;
	}


	private static GITLocation createGITLocation(String url, String protocol) {
		GITLocation location = BuildscmFactory.eINSTANCE.createGITLocation();
		
		location.setProtocol(GITProtocol.HTTP);
		location.setLocalPath(url); //Local Path
		location.setUrl("${" + GeneratorConstants.REPOSITORY_LOCATION + "}");
		
		return location;
	}
	
	/**
	 * Create an SVNLocation
	 * 
	 * @param url
	 * @param protocol
	 * @return SVNLocation
	 */
	public static SVNLocation createSVNLocation(String url, String protocol) {

		SVNLocation svnlocation = BuildscmFactory.eINSTANCE.createSVNLocation();
		if (protocol.equals(PROTOCOL_SVN)) {
			svnlocation.setProtocol(SVNProtocol.SVN);
		}
		if (protocol.equals(PROTOCOL_SSH)) {
			svnlocation.setProtocol(SVNProtocol.SVNSSH);
		}
		svnlocation.setLocalPath(url); //Local path
		
		svnlocation.setUrl("${" + GeneratorConstants.REPOSITORY_LOCATION + "}");

		return svnlocation;
	}


	private static Property createProperty(String key, String value, PropertyType type){
		Property prop = BuildcoreFactory.eINSTANCE.createProperty();
		prop.setKey(key);
		prop.setValue(value);
		prop.setType(type);
		return prop;
	}

	/**
	 * Create a clean step
	 */
	public static CleanStep createCleanStep() {
		CleanStep clean = BuildstepFactory.eINSTANCE.createCleanStep();
		clean.setType(CLEAN_TYPE.RESULT);
		return clean;
	}

	/**
	 * create an install step
	 * 
	 * @id of the install step
	 */
	public static InstallStep createInstallStep(String id) {
		InstallStep install = BuildstepFactory.eINSTANCE.createInstallStep();
		install.setId(id);
		return install;
	}

	
	/**
	 * 
	 * @param conf
	 * @param scm
	 * @param rootProjectName 
	 * @param repositoryLocation 
	 * @return
	 */

	public static HudsonDeployment createHudsonDeployment(
			BuildDataConfigContainer<String> conf, SCM scm, String lvpsShortName, String protocol, String rootProjectName, String repositoryLocation) {

		HudsonDeployment hudsonDeployment = BuilddeployFactory.eINSTANCE
				.createHudsonDeployment();

		if (conf.iscanManageHudsonProperties()) {
			setHudsonProperties(hudsonDeployment,
					conf.getMap(GeneratorConstants.HUDSON_PROPERTIES));
		}

		if (conf.iscanManageUsers()) {
			setHudsonUsers(hudsonDeployment, conf.getMap(GeneratorConstants.USERS));
		}

		if (conf.iscanManageGenerationLocation()) {
			setHudsonGenerationLocation(hudsonDeployment,
					conf.getMap(GeneratorConstants.GENERATION_LOCATION), scm, lvpsShortName, protocol, rootProjectName, repositoryLocation);
		}

		if (conf.iscanManageCronTriggers()) {
			setHudsonCronTriggers(hudsonDeployment,
					conf.getList(GeneratorConstants.CRON_TRIGGERS));
		}
		if (conf.iscanManageSCMTriggers()) {
			setHudsonSCMTriggers(hudsonDeployment,
					conf.getList(GeneratorConstants.SCM_TRIGGERS));
		}

		return hudsonDeployment;
	}
	
	/**
	 * Create build step
	 * @param conf
	 * @param svnLocation
	 * @return
	 */
	public static BuildStep createBuildStep(BuildDataConfigContainer<String> conf, SVNLocation svnLocation){
		BuildStep build = BuildstepFactory.eINSTANCE.createBuildStep();
		
		List<String> sourceFolders = conf.getList(GeneratorConstants.SOURCE_FOLDERS);
		if (sourceFolders != null){
			for(String folder: sourceFolders){
				SVNBuildLocation svnBuildLocation = BuildscmFactory.eINSTANCE.createSVNBuildLocation();
				svnBuildLocation.setFolderName(folder);
				svnBuildLocation.setSvnLocation(svnLocation);
				build.getBuildLocations().add(svnBuildLocation);
			}
		}

		return build;
	}

	private static void setHudsonSCMTriggers(HudsonDeployment hudsonDeployment,
			List<String> triggers) {
		
		if (triggers != null) {
			for (String planning : triggers) {
				SCMTrigger scmTrigger = BuilddeployFactory.eINSTANCE.createSCMTrigger();
				scmTrigger.setPlanning(planning);
				hudsonDeployment.getTriggers().add(scmTrigger);
			}
		}
	}

	private static void setHudsonGenerationLocation(
			HudsonDeployment hudsonDeployment, Map<String, String> generationLocation, SCM scm, String lvpsShortName, String protocol, String rootProjectName, String repositoryLocation) {

		if (protocol.contains("svn")) {
			generateSVNLocation(hudsonDeployment, generationLocation, scm, lvpsShortName, protocol, rootProjectName, repositoryLocation);
		} else {
			generateGitLocation(hudsonDeployment, generationLocation, scm, lvpsShortName, protocol, rootProjectName, repositoryLocation);
		}
			

	}


	private static void generateGitLocation(HudsonDeployment hudsonDeployment, Map<String, String> generationLocation, SCM scm, String lvpsShortName, String protocol, String rootProjectName, String repositoryLocation) {
		
		GITGenerationLocation gitGenerationLocation = BuildscmFactory.eINSTANCE.createGITGenerationLocation();

		if (generationLocation != null){
			for(String key: generationLocation.keySet()){

				gitGenerationLocation.setFolderName(key);
				GITLocation gitLocation = BuildscmFactory.eINSTANCE.createGITLocation();

				String url = generationLocation.get(key);
				if (url != null){

					gitLocation.setUrl(generationLocation.get(key));
					gitLocation.setLocalPath(lvpsShortName + "_releng");

				} else {
					if (repositoryLocation.endsWith("/")) {
						url = repositoryLocation + rootProjectName + "." + lvpsShortName + ".releng";
					} else {
						url = repositoryLocation + "/" + rootProjectName + "." + lvpsShortName + ".releng";
					}
					gitLocation.setUrl(url);
				}

					gitLocation.setProtocol(GITProtocol.HTTP);

				gitGenerationLocation.setGitLocation(gitLocation);

				break;
			}
		}
		
		hudsonDeployment.setGenerationLocation(gitGenerationLocation);
	}


	private static void generateSVNLocation(HudsonDeployment hudsonDeployment, Map<String, String> generationLocation,
			SCM scm, String lvpsShortName, String protocol, String rootProjectName, String repositoryLocation) {
		SVNGenerationLocation svnGenerationLocation = BuildscmFactory.eINSTANCE.createSVNGenerationLocation();

		if (generationLocation != null){
			Set<Entry<String, String>> entrySet = generationLocation.entrySet();
			for (Entry<String, String> entry : entrySet) {
				svnGenerationLocation.setFolderName(entry.getKey());
				SVNLocation svnLocation = BuildscmFactory.eINSTANCE.createSVNLocation();

				String url = generationLocation.get(entry.getKey());
				if (url != null){

					svnLocation.setUrl(generationLocation.get(entry.getKey()));
					svnLocation.setLocalPath(lvpsShortName + "_releng");

				} else {
					if (repositoryLocation.endsWith("/")) {
						url = repositoryLocation + rootProjectName + "." + lvpsShortName + ".releng";
					} else {
						url = repositoryLocation + "/" + rootProjectName + "." + lvpsShortName + ".releng";
					}
					svnLocation.setUrl(url);
				}

				if (protocol.equals(PROTOCOL_SVN)) {
					svnLocation.setProtocol(SVNProtocol.SVN);
				}
				if (protocol.equals(PROTOCOL_SSH)) {
					svnLocation.setProtocol(SVNProtocol.SVNSSH);
				}

				if (scm instanceof SVN) {
					((SVN)scm).getLocations().add(svnLocation);
				}
				
				svnGenerationLocation.setSvnLocation(svnLocation);

				break;
			}
		}
		
		hudsonDeployment.setGenerationLocation(svnGenerationLocation);
	}

	private static void setHudsonCronTriggers(
			HudsonDeployment hudsonDeployment, List<String> triggers) {

		if (triggers != null) {
			for (String planning : triggers) {
				CronTrigger cronTrigger = BuilddeployFactory.eINSTANCE.createCronTrigger();
				cronTrigger.setPlanning(planning);
				hudsonDeployment.getTriggers().add(cronTrigger);
			}
		}
	}

	private static void setHudsonUsers(HudsonDeployment deployment,
			Map<String, String> users) {
		if (users != null) {
			Set<Entry<String, String>> entrySet = users.entrySet();
			for (Entry<String, String> entry : entrySet) {
				User user = BuilddeployFactory.eINSTANCE.createUser();
				String login = entry.getKey();
				user.setLogin(login);
				String permission = users.get(login);

				// read is default value
				if (permission != null) {
					if (permission.equals(UserPermission.WRITE.toString())) {
						user.setPermission(PermissionType.WRITE);
					}

					if (permission.equals(UserPermission.EXECUTE.toString())) {
						user.setPermission(PermissionType.EXECUTE);
					}

				}
				deployment.getUsers().add(user);
			}
		}
	}

	private static void setHudsonProperties(HudsonDeployment hudsonDeployment,
			Map<String, String> properties) {

		if (properties != null) {
			Set<Entry<String, String>> entrySet = properties.entrySet();
			for (Entry<String, String> entry : entrySet) {
				String key = entry.getKey();
				if (key.equals("antName")) {
					String tmp = properties.get(key);
					if (tmp != null && !tmp.equals("")) {
						hudsonDeployment.setAntName(new String(tmp));
					}
				}
				if (key.equals("assignedNode")) {
					String tmp = properties.get(key);
					if (tmp != null && !tmp.equals("")) {
						hudsonDeployment.setAssignedNode(new String(tmp));
					}
				}
				if (key.equals("build_id")) {
					String tmp = properties.get(key);
					if (tmp != null && !tmp.equals("")) {
						hudsonDeployment.setBuildId(new String(tmp));
					}
				}
				if (key.equals("enabled")) {
					String tmp = properties.get(key);
					if (tmp != null && !tmp.equals("")) {
						if (tmp.equals("false")) {
							hudsonDeployment.setEnabled(false);
						}
					}
				}
				if (key.equals("jdkName")) {
					String tmp = properties.get(key);
					if (tmp != null && !tmp.equals("")) {
						hudsonDeployment.setJdkName(new String(tmp));
					}
				}
				if (key.equals("userDeployJobName")) {
					String tmp = properties.get(key);
					if (tmp != null && !tmp.equals("")) {
						hudsonDeployment.setUserDeployJobName(new String(tmp));

					}
				}
				if (key.equals("userDeployServerUrl")) {
					String tmp = properties.get(key);
					if (tmp != null && !tmp.equals("")) {
						hudsonDeployment.setUserDeployServerUrl(new String(tmp));
					}
				}
			}
		}
	}
}