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
package org.polarsys.kitalpha.richtext.widget.spi.impl;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.Assert;
import org.eclipse.nebula.widgets.richtext.RichTextEditorConfiguration;
import org.eclipse.nebula.widgets.richtext.toolbar.ToolbarButton;
import org.polarsys.kitalpha.richtext.widget.spi.MDERichTextConfiguration;
import org.polarsys.kitalpha.richtext.widget.spi.MDERichTextToolbarItemHandler;
import org.polarsys.kitalpha.richtext.widget.spi.MDERichTextWidget;

public class MDERichTextConfigurationImpl implements MDERichTextConfiguration {
	
	private final RichTextEditorConfiguration rteConfiguration;
	private final Collection<String> removedItems;
	private final Map<String, List<String>> allItems;
	private final StringBuffer toolbarGroup;
	
	private MDERichTextWidget richText; //Used by item handler
	
	public MDERichTextConfigurationImpl() {
		this.rteConfiguration = new RichTextEditorConfiguration();
		setValue(MDERichTextConstants.CUSTOM_CONFIG, MDERichTextConstants.DEFAUTL_CUSTOM_CONFIG);
		this.removedItems = new HashSet<>();
		this.allItems = new LinkedHashMap<String, List<String>>();
		this.toolbarGroup = new StringBuffer();
		this.rteConfiguration.setOption(RichTextEditorConfiguration.REMOVE_BUTTONS, ""); //$NON-NLS-1$
	}
	
	private void initializeMDEToolbarGroup(){
		setValue(RichTextEditorConfiguration.TOOLBAR_GROUPS, "[" //$NON-NLS-1$
				+ buildToolbarConfiguration()
			+ "]"); //$NON-NLS-1$
	}
	
	private String buildToolbarConfiguration(){
		toolbarGroup.setLength(0); //reset
		
		for(Entry<String, List<String>> e: allItems.entrySet()){
			String group = e.getKey();
			List<String> groupItems = e.getValue();
			
			toolbarGroup.append("{ ").append("name:'").append(group).append("'"); //$NON-NLS-1$ //$NON-NLS-2$
			if (!groupItems.isEmpty()){
				int size = groupItems.size();
				toolbarGroup.append(", groups: [ "); //$NON-NLS-1$
				for (String gi : groupItems) {
					toolbarGroup.append("'").append(gi).append("'"); //$NON-NLS-1$
					if (groupItems.indexOf(gi) != (size - 1)){
						toolbarGroup.append(","); //$NON-NLS-1$
					}
				}
				toolbarGroup.append("]"); //$NON-NLS-1$
			}
			toolbarGroup.append("},"); //$NON-NLS-1$
		}
		
		return toolbarGroup.toString();
	}
	
	@Override
	public void initializeToolbarItem(String toolbar, String...items){
		if (!allItems.containsKey(toolbar)){
			allItems.put(toolbar, new ArrayList<String>());
			doAddItems(toolbar, items);
		} else {
			doAddItems(toolbar, items);
		}
	}

	private void doAddItems(String toolbar, String... items) {
		for (String item : items) {
			allItems.get(toolbar).add(item);
		}
	}
	
	@Override
	public void addToolbarItem(String name, String command, String label, String toolbar, URL iconPath,
			MDERichTextToolbarItemHandler handler) {
		MDEToolbarItem item = new MDEToolbarItem(name, command, label, toolbar, iconPath, handler);
		this.rteConfiguration.addToolbarButton(item);
	}
	
	@Override
	public void addToolbarItem(String name, String label, String toolbar, URL iconPath, MDERichTextToolbarItemHandler handler) {
		addToolbarItem(name, name, label, toolbar, iconPath, handler);
	}

	@Override
	public void addToolbarItem(String name, String command, String label, String toolbar, URL iconPath) {
		addToolbarItem(name, command, label, toolbar, iconPath, null);
	}


	@Override
	public void setValue(String conf, Object value) {
		rteConfiguration.setOption(conf, value);
	}


	@Override
	public void removeToolbarItems(String... itemNames) {
		for (String item : itemNames) {
			removedItems.add(item);
		}
		
		StringBuilder builder = new StringBuilder("'"); //$NON-NLS-1$
		int size = removedItems.size();
		int i = 0;
		for (String removed : this.removedItems) {
			builder.append(removed);
			if (i != (size - 1)){
				builder.append(","); //$NON-NLS-1$
			}
			i++;
		}

		builder.append("'");
		setValue(RichTextEditorConfiguration.REMOVE_BUTTONS, builder.toString());
	}
	
	@Override
	public void createToolbarForWidget() {
		initializeMDEToolbarGroup();
	}
	
	public RichTextEditorConfiguration getConfigration() {
		return rteConfiguration;
	}
	
	private class MDEToolbarItem extends ToolbarButton {

		private final MDERichTextToolbarItemHandler handler;
		
		public MDEToolbarItem(String name, String command, String label, String toolbar, URL iconPath, MDERichTextToolbarItemHandler handler) {
			super(name, command, label, toolbar, iconPath);
			this.handler = handler;
		}
		
		
		@Override
		public final String getJavascriptToExecute() {
			return null;
		}
		
		@Override
		public final Object execute() {
			if (handler != null){
				handler.execute(richText);
			}
			return super.execute();
		}
	}
	
	void setRichTextEditor(MDERichTextWidget richText){
		
		Assert.isNotNull(richText);
		
		this.richText = richText;
	}

	@Override
	public void setToolbarPosition(String postion) {
		
		Assert.isNotNull(postion);
		Assert.isLegal(postion.equals(MDERichTextConstants.TOOLBAR_POSITION_TOP) || 
				postion.equals(MDERichTextConstants.TOOLBAR_POSITION_BOTTOM));
		
		setValue(MDERichTextConstants.TOOLBAR_POSITION, postion);
	}

	@Override
	public RichTextEditorConfiguration getConfiguration() {
		return this.rteConfiguration;
	}

	@Override
	public void bind2Widget(MDERichTextWidget widget) {
		this.richText = widget;		
	}
}
