/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.services.preference.internal;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.polarsys.kitalpha.ad.af.dsl.services.preference.helper.AFRootProjectNamePreferencesHelper;

/**
 * @author Boubekeur Zendagui
 */

public class AFPreferenceInitializer extends AbstractPreferenceInitializer {

	public AFPreferenceInitializer() {
	}

	/**
	 * @see AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		String customizedValue = AFRootProjectNamePreferencesHelper.getCustomizedValue();
		if (customizedValue == null || (customizedValue != null && customizedValue.trim().length() == 0))
			AFRootProjectNamePreferencesHelper.restorDefautValues();
	}

}
