/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
/**
 * Copyright (c) THALES, 2012. All rights reserved.
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.spec;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class Messages extends NLS {
	
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.spec.messages"; //$NON-NLS-1$
	public static String VpspecFileCreationPage_Title;
	public static String VpspecFileCreationPage_Description;	
	public static String VpspecFileSecondPage_Title;
	public static String VpspecFileSecondPage_Description;
	public static String VpspecFileThirdPage_Title;	
	public static String VpspecFileThirdPage_Description;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
