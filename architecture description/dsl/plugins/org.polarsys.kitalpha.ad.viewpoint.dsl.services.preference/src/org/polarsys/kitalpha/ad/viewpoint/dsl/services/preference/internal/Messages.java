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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.preference.internal;

import org.eclipse.osgi.util.NLS;

/**
 * @author Boubekeur Zendagui
 */

public class Messages {

	public static String USE_TA_VALUE_FIELD_LABEL;
	public static String RPN_FIELD_LABEL;
	public static String RPN_FIELD_VALUE_ERROR;
	
	private static final String BUNDLE_PACKAGE = "org.polarsys.kitalpha.ad.viewpoint.dsl.services.preference.internal"; //$NON-NLS-1$
	private static final String BUNDLE_FILENAME = "Messages"; //$NON-NLS-1$
	private static final String BUNDLE_NAME = BUNDLE_PACKAGE + "." + BUNDLE_FILENAME; //$NON-NLS-1$

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
