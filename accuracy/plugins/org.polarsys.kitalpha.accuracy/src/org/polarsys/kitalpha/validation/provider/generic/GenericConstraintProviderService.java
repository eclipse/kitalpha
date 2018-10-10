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
package org.polarsys.kitalpha.validation.provider.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.validation.preferences.EMFModelValidationPreferences;
import org.eclipse.emf.validation.service.AbstractConstraintDescriptor;
import org.eclipse.emf.validation.service.ConstraintExistsException;
import org.eclipse.emf.validation.service.ConstraintRegistry;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.emf.validation.service.ModelValidationService;
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
		if (descriptors == null) {
			descriptors = Collections
					.<AbstractConstraintDescriptor> emptyList();
		}
		return descriptors;
	}
	
	  /**
	   * Get all constraints contributed via the EMF Validation framework 
	   * @return {@link List}
	   */
	  public List<IConstraintDescriptor> getAllConstraintDescriptors() {
	    
	    List<IConstraintDescriptor> result = new ArrayList<>();
	    
	    ensureEMFValidationActivation();
	    
	    ConstraintRegistry registry = ConstraintRegistry.getInstance();
	    
	    result.addAll(registry.getAllDescriptors());
	    
	    return result;
	  }
	  
	  
	  
	  /**
	   * Ensure that all constraints have been loaded.
	   */
	  public void ensureEMFValidationActivation() {
	    
	    ModelValidationService.getInstance().loadXmlConstraintDeclarations();
	    
	  }

}
