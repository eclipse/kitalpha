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

import static com.google.common.collect.Maps.uniqueIndex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.setup.BuildDocGeneratorSetup;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.templates.GenBuildDocumentation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.util.JavaUtil;

import com.google.common.base.Function;
import com.google.inject.Injector;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class CreateBuildDocumentationTask implements ITaskProduction {
	
    private Injector injector;
	
	Set<OutputConfiguration> outputConfigurations = new HashSet<OutputConfiguration>();	

	protected IGenerator getCompiler() {
		return injector.getInstance(IGenerator.class);
	}
	
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
	}

	public void doExecute(ITaskProductionContext productionContext,IProgressMonitor monitor) throws InvocationException {
		//repository location
		String repositoryLocation = productionContext.getInputValue(GeneratorConstants.REPOSITORY_LOCATION, String.class);
		if (repositoryLocation == null || "".equals(repositoryLocation)) 
			throw new InvocationException(Messages.GeneratorError_RepositoryLocationNotFound);
		//repository protocol
		String repositoryProtocol = productionContext.getInputValue(GeneratorConstants.REPOSITORY_PROTOCOL, String.class);
		if (repositoryProtocol == null || "".equals(repositoryProtocol))
			throw new InvocationException(Messages.GeneratorError_RepositoryProtocolNotFound);
		//root project name
		String rootProjectName = productionContext.getInputValue(GeneratorConstants.LVPS_ROOT_PROJECT_NAME, String.class);
		if (rootProjectName == null || "".equals(rootProjectName))
			throw new InvocationException(Messages.GeneratorError_ProjectNameNotFound);
		//viewpoint short name
		String lvpsShortName = productionContext.getInputValue(GeneratorConstants.LVPS_SHORT_NAME, String.class);
		if (lvpsShortName == null || "".equals(lvpsShortName))
			throw new InvocationException(Messages.GeneratorError_ViewpointShortNameNotFound);
		
		String projectId = rootProjectName + "." + "releng";
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectId);
		if (project.exists()) {
			IPath location = project.getLocation();
			String buildFilePath = location.toString() + "/releng-scripts/" + "build_" + lvpsShortName + "/releng/build.xml";
			initOutputConfigurations(projectId, "doc");
			doGenerateDocumentation(lvpsShortName, buildFilePath, repositoryLocation, repositoryProtocol);
		} else {
			throw new RuntimeException(Messages.GeneratorError_RelengPluginNotFound);
		}
	}

	private void doGenerateDocumentation(String lvpsShortName, String buildFilePath, String repositoryLocation, String repositoryProtocol) {
		injector = new BuildDocGeneratorSetup().createInjectorAndDoEMFRegistration();
		final IGenerator instance = getCompiler();
		if (instance!=null) {
			GenBuildDocumentation genDoc = (GenBuildDocumentation) instance;		
			IFileSystemAccess fsa = getConfiguredFileSystemAccess();
			genDoc.setRepositoryURL(reconcile(repositoryProtocol, repositoryLocation));
			genDoc.setViewpointShortName(lvpsShortName);
			genDoc.setBuildFilePath(buildFilePath);
			genDoc.doGenerate(null, fsa);
		}
		else {
			throw new RuntimeException(Messages.GeneratorError_UnboundGenerator);
		}

	}
	
	private String reconcile(String repositoryProtocol,	String repositoryLocation) {
		if (repositoryProtocol.equals("svn")) {
			return "svn://"+repositoryLocation;
		}
		else if (repositoryProtocol.equals("svnssh")) {
			return "svn+ssh://"+repositoryLocation;
		}
		throw new RuntimeException(Messages.GeneratorError_RepositoryProtocolNotFound);
	}

	private void initOutputConfigurations(String projectName, String folderName) {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (project.exists()) {
			addOutputConfiguration(project, folderName);
		}
	}
	
	protected IFileSystemAccess getConfiguredFileSystemAccess() {
		final JavaIoFileSystemAccess configuredFileSystemAccess = injector.getInstance(JavaIoFileSystemAccess.class);
		configuredFileSystemAccess.setOutputConfigurations(getOutputConfigurations());
		Iterator<OutputConfiguration> iterator = outputConfigurations.iterator();
		while(iterator.hasNext()) {
			OutputConfiguration current = iterator.next();
			String name = current.getName();
			String outputDirectory = current.getOutputDirectory();
			configuredFileSystemAccess.setOutputPath(name, outputDirectory);
		}
		return configuredFileSystemAccess;
	}
	
	protected Map<String,OutputConfiguration> getOutputConfigurations() {
		Set<OutputConfiguration> configurations = getCurrentOutputConfigurations();	
		return uniqueIndex(configurations, new Function<OutputConfiguration, String>() {
			public String apply(OutputConfiguration from) {
				return from.getName();
			}
		});
	}
	
	protected Set<OutputConfiguration> getCurrentOutputConfigurations() {
		return outputConfigurations;
	}

	protected void addOutputConfiguration(IProject project, String folderName) {
		IFolder folderPath = JavaUtil.createFolder(project.getName(), folderName);
		OutputConfiguration targetOutput = new OutputConfiguration(GeneratorConstants.DEFAULT_OUTPUT);
		targetOutput.setDescription(project.getName());
		targetOutput.setOutputDirectory(folderPath.getLocation().toString());
		targetOutput.setOverrideExistingResources(true);
		targetOutput.setCreateOutputDirectory(true);
		targetOutput.setCleanUpDerivedResources(true);
		targetOutput.setSetDerivedProperty(true);
		outputConfigurations.add(targetOutput);	
	}
	
	public void postExecute(ITaskProductionContext productionContext,IProgressMonitor monitor) throws InvocationException {
	}
}
