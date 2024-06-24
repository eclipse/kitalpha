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

		EditorModel editorModel = EditorModel.INSTANCE;
		MDENebulaRichTextConfiguration configuration = (MDENebulaRichTextConfiguration) super.getConfiguration();
		
		if (editorModel.areAllNodesToBeDisabled())
		{
			HintNoItemDialog dialog = new HintNoItemDialog(Display.getDefault().getActiveShell());
			dialog.open();
		}
		
		for (EditorToolbar toolbar : editorModel.getToolbars())
		{
			boolean toolbarIsActivated = editorModel.isNodeToBeActivated(toolbar);
			
			for (EditorGroup group : toolbar.getGroups())
			{
				boolean groupIsActivated = toolbarIsActivated && editorModel.isNodeToBeActivated(group);
				
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
					boolean itemIsActivated = groupIsActivated && editorModel.isNodeToBeActivated(item);
					
					if (itemIsActivated)
					{
							configuration.initializeToolbarItem(toolbar.getRteId(), item.getRteId());
					}
					else
					{
						configuration.removeToolbarItems(item.getRteId());
					}
				}
			}
		}
		
		// Remove systematically when we configure the rich text editor
		configuration.setOption(MDENebulaRichTextConfiguration.REMOVE_PLUGINS, MDERichTextConstants.SMILEYS);
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
	
	
	public static boolean isConfigurableRTEActivated()
	{
		EditorItem globalEnablementItem = EditorModel.INSTANCE.getGlobalEnablementItem();
		
		return EditorModel.INSTANCE.isNodeToBeActivated(globalEnablementItem);
	}
}
