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
package org.polarsys.kitalpha.resourcereuse;

import org.eclipse.osgi.util.NLS;

/**
 * @author Thomas Guiu
 * 
 */
public class Messages extends NLS {

	public static String Illegal_String_Parameter;
	public static String ResourceId_Not_Found;
	public static String Illegal_Criteria_Parameter;

	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.resourcereuse.Messages";//$NON-NLS-1$
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

}
