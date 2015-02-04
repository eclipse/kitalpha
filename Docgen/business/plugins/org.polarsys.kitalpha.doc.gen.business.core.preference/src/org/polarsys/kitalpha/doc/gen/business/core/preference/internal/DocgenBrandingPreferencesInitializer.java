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
		if (copyright == null || (copyright != null && copyright.trim().length() == 0))
		{
			DocgenBrandingPreferencesHelper.restorDefautCopyrightDefaultValues();
		}
		
		String imagePath = DocgenBrandingPreferencesHelper.getLogoPath();
		if (imagePath == null || (imagePath != null && imagePath.trim().length() == 0))
		{
			DocgenBrandingPreferencesHelper.restorDefautImagePathDefaultValues();
		}
		
		String imageAltText = DocgenBrandingPreferencesHelper.getLogoAlternateText();
		if (imageAltText == null || (imageAltText != null && imageAltText.trim().length() == 0))
		{
			DocgenBrandingPreferencesHelper.restorDefautImageAlternateTextDefaultValues();
		}
	}

}
