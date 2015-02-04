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

/**
 * @author Boubekeur Zendagui
 */
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
	public static final String DOCGEN_BRANDING_LOGO_ALT_DEFAULT_VALUE = "[Default Kitalpha logo]";
	
}
