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


package org.polarsys.kitalpha.composer.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.polarsys.kitalpha.cadence.core.api.CadenceLauncher;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;
import org.polarsys.kitalpha.composer.Activator;
import org.polarsys.kitalpha.composer.api.configuration.CodeManagerConfiguration;
import org.polarsys.kitalpha.composer.api.configuration.CodeManagerInputFactory;
import org.polarsys.kitalpha.composer.api.configuration.ICodeManagerInput;
import org.polarsys.kitalpha.composer.api.library.LibraryRuntimeHelper;
import org.polarsys.kitalpha.composer.extension.points.IGenerator;
import org.polarsys.kitalpha.composer.extension.points.IGeneratorWithProgress;
import org.polarsys.kitalpha.composer.extension.points.IRefinery;
import org.polarsys.kitalpha.composer.extension.points.IRefineryWithProgress;
import org.polarsys.kitalpha.composer.extension.points.IStrategy;
import org.polarsys.kitalpha.composer.extension.points.IStrategyWithProgress;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;

/**
 * This class allows to launch a complete code generation.
 * 
 * @author Guillaume Gebhart
 */
public final class CodeManagerLauncher implements ICodeManagerWorkflowConstants {

	private static final String ALLOCATION_MODEL_PARAM_DESCRIPTION = "Root of the allocation model";
	private static final String ALLOCATION_MODEL_PARAM_NAME = "allocationModel";
	private static final String GENERATION_DIRECTORY_PATH_PARAM_DESCRIPTION = "The path of the directory that contains the genereted files";
	private static final String GENERATION_DIRECTORY_PATH_PARAM_NAME = "generationDirectoryPath";
	private static final String SEMANTIC_MODEL_PARAM_DESCRIPTION = "The semantic model";
	private static final String SEMANTIC_MODEL_PARAM_NAME = "semanticModel";
	private static Map<String, ParameterError> wrongParams = null;

	/**
	 * Method that allows to launch an code generation from an allocation model
	 * element.
	 * 
	 * @param strategy :
	 *            the strategy used
	 * @param strategyParams_p :
	 *            the parameters of the strategy
	 * @param refinery :
	 *            the refinery used
	 * @param refineryParams_p :
	 *            the parameters of the refinery
	 * @param generator :
	 *            the generator used
	 * @param path_p :
	 *            the target folder of the code generation
	 * @param eObject :
	 *            the element that user wants to generate
	 */
	public static IStatus launch(final IStrategy strategy,
			final Map<String, Parameter> strategyParams_p,
			final IRefinery refinery,
			final Map<String, Parameter> refineryParams_p,
			final IGenerator generator, final IPath path_p,
			final Map<String, Parameter> generatorParams_p,
			final List<EObject> eObjects,
			final CodeManagerCadenceLaunchConfiguration cadenceConfig,
			boolean save) {

		CodeManagerConfiguration codeManagerConfiguration = createLaunchConfiguration(
				strategy, strategyParams_p, refinery, refineryParams_p,
				generator, path_p, generatorParams_p, CodeManagerInputFactory
						.create(eObjects), cadenceConfig, save);

		return launchWithProgress(codeManagerConfiguration, new NullProgressMonitor());
	}

	/**
	 * Method that allows to launch an code generation from an allocation model.
	 * 
	 * @param strategy :
	 *            the strategy used
	 * @param strategyParams_p :
	 *            the parameters of the strategy
	 * @param refinery :
	 *            the refinery used
	 * @param refineryParams_p :
	 *            the parameters of the refinery
	 * @param generator :
	 *            the generator used
	 * @param path_p :
	 *            the target folder of the code generation
	 * @param resource :
	 *            the model that user wants to generate
	 */
	public static IStatus launch(final IStrategy strategy,
			final Map<String, Parameter> strategyParams_p,
			final IRefinery refinery,
			final Map<String, Parameter> refineryParams_p,
			final IGenerator generator, final IPath path_p,
			final Map<String, Parameter> generatorParams_p,
			final Resource resource,
			final CodeManagerCadenceLaunchConfiguration cadenceConfig,
			boolean save) {

		CodeManagerConfiguration codeManagerConfiguration = createLaunchConfiguration(
				strategy, strategyParams_p, refinery, refineryParams_p,
				generator, path_p, generatorParams_p, CodeManagerInputFactory
						.create(resource), cadenceConfig, save);
		return launchWithProgress(codeManagerConfiguration, new NullProgressMonitor());
	}

	/**
	 * Method that allows to launch an code generation from an allocation model.
	 * 
	 * @param strategy :
	 *            the strategy used
	 * @param strategyParams_p :
	 *            the parameters of the strategy
	 * @param refinery :
	 *            the refinery used
	 * @param refineryParams_p :
	 *            the parameters of the refinery
	 * @param generator :
	 *            the generator used
	 * @param path_p :
	 *            the target folder of the code generation
	 * @param modelRoot_p :
	 *            the root of the model
	 */
	public static IStatus launch(final IStrategy strategy,
			final Map<String, Parameter> strategyParams_p,
			final IRefinery refinery,
			final Map<String, Parameter> refineryParams_p,
			final IGenerator generator, final IPath path_p,
			final Map<String, Parameter> generatorParams_p,
			final EObject modelRoot_p,
			final CodeManagerCadenceLaunchConfiguration cadenceConfig,
			boolean save) {

		CodeManagerConfiguration codeManagerConfiguration = createLaunchConfiguration(
				strategy, strategyParams_p, refinery, refineryParams_p,
				generator, path_p, generatorParams_p, CodeManagerInputFactory
						.create(modelRoot_p), cadenceConfig, save);

		return launchWithProgress(codeManagerConfiguration, new NullProgressMonitor());
	}

	/**
	 * Method that allows to launch an code generation from several models.
	 * 
	 * @param strategy :
	 *            the strategy used
	 * @param strategyParams_p :
	 *            the parameters of the strategy
	 * @param refinery :
	 *            the refinery used
	 * @param refineryParams_p :
	 *            the parameters of the refinery
	 * @param generator :
	 *            the generator used
	 * @param path_p :
	 *            the target folder of the code generation
	 * @param resourceSet :
	 *            the models that user wants to generate
	 */
	public static IStatus launch(final IStrategy strategy,
			final Map<String, Parameter> strategyParams_p,
			final IRefinery refinery,
			final Map<String, Parameter> refineryParams_p,
			final IGenerator generator, final IPath path_p,
			final Map<String, Parameter> generatorParams_p,
			final ResourceSet resourceSet,
			final CodeManagerCadenceLaunchConfiguration cadenceConfig,
			boolean save) {

		CodeManagerConfiguration codeManagerConfiguration = createLaunchConfiguration(
				strategy, strategyParams_p, refinery, refineryParams_p,
				generator, path_p, generatorParams_p, CodeManagerInputFactory
						.create(resourceSet), cadenceConfig, save);

		return launchWithProgress(codeManagerConfiguration, new NullProgressMonitor());
	}

	/**
	 * Method that allows to launch an code generation from an allocation model
	 * element.
	 * 
	 * @param strategy :
	 *            the strategy used
	 * @param strategyParams_p :
	 *            the parameters of the strategy
	 * @param refinery :
	 *            the refinery used
	 * @param refineryParams_p :
	 *            the parameters of the refinery
	 * @param generator :
	 *            the generator used
	 * @param path_p :
	 *            the target folder of the code generation
	 * @param eObject :
	 *            the element that user wants to generate
	 */
	public static IStatus launch(final IStrategy strategy,
			final Map<String, Parameter> strategyParams_p,
			final IRefinery refinery,
			final Map<String, Parameter> refineryParams_p,
			final IGenerator generator, final IPath path_p,
			final Map<String, Parameter> generatorParams_p,
			final List<EObject> eObjects, boolean save) {

		return launch(strategy, strategyParams_p, refinery, refineryParams_p,
				generator, path_p, generatorParams_p, eObjects,
				new CodeManagerCadenceLaunchConfiguration(), save);
	}

	/**
	 * Method that allows to launch an code generation from an allocation model.
	 * 
	 * @param strategy :
	 *            the strategy used
	 * @param strategyParams_p :
	 *            the parameters of the strategy
	 * @param refinery :
	 *            the refinery used
	 * @param refineryParams_p :
	 *            the parameters of the refinery
	 * @param generator :
	 *            the generator used
	 * @param path_p :
	 *            the target folder of the code generation
	 * @param resource :
	 *            the model that user wants to generate
	 */
	public static IStatus launch(final IStrategy strategy,
			final Map<String, Parameter> strategyParams_p,
			final IRefinery refinery,
			final Map<String, Parameter> refineryParams_p,
			final IGenerator generator, final IPath path_p,
			final Map<String, Parameter> generatorParams_p,
			final Resource resource, boolean save) {

		return launch(strategy, strategyParams_p, refinery, refineryParams_p,
				generator, path_p, generatorParams_p, resource,
				new CodeManagerCadenceLaunchConfiguration(), save);
	}

	/**
	 * Method that allows to launch an code generation from an allocation model.
	 * 
	 * @param strategy :
	 *            the strategy used
	 * @param strategyParams_p :
	 *            the parameters of the strategy
	 * @param refinery :
	 *            the refinery used
	 * @param refineryParams_p :
	 *            the parameters of the refinery
	 * @param generator :
	 *            the generator used
	 * @param path_p :
	 *            the target folder of the code generation
	 * @param modelRoot_p :
	 *            the root of the model
	 */
	public static IStatus launch(final IStrategy strategy,
			final Map<String, Parameter> strategyParams_p,
			final IRefinery refinery,
			final Map<String, Parameter> refineryParams_p,
			final IGenerator generator, final IPath path_p,
			final Map<String, Parameter> generatorParams_p,
			final EObject modelRoot_p, boolean save) {

		return launch(strategy, strategyParams_p, refinery, refineryParams_p,
				generator, path_p, generatorParams_p, modelRoot_p,
				new CodeManagerCadenceLaunchConfiguration(), save);
	}

	/**
	 * Method that allows to launch an code generation from several models.
	 * 
	 * @param strategy :
	 *            the strategy used
	 * @param strategyParams_p :
	 *            the parameters of the strategy
	 * @param refinery :
	 *            the refinery used
	 * @param refineryParams_p :
	 *            the parameters of the refinery
	 * @param generator :
	 *            the generator used
	 * @param path_p :
	 *            the target folder of the code generation
	 * @param resourceSet :
	 *            the models that user wants to generate
	 */
	public static IStatus launch(final IStrategy strategy,
			final Map<String, Parameter> strategyParams_p,
			final IRefinery refinery,
			final Map<String, Parameter> refineryParams_p,
			final IGenerator generator, final IPath path_p,
			final Map<String, Parameter> generatorParams_p,
			final ResourceSet resourceSet, boolean save) {

		return launch(strategy, strategyParams_p, refinery, refineryParams_p,
				generator, path_p, generatorParams_p, resourceSet,
				new CodeManagerCadenceLaunchConfiguration(), save);
	}

	private static void saveAllocationModel(Resource business_model,
			EObject alloc_model, IPath path) {

		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		String modelname = business_model.getURI().toPlatformString(true);
		// Get the URI of the model file.
		URI fileURI = URI.createPlatformResourceURI(modelname.replaceAll(
				business_model.getURI().fileExtension(), (alloc_model.eClass()
						.getEPackage().getName()).toString()), true);

		// Create a resource for this file.
		Resource resource = resourceSet.createResource(fileURI);
		resource.getContents().add(alloc_model);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			ILog log = Activator.getDefault().getLog();
			log.log(new Status(Status.ERROR, Activator.PLUGIN_ID,
					"Error while generating code", e));
		}

	}

	public static String getParameterErrorsTrace(
			Map<String, ParameterError> parametersMap) {
		
		StringBuffer buf = new StringBuffer();
		buf.append("bad value for: ");
		for (Map.Entry<String, ParameterError> parametersMapEntry: parametersMap.entrySet()) {
			buf.append(parametersMapEntry.getKey() + "->" + parametersMapEntry.getValue().getReason() + ",");
		}
		String result = buf.toString();

		int end = result.lastIndexOf(",");
		return result.substring(0, end);
	}

	public static IStatus launchWithProgress(
			CodeManagerConfiguration configuration,
			IProgressMonitor progressMonitor) {
		CodeManagerCadenceLaunchConfiguration cadenceConfig = configuration
				.getCodeManagerCadenceLaunchConfiguration();
		
		
		int totalWork = cadenceConfig.getBeforeStrategyActivities()
				.getActivitiesID().size()
				+ 1
				+ cadenceConfig.getBeforeRefineryActivities().getActivitiesID()
						.size()
				+ 1
				+ cadenceConfig.getBeforeGenerationActivities()
						.getActivitiesID().size()
				+ 1
				+ cadenceConfig.getAfterGenerationActivities()
						.getActivitiesID().size();

		if (configuration.getInput().isMultipleObjectsInput()) {
			//
			// launch partial generation.
			SubMonitor subMonitor = SubMonitor.convert(progressMonitor,
					totalWork);
			return launchFromEObjectsList(configuration, subMonitor);
		} else {
			//
			// launch complete generation.
			totalWork = totalWork
					* configuration.getInput().getRootsInputs().size();
			SubMonitor subMonitor = SubMonitor.convert(progressMonitor,
					totalWork);
			for (EObject eObject : configuration.getInput().getRootsInputs()) {
				IStatus status = launchFromRootEObject(eObject, configuration,
						subMonitor);
				if (!status.isOK()) {
					//
					// Stop the generation early.
					return status;
				}
			}
			return Status.OK_STATUS;
		}
	}

	private static IStatus launchFromRootEObject(EObject object,
			CodeManagerConfiguration configuration, SubMonitor subMonitor) {
		try {
			List<EObject> selectedObjects = new ArrayList<EObject>(1);
			selectedObjects.add(object);

			//
			// Before strategy
			IStatus status = beforeStrategyWorkflow(configuration, subMonitor,
					selectedObjects);
			if (!status.isOK()) {
				Activator.getDefault().getLog().log(status);
				return status;
			}

			//
			// strategy
			Root allocRoot = strategyLauncher(configuration.getStrategy(),
					configuration.getStrategyParameters(), object, subMonitor
							.newChild(1));

			//
			// Before refinery
			status = beforeRefineryWorkflow(configuration, subMonitor,
					selectedObjects, allocRoot);
			if (!status.isOK()) {
				Activator.getDefault().getLog().log(status);
				return status;
			}

			
			//set Libaries helper
			setLibrariesHelper(configuration);
			
			// refinery
			allocRoot = refineryLauncher(configuration.getRefinery(),
					configuration.getRefineryParameters(), allocRoot,
					subMonitor.newChild(1));

			//
			// Before generator
			status = beforeGeneratorWorkflow(configuration, subMonitor,
					selectedObjects, allocRoot);
			if (!status.isOK()) {
				Activator.getDefault().getLog().log(status);
				return status;
			}

			//
			// Generator
			generatorLauncher(configuration.getGenerator(), configuration
					.getDestinationFolder(), configuration
					.getGeneratorParameters(), allocRoot, subMonitor
					.newChild(1));

			//
			// After generator.
			status = afterGeneratorWorkflow(configuration, subMonitor,
					selectedObjects, allocRoot);
			if (!status.isOK()) {
				Activator.getDefault().getLog().log(status);
				return status;
			}

			//
			// Save allocation model if necessary
			if (allocRoot != null && configuration.isSaveAllocationModel()) {
				saveAllocationModel(selectedObjects.iterator().next()
						.eResource(), allocRoot, configuration
						.getDestinationFolder());
			}

		} catch (Exception e) {
			ILog log = Activator.getDefault().getLog();
			Status status = new Status(Status.ERROR, Activator.PLUGIN_ID,
					"Error while generating code", e);
			log.log(status);
			return status;
		}

		return Status.OK_STATUS;
	}

	private static IStatus launchFromEObjectsList(
			CodeManagerConfiguration configuration, SubMonitor subMonitor) {
		List<EObject> selectedObjects = configuration.getInput().getListInput();
		if (selectedObjects.isEmpty()) {
			return Status.OK_STATUS;
		}

		try {
			//
			// Before strategy
			IStatus status = beforeStrategyWorkflow(configuration, subMonitor,
					selectedObjects);
			if (!status.isOK()) {
				Activator.getDefault().getLog().log(status);
				return status;
			}

			//
			// strategy
			Root allocRoot = strategyLauncher(configuration.getStrategy(),
					configuration.getStrategyParameters(), selectedObjects,
					subMonitor.newChild(1));

			//
			// Before refinery
			status = beforeRefineryWorkflow(configuration, subMonitor,
					selectedObjects, allocRoot);
			if (!status.isOK()) {
				Activator.getDefault().getLog().log(status);
				return status;
			}

			//set Libaries helper
			setLibrariesHelper(configuration);
			
			// refinery
			allocRoot = refineryLauncher(configuration.getRefinery(),
					configuration.getRefineryParameters(), allocRoot,
					subMonitor.newChild(1));

			//
			// Before generator
			status = beforeGeneratorWorkflow(configuration, subMonitor,
					selectedObjects, allocRoot);
			if (!status.isOK()) {
				Activator.getDefault().getLog().log(status);
				return status;
			}

			//
			// Generator
			generatorLauncher(configuration.getGenerator(), configuration
					.getDestinationFolder(), configuration
					.getGeneratorParameters(), allocRoot, subMonitor
					.newChild(1));

			//
			// After generator.
			status = afterGeneratorWorkflow(configuration, subMonitor,
					selectedObjects, allocRoot);
			if (!status.isOK()) {
				Activator.getDefault().getLog().log(status);
				return status;
			}

			//
			// Save allocation model if necessary
			if (allocRoot != null && configuration.isSaveAllocationModel()) {
				saveAllocationModel(selectedObjects.iterator().next()
						.eResource(), allocRoot, configuration
						.getDestinationFolder());
			}

		} catch (Exception e) {
			ILog log = Activator.getDefault().getLog();
			Status status = new Status(Status.ERROR, Activator.PLUGIN_ID,
					"Error while generating code", e);
			log.log(status);
			return status;
		}

		return Status.OK_STATUS;
	}

	private static void setLibrariesHelper(
			CodeManagerConfiguration configuration) {
		
		LibraryRuntimeHelper.INSTANCE.setLibraries(configuration.getLibraries());
		String missing =  configuration.getNoFound();
		if(missing == null || missing == ""){
			LibraryRuntimeHelper.INSTANCE.setMissing(configuration.getStrategy(), configuration.getStrategyParameters());
		}else{
			LibraryRuntimeHelper.INSTANCE.setMissing(missing);
		}
		
	}

	private static IStatus beforeStrategyWorkflow(
			CodeManagerConfiguration configuration,
			IProgressMonitor subMonitor, List<EObject> selectedObjects)
			throws Exception {
		GenericParameter<List<EObject>> semanticModel = new GenericParameter<List<EObject>>(
				SEMANTIC_MODEL_PARAM_NAME, selectedObjects,
				SEMANTIC_MODEL_PARAM_DESCRIPTION);
		GenericParameter<String> generationPath = new GenericParameter<String>(
				GENERATION_DIRECTORY_PATH_PARAM_NAME, configuration
						.getDestinationFolder().toString(),
				GENERATION_DIRECTORY_PATH_PARAM_DESCRIPTION);
		WorkflowActivityParameter beforeStrategyActvities = configuration
				.getCodeManagerCadenceLaunchConfiguration()
				.getBeforeStrategyActivities();
		for (String activityID : beforeStrategyActvities.getActivitiesID()) {
			beforeStrategyActvities.addParameter(activityID, semanticModel);
			beforeStrategyActvities.addParameter(activityID, generationPath);
		}
		IStatus status = CadenceLauncher.cadence(COMPOSER_WORKFLOW_ID,
				COMPOSER_WORKFLOW_BEFORE_STRATEGY_ID, beforeStrategyActvities);
		subMonitor.worked(beforeStrategyActvities.getActivitiesID().size());
		return status;
	}

	private static IStatus beforeRefineryWorkflow(
			CodeManagerConfiguration configuration,
			IProgressMonitor subMonitor, List<EObject> selectedObjects,
			Root allocRoot_p) throws Exception {
		IStatus status;
		GenericParameter<List<EObject>> semanticModel = new GenericParameter<List<EObject>>(
				SEMANTIC_MODEL_PARAM_NAME, selectedObjects,
				SEMANTIC_MODEL_PARAM_DESCRIPTION);
		GenericParameter<String> generationPath = new GenericParameter<String>(
				GENERATION_DIRECTORY_PATH_PARAM_NAME, configuration
						.getDestinationFolder().toString(),
				GENERATION_DIRECTORY_PATH_PARAM_DESCRIPTION);
		GenericParameter<EObject> allocationModel = new GenericParameter<EObject>(
				ALLOCATION_MODEL_PARAM_NAME, allocRoot_p,
				ALLOCATION_MODEL_PARAM_DESCRIPTION);
		WorkflowActivityParameter beforeRefineryActivities = configuration
				.getCodeManagerCadenceLaunchConfiguration()
				.getBeforeRefineryActivities();
		for (String activityID : beforeRefineryActivities.getActivitiesID()) {
			beforeRefineryActivities.addParameter(activityID, semanticModel);
			beforeRefineryActivities.addParameter(activityID, allocationModel);
			beforeRefineryActivities.addParameter(activityID, generationPath);
		}
		status = CadenceLauncher.cadence(COMPOSER_WORKFLOW_ID,
				COMPOSER_WORKFLOW_BEFORE_REFINERY_ID, beforeRefineryActivities);
		subMonitor.worked(beforeRefineryActivities.getActivitiesID().size());
		return status;
	}

	private static IStatus beforeGeneratorWorkflow(
			CodeManagerConfiguration configuration, SubMonitor subMonitor,
			List<EObject> selectedObjects, Root allocRoot) throws Exception {
		IStatus status;
		GenericParameter<List<EObject>> semanticModel = new GenericParameter<List<EObject>>(
				SEMANTIC_MODEL_PARAM_NAME, selectedObjects,
				SEMANTIC_MODEL_PARAM_DESCRIPTION);
		GenericParameter<String> generationPath = new GenericParameter<String>(
				GENERATION_DIRECTORY_PATH_PARAM_NAME, configuration
						.getDestinationFolder().toString(),
				GENERATION_DIRECTORY_PATH_PARAM_DESCRIPTION);
		GenericParameter<EObject> allocationModel = new GenericParameter<EObject>(
				ALLOCATION_MODEL_PARAM_NAME, allocRoot,
				ALLOCATION_MODEL_PARAM_DESCRIPTION);
		WorkflowActivityParameter beforeGenerationActivities = configuration
				.getCodeManagerCadenceLaunchConfiguration()
				.getBeforeGenerationActivities();
		for (String activityID : beforeGenerationActivities.getActivitiesID()) {
			beforeGenerationActivities.addParameter(activityID, semanticModel);
			beforeGenerationActivities
					.addParameter(activityID, allocationModel);
			beforeGenerationActivities.addParameter(activityID, generationPath);
		}
		status = CadenceLauncher.cadence(COMPOSER_WORKFLOW_ID,
				COMPOSER_WORKFLOW_BEFORE_GENERATION_ID,
				beforeGenerationActivities);
		subMonitor.worked(beforeGenerationActivities.getActivitiesID().size());
		return status;
	}

	private static IStatus afterGeneratorWorkflow(
			CodeManagerConfiguration configuration, SubMonitor subMonitor,
			List<EObject> selectedObjects, Root allocRoot) throws Exception {
		IStatus status;
		GenericParameter<List<EObject>> semanticModel = new GenericParameter<List<EObject>>(
				SEMANTIC_MODEL_PARAM_NAME, selectedObjects,
				SEMANTIC_MODEL_PARAM_DESCRIPTION);
		GenericParameter<String> generationPath = new GenericParameter<String>(
				GENERATION_DIRECTORY_PATH_PARAM_NAME, configuration
						.getDestinationFolder().toString(),
				GENERATION_DIRECTORY_PATH_PARAM_DESCRIPTION);
		GenericParameter<EObject> allocationModel = new GenericParameter<EObject>(
				ALLOCATION_MODEL_PARAM_NAME, allocRoot,
				ALLOCATION_MODEL_PARAM_DESCRIPTION);
		WorkflowActivityParameter afterGenerationActivities = configuration
				.getCodeManagerCadenceLaunchConfiguration()
				.getAfterGenerationActivities();
		for (String activityID : afterGenerationActivities.getActivitiesID()) {
			afterGenerationActivities.addParameter(activityID, semanticModel);
			afterGenerationActivities.addParameter(activityID, allocationModel);
			afterGenerationActivities.addParameter(activityID, generationPath);
		}
		status = CadenceLauncher.cadence(COMPOSER_WORKFLOW_ID,
				COMPOSER_WORKFLOW_AFTER_GENERATION_ID,
				afterGenerationActivities);
		subMonitor.worked(afterGenerationActivities.getActivitiesID().size());
		return status;
	}

	private static Root strategyLauncher(IStrategy strategy,
			Map<String, Parameter> strategyParameters, List<EObject> objects,
			IProgressMonitor progressMonitor) throws Exception {
		Root allocRoot_p = null;

		if (objects != null && strategy != null) {
			EObject root = null;
			if (!objects.isEmpty()) {
				root = EcoreUtil.getRootContainer(objects.iterator().next());
			}
			if (strategyParameters != null) {
				wrongParams = strategy.validateParameters(strategyParameters);
				if (wrongParams != null && !wrongParams.isEmpty()) {
					throw new Exception("strategy's parameters are not valid. "
							+ getParameterErrorsTrace(wrongParams));
				}
			}
			if (strategy instanceof IStrategyWithProgress) {
				allocRoot_p = ((IStrategyWithProgress) strategy)
						.allocateModelElements(root, strategyParameters,
								objects, progressMonitor);
			} else {
				allocRoot_p = strategy.allocateModelElements(root,
						strategyParameters, objects);
			}
		}

		return allocRoot_p;
	}

	private static Root strategyLauncher(IStrategy strategy,
			Map<String, Parameter> strategyParameters, EObject root,
			IProgressMonitor progressMonitor) throws Exception {
		Root allocRoot_p = null;

		if (root != null && strategy != null) {
			if (strategyParameters != null) {
				wrongParams = strategy.validateParameters(strategyParameters);
				if (wrongParams != null && !wrongParams.isEmpty()) {
					throw new Exception("strategy's parameters are not valid. "
							+ getParameterErrorsTrace(wrongParams));
				}
			}
			if (strategy instanceof IStrategyWithProgress) {
				allocRoot_p = ((IStrategyWithProgress) strategy)
						.allocateModelElements(root, strategyParameters,
								progressMonitor);
			} else {
				allocRoot_p = strategy.allocateModelElements(root,
						strategyParameters);
			}
		}

		return allocRoot_p;
	}

	private static Root refineryLauncher(IRefinery refinery,
			Map<String, Parameter> refineryParameters, Root allocRoot_p,
			IProgressMonitor progressMonitor) throws Exception {
		if (allocRoot_p != null && refinery != null) {

			if (refineryParameters != null) {
				wrongParams = refinery.validateParameters(refineryParameters);
				if (wrongParams != null && !wrongParams.isEmpty()) {
					throw new Exception("refinery's parameters are not valid. "
							+ getParameterErrorsTrace(wrongParams));
				}
			}
			if (refinery instanceof IRefineryWithProgress) {
				((IRefineryWithProgress) refinery).refineModelElements(
						allocRoot_p, refineryParameters, progressMonitor);
			} else {
				allocRoot_p = refinery.refineModelElements(allocRoot_p,
						refineryParameters);
			}
		}
		return allocRoot_p;
	}

	private static void generatorLauncher(final IGenerator generator,
			final IPath path_f, final Map<String, Parameter> generatorParams_p,
			Root allocRoot_p, IProgressMonitor monitor) throws Exception {

		if (allocRoot_p != null && generator != null) {

			if (generatorParams_p != null) {
				wrongParams = generator.validateParameters(generatorParams_p);
				if (wrongParams != null && !wrongParams.isEmpty()) {
					throw new Exception(
							"generator's parameters are not valid. "
									+ getParameterErrorsTrace(wrongParams));
				}
			}
			if (generator instanceof IGeneratorWithProgress) {
				((IGeneratorWithProgress) generator).generateCode(allocRoot_p,
						generatorParams_p, path_f, monitor);
			} else {
				generator.generateCode(allocRoot_p, generatorParams_p, path_f);
			}
		}

	}

	public static CodeManagerConfiguration createLaunchConfiguration(
			final IStrategy strategy,
			final Map<String, Parameter> strategyParams_p,
			final IRefinery refinery,
			final Map<String, Parameter> refineryParams_p,
			final IGenerator generator, final IPath path_p,
			final Map<String, Parameter> generatorParams_p,
			final ICodeManagerInput input,
			final CodeManagerCadenceLaunchConfiguration cadenceConfig,
			boolean save) {

		CodeManagerConfiguration codeManagerConfiguration = new CodeManagerConfiguration();

		codeManagerConfiguration
				.setCodeManagerCadenceLaunchConfiguration(cadenceConfig);
		codeManagerConfiguration.setStrategy(strategy);
		codeManagerConfiguration.setStrategyParameters(strategyParams_p);
		codeManagerConfiguration.setRefinery(refinery);
		codeManagerConfiguration.setRefineryParameters(refineryParams_p);
		codeManagerConfiguration.setGenerator(generator);
		codeManagerConfiguration.setGeneratorParameters(generatorParams_p);
		codeManagerConfiguration.setDestinationFolder(path_p);
		codeManagerConfiguration.setInput(input);
		codeManagerConfiguration.setSaveAllocationModel(save);

		return codeManagerConfiguration;

	}
	
	public static CodeManagerConfiguration createLaunchConfiguration(
			final IStrategy strategy,
			final Map<String, Parameter> strategyParams_p,
			final IRefinery refinery,
			final Map<String, Parameter> refineryParams_p,
			final IGenerator generator, final IPath path_p,
			final Map<String, Parameter> generatorParams_p,
			final List<org.polarsys.kitalpha.resourcereuse.model.Resource> libraries,
			final String missingLib,
			final ICodeManagerInput input,
			final CodeManagerCadenceLaunchConfiguration cadenceConfig,
			boolean save) {

		CodeManagerConfiguration codeManagerConfiguration = new CodeManagerConfiguration();

		codeManagerConfiguration
				.setCodeManagerCadenceLaunchConfiguration(cadenceConfig);
		codeManagerConfiguration.setStrategy(strategy);
		codeManagerConfiguration.setStrategyParameters(strategyParams_p);
		codeManagerConfiguration.setRefinery(refinery);
		codeManagerConfiguration.setRefineryParameters(refineryParams_p);
		codeManagerConfiguration.setGenerator(generator);
		codeManagerConfiguration.setGeneratorParameters(generatorParams_p);
		codeManagerConfiguration.setDestinationFolder(path_p);
		codeManagerConfiguration.setLibraries(libraries);
		codeManagerConfiguration.setNoFound(missingLib);
		codeManagerConfiguration.setInput(input);
		codeManagerConfiguration.setSaveAllocationModel(save);

		return codeManagerConfiguration;

	}
	

	public static IStatus launch(IStrategy strategy,
			Map<String, Parameter> strategyParams_p, IRefinery refinery,
			Map<String, Parameter> refineryParams_p, IGenerator generator,
			IPath path_p, Map<String, Parameter> generatorParams_p,
			List<org.polarsys.kitalpha.resourcereuse.model.Resource> libraries,
			String missingLib, Resource resource,
			CodeManagerCadenceLaunchConfiguration cadenceConfig, boolean save) {
		
		CodeManagerConfiguration codeManagerConfiguration = createLaunchConfiguration(
				strategy, strategyParams_p, refinery, refineryParams_p,
				generator, path_p, generatorParams_p,libraries,missingLib, CodeManagerInputFactory
						.create(resource), cadenceConfig, save);
		return launchWithProgress(codeManagerConfiguration, new NullProgressMonitor());

		
		
	}

}
