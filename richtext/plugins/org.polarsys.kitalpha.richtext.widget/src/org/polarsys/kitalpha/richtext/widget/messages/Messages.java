package org.polarsys.kitalpha.richtext.widget.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	
	private static final  String BUNDLE_NAME = "org.polarsys.kitalpha.richtext.widget.messages.messages";
	
	public static String RichTextWidget_Error_CompositeNull;
	public static String RichTextWidget_Error_ConfigurationNull;
	public static String RichTextWidget_Error_OwnerObjectNull;
	public static String RichTextWidget_Error_FeatureObjectNull;
	
	public static String RichTextWidget_Dialgo_Title_Clear;
	public static String RichTextWidget_Dialgo_Title_Clear_Question;
	public static String RichTextWidget_Dialog_Title_Diagram_Element_Selection;
	public static String RichTextWidget_Dialog_Title_Selection_Diagram_Element;
	public static String RichTextWidget_Dialog_Title_Model_Element_Selection;
	public static String RichTextWidget_Dialog_Title_Selection_Model_Element;
	
	public static String RichTextWidget_Dialog_Filter;
	
	public static String RichTextWidget_Dialog_Add_Link;
	public static String RichTextWidget_Dialog_Add_Link_Browse;
	public static String RichTextWidget_Dialog_Add_Link_URL_Display;
	
	public static String RichTextWidget_Exception_URL_Error_Computation;
	public static String RichTextWidget_Exception_Error_Unknown_type;
	public static String RichTextWidget_Exception_Error_Unknown_encode;
	public static String RichTextWidget_Exception_Error_Unknown_decode;
	public static String RichTextWidget_Exception_Error_Unknown_openlink;
	public static String RichTextWidget_Exception_Error_Unknown_getPath;
	
	
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

}
