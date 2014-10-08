/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
	public void registryChanged(IProfileRegistryChangeEvent event);

}
