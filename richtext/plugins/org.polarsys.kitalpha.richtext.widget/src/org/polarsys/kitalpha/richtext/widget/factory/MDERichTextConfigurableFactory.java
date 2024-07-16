/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.richtext.widget.factory;

import org.eclipse.nebula.widgets.richtext.RichTextEditorConfiguration;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.nebula.widget.MDENebulaRichTextConfiguration;
import org.polarsys.kitalpha.richtext.nebula.widget.MDERichTextConstants;
import org.polarsys.kitalpha.richtext.widget.MDERichtextWidgetImpl;
import org.polarsys.kitalpha.richtext.widget.configurable.editormodel.EditorGroup;
import org.polarsys.kitalpha.richtext.widget.configurable.editormodel.EditorItem;
import org.polarsys.kitalpha.richtext.widget.configurable.editormodel.EditorModel;
import org.polarsys.kitalpha.richtext.widget.configurable.editormodel.EditorToolbar;

public class MDERichTextConfigurableFactory extends MDERichTextFactory {
	public MDERichTextWidget createPreferencesCompliantRichTextWidget(Composite parent) {
		return createPreferencesCompliantRichTextWidget(parent, -1);
	}
	
	public MDERichTextWidget createPreferencesCompliantRichTextWidget(Composite parent, int style) {

		EditorModel editorModel = EditorModel.getInstance();
		MDENebulaRichTextConfiguration configuration = (MDENebulaRichTextConfiguration) super.getConfiguration();
		
		if (editorModel.areAllNodesToBeDisabled())
		{
			HintNoItemDialog dialog = new HintNoItemDialog(Display.getDefault().getActiveShell());
			dialog.open();
		}
		
		configureRichTextEditorToolbar(editorModel, configuration);
		
		// Remove systematically when we configure the rich text editor
		configuration.setOption(RichTextEditorConfiguration.REMOVE_PLUGINS, MDERichTextConstants.SMILEYS);
		configuration.removeToolbarItems(MDERichTextConstants.FLASH);
		configuration.removeToolbarItems(MDERichTextConstants.IFRAME);
		configuration.removeToolbarItems(MDERichTextConstants.IMAGE);
		configuration.removeToolbarItems(MDERichTextConstants.PAGE_BREAK);
		configuration.removeToolbarItems(MDERichTextConstants.SMILEYS);

		MDERichtextWidgetImpl widget;
		
		if (style != -1)
		{
			widget = new MDERichtextWidgetImpl(parent, configuration, style);
		}
		else
		{
			widget = new MDERichtextWidgetImpl(parent, configuration);
		}
		
		addToolbarItems(widget);
		return widget;
	}

	
	/**
	 * Configure richtext editor toolbar
	 * 
	 * @param editorModel the editor model
	 * @param configuration the richtext editor configuration
	 */
	protected void configureRichTextEditorToolbar(EditorModel editorModel, MDENebulaRichTextConfiguration configuration) {
		for (EditorToolbar toolbar : editorModel.getToolbars())
		{
			boolean toolbarIsActivated = editorModel.isNodeToBeActivated(toolbar);
			
			for (EditorGroup group : toolbar.getGroups())
			{
				configureRichTextToolbarGroup(editorModel, configuration, toolbar, toolbarIsActivated, group);
			}
		}
	}

	/**
	 * Configure toolbar group
	 * 
	 * @param editorModel the editor model
	 * @param configuration the richtext configuration
	 * @param toolbar the current toolbar
	 * @param isToolbarActivated whether the toolbar is active
	 * @param group the current group to configure
	 */
	protected void configureRichTextToolbarGroup(EditorModel editorModel, MDENebulaRichTextConfiguration configuration,
			EditorToolbar toolbar, boolean isToolbarActivated, EditorGroup group) {
		boolean groupIsActivated = isToolbarActivated && editorModel.isNodeToBeActivated(group);
		
		if(groupIsActivated)
		{
			configuration.initializeToolbarItem(toolbar.getRteId(), group.getRteId());	
		}
		else
		{
			configuration.removeToolbarItems(group.getRteId());
		}
		
		for (EditorItem item : group.getItems())
		{
			configureRichTextToolbarGroupItem(editorModel, configuration, toolbar, groupIsActivated, item);
		}
	}

	/**
	 * Configure the group item
	 * 
	 * @param editorModel the editor model
	 * @param configuration the richtext configuration
	 * @param toolbar the current toolbar
	 * @param isGroupActivated whether the item's group is activated
	 * @param item the current item to configure
	 */
	protected void configureRichTextToolbarGroupItem(EditorModel editorModel,
			MDENebulaRichTextConfiguration configuration, EditorToolbar toolbar, boolean isGroupActivated,
			EditorItem item) {
		boolean itemIsActivated = isGroupActivated && editorModel.isNodeToBeActivated(item);
		
		if (itemIsActivated)
		{
			configuration.initializeToolbarItem(toolbar.getRteId(), item.getRteId());
		}
		else
		{
			configuration.removeToolbarItems(item.getRteId());
		}
	}
	
	
	public static boolean isConfigurableRTEActivated()
	{
		EditorItem globalEnablementItem = EditorModel.getInstance().getGlobalEnablementItem();
		
		return EditorModel.getInstance().isNodeToBeActivated(globalEnablementItem);
	}
}
