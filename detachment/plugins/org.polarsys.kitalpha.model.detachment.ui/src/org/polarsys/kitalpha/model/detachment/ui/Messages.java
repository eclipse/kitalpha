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
package org.polarsys.kitalpha.model.detachment.ui;

import org.eclipse.osgi.util.NLS;

/**
 * @author Faycal Abka
 */
public class Messages extends NLS {
	
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.model.detachment.ui.messages"; //$NON-NLS-1$

	public static String UR_EXTENSION_CANT_GET;
	
	public static String MODEL_DETACHMENT_NO_EXTENSION_FOUND;

	public static String QUESTION_DIALOG_TITLE;

	public static String QUESTION_IN_DIALOG;

	public static String CONFIRM_DIALOG_TITLE;

	public static String FINISH_DETACHMENT_MESSAGE;

	public static String ERROR_DIALOG_TITLE;

	public static String HEADER_EDITOR_TITLE;

	public static String PERFORM_DETACHMENT;

	public static String LOADING_RESOURCE;
	
	
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
	
	private Messages() {
	}

}
