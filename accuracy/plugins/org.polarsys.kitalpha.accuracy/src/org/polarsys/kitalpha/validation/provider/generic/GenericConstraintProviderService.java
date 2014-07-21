/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.validation.provider.generic;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.validation.preferences.EMFModelValidationPreferences;
import org.eclipse.emf.validation.service.AbstractConstraintDescriptor;
import org.eclipse.emf.validation.service.ConstraintExistsException;
import org.eclipse.emf.validation.service.ConstraintRegistry;

import org.polarsys.kitalpha.validation.ocl.provider.generic.GenericOCLConstraintProvider;

/**
 * Service to provide constraints.
 * 
 * @author Yann Mortier
 */
public class GenericConstraintProviderService {

	/** The shared instance. */
	private static final GenericConstraintProviderService INSTANCE = new GenericConstraintProviderService();

	/** All registered providers. */
	private Map<Object, List<? extends AbstractConstraintDescriptor>> registeredProviders = new HashMap<Object, List<? extends AbstractConstraintDescriptor>>();

	/**
	 * Returns the shared instance.
	 * 
	 * @return the shared instance.
	 */
	public static GenericConstraintProviderService getInstance() {
		return INSTANCE;
	}

	/**
	 * Registers the given provider. Do nothing if the provider is already
	 * registered.
	 * 
	 * @param provider
	 *            the provider to register.
	 */
	public void registerProvider(final GenericConstraintProvider provider) {
		if (!registeredProviders.containsKey(provider.getId())) {

			GenericConstraintFactory factory = provider.getConstraintFactory();

			List<? extends AbstractConstraintDescriptor> descriptors = factory
					.createConstraints();

			registeredProviders.put(provider.getId(), descriptors);

			/*
			 * Register all descriptors to the constraint registry.
			 */
			for (final AbstractConstraintDescriptor descriptor : descriptors) {
				try {
					ConstraintRegistry.getInstance().register(descriptor);
					descriptor.setEnabled(!EMFModelValidationPreferences
							.isConstraintDisabled(descriptor.getId()));
				} catch (ConstraintExistsException e) {
					/*
					 * Silent catch.
					 */
				}
			}

		}
	}

	/**
	 * Unregister the given provider. Do nothing is the provider is not
	 * registered.
	 * 
	 * @param provider
	 *            the provider to unregister.
	 */
	public void unregisterProvider(final GenericOCLConstraintProvider provider) {
		if (registeredProviders.containsKey(provider.getId())) {

			for (final AbstractConstraintDescriptor descriptor : getDescriptors(provider)) {
				ConstraintRegistry.getInstance().unregister(descriptor);
			}

			registeredProviders.remove(provider.getId());
		}
	}

	/**
	 * Returns all registered descriptors for the given provider. Returns an
	 * empty list if the provider is not registered.
	 * 
	 * @param provider
	 *            the constraint provider.
	 * @return all registered descriptors for the given provider.
	 */
	public List<? extends AbstractConstraintDescriptor> getDescriptors(
			final GenericConstraintProvider provider) {
		List<? extends AbstractConstraintDescriptor> descriptors = registeredProviders
				.get(provider.getId());
		if (descriptors == null)
			descriptors = Collections
					.<AbstractConstraintDescriptor> emptyList();
		return descriptors;
	}

}
