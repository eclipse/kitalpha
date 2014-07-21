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


package org.polarsys.kitalpha.composer.internal.profiles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionDelta;
import org.eclipse.core.runtime.IRegistryChangeEvent;
import org.eclipse.core.runtime.IRegistryChangeListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

import org.polarsys.kitalpha.composer.Activator;
import org.polarsys.kitalpha.composer.api.profiles.ComposerProfile;
import org.polarsys.kitalpha.composer.api.profiles.IComposerProfileRegistry;
import org.polarsys.kitalpha.composer.api.profiles.IProfileConstants;
import org.polarsys.kitalpha.composer.api.profiles.IProfileDelta;
import org.polarsys.kitalpha.composer.api.profiles.IProfileRegistryChangeListener;
import org.polarsys.kitalpha.composer.api.profiles.ParameterProfileElement;
import org.polarsys.kitalpha.composer.api.profiles.ParameterizedProfileElement;
import org.polarsys.kitalpha.composer.extension.points.CodeManagerExtensions;

/**
 * Registry for composer profiles.
 * 
 * @author Yann Mortier
 */
public class ComposerProfileRegistry implements IComposerProfileRegistry {

	private static final String BINDING_MM_URI_CHILD = "businessMetamodelNsUriDeclaration";

	/**
	 * Maps each allocation NsURI with its corresponding profiles.
	 * 
	 */
	private Map<String, Set<ComposerProfile>> registeredProfiles;

	private boolean enableNotification = true;

	/**
	 * Listeners
	 */
	private Set<IProfileRegistryChangeListener> listeners = new HashSet<IProfileRegistryChangeListener>();

	public ComposerProfileRegistry() {
		registeredProfiles = new HashMap<String, Set<ComposerProfile>>();
		loadFromExtensions();
		Platform.getExtensionRegistry().addRegistryChangeListener(
				new ComposerProfileRegistryListener(), Activator.PLUGIN_ID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.profiles.IComposerProfileRegistry#register(org.polarsys.kitalpha.composer.api.profiles.ComposerProfile)
	 */
	public void register(ComposerProfile profile) {
		Set<ComposerProfile> profiles = this.registeredProfiles.get(profile
				.getAllocationBinding());
		if (profiles == null) {
			profiles = new HashSet<ComposerProfile>();
			this.registeredProfiles.put(profile.getAllocationBinding(),
					profiles);
		}
		if (profiles.add(profile)) {
			IProfileDelta[] deltas = new IProfileDelta[1];
			deltas[0] = new ProfileDelta(IProfileDelta.ADDED, profile);
			fireRegistryChangeEvent(deltas);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.profiles.IComposerProfileRegistry#unregister(org.polarsys.kitalpha.composer.api.profiles.ComposerProfile)
	 */
	public void unregister(ComposerProfile profile) {
		Set<ComposerProfile> profiles = this.registeredProfiles.get(profile
				.getAllocationBinding());
		if (profiles != null) {
			profiles.remove(profile);
			if (profiles.isEmpty()) {
				this.registeredProfiles.remove(profile.getAllocationBinding());
			}
			IProfileDelta[] deltas = new IProfileDelta[1];
			deltas[0] = new ProfileDelta(IProfileDelta.REMOVED, profile);
			fireRegistryChangeEvent(deltas);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.profiles.IComposerProfileRegistry#getAllRegisteredProfiles()
	 */
	public Set<ComposerProfile> getAllRegisteredProfiles() {
		Set<ComposerProfile> result = new HashSet<ComposerProfile>();
		for (Set<ComposerProfile> profiles : this.registeredProfiles.values()) {
			result.addAll(profiles);
		}
		return Collections.unmodifiableSet(result);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.profiles.IComposerProfileRegistry#getById(java.lang.String)
	 */
	public ComposerProfile getById(String id) {
		for (ComposerProfile composerProfile : getAllRegisteredProfiles()) {
			if (composerProfile.getId().equals(id))
				return composerProfile;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.profiles.IComposerProfileRegistry#getByAllocationNsURI(java.lang.String)
	 */
	public Set<ComposerProfile> getByAllocationNsURI(String allocationNsURI) {
		Set<ComposerProfile> result = this.registeredProfiles
				.get(allocationNsURI);
		if (result == null)
			return Collections.<ComposerProfile> emptySet();

		return Collections.unmodifiableSet(result);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.profiles.IComposerProfileRegistry#getBySemanticNsURI(java.lang.String)
	 */
	public Set<ComposerProfile> getBySemanticNsURI(String semanticNsURI) {
		//
		// All corresponding allocations namespace uris.
		Collection<String> allocationNsUris = new HashSet<String>();

		for (IConfigurationElement bindingElement : CodeManagerExtensions
				.getAllBindingExtensions()) {
			for (IConfigurationElement businessMMUriDeclaration : bindingElement
					.getChildren(BINDING_MM_URI_CHILD)) {
				final String uri = businessMMUriDeclaration
						.getAttribute(CodeManagerExtensions.ATT_URI);
				if (uri.equals(semanticNsURI)) {
					allocationNsUris.add(bindingElement
							.getAttribute(CodeManagerExtensions.ATT_URI));
				}
			}
		}
		Set<ComposerProfile> result = new HashSet<ComposerProfile>();
		for (String allocationNsUri : allocationNsUris) {
			result.addAll(getByAllocationNsURI(allocationNsUri));
		}
		return Collections.unmodifiableSet(result);
	}

	/**
	 * Loads all composer profiles from platform extension registry.
	 */
	private void loadFromExtensions() {
		for (IExtension extension : Platform.getExtensionRegistry()
				.getExtensionPoint(IProfileConstants.POINT_ID).getExtensions()) {

			for (IConfigurationElement configurationElement : extension
					.getConfigurationElements()) {
				if (IProfileConstants.CONFIGURATION_ELEMENT_NAME
						.equals(configurationElement.getName())) {
					registerProfile(configurationElement);
				}
			}
		}
	}

	private void registerProfile(IConfigurationElement configurationElement) {
		ComposerProfile composerProfile = new ComposerProfile();
		composerProfile.setId(configurationElement
				.getAttribute(IProfileConstants.ID_ATTRIBUTE));
		composerProfile.setName(configurationElement
				.getAttribute(IProfileConstants.PROFILE_NAME_ATTRIBUTE));
		composerProfile.setAllocationBinding(configurationElement
				.getAttribute(IProfileConstants.ALLOCATION_BINDING_ATTRIBUTE));

		composerProfile.setAllocationBindingId(configurationElement
				.getAttribute(IProfileConstants.ALLOCATION_BINDING_ID_ATTRIBUTE));
		//
		// strategy
		IConfigurationElement[] strategy = configurationElement
				.getChildren(IProfileConstants.STRATEGY_CONFIGURATION_ELEMENT_NAME);
		if (strategy.length != 1) {
			invalidProfile(composerProfile.getName());
			return;
		}
		composerProfile
				.setStrategy(createParameterizedProfileElement(strategy[0]));

		//
		// refinery
		IConfigurationElement[] refinery = configurationElement
				.getChildren(IProfileConstants.REFINERY_CONFIGURATION_ELEMENT_NAME);
		if (refinery.length != 1) {
			invalidProfile(composerProfile.getName());
			return;
		}
		composerProfile
				.setRefinery(createParameterizedProfileElement(refinery[0]));

		//
		// generator
		IConfigurationElement[] generator = configurationElement
				.getChildren(IProfileConstants.GENERATOR_CONFIGURATION_ELEMENT_NAME);
		if (generator.length != 1) {
			invalidProfile(composerProfile.getName());
			return;
		}
		composerProfile
				.setGenerator(createParameterizedProfileElement(generator[0]));

		//
		// Cadence activities
		createCadenceActivities(composerProfile, configurationElement);

		
		//libraries
		createLibraries(composerProfile, configurationElement);
		
		
		
		//
		// register
		this.register(composerProfile);

	}

	private void createLibraries(ComposerProfile composerProfile,
			IConfigurationElement configurationElement) {
		IConfigurationElement[] libraries = configurationElement
		.getChildren(IProfileConstants.LIBRARIES_PACKAGE_ELEMENT_NAME);
		for(IConfigurationElement element : libraries){
		IConfigurationElement[] selectedLib = element.getChildren(IProfileConstants.LIBRARY_CONFIGURATION_ELEMENT_NAME);
		List<String> idLibs = new ArrayList<String>();
		
		for(IConfigurationElement e : selectedLib){
			idLibs.add(e.getAttribute(IProfileConstants.ID_ATTRIBUTE));
		}
		
		composerProfile.setLibraries(idLibs);
		}
	}

	private void createCadenceActivities(ComposerProfile composerProfile,
			IConfigurationElement configurationElement) {
		//
		// Before strategy
		IConfigurationElement[] beforeStrategy = configurationElement
				.getChildren(IProfileConstants.BEFORE_STRATEGY_ACTIVITIES_CONFIGURATION_ELEMENT);
		if (beforeStrategy.length > 1) {
			invalidProfile(composerProfile.getName());
			return;
		} else if (beforeStrategy.length == 1) {
			List<ParameterizedProfileElement> elements = createParameterizedProfileElements(beforeStrategy[0]
					.getChildren(IProfileConstants.CADENCE_ACTIVITY_CONFIGURATION_ELEMENT));
			for (ParameterizedProfileElement activity : elements) {
				composerProfile.getBeforeStrategyActivities().add(activity);
			}
		}

		//
		// Before refinery
		IConfigurationElement[] beforeRefinery = configurationElement
				.getChildren(IProfileConstants.BEFORE_REFINERY_ACTIVITIES_CONFIGURATION_ELEMENT);
		if (beforeRefinery.length > 1) {
			invalidProfile(composerProfile.getName());
			return;
		} else if (beforeRefinery.length == 1) {
			List<ParameterizedProfileElement> elements = createParameterizedProfileElements(beforeRefinery[0]
					.getChildren(IProfileConstants.CADENCE_ACTIVITY_CONFIGURATION_ELEMENT));
			for (ParameterizedProfileElement activity : elements) {
				composerProfile.getBeforeRefineryActivities().add(activity);
			}
		}

		//
		// Before generator
		IConfigurationElement[] beforeGenerator = configurationElement
				.getChildren(IProfileConstants.BEFORE_GENERATOR_ACTIVITIES_CONFIGURATION_ELEMENT);
		if (beforeGenerator.length > 1) {
			invalidProfile(composerProfile.getName());
			return;
		} else if (beforeGenerator.length == 1) {
			List<ParameterizedProfileElement> elements = createParameterizedProfileElements(beforeGenerator[0]
					.getChildren(IProfileConstants.CADENCE_ACTIVITY_CONFIGURATION_ELEMENT));
			for (ParameterizedProfileElement activity : elements) {
				composerProfile.getBeforeGeneratorActivities().add(activity);
			}
		}

		//
		// After generator
		IConfigurationElement[] afterGenerator = configurationElement
				.getChildren(IProfileConstants.AFTER_GENERATOR_ACTIVITIES_CONFIGURATION_ELEMENT);
		if (afterGenerator.length > 1) {
			invalidProfile(composerProfile.getName());
			return;
		} else if (afterGenerator.length == 1) {
			List<ParameterizedProfileElement> elements = createParameterizedProfileElements(afterGenerator[0]
					.getChildren(IProfileConstants.CADENCE_ACTIVITY_CONFIGURATION_ELEMENT));
			for (ParameterizedProfileElement activity : elements) {
				composerProfile.getAfterGeneratorActivities().add(activity);
			}
		}

	}

	private List<ParameterizedProfileElement> createParameterizedProfileElements(
			IConfigurationElement[] elements) {
		List<ParameterizedProfileElement> result = new ArrayList<ParameterizedProfileElement>();
		for (IConfigurationElement element : elements) {
			result.add(createParameterizedProfileElement(element));
		}
		return result;
	}

	private ParameterizedProfileElement createParameterizedProfileElement(
			IConfigurationElement configurationElement) {
		String id = configurationElement
				.getAttribute(IProfileConstants.ID_ATTRIBUTE);
		ParameterizedProfileElement parameterizedProfileElement = new ParameterizedProfileElement(
				id);

		for (IConfigurationElement parameterConfigurationElement : configurationElement
				.getChildren()) {
			if (IProfileConstants.PARAMETER_CONFIGURATION_ELEMENT_NAME
					.equals(parameterConfigurationElement.getName())) {
				String name = parameterConfigurationElement
						.getAttribute(IProfileConstants.PARAMETER_NAME_ATTRIBUTE);
				String value = parameterConfigurationElement
						.getAttribute(IProfileConstants.PARAMETER_VALUE_ATTRIBUTE);
				ParameterProfileElement parameterProfileElement = new ParameterProfileElement(
						name, value);
				parameterizedProfileElement
						.addParameter(parameterProfileElement);
			}
		}
		return parameterizedProfileElement;
	}

	private void invalidProfile(String name) {
		IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
				"Invalid profile: " + name);
		Activator.getDefault().getLog().log(status);
	}

	private class ComposerProfileRegistryListener implements
			IRegistryChangeListener {

		public void registryChanged(IRegistryChangeEvent event) {
			for (IExtensionDelta delta : event.getExtensionDeltas(
					Activator.PLUGIN_ID, IProfileConstants.POINT_ID)) {
				IExtension affectedExtension = delta.getExtension();
				if (delta.getKind() == IExtensionDelta.REMOVED) {
					for (IConfigurationElement element : affectedExtension
							.getConfigurationElements()) {
						if (IProfileConstants.CONFIGURATION_ELEMENT_NAME
								.equals(element.getName())) {
							String profileId = element
									.getAttribute(IProfileConstants.ID_ATTRIBUTE);
							ComposerProfile correspondingProfile = getById(profileId);
							unregister(correspondingProfile);
						}
					}
				} else if (delta.getKind() == IExtensionDelta.ADDED) {
					for (IConfigurationElement configurationElement : affectedExtension
							.getConfigurationElements()) {
						if (IProfileConstants.CONFIGURATION_ELEMENT_NAME
								.equals(configurationElement.getName())) {
							registerProfile(configurationElement);
						}
					}
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.api.profiles.IComposerProfileRegistry#addRegistryChangeListener(org.polarsys.kitalpha.composer.api.profiles.IProfileRegistryChangeListener)
	 */
	public void addRegistryChangeListener(
			IProfileRegistryChangeListener listener) {
		this.listeners.add(listener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.api.profiles.IComposerProfileRegistry#removeRegistryChangeListener(org.polarsys.kitalpha.composer.api.profiles.IProfileRegistryChangeListener)
	 */
	public void removeRegistryChangeListener(
			IProfileRegistryChangeListener listener) {
		this.listeners.remove(listener);
	}

	private void fireRegistryChangeEvent(IProfileDelta[] deltas) {
		if (enableNotification) {
			ProfileRegistryChangeEvent event = new ProfileRegistryChangeEvent(
					this, deltas);
			for (IProfileRegistryChangeListener listener : this.listeners)
				listener.registryChanged(event);
		}
	}
}
