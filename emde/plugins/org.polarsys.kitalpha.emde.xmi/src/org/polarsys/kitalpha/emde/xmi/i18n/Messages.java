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
package org.polarsys.kitalpha.emde.xmi.i18n;

import org.eclipse.osgi.util.NLS;

/**
 * @author Xavier Maysonnave
 * 
 */
public class Messages {

	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.emde.xmi.i18n.messages"; //$NON-NLS-1$

	public static String validate_deactivated_eClass;

	public static String validate_deactivated_eObject_feature;

	public static String validate_deactivated_eObject_many_feature;

	public static String XMI_unknown_eClass;

	public static String XMI_unknown_eObject_feature;

	public static String XMI_unknown_eObject_many_feature;

	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

}
