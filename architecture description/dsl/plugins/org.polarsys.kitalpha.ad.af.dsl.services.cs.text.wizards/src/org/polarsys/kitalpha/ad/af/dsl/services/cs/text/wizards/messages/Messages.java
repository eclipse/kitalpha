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

package org.polarsys.kitalpha.ad.af.dsl.services.cs.text.wizards.messages;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class Messages extends NLS {
	
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.ad.af.dsl.services.cs.text.wizards.messages.messages"; //$NON-NLS-1$
	public static String AfdslFileCreationPage_AfdslExtension;
	public static String AfdslNewFile_AfdslFileWizard;
	public static String AfdslNewFileCreationPage_CreateAfdslFileFromScratch;
	public static String AfdslNewFileCreationPage_CreateAfdslFileFromExistingSpec;
	public static String AfdslNewFileCreationPage_SerializationException;
	public static String AfdslNewFileSecondPage_InitializeProperties;
	public static String AfdslNewFileThirdPage_SelectRootProject;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
