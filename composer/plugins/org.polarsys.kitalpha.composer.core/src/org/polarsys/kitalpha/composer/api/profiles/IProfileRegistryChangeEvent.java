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

/**
 * Registry change events describe changes to the profile registry.
 * 
 * @author Yann Mortier
 */
public interface IProfileRegistryChangeEvent {

	/**
	 * Returns the delta with the old state.
	 * 
	 * @return the delta with the old state.
	 */
	IProfileDelta[] getDelta();

	/**
	 * Returns the source registry.
	 * 
	 * @return the source registry.
	 */
	IComposerProfileRegistry getSource();

}