/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.message;

import org.eclipse.osgi.util.NLS;

/**
 * @author Boubekeur Zendagui
 */

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.message.messages"; //$NON-NLS-1$
	
	public static String Validation_NoMessage;
	
	// Generic Domain constraints messages
	public static String Validation_Domain_NullDomain;
	public static String Validation_Domain_NullDomainClass;
	
	// Node Domain constraints messages
	public static String Validation_Domain_Node_BothQueryAndAssociation;
	public static String Validation_Domain_Node_NeitherQueryOrAssociation;
	
	// Edge Domain constraints messages
	public static String Validation_Domain_Edge_BothQueryAndSourceLocator;
	public static String Validation_Domain_Edge_BothQueryAndTargetLocator;
	public static String Validation_Domain_Edge_NeitherQueryOrSourceLocator;
	public static String Validation_Domain_Edge_NeitherQueryOrTargetLocator;
	
	// Representation Domain constraints messages
	public static String Validation_Representation_Import_EitherLabelOrStyle;
	public static String Validation_Representation_StyleIsNull;
	public static String Validation_Representation_Condition_Unique_WithName;
	public static String Validation_Representation_Condition_Unique_WithoutName;
	
	// Condition constraints messages
	public static String Validation_Condition_Attribute_CollectionKind;
	
	//Diagram synchronization messages
	public static String Validation_Diagram_Synchrinization;
	public static String Validation_Create_OnlyView_Synchronization;
	
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
