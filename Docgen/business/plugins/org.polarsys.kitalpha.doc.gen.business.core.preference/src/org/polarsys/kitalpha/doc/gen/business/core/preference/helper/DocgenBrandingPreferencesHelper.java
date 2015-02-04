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

package org.polarsys.kitalpha.doc.gen.business.core.preference.helper;

import org.eclipse.jface.preference.IPreferenceStore;
import org.polarsys.kitalpha.doc.gen.business.core.preference.Activator;

/**
 * @author Boubekeur Zendagui
 */

public class DocgenBrandingPreferencesHelper {

	public final static IPreferenceStore store =  Activator.getDefault().getPreferenceStore();
	
	/**
	 * @return the value of the copyright preference
	 */
	public static String getCopyright(){
		return getCustomizedStringValue(DocgenBrandingPreferenceConstant.DOCGEN_BRANDING_COPYRIGHT);
	}
	
	/**
	 * @return the value of the use default Logo preference
	 */
	public static Boolean getUseDefaultLogo(){
		return store.getBoolean(DocgenBrandingPreferenceConstant.DOCGEN_BRANDING_LOGO_USE_DEFAULT);
	}
	
	/**
	 * @return the value of the image path preference
	 */
	public static String getLogoPath(){
		return getCustomizedStringValue(DocgenBrandingPreferenceConstant.DOCGEN_BRANDING_LOGO_PATH);
	}
	
	/**
	 * @return the value of the image alternate text preference
	 */
	public static String getLogoAlternateText(){
		return getCustomizedStringValue(DocgenBrandingPreferenceConstant.DOCGEN_BRANDING_LOGO_ALT);
	}
	
	/**
	 * Get a string value of a preference
	 * @param preferenceName name of a preference
	 * @return the value of a preference
	 */
	private static String getCustomizedStringValue(String preferenceName){
		return store.getString(preferenceName);
	}
	
	/**
	 * Set copyright preference to it default value.
	 */
	public static void restorDefautCopyrightDefaultValues(){
		store.setDefault(DocgenBrandingPreferenceConstant.DOCGEN_BRANDING_COPYRIGHT, 
						 DocgenBrandingPreferenceConstant.DOCGEN_BRANDING_COPYRIGHT_DEFAULT_VALUE);
	}
	
	/**
	 * Set image path preference to it default value.
	 */
	public static void restorDefautImagePathDefaultValues(){
		store.setDefault(DocgenBrandingPreferenceConstant.DOCGEN_BRANDING_LOGO_PATH, 
						 DocgenBrandingPreferenceConstant.DOCGEN_BRANDING_LOGO_PATH_DEFAULT_VALUE);
	}
	
	/**
	 * Set image alternate text preference to it default value.
	 */
	public static void restorDefautImageAlternateTextDefaultValues(){
		store.setDefault(DocgenBrandingPreferenceConstant.DOCGEN_BRANDING_LOGO_ALT, 
						 DocgenBrandingPreferenceConstant.DOCGEN_BRANDING_LOGO_ALT_DEFAULT_VALUE);
	}
}
