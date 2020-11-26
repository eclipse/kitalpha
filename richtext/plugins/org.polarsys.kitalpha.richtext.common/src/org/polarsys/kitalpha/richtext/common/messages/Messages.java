/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.common.messages;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Faycal Abka
 *
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.richtext.common.messages.messages";
	
	
	public static String RichTextWidget_Common_Nullable_Value_Error;
	public static String RichTextWidget_Common_NullableStrategy_Error;
	
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

}
