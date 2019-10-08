/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.ui;

import org.eclipse.osgi.util.NLS;

/**
 * @author Thomas Guiu
 * 
 */
public class Messages extends NLS {

	public static String Search_Button_Label;
	public static String id_Field_Label;
	public static String name_Field_Label;
	public static String domain_Field_Label;
	public static String version_Field_Label;
	public static String path_Field_Label;
	public static String tags_Field_Label;
	public static String tags_Field__AddButton_Label;
	public static String tags_Field__DeleteButton_Label;
	public static String Concern_group_Label;
	public static String Concern_usedTable_Label;
	public static String Concern_userTable_Label;
	public static String Concern_bothTable_Label;
	public static String Concern_Field__AddButton_Label;
	public static String Concern_Field__DeleteButton_Label;
	public static String Search_dialog_title;
	public static String SearchView_newSearch_Action_label;
	public static String SearchView_newSearch_Action_tooltip;
	public static String SearchView_refreshSearch_Action_label;
	public static String SearchView_refreshSearch_Action_tooltip;

	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.resourcereuse.ui.Messages";//$NON-NLS-1$
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

}
