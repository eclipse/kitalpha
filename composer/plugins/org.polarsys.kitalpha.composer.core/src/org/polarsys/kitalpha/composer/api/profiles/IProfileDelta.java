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


package org.polarsys.kitalpha.composer.api.profiles;

/**
 * Defines a profile delta (for {@link IComposerProfileRegistry}).
 * 
 * @author Yann Mortier
 */
public interface IProfileDelta {

	/**
	 * When a profile is added.
	 */
	int ADDED = 0;
	/**
	 * When a profile is removed.
	 */
	int REMOVED = 1;

	/**
	 * Returns the kind of the delta. The value is {@link #ADDED} or
	 * {@link #REMOVED}.
	 * 
	 * @return the kind of the delta.
	 */
	int getKind();

	/**
	 * Returns the affected profile.
	 * 
	 * @return the affected profile.
	 */
	ComposerProfile getAffectedProfile();

}