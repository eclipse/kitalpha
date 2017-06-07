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
package org.polarsys.kitalpha.richtext.widget.spi;

import java.net.URL;

import org.eclipse.nebula.widgets.richtext.RichTextEditorConfiguration;

/**
 * Define services to configure a Rich Text widget
 * @author Faycal Abka
 *
 */
public interface MDERichTextConfiguration {
	
	/**
	 * Set a configuration value of the underlying editor (cf. http://ckeditor.com/)
	 * @param conf the name of the configuration to set
	 * @param value the value of the configuration to set
	 */
	void setValue(String conf, Object value);
	
	/**
	 * Initialize the toolbar with items
	 * @param toolbar to customize
	 * @param items item to customize
	 */
	public void initializeToolbarItem(String toolbar, String...items);
	
	/**
	 * Add a new item to toobar
	 * @param name of the item
	 * @param command name which is executed
	 * @param label tooltip of the item
	 * @param toolbar of the item
	 * @param iconPath of the item
	 * @param handler which is executed at clicking on the item
	 */
	void addToolbarItem(String name, String command, String label, String toolbar, URL iconPath, MDERichTextToolbarItemHandler handler);
	
	/**
	 * Add a new item to toolbar (The name and command are the same)
	 * @param name of the item
	 * @param label tooltip of the item
	 * @param toolbar of the item
	 * @param iconPath of the item
	 * @param handler which is executed at clicking on the item
	 */
	void addToolbarItem(String name, String label, String toolbar, URL iconPath, MDERichTextToolbarItemHandler handler);
	
	/**
	 * Add a existing item to toobar (without handler)
	 * @param name of the item
	 * @param label tooltip of the item
	 * @param toolbar of the item
	 * @param iconPath of the item
	 */
	void addToolbarItem(String name, String command, String label, String toolbar, URL iconPath);
	
	/**
	 * Remove items from the toolbars
	 * @param itemNames list of items to remove
	 */
	void removeToolbarItems(String... itemNames);
	
	/**
	 * Build well-formed String toolbar configuration with added items by add and initialize toolbar item methods
	 */
	void createToolbarForWidget();
	
	/**
	 * Set a toolbar position
	 * @param postion top or bottom values are allowed
	 */
	void setToolbarPosition(String postion);
	
	/**
	 * @return underlying configuration of the editor
	 */
	RichTextEditorConfiguration getConfiguration();
	
	/**
	 * @param widget the editor created from this configuration
	 */
	void bind2Widget(MDERichTextWidget widget);
}
