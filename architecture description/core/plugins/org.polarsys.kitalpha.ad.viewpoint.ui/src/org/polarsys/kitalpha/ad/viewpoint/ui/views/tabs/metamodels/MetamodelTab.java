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

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.metamodels;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
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
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.edit.provider.ViewpointEditPlugin;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IMetamodelHandler;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;
import org.polarsys.kitalpha.ad.viewpoint.ui.dialogs.EditorHelper;
import org.polarsys.kitalpha.ad.viewpoint.ui.dialogs.ModelFileDialog;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.AbstractTab;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.ResourceTableSorter;

/**
 * @author Thomas Guiu
 * 
 */
public class MetamodelTab extends AbstractTab {
	private static final String NAME_COLUMN = "name";

	private TableViewer metamodelViewer;
	private Button addBtn, deleteBtn, viewBtn;

	public MetamodelTab() {
		super(new MetamodelLabelProvider());
	}

	@Override
	public ISelectionProvider getSelectionProvider() {
		return metamodelViewer;
	}

	@Override
	public void createTab(FormToolkit toolkit, CTabFolder folder) {
		final Composite composite = createTab(toolkit, folder, Messages.MetamodelTab_title, ViewpointEditPlugin.INSTANCE.getImage("full/obj16/Metamodel"));
		GridLayout clayout = new GridLayout();
		clayout.numColumns = 2;
		composite.setLayout(clayout);

		metamodelViewer = new TableViewer(composite, SWT.FULL_SELECTION | SWT.BORDER);
		final Table table = metamodelViewer.getTable();
		TableLayout layout = new TableLayout();
		table.setLayout(layout);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(GridData.FILL_BOTH));
		SelectionListener headerListener = new SelectionListener2() {

			@Override
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
				metamodelViewer.refresh();
			}
		};

		TableViewerColumn nameColumn = new TableViewerColumn(metamodelViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 90, true));
		nameColumn.getColumn().addSelectionListener(headerListener);
		nameColumn.getColumn().setText(Messages.MetamodelTab_column_path_label);
		nameColumn.getColumn().setResizable(true);
		nameColumn.getColumn().setData(0);

		table.setSortColumn(nameColumn.getColumn());
		table.setSortDirection(SWT.DOWN);

		metamodelViewer.setColumnProperties(new String[] { NAME_COLUMN });

		metamodelViewer.setContentProvider(MetamodelContentProvider.INSTANCE);
		metamodelViewer.setLabelProvider(labelProvider);
		metamodelViewer.setSorter(new ResourceTableSorter());

		// buttons
		Composite btnBar = toolkit.createComposite(composite);
		btnBar.setLayout(new GridLayout());
		addBtn = toolkit.createButton(btnBar, "", SWT.PUSH);
		addBtn.setToolTipText(Messages.MetamodelTab_add_tooltip);
		addBtn.setImage(Activator.getDefault().getImage(AFImages.ADD));
		addBtn.addSelectionListener(new SelectionListener2() {

			@Override
			public void doWidgetSelected(SelectionEvent e) {
				IMetamodelHandler metamodelHandler = modelManager.getMetamodelHandler();
				URI uri = viewpoint.eResource().getURI();
				String segment = uri.segment(1);
				IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
				IProject project = root.getProject(segment);

				ModelFileDialog dialog = new ModelFileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), viewpoint, "*.ecore");

				if (dialog.open() == Window.OK) {
					ResourceSet resourceSet = viewpoint.eResource().getResourceSet();
					List<EPackage> packages = new ArrayList<EPackage>();
					for (URI euri : dialog.getResult()) {
						Resource resource = resourceSet.getResource(euri, true);
						for (EObject eobj : resource.getContents()) {
							if (eobj instanceof EPackage) {
								packages.add((EPackage) eobj);
							}
						}
					}
					metamodelHandler.addMetamodels(packages);
				}
			}
		});

		deleteBtn = toolkit.createButton(btnBar, "", SWT.PUSH);
		deleteBtn.setToolTipText(Messages.MetamodelTab_delete_tooltip);
		deleteBtn.setImage(Activator.getDefault().getImage(AFImages.DELETE));
		deleteBtn.setEnabled(false);
		deleteBtn.addSelectionListener(new SelectionListener2() {

			@Override
			public void doWidgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) metamodelViewer.getSelection();
				List<EPackage> packages = new ArrayList<EPackage>();
				for (Object obj : selection.toArray()) {
					packages.add((EPackage) obj);
				}
				IMetamodelHandler metamodelHandler = modelManager.getMetamodelHandler();
				metamodelHandler.removeMetamodels(packages);
			}
		});

		viewBtn = toolkit.createButton(btnBar, "", SWT.PUSH);
		viewBtn.setToolTipText(Messages.MetamodelTab_view_tooltip);
		viewBtn.setImage(Activator.getDefault().getImage(AFImages.VIEW));
		viewBtn.setEnabled(false);
		viewBtn.addSelectionListener(new SelectionListener2() {

			@Override
			public void doWidgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) metamodelViewer.getSelection();
				EObject obj = (EObject) selection.getFirstElement();
				URI uri = obj.eResource().getURI();
				try {
					EditorHelper.openEditor(uri);
				} catch (PartInitException e1) {
					Activator.getDefault().logError(e1);
				}
			}
		});

		metamodelViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				updateButtons((IStructuredSelection) event.getSelection());
			}
		});
	}

	@Override
	public void init() {
		IMetamodelHandler metamodelHandler = modelManager.getMetamodelHandler();
		if (metamodelHandler != null) {
			metamodelViewer.setInput(metamodelHandler);
		}
		workspaceHasChanged();
	}

	@Override
	public void workspaceHasChanged() {
		super.workspaceHasChanged();
		metamodelViewer.refresh();
		updateButtons((IStructuredSelection) metamodelViewer.getSelection());
	}

	private void updateButtons(IStructuredSelection selection) {
		boolean readOnly = getModelManager().getResourceManager().isReadOnly() || getModelManager().isLocal();
		addBtn.setEnabled(!readOnly);
		deleteBtn.setEnabled(!readOnly && !selection.isEmpty());
		viewBtn.setEnabled(selection.size() == 1 && !((EPackage) selection.getFirstElement()).eIsProxy());
	}

}
