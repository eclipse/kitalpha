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

package org.polarsys.kitalpha.model.attachment.ui;

import org.eclipse.osgi.util.NLS;

/**
 * @author Thomas Guiu
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.model.attachment.ui.messages";
	public static String wizard_title; //$NON-NLS-1$ "Model Attachment"
	public static String wizard_page_error1; //$NON-NLS-1$  {0} must be set.
	public static String wizard_page_error2; //$NON-NLS-1$  "Cannot find role {0}
	public static String wizard_page_error3; //$NON-NLS-1$ 
	public static String wizard_page_error4; //$NON-NLS-1$ 
	public static String error_dialog_title; //$NON-NLS-1$ "Error"
	public static String wizard_page_title; // "Role selection"
	public static String wizard_page_description; // "Select the role for each model."
	public static String wizard_page_label1; // "used as"
	public static String wizard_page_title1; // "Viewpoint Page"
	public static String wizard_page_description1; // "Select the viewpoints to attach."
	public static String wizard_page_label2; // "Attachable viewpoints:"
	public static String wizard_page_label3; // "Source model: {0}
	public static String wizard_page_label4; // "Analysing models..."

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
