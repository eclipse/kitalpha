/*******************************************************************************
 * Copyright (c) 2014-2016 Thales Global Services S.A.S.
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
 * 
 * This class is deprecated since Kitalpha 1.1.0. 
 * Please use {@link DocgenPreferenceConstant}
 */
@Deprecated
public class DocgenBrandingPreferenceConstant {
	
	/** This preference allows to set a default copyright to use in the footer 
	 * of generated html pages */
	public static final String DOCGEN_BRANDING_COPYRIGHT = "DocdenBrandingCopyright";
	public static final String DOCGEN_BRANDING_COPYRIGHT_DEFAULT_VALUE = "Copyright &copy; 2014 The Eclipse Foundation. All Rights Reserved.";
	
	/** This preference allows to set a default logo to use in the header 
	 * of generated html pages */
	public static final String DOCGEN_BRANDING_LOGO_USE_DEFAULT = "DocdenBrandingUseDefaultLogo";
	public static final boolean DOCGEN_BRANDING_LOGO_USE_DEFAULT_DEFAULT_VALUE = true;
	
	/** This preference allows to set a default logo to use in the header 
	 * of generated html pages */
	public static final String DOCGEN_BRANDING_LOGO_PATH = "DocdenBrandingLogo";
	public static final String DOCGEN_BRANDING_LOGO_PATH_DEFAULT_VALUE = "Default";
	
	/** This preference allows to set a default alternative text of logo to use 
	 * in the header of generated html pages */
	public static final String DOCGEN_BRANDING_LOGO_ALT = "DocdenBrandingLogoALT";
	public static final String DOCGEN_BRANDING_LOGO_ALT_DEFAULT_VALUE = "[Default logo]";
	
}
