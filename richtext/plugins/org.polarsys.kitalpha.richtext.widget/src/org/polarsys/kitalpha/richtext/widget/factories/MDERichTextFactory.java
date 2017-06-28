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
package org.polarsys.kitalpha.richtext.widget.factories;

import java.net.URL;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.richtext.widget.spi.MDERichTextConfiguration;
import org.polarsys.kitalpha.richtext.widget.spi.MDERichTextToolbarItemHandler;
import org.polarsys.kitalpha.richtext.widget.spi.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.widget.spi.impl.MDERichTextConfigurationImpl;
import org.polarsys.kitalpha.richtext.widget.spi.impl.MDERichTextConstants;
import org.polarsys.kitalpha.richtext.widget.spi.impl.MDERichTextWidgetImpl;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.AddImageHandler;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.AddLinkHandler;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.ClearContentHandler;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.EditableModeHandler;

/**
 * Factory to create and configure MDE rich Text
 * 
 * <ol>
 * <li>TODO : Add initializeEditorToolbar() method</li>
 * </ol>
 * 
 * @author Faycal Abka
 *
 */
public class MDERichTextFactory {
	
	private final MDERichTextConfiguration configuration;
	
	public MDERichTextFactory(){
		this.configuration = new MDERichTextConfigurationImpl();
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
		//do nothing for default implementation
		configuration.setValue(MDERichTextConstants.READ_ONLY_MODE, false);
		configuration.setValue(MDERichTextConstants.PAST_FROM_MS_WORD_PROMPT_CLEANUP, false);
	}


	/**
	 * Initialize default toolbar items
	 * @return this factory
	 */
	public MDERichTextFactory initializeMDEDefaultToolbar() {
		configuration.initializeToolbarItem(MDERichTextConstants.MDE_ENABLE_EDITING_TOOLBAR, MDERichTextConstants.MDE_EDITABLE);
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
		
		
		createMDEToolbarItems();
		
		configuration.removeToolbarItems(MDERichTextConstants.LINK, 
				MDERichTextConstants.ANCHOR, 
				MDERichTextConstants.STRIKE,
				MDERichTextConstants.PASTE_FROM_WORD,
				MDERichTextConstants.PASTE_TEXT);
		
		return this;
	}


	protected void createMDEToolbarItems() {
		configuration.addToolbarItem(MDERichTextConstants.MDE_EDITABLE, 
				MDERichTextConstants.MDE_EDITABLE, MDERichTextConstants.MDE_EDITABLE, 
				MDERichTextConstants.MDE_ENABLE_EDITING_TOOLBAR, MDERichTextConstants.EDIT_ICON, new EditableModeHandler());
		configuration.addToolbarItem(MDERichTextConstants.MDE_CLEAN, 
				MDERichTextConstants.MDE_CLEAN, MDERichTextConstants.MDE_CLEAN, 
				MDERichTextConstants.MDE_CLEAN_TOOLBAR, MDERichTextConstants.CLEAR_ICON, new ClearContentHandler());
		configuration.addToolbarItem(MDERichTextConstants.MDE_ADDLINK, 
				MDERichTextConstants.MDE_ADDLINK, "Link", MDERichTextConstants.MDE_LINKS_TOOLBAR, 
				MDERichTextConstants.ADD_LINK_ICON, new AddLinkHandler());
		configuration.addToolbarItem(MDERichTextConstants.MDE_ADDIMAGE, 
				MDERichTextConstants.MDE_ADDIMAGE, "Add Image", MDERichTextConstants.MDE_LINKS_TOOLBAR, 
				MDERichTextConstants.ADD_IMAGE_ICON, new AddImageHandler());
	}
	
	
	
	/**
	 * Initialize minimal toolbar
	 * @return
	 */
	public MDERichTextFactory initializeMDEMinimalToolbar(){
		
		configuration.initializeToolbarItem(MDERichTextConstants.MDE_ENABLE_EDITING_TOOLBAR, MDERichTextConstants.MDE_EDITABLE);
		configuration.initializeToolbarItem(MDERichTextConstants.STYLES_TOOLBAR);
		configuration.initializeToolbarItem(MDERichTextConstants.CLIPBOARD_TOOLBAR);
		configuration.initializeToolbarItem(MDERichTextConstants.PARAGRAPH_TOOLBAR, 
				MDERichTextConstants.LIST_GROUP, MDERichTextConstants.INDENT_GROUP);
		configuration.initializeToolbarItem(MDERichTextConstants.MDE_LINKS_TOOLBAR, MDERichTextConstants.MDE_ADDLINK);
		
		
		configuration.removeToolbarItems(MDERichTextConstants.LINK, 
				MDERichTextConstants.ANCHOR, 
				MDERichTextConstants.STRIKE,
				MDERichTextConstants.PASTE_FROM_WORD,
				MDERichTextConstants.PASTE_TEXT);
		
		configuration.addToolbarItem(MDERichTextConstants.MDE_EDITABLE, MDERichTextConstants.MDE_EDITABLE, 
				MDERichTextConstants.MDE_EDITABLE, MDERichTextConstants.MDE_ENABLE_EDITING_TOOLBAR, 
				MDERichTextConstants.EDIT_ICON, new EditableModeHandler());
		
		configuration.addToolbarItem(MDERichTextConstants.MDE_ADDLINK, 
				MDERichTextConstants.MDE_ADDLINK, "Link", MDERichTextConstants.MDE_LINKS_TOOLBAR, 
				MDERichTextConstants.ADD_LINK_ICON, new AddLinkHandler());
		
		return this;
	}
	
	
	/**
	 * Create MDE Rich Text widget without any binding to the model element
	 * For bind the created widget, use {@link org.polarsys.kitalpha.richtext.widget.spi.impl.MDERichTextWidgetImpl.bind(EObject, EStructuralFeature)} method of
	 * the returned widget
	 * @param parent composite
	 * @return The created Rich Text widget
	 */
	public MDERichTextWidget createMDERichText(Composite parent){
		MDERichTextWidgetImpl editor = new MDERichTextWidgetImpl(parent, configuration);
		initEditorItemStates(editor);
		return editor;
	}


	private void initEditorItemStates(MDERichTextWidgetImpl editor) {
		editor.setItemState(MDERichTextConstants.MDE_EDITABLE, MDERichTextConstants.STATE_ON);
	}
	
	/**
	 * Create Rich Text widget with style without any binding to the model element
	 * For bind the created widget, use {@link org.polarsys.kitalpha.richtext.widget.spi.impl.MDERichTextWidgetImpl.bind(EObject, EStructuralFeature)} method of
	 * the returned widge
	 * @param parent composite
	 * @param style SWT style
	 * @return The created Rich Text widget
	 */
	public MDERichTextWidget createMDERichText(Composite parent, int style){
		MDERichTextWidgetImpl editor = new MDERichTextWidgetImpl(parent, configuration, style);
		initEditorItemStates(editor);
		return editor;
	}
	
	/**
	 * Create Rich Text widget with style and bind the widget to feature contaiened int owner object
	 * @param parent composite
	 * @param style SWT style
	 * @param owner not null object which hold the property where save the content
	 * @param feature not null the property where save the content
	 * @return The created Rich Text widget
	 */
	public MDERichTextWidget createMDERichText(Composite parent, int style, EObject owner, EStructuralFeature feature){
		MDERichTextWidgetImpl editor = new MDERichTextWidgetImpl(parent, configuration, style, owner, feature);
		initEditorItemStates(editor);
		return editor;
	}
	
	/**
	 * Create Rich Text widget with style and bind the widget to feature contaiened int owner object
	 * @param parent composite
	 * @param owner not null object which hold the property where save the content
	 * @param feature not null property where save the content
	 * @return The created Rich Text widget
	 */
	public MDERichTextWidget createMDERichText(Composite parent, EObject owner, EStructuralFeature feature){
		MDERichTextWidgetImpl editor = new MDERichTextWidgetImpl(parent, configuration, owner, feature);
		initEditorItemStates(editor);
		return editor;
	}
	
	/**
	 * Remove items from the toolbar
	 * @param items is list of the item's names to be remove
	 * @return this factory
	 */
	public MDERichTextFactory removeToolbarItems(String... items){
		configuration.removeToolbarItems(items);
		return this;
	}
	
	/**
	 * See {@link org.polarsys.kitalpha.richtext.widget.spi.MDERichTextConfiguration.addToolbarItem(String, String, String, String, URL, MDERichTextToolbarItemHandler)}
	 * @param name
	 * @param command
	 * @param label
	 * @param toolbar
	 * @param icon
	 * @param handler
	 * @return
	 */
	public MDERichTextFactory addToolbarItem(String name, String command, String label, String toolbar, URL icon, MDERichTextToolbarItemHandler handler){
		configuration.addToolbarItem(name, command, label, toolbar, icon, handler);
		return this;
	}
	
	/**
	 * See {@link org.polarsys.kitalpha.richtext.widget.spi.MDERichTextConfiguration.addToolbarItem(String, String, String, String, URL, MDERichTextToolbarItemHandler)}
	 * @param name
	 * @param label
	 * @param toolbar
	 * @param icon
	 * @param handler
	 * @return
	 */
	public MDERichTextFactory addToolbarItem(String name, String label, String toolbar, URL icon, MDERichTextToolbarItemHandler handler){
		configuration.addToolbarItem(name, name, label, toolbar, icon, handler);
		return this;
	}
	
	/**
	 * See {@link org.polarsys.kitalpha.richtext.widget.spi.MDERichTextConfiguration.addToolbarItem(String, String, String, String, URL)}
	 * @param name
	 * @param command
	 * @param label
	 * @param toolbar
	 * @param icon
	 * @return
	 */
	public MDERichTextFactory addToolbarItem(String name, String command, String label, String toolbar, URL icon){
		configuration.addToolbarItem(name, command, label, toolbar, icon);
		return this;
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
		configuration.setValue(MDERichTextConstants.TOOLBAR_COLOR, hexaCode);
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
		configuration.setValue(MDERichTextConstants.CUSTOM_CONFIG, path);
		return this;
	}
	
	public MDERichTextFactory setToolbarPosition(String position){
		configuration.setToolbarPosition(position);
		return this;
	}
	
	public MDERichTextFactory setBaseHrefPath(String basePath){
		configuration.setValue(MDERichTextConstants.BASE_HREF, basePath);
		return this;
	}
	
	/**
	 * @return The MDE Rich Configuration of this instance
	 */
	public MDERichTextConfiguration getConfiguration() {
		return configuration;
	}
}
