/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.ui.validation.message;

import org.eclipse.osgi.util.NLS;

/**
 * @author Boubekeur Zendagui
 */

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.ad.viewpoint.dsl.as.ui.validation.message.messages"; //$NON-NLS-1$
	
	// UIContainer constraints messages
	public static String Validation_Mapping_Data_check;
	
	//UIField constraints messages
	public static String Validation_UIContainer_Unique_NameInSection;
	public static String Validation_UIField_Unique_NameInSection;
	
	// UIField Mapping constraints messages
	public static String Validation_UIField_Mapping_MainMessage;
	public static String Validation_UIField_Mapping_CanNotBeMapped;
	public static String Validation_UIField_Mapping_MustBeMapped;
	// Associations Messages
	public static String Validation_UIField_Association_Cardinalities;
	public static String Validation_UIField_Association_Fragment1;
	public static String Validation_UIField_Association_Fragment2;
	
	// Attributes messages
	public static String Validation_UIField_Attribute_Boolean;
	public static String Validation_UIField_Attribute_Enumerator;
	public static String Validation_UIField_Attribute_Other;
	public static String Validation_UIField_Attribute;
	public static String Validation_UIField_Attribute_CollectionKind;
	
	// Other 
	public static String Validation_VpSpec_Attribute_NoName;
	public static String Validation_VpSpec_Class_NoName;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
