/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.internal.VpbuildActivator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.preferences.kitalphaPreferences.PreferencesConstants;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpbuildPreferencesInitializer extends
		AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore prefs = VpbuildActivator.getInstance().getPreferenceStore();
		
		prefs.setDefault(PreferencesConstants.TARGET_PLATFORM_PREF, 
				PreferencesConstants.DEFAULT_VALUE_TARGET_PLATFORM);
		prefs.setDefault(PreferencesConstants.FEATURES_ROOT_PATH,
				PreferencesConstants.DEFAULT_VALUE_FEATURES_ROOT_PATH);
		
	}

}
