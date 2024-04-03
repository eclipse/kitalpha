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

package org.polarsys.kitalpha.richtext.widget.configurable.preferences.core;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.polarsys.kitalpha.richtext.widget.configurable.preferences.core");

		preferenceStore.setDefault(
				PreferenceConstants.GLOBAL_CONFIGURABLE_ENABLEMENT_ID,
				PreferenceConstants.GLOBAL_CONFIGURABLE_ENABLEMENT_DEFAULT
		);
		
		preferenceStore.setDefault(
				PreferenceConstants.MDE_SAVE_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.MDE_SAVE_TOOLBAR_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.MDE_CLEAN_GROUP_ENABLEMENT_ID,
				PreferenceConstants.MDE_CLEAN_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.MDE_SAVE_ITEM_ENABLEMENT_ID,
				PreferenceConstants.MDE_SAVE_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.MDE_SAVE_GROUP_ENABLEMENT_ID,
				PreferenceConstants.MDE_SAVE_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.MDE_REFRESH_ITEM_ENABLEMENT_ID,
				PreferenceConstants.MDE_REFRESH_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.MDE_LINKS_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.MDE_LINKS_TOOLBAR_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.MDE_LINKS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.MDE_LINKS_GROUP_ENABLEMENT_DEFAULT
				);
		preferenceStore.setDefault(
				PreferenceConstants.MDE_ADDLINK_ITEM_ENABLEMENT_ID,
				PreferenceConstants.MDE_ADDLINK_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.MDE_ADDIMAGE_ITEM_ENABLEMENT_ID,
				PreferenceConstants.MDE_ADDIMAGE_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.MDE_ENABLE_EDITING_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.MDE_ENABLE_EDITING_TOOLBAR_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.MDE_EDITABLE_GROUP_ENABLEMENT_ID,
				PreferenceConstants.MDE_EDITABLE_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.MDE_CLEAN_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.MDE_CLEAN_TOOLBAR_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.MDE_CLEAN_ITEM_ENABLEMENT_ID,
				PreferenceConstants.MDE_CLEAN_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.MDE_REFRESH_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.MDE_REFRESH_TOOLBAR_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.MDE_REFRESH_GROUP_ENABLEMENT_ID,
				PreferenceConstants.MDE_REFRESH_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.MDE_REFRESH_ITEM_ENABLEMENT_ID,
				PreferenceConstants.MDE_REFRESH_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.MDE_OPEN_EDITOR_ITEM_ENABLEMENT_ID,
				PreferenceConstants.MDE_OPEN_EDITOR_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.DOCUMENT_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.DOCUMENT_TOOLBAR_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.DOCUMENT_GROUP_ENABLEMENT_ID,
				PreferenceConstants.DOCUMENT_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.DOCTOOLS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.DOCTOOLS_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.TEMPLATE_ITEM_ENABLEMENT_ID,
				PreferenceConstants.TEMPLATE_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.CLIPBOARD_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.CLIPBOARD_TOOLBAR_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.CLIPBOARD_GROUP_ENABLEMENT_ID,
				PreferenceConstants.CLIPBOARD_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.CUT_ITEM_ENABLEMENT_ID,
				PreferenceConstants.CUT_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.COPY_ITEM_ENABLEMENT_ID,
				PreferenceConstants.COPY_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.PASTE_ITEM_ENABLEMENT_ID,
				PreferenceConstants.PASTE_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.PASTETEXT_ITEM_ENABLEMENT_ID,
				PreferenceConstants.PASTETEXT_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.PASTEWORD_ITEM_ENABLEMENT_ID,
				PreferenceConstants.PASTEWORD_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.UNDO_GROUP_ENABLEMENT_ID,
				PreferenceConstants.UNDO_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.UNDO_ITEM_ENABLEMENT_ID,
				PreferenceConstants.UNDO_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.REDO_ITEM_ENABLEMENT_ID,
				PreferenceConstants.REDO_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.EDITING_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.EDITING_TOOLBAR_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.FIND_GROUP_ENABLEMENT_ID,
				PreferenceConstants.FIND_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.FIND_ITEM_ENABLEMENT_ID,
				PreferenceConstants.FIND_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.REPLACE_ITEM_ENABLEMENT_ID,
				PreferenceConstants.REPLACE_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.SELECTION_GROUP_ENABLEMENT_ID,
				PreferenceConstants.SELECTION_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.SELECTALL_ITEM_ENABLEMENT_ID,
				PreferenceConstants.SELECTALL_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.SPELLCHECKER_GROUP_ENABLEMENT_ID,
				PreferenceConstants.SPELLCHECKER_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.SPELLCHECKER_ITEM_ENABLEMENT_ID,
				PreferenceConstants.SPELLCHECKER_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.FORMS_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.FORMS_TOOLBAR_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.FORMS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.FORMS_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.FORM_ITEM_ENABLEMENT_ID,
				PreferenceConstants.FORM_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.CHECKBOX_ITEM_ENABLEMENT_ID,
				PreferenceConstants.CHECKBOX_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.RADIO_ITEM_ENABLEMENT_ID,
				PreferenceConstants.RADIO_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.TEXTFIELD_ITEM_ENABLEMENT_ID,
				PreferenceConstants.TEXTFIELD_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.TEXTAREA_ITEM_ENABLEMENT_ID,
				PreferenceConstants.TEXTAREA_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.SELECT_ITEM_ENABLEMENT_ID,
				PreferenceConstants.SELECT_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.BUTTON_ITEM_ENABLEMENT_ID,
				PreferenceConstants.BUTTON_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.IMAGEBUTTON_ITEM_ENABLEMENT_ID,
				PreferenceConstants.IMAGEBUTTON_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.HIDDENFIELD_ITEM_ENABLEMENT_ID,
				PreferenceConstants.HIDDENFIELD_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.BASICSTYLES_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.BASICSTYLES_TOOLBAR_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.BASICSTYLES_GROUP_ENABLEMENT_ID,
				PreferenceConstants.BASICSTYLES_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.BOLD_ITEM_ENABLEMENT_ID,
				PreferenceConstants.BOLD_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.ITALIC_ITEM_ENABLEMENT_ID,
				PreferenceConstants.ITALIC_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.UNDERLINE_ITEM_ENABLEMENT_ID,
				PreferenceConstants.UNDERLINE_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.STRIKE_ITEM_ENABLEMENT_ID,
				PreferenceConstants.STRIKE_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.SUBSCRIPT_ITEM_ENABLEMENT_ID,
				PreferenceConstants.SUBSCRIPT_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.SUPERSCRIPT_ITEM_ENABLEMENT_ID,
				PreferenceConstants.SUPERSCRIPT_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.CLEANUP_GROUP_ENABLEMENT_ID,
				PreferenceConstants.CLEANUP_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.REMOVEFORMAT_ITEM_ENABLEMENT_ID,
				PreferenceConstants.REMOVEFORMAT_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.COPYFORMAT_ITEM_ENABLEMENT_ID,
				PreferenceConstants.COPYFORMAT_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.PARAGRAPH_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.PARAGRAPH_TOOLBAR_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.LIST_GROUP_ENABLEMENT_ID,
				PreferenceConstants.LIST_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.NUMBEREDLIST_ITEM_ENABLEMENT_ID,
				PreferenceConstants.NUMBEREDLIST_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.BULLETEDLIST_ITEM_ENABLEMENT_ID,
				PreferenceConstants.BULLETEDLIST_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.INDENT_GROUP_ENABLEMENT_ID,
				PreferenceConstants.INDENT_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.INDENT_ITEM_ENABLEMENT_ID,
				PreferenceConstants.INDENT_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.OUTINDENT_ITEM_ENABLEMENT_ID,
				PreferenceConstants.OUTINDENT_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.BLOCK_GROUP_ENABLEMENT_ID,
				PreferenceConstants.BLOCK_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.BLOCKQUOTE_ITEM_ENABLEMENT_ID,
				PreferenceConstants.BLOCKQUOTE_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.CREATEDIV_ITEM_ENABLEMENT_ID,
				PreferenceConstants.CREATEDIV_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.ALIGN_GROUP_ENABLEMENT_ID,
				PreferenceConstants.ALIGN_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.JUSTIFYLEFT_ITEM_ENABLEMENT_ID,
				PreferenceConstants.JUSTIFYLEFT_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.JUSTIFYCENTER_ITEM_ENABLEMENT_ID,
				PreferenceConstants.JUSTIFYCENTER_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.JUSTIFYRIGHT_ITEM_ENABLEMENT_ID,
				PreferenceConstants.JUSTIFYRIGHT_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.JUSTIFYBLOCK_ITEM_ENABLEMENT_ID,
				PreferenceConstants.JUSTIFYBLOCK_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.BIDI_GROUP_ENABLEMENT_ID,
				PreferenceConstants.BIDI_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.BIDILTR_ITEM_ENABLEMENT_ID,
				PreferenceConstants.BIDILTR_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.BIDIRTL_ITEM_ENABLEMENT_ID,
				PreferenceConstants.BIDIRTL_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.LANGUAGE_ITEM_ENABLEMENT_ID,
				PreferenceConstants.LANGUAGE_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.INSERT_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.INSERT_TOOLBAR_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.INSERT_GROUP_ENABLEMENT_ID,
				PreferenceConstants.INSERT_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.TABLE_ITEM_ENABLEMENT_ID,
				PreferenceConstants.TABLE_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.HORIZONTALRULE_ITEM_ENABLEMENT_ID,
				PreferenceConstants.HORIZONTALRULE_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.SPECIALCHAR_ITEM_ENABLEMENT_ID,
				PreferenceConstants.SPECIALCHAR_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.STYLES_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.STYLES_TOOLBAR_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.STYLES_GROUP_ENABLEMENT_ID,
				PreferenceConstants.STYLES_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.STYLES_ITEM_ENABLEMENT_ID,
				PreferenceConstants.STYLES_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.FORMAT_ITEM_ENABLEMENT_ID,
				PreferenceConstants.FORMAT_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.FONT_ITEM_ENABLEMENT_ID,
				PreferenceConstants.FONT_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.FONTSIZE_ITEM_ENABLEMENT_ID,
				PreferenceConstants.FONTSIZE_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.COLORS_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.COLORS_TOOLBAR_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.COLORS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.COLORS_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.TEXTCOLOR_ITEM_ENABLEMENT_ID,
				PreferenceConstants.TEXTCOLOR_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.BGCOLOR_ITEM_ENABLEMENT_ID,
				PreferenceConstants.BGCOLOR_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.TOOLS_TOOLBAR_ENABLEMENT_ID,
				PreferenceConstants.TOOLS_TOOLBAR_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.TOOLS_GROUP_ENABLEMENT_ID,
				PreferenceConstants.TOOLS_GROUP_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.MAXIMIZE_ITEM_ENABLEMENT_ID,
				PreferenceConstants.MAXIMIZE_ITEM_ENABLEMENT_DEFAULT
		);
		preferenceStore.setDefault(
				PreferenceConstants.SHOWBLOCKS_ITEM_ENABLEMENT_ID,
				PreferenceConstants.SHOWBLOCKS_ITEM_ENABLEMENT_DEFAULT
		);
	}
}
