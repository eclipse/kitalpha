/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
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
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.model.detachment.ui.editor.DetachmentHelper;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

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

	private ResourceSet context;
	private TableViewer viewer;
	private Action filterAction;
	private Action unFilterAction;
	private Action useAction;
	private Action unUseAction;
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
			if ((type == IResourceChangeEvent.PRE_DELETE || type == IResourceChangeEvent.PRE_CLOSE)
					&& resource instanceof IProject)
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
	private final ViewpointManagerLabelProvider labelProvider = new ViewpointManagerLabelProvider();

	@Override
	public void createPartControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout clayout = new GridLayout();
		clayout.numColumns = 3;
		composite.setLayout(clayout);

		final Label label = new Label(composite, SWT.None);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layoutData.horizontalSpan = 3;
		label.setLayoutData(layoutData);
		createViewer(composite);
		init();
		ViewpointManager.addOverallListener(vpListener);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(wsListener);
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
				.addSelectionListener(new ISelectionListener() {

					@Override
					public void selectionChanged(IWorkbenchPart part, ISelection selection) {
						context = null;
						if (part instanceof IEditingDomainProvider) {
							IEditingDomainProvider prov = (IEditingDomainProvider) part;
							EditingDomain editingDomain = prov.getEditingDomain();
							if (editingDomain != null)
								context = editingDomain.getResourceSet();
						}
						if (context == null) {
							EditingDomain obj = (EditingDomain) part.getAdapter(EditingDomain.class);
							if (obj != null) {
								context = obj.getResourceSet();
							}
						}
						if (context == null)
							analyseSelection(selection);
						
						if (!label.isDisposed())
							label.setText(computeLabel());
						if (!viewer.getControl().isDisposed()) {
							updateButtons(null);
							labelProvider.setContext(context);
							viewer.refresh();
						}
					}

					private String computeLabel() {
						if (context == null)
							return "";
						if (context.getResources().isEmpty())
							return "";
						String segment = context.getResources().get(0).getURI().segment(1);
						return "Project " + segment;
					}

					private void analyseSelection(ISelection selection) {

						if (selection.isEmpty())
							return;
						if (selection instanceof TreeSelection) {
							Object[] selected = ((TreeSelection) selection).toArray();
							if (selected[0] instanceof EObject)
								context = ((EObject) selected[0]).eResource().getResourceSet();
						}
					}

				});
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

		TableViewerColumn versionColumn = new TableViewerColumn(viewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(2, 50, true));
		versionColumn.getColumn().setText("Version");
		versionColumn.getColumn().setResizable(true);

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
		viewer.setLabelProvider(labelProvider);

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

		new Job("Refresh ViewpointManager view") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				final Resource[] availableViewpoints = ViewpointManager.getAvailableViewpoints();
				getSite().getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						viewer.setInput(availableViewpoints);
						updateButtons(null);
					}
				});
				return Status.OK_STATUS;
			}
		}.schedule();
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				useAction.run();
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
		manager.add(useAction);
		manager.add(new Separator());
		manager.add(unUseAction);
		manager.add(new Separator());
		manager.add(filterAction);
		manager.add(new Separator());
		manager.add(unFilterAction);
		manager.add(new Separator());
		manager.add(openViewAction);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(useAction);
		manager.add(unUseAction);
		manager.add(new Separator());
		manager.add(filterAction);
		manager.add(unFilterAction);
		manager.add(new Separator());
		manager.add(openViewAction);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(refreshAction);
		manager.add(new Separator());
		manager.add(useAction);
		manager.add(unUseAction);
		manager.add(new Separator());
		manager.add(filterAction);
		manager.add(unFilterAction);
		manager.add(new Separator());
		manager.add(openViewAction);
	}

	protected void updateButtons(IStructuredSelection selection) {
		int size = selection == null ? 0 : selection.size();
		if (size == 1) {
			Resource res = (Resource) selection.getFirstElement();
			if (context != null) {
				boolean used = ViewpointManager.getInstance(context).isUsed(res.getId());
				boolean canChangeState = ViewpointManager.canChangeState(res);
				useAction.setEnabled(!used && canChangeState);
				unUseAction.setEnabled(used && canChangeState);
				if (used) {
					boolean filtered = ViewpointManager.getInstance(context).isFiltered(res.getId());
					filterAction.setEnabled(filtered && canChangeState);
					unFilterAction.setEnabled(!filtered && canChangeState);
				} else {
					filterAction.setEnabled(false);
					unFilterAction.setEnabled(false);
				}
			}
			openViewAction.setEnabled(true);
			openViewAction.setResource(res);
		} else {
			useAction.setEnabled(false);
			unUseAction.setEnabled(false);
			filterAction.setEnabled(false);
			unFilterAction.setEnabled(false);
			openViewAction.setEnabled(false);
			openViewAction.setResource(null);
		}
	}

	private void makeActions() {
		useAction = new Action() {
			public void run() {
				IStructuredSelection ss = (IStructuredSelection) viewer.getSelection();
				int size = ss.size();
				if (size != 1 || context == null)
					return;
				final Resource res = (Resource) ss.getFirstElement();
				ViewpointManager vpMgr = ViewpointManager.getInstance(context);
				if (vpMgr.isUsed(res.getId()))
					return;
				try {
					vpMgr.activate(res.getId());
				} catch (ViewpointActivationException e) {
					MessageDialog.openError(getSite().getShell(), "Error", e.getMessage());
					AD_Log.getDefault().logError(e);
				}
			}
		};
		useAction.setText("Start use");
		useAction.setToolTipText("Start using this viewpoint");
		useAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.START));

		unUseAction = new Action() {
			public void run() {
				IStructuredSelection ss = (IStructuredSelection) viewer.getSelection();
				int size = ss.size();
				if (size != 1 || context == null)
					return;
				Resource res = (Resource) ss.getFirstElement();
				ViewpointManager vpMgr = ViewpointManager.getInstance(context);
				if (!vpMgr.isUsed(res.getId()))
					return;
				try {
					if (!MessageDialog.openQuestion(getSite().getShell(), "Stop using viewpoint " + res.getName(),
							"Viewpoint Detachment is required. Close model and Proceed ?"))
						return;
					// Launch detach editor
					org.eclipse.emf.ecore.resource.Resource resource = context.getResources().get(0);
					IFile file = ResourcesPlugin.getWorkspace().getRoot()
							.getFile(new Path(resource.getURI().toPlatformString(true)));
					DetachmentHelper.openEditor(file, new NullProgressMonitor());

					// check detachement has been done.
					// TODO check detachement has been done.
					// vpMgr.stopUse(res.getId());
				} catch (Exception e) {
					MessageDialog.openError(getSite().getShell(), "Error", e.getMessage());
					Activator.getDefault().logError(e);
				}
			}
		};
		unUseAction.setText("Stop use");
		unUseAction.setToolTipText("Stop using the viewpoint");
		unUseAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.STOP));

		filterAction = new Action() {
			public void run() {
				IStructuredSelection ss = (IStructuredSelection) viewer.getSelection();
				int size = ss.size();
				if (size != 1 || context == null)
					return;
				Resource res = (Resource) ss.getFirstElement();
				ViewpointManager vpMgr = ViewpointManager.getInstance(context);
				if (!vpMgr.isUsed(res.getId()))
					return;
				try {
					vpMgr.filter(res.getId(), false);
				} catch (ViewpointActivationException e) {
					MessageDialog.openError(getSite().getShell(), "Error", e.getMessage());
					Activator.getDefault().logError(e);
				}
			}
		};
		filterAction.setText("Show");
		filterAction.setToolTipText("Display the viewpoint elements");
		filterAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.EYE));

		unFilterAction = new Action() {
			public void run() {
				IStructuredSelection ss = (IStructuredSelection) viewer.getSelection();
				int size = ss.size();
				if (size != 1 || context == null)
					return;
				Resource res = (Resource) ss.getFirstElement();
				ViewpointManager vpMgr = ViewpointManager.getInstance(context);
				if (!vpMgr.isUsed(res.getId()))
					return;
				try {
					vpMgr.filter(res.getId(), true);
				} catch (ViewpointActivationException e) {
					MessageDialog.openError(getSite().getShell(), "Error", e.getMessage());
					Activator.getDefault().logError(e);
				}
			}
		};
		unFilterAction.setText("Hide");
		unFilterAction.setToolTipText("Hide the viewpoint elements");
		unFilterAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.EYE_DISABLED));

		refreshAction = new Action() {
			public void run() {
				init();
			}
		};
		refreshAction.setText("Refresh");
		refreshAction.setToolTipText("Refresh the view");
		refreshAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.REFRESH));

		openViewAction = new OpenViewAction();
		openViewAction.setText("Show view");
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
