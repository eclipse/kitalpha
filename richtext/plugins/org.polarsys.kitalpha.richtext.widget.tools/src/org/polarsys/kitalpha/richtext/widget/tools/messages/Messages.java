/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.tools.messages;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Faycal Abka
 *
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.richtext.widget.tools.messages.messages";
	
	public static String RichTextWidget_Exception_URL_Error_Computation;
	public static String RichTextWidget_Dialog_Title_Diagram_Element_Selection;
	public static String RichTextWidget_Dialog_Title_Selection_Diagram_Element;
	public static String RichTextWidget_Dialog_Title_Model_Element_Selection;
	public static String RichTextWidget_Dialog_Title_Selection_Model_Element;
	public static String RichTextWidget_Exception_Error_Unknown_encode;
	public static String RichTextWidget_Exception_Error_Unknown_decode;
	public static String RichTextWidget_Exception_Error_Unknown_openlink;
	public static String RichTextWidget_Exception_Error_Unknown_getPath;
	public static String RichTextWidget_Dialog_Filter;
	public static String RichTextWidget_Dialog_Add_Link;
	public static String RichTextWidget_Dialog_Add_Link_Browse;
	public static String RichTextWidget_Dialog_Add_Link_URL_Display;
	public static String RichTextWidget_Dialgo_Title_Clear;
	public static String RichTextWidget_Dialgo_Title_Clear_Question;
	public static String RichTextWidget_Dialog_Add_Image;

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
