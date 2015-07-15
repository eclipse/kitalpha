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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.callback;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpspecMessages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.callback.vpspecmessages"; //$NON-NLS-1$
	public static String VpspecEditorCallback_NewBuild;
	public static String VpspecEditorCallback_NewConfiguration;
	public static String VpspecEditorCallback_NewData;
	public static String VpspecEditorCallback_NewDiagrams;
	public static String VpspecEditorCallback_NewServices;
	public static String VpspecEditorCallback_NewUserInterface;
	public static String VpspecEditorCallback_newActivityExplorer;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, VpspecMessages.class);
	}

	private VpspecMessages() {
	}
}
