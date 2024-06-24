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
		globalEnablementItem = new EditorItem(null,
				PreferenceConstants.GLOBAL_CONFIGURABLE_ENABLEMENT_ID,
				null,
				PreferenceConstants.GLOBAL_CONFIGURABLE_ENABLEMENT_LABEL
			);
		
		// MDE ENABLE EDIT TOOLBAR
		
		//MDE_ENABLE_EDITING_TOOLBAR_ENABLEMENT_ID
		List<EditorItem> mdeEnableEditGroupItems = new ArrayList<>();
		mdeEnableEditGroupItems.add(new EditorItem(PreferenceConstants.MDE_EDITABLE_GROUP_ENABLEMENT_ID,
				PreferenceConstants.MDE_OPEN_EDITOR_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.MDE_OPEN_EDITOR,
				PreferenceConstants.MDE_OPEN_EDITOR_ITEM_ENABLEMENT_LABEL
				));
		
		List<EditorGroup> mdeEnableEditToolbarGroups = new ArrayList<>();
		mdeEnableEditToolbarGroups.add(new EditorGroup(PreferenceConstants.MDE_ENABLE_EDITING_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.MDE_EDITABLE_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.MDE_ENABLE_EDITING_TOOLBAR,
				PreferenceConstants.MDE_EDITABLE_GROUP_ENABLEMENT_LABEL,
				mdeEnableEditGroupItems
				));
		
		toolbars.add(new EditorToolbar(null,
				PreferenceConstants.MDE_ENABLE_EDITING_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.MDE_ENABLE_EDITING_TOOLBAR,
				PreferenceConstants.MDE_ENABLE_EDITING_TOOLBAR_ENABLEMENT_LABEL,
				mdeEnableEditToolbarGroups
				));
		
		// MDE REFRESH
		List<EditorItem> mdeRefreshGroupItems = new ArrayList<>();
		mdeRefreshGroupItems.add(new EditorItem(PreferenceConstants.MDE_REFRESH_GROUP_ENABLEMENT_ID,
				PreferenceConstants.MDE_REFRESH_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.MDE_REFRESH,
				PreferenceConstants.MDE_REFRESH_ITEM_ENABLEMENT_LABEL
				));
		
		List<EditorGroup> mdeRefreshToolbarGroups = new ArrayList<>();
		mdeRefreshToolbarGroups.add(new EditorGroup(PreferenceConstants.MDE_REFRESH_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.MDE_REFRESH_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.MDE_REFRESH,
				PreferenceConstants.MDE_REFRESH_GROUP_ENABLEMENT_LABEL,
				mdeRefreshGroupItems
				));
		
		toolbars.add(new EditorToolbar(null,
				PreferenceConstants.MDE_REFRESH_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.MDE_REFRESH,
				PreferenceConstants.MDE_REFRESH_TOOLBAR_ENABLEMENT_LABEL,
				mdeRefreshToolbarGroups
				));
		
		// MDE CLEAN TOOLBAR
		List<EditorItem> mdeCleaningGroupItems = new ArrayList<>();
		mdeCleaningGroupItems.add(new EditorItem(PreferenceConstants.MDE_CLEAN_GROUP_ENABLEMENT_ID,
				PreferenceConstants.MDE_CLEAN_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.MDE_CLEAN,
				PreferenceConstants.MDE_CLEAN_ITEM_ENABLEMENT_LABEL
				));


		List<EditorGroup> mdeCleaningToolbarGroups = new ArrayList<>();
		mdeCleaningToolbarGroups.add(new EditorGroup(PreferenceConstants.MDE_CLEAN_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.MDE_CLEAN_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.MDE_CLEAN_TOOLBAR,
				PreferenceConstants.MDE_CLEAN_GROUP_ENABLEMENT_LABEL,
				mdeCleaningGroupItems
				));

		toolbars.add(new EditorToolbar(null,
				PreferenceConstants.MDE_CLEAN_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.MDE_CLEAN_TOOLBAR,
				PreferenceConstants.MDE_CLEAN_ITEM_ENABLEMENT_LABEL,
				mdeCleaningToolbarGroups
				));
		
		// MDE SAVE TOOLBAR
		List<EditorItem> mdeSaveGroupItems = new ArrayList<>();
		mdeSaveGroupItems.add(new EditorItem(PreferenceConstants.MDE_SAVE_GROUP_ENABLEMENT_ID,
				PreferenceConstants.MDE_SAVE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.MDE_SAVE,
				PreferenceConstants.MDE_SAVE_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> mdeSaveToolbarGroups = new ArrayList<>();
		mdeSaveToolbarGroups.add(new EditorGroup(PreferenceConstants.MDE_SAVE_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.MDE_SAVE_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.MDE_SAVE,
				PreferenceConstants.MDE_SAVE_GROUP_ENABLEMENT_LABEL,
				mdeSaveGroupItems
			));
		
		toolbars.add(new EditorToolbar(null,
				PreferenceConstants.MDE_SAVE_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.MDE_SAVE_TOOLBAR,
				PreferenceConstants.MDE_SAVE_TOOLBAR_ENABLEMENT_LABEL,
				mdeSaveToolbarGroups
			));
		
		// MDE LINK TOOLBAR
		List<EditorItem> mdeLinkGroupItems = new ArrayList<>();
		mdeLinkGroupItems.add(new EditorItem(PreferenceConstants.MDE_LINKS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.MDE_ADDLINK_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.MDE_ADDLINK,
				PreferenceConstants.MDE_ADDLINK_ITEM_ENABLEMENT_LABEL
			));
		
		mdeLinkGroupItems.add(new EditorItem(PreferenceConstants.MDE_LINKS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.MDE_ADDIMAGE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.MDE_ADDIMAGE,
				PreferenceConstants.MDE_ADDIMAGE_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> mdeLinkToolbarGroups = new ArrayList<>();
		mdeLinkToolbarGroups.add(new EditorGroup(PreferenceConstants.MDE_LINKS_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.MDE_LINKS_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.MDE_LINKS_TOOLBAR,
				PreferenceConstants.MDE_LINKS_GROUP_ENABLEMENT_LABEL,
				mdeLinkGroupItems
			));
		
		toolbars.add(new EditorToolbar(null,
				PreferenceConstants.MDE_LINKS_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.MDE_LINKS_TOOLBAR,
				PreferenceConstants.MDE_LINKS_TOOLBAR_ENABLEMENT_LABEL,
				mdeLinkToolbarGroups
			));
		
		
		// CLIPBOARD TOOLBAR
		List<EditorItem> clipboardGroupItems = new ArrayList<>();
		clipboardGroupItems.add(new EditorItem(PreferenceConstants.CLIPBOARD_GROUP_ENABLEMENT_ID,
				PreferenceConstants.CUT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.CUT,
				PreferenceConstants.CUT_ITEM_ENABLEMENT_LABEL
			));
		clipboardGroupItems.add(new EditorItem(PreferenceConstants.CLIPBOARD_GROUP_ENABLEMENT_ID,
				PreferenceConstants.COPY_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.COPY,
				PreferenceConstants.COPY_ITEM_ENABLEMENT_LABEL
			));
		clipboardGroupItems.add(new EditorItem(PreferenceConstants.CLIPBOARD_GROUP_ENABLEMENT_ID,
				PreferenceConstants.PASTE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.PASTE,
				PreferenceConstants.PASTE_ITEM_ENABLEMENT_LABEL
			));
		clipboardGroupItems.add(new EditorItem(PreferenceConstants.CLIPBOARD_GROUP_ENABLEMENT_ID,
				PreferenceConstants.PASTETEXT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.PASTE_TEXT,
				PreferenceConstants.PASTETEXT_ITEM_ENABLEMENT_LABEL
			));
		clipboardGroupItems.add(new EditorItem(PreferenceConstants.CLIPBOARD_GROUP_ENABLEMENT_ID,
				PreferenceConstants.PASTEWORD_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.PASTE_FROM_WORD,
				PreferenceConstants.PASTEWORD_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> clipboardToolbarGroups = new ArrayList<>();
		clipboardToolbarGroups.add(new EditorGroup(PreferenceConstants.CLIPBOARD_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.CLIPBOARD_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.CLIPBOARD_GROUP,
				PreferenceConstants.CLIPBOARD_GROUP_ENABLEMENT_LABEL,
				clipboardGroupItems
			));
		
		List<EditorItem> undoGroupItems = new ArrayList<>();
		undoGroupItems.add(new EditorItem(PreferenceConstants.UNDO_GROUP_ENABLEMENT_ID,
				PreferenceConstants.UNDO_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.UNDO,
				PreferenceConstants.UNDO_ITEM_ENABLEMENT_LABEL
			));
		undoGroupItems.add(new EditorItem(PreferenceConstants.UNDO_GROUP_ENABLEMENT_ID,
				PreferenceConstants.REDO_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.REDO,
				PreferenceConstants.REDO_ITEM_ENABLEMENT_LABEL
			));
		
		clipboardToolbarGroups.add(new EditorGroup(PreferenceConstants.CLIPBOARD_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.UNDO_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.UNDO_GROUP,
				PreferenceConstants.UNDO_GROUP_ENABLEMENT_LABEL,
				undoGroupItems
			));
		
		toolbars.add(new EditorToolbar(null,
				PreferenceConstants.CLIPBOARD_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.CLIPBOARD_TOOLBAR,
				PreferenceConstants.CLIPBOARD_TOOLBAR_ENABLEMENT_LABEL,
				clipboardToolbarGroups
			));
		
		// EDITING TOOLBAR
		List<EditorItem> findGroupItems = new ArrayList<>();
		findGroupItems.add(new EditorItem(PreferenceConstants.FIND_GROUP_ENABLEMENT_ID,
				PreferenceConstants.FIND_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.FIND,
				PreferenceConstants.FIND_ITEM_ENABLEMENT_LABEL
			));
		findGroupItems.add(new EditorItem(PreferenceConstants.FIND_GROUP_ENABLEMENT_ID,
				PreferenceConstants.REPLACE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.REPLACE,
				PreferenceConstants.REPLACE_ITEM_ENABLEMENT_LABEL
			));

		List<EditorGroup> editingToolbarGroups = new ArrayList<>();
		editingToolbarGroups.add(new EditorGroup(PreferenceConstants.EDITING_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.FIND_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.FIND_GROUP,
				PreferenceConstants.FIND_GROUP_ENABLEMENT_LABEL,
				findGroupItems
			));
		
		List<EditorItem> selectionGroupItems = new ArrayList<>();
		selectionGroupItems.add(new EditorItem(PreferenceConstants.SELECTION_GROUP_ENABLEMENT_ID,
				PreferenceConstants.SELECTALL_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SELECT_ALL,
				PreferenceConstants.SELECTALL_ITEM_ENABLEMENT_LABEL
			));
		
		editingToolbarGroups.add(new EditorGroup(PreferenceConstants.EDITING_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.SELECTION_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.SELECTION_GROUP,
				PreferenceConstants.SELECTION_GROUP_ENABLEMENT_LABEL,
				selectionGroupItems
			));
		
		List<EditorItem> spellCheckerGroupItems = new ArrayList<>();
		spellCheckerGroupItems.add(new EditorItem(PreferenceConstants.SPELLCHECKER_GROUP_ENABLEMENT_ID,
				PreferenceConstants.SPELLCHECKER_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SPELLCHECKER,
				PreferenceConstants.SPELLCHECKER_ITEM_ENABLEMENT_LABEL
			));
		
		editingToolbarGroups.add(new EditorGroup(PreferenceConstants.EDITING_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.SPELLCHECKER_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.SPELLCHECKER_GROUP,
				PreferenceConstants.SPELLCHECKER_GROUP_ENABLEMENT_LABEL,
				spellCheckerGroupItems
			));
		
		toolbars.add(new EditorToolbar(null,
				PreferenceConstants.EDITING_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.EDITING_TOOLBAR,
				PreferenceConstants.EDITING_TOOLBAR_ENABLEMENT_LABEL,
				editingToolbarGroups
			));
		
		// FORMS TOOLBAR
		List<EditorItem> formsGroupItems = new ArrayList<>();
		formsGroupItems.add(new EditorItem(PreferenceConstants.FORMS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.FORM_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.FORM,
				PreferenceConstants.FORM_ITEM_ENABLEMENT_LABEL
			));
		formsGroupItems.add(new EditorItem(PreferenceConstants.FORMS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.CHECKBOX_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.CHECKBOX,
				PreferenceConstants.CHECKBOX_ITEM_ENABLEMENT_LABEL
			));
		formsGroupItems.add(new EditorItem(PreferenceConstants.FORMS_GROUP_ENABLEMENT_ID,
			PreferenceConstants.RADIO_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.RADIO,
				PreferenceConstants.RADIO_ITEM_ENABLEMENT_LABEL
			));
		formsGroupItems.add(new EditorItem(PreferenceConstants.FORMS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.TEXTFIELD_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.TEXTFIELD,
				PreferenceConstants.TEXTFIELD_ITEM_ENABLEMENT_LABEL
			));
		formsGroupItems.add(new EditorItem(PreferenceConstants.FORMS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.TEXTAREA_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.TEXTAREA,
				PreferenceConstants.TEXTAREA_ITEM_ENABLEMENT_LABEL
			));
		formsGroupItems.add(new EditorItem(PreferenceConstants.FORMS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.SELECT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SELECT,
				PreferenceConstants.SELECT_ITEM_ENABLEMENT_LABEL
			));
		formsGroupItems.add(new EditorItem(PreferenceConstants.FORMS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.BUTTON_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.BUTTON,
				PreferenceConstants.BUTTON_ITEM_ENABLEMENT_LABEL
			));
		formsGroupItems.add(new EditorItem(PreferenceConstants.FORMS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.IMAGEBUTTON_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.IMAGEBUTTON,
				PreferenceConstants.IMAGEBUTTON_ITEM_ENABLEMENT_LABEL
			));
		formsGroupItems.add(new EditorItem(PreferenceConstants.FORMS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.HIDDENFIELD_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.HIDDENFIELD,
				PreferenceConstants.HIDDENFIELD_ITEM_ENABLEMENT_LABEL
			));

		List<EditorGroup> formsToolbarGroups = new ArrayList<>();
		formsToolbarGroups.add(new EditorGroup(PreferenceConstants.FORMS_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.FORMS_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.FORMS_GROUP,
				PreferenceConstants.FORMS_GROUP_ENABLEMENT_LABEL,
				formsGroupItems
			));
		
		toolbars.add(new EditorToolbar(null,
				PreferenceConstants.FORMS_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.FORMS_TOOLBAR,
				PreferenceConstants.FORMS_TOOLBAR_ENABLEMENT_LABEL,
				formsToolbarGroups
			));
		
		// BASICSTYLES TOOLBAR
		List<EditorItem> basicStylesGroupItems = new ArrayList<>();
		basicStylesGroupItems.add(new EditorItem(PreferenceConstants.BASICSTYLES_GROUP_ENABLEMENT_ID,
				PreferenceConstants.BOLD_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.BOLD,
				PreferenceConstants.BOLD_ITEM_ENABLEMENT_LABEL
			));
		basicStylesGroupItems.add(new EditorItem(PreferenceConstants.BASICSTYLES_GROUP_ENABLEMENT_ID,
				PreferenceConstants.ITALIC_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.ITALIC,
				PreferenceConstants.ITALIC_ITEM_ENABLEMENT_LABEL
			));
		basicStylesGroupItems.add(new EditorItem(PreferenceConstants.BASICSTYLES_GROUP_ENABLEMENT_ID,
			PreferenceConstants.UNDERLINE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.UNDERLINE,
				PreferenceConstants.UNDERLINE_ITEM_ENABLEMENT_LABEL
			));
		basicStylesGroupItems.add(new EditorItem(PreferenceConstants.BASICSTYLES_GROUP_ENABLEMENT_ID,
				PreferenceConstants.STRIKE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.STRIKE,
				PreferenceConstants.STRIKE_ITEM_ENABLEMENT_LABEL
			));
		basicStylesGroupItems.add(new EditorItem(PreferenceConstants.BASICSTYLES_GROUP_ENABLEMENT_ID,
				PreferenceConstants.SUBSCRIPT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SUBSCRIPT,
				PreferenceConstants.SUBSCRIPT_ITEM_ENABLEMENT_LABEL
			));
		basicStylesGroupItems.add(new EditorItem(PreferenceConstants.BASICSTYLES_GROUP_ENABLEMENT_ID,
				PreferenceConstants.SUPERSCRIPT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SUPERSCRIPT,
				PreferenceConstants.SUPERSCRIPT_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> basicStylesToolbarGroups = new ArrayList<>();
		basicStylesToolbarGroups.add(new EditorGroup(PreferenceConstants.BASICSTYLES_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.BASICSTYLES_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.BASIC_STYLES_GROUP,
				PreferenceConstants.BASICSTYLES_GROUP_ENABLEMENT_LABEL,
				basicStylesGroupItems
			));
		
		List<EditorItem> cleanUpGroupItems = new ArrayList<>();
		cleanUpGroupItems.add(new EditorItem(PreferenceConstants.CLEANUP_GROUP_ENABLEMENT_ID,
				PreferenceConstants.REMOVEFORMAT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.REMOVE_FORMAT,
				PreferenceConstants.REMOVEFORMAT_ITEM_ENABLEMENT_LABEL
			));
		cleanUpGroupItems.add(new EditorItem(PreferenceConstants.CLEANUP_GROUP_ENABLEMENT_ID,
				PreferenceConstants.COPYFORMAT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.COPY_FORMAT,
				PreferenceConstants.COPYFORMAT_ITEM_ENABLEMENT_LABEL
			));
		
		basicStylesToolbarGroups.add(new EditorGroup(PreferenceConstants.BASICSTYLES_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.CLEANUP_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.CLEANUP_GROUP,
				PreferenceConstants.CLEANUP_GROUP_ENABLEMENT_LABEL,
				cleanUpGroupItems
			));
		
		toolbars.add(new EditorToolbar(null,
				PreferenceConstants.BASICSTYLES_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.BASIC_STYLES_TOOLBAR,
				PreferenceConstants.BASICSTYLES_TOOLBAR_ENABLEMENT_LABEL,
				basicStylesToolbarGroups
			));
		
		// PARAGRAPH TOOLBAR
		List<EditorItem> listGroupItems = new ArrayList<>();
		listGroupItems.add(new EditorItem(PreferenceConstants.LIST_GROUP_ENABLEMENT_ID,
				PreferenceConstants.NUMBEREDLIST_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.NUMBERED_LIST,
				PreferenceConstants.NUMBEREDLIST_ITEM_ENABLEMENT_LABEL
			));
		listGroupItems.add(new EditorItem(PreferenceConstants.LIST_GROUP_ENABLEMENT_ID,
				PreferenceConstants.BULLETEDLIST_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.BULLETED_LIST,
				PreferenceConstants.BULLETEDLIST_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> paragraphToolbarGroups = new ArrayList<>();
		paragraphToolbarGroups.add(new EditorGroup(PreferenceConstants.PARAGRAPH_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.LIST_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.LIST_GROUP,
				PreferenceConstants.LIST_GROUP_ENABLEMENT_LABEL,
				listGroupItems
			));
		
		List<EditorItem> indentGroupItems = new ArrayList<>();
		indentGroupItems.add(new EditorItem(PreferenceConstants.INDENT_GROUP_ENABLEMENT_ID,
				PreferenceConstants.INDENT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.INDENT,
				PreferenceConstants.INDENT_ITEM_ENABLEMENT_LABEL
			));
		indentGroupItems.add(new EditorItem(PreferenceConstants.INDENT_GROUP_ENABLEMENT_ID,
				PreferenceConstants.OUTINDENT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.OUT_INDENT,
				PreferenceConstants.OUTINDENT_ITEM_ENABLEMENT_LABEL
			));
		
		paragraphToolbarGroups.add(new EditorGroup(PreferenceConstants.PARAGRAPH_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.INDENT_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.INDENT_GROUP,
				PreferenceConstants.INDENT_GROUP_ENABLEMENT_LABEL,
				indentGroupItems
			));
		
		List<EditorItem> blockGroupItems = new ArrayList<>();
		blockGroupItems.add(new EditorItem(PreferenceConstants.BLOCK_GROUP_ENABLEMENT_ID,
				PreferenceConstants.BLOCKQUOTE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.BLOCK_QUOTE,
				PreferenceConstants.BLOCKQUOTE_ITEM_ENABLEMENT_LABEL
			));
		blockGroupItems.add(new EditorItem(PreferenceConstants.BLOCK_GROUP_ENABLEMENT_ID,
				PreferenceConstants.CREATEDIV_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.CREATE_DIV,
				PreferenceConstants.CREATEDIV_ITEM_ENABLEMENT_LABEL
			));
		
		paragraphToolbarGroups.add(new EditorGroup(PreferenceConstants.PARAGRAPH_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.BLOCK_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.BLOCKS_GROUP,
				PreferenceConstants.BLOCK_GROUP_ENABLEMENT_LABEL,
				blockGroupItems
			));
		
		List<EditorItem> alignGroupItems = new ArrayList<>();
		alignGroupItems.add(new EditorItem(PreferenceConstants.ALIGN_GROUP_ENABLEMENT_ID,
				PreferenceConstants.JUSTIFYLEFT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.JUSTIFY_LEFT,
				PreferenceConstants.JUSTIFYLEFT_ITEM_ENABLEMENT_LABEL
			));
		alignGroupItems.add(new EditorItem(PreferenceConstants.ALIGN_GROUP_ENABLEMENT_ID,
				PreferenceConstants.JUSTIFYCENTER_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.JUSTIFY_CENTER,
				PreferenceConstants.JUSTIFYCENTER_ITEM_ENABLEMENT_LABEL
			));
		alignGroupItems.add(new EditorItem(PreferenceConstants.ALIGN_GROUP_ENABLEMENT_ID,
				PreferenceConstants.JUSTIFYRIGHT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.JUSTIFY_RIGHT,
				PreferenceConstants.JUSTIFYRIGHT_ITEM_ENABLEMENT_LABEL
			));
		alignGroupItems.add(new EditorItem(PreferenceConstants.ALIGN_GROUP_ENABLEMENT_ID,
				PreferenceConstants.JUSTIFYBLOCK_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.JUSTIFY_BLOCK,
				PreferenceConstants.JUSTIFYBLOCK_ITEM_ENABLEMENT_LABEL
			));
		
		paragraphToolbarGroups.add(new EditorGroup(PreferenceConstants.PARAGRAPH_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.ALIGN_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.ALIGN_GROUP,
				PreferenceConstants.ALIGN_GROUP_ENABLEMENT_LABEL,
				alignGroupItems
			));

		List<EditorItem> bidiGroupItems = new ArrayList<>();
		bidiGroupItems.add(new EditorItem(PreferenceConstants.BIDI_GROUP_ENABLEMENT_ID,
				PreferenceConstants.BIDILTR_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.BIDI_LTR,
				PreferenceConstants.BIDILTR_ITEM_ENABLEMENT_LABEL
			));
		bidiGroupItems.add(new EditorItem(PreferenceConstants.BIDI_GROUP_ENABLEMENT_ID,
				PreferenceConstants.BIDIRTL_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.BIDI_RTL,
				PreferenceConstants.BIDIRTL_ITEM_ENABLEMENT_LABEL
			));
		bidiGroupItems.add(new EditorItem(PreferenceConstants.BIDI_GROUP_ENABLEMENT_ID,
				PreferenceConstants.LANGUAGE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.LANGUAGE,
				PreferenceConstants.LANGUAGE_ITEM_ENABLEMENT_LABEL
			));
		
		paragraphToolbarGroups.add(new EditorGroup(PreferenceConstants.PARAGRAPH_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.BIDI_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.BIDI_GROUP,
				PreferenceConstants.BIDI_GROUP_ENABLEMENT_LABEL,
				bidiGroupItems
			));
		
		toolbars.add(new EditorToolbar(null,
				PreferenceConstants.PARAGRAPH_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.PARAGRAPH_TOOLBAR,
				PreferenceConstants.PARAGRAPH_TOOLBAR_ENABLEMENT_LABEL,
				paragraphToolbarGroups
			));
		

		// INSERT TOOLBAR
		List<EditorItem> insertGroupItems = new ArrayList<>();
		insertGroupItems.add(new EditorItem(PreferenceConstants.INSERT_GROUP_ENABLEMENT_ID,
				PreferenceConstants.TABLE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.TABLE,
				PreferenceConstants.TABLE_ITEM_ENABLEMENT_LABEL
			));
		insertGroupItems.add(new EditorItem(PreferenceConstants.INSERT_GROUP_ENABLEMENT_ID,
				PreferenceConstants.HORIZONTALRULE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.HORIZONTAL_RULE,
				PreferenceConstants.HORIZONTALRULE_ITEM_ENABLEMENT_LABEL
			));
		insertGroupItems.add(new EditorItem(PreferenceConstants.INSERT_GROUP_ENABLEMENT_ID,
				PreferenceConstants.SPECIALCHAR_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SPECIAL_CHAR,
				PreferenceConstants.SPECIALCHAR_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> insertToolbarGroups = new ArrayList<>();
		insertToolbarGroups.add(new EditorGroup(PreferenceConstants.INSERT_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.INSERT_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.INSERT_GROUP,
				PreferenceConstants.INSERT_GROUP_ENABLEMENT_LABEL,
				insertGroupItems
			));
		
		toolbars.add(new EditorToolbar(null,
				PreferenceConstants.INSERT_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.INSERT_TOOLBAR,
				PreferenceConstants.INSERT_TOOLBAR_ENABLEMENT_LABEL,
				insertToolbarGroups
			));
		
		// STYLES TOOLBAR
		List<EditorItem> stylesGroupItems = new ArrayList<>();
		stylesGroupItems.add(new EditorItem(PreferenceConstants.STYLES_GROUP_ENABLEMENT_ID,
				PreferenceConstants.STYLES_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.STYLES,
				PreferenceConstants.STYLES_ITEM_ENABLEMENT_LABEL
			));
		stylesGroupItems.add(new EditorItem(PreferenceConstants.STYLES_GROUP_ENABLEMENT_ID,
				PreferenceConstants.FORMAT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.FORMAT,
				PreferenceConstants.FORMAT_ITEM_ENABLEMENT_LABEL
			));
		stylesGroupItems.add(new EditorItem(PreferenceConstants.STYLES_GROUP_ENABLEMENT_ID,
				PreferenceConstants.FONT_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.FONT,
				PreferenceConstants.FONT_ITEM_ENABLEMENT_LABEL
			));
		stylesGroupItems.add(new EditorItem(PreferenceConstants.STYLES_GROUP_ENABLEMENT_ID,
				PreferenceConstants.FONTSIZE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.FONT_SIZE,
				PreferenceConstants.FONTSIZE_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> stylesToolbarGroups = new ArrayList<>();
		stylesToolbarGroups.add(new EditorGroup(PreferenceConstants.STYLES_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.STYLES_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.STYLES_GROUP,
				PreferenceConstants.STYLES_GROUP_ENABLEMENT_LABEL,
				stylesGroupItems
			));
		
		toolbars.add(new EditorToolbar(null,
				PreferenceConstants.STYLES_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.STYLES_TOOLBAR,
				PreferenceConstants.STYLES_TOOLBAR_ENABLEMENT_LABEL,
				stylesToolbarGroups
			));
		
		// COLORS TOOLBAR
		List<EditorItem> colorsGroupItems = new ArrayList<>();
		colorsGroupItems.add(new EditorItem(PreferenceConstants.COLORS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.TEXTCOLOR_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.TEXT_COLOR,
				PreferenceConstants.TEXTCOLOR_ITEM_ENABLEMENT_LABEL
			));
		colorsGroupItems.add(new EditorItem(PreferenceConstants.COLORS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.BGCOLOR_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.BG_COLOR,
				PreferenceConstants.BGCOLOR_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> colorsToolbarGroups = new ArrayList<>();
		colorsToolbarGroups.add(new EditorGroup(PreferenceConstants.COLORS_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.COLORS_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.COLORS_GROUP,
				PreferenceConstants.COLORS_GROUP_ENABLEMENT_LABEL,
				colorsGroupItems
			));
		
		toolbars.add(new EditorToolbar(null,
				PreferenceConstants.COLORS_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.COLORS_TOOLBAR,
				PreferenceConstants.COLORS_TOOLBAR_ENABLEMENT_LABEL,
				colorsToolbarGroups
			));
		
		// TOOLS TOOLBAR
		List<EditorItem> toolsGroupItems = new ArrayList<>();
		toolsGroupItems.add(new EditorItem(PreferenceConstants.TOOLS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.MAXIMIZE_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.MAXIMIZE,
				PreferenceConstants.MAXIMIZE_ITEM_ENABLEMENT_LABEL
			));
		toolsGroupItems.add(new EditorItem(PreferenceConstants.TOOLS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.SHOWBLOCKS_ITEM_ENABLEMENT_ID,
				MDERichTextConstants.SHOWBLOCKS,
				PreferenceConstants.SHOWBLOCKS_ITEM_ENABLEMENT_LABEL
			));
		
		List<EditorGroup> toolsToolbarGroups = new ArrayList<>();
		toolsToolbarGroups.add(new EditorGroup(PreferenceConstants.TOOLS_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.TOOLS_GROUP_ENABLEMENT_ID,
				MDERichTextConstants.TOOLS_GROUP,
				PreferenceConstants.TOOLS_GROUP_ENABLEMENT_LABEL,
				toolsGroupItems
			));
		
		toolbars.add(new EditorToolbar(null,
				PreferenceConstants.TOOLS_TOOLBAR_ENABLEMENT_ID,
				MDERichTextConstants.TOOLS_TOOLBAR,
				PreferenceConstants.TOOLS_TOOLBAR_ENABLEMENT_LABEL,
				toolsToolbarGroups
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
	
	public EditorModelNode getNode(String id)
	{
		List<EditorToolbar> instanceToolbars = INSTANCE.getToolbars();
		
		
		for (EditorToolbar toolbar : instanceToolbars)
		{
			if (id.equals(toolbar.getId()))
			{
				return toolbar;
			}
			for (EditorGroup group : toolbar.getGroups())
			{
				if (group.getId().equals(id))
				{
					return group;
				}
				for (EditorItem item : group.getItems())
				{
					if (item.getId().equals(id))
					{
						return item;
					}
				}
			}
		}
		return null;
	}
}
