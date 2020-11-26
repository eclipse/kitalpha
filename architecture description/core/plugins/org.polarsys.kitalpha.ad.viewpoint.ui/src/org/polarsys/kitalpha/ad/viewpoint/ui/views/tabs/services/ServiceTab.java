/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.edit.provider.ViewpointEditPlugin;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ModelListener;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ProjectUtils;
import org.polarsys.kitalpha.ad.viewpoint.integration.services.Implementations;
import org.polarsys.kitalpha.ad.viewpoint.integration.services.ServiceRunner;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;
import org.polarsys.kitalpha.ad.viewpoint.ui.dialogs.NewElementCreationWizard;
import org.polarsys.kitalpha.ad.viewpoint.ui.integration.services.NewServiceCreationWizard;
import org.polarsys.kitalpha.ad.viewpoint.ui.integration.services.UIServiceRunner;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.editing.ComboStringEditingSupport;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.editing.ServiceTypeEditingSupport;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.editing.StringEditingSupport;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.AbstractTab;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.GenericHandlerContentProvider;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.ResourceTableSorter;
import org.polarsys.kitalpha.ad.viewpoint.utils.ElementHelper;


/**
 * @author Thomas Guiu
 * 
 */
public class ServiceTab extends AbstractTab implements ModelListener {
	private static final String ID_COLUMN = "id";
	private static final String BTN_COLUMN = "btn";
	private static final String NAME_COLUMN = "name";
	private static final String DESCRIPTION_COLUMN = "description";

	private TableViewer serviceViewer;
	private Button createBtn;
	private Button deleteBtn;
	private Button addBtn;
	private ComboStringEditingSupport idEditingSupport;
	private ServiceTypeEditingSupport typeEditingSupport;
	private RelatedRulesEditingSupport relatedRulesEditingSupport;

	private final ISelectionListener listener = new ISelectionListener() {

		@Override
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			boolean partVisible = site.getPage().isPartVisible(site.getPart());
			if (partVisible) {
				serviceViewer.refresh();
			}
		}

	};
	private final BundleListener bundleListener = new BundleListener() {

		@Override
		public void bundleChanged(final BundleEvent event) {
			if (Implementations.hasProvider(event.getBundle())) {
				refresh();
				return;
			}
		}

		private void refresh() {
			if (site != null) {
				site.getShell().getDisplay().asyncExec(new Runnable() {
					@Override
					public void run() {
						if (serviceViewer != null && serviceViewer.getTable() != null && !serviceViewer.getTable().isDisposed()) {
							serviceViewer.refresh(true);
						}
					}
				});
			}
		}
	};;

	public ServiceTab() {
		super(new ServiceLabelProvider());

	}

	@Override
	public ISelectionProvider getSelectionProvider() {
		return serviceViewer;
	}

	@Override
	public void createTab(FormToolkit toolkit, CTabFolder folder) {
		final Composite composite = createTab(toolkit, folder, Messages.ServiceTab_title, ViewpointEditPlugin.INSTANCE.getImage("full/obj16/Service"));
		GridLayout clayout = new GridLayout();
		clayout.numColumns = 2;
		composite.setLayout(clayout);

		serviceViewer = new TableViewer(composite, SWT.FULL_SELECTION | SWT.BORDER) {
			@Override
			protected void doUpdateItem(Widget w, Object element, boolean fullMap) {
				super.doUpdateItem(w, element, fullMap);
				final TableItem item = (TableItem) w;
				Table table = getTable();

				TableEditor editor = (TableEditor) item.getData("editor");
				Button button = null;
				if (editor == null) {
					editor = new TableEditor(table);
					item.setData("editor", editor);
					button = new Button(table, SWT.PUSH);
					button.setImage(Activator.getDefault().getImage(AFImages.RUN));
					button.addSelectionListener(new SelectionListener2() {
						@Override
						public void doWidgetSelected(SelectionEvent e) {
							Service service = (Service) item.getData();
							new UIServiceRunner().run(service, modelManager, selectionProvider == null ? null : selectionProvider.getSelection());
						}
					});
					button.pack();
					final TableEditor fEditor = editor;
					final Button fButton = button;
					item.addDisposeListener(new DisposeListener() {
						@Override
						public void widgetDisposed(DisposeEvent e) {
							fEditor.dispose();
							fButton.dispose();
						}
					});
					editor.minimumWidth = button.getSize().x;
					editor.horizontalAlignment = SWT.LEFT;
					editor.setEditor(button, item, 0);
				}

				button = (Button) editor.getEditor();
				Service service = (Service) item.getData();
				boolean enabled = service != null && service.getType() != null && !"".equals(service.getType());
				if (enabled) {
					enabled = new ServiceRunner().canRun(service, modelManager, selectionProvider.getSelection());
				}
				
				button.setEnabled(enabled);
			};
		};
		final Table table = serviceViewer.getTable();
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
				serviceViewer.refresh();
			}
		};

		TableViewerColumn activeColumn = new TableViewerColumn(serviceViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(1, 40, false));
		activeColumn.getColumn().addSelectionListener(headerListener);
		activeColumn.getColumn().setText("");
		activeColumn.getColumn().setResizable(false);
		activeColumn.getColumn().setData(0);

		TableViewerColumn idColumn = new TableViewerColumn(serviceViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 50, true));
		idColumn.getColumn().addSelectionListener(headerListener);
		idColumn.getColumn().setText(Messages.ServiceTab_column_id_label);
		idColumn.getColumn().setResizable(true);
		idColumn.getColumn().setData(1);
		idColumn.setEditingSupport(register(idEditingSupport = new ComboStringEditingSupport(serviceViewer, Rule.class, "id")));

		TableViewerColumn nameColumn = new TableViewerColumn(serviceViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 100, true));
		nameColumn.getColumn().addSelectionListener(headerListener);
		nameColumn.getColumn().setText(Messages.ServiceTab_column_name_label);
		nameColumn.getColumn().setResizable(true);
		nameColumn.getColumn().setData(2);
		nameColumn.setEditingSupport(register(new StringEditingSupport(serviceViewer, Service.class, "name")));

		TableViewerColumn typeColumn = new TableViewerColumn(serviceViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(8, 100, true));
		typeColumn.getColumn().addSelectionListener(headerListener);
		typeColumn.getColumn().setText(Messages.ServiceTab_column_type_label);
		typeColumn.getColumn().setResizable(true);
		typeColumn.getColumn().setData(3);
		typeColumn.setEditingSupport(register(typeEditingSupport = new ServiceTypeEditingSupport(serviceViewer)));

		TableViewerColumn relatedRulesColumn = new TableViewerColumn(serviceViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(8, 100, true));
		relatedRulesColumn.getColumn().addSelectionListener(headerListener);
		relatedRulesColumn.getColumn().setText(Messages.ServiceTab_column_details_label);
		relatedRulesColumn.getColumn().setResizable(true);
		relatedRulesColumn.getColumn().setData(5);
		relatedRulesColumn.setEditingSupport(register(relatedRulesEditingSupport = new RelatedRulesEditingSupport(serviceViewer)));

		TableViewerColumn descColumn = new TableViewerColumn(serviceViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(12, 100, true));
		descColumn.getColumn().addSelectionListener(headerListener);
		descColumn.getColumn().setText(Messages.ServiceTab_column_description_label);
		descColumn.getColumn().setResizable(true);
		descColumn.getColumn().setData(4);
		descColumn.setEditingSupport(register(new StringEditingSupport(serviceViewer, Service.class, "description")));

		table.setSortColumn(nameColumn.getColumn());
		table.setSortDirection(SWT.DOWN);

		serviceViewer.setColumnProperties(new String[] { BTN_COLUMN, ID_COLUMN, NAME_COLUMN, DESCRIPTION_COLUMN });

		serviceViewer.setContentProvider(GenericHandlerContentProvider.INSTANCE);
		serviceViewer.setLabelProvider(labelProvider);
		serviceViewer.setSorter(new ResourceTableSorter());

		// buttons
		Composite btnBar = toolkit.createComposite(composite);
		btnBar.setLayout(new GridLayout());

		createBtn = toolkit.createButton(btnBar, "", SWT.PUSH);
		createBtn.setToolTipText(Messages.ServiceTab_create_tooltip);
		createBtn.setImage(Activator.getDefault().getImage(AFImages.NEW_SERVICE));
		createBtn.addSelectionListener(new SelectionListener2() {

			@Override
			public void doWidgetSelected(SelectionEvent e) {
				IProject containingProject = ProjectUtils.getContainingProject(viewpoint);
				NewElementCreationWizard wizard = new NewServiceCreationWizard(getModelManager().getServiceHandler());
				wizard.init(PlatformUI.getWorkbench(), new StructuredSelection(new Object[] { containingProject }));
				WizardDialog dialog = new WizardDialog(site.getShell(), wizard);
				dialog.open();

			}
		});

		addBtn = toolkit.createButton(btnBar, "", SWT.PUSH);
		addBtn.setToolTipText(Messages.ServiceTab_add_tooltip);
		addBtn.setImage(Activator.getDefault().getImage(AFImages.ADD));
		addBtn.addSelectionListener(new SelectionListener2() {

			@Override
			public void doWidgetSelected(SelectionEvent e) {
				String id = ElementHelper.computeNewId(modelManager.getServiceHandler(), viewpoint.getId() + ".service");
				getModelManager().getServiceHandler().createService(id, Messages.ServiceTab_new_service_label, null, new ArrayList<Rule>());
			}
		});

		deleteBtn = toolkit.createButton(btnBar, "", SWT.PUSH);
		deleteBtn.setToolTipText(Messages.ServiceTab_delete_tooltip);
		deleteBtn.setImage(Activator.getDefault().getImage(AFImages.DELETE));
		deleteBtn.setEnabled(false);
		deleteBtn.addSelectionListener(new SelectionListener2() {

			@Override
			public void doWidgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) serviceViewer.getSelection();
				List<Service> services = new ArrayList<Service>();
				for (Object obj : selection.toArray()) {
					if (obj instanceof Service) {
						services.add((Service) obj);
					}
				}
				modelManager.getServiceHandler().removeServices(services);
			}
		});

		serviceViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				for (Object obj : ((IStructuredSelection) event.getSelection()).toArray()) {
					if (!modelManager.getServiceHandler().isRemovable((Service) obj)) {
						deleteBtn.setEnabled(false);
						return;
					}
				}
				deleteBtn.setEnabled(!event.getSelection().isEmpty());
			}
		});

		Activator.getDefault().getBundle().getBundleContext().addBundleListener(bundleListener);
	}

	@Override
	public void init() {
		selectionProvider.addListener(listener);

		serviceViewer.setInput(modelManager.getServiceHandler());
		workspaceHasChanged();
	}

	@Override
	public void workspaceHasChanged() {
		super.workspaceHasChanged();
		serviceViewer.refresh();

		boolean readOnly = getModelManager().getResourceManager().isReadOnly();
		deleteBtn.setEnabled(!readOnly && !serviceViewer.getSelection().isEmpty());
		addBtn.setEnabled(!readOnly);
		createBtn.setEnabled(!readOnly);

		List<String> values = ElementHelper.getIdsFromParents(modelManager.getServiceHandler());
		idEditingSupport.setItems(values.toArray(new String[values.size()]));

		relatedRulesEditingSupport.setRuleHandler(getModelManager().getRuleHandler());
	}

	@Override
	public void dispose() {
		if (selectionProvider != null) {
			selectionProvider.removeListener(listener);
		}
		Activator.getDefault().getBundle().getBundleContext().removeBundleListener(bundleListener);
		super.dispose();
	}

}
