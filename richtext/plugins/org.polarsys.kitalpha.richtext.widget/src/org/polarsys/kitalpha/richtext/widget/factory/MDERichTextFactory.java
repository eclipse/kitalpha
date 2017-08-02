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
package org.polarsys.kitalpha.richtext.widget.factory;

import java.io.IOException;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.FileLocator;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.common.util.MDERichTextHelper;
import org.eclipse.nebula.widgets.richtext.RichTextEditorConfiguration;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.richtext.mde.tools.images.handlers.AddImageHandler;
import org.polarsys.kitalpha.richtext.mde.tools.links.handlers.AddLinkHandler;
import org.polarsys.kitalpha.richtext.mde.tools.misc.handlers.ClearContentHandler;
import org.polarsys.kitalpha.richtext.mde.tools.utils.Constants;
import org.polarsys.kitalpha.richtext.nebula.widget.MDENebulaBasedRichTextWidget;
import org.polarsys.kitalpha.richtext.nebula.widget.MDENebulaRichTextConfiguration;
import org.polarsys.kitalpha.richtext.nebula.widget.MDERichTextConstants;
import org.polarsys.kitalpha.richtext.widget.MDERichtextWidgetImpl;
import org.polarsys.kitalpha.richtext.widget.editor.tools.OpenInEditorHandler;
import org.polarsys.kitalpha.richtext.widget.internal.Activator;

/**
 * Factory to create and configure MDE rich Text
 * 
 * @author Faycal Abka
 *
 */
public class MDERichTextFactory {
	
	private final MDENebulaRichTextConfiguration configuration;
	
	public MDERichTextFactory(){
		this.configuration = new MDENebulaRichTextConfiguration();
		initializeDefaultConfiguration();
	}
	
	
	/**
	 * Create a factory with basepath to handle relative path
	 * @param basePath
	 */
	public MDERichTextFactory(String basePath){
		this();
		setBaseHrefPath(basePath);
	}
	
	
	/**
	 * Put a list of configurations here
	 */
	protected void initializeDefaultConfiguration() {
		configuration.setOption(MDERichTextConstants.READ_ONLY_MODE, false);
		configuration.setOption(MDERichTextConstants.PAST_FROM_MS_WORD_PROMPT_CLEANUP, false);
	}

	public MDERichTextWidget createEditorRichTextWidget(Composite parent){
		initializeMDEDefaultToolbar(false);

		MDERichtextWidgetImpl widget = new MDERichtextWidgetImpl(parent, configuration);

		addEditorToolbarItems(widget);

		return widget;

	}
	
	
	public MDERichTextWidget createDefaultRichTextWidget(Composite parent){
		initializeMDEDefaultToolbar(true);
		
		configuration.removeToolbarItems(MDERichTextConstants.LINK, 
				MDERichTextConstants.ANCHOR, 
				MDERichTextConstants.STRIKE,
				MDERichTextConstants.PASTE_FROM_WORD,
				MDERichTextConstants.PASTE_TEXT);
		
		MDERichtextWidgetImpl widget = new MDERichtextWidgetImpl(parent, configuration);
		
		addToolbarItems(widget);
		
		return widget;
	}
	
	public MDERichTextWidget createDefaultRichTextWidget(Composite parent, int style){
		initializeMDEDefaultToolbar(true);
		
		configuration.removeToolbarItems(MDERichTextConstants.LINK, 
				MDERichTextConstants.ANCHOR, 
				MDERichTextConstants.STRIKE,
				MDERichTextConstants.PASTE_FROM_WORD,
				MDERichTextConstants.PASTE_TEXT);
		
		MDERichtextWidgetImpl widget = new MDERichtextWidgetImpl(parent, configuration, style);
		
		addToolbarItems(widget);
		
		initEditorItemStates(widget);
		
		return widget;
	}
	
	public MDERichTextWidget createMinimalRichTextWidget(Composite parent){
		initializeMDEMinimalToolbar();
		
		configuration.removeToolbarItems(MDERichTextConstants.LINK, 
				MDERichTextConstants.ANCHOR, 
				MDERichTextConstants.STRIKE,
				MDERichTextConstants.PASTE_FROM_WORD,
				MDERichTextConstants.PASTE_TEXT);
		
		MDERichtextWidgetImpl widget = new MDERichtextWidgetImpl(parent, configuration);
		
		addToolbarItems(widget);
		
		initEditorItemStates(widget);
		
		return widget;
	}
	
	public MDERichTextWidget createMinimalRichTextWidget(Composite parent, int style){
		initializeMDEMinimalToolbar();
		
		configuration.removeToolbarItems(MDERichTextConstants.LINK, 
				MDERichTextConstants.ANCHOR, 
				MDERichTextConstants.STRIKE,
				MDERichTextConstants.PASTE_FROM_WORD,
				MDERichTextConstants.PASTE_TEXT);
		
		MDERichtextWidgetImpl widget = new MDERichtextWidgetImpl(parent, configuration, style);
		
		addToolbarItems(widget);
		
		initEditorItemStates(widget);
		
		return widget;
	}

	/**
	 * Don't add open in editor tool
	 * @param widget
	 */
	protected void addEditorToolbarItems(MDENebulaBasedRichTextWidget widget) {
		/* Not need */
//		widget.addToolbarItem(widget, MDERichTextConstants.MDE_EDITABLE, 
//				MDERichTextConstants.MDE_EDITABLE, MDERichTextConstants.MDE_EDITABLE, 
//				MDERichTextConstants.MDE_ENABLE_EDITING_TOOLBAR, Constants.EDIT_ICON, new EditableModeHandler());
		widget.addToolbarItem(widget, MDERichTextConstants.MDE_CLEAN, 
				MDERichTextConstants.MDE_CLEAN, MDERichTextConstants.MDE_CLEAN, 
				MDERichTextConstants.MDE_CLEAN_TOOLBAR, Constants.CLEAR_ICON, new ClearContentHandler());
		
		widget.addToolbarItem(widget, MDERichTextConstants.MDE_ADDLINK, 
				MDERichTextConstants.MDE_ADDLINK, "Link", MDERichTextConstants.MDE_LINKS_TOOLBAR, 
				Constants.ADD_LINK_ICON, new AddLinkHandler());
		
		widget.addToolbarItem(widget, MDERichTextConstants.MDE_ADDIMAGE, 
				MDERichTextConstants.MDE_ADDIMAGE, "Add Image", MDERichTextConstants.MDE_LINKS_TOOLBAR, 
				Constants.ADD_IMAGE_ICON, new AddImageHandler());
	}

	protected void addToolbarItems(MDENebulaBasedRichTextWidget widget) {
		/* Not need */
//		widget.addToolbarItem(widget, MDERichTextConstants.MDE_EDITABLE, 
//				MDERichTextConstants.MDE_EDITABLE, MDERichTextConstants.MDE_EDITABLE, 
//				MDERichTextConstants.MDE_ENABLE_EDITING_TOOLBAR, Constants.EDIT_ICON, new EditableModeHandler());
		
		try {
			widget.addToolbarItem(widget, MDERichTextConstants.MDE_OPEN_EDITOR, MDERichTextConstants.MDE_OPEN_EDITOR, "Open in Editor", //$NON-NLS-1$ 
					MDERichTextConstants.MDE_ENABLE_EDITING_TOOLBAR, 
					FileLocator.toFileURL(MDERichTextHelper.getURL(Activator.PLUGIN_ID, "icons/openInEditor.gif")), //$NON-NLS-1$
					new OpenInEditorHandler());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		widget.addToolbarItem(widget, MDERichTextConstants.MDE_CLEAN, 
				MDERichTextConstants.MDE_CLEAN, MDERichTextConstants.MDE_CLEAN, 
				MDERichTextConstants.MDE_CLEAN_TOOLBAR, Constants.CLEAR_ICON, new ClearContentHandler());
		
		widget.addToolbarItem(widget, MDERichTextConstants.MDE_ADDLINK, 
				MDERichTextConstants.MDE_ADDLINK, "Link", MDERichTextConstants.MDE_LINKS_TOOLBAR, 
				Constants.ADD_LINK_ICON, new AddLinkHandler());
		
		widget.addToolbarItem(widget, MDERichTextConstants.MDE_ADDIMAGE, 
				MDERichTextConstants.MDE_ADDIMAGE, "Add Image", MDERichTextConstants.MDE_LINKS_TOOLBAR, 
				Constants.ADD_IMAGE_ICON, new AddImageHandler());
		
	}


	/**
	 * Initialize default toolbar items
	 * @return this factory
	 */
	protected MDERichTextFactory initializeMDEDefaultToolbar(boolean addOpenInEditor) {
		/* Not need */
//		configuration.initializeToolbarItem(MDERichTextConstants.MDE_ENABLE_EDITING_TOOLBAR, MDERichTextConstants.MDE_EDITABLE);
		
		if (addOpenInEditor){
			configuration.initializeToolbarItem(MDERichTextConstants.MDE_ENABLE_EDITING_TOOLBAR, MDERichTextConstants.MDE_OPEN_EDITOR);
		}
		configuration.initializeToolbarItem(MDERichTextConstants.STYLES_TOOLBAR);
		configuration.initializeToolbarItem(MDERichTextConstants.CLIPBOARD_TOOLBAR);
		configuration.initializeToolbarItem(MDERichTextConstants.MDE_CLEAN_TOOLBAR, MDERichTextConstants.MDE_CLEAN);
		configuration.initializeToolbarItem(MDERichTextConstants.BASIC_STYLES, 
				MDERichTextConstants.BOLD, MDERichTextConstants.ITALIC, 
				MDERichTextConstants.UNDERLINE, MDERichTextConstants.SUBSCRIPT, 
				MDERichTextConstants.SUPERSCRIPT);
		configuration.initializeToolbarItem(MDERichTextConstants.COLORS_TOOLBAR);
		configuration.initializeToolbarItem(MDERichTextConstants.PARAGRAPH_TOOLBAR, 
				MDERichTextConstants.LIST_GROUP, MDERichTextConstants.INDENT_GROUP);
		configuration.initializeToolbarItem(MDERichTextConstants.EDITING_TOOLBAR, MDERichTextConstants.FIND);
		configuration.initializeToolbarItem(MDERichTextConstants.MDE_LINKS_TOOLBAR, MDERichTextConstants.MDE_ADDLINK);
		configuration.initializeToolbarItem(MDERichTextConstants.MDE_LINKS_TOOLBAR, MDERichTextConstants.MDE_ADDIMAGE);

		configuration.removeToolbarItems(MDERichTextConstants.LINK, 
				MDERichTextConstants.ANCHOR, 
				MDERichTextConstants.STRIKE,
				MDERichTextConstants.PASTE_FROM_WORD,
				MDERichTextConstants.PASTE_TEXT);
		
		
		return this;
	}

	

	protected MDERichTextFactory initializeMDEMinimalToolbar(){
		/* Not need */
//		configuration.initializeToolbarItem(MDERichTextConstants.MDE_ENABLE_EDITING_TOOLBAR, MDERichTextConstants.MDE_EDITABLE);
		configuration.initializeToolbarItem(MDERichTextConstants.MDE_ENABLE_EDITING_TOOLBAR, MDERichTextConstants.MDE_OPEN_EDITOR);
		configuration.initializeToolbarItem(MDERichTextConstants.STYLES_TOOLBAR);
		configuration.initializeToolbarItem(MDERichTextConstants.BASIC_STYLES, 
				MDERichTextConstants.LIST_GROUP);
		configuration.initializeToolbarItem(MDERichTextConstants.MDE_LINKS_TOOLBAR, MDERichTextConstants.MDE_ADDLINK);
		
		return this;
	}
	
	
	private void initEditorItemStates(MDERichTextWidget editor) {
		editor.setToolbarItemState(MDERichTextConstants.MDE_EDITABLE, MDERichTextConstants.STATE_ON);
	}
	
	/**
	 * See: {@link org.polarsys.kitalpha.richtext.widget.factories.MDERichTextFactory.initializeToolbarItem(String, String...)}
	 * @param toolbar
	 * @param items
	 * @return
	 */
	public MDERichTextFactory initializeToolbarItem(String toolbar, String... items){
		configuration.initializeToolbarItem(toolbar, items);
		return this;
	}
	
	/**
	 * Set the color of the toolbar
	 * @param hexaCode with format: #XXXXXX and X is hexadecimal number [0-F]. Otherwise, the behavior is unexpected
	 * @return this factory
	 */
	public MDERichTextFactory setToolbarColor(String hexaCode){
		Assert.isNotNull(hexaCode);
		configuration.setOption(MDERichTextConstants.TOOLBAR_COLOR, hexaCode);
		return this;
	}
	
	/**
	 * Set default configuration file of the underlying editor
	 * cf. CKEditor configuration for more information about configuration of the
	 * editor
	 * @param path
	 * @return this factory
	 */
	public MDERichTextFactory setConfigurationFile(String path){
		configuration.setOption(MDERichTextConstants.CUSTOM_CONFIG, path);
		return this;
	}
	
	public MDERichTextFactory setToolbarPosition(String position){
		configuration.setToolbarPosition(position);
		return this;
	}
	
	public MDERichTextFactory setBaseHrefPath(String basePath){
		configuration.setOption(MDERichTextConstants.BASE_HREF, basePath);
		return this;
	}
	
	public RichTextEditorConfiguration getConfiguration(){
		return configuration;
	}
	
}
