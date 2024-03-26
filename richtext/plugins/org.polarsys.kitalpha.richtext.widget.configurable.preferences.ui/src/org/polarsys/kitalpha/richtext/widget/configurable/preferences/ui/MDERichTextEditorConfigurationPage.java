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

package org.polarsys.kitalpha.richtext.widget.configurable.preferences.ui;

import java.util.Optional;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.polarsys.kitalpha.richtext.widget.configurable.editormodel.EditorGroup;
import org.polarsys.kitalpha.richtext.widget.configurable.editormodel.EditorItem;
import org.polarsys.kitalpha.richtext.widget.configurable.editormodel.EditorModel;
import org.polarsys.kitalpha.richtext.widget.configurable.editormodel.EditorModelNode;
import org.polarsys.kitalpha.richtext.widget.configurable.editormodel.EditorToolbar;
import org.polarsys.kitalpha.richtext.widget.configurable.preferences.core.PreferenceConstants;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class MDERichTextEditorConfigurationPage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {
	
	IPreferenceStore preferenceStore = null;

	public MDERichTextEditorConfigurationPage() {
		super(GRID);
		preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.polarsys.kitalpha.richtext.widget.configurable.preferences.core");
		setPreferenceStore(preferenceStore);
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors(){
		
		EditorItem globalEnablementItem = EditorModel.INSTANCE.getGlobalEnablementItem();
		
		BooleanFieldEditor globalConfigurableEnablementPreferenceField = new BooleanFieldEditor(
				globalEnablementItem.getId(),
				globalEnablementItem.getLabel(),
				getFieldEditorParent()
		);
		
		globalEnablementItem.setPreferenceField(globalConfigurableEnablementPreferenceField);
		globalEnablementItem.setParent(getFieldEditorParent());
		addField(globalConfigurableEnablementPreferenceField);
		
		for (EditorToolbar toolbar : EditorModel.INSTANCE.getToolbars())
		{
	        Composite toolbarGroup = new Composite(getFieldEditorParent(), SWT.NONE);
			GridData toolbarGroupGridData = new GridData();
			toolbarGroupGridData.verticalIndent = 20;
			toolbarGroup.setLayoutData(toolbarGroupGridData);
			
			BooleanFieldEditor toolbarPreferenceField = new BooleanFieldEditor(
					toolbar.getId(),
					toolbar.getLabel(),
					toolbarGroup
			);
			toolbar.setPreferenceField(toolbarPreferenceField);
			toolbar.setParent(toolbarGroup);
			addField(toolbarPreferenceField);
			
			for (EditorGroup group : toolbar.getGroups())
			{
		        Composite groupGroup = new Composite(toolbarGroup, SWT.NONE);
		        
				GridData groupGroupGridData = new GridData();
				groupGroupGridData.horizontalIndent = 40;
				groupGroup.setLayoutData(groupGroupGridData);
		        
				BooleanFieldEditor groupPreferenceField = new BooleanFieldEditor(
						group.getId(),
						group.getLabel(),
						groupGroup
				);
				group.setPreferenceField(groupPreferenceField);
				group.setParent(groupGroup);
				addField(groupPreferenceField);

		        Composite itemsGroup = new Composite(groupGroup, SWT.NONE);
				for (EditorItem item : group.getItems())
				{
					BooleanFieldEditor itemPreferenceField = new BooleanFieldEditor(
							item.getId(),
							item.getLabel(),
							itemsGroup
					);
					item.setPreferenceField(itemPreferenceField);
					item.setParent(itemsGroup);
					
					GridData itemsGroupGridData = new GridData();
					itemsGroupGridData.horizontalIndent = 40;
					itemsGroup.setLayoutData(itemsGroupGridData);
					
					addField(itemPreferenceField);
				}
			}
		}
	}
	
	@Override
	protected void initialize() {
		super.initialize();
		
		EditorItem globalEnablementItem = EditorModel.INSTANCE.getGlobalEnablementItem();
		boolean isEnabled = globalEnablementItem.getPreferenceField().getBooleanValue();
		if (EditorModel.INSTANCE.isNodeToBeActivated(globalEnablementItem))
		{
			for (EditorToolbar toolbar : EditorModel.INSTANCE.getToolbars())
			{
				for (EditorGroup group : toolbar.getGroups())
				{
					group.getPreferenceField().setEnabled(isEnabled, group.getParent());
					for (EditorItem item : group.getItems())
					{
						item.getPreferenceField().setEnabled(isEnabled, item.getParent());
					}
				}
			}
		}
		else
		{
			for (EditorToolbar toolbar : EditorModel.INSTANCE.getToolbars())
			{
				toolbar.getPreferenceField().setEnabled(false, toolbar.getParent());
				for (EditorGroup group : toolbar.getGroups())
				{
					group.getPreferenceField().setEnabled(false, group.getParent());
					for (EditorItem item : group.getItems())
					{
						item.getPreferenceField().setEnabled(false, item.getParent());
					}
				}
			}
		}
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		super.propertyChange(event);
		
		BooleanFieldEditor preferenceField = (BooleanFieldEditor) event.getSource();
		EditorModelNode editorModelNode = EditorModel.INSTANCE.getNode(preferenceField);
		boolean newValue = (boolean) event.getNewValue();
		
		if (editorModelNode instanceof EditorToolbar)
		{
			EditorToolbar toolbar = (EditorToolbar) editorModelNode;
			boolean toolbarValue = newValue;
			
			preferenceStore.setValue(toolbar.getId(), toolbarValue);
			toolbar.getPreferenceField().load();
			
			for (EditorGroup group : toolbar.getGroups())
			{
				preferenceStore.setValue(group.getId(), toolbarValue);
				group.getPreferenceField().load();
				boolean groupValue = group.getPreferenceField().getBooleanValue();
				for (EditorItem item : group.getItems())
				{
					boolean isEnabled;
					if (!groupValue || !toolbarValue)
					{
						isEnabled = false;
					}
					else
					{
						isEnabled = true;
					}
					preferenceStore.setValue(item.getId(), isEnabled);
					item.getPreferenceField().load();
				}
			}
		}
		else if (editorModelNode instanceof EditorGroup)
		{
			EditorGroup group = (EditorGroup) editorModelNode;
			preferenceStore.setValue(group.getId(), newValue);
			group.getPreferenceField().load();
			for (EditorItem item : group.getItems())
			{
				preferenceStore.setValue(item.getId(), newValue);
				item.getPreferenceField().load();
			}
			// Update the parent
			updateParentToolBar(group);
		}
		else if (editorModelNode instanceof EditorItem)
		{
			EditorItem changedItem = (EditorItem) editorModelNode;
			boolean isEnabled = (boolean) event.getNewValue();
			
			if (changedItem.getId() == PreferenceConstants.GLOBAL_CONFIGURABLE_ENABLEMENT_ID)
			{
				for (EditorToolbar toolbar : EditorModel.INSTANCE.getToolbars())
				{
					preferenceStore.setValue(toolbar.getId(), isEnabled);
					toolbar.getPreferenceField().load();
					toolbar.getPreferenceField().setEnabled(isEnabled, toolbar.getParent());
					for (EditorGroup group : toolbar.getGroups())
					{
						preferenceStore.setValue(group.getId(), isEnabled);
						group.getPreferenceField().load();
						group.getPreferenceField().setEnabled(isEnabled, group.getParent());
						for (EditorItem item : group.getItems())
						{
							preferenceStore.setValue(item.getId(), isEnabled);
							item.getPreferenceField().load();
							item.getPreferenceField().setEnabled(isEnabled, item.getParent());
						}
					}
				}
			} else {
				
				preferenceStore.setValue(changedItem.getId(), isEnabled);
				changedItem.getPreferenceField().load();
				
				// Update the parent
				EditorModelNode parentNode = EditorModel.INSTANCE.getNode(changedItem.getParentId());
				if (parentNode instanceof EditorGroup) {
					EditorGroup parentGroup = (EditorGroup) parentNode;
					
					// @formatter:off
					Optional<Boolean> currentParentState = parentGroup.getItems().stream()
							.map(EditorItem::getPreferenceField)
							.map(BooleanFieldEditor::getBooleanValue)
							.reduce((b1, b2) -> b1 || b2);
					// @formatter:on
					if (currentParentState.isPresent()) {
						preferenceStore.setValue(parentGroup.getId(), currentParentState.get());
						parentGroup.getPreferenceField().load();
						updateParentToolBar(parentGroup);
					}
				}
			}
		}
	}

	private void updateParentToolBar(EditorGroup group) {
		EditorModelNode parentNode = EditorModel.INSTANCE.getNode(group.getParentId());
		if (parentNode instanceof EditorToolbar) {
			EditorToolbar parentToolBar = (EditorToolbar) parentNode;
			
			// @formatter:off
			Optional<Boolean> currentParentState = parentToolBar.getGroups().stream()
					.map(EditorGroup::getPreferenceField)
					.map(BooleanFieldEditor::getBooleanValue)
					.reduce((b1, b2) -> b1 || b2);
			// @formatter:on
			if (currentParentState.isPresent()) {
				preferenceStore.setValue(parentToolBar.getId(), currentParentState.get());
				parentToolBar.getPreferenceField().load();
			}
		}
	}
	
	@Override
	public void dispose() {
		EditorItem globalEditorItem =  EditorModel.INSTANCE.getGlobalEnablementItem();
		globalEditorItem.getPreferenceField().dispose();
		
		for (EditorToolbar toolbar : EditorModel.INSTANCE.getToolbars())
		{
			for (EditorGroup group : toolbar.getGroups())
			{
				for (EditorItem item : group.getItems())
				{
					item.getPreferenceField().dispose();
				}
				group.getPreferenceField().dispose();
			}
			toolbar.getPreferenceField().dispose();
		}
		super.dispose();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		/* NOP */
	}
	
}