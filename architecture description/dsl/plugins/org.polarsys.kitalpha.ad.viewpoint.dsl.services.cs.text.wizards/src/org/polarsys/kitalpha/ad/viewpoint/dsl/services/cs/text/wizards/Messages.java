/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.messages"; //$NON-NLS-1$
	public static String AbstractPropertiesPage_DefaultFileCreationPage_Title;
	public static String AbstractSecondPage_DefaultSecondPageTitle;
	public static String AbstractThirdPage_DefaultThirdPageTitle;
	public static String DefaultFileCreationPage_Description;
	public static String DefaultFileCreationPage_Title;
	public static String AbstractWizard_FileCreationTaskTitle;
	public static String AbstractWizard_ModelFolderNotFound;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
