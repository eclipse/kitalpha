/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
/**
 * Copyright (c) THALES, 2012. All rights reserved.
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.services;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class Messages extends NLS {
	
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.services.messages"; //$NON-NLS-1$
	public static String VpservicesFileCreationPage_Title;
	public static String VpservicesFileCreationPage_Description;	
	public static String VpservicesFileSecondPage_Title;
	public static String VpservicesFileSecondPage_Description;
	public static String VpservicesFileThirdPage_Title;	
	public static String VpservicesFileThirdPage_Description;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
