/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.preference.internal;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenBrandingPreferencesHelper;

/**
 * @author Boubekeur Zendagui
 */

public class DocgenBrandingPreferencesInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		String copyright = DocgenBrandingPreferencesHelper.getCopyright();
		if (copyright == null || copyright.trim().length() == 0)
		{
			DocgenBrandingPreferencesHelper.restorDefautCopyrightDefaultValues();
		}
		
		String imagePath = DocgenBrandingPreferencesHelper.getLogoPath();
		if (imagePath == null || imagePath.trim().length() == 0)
		{
			DocgenBrandingPreferencesHelper.restorDefautImagePathDefaultValues();
		}
		
		String imageAltText = DocgenBrandingPreferencesHelper.getLogoAlternateText();
		if (imageAltText == null || imageAltText.trim().length() == 0)
		{
			DocgenBrandingPreferencesHelper.restorDefautImageAlternateTextDefaultValues();
		}
	}

}
