/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.preference.internal;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.preference.helper.ViewpointDslPreferencesHelper;

/**
 * @author Boubekeur Zendagui
 */

public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @see AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		String customizedValue = ViewpointDslPreferencesHelper.getCustomizedRPNValue();
		if (! ViewpointDslPreferencesHelper.useTargetApplicationValue() &&
				(customizedValue == null || customizedValue.trim().length() == 0))
		{
			ViewpointDslPreferencesHelper.restorRPNDefautValues();
		}
		
		String customizedTAValue = ViewpointDslPreferencesHelper.getCustomizedDefaultTAValue();
		if (customizedTAValue == null || customizedTAValue.trim().length() == 0)
		{
			ViewpointDslPreferencesHelper.restorDefautTADefaultValues();
		}
	}
}
