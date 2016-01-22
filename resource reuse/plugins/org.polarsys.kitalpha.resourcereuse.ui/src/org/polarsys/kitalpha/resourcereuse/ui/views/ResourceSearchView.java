/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.ui.views;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.ViewPart;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceHelper;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;
import org.polarsys.kitalpha.resourcereuse.ui.Activator;
import org.polarsys.kitalpha.resourcereuse.ui.Messages;
import org.polarsys.kitalpha.resourcereuse.ui.ResourceReuseImages;
import org.polarsys.kitalpha.resourcereuse.ui.dialog.ResourceSearchDialog;

/**
 * @author Thomas Guiu
 * 
 */
public class ResourceSearchView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.polarsys.kitalpha.resourcereuse.ui.views.ResourceSearchView";

	private static final String ID_COLUMN = "id";
	private static final String NAME_COLUMN = "name";
	private static final String DOMAIN_COLUMN = "domain";
	private static final String VERSION_COLUMN = "version";
	private static final String TAGS_COLUMN = "tags";
	private static final String PATH_COLUMN = "path";

	private TableViewer viewer;
	private Action newSearchAction;
	private Action refreshSearchAction;
	private Action openResourceAction;
	private final SearchCriteria criteria = new SearchCriteria();

	public ResourceSearchView() {
		criteria.setId(".*");
	}

	@Override
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
		final Table table = viewer.getTable();
		TableLayout layout = new TableLayout();
		table.setLayout(layout);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		SelectionListener headerListener = new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				TableColumn currentSortColumn = table.getSortColumn();
				TableColumn newSortColumn = (TableColumn) e.getSource();
				if (currentSortColumn.equals(newSortColumn)) {
					int sortDirection = table.getSortDirection();
					table.setSortDirection(sortDirection == SWT.UP ? SWT.DOWN : SWT.UP);
				} else {
					table.setSortColumn(newSortColumn);
					table.setSortDirection(SWT.DOWN);
				}
				viewer.refresh();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) { // NOSONAR
			}
		};

		class ResourceTableSorter extends ViewerSorter {

			@Override
			public int compare(Viewer viewer, Object e1, Object e2) {
				TableViewer viewer2 = ResourceSearchView.this.viewer;
				ITableLabelProvider lprov = (ITableLabelProvider) viewer2.getLabelProvider();

				Integer column = (Integer) viewer2.getTable().getSortColumn().getData();
				String name1 = lprov.getColumnText(e1, column == null ? 0 : column.intValue());
				String name2 = lprov.getColumnText(e2, column == null ? 0 : column.intValue());
				if (viewer2.getTable().getSortDirection() == SWT.UP)
					return getComparator().compare(name1, name2);
				return getComparator().compare(name2, name1);
			}

		}

		TableColumn idColumn = new TableColumn(table, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 100, true));
		idColumn.addSelectionListener(headerListener);
		idColumn.setText(Messages.id_Field_Label);
		idColumn.setResizable(true);
		idColumn.setData(0);

		TableColumn nameColumn = new TableColumn(table, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(4, 100, true));
		nameColumn.addSelectionListener(headerListener);
		nameColumn.setText(Messages.name_Field_Label);
		nameColumn.setResizable(true);
		nameColumn.setData(1);

		TableColumn domainColumn = new TableColumn(table, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(1, 80, true));
		domainColumn.addSelectionListener(headerListener);
		domainColumn.setText(Messages.domain_Field_Label);
		domainColumn.setResizable(true);
		domainColumn.setData(2);

		TableColumn versionColumn = new TableColumn(table, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(1, 50, true));
		versionColumn.addSelectionListener(headerListener);
		versionColumn.setText(Messages.version_Field_Label);
		versionColumn.setResizable(true);
		versionColumn.setData(3);

		TableColumn tagColumn = new TableColumn(table, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 100, true));
		tagColumn.addSelectionListener(headerListener);
		tagColumn.setText(Messages.tags_Field_Label);
		tagColumn.setResizable(true);
		tagColumn.setData(4);

		TableColumn pathColumn = new TableColumn(table, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 300, true));
		pathColumn.addSelectionListener(headerListener);
		pathColumn.setText(Messages.path_Field_Label);
		pathColumn.setResizable(true);
		pathColumn.setData(5);

		table.setSortColumn(nameColumn);
		table.setSortDirection(SWT.DOWN);

		viewer.setColumnProperties(new String[] { ID_COLUMN, NAME_COLUMN, DOMAIN_COLUMN, VERSION_COLUMN, TAGS_COLUMN, PATH_COLUMN });

		viewer.setContentProvider(new SearchViewContentProvider());
		viewer.setLabelProvider(new SearchViewLabelProvider());
		viewer.setSorter(new ResourceTableSorter());

		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	private void updateView(Resource[] resources) {
		viewer.setInput(resources);
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			@Override
			public void menuAboutToShow(IMenuManager manager) {
				ResourceSearchView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(newSearchAction);
		manager.add(new Separator());
		manager.add(refreshSearchAction);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(newSearchAction);
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(newSearchAction);
		manager.add(refreshSearchAction);
	}

	private void makeActions() {
		newSearchAction = new Action() {
			@Override
			public void run() {
				ResourceSearchDialog dialog = new ResourceSearchDialog(getViewSite().getShell(), criteria);
				if (dialog.open() == Window.OK) {
					ResourceHelper helper = ResourceReuse.createHelper();
					Resource[] resources = helper.getResources(criteria);
					updateView(resources);
				}
			}

		};
		newSearchAction.setText(Messages.SearchView_newSearch_Action_label);
		newSearchAction.setToolTipText(Messages.SearchView_newSearch_Action_tooltip);
		newSearchAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(ResourceReuseImages.IMG_SEARCH_OBJ));

		refreshSearchAction = new Action() {
			@Override
			public void run() {
				ResourceHelper helper = ResourceReuse.createHelper();
				Resource[] resources = helper.getResources(criteria);
				updateView(resources);
			}
		};
		refreshSearchAction.setText(Messages.SearchView_refreshSearch_Action_label);
		refreshSearchAction.setToolTipText(Messages.SearchView_refreshSearch_Action_tooltip);
		refreshSearchAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(ResourceReuseImages.IMG_REFRESH_OBJ));

		openResourceAction = new Action() {
			@Override
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection) selection).getFirstElement();
				showMessage("Double-click detected on " + obj.toString());
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				openResourceAction.run();
			}
		});
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(viewer.getControl().getShell(), "Resource Search View", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}