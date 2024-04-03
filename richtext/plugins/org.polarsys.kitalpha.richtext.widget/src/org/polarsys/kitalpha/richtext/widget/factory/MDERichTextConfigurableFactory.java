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
import org.polarsys.kitalpha.richtext.common.util.MDERichTextHelper;
import org.polarsys.kitalpha.richtext.nebula.widget.MDENebulaBasedRichTextWidget;
import org.polarsys.kitalpha.richtext.nebula.widget.MDENebulaRichTextConfiguration;
import org.polarsys.kitalpha.richtext.nebula.widget.MDERichTextConstants;
import org.polarsys.kitalpha.richtext.widget.MDERichtextWidgetImpl;
import org.polarsys.kitalpha.richtext.widget.configurable.editormodel.EditorGroup;
import org.polarsys.kitalpha.richtext.widget.configurable.editormodel.EditorItem;
import org.polarsys.kitalpha.richtext.widget.configurable.editormodel.EditorModel;
import org.polarsys.kitalpha.richtext.widget.configurable.editormodel.EditorToolbar;
import org.polarsys.kitalpha.richtext.widget.editor.tools.OpenInEditorHandler;
import org.polarsys.kitalpha.richtext.widget.internal.Activator;

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
		
		configuration.removeDefaultToolbarButton(MDERichTextConstants.FLASH);
		configuration.removeDefaultToolbarButton(MDERichTextConstants.IFRAME);
		configuration.removeDefaultToolbarButton(MDERichTextConstants.IMAGE);
		configuration.removeDefaultToolbarButton(MDERichTextConstants.PAGE_BREAK);
		configuration.removeDefaultToolbarButton(MDERichTextConstants.SMILEYS);

		MDERichtextWidgetImpl widget;
		
		if (style != -1)
		{
			widget = new MDERichtextWidgetImpl(parent, configuration, style);
		}
		else
		{
			widget = new MDERichtextWidgetImpl(parent, configuration);
		}
		
		addEditorToolbarItems(widget);
		return widget;
	}
	
	@Override
	protected void addEditorToolbarItems(MDENebulaBasedRichTextWidget widget) {
		super.addEditorToolbarItems(widget);
		widget.addToolbarItem(widget, MDERichTextConstants.MDE_OPEN_EDITOR, MDERichTextConstants.MDE_OPEN_EDITOR, "Open in Editor", //$NON-NLS-1$ 
				MDERichTextConstants.MDE_ENABLE_EDITING_TOOLBAR,
				MDERichTextHelper.getURL(Activator.PLUGIN_ID, "icons/openInEditor.gif"), //$NON-NLS-1$
				new OpenInEditorHandler());
	}
	
	
	public static boolean isConfigurableRTEActivated()
	{
		EditorItem globalEnablementItem = EditorModel.INSTANCE.getGlobalEnablementItem();
		
		return EditorModel.INSTANCE.isNodeToBeActivated(globalEnablementItem);
	}
}
