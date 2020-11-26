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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.message;

import org.eclipse.osgi.util.NLS;

/**
 * @author Boubekeur Zendagui
 */

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.message.messages"; //$NON-NLS-1$
	
	public static String Validation_UniqueValue_WithParent;
	public static String Validation_UniqueValue_WithoutParent;
	public static String Validation_AttributeType_NotEmpty_WithParent;
	public static String Validation_AttributeType_NotEmpty_WithoutParent;
	
	public static String Validation_ShortName_NotValid;
	public static String Validation_NoShortName;

	public static String Validation_NoName;
	public static String Validation_Name_Empty_OnlyElement;
	public static String Validation_Name_Empty_WithParent;
	public static String Validation_Name_NotValid_OnlyElement;
	public static String Validation_Name_NotValid_WithParent;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
