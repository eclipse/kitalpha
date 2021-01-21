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
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.messages"; //$NON-NLS-1$
	public static String ViewpointDSLActions_BackwardSynchronizer_GeneratorMessage;
	public static String ViewpointDSLActions_BackwardSynchronizer_UnresolvedProxy;
	public static String ViewpointDSLActions_BackwardSynchronizer_SerializationException;
	public static String ViewpointDSLActions_BackwardSynchronizer_Success;
	public static String ViewpointDSLActions_BackwardSynchronizer_MessageDialogTitle;
	public static String ViewpointDSLActions_GenerateViewpointAction_DefaultTitle;
	public static String ViewpointDSLActions_EraseEmfPlugins;
	public static String ViewpointDSLActions_VpdescModelNotFound_Error;
	public static String ViewpointDSLActions_Error_Title;
	public static String ViewpointDSLActions_Fatal_Error_Message;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
