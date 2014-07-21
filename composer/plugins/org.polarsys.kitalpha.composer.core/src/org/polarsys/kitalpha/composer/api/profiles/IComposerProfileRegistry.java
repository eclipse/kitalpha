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


package org.polarsys.kitalpha.composer.api.profiles;

import java.util.Set;

import org.polarsys.kitalpha.composer.internal.profiles.ComposerProfileRegistry;

/**
 * Defines the behavior of a profiles registry.
 * 
 * @author Yann Mortier
 */
public interface IComposerProfileRegistry {

	/**
	 * The default instance.
	 */
	IComposerProfileRegistry INSTANCE = new ComposerProfileRegistry();

	/**
	 * Registers the given profile. The invocation has no effect if the given
	 * profile is already registered.
	 * 
	 * @param profile
	 *            the profile to register.
	 */
	void register(ComposerProfile profile);

	/**
	 * Unregisters the given profile. Does nothing if the given profile is not
	 * registered.
	 * 
	 * @param profile
	 *            the profile to unregister.
	 */
	void unregister(ComposerProfile profile);

	/**
	 * Returns all registered profiles. <strong>WARNING: the returned set is NOT
	 * modifiable.</strong>
	 * 
	 * @return all registered profiles.
	 */
	Set<ComposerProfile> getAllRegisteredProfiles();

	/**
	 * Returns the profile having the given unique identifier or
	 * <code>null</code> if no profile has the identifier.
	 * 
	 * @param id
	 *            the id of the searched profile.
	 * @return the profile having the given unique identifier or
	 *         <code>null</code> if no profile has the identifier.
	 */
	ComposerProfile getById(String id);

	/**
	 * Returns the profiles for the given allocation namespace URI.
	 * <strong>WARNING: the returned set is NOT modifiable.</strong>
	 * 
	 * @param allocationNsURI
	 *            the allocation namespace URI.
	 * @return the profiles for the given allocation namespace URI.
	 */
	Set<ComposerProfile> getByAllocationNsURI(String allocationNsURI);

	/**
	 * Returns the profiles for the given semantic namespace URI.
	 * <strong>WARNING: the returned set is NOT modifiable.</strong>
	 * 
	 * @param semanticNsURI
	 *            the semantic namespace URI.
	 * @return the profiles for the given allocation semantic URI.
	 */
	Set<ComposerProfile> getBySemanticNsURI(String semanticNsURI);

	/**
	 * Adds the given listener for registry change events. Has no effect if an
	 * identical listener is already registered.
	 * 
	 * @param listener
	 *            the listener
	 */
	void addRegistryChangeListener(IProfileRegistryChangeListener listener);

	/**
	 * Removes the given registry change listener from this registry. Has no
	 * effect if an identical listener is not registered.
	 * 
	 * @param listener
	 *            the listener
	 */
	void removeRegistryChangeListener(IProfileRegistryChangeListener listener);

}