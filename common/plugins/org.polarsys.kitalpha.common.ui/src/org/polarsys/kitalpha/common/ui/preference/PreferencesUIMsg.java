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
package org.polarsys.kitalpha.common.ui.preference;

import org.eclipse.osgi.util.NLS;

/**
 * @author Boubekeur Zendagui
 */

public class PreferencesUIMsg {
	// messages for category page
	public static String CATEGORY_PAGE_LABEL_AD;
	public static String CATEGORY_PAGE_LABEL_MDECORE;
	
	// NLS stuff
	private static final String BUNDLE_PACKAGE = "org.polarsys.kitalpha.common.ui.preference"; //$NON-NLS-1$
	private static final String BUNDLE_FILENAME = "PreferencesUIMsg"; //$NON-NLS-1$
	private static final String BUNDLE_NAME = BUNDLE_PACKAGE + "." + BUNDLE_FILENAME; //$NON-NLS-1$

	static {
		NLS.initializeMessages(BUNDLE_NAME, PreferencesUIMsg.class);
	}
}
