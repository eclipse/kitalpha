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
package org.polarsys.kitalpha.richtext.nebula.widget;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.richtext.nebula.widget.internal.Activator;

/**
 * 
 * @author Faycal Abka
 *
 */
public final class MDERichTextConstants {
	
	
	//Customization
	public static final String TOOLBAR_COLOR = "uiColor"; 			//$NON-NLS-1$
	public static final String TOOLBAR_POSITION = "toolbarLocation";//$NON-NLS-1$
	public static final String TOOLBAR_POSITION_TOP = "top";		//$NON-NLS-1$
	public static final String TOOLBAR_POSITION_BOTTOM = "bottom";	//$NON-NLS-1$
	public static final String CUSTOM_CONFIG = "customConfig"; 		//$NON-NLS-1$
	public static final String READ_ONLY_MODE = "readOnly";			//$NON-NLS-1$
	public static final String PAST_FROM_MS_WORD_PROMPT_CLEANUP = "pasteFromWordPromptCleanup";	//$NON-NLS-1$
	public static final String PAST_FROM_MS_WORD_CLEANER_FILE = "pasteFromWordCleanupFile"; //$NON-NLS-1$
	public static final String BASE_HREF ="baseHref";				//$NON-NLS-1$
	
	public static final String DEFAUTL_CUSTOM_CONFIG = getDefaultCustomConfig("resources/config.js");	//$NON-NLS-1$
	
	public static final String ITEM_SEPARATOR = "-"; 				//$NON-NLS-1$
	
	//****************** MDE Items and toolbar ******************//
	
	public static final String MDE_LINKS_TOOLBAR = "mdelinks"; 		//$NON-NLS-1$
	public static final String MDE_ADDLINK = "Addlink"; 			//$NON-NLS-1$
	public static final String MDE_ADDIMAGE = "AddImage";			//$NON-NLS-1$
	
	public static final String MDE_ENABLE_EDITING_TOOLBAR = "enableEdit"; 	//$NON-NLS-1$
	public static final String MDE_EDITABLE = "Editable"; 			//$NON-NLS-1$
	
	public static final String MDE_CLEAN_TOOLBAR = "clean"; 		//$NON-NLS-1$
	public static final String MDE_CLEAN = "Clean"; 				//$NON-NLS-1$
	
	public static final String MDE_OPEN_EDITOR = "openEditor";		//$NON-NLS-1$
	
	
	//****************** CKEditor Items and toolbar ******************//
	 //Document
	public static final String DOCUMENT_TOOLBAR = "document"; 		//$NON-NLS-1$
    public static final String SOURCE = "Source"; 					//$NON-NLS-1$
    public static final String SAVE = "Save"; 						//$NON-NLS-1$
    public static final String NEW_PAGE = "NewPage"; 				//$NON-NLS-1$
    public static final String DOC_PROPOS = "DocProps"; 			//$NON-NLS-1$
    public static final String PREVIEW = "Preview"; 				//$NON-NLS-1$
    public static final String PRINT = "Print"; 					//$NON-NLS-1$
    public static final String TEMPLATE = "Templates"; 				//$NON-NLS-1$
     

    //Clipboard
    public static final String CLIPBOARD_TOOLBAR = "clipboard"; 	//$NON-NLS-1$
    public static final String CUT = "Cut"; 						//$NON-NLS-1$
    public static final String COPY = "Copy"; 						//$NON-NLS-1$
    public static final String PASTE = "Paste"; 					//$NON-NLS-1$
    public static final String PASTE_TEXT = "PasteText"; 			//$NON-NLS-1$
    public static final String PASTE_FROM_WORD = "PasteFromWord"; 	//$NON-NLS-1$
    public static final String UNDO = "Undo"; 						//$NON-NLS-1$
    public static final String REDO = "Redo"; 						//$NON-NLS-1$

    //editing
    public static final String EDITING_TOOLBAR = "editing"; 		//$NON-NLS-1$
    public static final String FIND = "Find"; 						//$NON-NLS-1$
    public static final String REPLACE = "Replace"; 				//$NON-NLS-1$
    public static final String SELECT_ALL = "SelectAll"; 			//$NON-NLS-1$

    //Styles
    public static final String BASIC_STYLES = "basicstyles"; 		//$NON-NLS-1$
    public static final String BOLD = "Bold"; 						//$NON-NLS-1$
    public static final String ITALIC = "Italic"; 					//$NON-NLS-1$
    public static final String UNDERLINE = "Underline"; 			//$NON-NLS-1$
    public static final String STRIKE = "Strike"; 					//$NON-NLS-1$
    public static final String SUBSCRIPT = "Subscript"; 			//$NON-NLS-1$
    public static final String SUPERSCRIPT = "Superscript"; 		//$NON-NLS-1$
    public static final String REMOVE_FORMAT = "RemoveFormat"; 		//$NON-NLS-1$

    //Paragraph
    public static final String PARAGRAPH_TOOLBAR = "paragraph"; 	//$NON-NLS-1$
    public static final String NUMBERED_LIST = "NumberedList"; 		//$NON-NLS-1$
    public static final String BULLETED_LIST = "BulletedList"; 		//$NON-NLS-1$
    public static final String OUT_INDENT = "Outdent"; 				//$NON-NLS-1$
    public static final String INDENT = "Indent"; 					//$NON-NLS-1$ 
    public static final String INDENT_GROUP = "indent"; 			//$NON-NLS-1$
    public static final String LIST_GROUP = "list"; 				//$NON-NLS-1$
    public static final String ALIGN_GROUP = "align"; 				//$NON-NLS-1$
    public static final String BLOCK_QUOTE = "Blockquote"; 			//$NON-NLS-1$
    public static final String CREATE_DIV = "CreateDiv"; 			//$NON-NLS-1$
    public static final String JUSTIFY_LEFT = "JustifyLeft"; 		//$NON-NLS-1$
    public static final String JUSTIFY_CENTER = "JustifyCenter"; 	//$NON-NLS-1$
    public static final String JUSTIFY_RIGHT = "JustifyRight"; 		//$NON-NLS-1$
    public static final String JUSTIFY_BLOCK = "JustifyBlock"; 		//$NON-NLS-1$
    public static final String BIDI_LTR = "BidiLtr"; 				//$NON-NLS-1$
    public static final String BIDI_RTL = "BidiRtl"; 				//$NON-NLS-1$

    //links
    public static final String LINKS_TOOLBAR = "links"; 			//$NON-NLS-1$
    public static final String LINK = "Link"; 						//$NON-NLS-1$
    public static final String UNLINK = "Unlink"; 					//$NON-NLS-1$
    public static final String ANCHOR = "Anchor"; 					//$NON-NLS-1$

    //Insert
    public static final String INSERT_TOOLBAR = "insert"; 			//$NON-NLS-1$
    public static final String IMAGE = "Image"; 					//$NON-NLS-1$
    public static final String TABLE = "Table"; 					//$NON-NLS-1$
    public static final String HORIZONTAL_RULE = "HorizontalRule"; 	//$NON-NLS-1$
    public static final String SPECIAL_CHAR = "SpecialChar"; 		//$NON-NLS-1$
    public static final String PAGE_BREAK = "PageBreak"; 			//$NON-NLS-1$

    //Styles
    public static final String STYLES_TOOLBAR = "styles"; 			//$NON-NLS-1$
    public static final String STYLE = "style"; 					//$NON-NLS-1$
    public static final String STYLES = "Styles";					//$NON-NLS-1$
    public static final String FORMAT = "Format"; 					//$NON-NLS-1$
    public static final String FONT = "Font"; 						//$NON-NLS-1$
    public static final String FONT_SIZE = "FontSize"; 				//$NON-NLS-1$

    //Colors
    public static final String COLORS_TOOLBAR = "colors"; 			//$NON-NLS-1$
    public static final String TEXT_COLOR = "TextColor"; 			//$NON-NLS-1$
    public static final String BG_COlOR = "BGColor"; 				//$NON-NLS-1$
    
    /*
	 * cf. CKEditor documentation about state of commands
	 * http://docs.ckeditor.com/#!/api/CKEDITOR.command
	 */
	public static final String STATE_OFF = "CKEDITOR.TRISTATE_OFF";			//$NON-NLS-1$
	public static final String STATE_ON  = "CKEDITOR.TRISTATE_ON";			//$NON-NLS-1$
	public static final String STATE_DISABLE  = "CKEDITOR.TRISTATE_DISABLE";	//$NON-NLS-1$
	
    
	private static String getDefaultCustomConfig(String configPath) {
		return getFilePath(Activator.PLUGIN_ID, configPath);
	}
	
	private static String getFilePath(URL url) {
		if (url != null){
			URL fileURL = getFileURL(url);
			
			if (fileURL != null){
				return fileURL.toString();
			}
		}
		return null;
	}
	
	protected static String getFilePath(String bundleId, String pathWithinBundle) {
		URL url = getURL(bundleId, pathWithinBundle);
		return getFilePath(url);
	}
	
	/**
	 * return the URL of path within the bundle
	 * @param bundleId
	 * @param path
	 * @return
	 */
	private static URL getURL(String bundleId, String path){
		Bundle bundle = Platform.getBundle(bundleId);
		URL url = null;
		if (bundle != null){
			url = FileLocator.find(bundle, new Path(path), null);
			return url;
		}
		return url;
	}
	
	public static URL getFileURL(URL url){
		try {
			return FileLocator.toFileURL(url);
		} catch (IOException e) {
			Status status = new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		}
		return null;
	}
}
