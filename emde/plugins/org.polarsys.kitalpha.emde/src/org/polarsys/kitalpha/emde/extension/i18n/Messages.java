/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.extension.i18n;

import org.eclipse.osgi.util.NLS;

public class Messages {

	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.emde.extension.i18n.messages"; //$NON-NLS-1$

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
	public static String Listener_Error;
	public static String ImplementationRegistryProvider_invalidKey;

	public static String ImplementationRegistryProvider_invalidClass;

	public static String ImplementationRegistryProvider_invalidURI;

	public static String ImplementationRegistryProvider_unknownClass;

	public static String _UI_GeneratingModelClass_ExtendedElement_URI_Error;

	public static String _UI_GeneratingModelClass_ExtendedElement_Relative_URI_Error;

	public static String _UI_GeneratingModelClass_ExtendedElement_Resource_Error;

	public static String _UI_GeneratingModelClass_EMDE_Annotation_Error;

	public static String _UI_GeneratingModelClass_EMDE_Annotation_ElementExtension_Type_Error;

	public static String _UI_GeneratingModelClass_EMDE_Annotation_Element_Parent_SubType_Error;

	public static String _UI_GeneratingModelClass_EMDE_Annotation_Element_SubType_Error;

	public static String _UI_GeneratingModelClass_EMDE_Annotation_Element_Type_Error;

}
