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

package org.polarsys.kitalpha.ad.integration.sirius.views.tabs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.viewpoint.description.Group;
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
import org.polarsys.kitalpha.ad.integration.sirius.model.SiriusFactory;
import org.polarsys.kitalpha.ad.integration.sirius.model.SiriusRepresentation;
import org.polarsys.kitalpha.ad.integration.sirius.model.edit.provider.IntegrationEditPlugin;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RepresentationElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IRepresentationHandler;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.ad.viewpoint.ui.dialogs.EditorHelper;
import org.polarsys.kitalpha.ad.viewpoint.ui.dialogs.ModelFileDialog;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.AbstractTab;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.ResourceTableSorter;

/**
 * @author Thomas Guiu
 * 
 */
public class SiriusTab extends AbstractTab {
	private final class AddButtonListener extends SelectionListener2 {
		@Override
		public void doWidgetSelected(SelectionEvent e) {
			IRepresentationHandler representationHandler = modelManager.getRepresentationHandler();

			ModelFileDialog dialog = new ModelFileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), viewpoint, "*.odesign");
			if (dialog.open() == Window.OK) {
				ResourceSet resourceSet = viewpoint.eResource().getResourceSet();
				List<RepresentationElement> representations = new ArrayList<RepresentationElement>();
				for (URI euri : dialog.getResult()) {
					Resource resource = resourceSet.getResource(euri, true);
					for (EObject eobj : resource.getContents()) {
						if (eobj instanceof Group) {
							SiriusRepresentation representation = SiriusFactory.eINSTANCE.createSiriusRepresentation();
							representation.setOdesign((Group) eobj);
							representations.add(representation);
						}
					}
				}
				representationHandler.addRepresentations(representations);
			}
		}
	}

	private final class HeaderListener extends SelectionListener2 {
		private final Table table;

		private HeaderListener(Table table) {
			this.table = table;
		}

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
			odesignViewer.refresh();
		}
	}

	private static final String NAME_COLUMN = "name";

	private TableViewer odesignViewer;
	private Button addBtn;
	private Button deleteBtn;
	private Button viewBtn;

	public SiriusTab() {
		super(new SiriusLabelProvider());
	}

	@Override
	public ISelectionProvider getSelectionProvider() {
		return odesignViewer;
	}

	@Override
	public void createTab(FormToolkit toolkit, CTabFolder folder) {
		final Composite composite = createTab(toolkit, folder, "Sirius models", IntegrationEditPlugin.INSTANCE.getImage("full/obj16/SiriusRepresentation"));
		GridLayout clayout = new GridLayout();
		clayout.numColumns = 2;
		composite.setLayout(clayout);

		odesignViewer = new TableViewer(composite, SWT.FULL_SELECTION | SWT.BORDER);
		final Table table = odesignViewer.getTable();
		TableLayout layout = new TableLayout();
		table.setLayout(layout);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(GridData.FILL_BOTH));
		SelectionListener headerListener = new HeaderListener(table);

		TableViewerColumn nameColumn = new TableViewerColumn(odesignViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 90, true));
		nameColumn.getColumn().addSelectionListener(headerListener);
		nameColumn.getColumn().setText("Model paths");
		nameColumn.getColumn().setResizable(true);
		nameColumn.getColumn().setData(0);

		table.setSortColumn(nameColumn.getColumn());
		table.setSortDirection(SWT.DOWN);

		odesignViewer.setColumnProperties(new String[] { NAME_COLUMN });

		odesignViewer.setContentProvider(SiriusContentProvider.INSTANCE);
		odesignViewer.setLabelProvider(labelProvider);
		odesignViewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return element instanceof SiriusRepresentation;
			}
		});
		odesignViewer.setSorter(new ResourceTableSorter());

		// buttons
		Composite btnBar = toolkit.createComposite(composite);
		btnBar.setLayout(new GridLayout());
		addBtn = toolkit.createButton(btnBar, "", SWT.PUSH);
		addBtn.setImage(Activator.getDefault().getImage(AFImages.ADD));
		addBtn.addSelectionListener(new AddButtonListener());

		deleteBtn = toolkit.createButton(btnBar, "", SWT.PUSH);
		deleteBtn.setImage(Activator.getDefault().getImage(AFImages.DELETE));
		deleteBtn.setEnabled(false);
		deleteBtn.addSelectionListener(new SelectionListener2() {

			@Override
			public void doWidgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) odesignViewer.getSelection();
				List<RepresentationElement> packages = new ArrayList<RepresentationElement>();
				for (Object obj : selection.toArray()) {
					packages.add((RepresentationElement) obj);
				}
				IRepresentationHandler representationHandler = modelManager.getRepresentationHandler();
				representationHandler.removeRepresentations(packages);
			}
		});

		viewBtn = toolkit.createButton(btnBar, "", SWT.PUSH);
		viewBtn.setImage(Activator.getDefault().getImage(AFImages.VIEW));
		viewBtn.setEnabled(false);
		viewBtn.addSelectionListener(new SelectionListener2() {

			@Override
			public void doWidgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) odesignViewer.getSelection();
				SiriusRepresentation obj = (SiriusRepresentation) selection.getFirstElement();
				Group odesign = obj.getOdesign();
				URI uri = odesign.eResource().getURI();
				try {
					EditorHelper.openEditor(uri);
				} catch (PartInitException e1) {
					Activator.getDefault().logError(e1);
				}
			}
		});

		odesignViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				updateButtons((IStructuredSelection) event.getSelection());
			}
		});
	}

	@Override
	public void init() {
		IRepresentationHandler representationHandler = modelManager.getRepresentationHandler();
		if (representationHandler != null){
			odesignViewer.setInput(representationHandler);
		}
		workspaceHasChanged();
	}

	@Override
	public void workspaceHasChanged() {
		super.workspaceHasChanged();
		odesignViewer.refresh();
		updateButtons((IStructuredSelection) odesignViewer.getSelection());
	}

	private void updateButtons(IStructuredSelection selection) {
		boolean readOnly = getModelManager().getResourceManager().isReadOnly() || getModelManager().isLocal();
		addBtn.setEnabled(!readOnly);
		deleteBtn.setEnabled(!readOnly && !selection.isEmpty());
		if (selection.size() == 1) {
			SiriusRepresentation representation = (SiriusRepresentation) selection.getFirstElement();
			viewBtn.setEnabled(representation.getOdesign() != null && !representation.getOdesign().eIsProxy());
		} else {
			viewBtn.setEnabled(false);
		}
	}

}
