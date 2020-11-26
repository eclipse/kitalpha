/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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
 * Listener notifies when profiles are added or removed from
 * {@link IComposerProfileRegistry}.
 * 
 * @author Yann Mortier
 */
public interface IProfileRegistryChangeListener {

	/**
	 * Notifies this listener that some registry changes are happening, or have
	 * already happened.
	 * <p>
	 * The supplied event gives details. This event object (and the deltas in
	 * it) is valid only for the duration of the invocation of this method.
	 * </p>
	 * 
	 * @param event
	 *            the registry change event
	 */
	 void registryChanged(IProfileRegistryChangeEvent event);

}
