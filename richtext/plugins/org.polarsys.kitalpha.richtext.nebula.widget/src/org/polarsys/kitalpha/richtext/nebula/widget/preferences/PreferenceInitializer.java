/*******************************************************************************
 * Copyright (c) 2023 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.richtext.nebula.widget.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.polarsys.kitalpha.richtext.nebula.widget.internal.Activator;

public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/**
     * 
     */
	public PreferenceInitializer() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
	    // Set default delay value.
	    preferenceStore.setDefault(IRichTextPreferences.PREFERENCE_FORCE_IE_WIN32, true);
	}

}
