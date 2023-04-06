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

/**
 * Constant definitions for plug-in preferences
 */
public final class PreferenceConstants {
	
	private PreferenceConstants()
	{
		/* This class does not need to be instantiated, no need for a public constructor */
	}

	public static final String PREFERENCES_PREFIX = "org.polarsys.kitalpha.richtext.widgets.preferences.";
	
	
	//****************** Global configurable feature enablement ******************//
	public static final String GLOBAL_CONFIGURABLE_ENABLEMENT_ID = PREFERENCES_PREFIX + "global_configurable_enablement";
	public static final String GLOBAL_CONFIGURABLE_ENABLEMENT_LABEL = "Allow RichTextEditor customization";
	public static final Boolean GLOBAL_CONFIGURABLE_ENABLEMENT_DEFAULT = false;
	
	
	//****************** MDE Items and toolbar ******************//

    // MDE SAVE TOOLBAR
	public static final String MDE_SAVE_TOOLBAR_ENABLEMENT_ID = PREFERENCES_PREFIX + "mdeSave_toolbar_enablement";
	public static final String MDE_SAVE_TOOLBAR_ENABLEMENT_LABEL = "MDE Save Toolbar";
	public static final Boolean MDE_SAVE_TOOLBAR_ENABLEMENT_DEFAULT = true;
	
	public static final String MDE_SAVE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "mdeSave_item_enablement";
	public static final String MDE_SAVE_ITEM_ENABLEMENT_LABEL = "MDE Save Item";
	public static final Boolean MDE_SAVE_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String MDE_REFRESH_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "mdeRefresh_item_enablement";
	public static final String MDE_REFRESH_ITEM_ENABLEMENT_LABEL = "MDE Refresh Item";
	public static final Boolean MDE_REFRESH_ITEM_ENABLEMENT_DEFAULT = true;
	
	// MDE LINKS TOOLBAR
	public static final String MDE_LINKS_TOOLBAR_ENABLEMENT_ID = PREFERENCES_PREFIX + "mdeLinks_item_enablement";
	public static final String MDE_LINKS_TOOLBAR_ENABLEMENT_LABEL = "MDE Links Toolbar";
	public static final Boolean MDE_LINKS_TOOLBAR_ENABLEMENT_DEFAULT = true;
	
	public static final String MDE_ADDLINK_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "mdeAddlink_item_enablement";
	public static final String MDE_ADDLINK_ITEM_ENABLEMENT_LABEL = "MDE AddLink Item";
	public static final Boolean MDE_ADDLINK_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String MDE_ADDIMAGE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "mdeAddimage_item_enablement";
	public static final String MDE_ADDIMAGE_ITEM_ENABLEMENT_LABEL = "MDE AddImage Item";
	public static final Boolean MDE_ADDIMAGE_ITEM_ENABLEMENT_DEFAULT = true;
	
	// MDE ENABLE EDITING TOOLBAR
	public static final String MDE_ENABLE_EDITING_TOOLBAR_ENABLEMENT_ID = PREFERENCES_PREFIX + "mdeEnableEditing_toolbar_enablement";
	public static final String MDE_ENABLE_EDITING_TOOLBAR_ENABLEMENT_LABEL = "MDE EnableEditing Toolbar";
	public static final Boolean MDE_ENABLE_EDITING_TOOLBAR_ENABLEMENT_DEFAULT = true;
	
	public static final String MDE_EDITABLE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "mdeEditable_item_enablement";
	public static final String MDE_EDITABLE_ITEM_ENABLEMENT_LABEL = "MDE Editable Item";
	public static final Boolean MDE_EDITABLE_ITEM_ENABLEMENT_DEFAULT = true;
	
	// MDE CLEAN TOOLBAR
	public static final String MDE_CLEAN_TOOLBAR_ENABLEMENT_ID = PREFERENCES_PREFIX + "mdeClean_toolbar_enablement";
	public static final String MDE_CLEAN_TOOLBAR_ENABLEMENT_LABEL = "MDE Clean Toolbar";
	public static final Boolean MDE_CLEAN_TOOLBAR_ENABLEMENT_DEFAULT = true;
	
	public static final String MDE_CLEAN_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "mdeClean_item_enablement";
	public static final String MDE_CLEAN_ITEM_ENABLEMENT_LABEL = "MDE Clean Item";
	public static final Boolean MDE_CLEAN_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String MDE_OPEN_EDITOR_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "mdeOpenEditor_item_enablement";
	public static final String MDE_OPEN_EDITOR_ITEM_ENABLEMENT_LABEL = "MDE OpenEditor Item";
	public static final Boolean MDE_OPEN_EDITOR_ITEM_ENABLEMENT_DEFAULT = true;
	
	//****************** CKEditor Items and toolbar ******************//

	// DOCUMENT TOOLBAR
	public static final String DOCUMENT_TOOLBAR_ENABLEMENT_ID = PREFERENCES_PREFIX + "document_toolbar_enablement";
	public static final String DOCUMENT_TOOLBAR_ENABLEMENT_LABEL = "Document Toolbar";
	public static final Boolean DOCUMENT_TOOLBAR_ENABLEMENT_DEFAULT = true;
	
	public static final String MODE_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "mode_group_enablement";
	public static final String MODE_GROUP_ENABLEMENT_LABEL = "Mode Group";
	public static final Boolean MODE_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String SOURCE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "source_item_enablement";
	public static final String SOURCE_ITEM_ENABLEMENT_LABEL = "Source Item";
	public static final Boolean SOURCE_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String DOCUMENT_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "document_group_enablement";
	public static final String DOCUMENT_GROUP_ENABLEMENT_LABEL = "Document Group";
	public static final Boolean DOCUMENT_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String SAVE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "save_item_enablement";
	public static final String SAVE_ITEM_ENABLEMENT_LABEL = "Save Item";
	public static final Boolean SAVE_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String NEWPAGE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "newPage_item_enablement";
	public static final String NEWPAGE_ITEM_ENABLEMENT_LABEL = "New Page Item";
	public static final Boolean NEWPAGE_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String PREVIEW_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "preview_item_enablement";
	public static final String PREVIEW_ITEM_ENABLEMENT_LABEL = "Preview Item";
	public static final Boolean PREVIEW_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String PRINT_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "print_item_enablement";
	public static final String PRINT_ITEM_ENABLEMENT_LABEL = "Print Item";
	public static final Boolean PRINT_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String DOCPROPOS_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "docProps_item_enablement";
	public static final String DOCPROPOS_ITEM_ENABLEMENT_LABEL = "DocProps Item";
	public static final Boolean DOCPROPOS_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String DOCTOOLS_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "docTools_group_enablement";
	public static final String DOCTOOLS_GROUP_ENABLEMENT_LABEL = "Document Tools Group";
	public static final Boolean DOCTOOLS_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String TEMPLATE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "template_item_enablement";
	public static final String TEMPLATE_ITEM_ENABLEMENT_LABEL = "Templates Item";
	public static final Boolean TEMPLATE_ITEM_ENABLEMENT_DEFAULT = true;
	
	// CLIPBOARD TOOLBAR
	public static final String CLIPBOARD_TOOLBAR_ENABLEMENT_ID = PREFERENCES_PREFIX + "clipboard_toolbar_enablement";
	public static final String CLIPBOARD_TOOLBAR_ENABLEMENT_LABEL = "Clipboard Toolbar";
	public static final Boolean CLIPBOARD_TOOLBAR_ENABLEMENT_DEFAULT = true;
	
	public static final String CLIPBOARD_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "clipboard_group_enablement";
	public static final String CLIPBOARD_GROUP_ENABLEMENT_LABEL = "Clipboard Group";
	public static final Boolean CLIPBOARD_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String CUT_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "cut_item_enablement";
	public static final String CUT_ITEM_ENABLEMENT_LABEL = "Cut Item";
	public static final Boolean CUT_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String COPY_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "copy_item_enablement";
	public static final String COPY_ITEM_ENABLEMENT_LABEL = "Copy Item";
	public static final Boolean COPY_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String PASTE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "paste_item_enablement";
	public static final String PASTE_ITEM_ENABLEMENT_LABEL = "Paste Item";
	public static final Boolean PASTE_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String PASTETEXT_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "pasteText_item_enablement";
	public static final String PASTETEXT_ITEM_ENABLEMENT_LABEL = "Paste Text Item";
	public static final Boolean PASTETEXT_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String PASTEWORD_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "pasteWord_item_enablement";
	public static final String PASTEWORD_ITEM_ENABLEMENT_LABEL = "Paste From Word Item";
	public static final Boolean PASTEWORD_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String UNDO_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "undo_group_enablement";
	public static final String UNDO_GROUP_ENABLEMENT_LABEL = "Undo Group";
	public static final Boolean UNDO_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String UNDO_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "undo_item_enablement";
	public static final String UNDO_ITEM_ENABLEMENT_LABEL = "Undo Item";
	public static final Boolean UNDO_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String REDO_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "redo_item_enablement";
	public static final String REDO_ITEM_ENABLEMENT_LABEL = "Redo Item";
	public static final Boolean REDO_ITEM_ENABLEMENT_DEFAULT = true;
	
	// EDITING TOOLBAR
	public static final String EDITING_TOOLBAR_ENABLEMENT_ID = PREFERENCES_PREFIX + "editing_toolbar_enablement";
	public static final String EDITING_TOOLBAR_ENABLEMENT_LABEL = "Editing Toolbar";
	public static final Boolean EDITING_TOOLBAR_ENABLEMENT_DEFAULT = true;
	
	public static final String FIND_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "find_group_enablement";
	public static final String FIND_GROUP_ENABLEMENT_LABEL = "Find Group";
	public static final Boolean FIND_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String FIND_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "find_item_enablement";
	public static final String FIND_ITEM_ENABLEMENT_LABEL = "Find Item";
	public static final Boolean FIND_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String REPLACE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "replace_item_enablement";
	public static final String REPLACE_ITEM_ENABLEMENT_LABEL = "Replace Item";
	public static final Boolean REPLACE_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String SELECTION_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "selection_group_enablement";
	public static final String SELECTION_GROUP_ENABLEMENT_LABEL = "Selection Group";
	public static final Boolean SELECTION_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String SELECTALL_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "selectAll_item_enablement";
	public static final String SELECTALL_ITEM_ENABLEMENT_LABEL = "Select all Item";
	public static final Boolean SELECTALL_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String SPELLCHECKER_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "spellchecker_group_enablement";
	public static final String SPELLCHECKER_GROUP_ENABLEMENT_LABEL = "Spellchecker Group";
	public static final Boolean SPELLCHECKER_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String SPELLCHECKER_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "spellchecker_item_enablement";
	public static final String SPELLCHECKER_ITEM_ENABLEMENT_LABEL = "Spell checker Item";
	public static final Boolean SPELLCHECKER_ITEM_ENABLEMENT_DEFAULT = true;
	
	// FORMS TOOLBAR
	public static final String FORMS_TOOLBAR_ENABLEMENT_ID = PREFERENCES_PREFIX + "forms_toolbar_enablement";
	public static final String FORMS_TOOLBAR_ENABLEMENT_LABEL = "Forms Toolbar";
	public static final Boolean FORMS_TOOLBAR_ENABLEMENT_DEFAULT = true;
	
	public static final String FORMS_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "forms_group_enablement";
	public static final String FORMS_GROUP_ENABLEMENT_LABEL = "Forms Group";
	public static final Boolean FORMS_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String FORM_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "form_item_enablement";
	public static final String FORM_ITEM_ENABLEMENT_LABEL = "Form Item";
	public static final Boolean FORM_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String CHECKBOX_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "checkbox_item_enablement";
	public static final String CHECKBOX_ITEM_ENABLEMENT_LABEL = "Checkbox Item";
	public static final Boolean CHECKBOX_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String RADIO_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "radio_item_enablement";
	public static final String RADIO_ITEM_ENABLEMENT_LABEL = "Radio Item";
	public static final Boolean RADIO_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String TEXTFIELD_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "textfield_item_enablement";
	public static final String TEXTFIELD_ITEM_ENABLEMENT_LABEL = "Textfield Item";
	public static final Boolean TEXTFIELD_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String TEXTAREA_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "textarea_item_enablement";
	public static final String TEXTAREA_ITEM_ENABLEMENT_LABEL = "Textarea Item";
	public static final Boolean TEXTAREA_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String SELECT_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "select_item_enablement";
	public static final String SELECT_ITEM_ENABLEMENT_LABEL = "Select Item";
	public static final Boolean SELECT_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String BUTTON_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "button_item_enablement";
	public static final String BUTTON_ITEM_ENABLEMENT_LABEL = "Button Item";
	public static final Boolean BUTTON_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String IMAGEBUTTON_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "imageButton_item_enablement";
	public static final String IMAGEBUTTON_ITEM_ENABLEMENT_LABEL = "ImageButton Item";
	public static final Boolean IMAGEBUTTON_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String HIDDENFIELD_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "hiddenField_item_enablement";
	public static final String HIDDENFIELD_ITEM_ENABLEMENT_LABEL = "hiddenField Item";
	public static final Boolean HIDDENFIELD_ITEM_ENABLEMENT_DEFAULT = true;
	
	// BASICSTYLES TOOLBAR
	public static final String BASICSTYLES_TOOLBAR_ENABLEMENT_ID = PREFERENCES_PREFIX + "basicStyles_toolbar_enablement";
	public static final String BASICSTYLES_TOOLBAR_ENABLEMENT_LABEL = "Basic Styles Toolbar";
	public static final Boolean BASICSTYLES_TOOLBAR_ENABLEMENT_DEFAULT = true;
	
	public static final String BASICSTYLES_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "basicStyles_group_enablement";
	public static final String BASICSTYLES_GROUP_ENABLEMENT_LABEL = "Basic Styles Group";
	public static final Boolean BASICSTYLES_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String BOLD_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "bold_item_enablement";
	public static final String BOLD_ITEM_ENABLEMENT_LABEL = "Bold Item";
	public static final Boolean BOLD_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String ITALIC_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "italic_item_enablement";
	public static final String ITALIC_ITEM_ENABLEMENT_LABEL = "Italic Item";
	public static final Boolean ITALIC_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String UNDERLINE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "underline_item_enablement";
	public static final String UNDERLINE_ITEM_ENABLEMENT_LABEL = "Underline Item";
	public static final Boolean UNDERLINE_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String STRIKE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "strike_item_enablement";
	public static final String STRIKE_ITEM_ENABLEMENT_LABEL = "Strike Item";
	public static final Boolean STRIKE_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String SUBSCRIPT_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "subscript_item_enablement";
	public static final String SUBSCRIPT_ITEM_ENABLEMENT_LABEL = "Subscript Item";
	public static final Boolean SUBSCRIPT_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String SUPERSCRIPT_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "superscript_item_enablement";
	public static final String SUPERSCRIPT_ITEM_ENABLEMENT_LABEL = "Superscript Item";
	public static final Boolean SUPERSCRIPT_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String CLEANUP_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "cleanUp_group_enablement";
	public static final String CLEANUP_GROUP_ENABLEMENT_LABEL = "Cleanup Group";
	public static final Boolean CLEANUP_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String REMOVEFORMAT_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "removeFormat_item_enablement";
	public static final String REMOVEFORMAT_ITEM_ENABLEMENT_LABEL = "Remove Format Item";
	public static final Boolean REMOVEFORMAT_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String COPYFORMAT_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "copyFormat_item_enablement";
	public static final String COPYFORMAT_ITEM_ENABLEMENT_LABEL = "Copy Format Item";
	public static final Boolean COPYFORMAT_ITEM_ENABLEMENT_DEFAULT = true;
	
	// PARAGRAPH TOOLBAR
	public static final String PARAGRAPH_TOOLBAR_ENABLEMENT_ID = PREFERENCES_PREFIX + "paragraph_toolbar_enablement";
	public static final String PARAGRAPH_TOOLBAR_ENABLEMENT_LABEL = "Paragraph Toolbar";
	public static final Boolean PARAGRAPH_TOOLBAR_ENABLEMENT_DEFAULT = true;
	
	public static final String LIST_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "list_group_enablement";
	public static final String LIST_GROUP_ENABLEMENT_LABEL = "List Group";
	public static final Boolean LIST_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String NUMBEREDLIST_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "numberedList_item_enablement";
	public static final String NUMBEREDLIST_ITEM_ENABLEMENT_LABEL = "Numbered List Item";
	public static final Boolean NUMBEREDLIST_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String BULLETEDLIST_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "bulletedList_item_enablement";
	public static final String BULLETEDLIST_ITEM_ENABLEMENT_LABEL = "Bulleted List Item";
	public static final Boolean BULLETEDLIST_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String INDENT_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "indent_group_enablement";
	public static final String INDENT_GROUP_ENABLEMENT_LABEL = "Indent Group";
	public static final Boolean INDENT_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String INDENT_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "indent_item_enablement";
	public static final String INDENT_ITEM_ENABLEMENT_LABEL = "Indent Item";
	public static final Boolean INDENT_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String OUTINDENT_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "outIndent_item_enablement";
	public static final String OUTINDENT_ITEM_ENABLEMENT_LABEL = "Out Indent Item";
	public static final Boolean OUTINDENT_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String BLOCK_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "block_group_enablement";
	public static final String BLOCK_GROUP_ENABLEMENT_LABEL = "Block Group";
	public static final Boolean BLOCK_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String BLOCKQUOTE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "blockQuote_item_enablement";
	public static final String BLOCKQUOTE_ITEM_ENABLEMENT_LABEL = "Quote Block Item";
	public static final Boolean BLOCKQUOTE_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String CREATEDIV_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "createDiv_item_enablement";
	public static final String CREATEDIV_ITEM_ENABLEMENT_LABEL = "Create Div Item";
	public static final Boolean CREATEDIV_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String ALIGN_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "align_group_enablement";
	public static final String ALIGN_GROUP_ENABLEMENT_LABEL = "Align Group";
	public static final Boolean ALIGN_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String JUSTIFYLEFT_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "justifyLeft_item_enablement";
	public static final String JUSTIFYLEFT_ITEM_ENABLEMENT_LABEL = "Justify Left Item";
	public static final Boolean JUSTIFYLEFT_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String JUSTIFYCENTER_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "justifyCenter_item_enablement";
	public static final String JUSTIFYCENTER_ITEM_ENABLEMENT_LABEL = "Justify Center Item";
	public static final Boolean JUSTIFYCENTER_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String JUSTIFYRIGHT_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "justifyRight_item_enablement";
	public static final String JUSTIFYRIGHT_ITEM_ENABLEMENT_LABEL = "Justify Right Item";
	public static final Boolean JUSTIFYRIGHT_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String JUSTIFYBLOCK_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "justifyBlock_item_enablement";
	public static final String JUSTIFYBLOCK_ITEM_ENABLEMENT_LABEL = "Justify Block Item";
	public static final Boolean JUSTIFYBLOCK_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String BIDI_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "bidi_group_enablement";
	public static final String BIDI_GROUP_ENABLEMENT_LABEL = "Bidi Group";
	public static final Boolean BIDI_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String BIDILTR_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "bidiLtr_item_enablement";
	public static final String BIDILTR_ITEM_ENABLEMENT_LABEL = "Bidi LTR Item";
	public static final Boolean BIDILTR_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String BIDIRTL_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "bidiRtl_item_enablement";
	public static final String BIDIRTL_ITEM_ENABLEMENT_LABEL = "Bidi RTL Item";
	public static final Boolean BIDIRTL_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String LANGUAGE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "language_item_enablement";
	public static final String LANGUAGE_ITEM_ENABLEMENT_LABEL = "Language Item";
	public static final Boolean LANGUAGE_ITEM_ENABLEMENT_DEFAULT = true;
	
	// LINKS TOOLBAR
	public static final String LINKS_TOOLBAR_ENABLEMENT_ID = PREFERENCES_PREFIX + "links_toolbar_enablement";
	public static final String LINKS_TOOLBAR_ENABLEMENT_LABEL = "Links Toolbar";
	public static final Boolean LINKS_TOOLBAR_ENABLEMENT_DEFAULT = true;
	
	public static final String LINKS_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "links_group_enablement";
	public static final String LINKS_GROUP_ENABLEMENT_LABEL = "Links Group";
	public static final Boolean LINKS_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String LINK_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "link_item_enablement";
	public static final String LINK_ITEM_ENABLEMENT_LABEL = "Link Item";
	public static final Boolean LINK_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String UNLINK_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "unlink_item_enablement";
	public static final String UNLINK_ITEM_ENABLEMENT_LABEL = "Unlink Item";
	public static final Boolean UNLINK_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String ANCHOR_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "anchor_item_enablement";
	public static final String ANCHOR_ITEM_ENABLEMENT_LABEL = "Anchor Item";
	public static final Boolean ANCHOR_ITEM_ENABLEMENT_DEFAULT = true;
	
	// INSERT TOOLBAR
	public static final String INSERT_TOOLBAR_ENABLEMENT_ID = PREFERENCES_PREFIX + "insert_toolbar_enablement";
	public static final String INSERT_TOOLBAR_ENABLEMENT_LABEL = "Insert Toolbar";
	public static final Boolean INSERT_TOOLBAR_ENABLEMENT_DEFAULT = true;
	
	public static final String INSERT_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "insert_group_enablement";
	public static final String INSERT_GROUP_ENABLEMENT_LABEL = "Insert Group";
	public static final Boolean INSERT_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String IMAGE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "image_item_enablement";
	public static final String IMAGE_ITEM_ENABLEMENT_LABEL = "Image Item";
	public static final Boolean IMAGE_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String FLASH_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "flash_item_enablement";
	public static final String FLASH_ITEM_ENABLEMENT_LABEL = "Flash Item";
	public static final Boolean FLASH_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String TABLE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "table_item_enablement";
	public static final String TABLE_ITEM_ENABLEMENT_LABEL = "Table Item";
	public static final Boolean TABLE_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String HORIZONTALRULE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "horizontalRule_item_enablement";
	public static final String HORIZONTALRULE_ITEM_ENABLEMENT_LABEL = "Horizontal Rule Item";
	public static final Boolean HORIZONTALRULE_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String SMILEYS_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "smileys_item_enablement";
	public static final String SMILEYS_ITEM_ENABLEMENT_LABEL = "Smileys Item";
	public static final Boolean SMILEYS_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String SPECIALCHAR_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "specialChar_item_enablement";
	public static final String SPECIALCHAR_ITEM_ENABLEMENT_LABEL = "Special Char Item";
	public static final Boolean SPECIALCHAR_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String PAGEBREAK_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "pageBreak_item_enablement";
	public static final String PAGEBREAK_ITEM_ENABLEMENT_LABEL = "Page Break Item";
	public static final Boolean PAGEBREAK_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String IFRAME_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "iFrame_item_enablement";
	public static final String IFRAME_ITEM_ENABLEMENT_LABEL = "Iframe Item";
	public static final Boolean IFRAME_ITEM_ENABLEMENT_DEFAULT = true;
	
	// STYLES TOOLBAR
	public static final String STYLES_TOOLBAR_ENABLEMENT_ID = PREFERENCES_PREFIX + "styles_toolbar_enablement";
	public static final String STYLES_TOOLBAR_ENABLEMENT_LABEL = "Styles Toolbar";
	public static final Boolean STYLES_TOOLBAR_ENABLEMENT_DEFAULT = true;
	
	public static final String STYLES_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "styles_group_enablement";
	public static final String STYLES_GROUP_ENABLEMENT_LABEL = "Styles Group";
	public static final Boolean STYLES_GROUP_ENABLEMENT_DEFAULT = true;
	
	public static final String STYLES_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "styles_item_enablement";
	public static final String STYLES_ITEM_ENABLEMENT_LABEL = "Styles Item";
	public static final Boolean STYLES_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String FORMAT_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "format_item_enablement";
	public static final String FORMAT_ITEM_ENABLEMENT_LABEL = "Format Item";
	public static final Boolean FORMAT_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String FONT_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "font_item_enablement";
	public static final String FONT_ITEM_ENABLEMENT_LABEL = "Font Item";
	public static final Boolean FONT_ITEM_ENABLEMENT_DEFAULT = true;
	
	public static final String FONTSIZE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "fontSize_item_enablement";
	public static final String FONTSIZE_ITEM_ENABLEMENT_LABEL = "Font Size Item";
	public static final Boolean FONTSIZE_ITEM_ENABLEMENT_DEFAULT = true;
	
	// COLORS TOOLBAR
	public static final String COLORS_TOOLBAR_ENABLEMENT_ID = PREFERENCES_PREFIX + "colors_toolbar_enablement";
	public static final String COLORS_TOOLBAR_ENABLEMENT_LABEL = "Colors Toolbar";
	public static final Boolean COLORS_TOOLBAR_ENABLEMENT_DEFAULT = true;
		
	public static final String COLORS_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "colors_group_enablement";
	public static final String COLORS_GROUP_ENABLEMENT_LABEL = "Colors Group";
	public static final Boolean COLORS_GROUP_ENABLEMENT_DEFAULT = true;
		
	public static final String TEXTCOLOR_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "textColor_item_enablement";
	public static final String TEXTCOLOR_ITEM_ENABLEMENT_LABEL = "Text Color Item";
	public static final Boolean TEXTCOLOR_ITEM_ENABLEMENT_DEFAULT = true;
		
	public static final String BGCOLOR_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "bgColor_item_enablement";
	public static final String BGCOLOR_ITEM_ENABLEMENT_LABEL = "Background Color Item";
	public static final Boolean BGCOLOR_ITEM_ENABLEMENT_DEFAULT = true;
	
	// TOOLS TOOLBAR
	public static final String TOOLS_TOOLBAR_ENABLEMENT_ID = PREFERENCES_PREFIX + "tools_toolbar_enablement";
	public static final String TOOLS_TOOLBAR_ENABLEMENT_LABEL = "Tools Toolbar";
	public static final Boolean TOOLS_TOOLBAR_ENABLEMENT_DEFAULT = true;
		
	public static final String TOOLS_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "tools_group_enablement";
	public static final String TOOLS_GROUP_ENABLEMENT_LABEL = "Tools Group";
	public static final Boolean TOOLS_GROUP_ENABLEMENT_DEFAULT = true;
		
	public static final String MAXIMIZE_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "maximize_item_enablement";
	public static final String MAXIMIZE_ITEM_ENABLEMENT_LABEL = "Maximize Item";
	public static final Boolean MAXIMIZE_ITEM_ENABLEMENT_DEFAULT = true;
		
	public static final String SHOWBLOCKS_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "showBlocks_item_enablement";
	public static final String SHOWBLOCKS_ITEM_ENABLEMENT_LABEL = "Show Blocks Item";
	public static final Boolean SHOWBLOCKS_ITEM_ENABLEMENT_DEFAULT = true;
	
	// ABOUT TOOLBAR
	public static final String ABOUT_TOOLBAR_ENABLEMENT_ID = PREFERENCES_PREFIX + "about_toolbar_enablement";
	public static final String ABOUT_TOOLBAR_ENABLEMENT_LABEL = "About Toolbar";
	public static final Boolean ABOUT_TOOLBAR_ENABLEMENT_DEFAULT = true;
		
	public static final String ABOUT_GROUP_ENABLEMENT_ID = PREFERENCES_PREFIX + "about_group_enablement";
	public static final String ABOUT_GROUP_ENABLEMENT_LABEL = "About Group";
	public static final Boolean ABOUT_GROUP_ENABLEMENT_DEFAULT = true;
		
	public static final String ABOUT_ITEM_ENABLEMENT_ID = PREFERENCES_PREFIX + "about_item_enablement";
	public static final String ABOUT_ITEM_ENABLEMENT_LABEL = "About Item";
	public static final Boolean ABOUT_ITEM_ENABLEMENT_DEFAULT = true;
}