/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.ui.launch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import org.polarsys.kitalpha.cadence.ui.api.CadenceUiRegistry;
import org.polarsys.kitalpha.composer.api.CodeManagerCadenceLaunchConfiguration;
import org.polarsys.kitalpha.composer.api.CodeManagerLauncher;
import org.polarsys.kitalpha.composer.api.ComposerUtil;
import org.polarsys.kitalpha.composer.api.ICodeManagerWorkflowConstants;
import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.api.configuration.CodeManagerConfiguration;
import org.polarsys.kitalpha.composer.api.library.LibraryReuseHelper;
import org.polarsys.kitalpha.composer.api.path.ComposerPathUtils;
import org.polarsys.kitalpha.composer.extension.points.CodeManagerExtensions;
import org.polarsys.kitalpha.composer.extension.points.IGenerator;
import org.polarsys.kitalpha.composer.extension.points.IRefinery;
import org.polarsys.kitalpha.composer.extension.points.IStrategy;
import org.polarsys.kitalpha.composer.ui.Activator;
import org.polarsys.kitalpha.composer.ui.validators.ManagerValidator;

/**
 * Type for the composer launch configuration.
 * 
 
 */
public class CodeManagerLaunchConfigurationType implements
		ILaunchConfigurationDelegate, ICodeManagerWorkflowConstants {

	private static final String DEBUG_MODE = "debug";

	private IStrategy strategy = null;
	private IRefinery refinery = null;
	private IGenerator generator = null;
	private String pathGeneration = null;
	private Map<String, Parameter> strategyParameters = null;
	private Map<String, Parameter> refineryParameters = null;
	private Map<String, Parameter> generatorParameters = null;
	private ISelection selections = null;
	private List<org.polarsys.kitalpha.resourcereuse.model.Resource> libraries;
	private String missingLibrary;


	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor, ISelection selections)
			throws CoreException {
		try {
			//
			// Scan selection
			List<ResourceSet> resourceSets = new ArrayList<ResourceSet>();
			List<Resource> resources = new ArrayList<Resource>();
			List<EObject> eObjects = new ArrayList<EObject>();

			ManagerValidator validator = new ManagerValidator(configuration);
			manageSelection(resourceSets, resources, eObjects, selections,
					validator);

			int totalWork = resourceSets.size() + resources.size()
					+ (eObjects.isEmpty() ? 0 : 1);
			SubMonitor subMonitor = SubMonitor.convert(monitor, totalWork);

			CodeManagerConfiguration codeManagerConfiguration = new CodeManagerConfiguration();

			// cadence activities.
			cadenceConfiguration(configuration, codeManagerConfiguration);

			
			// get strategy, refinery and generator.
			strategyLauncher(configuration);
			codeManagerConfiguration.setStrategy(this.strategy);
			codeManagerConfiguration
					.setStrategyParameters(this.strategyParameters);

			refineryLauncher(configuration);
			codeManagerConfiguration.setRefinery(this.refinery);
			codeManagerConfiguration
					.setRefineryParameters(this.refineryParameters);

			generatorLauncher(configuration);
			codeManagerConfiguration.setGenerator(this.generator);
			codeManagerConfiguration
					.setGeneratorParameters(this.generatorParameters);
			
			//set mode
			codeManagerConfiguration.setSaveAllocationModel(mode.equals(DEBUG_MODE));
			
			//set Libraries
			librariesLauncher(configuration);
			codeManagerConfiguration.setLibraries(libraries);
			codeManagerConfiguration.setNoFound(missingLibrary);
			
			// Generation.
			for (ResourceSet resourceSet : resourceSets) {
				//
				// Destination folder.
				codeManagerConfiguration
						.setDestinationFolder(ComposerPathUtils.getPath(resourceSet,pathGeneration));
				codeManagerConfiguration.setResourceSet(resourceSet);
				CodeManagerLauncher.launchWithProgress(
						codeManagerConfiguration, subMonitor.newChild(1));
			}
			for (Resource resource : resources) {
				codeManagerConfiguration
						.setDestinationFolder(ComposerPathUtils.getPath(resource,pathGeneration));
				codeManagerConfiguration.setResource(resource);
				CodeManagerLauncher.launchWithProgress(
						codeManagerConfiguration, subMonitor.newChild(1));
			}
			if (!eObjects.isEmpty()) {
				codeManagerConfiguration.setDestinationFolder(ComposerPathUtils.getPath(eObjects
						.iterator().next(),pathGeneration));
				codeManagerConfiguration.setObjects(eObjects);
				CodeManagerLauncher.launchWithProgress(
						codeManagerConfiguration, subMonitor.newChild(1));
			}
		} catch (ManagerValidator.ValidationException e) {
			ILog log = Activator.getDefault().getLog();
			log.log(new Status(Status.ERROR, Activator.PLUGIN_ID, e
					.getMessage()));

		}
	}


	private void manageSelection(List<ResourceSet> resourceSets,
			List<Resource> resources, List<EObject> objects,
			ISelection selection, ManagerValidator validator)
			throws ManagerValidator.ValidationException {

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			for (Object o : structuredSelection.toList()) {
				if (o instanceof EObject) {
					objects.add((EObject) o);
				} else if (o instanceof Resource) {
					resources.add((Resource) o);
				} else if (o instanceof ResourceSet) {
					resourceSets.add((ResourceSet) o);
				} else if (o instanceof IFolder) {
					IFolder folder = (IFolder) o;
					ResourceSet resourceSet = validator.isValidIFolder(folder);
					if (!resourceSet.getResources().isEmpty()) {
						resourceSets.add(resourceSet);
					} else {
						throw validator.new ValidationException(folder);
					}
				} else if (o instanceof IFile) {
					IFile file = (IFile) o;
					Resource resource = validator.isValidIFile(file);
					if (resource != null) {
						resources.add(resource);
					} else {
						throw validator.new ValidationException(file);
					}
				}
			}
		}
	}

	private CodeManagerCadenceLaunchConfiguration cadenceConfiguration(
			ILaunchConfiguration configuration,
			CodeManagerConfiguration codeManagerConfiguration) {
		CodeManagerCadenceLaunchConfiguration cadenceConfig = new CodeManagerCadenceLaunchConfiguration();

		cadenceConfig.setBeforeStrategyActivities(CadenceUiRegistry
				.getActivities(configuration, COMPOSER_WORKFLOW_ID,
						COMPOSER_WORKFLOW_BEFORE_STRATEGY_ID));
		cadenceConfig.setBeforeRefineryActivities(CadenceUiRegistry
				.getActivities(configuration, COMPOSER_WORKFLOW_ID,
						COMPOSER_WORKFLOW_BEFORE_REFINERY_ID));
		cadenceConfig.setBeforeGenerationActivities(CadenceUiRegistry
				.getActivities(configuration, COMPOSER_WORKFLOW_ID,
						COMPOSER_WORKFLOW_BEFORE_GENERATION_ID));
		cadenceConfig.setAfterGenerationActivities(CadenceUiRegistry
				.getActivities(configuration, COMPOSER_WORKFLOW_ID,
						COMPOSER_WORKFLOW_AFTER_GENERATION_ID));
		codeManagerConfiguration
				.setCodeManagerCadenceLaunchConfiguration(cadenceConfig);
		return cadenceConfig;
	}

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		// get selections
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				selections = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage()
						.getSelection();

			}

		});
		this.launch(configuration, mode, launch, monitor, this.selections);
		// get selections
	}

	private void strategyLauncher(ILaunchConfiguration configuration)
			throws CoreException {

		String id = configuration.getAttribute(
				ICodeManagerLaunchConfigurationConstants.STRATEGY_ID, "");
		Map<String, String> stringMap = ComposerUtil
				.cast(configuration
						.getAttribute(
								ICodeManagerLaunchConfigurationConstants.STRATEGY_PARAMETERS,
								new HashMap<String, String>()));
		IConfigurationElement element = CodeManagerExtensions
				.getStrategyConfigElementFromId(id);
		if (element != null) {
			strategy = (IStrategy) element
					.createExecutableExtension(CodeManagerExtensions.ATT_CLASS);
			Map<String, Parameter> params = strategy.getParameters();
			if (params != null) {
				strategyParameters = this.constructParametersMapFromString(
						stringMap, params);
			}
		}

	}

	private void refineryLauncher(ILaunchConfiguration configuration)
			throws CoreException {

		String id = configuration.getAttribute(
				ICodeManagerLaunchConfigurationConstants.REFINERY_ID, "");
		Map<String, String> stringMap = ComposerUtil
				.cast(configuration
						.getAttribute(
								ICodeManagerLaunchConfigurationConstants.REFINERY_PARAMETERS,
								new HashMap<String, String>()));
		IConfigurationElement element = CodeManagerExtensions
				.getRefineryConfigElementFromId(id);
		if (element != null) {
			refinery = (IRefinery) element
					.createExecutableExtension(CodeManagerExtensions.ATT_CLASS);
			Map<String, Parameter> params = refinery.getParameters();
			if (params != null) {
				refineryParameters = this.constructParametersMapFromString(
						stringMap, params);
			}
		}
	}
	
	/**
	 * Extract the libraries defined by the user in order to put it 
	 * in the Composer Configuration
	 * @param configuration
	 * @throws CoreException
	 */
	private void librariesLauncher(ILaunchConfiguration configuration)
			throws CoreException {

		List<String> libListStr = ComposerUtil
			.cast(configuration.getAttribute(ICodeManagerLaunchConfigurationConstants.SELECTED_LIBRARIES, new ArrayList<String>()));
			
		libraries = LibraryReuseHelper.INSTANCE.getResourcesFromIds(libListStr);
		
		missingLibrary = configuration.getAttribute(ICodeManagerLaunchConfigurationConstants.MISSING_LIB_PATH,"");
		
}
	
	private void generatorLauncher(ILaunchConfiguration configuration)
			throws CoreException {

		String id = configuration.getAttribute(
				ICodeManagerLaunchConfigurationConstants.CODEGEN_ID, "");
		Map<String, String> stringMap = ComposerUtil
				.cast(configuration
						.getAttribute(
								ICodeManagerLaunchConfigurationConstants.CODEGEN_PARAMETERS,
								new HashMap<String, String>()));
		IConfigurationElement element = CodeManagerExtensions
				.getGeneratorConfigElementFromId(id);
		if (element != null) {
			generator = (IGenerator) element
					.createExecutableExtension(CodeManagerExtensions.ATT_CLASS);
			pathGeneration = configuration
					.getAttribute(
							ICodeManagerLaunchConfigurationConstants.CODEGEN_FOLDER,
							"");
			Map<String, Parameter> params = generator.getParameters();
			if (params != null) {
				generatorParameters = this.constructParametersMapFromString(
						stringMap, params);
			}
		}

	}

	private Map<String, Parameter> constructParametersMapFromString(
			final Map<String, String> stringMap,
			final Map<String, Parameter> parametersMap) {

		for (Map.Entry<String, Parameter> parameterEntry: parametersMap.entrySet()) {
			String stringValue = (String) stringMap.get(parameterEntry.getKey());
			Parameter parametersValue = parameterEntry.getValue();
			parametersValue.setValue(stringValue);
			parametersMap.put(parameterEntry.getKey(), parametersValue);
		}

		return parametersMap;
	}

}
