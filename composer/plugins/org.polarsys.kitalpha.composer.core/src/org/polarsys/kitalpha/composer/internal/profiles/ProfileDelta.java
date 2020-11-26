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


package org.polarsys.kitalpha.composer.internal.profiles;

import org.polarsys.kitalpha.composer.api.profiles.ComposerProfile;
import org.polarsys.kitalpha.composer.api.profiles.IProfileDelta;

/**
 * A profile delta.
 * 
 * @author Yann Mortier
 */
public class ProfileDelta implements IProfileDelta {

	/**
	 * The kind of the delta.
	 */
	private final int kind;

	/**
	 * The affected profile.
	 */
	private final ComposerProfile affectedProfile;

	public ProfileDelta(int kind, ComposerProfile affectedProfile) {
		this.kind = kind;
		this.affectedProfile = affectedProfile;
	}

	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.internal.profiles.IProfileDelta#getKind()
	 */
	@Override
	public int getKind() {
		return kind;
	}

	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.internal.profiles.IProfileDelta#getAffectedProfile()
	 */
	@Override
	public ComposerProfile getAffectedProfile() {
		return affectedProfile;
	}

}
