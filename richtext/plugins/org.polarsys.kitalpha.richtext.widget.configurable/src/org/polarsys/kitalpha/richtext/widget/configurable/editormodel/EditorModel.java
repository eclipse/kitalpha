/*******************************************************************************
 * Copyright (c) 2017, 2023 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.richtext.widget.configurable.editormodel;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.polarsys.kitalpha.richtext.nebula.widget.MDERichTextConstants;
import org.polarsys.kitalpha.richtext.widget.configurable.preferences.core.PreferenceConstants;

public class EditorModel {

	public static final EditorModel INSTANCE = new EditorModel();
	
	private EditorItem globalEnablementItem;
	
	private List<EditorToolbar> toolbars;
	IPreferenceStore preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.polarsys.kitalpha.richtext.widget.configurable.preferences.core");
	
	private EditorModel()
	{
		instanciateModel();
	}
	
	private void instanciateModel() {
		toolbars = new ArrayList<>();
		
		// Global configurable enablement item
		globalEnablementItem = new EditorItem(
				PreferenceConstants.GLOBAL_CONFIGURABLE_ENABLEMENT_ID,
				null,
				PreferenceConstants.GLOBAL_CONFIGURABLE_ENABLEMENT_LABEL
			);
		
		// DOCUMENT TOOLBAR
		List<EditorItem> modeGroupItems = new ArrayList<>();
		modeGroupItems.add(new EditorItem(
				PreferenceConstants.SOURCE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SOURCE,
				PreferenceConstants.SOURCE_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> documentToolbarGroups = new ArrayList<>();
		documentToolbarGroups.add(new EditorGroup(
				PreferenceConstants.MODE_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.MODE_GROUP,
				PreferenceConstants.MODE_GROUP_ENABLEMENT_LABEL,
				modeGroupItems
			));
		
		List<EditorItem> documentGroupItems = new ArrayList<>();
		documentGroupItems.add(new EditorItem(
				PreferenceConstants.SAVE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SAVE,
				PreferenceConstants.SAVE_ITEM_ENABLEMENT_LABEL
			));
		documentGroupItems.add(new EditorItem(
				PreferenceConstants.NEWPAGE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.NEW_PAGE,
				PreferenceConstants.NEWPAGE_ITEM_ENABLEMENT_LABEL
			));
		documentGroupItems.add(new EditorItem(
				PreferenceConstants.PREVIEW_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.PREVIEW,
				PreferenceConstants.PREVIEW_ITEM_ENABLEMENT_LABEL
			));
		documentGroupItems.add(new EditorItem(
				PreferenceConstants.PRINT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.PRINT,
				PreferenceConstants.PRINT_ITEM_ENABLEMENT_LABEL
			));
		documentGroupItems.add(new EditorItem(
				PreferenceConstants.DOCPROPOS_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.DOC_PROPOS,
				PreferenceConstants.DOCPROPOS_ITEM_ENABLEMENT_LABEL
			));
		
		documentToolbarGroups.add(new EditorGroup(
				PreferenceConstants.DOCUMENT_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.DOCUMENT_GROUP,
				PreferenceConstants.DOCUMENT_GROUP_ENABLEMENT_LABEL,
				documentGroupItems
			));
		
		toolbars.add(new EditorToolbar(
				PreferenceConstants.DOCUMENT_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.DOCUMENT_TOOLBAR,
				PreferenceConstants.DOCUMENT_TOOLBAR_ENABLEMENT_LABEL,
				documentToolbarGroups
			));
		
		// CLIPBOARD TOOLBAR
		List<EditorItem> clipboardGroupItems = new ArrayList<>();
		clipboardGroupItems.add(new EditorItem(
				PreferenceConstants.CUT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.CUT,
				PreferenceConstants.CUT_ITEM_ENABLEMENT_LABEL
			));
		clipboardGroupItems.add(new EditorItem(
				PreferenceConstants.COPY_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.COPY,
				PreferenceConstants.COPY_ITEM_ENABLEMENT_LABEL
			));
		clipboardGroupItems.add(new EditorItem(
				PreferenceConstants.PASTE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.PASTE,
				PreferenceConstants.PASTE_ITEM_ENABLEMENT_LABEL
			));
		clipboardGroupItems.add(new EditorItem(
				PreferenceConstants.PASTETEXT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.PASTE_TEXT,
				PreferenceConstants.PASTETEXT_ITEM_ENABLEMENT_LABEL
			));
		clipboardGroupItems.add(new EditorItem(
				PreferenceConstants.PASTEWORD_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.PASTE_FROM_WORD,
				PreferenceConstants.PASTEWORD_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> clipboardToolbarGroups = new ArrayList<>();
		clipboardToolbarGroups.add(new EditorGroup(
				PreferenceConstants.CLIPBOARD_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.CLIPBOARD_GROUP,
				PreferenceConstants.CLIPBOARD_GROUP_ENABLEMENT_LABEL,
				clipboardGroupItems
			));
		
		List<EditorItem> undoGroupItems = new ArrayList<>();
		undoGroupItems.add(new EditorItem(
				PreferenceConstants.UNDO_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.UNDO,
				PreferenceConstants.UNDO_ITEM_ENABLEMENT_LABEL
			));
		undoGroupItems.add(new EditorItem(
				PreferenceConstants.REDO_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.REDO,
				PreferenceConstants.REDO_ITEM_ENABLEMENT_LABEL
			));
		
		clipboardToolbarGroups.add(new EditorGroup(
				PreferenceConstants.UNDO_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.UNDO_GROUP,
				PreferenceConstants.UNDO_GROUP_ENABLEMENT_LABEL,
				undoGroupItems
			));
		
		toolbars.add(new EditorToolbar(
				PreferenceConstants.CLIPBOARD_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.CLIPBOARD_TOOLBAR,
				PreferenceConstants.CLIPBOARD_TOOLBAR_ENABLEMENT_LABEL,
				clipboardToolbarGroups
			));
		
		// EDITING TOOLBAR
		List<EditorItem> findGroupItems = new ArrayList<>();
		findGroupItems.add(new EditorItem(
				PreferenceConstants.FIND_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.FIND,
				PreferenceConstants.FIND_ITEM_ENABLEMENT_LABEL
			));
		findGroupItems.add(new EditorItem(
				PreferenceConstants.REPLACE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.REPLACE,
				PreferenceConstants.REPLACE_ITEM_ENABLEMENT_LABEL
			));

		List<EditorGroup> editingToolbarGroups = new ArrayList<>();
		editingToolbarGroups.add(new EditorGroup(
				PreferenceConstants.FIND_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.FIND_GROUP,
				PreferenceConstants.FIND_GROUP_ENABLEMENT_LABEL,
				findGroupItems
			));
		
		List<EditorItem> selectionGroupItems = new ArrayList<>();
		selectionGroupItems.add(new EditorItem(
				PreferenceConstants.SELECTALL_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SELECT_ALL,
				PreferenceConstants.SELECTALL_ITEM_ENABLEMENT_LABEL
			));
		
		editingToolbarGroups.add(new EditorGroup(
				PreferenceConstants.SELECTION_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.SELECTION_GROUP,
				PreferenceConstants.SELECTION_GROUP_ENABLEMENT_LABEL,
				selectionGroupItems
			));
		
		List<EditorItem> spellCheckerGroupItems = new ArrayList<>();
		spellCheckerGroupItems.add(new EditorItem(
				PreferenceConstants.SPELLCHECKER_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SPELLCHECKER,
				PreferenceConstants.SPELLCHECKER_ITEM_ENABLEMENT_LABEL
			));
		
		editingToolbarGroups.add(new EditorGroup(
				PreferenceConstants.SPELLCHECKER_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.SPELLCHECKER_GROUP,
				PreferenceConstants.SPELLCHECKER_GROUP_ENABLEMENT_LABEL,
				spellCheckerGroupItems
			));
		
		toolbars.add(new EditorToolbar(
				PreferenceConstants.EDITING_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.EDITING_TOOLBAR,
				PreferenceConstants.EDITING_TOOLBAR_ENABLEMENT_LABEL,
				editingToolbarGroups
			));
		
		// FORMS TOOLBAR
		List<EditorItem> formsGroupItems = new ArrayList<>();
		formsGroupItems.add(new EditorItem(
				PreferenceConstants.FORM_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.FORM,
				PreferenceConstants.FORM_ITEM_ENABLEMENT_LABEL
			));
		formsGroupItems.add(new EditorItem(
				PreferenceConstants.CHECKBOX_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.CHECKBOX,
				PreferenceConstants.CHECKBOX_ITEM_ENABLEMENT_LABEL
			));
		formsGroupItems.add(new EditorItem(
			PreferenceConstants.RADIO_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.RADIO,
				PreferenceConstants.RADIO_ITEM_ENABLEMENT_LABEL
			));
		formsGroupItems.add(new EditorItem(
				PreferenceConstants.TEXTFIELD_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.TEXTFIELD,
				PreferenceConstants.TEXTFIELD_ITEM_ENABLEMENT_LABEL
			));
		formsGroupItems.add(new EditorItem(
				PreferenceConstants.TEXTAREA_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.TEXTAREA,
				PreferenceConstants.TEXTAREA_ITEM_ENABLEMENT_LABEL
			));
		formsGroupItems.add(new EditorItem(
				PreferenceConstants.SELECT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SELECT,
				PreferenceConstants.SELECT_ITEM_ENABLEMENT_LABEL
			));
		formsGroupItems.add(new EditorItem(
				PreferenceConstants.BUTTON_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.BUTTON,
				PreferenceConstants.BUTTON_ITEM_ENABLEMENT_LABEL
			));
		formsGroupItems.add(new EditorItem(
				PreferenceConstants.IMAGEBUTTON_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.IMAGEBUTTON,
				PreferenceConstants.IMAGEBUTTON_ITEM_ENABLEMENT_LABEL
			));
		formsGroupItems.add(new EditorItem(
				PreferenceConstants.HIDDENFIELD_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.HIDDENFIELD,
				PreferenceConstants.HIDDENFIELD_ITEM_ENABLEMENT_LABEL
			));

		List<EditorGroup> formsToolbarGroups = new ArrayList<>();
		formsToolbarGroups.add(new EditorGroup(
				PreferenceConstants.FORMS_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.FORMS_GROUP,
				PreferenceConstants.FORMS_GROUP_ENABLEMENT_LABEL,
				formsGroupItems
			));
		
		toolbars.add(new EditorToolbar(
				PreferenceConstants.FORMS_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.FORMS_TOOLBAR,
				PreferenceConstants.FORMS_TOOLBAR_ENABLEMENT_LABEL,
				formsToolbarGroups
			));
		
		// BASICSTYLES TOOLBAR
		List<EditorItem> basicStylesGroupItems = new ArrayList<>();
		basicStylesGroupItems.add(new EditorItem(
				PreferenceConstants.BOLD_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.BOLD,
				PreferenceConstants.BOLD_ITEM_ENABLEMENT_LABEL
			));
		basicStylesGroupItems.add(new EditorItem(
				PreferenceConstants.ITALIC_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.ITALIC,
				PreferenceConstants.ITALIC_ITEM_ENABLEMENT_LABEL
			));
		basicStylesGroupItems.add(new EditorItem(
			PreferenceConstants.UNDERLINE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.UNDERLINE,
				PreferenceConstants.UNDERLINE_ITEM_ENABLEMENT_LABEL
			));
		basicStylesGroupItems.add(new EditorItem(
				PreferenceConstants.STRIKE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.STRIKE,
				PreferenceConstants.STRIKE_ITEM_ENABLEMENT_LABEL
			));
		basicStylesGroupItems.add(new EditorItem(
				PreferenceConstants.SUBSCRIPT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SUBSCRIPT,
				PreferenceConstants.SUBSCRIPT_ITEM_ENABLEMENT_LABEL
			));
		basicStylesGroupItems.add(new EditorItem(
				PreferenceConstants.SUPERSCRIPT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SUPERSCRIPT,
				PreferenceConstants.SUPERSCRIPT_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> basicStylesToolbarGroups = new ArrayList<>();
		basicStylesToolbarGroups.add(new EditorGroup(
				PreferenceConstants.BASICSTYLES_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.BASIC_STYLES_GROUP,
				PreferenceConstants.BASICSTYLES_GROUP_ENABLEMENT_LABEL,
				basicStylesGroupItems
			));
		
		List<EditorItem> cleanUpGroupItems = new ArrayList<>();
		cleanUpGroupItems.add(new EditorItem(
				PreferenceConstants.REMOVEFORMAT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.REMOVE_FORMAT,
				PreferenceConstants.REMOVEFORMAT_ITEM_ENABLEMENT_LABEL
			));
		cleanUpGroupItems.add(new EditorItem(
				PreferenceConstants.COPYFORMAT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.COPY_FORMAT,
				PreferenceConstants.COPYFORMAT_ITEM_ENABLEMENT_LABEL
			));
		
		basicStylesToolbarGroups.add(new EditorGroup(
				PreferenceConstants.CLEANUP_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.CLEANUP_GROUP,
				PreferenceConstants.CLEANUP_GROUP_ENABLEMENT_LABEL,
				cleanUpGroupItems
			));
		
		toolbars.add(new EditorToolbar(
				PreferenceConstants.BASICSTYLES_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.BASIC_STYLES_TOOLBAR,
				PreferenceConstants.BASICSTYLES_TOOLBAR_ENABLEMENT_LABEL,
				basicStylesToolbarGroups
			));
		
		// PARAGRAPH TOOLBAR
		List<EditorItem> listGroupItems = new ArrayList<>();
		listGroupItems.add(new EditorItem(
				PreferenceConstants.NUMBEREDLIST_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.NUMBERED_LIST,
				PreferenceConstants.NUMBEREDLIST_ITEM_ENABLEMENT_LABEL
			));
		listGroupItems.add(new EditorItem(
				PreferenceConstants.BULLETEDLIST_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.BULLETED_LIST,
				PreferenceConstants.BULLETEDLIST_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> paragraphToolbarGroups = new ArrayList<>();
		paragraphToolbarGroups.add(new EditorGroup(
				PreferenceConstants.LIST_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.LIST_GROUP,
				PreferenceConstants.LIST_GROUP_ENABLEMENT_LABEL,
				listGroupItems
			));
		
		List<EditorItem> indentGroupItems = new ArrayList<>();
		indentGroupItems.add(new EditorItem(
				PreferenceConstants.INDENT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.INDENT,
				PreferenceConstants.INDENT_ITEM_ENABLEMENT_LABEL
			));
		indentGroupItems.add(new EditorItem(
				PreferenceConstants.OUTINDENT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.OUT_INDENT,
				PreferenceConstants.OUTINDENT_ITEM_ENABLEMENT_LABEL
			));
		
		paragraphToolbarGroups.add(new EditorGroup(
				PreferenceConstants.INDENT_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.INDENT_GROUP,
				PreferenceConstants.INDENT_GROUP_ENABLEMENT_LABEL,
				indentGroupItems
			));
		
		List<EditorItem> blockGroupItems = new ArrayList<>();
		blockGroupItems.add(new EditorItem(
				PreferenceConstants.BLOCKQUOTE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.BLOCK_QUOTE,
				PreferenceConstants.BLOCKQUOTE_ITEM_ENABLEMENT_LABEL
			));
		blockGroupItems.add(new EditorItem(
				PreferenceConstants.CREATEDIV_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.CREATE_DIV,
				PreferenceConstants.CREATEDIV_ITEM_ENABLEMENT_LABEL
			));
		
		paragraphToolbarGroups.add(new EditorGroup(
				PreferenceConstants.BLOCK_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.BLOCKS_GROUP,
				PreferenceConstants.BLOCK_GROUP_ENABLEMENT_LABEL,
				blockGroupItems
			));
		
		List<EditorItem> alignGroupItems = new ArrayList<>();
		alignGroupItems.add(new EditorItem(
				PreferenceConstants.JUSTIFYLEFT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.JUSTIFY_LEFT,
				PreferenceConstants.JUSTIFYLEFT_ITEM_ENABLEMENT_LABEL
			));
		alignGroupItems.add(new EditorItem(
				PreferenceConstants.JUSTIFYCENTER_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.JUSTIFY_CENTER,
				PreferenceConstants.JUSTIFYCENTER_ITEM_ENABLEMENT_LABEL
			));
		alignGroupItems.add(new EditorItem(
				PreferenceConstants.JUSTIFYRIGHT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.JUSTIFY_RIGHT,
				PreferenceConstants.JUSTIFYRIGHT_ITEM_ENABLEMENT_LABEL
			));
		alignGroupItems.add(new EditorItem(
				PreferenceConstants.JUSTIFYBLOCK_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.JUSTIFY_BLOCK,
				PreferenceConstants.JUSTIFYBLOCK_ITEM_ENABLEMENT_LABEL
			));
		
		paragraphToolbarGroups.add(new EditorGroup(
				PreferenceConstants.ALIGN_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.ALIGN_GROUP,
				PreferenceConstants.ALIGN_GROUP_ENABLEMENT_LABEL,
				alignGroupItems
			));

		List<EditorItem> bidiGroupItems = new ArrayList<>();
		bidiGroupItems.add(new EditorItem(
				PreferenceConstants.BIDILTR_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.BIDI_LTR,
				PreferenceConstants.BIDILTR_ITEM_ENABLEMENT_LABEL
			));
		bidiGroupItems.add(new EditorItem(
				PreferenceConstants.BIDIRTL_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.BIDI_RTL,
				PreferenceConstants.BIDIRTL_ITEM_ENABLEMENT_LABEL
			));
		bidiGroupItems.add(new EditorItem(
				PreferenceConstants.LANGUAGE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.LANGUAGE,
				PreferenceConstants.LANGUAGE_ITEM_ENABLEMENT_LABEL
			));
		
		paragraphToolbarGroups.add(new EditorGroup(
				PreferenceConstants.BIDI_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.BIDI_GROUP,
				PreferenceConstants.BIDI_GROUP_ENABLEMENT_LABEL,
				bidiGroupItems
			));
		
		toolbars.add(new EditorToolbar(
				PreferenceConstants.PARAGRAPH_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.PARAGRAPH_TOOLBAR,
				PreferenceConstants.PARAGRAPH_TOOLBAR_ENABLEMENT_LABEL,
				paragraphToolbarGroups
			));
		
		// LINKS TOOLBAR
		List<EditorItem> linksGroupItems = new ArrayList<>();
		linksGroupItems.add(new EditorItem(
				PreferenceConstants.LINK_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.LINK,
				PreferenceConstants.LINK_ITEM_ENABLEMENT_LABEL
			));
		linksGroupItems.add(new EditorItem(
				PreferenceConstants.UNLINK_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.UNLINK,
				PreferenceConstants.UNLINK_ITEM_ENABLEMENT_LABEL
			));
		linksGroupItems.add(new EditorItem(
				PreferenceConstants.ANCHOR_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.ANCHOR,
				PreferenceConstants.ANCHOR_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> linksToolbarGroups = new ArrayList<>();
		linksToolbarGroups.add(new EditorGroup(
				PreferenceConstants.LINKS_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.LINKS_GROUP,
				PreferenceConstants.LINKS_GROUP_ENABLEMENT_LABEL,
				linksGroupItems
			));
		
		toolbars.add(new EditorToolbar(
				PreferenceConstants.LINKS_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.LINKS_TOOLBAR,
				PreferenceConstants.LINKS_TOOLBAR_ENABLEMENT_LABEL,
				linksToolbarGroups
			));
		
		// INSERT TOOLBAR
		List<EditorItem> insertGroupItems = new ArrayList<>();
		insertGroupItems.add(new EditorItem(
				PreferenceConstants.IMAGE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.IMAGE,
				PreferenceConstants.IMAGE_ITEM_ENABLEMENT_LABEL
			));
		insertGroupItems.add(new EditorItem(
				PreferenceConstants.FLASH_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.FLASH,
				PreferenceConstants.FLASH_ITEM_ENABLEMENT_LABEL
			));
		insertGroupItems.add(new EditorItem(
				PreferenceConstants.TABLE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.TABLE,
				PreferenceConstants.TABLE_ITEM_ENABLEMENT_LABEL
			));
		insertGroupItems.add(new EditorItem(
				PreferenceConstants.HORIZONTALRULE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.HORIZONTAL_RULE,
				PreferenceConstants.HORIZONTALRULE_ITEM_ENABLEMENT_LABEL
			));
		insertGroupItems.add(new EditorItem(
				PreferenceConstants.SMILEYS_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SMILEYS,
				PreferenceConstants.SMILEYS_ITEM_ENABLEMENT_LABEL
			));
		insertGroupItems.add(new EditorItem(
				PreferenceConstants.SPECIALCHAR_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SPECIAL_CHAR,
				PreferenceConstants.SPECIALCHAR_ITEM_ENABLEMENT_LABEL
			));
		insertGroupItems.add(new EditorItem(
				PreferenceConstants.PAGEBREAK_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.PAGE_BREAK,
				PreferenceConstants.PAGEBREAK_ITEM_ENABLEMENT_LABEL
			));
		insertGroupItems.add(new EditorItem(
				PreferenceConstants.IFRAME_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.IFRAME,
				PreferenceConstants.IFRAME_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> insertToolbarGroups = new ArrayList<>();
		insertToolbarGroups.add(new EditorGroup(
				PreferenceConstants.INSERT_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.INSERT_GROUP,
				PreferenceConstants.INSERT_GROUP_ENABLEMENT_LABEL,
				insertGroupItems
			));
		
		toolbars.add(new EditorToolbar(
				PreferenceConstants.INSERT_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.INSERT_TOOLBAR,
				PreferenceConstants.INSERT_TOOLBAR_ENABLEMENT_LABEL,
				insertToolbarGroups
			));
		
		// STYLES TOOLBAR
		List<EditorItem> stylesGroupItems = new ArrayList<>();
		stylesGroupItems.add(new EditorItem(
				PreferenceConstants.STYLES_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.STYLES,
				PreferenceConstants.STYLES_ITEM_ENABLEMENT_LABEL
			));
		stylesGroupItems.add(new EditorItem(
				PreferenceConstants.FORMAT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.FORMAT,
				PreferenceConstants.FORMAT_ITEM_ENABLEMENT_LABEL
			));
		stylesGroupItems.add(new EditorItem(
				PreferenceConstants.FONT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.FONT,
				PreferenceConstants.FONT_ITEM_ENABLEMENT_LABEL
			));
		stylesGroupItems.add(new EditorItem(
				PreferenceConstants.FONTSIZE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.FONT_SIZE,
				PreferenceConstants.FONTSIZE_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> stylesToolbarGroups = new ArrayList<>();
		stylesToolbarGroups.add(new EditorGroup(
				PreferenceConstants.STYLES_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.STYLES_GROUP,
				PreferenceConstants.STYLES_GROUP_ENABLEMENT_LABEL,
				stylesGroupItems
			));
		
		toolbars.add(new EditorToolbar(
				PreferenceConstants.STYLES_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.STYLES_TOOLBAR,
				PreferenceConstants.STYLES_TOOLBAR_ENABLEMENT_LABEL,
				stylesToolbarGroups
			));
		
		// COLORS TOOLBAR
		List<EditorItem> colorsGroupItems = new ArrayList<>();
		colorsGroupItems.add(new EditorItem(
				PreferenceConstants.TEXTCOLOR_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.TEXT_COLOR,
				PreferenceConstants.TEXTCOLOR_ITEM_ENABLEMENT_LABEL
			));
		colorsGroupItems.add(new EditorItem(
				PreferenceConstants.BGCOLOR_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.BG_COLOR,
				PreferenceConstants.BGCOLOR_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> colorsToolbarGroups = new ArrayList<>();
		colorsToolbarGroups.add(new EditorGroup(
				PreferenceConstants.COLORS_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.COLORS_GROUP,
				PreferenceConstants.COLORS_GROUP_ENABLEMENT_LABEL,
				colorsGroupItems
			));
		
		toolbars.add(new EditorToolbar(
				PreferenceConstants.COLORS_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.COLORS_TOOLBAR,
				PreferenceConstants.COLORS_TOOLBAR_ENABLEMENT_LABEL,
				colorsToolbarGroups
			));
		
		// TOOLS TOOLBAR
		List<EditorItem> toolsGroupItems = new ArrayList<>();
		toolsGroupItems.add(new EditorItem(
				PreferenceConstants.MAXIMIZE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.MAXIMIZE,
				PreferenceConstants.MAXIMIZE_ITEM_ENABLEMENT_LABEL
			));
		toolsGroupItems.add(new EditorItem(
				PreferenceConstants.SHOWBLOCKS_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SHOWBLOCKS,
				PreferenceConstants.SHOWBLOCKS_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> toolsToolbarGroups = new ArrayList<>();
		toolsToolbarGroups.add(new EditorGroup(
				PreferenceConstants.TOOLS_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.TOOLS_GROUP,
				PreferenceConstants.TOOLS_GROUP_ENABLEMENT_LABEL,
				toolsGroupItems
			));
		
		toolbars.add(new EditorToolbar(
				PreferenceConstants.TOOLS_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.TOOLS_TOOLBAR,
				PreferenceConstants.TOOLS_TOOLBAR_ENABLEMENT_LABEL,
				toolsToolbarGroups
			));
		
		// ABOUT TOOLBAR
		List<EditorItem> aboutGroupItems = new ArrayList<>();
		aboutGroupItems.add(new EditorItem(
				PreferenceConstants.ABOUT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.ABOUT,
				PreferenceConstants.ABOUT_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> aboutToolbarGroups = new ArrayList<>();
		aboutToolbarGroups.add(new EditorGroup(
				PreferenceConstants.ABOUT_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.ABOUT_GROUP,
				PreferenceConstants.ABOUT_GROUP_ENABLEMENT_LABEL,
				aboutGroupItems
			));
		
		toolbars.add(new EditorToolbar(
				PreferenceConstants.ABOUT_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.ABOUT_TOOLBAR,
				PreferenceConstants.ABOUT_TOOLBAR_ENABLEMENT_LABEL,
				aboutToolbarGroups
			));
	}
	
	public EditorItem getGlobalEnablementItem()
	{
		return globalEnablementItem;
	}
	
	public List<EditorToolbar> getToolbars()
	{
		return toolbars;
	}
	
	public boolean areAllNodesToBeDisabled()
	{
		List<EditorToolbar> instanceToolbars = INSTANCE.getToolbars();
		
		if (!INSTANCE.isNodeToBeActivated(globalEnablementItem))
		{
			return true;
		}
		
		for (EditorToolbar toolbar : instanceToolbars)
		{
			if (!INSTANCE.isNodeToBeActivated(toolbar))
			{
				continue;
			}
			for (EditorGroup group : toolbar.getGroups())
			{
				if (!INSTANCE.isNodeToBeActivated(group))
				{
					continue;
				}
				for (EditorItem item : group.getItems())
				{
					if (INSTANCE.isNodeToBeActivated(item))
					{
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public boolean isNodeToBeActivated(EditorModelNode node)
	{
		if (node == null)
		{
			return false;
		}
		return (preferenceStore.getBoolean(node.getId()));
	}
	
	public EditorModelNode getNode(BooleanFieldEditor preferenceField)
	{
		List<EditorToolbar> instanceToolbars = INSTANCE.getToolbars();
		
		if (INSTANCE.getGlobalEnablementItem().getPreferenceField().equals(preferenceField))
		{
			return globalEnablementItem;
		}
		
		for (EditorToolbar toolbar : instanceToolbars)
		{
			if (toolbar.getPreferenceField().equals(preferenceField))
			{
				return toolbar;
			}
			for (EditorGroup group : toolbar.getGroups())
			{
				if (group.getPreferenceField().equals(preferenceField))
				{
					return group;
				}
				for (EditorItem item : group.getItems())
				{
					if (item.getPreferenceField().equals(preferenceField))
					{
						return item;
					}
				}
			}
		}
		return null;
	}
}