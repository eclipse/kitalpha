/*******************************************************************************
 * Copyright (c) 2014-2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.preference.helper;

/**
 * @author Boubekeur Zendagui
 */

public class DocgenBrandingPreferencesHelper extends AbstractDocgenPreferencesHelper{

	/**
	 * @return the value of the copyright preference
	 */
	public static String getCopyright(){
		return getCustomizedStringValue(DocgenPreferenceConstant.DOCGEN_BRANDING_COPYRIGHT);
	}
	
	/**
	 * @return the value of the use default Logo preference
	 */
	public static Boolean getUseDefaultLogo(){
		return getCustomizedBooleanValue(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_USE_DEFAULT);
	}
	
	/**
	 * @return the value of the image path preference
	 */
	public static String getLogoPath(){
		return getCustomizedStringValue(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_PATH);
	}
	
	/**
	 * @return the value of the image alternate text preference
	 */
	public static String getLogoAlternateText(){
		return getCustomizedStringValue(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_ALT);
	}
	
	/**
	 * Set copyright preference to it default value.
	 */
	public static void restorDefautCopyrightDefaultValues(){
		STORE.setDefault(DocgenPreferenceConstant.DOCGEN_BRANDING_COPYRIGHT, 
						 DocgenPreferenceConstant.DOCGEN_BRANDING_COPYRIGHT_DEFAULT_VALUE);
	}
	
	/**
	 * Set image path preference to it default value.
	 */
	public static void restorDefautImagePathDefaultValues(){
		STORE.setDefault(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_PATH, 
						 DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_PATH_DEFAULT_VALUE);
	}
	
	/**
	 * Set image alternate text preference to it default value.
	 */
	public static void restorDefautImageAlternateTextDefaultValues(){
		STORE.setDefault(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_ALT, 
						 DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_ALT_DEFAULT_VALUE);
	}
}
