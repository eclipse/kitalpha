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
	public int getKind() {
		return kind;
	}

	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.internal.profiles.IProfileDelta#getAffectedProfile()
	 */
	public ComposerProfile getAffectedProfile() {
		return affectedProfile;
	}

}
