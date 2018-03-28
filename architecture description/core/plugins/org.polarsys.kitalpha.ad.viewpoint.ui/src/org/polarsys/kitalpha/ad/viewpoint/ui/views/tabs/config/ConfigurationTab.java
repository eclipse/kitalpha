/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.config;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.edit.provider.ViewpointEditPlugin;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.editing.ComboStringEditingSupport;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.editing.PropertyTypeEditingSupport;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.editing.StringEditingSupport;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.AbstractTab;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.GenericHandlerContentProvider;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.ResourceTableSorter;
import org.polarsys.kitalpha.ad.viewpoint.utils.ElementHelper;

/**
 * @author Thomas Guiu
 * 
 */
public class ConfigurationTab extends AbstractTab {
	private static final String VALUE_COLUMN = "value";
	private static final String NAME_COLUMN = "name";
	private static final String DESCRIPTION_COLUMN = "description";

	private TableViewer configViewer;
	private Button addBtn, deleteBtn;

	private ComboStringEditingSupport nameEditingSupport;

	public ConfigurationTab() {
		super(new ConfigurationLabelProvider());
	}

	public ISelectionProvider getSelectionProvider() {
		return configViewer;
	}

	public void createTab(FormToolkit toolkit, CTabFolder folder) {
		final Composite composite = createTab(toolkit, folder, Messages.ConfigurationTab_title, ViewpointEditPlugin.INSTANCE.getImage("full/obj16/Property"));
		GridLayout clayout = new GridLayout();
		clayout.numColumns = 2;
		composite.setLayout(clayout);

		configViewer = new TableViewer(composite, SWT.FULL_SELECTION | SWT.BORDER);
		final Table table = configViewer.getTable();
		TableLayout layout = new TableLayout();
		table.setLayout(layout);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(GridData.FILL_BOTH));
		SelectionListener headerListener = new SelectionListener2() {

			public void doWidgetSelected(SelectionEvent e) {
				TableColumn currentSortColumn = table.getSortColumn();
				TableColumn newSortColumn = (TableColumn) e.getSource();
				if (currentSortColumn.equals(newSortColumn)) {
					int sortDirection = table.getSortDirection();
					table.setSortDirection(sortDirection == SWT.UP ? SWT.DOWN : SWT.UP);
				} else {
					table.setSortColumn(newSortColumn);
					table.setSortDirection(SWT.DOWN);
				}
				configViewer.refresh();
			}
		};

		TableViewerColumn nameColumn = new TableViewerColumn(configViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 90, true));
		nameColumn.getColumn().addSelectionListener(headerListener);
		nameColumn.getColumn().setText(Messages.ConfigurationTab_column_name_label);
		nameColumn.getColumn().setResizable(true);
		nameColumn.getColumn().setData(0);
		nameColumn.setEditingSupport(register(nameEditingSupport = new ComboStringEditingSupport(configViewer, Property.class, "name")));

		TableViewerColumn typeColumn = new TableViewerColumn(configViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 150, true));
		typeColumn.getColumn().addSelectionListener(headerListener);
		typeColumn.getColumn().setText(Messages.ConfigurationTab_column_type_label);
		typeColumn.getColumn().setResizable(true);
		typeColumn.getColumn().setData(1);
		typeColumn.setEditingSupport(register(new PropertyTypeEditingSupport(configViewer)));

		TableViewerColumn valueColumn = new TableViewerColumn(configViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 150, true));
		valueColumn.getColumn().addSelectionListener(headerListener);
		valueColumn.getColumn().setText(Messages.ConfigurationTab_column_value_label);
		valueColumn.getColumn().setResizable(true);
		valueColumn.getColumn().setData(2);
		valueColumn.setEditingSupport(register(new StringEditingSupport(configViewer, Property.class, "value")));

		TableViewerColumn descColumn = new TableViewerColumn(configViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(6, 150, true));
		descColumn.getColumn().addSelectionListener(headerListener);
		descColumn.getColumn().setText(Messages.ConfigurationTab_column_desc_label);
		descColumn.getColumn().setResizable(true);
		descColumn.getColumn().setData(3);
		descColumn.setEditingSupport(register(new StringEditingSupport(configViewer, Property.class, "description")));

		table.setSortColumn(nameColumn.getColumn());
		table.setSortDirection(SWT.DOWN);

		configViewer.setColumnProperties(new String[] { NAME_COLUMN, VALUE_COLUMN, DESCRIPTION_COLUMN });

		configViewer.setContentProvider(GenericHandlerContentProvider.INSTANCE);
		configViewer.setLabelProvider(labelProvider);
		configViewer.setSorter(new ResourceTableSorter());

		// buttons
		Composite btnBar = toolkit.createComposite(composite);
		btnBar.setLayout(new GridLayout());
		addBtn = toolkit.createButton(btnBar, "", SWT.PUSH);
		addBtn.setToolTipText(Messages.ConfigurationTab_add_tooltip);
		addBtn.setImage(Activator.getDefault().getImage(AFImages.ADD));
		addBtn.addSelectionListener(new SelectionListener2() {

			@Override
			public void doWidgetSelected(SelectionEvent e) {
				String computeNewName = ElementHelper.computeNewName(modelManager.getConfigurationHandler(), viewpoint.getId() + ".property");
				getModelManager().getConfigurationHandler().createProperty(computeNewName);
			}
		});

		deleteBtn = toolkit.createButton(btnBar, "", SWT.PUSH);
		deleteBtn.setToolTipText(Messages.ConfigurationTab_delete_tooltip);
		deleteBtn.setImage(Activator.getDefault().getImage(AFImages.DELETE));
		deleteBtn.setEnabled(false);
		deleteBtn.addSelectionListener(new SelectionListener2() {

			@Override
			public void doWidgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) configViewer.getSelection();
				List<Property> actions = new ArrayList<Property>();
				for (Object obj : selection.toArray()) {
					if (obj instanceof Property) {
						actions.add((Property) obj);
					}
				}
				modelManager.getConfigurationHandler().removeProperties(actions);
			}
		});
		configViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				updateButtons((IStructuredSelection) event.getSelection());
			}
		});
	}

	public void init() {
		configViewer.setInput(modelManager.getConfigurationHandler());
		workspaceHasChanged();
	}

	public void workspaceHasChanged() {
		super.workspaceHasChanged();
		configViewer.refresh();
		List<String> values = ElementHelper.getNamesFromParents(modelManager.getConfigurationHandler());
		nameEditingSupport.setItems(values.toArray(new String[values.size()]));
		updateButtons((IStructuredSelection) configViewer.getSelection());
	}

	private void updateButtons(IStructuredSelection selection) {
		boolean readOnly = getModelManager().getResourceManager().isReadOnly();
		addBtn.setEnabled(!readOnly);
		for (Object obj : selection.toArray()) {
			if (!modelManager.getConfigurationHandler().isRemovable((Property) obj)) {
				deleteBtn.setEnabled(false);
				return;
			}
		}
		deleteBtn.setEnabled(!readOnly && !selection.isEmpty());
	}

}
