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

package org.polarsys.kitalpha.ad.viewpoint.ui.views;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.ViewPart;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointManagerView extends ViewPart {

	private final class HeaderSelectionListener extends SelectionListener2 {
		private final TableViewerSorter comparator;
		private final int columnIndex;

		private HeaderSelectionListener(TableViewerSorter comparator, int columnIndex) {
			this.comparator = comparator;
			this.columnIndex = columnIndex;
		}

		public void widgetSelected(SelectionEvent e) {
			int lastSortColumn = comparator.getSortColumn();
			boolean lastAscending = comparator.isAscending();

			if (lastSortColumn == columnIndex) {
				comparator.setAscending(!lastAscending);
			} else {
				comparator.setAscending(true);
				comparator.setSortColumn(columnIndex);
			}
			viewer.refresh();
		}
	}

	private final class TableViewerSorter extends ViewerComparator {
		private int sortColumn = 0;
		private boolean ascending = true;

		@Override
		public int compare(Viewer viewer, Object e1, Object e2) {
			ITableLabelProvider labelProvider = (ITableLabelProvider) ((TableViewer) viewer).getLabelProvider();
			String name1 = labelProvider.getColumnText(e1, sortColumn);
			String name2 = labelProvider.getColumnText(e2, sortColumn);
			if (ascending)
				return getComparator().compare(name1, name2);
			return getComparator().compare(name2, name1);
		}

		public int getSortColumn() {
			return sortColumn;
		}

		public void setSortColumn(int sortColumn) {
			this.sortColumn = sortColumn;
		}

		public boolean isAscending() {
			return ascending;
		}

		public void setAscending(boolean ascending) {
			this.ascending = ascending;
		}
	}

	private TableViewer viewer;
	private Action startAction;
	private Action stopAction;
	private Action refreshAction;
	private OpenViewAction openViewAction;
	private ViewpointManager.OverallListener vpListener = new ViewpointManager.OverallListener() {

		public void hasBeenDeactivated(Object ctx, Resource vp) {
			performInit();
		}

		public void hasBeenActivated(Object ctx, Resource vp) {
			performInit();
		}

		@Override
		public void hasBeenFiltered(Object ctx, Resource vp) {
			performInit();
		}

		@Override
		public void hasBeenDisplayed(Object ctx, Resource vp) {
			performInit();
		}
	};
	private final IResourceChangeListener wsListener = new IResourceChangeListener() {

		public void resourceChanged(IResourceChangeEvent event) {
			IResourceDelta delta = event.getDelta();
			IResource resource = event.getResource();
			int type = event.getType();
			if ((type == IResourceChangeEvent.PRE_DELETE || type == IResourceChangeEvent.PRE_CLOSE) && resource instanceof IProject)
				performInit();
			else if (type == IResourceChangeEvent.POST_CHANGE) {
				for (IResourceDelta childDelta : delta.getAffectedChildren()) {
					resource = childDelta.getResource();
					if (resource instanceof IProject) {
						performInit();
						break;
					}
				}
			}
		}
	};

	@Override
	public void createPartControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout clayout = new GridLayout();
		clayout.numColumns = 3;
		composite.setLayout(clayout);

		createViewer(composite);
		init();
		ViewpointManager.addOverallListener(vpListener);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(wsListener);
	}

	public void createViewer(final Composite composite) {
		viewer = new TableViewer(composite, SWT.FULL_SELECTION | SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		viewer.getControl().setFont(composite.getFont());
		final TableViewerSorter comparator = new TableViewerSorter();
		viewer.setComparator(comparator);

		GridData data = new GridData(GridData.FILL_BOTH);
		data.horizontalSpan = 2;
		viewer.getControl().setLayoutData(data);

		final Table table = viewer.getTable();
		TableLayout layout = new TableLayout();
		table.setLayout(layout);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(GridData.FILL_BOTH));

		TableViewerColumn nameColumn = new TableViewerColumn(viewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(4, 100, true));
		nameColumn.getColumn().setText("Name");
		nameColumn.getColumn().setResizable(true);

		TableViewerColumn stateColumn = new TableViewerColumn(viewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(2, 50, true));
		stateColumn.getColumn().setText("State");
		stateColumn.getColumn().setResizable(true);

		TableViewerColumn locationColumn = new TableViewerColumn(viewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 75, true));
		locationColumn.getColumn().setText("Location");
		locationColumn.getColumn().setResizable(true);

		TableViewerColumn providerColumn = new TableViewerColumn(viewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(5, 150, true));
		providerColumn.getColumn().setText("Provider");
		providerColumn.getColumn().setResizable(true);

		for (int i = 0; i < table.getColumnCount(); i++) {
			TableColumn col = table.getColumn(i);
			col.addSelectionListener(new HeaderSelectionListener(comparator, i));
		}
		table.setSortColumn(nameColumn.getColumn());
		table.setSortDirection(SWT.DOWN);

		viewer.setContentProvider(new ViewpointManagerContentProvider());
		viewer.setLabelProvider(new ViewpointManagerLabelProvider());

		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();

		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				updateButtons((IStructuredSelection) event.getSelection());
			}
		});
	}

	private void performInit() {
		getSite().getShell().getDisplay().asyncExec(new Runnable() {

			public void run() {
				init();
			}
		});
	}

	private void init() {
		viewer.setInput(ViewpointManager.getAvailableViewpoints());
		updateButtons(null);
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				startAction.run();
			}
		});
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				ViewpointManagerView.this.fillContextMenu(manager);
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
		manager.add(startAction);
		manager.add(new Separator());
		manager.add(stopAction);
		manager.add(new Separator());
		manager.add(openViewAction);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(startAction);
		manager.add(stopAction);
		manager.add(new Separator());
		manager.add(openViewAction);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(refreshAction);
		manager.add(new Separator());
		manager.add(startAction);
		manager.add(stopAction);
		manager.add(new Separator());
		manager.add(openViewAction);
	}

	protected void updateButtons(IStructuredSelection selection) {
		int size = selection == null ? 0 : selection.size();
		if (size == 1) {
			Resource res = (Resource) selection.getFirstElement();
			boolean active = ViewpointManager.getInstance((EObject)null).isUsed(res.getId());
			startAction.setEnabled(!active);
			stopAction.setEnabled(active);
			openViewAction.setEnabled(active);
			openViewAction.setResource(res);
		} else {
			startAction.setEnabled(false);
			stopAction.setEnabled(false);
			openViewAction.setEnabled(false);
			openViewAction.setResource(null);
		}
	}

	private void makeActions() {
		startAction = new Action() {
			public void run() {
				IStructuredSelection ss = (IStructuredSelection) viewer.getSelection();
				int size = ss.size();
				if (size != 1)
					return;
				final Resource res = (Resource) ss.getFirstElement();
				if (ViewpointManager.getInstance((EObject)null).isActive(res.getId()))
					return;
				try {
					ViewpointManager.getInstance((EObject)null).activate(res.getId());

					// // we need a short delay to wait for new freshly installed
					// // bundles to be ready
					// getSite().getShell().getDisplay().timerExec(500, new Runnable() {
					//
					// public void run() {
					// ViewHelper.openViews(res);
					// }
					// });
				} catch (ViewpointActivationException e) {
					MessageDialog.openError(getSite().getShell(), "Error", e.getMessage());
					AD_Log.getDefault().logError(e);
				}
			}
		};
		startAction.setText("Start");
		startAction.setToolTipText("Start the viewpoint");
		startAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.START));

		stopAction = new Action() {
			public void run() {
				IStructuredSelection ss = (IStructuredSelection) viewer.getSelection();
				int size = ss.size();
				if (size != 1)
					return;
				Resource res = (Resource) ss.getFirstElement();
				if (!ViewpointManager.getInstance((EObject)null).isActive(res.getId()))
					return;
				try {
					ViewpointManager.getInstance((EObject)null).desactivate(res.getId());
				} catch (ViewpointActivationException e) {
					MessageDialog.openError(getSite().getShell(), "Error", e.getMessage());
					Activator.getDefault().logError(e);
				}
			}
		};
		stopAction.setText("Stop");
		stopAction.setToolTipText("Stop the viewpoint");
		stopAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.STOP));

		refreshAction = new Action() {
			public void run() {
				init();
			}
		};
		refreshAction.setText("Refresh");
		refreshAction.setToolTipText("Refresh the view");
		refreshAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.REFRESH));

		openViewAction = new OpenViewAction();
		openViewAction.setText("Show in view");
		openViewAction.setToolTipText("Show the viewpoint view");
		openViewAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.VP));

	}

	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	@Override
	public void dispose() {
		super.dispose();
		ViewpointManager.removeOverallListener(vpListener);
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(wsListener);
	}

}
