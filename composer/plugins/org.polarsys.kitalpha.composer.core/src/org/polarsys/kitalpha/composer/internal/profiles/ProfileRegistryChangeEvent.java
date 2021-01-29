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


package org.polarsys.kitalpha.composer.internal.profiles;

import org.polarsys.kitalpha.composer.api.profiles.IComposerProfileRegistry;
import org.polarsys.kitalpha.composer.api.profiles.IProfileDelta;
import org.polarsys.kitalpha.composer.api.profiles.IProfileRegistryChangeEvent;

/**
 * Event sent when the profile registry changes.
 * 
 * @author Yann Mortier
 */
public class ProfileRegistryChangeEvent implements IProfileRegistryChangeEvent {

	/**
	 * The delta.
	 */
	private IProfileDelta[] delta;

	/**
	 * The source.
	 */
	private IComposerProfileRegistry source;

	/**
	 * Creates a new change event with the given source registry and delta.
	 * 
	 * @param source
	 *            the source registry.
	 * @param delta
	 *            the delta.
	 */
	public ProfileRegistryChangeEvent(IComposerProfileRegistry source,
			IProfileDelta[] delta) {
		this.source = source;
		this.delta = delta;
	}

	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.api.profiles.IProfileRegistryChangeEvent#getDelta()
	 */
	@Override
	public IProfileDelta[] getDelta() {
		return delta;
	}

	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.api.profiles.IProfileRegistryChangeEvent#getSource()
	 */
	@Override
	public IComposerProfileRegistry getSource() {
		return source;
	}

}
