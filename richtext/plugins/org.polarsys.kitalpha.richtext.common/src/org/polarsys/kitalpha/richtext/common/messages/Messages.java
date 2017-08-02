/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
