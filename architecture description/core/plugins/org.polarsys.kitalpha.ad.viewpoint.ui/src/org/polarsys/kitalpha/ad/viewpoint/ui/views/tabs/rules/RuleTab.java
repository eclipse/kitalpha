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

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.edit.provider.ViewpointEditPlugin;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ProjectUtils;
import org.polarsys.kitalpha.ad.viewpoint.integration.rules.RuleProvider;
import org.polarsys.kitalpha.ad.viewpoint.integration.rules.Rules;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;
import org.polarsys.kitalpha.ad.viewpoint.ui.integration.rules.RuleProviderWizard;
import org.polarsys.kitalpha.ad.viewpoint.ui.integration.rules.RuleWizards;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.editing.ComboStringEditingSupport;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.editing.RuleIDTypeEditingSupport;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.editing.RuleTypeEditingSupport;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.editing.StringEditingSupport;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.AbstractTab;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.GenericHandlerContentProvider;
import org.polarsys.kitalpha.ad.viewpoint.utils.ElementHelper;

import de.ikoffice.widgets.DropDownButton;

/**
 * @author Thomas Guiu
 * 
 */
public class RuleTab extends AbstractTab {
	private static final String ACTIVE_COLUMN = "active";
	private static final String ID_COLUMN = "id";
	private static final String NAME_COLUMN = "name";
	private static final String LIVE_COLUMN = "live";
	private static final String LANGUAGE_COLUMN = "language";
	private static final String SEVERITY_COLUMN = "severity";
	private static final String MESSAGE_COLUMN = "message";

	private TableViewer ruleViewer;
	private Button addBtn;
	private DropDownButton createBtn;
	private Button deleteBtn;
	private MenuItem createRuleItem;

	private ComboStringEditingSupport idEditingSupport;

	private final BundleListener bundleListener = new BundleListener() {
		private Job refreshJob = new Job(Messages.RuleTab_refresh_job) {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				if (site != null) {
					site.getShell().getDisplay().asyncExec(new Runnable() {
						public void run() {
							if (ruleViewer != null && ruleViewer.getTable() != null && !ruleViewer.getTable().isDisposed())
								ruleViewer.refresh(true);
						}
					});
				}
				return Status.OK_STATUS;
			}
		};

		public void bundleChanged(final BundleEvent event) {
			for (RuleProvider prov : Rules.getProviders().values()) {
				if (prov.hasProvider(event.getBundle())) {
					// we need a short delay to be sure emf constraints are
					// loaded.
					refreshJob.schedule(500);
					return;
				}
			}
		}
	};

	public RuleTab() {
		super(new RuleLabelProvider());
	}

	public ISelectionProvider getSelectionProvider() {
		return ruleViewer;
	}

	public void createTab(FormToolkit toolkit, CTabFolder folder) {
		Composite composite = createTab(toolkit, folder, Messages.RuleTab_title, ViewpointEditPlugin.INSTANCE.getImage("full/obj16/Rule"));
		GridLayout clayout = new GridLayout();
		clayout.numColumns = 2;
		composite.setLayout(clayout);

		ruleViewer = new TableViewer(composite, SWT.FULL_SELECTION | SWT.MULTI | SWT.BORDER);
		final Table table = ruleViewer.getTable();
		Menu menu = new Menu(table);
		createRuleItem = new MenuItem(menu, SWT.PUSH);
		createRuleItem.setText(Messages.RuleTab_create_service_label);
		createRuleItem.addSelectionListener(new SelectionListener2() {
			public void doWidgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) ruleViewer.getSelection();
				List<Rule> rules = new ArrayList<Rule>();
				for (Object obj : selection.toArray()) {
					if (obj instanceof Rule) {
						rules.add((Rule) obj);
					}
				}
				String id = ElementHelper.computeNewId(modelManager.getServiceHandler(), viewpoint.getId() + ".service");
				modelManager.getServiceHandler().createService(id, Messages.RuleTab_default_service_label, null, rules);
			}
		});
		table.setMenu(menu);
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
				ruleViewer.refresh();
			}
		};

		TableViewerColumn idColumn = new TableViewerColumn(ruleViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(2, 100, true));
		idColumn.getColumn().addSelectionListener(headerListener);
		idColumn.getColumn().setText(Messages.RuleTab_column_id_label);
		idColumn.getColumn().setResizable(true);
		idColumn.getColumn().setData(0);
		idColumn.setEditingSupport(register(idEditingSupport = new ComboStringEditingSupport(ruleViewer, Rule.class, "id")));

		TableViewerColumn typeColumn = new TableViewerColumn(ruleViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(1, 50, true));
		typeColumn.getColumn().addSelectionListener(headerListener);
		typeColumn.getColumn().setText(Messages.RuleTab_column_type_label);
		typeColumn.getColumn().setResizable(true);
		typeColumn.getColumn().setData(1);
		typeColumn.setEditingSupport(register(new RuleTypeEditingSupport(ruleViewer)));

		TableViewerColumn ruleIidColumn = new TableViewerColumn(ruleViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(4, 180, true));
		ruleIidColumn.getColumn().addSelectionListener(headerListener);
		ruleIidColumn.getColumn().setText(Messages.RuleTab_column_implementation_label);
		ruleIidColumn.getColumn().setResizable(true);
		ruleIidColumn.getColumn().setData(2);
		ruleIidColumn.setEditingSupport(register(new RuleIDTypeEditingSupport(ruleViewer)));

		TableViewerColumn descriptionColumn = new TableViewerColumn(ruleViewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(4, 100, true));
		descriptionColumn.getColumn().addSelectionListener(headerListener);
		descriptionColumn.getColumn().setText(Messages.RuleTab_column_description_label);
		descriptionColumn.getColumn().setResizable(true);
		descriptionColumn.getColumn().setData(3);
		descriptionColumn.setEditingSupport(register(new StringEditingSupport(ruleViewer, Rule.class, "description")));

		table.setSortColumn(idColumn.getColumn());
		table.setSortDirection(SWT.DOWN);

		ruleViewer.setColumnProperties(new String[] { ACTIVE_COLUMN, ID_COLUMN, NAME_COLUMN, LIVE_COLUMN, LANGUAGE_COLUMN, SEVERITY_COLUMN, MESSAGE_COLUMN });

		ColumnViewerToolTipSupport.enableFor(ruleViewer);
		CellLabelProvider cellLabelProvider = new CellLabelProvider() {

			@Override
			public String getToolTipText(Object element) {
				if (element instanceof Rule) {
					Rule rule = (Rule) element;
					return Rules.getProviderName(rule);
				}
				return null;
			}

			@Override
			public void update(ViewerCell cell) {
				int index = cell.getColumnIndex();
				Object element = cell.getElement();
				cell.setImage(labelProvider.getColumnImage(element, index));
				cell.setText(labelProvider.getColumnText(element, index));
			}
		};
		ruleViewer.setLabelProvider(cellLabelProvider);
		ruleViewer.setContentProvider(GenericHandlerContentProvider.INSTANCE);

		// buttons
		Composite btnBar = toolkit.createComposite(composite);
		btnBar.setLayout(new GridLayout());
		createBtn = new DropDownButton(btnBar, SWT.FLAT);
		toolkit.adapt(createBtn, true, true);
		createBtn.setToolTipText(Messages.RuleTab_create_tooltip);

		Menu menu2 = createBtn.getMenu();
		for (String wz : RuleWizards.getAvailableTypes()) {
			MenuItem wItem = new MenuItem(menu2, SWT.PUSH);
			wItem.setText(NLS.bind(Messages.RuleTab_create_item_label, wz));
			final String type = wz;
			wItem.addSelectionListener(new SelectionListener2() {

				public void doWidgetSelected(SelectionEvent e) {
					IProject containingProject = ProjectUtils.getContainingProject(viewpoint);
					RuleProviderWizard provider = RuleWizards.getProvider(type);
					provider.openWizard(site.getShell(), modelManager.getRuleHandler(), containingProject);
				}
			});
		}
		this.createBtn.setImage(Activator.getDefault().getImage(AFImages.NEW_RULE));

		addBtn = toolkit.createButton(btnBar, "", SWT.PUSH);
		addBtn.setToolTipText(Messages.RuleTab_add_tooltip);
		addBtn.setImage(Activator.getDefault().getImage(AFImages.ADD));
		addBtn.addSelectionListener(new SelectionListener2() {

			@Override
			public void doWidgetSelected(SelectionEvent e) {
				String id = ElementHelper.computeNewId(modelManager.getRuleHandler(), viewpoint.getId() + ".rule");
				modelManager.getRuleHandler().createRule(id);
			}
		});

		deleteBtn = toolkit.createButton(btnBar, "", SWT.PUSH);
		deleteBtn.setToolTipText(Messages.RuleTab_delete_tooltip);
		deleteBtn.setImage(Activator.getDefault().getImage(AFImages.DELETE));
		deleteBtn.setEnabled(false);
		deleteBtn.addSelectionListener(new SelectionListener2() {

			@Override
			public void doWidgetSelected(SelectionEvent e) {
				IStructuredSelection selection = (IStructuredSelection) ruleViewer.getSelection();
				List<Rule> rules = new ArrayList<Rule>();
				for (Object obj : selection.toArray()) {
					if (obj instanceof Rule) {
						rules.add((Rule) obj);
					}
				}
				modelManager.getRuleHandler().removeRules(rules);
			}
		});
		ruleViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				for (Object obj : ((IStructuredSelection) event.getSelection()).toArray()) {
					if (!modelManager.getRuleHandler().isRemovable((Rule) obj)) {
						deleteBtn.setEnabled(false);
						return;
					}
				}
				deleteBtn.setEnabled(!event.getSelection().isEmpty());
			}
		});
		ruleViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				boolean isEmpty = event.getSelection().isEmpty();
				boolean readOnly = getModelManager().getResourceManager().isReadOnly();
				createRuleItem.setEnabled(!isEmpty && !readOnly);
			}
		});

		Activator.getDefault().getBundle().getBundleContext().addBundleListener(bundleListener);
	}

	public void init() {
		ruleViewer.setInput(modelManager.getRuleHandler());
		workspaceHasChanged();

	}

	public List<Object> getItems() {
		List<Object> result = new ArrayList<Object>();
		for (TableItem item : ruleViewer.getTable().getItems())
			result.add(item.getData());
		return result;
	}

	public void workspaceHasChanged() {
		super.workspaceHasChanged();

		ruleViewer.refresh();
		List<String> values = ElementHelper.getIdsFromParents(modelManager.getRuleHandler());
		idEditingSupport.setItems(values.toArray(new String[values.size()]));

		boolean readOnly = getModelManager().getResourceManager().isReadOnly();
		deleteBtn.setEnabled(!readOnly && !ruleViewer.getSelection().isEmpty());
		addBtn.setEnabled(!readOnly);
		createBtn.setEnabled(!readOnly);
		createRuleItem.setEnabled(!readOnly);
	}

	@Override
	public void dispose() {
		super.dispose();
		Activator.getDefault().getBundle().getBundleContext().removeBundleListener(bundleListener);
	}

}
