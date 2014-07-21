/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation.
 *******************************************************************************/


package org.polarsys.kitalpha.composer.api.configuration;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;

import org.polarsys.kitalpha.cadence.core.api.CadenceRegistry;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;
import org.polarsys.kitalpha.composer.api.CodeManagerCadenceLaunchConfiguration;
import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.api.library.LibraryReuseHelper;
import org.polarsys.kitalpha.composer.api.profiles.ComposerProfile;
import org.polarsys.kitalpha.composer.api.profiles.ParameterProfileElement;
import org.polarsys.kitalpha.composer.api.profiles.ParameterizedProfileElement;
import org.polarsys.kitalpha.composer.extension.points.CodeManagerExtensions;
import org.polarsys.kitalpha.composer.extension.points.IGenerator;
import org.polarsys.kitalpha.composer.extension.points.IRefinery;
import org.polarsys.kitalpha.composer.extension.points.IStrategy;
import org.polarsys.kitalpha.composer.extension.points.ParameterizedComposerElement;

/**
 * @author Yann Mortier
 * 
 */
public final class ConfigurationFactory {

	private static final ConfigurationFactory INSTANCE = new ConfigurationFactory();

	private ConfigurationFactory() {
		// empty
	}

	public static ConfigurationFactory getInstance() {
		return INSTANCE;
	}

	public CodeManagerConfiguration create(ComposerProfile profile) throws CoreException {

		CodeManagerConfiguration configuration = new CodeManagerConfiguration();

		//
		// strategy
		configuration.setStrategy((IStrategy) CodeManagerExtensions
				.getStrategyConfigElementFromId(profile.getStrategy().getId())
				.createExecutableExtension(CodeManagerExtensions.ATT_CLASS));
		initializeComposerParameter(configuration.getStrategyParameters(),
				profile.getStrategy(), configuration.getStrategy());

		//
		// refinery
		configuration.setRefinery((IRefinery) CodeManagerExtensions
				.getRefineryConfigElementFromId(profile.getRefinery().getId())
				.createExecutableExtension(CodeManagerExtensions.ATT_CLASS));
		initializeComposerParameter(configuration.getRefineryParameters(),
				profile.getRefinery(), configuration.getRefinery());

		//
		// generator
		configuration
				.setGenerator((IGenerator) CodeManagerExtensions
						.getGeneratorConfigElementFromId(
								profile.getGenerator().getId())
						.createExecutableExtension(
								CodeManagerExtensions.ATT_CLASS));
		initializeComposerParameter(configuration.getGeneratorParameters(),
				profile.getGenerator(), configuration.getGenerator());

		//libraries
		configuration.setLibraries(LibraryReuseHelper.INSTANCE.getResourcesFromIds(profile.getLibraries()));
		// TODO:path for missing Lib ?
		
	
		// cadence configuration
		configuration
				.setCodeManagerCadenceLaunchConfiguration(createCadenceConfiguration(profile));

		return configuration;
	}

	private CodeManagerCadenceLaunchConfiguration createCadenceConfiguration(
			ComposerProfile profile) {

		CodeManagerCadenceLaunchConfiguration cadenceConfiguration = new CodeManagerCadenceLaunchConfiguration();

		//
		// Before strategy
		createCadenceActivities(profile.getBeforeStrategyActivities(),
				cadenceConfiguration.getBeforeStrategyActivities());

		//
		// Before refinery
		createCadenceActivities(profile.getBeforeRefineryActivities(),
				cadenceConfiguration.getBeforeRefineryActivities());

		//
		// Before generator
		createCadenceActivities(profile.getBeforeGeneratorActivities(),
				cadenceConfiguration.getBeforeGenerationActivities());

		//
		// After generator.
		createCadenceActivities(profile.getAfterGeneratorActivities(),
				cadenceConfiguration.getAfterGenerationActivities());

		return cadenceConfiguration;

	}

	private void initializeComposerParameter(Map<String, Parameter> target,
			ParameterizedProfileElement profileElement,
			ParameterizedComposerElement composerElement) {
		if (composerElement.getParameters() == null)
			return;
		for (Entry<String, Parameter> parameter : composerElement
				.getParameters().entrySet()) {
			Parameter parameterObj = parameter.getValue();
			target.put(parameter.getKey(), new Parameter(
					parameterObj.getName(), parameterObj.getValue(),
					parameterObj.getDescription()));
		}
		for (ParameterProfileElement parameterProfileElement : profileElement
				.getParameters()) {
			Parameter parameter = target.get(parameterProfileElement.getName());
			if (parameter != null) {
				parameter.setValue(parameterProfileElement.getValue());
			} else {
				// FIXME Report error.
			}
		}
	}

	private void createCadenceActivities(
			Iterable<ParameterizedProfileElement> elements,
			WorkflowActivityParameter activities) {
		for (ParameterizedProfileElement activity : elements) {
			activities.addActivity(activity.getId());
			ActivityParameters activityParameters = new ActivityParameters();
			
			Collection<DeclaredParameter> natifParameters = CadenceRegistry.getIActivityClassFromId(activity.getId()).getParameters();
			if(natifParameters != null){
				for(DeclaredParameter natifParameter : natifParameters ){
					activityParameters.addParameter(natifParameter);
				}
			}
			
			for (ParameterProfileElement parameterProfileElement : activity
					.getParameters()) {
				GenericParameter<String> parameter = new GenericParameter<String>(
						parameterProfileElement.getName(),
						parameterProfileElement.getValue(), "");
				activityParameters.addParameter(parameter);
		
			}
			
			activities.addParameter(activity.getId(), activityParameters);
			
		}
		
		
	}
}
