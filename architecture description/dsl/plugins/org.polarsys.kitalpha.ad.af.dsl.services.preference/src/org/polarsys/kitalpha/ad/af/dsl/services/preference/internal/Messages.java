/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.services.preference.internal;

import org.eclipse.osgi.util.NLS;

/**
 * @author Boubekeur Zendagui
 */

public class Messages {

	public static String AF_RPN_FIELD_LABEL;
	public static String AF_RPN_FIELD_VALUE_ERROR;
	
	private static final String BUNDLE_PACKAGE = "org.polarsys.kitalpha.ad.af.dsl.services.preference.internal"; //$NON-NLS-1$
	private static final String BUNDLE_FILENAME = "Messages"; //$NON-NLS-1$
	private static final String BUNDLE_NAME = BUNDLE_PACKAGE + "." + BUNDLE_FILENAME; //$NON-NLS-1$

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
