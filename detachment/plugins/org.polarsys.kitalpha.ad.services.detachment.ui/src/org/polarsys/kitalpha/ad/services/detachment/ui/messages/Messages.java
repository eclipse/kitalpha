/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.services.detachment.ui.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	
	private static String BUNDLE_NAME = "org.polarsys.kitalpha.ad.services.detachment.ui.messages.messages"; //$NON-NLS-1$
	

	public static String WIZARD_PAGE_UR_TITLE;
	public static String WIZARD_PAGE_UR_DESCRIPTION;
	public static String DETACHMENT_WIZARD;
	
	public static String EMPTY_STRING;
	
	public static String WIZARD_PAGE_VP_HIERARCHY_TITLE;
	public static String WIZARD_PAGE_VP_HIERARCHY_DESCRIPTION;

	//errors
	public static String MSG_ERROR_SAVE_CLEANED_RESOURCE;
	public static String MSG_ERROR_BACKUP_RESOURCE;
	public static String MODEL_ERROR_DIALOG_TITLE;


	public static String DETACH_BUTTON_LABEL;


	public static String DESLECTION_BUTTON;


	public static String SELECTION_BUTTON;
	
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

}

