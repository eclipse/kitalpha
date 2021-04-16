/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.internal.standalone;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.polarsys.kitalpha.cadence.core.api.CadenceRegistry;
import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;
import org.polarsys.kitalpha.composer.Activator;
import org.polarsys.kitalpha.composer.api.CodeManagerCadenceLaunchConfiguration;
import org.polarsys.kitalpha.composer.api.CodeManagerLauncher;
import org.polarsys.kitalpha.composer.api.CodeManagerRegistry;
import org.polarsys.kitalpha.composer.api.ICodeManagerWorkflowConstants;
import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.api.library.LibraryReuseHelper;
import org.polarsys.kitalpha.composer.api.path.ComposerPathUtils;
import org.polarsys.kitalpha.composer.extension.points.IGenerator;
import org.polarsys.kitalpha.composer.extension.points.IRefinery;
import org.polarsys.kitalpha.composer.extension.points.IStrategy;

/**
 * This class allows to launch Composer in standalone mode
 * 
 * @author Guillaume Gebhart
 * 
 */
public class CodeManagerApplication implements IApplication {

	IProject project;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
	 */
	@Override
	public Object start(IApplicationContext context) throws Exception {

		// get args
		System.out.print("Launching Composer in standalone mode"); ////$NON-NLS-1$
		
		String[] args = (String[]) context.getArguments().get(
				IApplicationContext.APPLICATION_ARGS);

		final String model_path = args[0]; // model absolute path path
		final String composer_property_path = args[1]; // composer properties
		
		System.out.println("Reading properties file"); ////$NON-NLS-1$
		
		Properties properties = new Properties();
		FileInputStream stream = null;
		try {
		    stream = new FileInputStream(composer_property_path); 
		    properties.load(stream);

			final String gen_path0 = properties
					.getProperty(IStandaloneConstants.GENERATOR_PATH);
	
			
			System.out.println("Creation temporary project");
			
			// creating a linked project (environment)
			final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
	
			project = root.getProject("External Files"); //$NON-NLS-1$
	
			if (!project.exists()) {
				project.create(null);
			}
			if (!project.isOpen()) {
				project.open(null);
			}
	
			
			
			File model_f = new File(model_path);
			
			final String gen_path = ComposerPathUtils.pathVariablesDecode(gen_path0, model_f);
			
			File file = new File(gen_path);
			IPath location = new Path(file.getPath());
			IFolder gen_f = project.getFolder(location.lastSegment());
			if (!gen_f.exists()){
				
				if(!file.exists()){
					file.mkdirs();
				}
				
				gen_f.createLink(file.toURI(), IResource.NONE, null);
			}
			
			IStatus status = createLaunchConfig(properties, model_f, gen_f);
			project.delete(true, new NullProgressMonitor());
			return status.isOK() ? IApplication.EXIT_OK : IApplicationContext.EXIT_ASYNC_RESULT;
		} finally {
			if (null != stream) {
				stream.close();
			}
		}
		
	}

	/**
	 * Allows to create the launch configuration
	 * 
	 * @param properties_p :
	 *            properties file
	 * @param model_file_p :
	 *            model file
	 * @param gen_folder_p :
	 *            generation folder
	 * @throws Exception
	 */
	private IStatus createLaunchConfig(final Properties properties_p,
			final File model_file_p, final IFolder gen_folder_p)
			throws Exception {
		System.out.println("Building the composer launch configuration");
		final String strategyId = properties_p
				.getProperty(IStandaloneConstants.STRATEGY_ID);
		System.out.println("The strategy is : "+ strategyId);
		final IStrategy strategy = CodeManagerRegistry
				.getStrategyFromId(strategyId);
		
		System.out.println("Retrieve parameters of the strategy");
		
		Map<String, Parameter> strategyParams = strategy.getParameters();
		
		if (strategyParams != null && !strategyParams.isEmpty())
		 {
			strategyParams = setParameters(properties_p, strategyParams,
					"strategy"); //$NON-NLS-1$
		}

		final String refineryId = properties_p
				.getProperty(IStandaloneConstants.REFINERY_ID);
		System.out.println("The refinery is : "+ refineryId);
		
		final IRefinery refinery = CodeManagerRegistry
				.getRefineryFromId(refineryId);

		System.out.println("Retrieve parameters of the refinry");
		
		Map<String, Parameter> refineryParams = refinery.getParameters();

		if (refineryParams != null && !refineryParams.isEmpty())
		 {
			refineryParams = setParameters(properties_p, refineryParams,
					"refinery"); //$NON-NLS-1$
		}

		final String generatorId = properties_p
				.getProperty(IStandaloneConstants.GENERATOR_ID);
		
		System.out.println("The generator is : "+ generatorId);
		
		final IGenerator generator = CodeManagerRegistry
				.getGeneratorFromId(generatorId);

		Map<String, Parameter> generatorParams = generator.getParameters();

		System.out.println("Retrieve parameters of the generator");
		
		if (generatorParams != null && !generatorParams.isEmpty())
		 {
			generatorParams = setParameters(properties_p, generatorParams,
					"generator"); //$NON-NLS-1$
		}
		
		//Libraries
		
		
		
		final String missingLib = properties_p
		.getProperty(IStandaloneConstants.MISSING_LIB_PATH);
		
		System.out.println("Retrieve libraries used");
		
		final String libraries = properties_p
		.getProperty(IStandaloneConstants.SELECTED_LIBRARIES);
		
		List<org.polarsys.kitalpha.resourcereuse.model.Resource> selectedLibs = getLibraries(libraries);
		
		final Resource resource = getModelResource(model_file_p);

		final CodeManagerCadenceLaunchConfiguration cadenceConfig = setCadenceConfiguration(properties_p);
		
		System.out.println("end of the construction of the Composer launch configuration");
		
		System.out.println("Execution of the generation plan");
		IStatus status = CodeManagerLauncher.launch(strategy, strategyParams, refinery,
				refineryParams, generator, gen_folder_p.getFullPath(),
				generatorParams, selectedLibs, missingLib, resource, cadenceConfig, false);
		
		System.out.println("End of the execution of the generation plan");
		
		System.out.println("-----------");
		System.out.println("- results -");
		System.out.println("-----------");
		if(status.isOK()){
			System.out.println("SUCCESS");
			
		}else{
			System.err.println("ERROR");
			System.err.println("Severity : "+ status.getSeverity());
			System.err.println("Reason : " + status.getMessage());
		}
		return status;
	}

	/**
	 * Allows to create the Cadence Configuration
	 * 
	 * @param properties_p :
	 *            properties file
	 * @return CodeManagerCadenceLaunchConfiguration
	 */
	private CodeManagerCadenceLaunchConfiguration setCadenceConfiguration(
			final Properties properties_p) {

		final CodeManagerCadenceLaunchConfiguration cadenceConfig = new CodeManagerCadenceLaunchConfiguration();

		WorkflowActivityParameter beforeStrategy = getWorkFlowParameter(
				properties_p,
				ICodeManagerWorkflowConstants.COMPOSER_WORKFLOW_BEFORE_STRATEGY_ID,
				IStandaloneConstants.CADENCE_BEFORE_STRATEGY);
		cadenceConfig.setBeforeStrategyActivities(beforeStrategy);

		WorkflowActivityParameter beforeRefinery = getWorkFlowParameter(
				properties_p,
				ICodeManagerWorkflowConstants.COMPOSER_WORKFLOW_BEFORE_REFINERY_ID,
				IStandaloneConstants.CADENCE_BEFORE_REFINERY);
		cadenceConfig.setBeforeRefineryActivities(beforeRefinery);

		WorkflowActivityParameter beforeGenerator = getWorkFlowParameter(
				properties_p,
				ICodeManagerWorkflowConstants.COMPOSER_WORKFLOW_BEFORE_GENERATION_ID,
				IStandaloneConstants.CADENCE_BEFORE_GENERATOR);
		cadenceConfig.setBeforeGenerationActivities(beforeGenerator);

		WorkflowActivityParameter afterGenerator = getWorkFlowParameter(
				properties_p,
				ICodeManagerWorkflowConstants.COMPOSER_WORKFLOW_AFTER_GENERATION_ID,
				IStandaloneConstants.CADENCE_AFTER_GENERATOR);
		cadenceConfig.setAfterGenerationActivities(afterGenerator);

		return cadenceConfig;
	}

	/**
	 * Allows to create workflowParameter
	 * 
	 * @param properties_p :
	 *            the properties files
	 * @param cadence_workflow_element_id :
	 *            the workflow element id
	 * @param name :
	 *            the standalone constant associed
	 * @return WorkflowActivityParameter
	 */
	private WorkflowActivityParameter getWorkFlowParameter(
			Properties properties_p, String cadence_workflow_element_id,
			String name) {

		String activitiesIds = properties_p.getProperty(name);
		WorkflowActivityParameter wkparameter = new WorkflowActivityParameter();

		if (activitiesIds != null && !activitiesIds.equals("")) { //$NON-NLS-1$

			String[] activitiesTabIds = activitiesIds.split(Pattern.quote(",")); //$NON-NLS-1$

			// get all activities and set parameter
			for (String activityId : activitiesTabIds) {

				wkparameter.addActivity(activityId);
				IActivity activity = CadenceRegistry
						.getIActivityClassFromId(activityId);
				if (activity != null) {
					wkparameter = setParameters(properties_p, activityId,
							activity.getParameters(), wkparameter, name + "." //$NON-NLS-1$
									+ activityId);
				}

			}

		}
		return wkparameter;
	}

	/**
	 * Allows to set set Cadence Parameters
	 * 
	 * @param properties_p :
	 *            properties file
	 * @param activityId :
	 *            activity Id
	 * @param parameters_p :
	 *            the list of the activity's parameters
	 * @param workflowParameter :
	 *            the workflow parameter
	 * @param key_prefix_p :
	 *            the string key in the properties file
	 * @return WorkflowActivityParameter
	 */
	private WorkflowActivityParameter setParameters(Properties properties_p,
			String activityId, Collection<DeclaredParameter> parameters_p,
			WorkflowActivityParameter workflowParameter, String key_prefix_p) {
		if (parameters_p != null) {
			for (DeclaredParameter parameter : parameters_p) {
				final String file_key = key_prefix_p + "."
						+ parameter.getName(); //$NON-NLS-1$
				String value = properties_p.getProperty(file_key);
				parameter.setValue(value);
				workflowParameter.addParameter(activityId, parameter);
			}
		}
		return workflowParameter;
	}

	/**
	 * Allows to load model from file
	 * 
	 * @param file_p :
	 *            java.io file
	 * @return resource
	 */
	private Resource getModelResource(File file_p) {

		Resource resource = null;

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		resource = resourceSet.getResource(URI.createFileURI(file_p.getPath()),
				true);

		return resource;
	}

	/**
	 * Allows to Set Composer parameter
	 * 
	 * @param properties_p :
	 *            properties file
	 * @param params_p :
	 *            the parameters
	 * @param key_prefix_p :
	 *            the string key in the properties file
	 * @return
	 */
	private Map<String, Parameter> setParameters(Properties properties_p,
			Map<String, Parameter> params_p, String key_prefix_p) {

		for (Map.Entry<String, Parameter> paramsEntry: params_p.entrySet()) {
			final String file_key = key_prefix_p + "." + paramsEntry.getKey(); //$NON-NLS-1$
			String value = properties_p.getProperty(file_key);
			Parameter p = paramsEntry.getValue();
			if(value!=null) {
				p.setValue(value);
			}
		}

		return params_p;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	@Override
	public void stop() {
		try {
			project.delete(true, new NullProgressMonitor());
		} catch (CoreException e) {

			Activator.getDefault().getLog().log(
					new Status(IStatus.ERROR, Activator.PLUGIN_ID, e
							.getMessage()));
		}

	}
	
	private List<org.polarsys.kitalpha.resourcereuse.model.Resource> getLibraries(final String libraries){
		List<org.polarsys.kitalpha.resourcereuse.model.Resource> result = new ArrayList<org.polarsys.kitalpha.resourcereuse.model.Resource>();
		if(libraries != null && (!libraries.equals(""))){
		String[] tab = libraries.split(";");	
		result = LibraryReuseHelper.INSTANCE.getResourcesFromIds(Arrays.asList(tab));
		}
		return result;
	}

}
