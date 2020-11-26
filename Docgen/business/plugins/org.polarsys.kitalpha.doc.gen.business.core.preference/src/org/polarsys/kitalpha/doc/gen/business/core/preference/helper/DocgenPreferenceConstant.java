/*******************************************************************************
 * Copyright (c) 2016, 2019 Thales Global Services S.A.S.
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
public class DocgenPreferenceConstant {
	
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
	
	/** This preference allows to know if the diagrams should be generated and exported or no */
	public static final String DOCGEN_DIAGRAMS_EXPORT = "ExportDiagrams";
	public static final boolean DOCGEN_DIAGRAMS_EXPORT_DEFAULT_VALUE = true;
	
	/** This preference allows to know if the diagrams should be generated and exported or no */
	public static final String DOCGEN_DIAGRAMS_IMAGE_FORMAT = "ImageFormat";
	public static final String DOCGEN_DIAGRAMS_IMAGE_FORMAT_DEFAULT_VALUE = DocgenDiagramPreferencesHelper.IMAGE_FORMAT_DEFAULT_VALUE.getName();
	
	/** This value is the name of the project-scoped preference node containing resource-specific preferences */
	public static final String DOCGEN_PROJECT__PREFERENCE_NODE = "org.polarsys.kitalpha.doc.gen";
	
	/** This value is the name of the project-scoped preference node containing resource-specific preferences */
	public static final String DOCGEN_PROJECT__DEFAULT_RESOURCE_NODE = "DefaultProjectResourceNodeName";
	
	/** This preference allows to know the last used output path for a specific resource */
	public static final String DOCGEN_PROJECT__OUTPUT_PATH = "DocgenProjectResourceOutputPath";
}
