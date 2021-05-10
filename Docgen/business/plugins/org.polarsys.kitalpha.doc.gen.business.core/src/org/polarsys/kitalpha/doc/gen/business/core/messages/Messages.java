/*******************************************************************************
 * Copyright (c) 2015, 2021 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.messages;

import org.eclipse.osgi.util.NLS;

/**
 * @author Boubekeur Zendagui
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.doc.gen.business.core.messages.messages"; //$NON-NLS-1$
	
	public static String Scope_Cant_Delete;
	public static String Scope_Cant_Compute_On_Null_Object;
	public static String Scope_Cant_Find_Model_Root_Element;
	public static String Scope_There_Is_No_Scope;
	public static String Scope_No_Resource_For_Export_References_Strategy;
	
	public static String warning_LabelProvider_GetText_NPE;
	public static String warning_TextReplacedWithNull;
	public static String warning_ConceptNameReplacedWithNull;
	
	public static String errorUnziptaskOutsideOfTargetDirectory;
	
	public static String Generation_Bad_Input;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
