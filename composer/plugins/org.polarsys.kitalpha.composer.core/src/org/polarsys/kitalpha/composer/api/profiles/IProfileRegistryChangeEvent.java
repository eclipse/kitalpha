/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
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