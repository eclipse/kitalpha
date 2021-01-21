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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.message;

import org.eclipse.osgi.util.NLS;

/**
 * @author Boubekeur Zendagui
 */

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.message.messages"; //$NON-NLS-1$
	public static String Reverse_EcoreAction_Name;
	public static String Reverse_Wizard_ConcretSyntax_Task;
	public static String Reverse_Wizard_ConcretSyntax_SubTask;
	public static String Reverse_Wizard_PluginXmlContribution_Task;
	public static String Reverse_Wizard_PluginXmlContribution_SubTask;
	public static String Reverse_Wizard_WindowTitle;
	public static String Reverse_Wizard_FirstPage_Description;
	public static String Reverse_Wizard_FirstPage_Title;
	public static String Reverse_Wizard_SecondPage_Description;
	public static String Reverse_Wizard_SecondPage_Title;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
