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
	public IProfileDelta[] getDelta() {
		return delta;
	}

	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.api.profiles.IProfileRegistryChangeEvent#getSource()
	 */
	public IComposerProfileRegistry getSource() {
		return source;
	}

}
