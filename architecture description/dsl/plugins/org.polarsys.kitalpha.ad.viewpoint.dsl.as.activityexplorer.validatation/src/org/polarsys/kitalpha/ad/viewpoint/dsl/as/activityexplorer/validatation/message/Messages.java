/*******************************************************************************
 * Copyright (c) 2015, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.validatation.message;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Faycal Abka, Boubekeur Zendagui
 *
 */
public class Messages extends NLS {
	
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.validatation.message.messages";
	
	public static String DuplicatedActivityExplorerId;
	public static String Validation_Activity_Unique_ActivityName;
	public static String Validation_ActivityExplorerItem_Named_NotEmpty_ID;
	public static String Validation_ActivityExplorerItem_NoNamed_NotEmpty_ID;
	
	public static String Validation_ActivityExplorerExtension_NoProvided_ID;
	public static String Validation_ActivityExplorerExtension_NotExists_ID;
	
	public static String Validation_Runtime_CantLocateViewpointActivityExplorer;
	
	public static String Validation_Icon_IconExistence_IconOff;
	public static String Validation_Icon_IconOnExistence_IconOff;
	public static String Validation_Icon_DynamicIconOnExistence_IconOn;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages()
	{
		
	}
}
