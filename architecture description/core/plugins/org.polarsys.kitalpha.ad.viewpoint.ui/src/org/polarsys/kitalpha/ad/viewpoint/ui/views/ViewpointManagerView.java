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

import java.io.UnsupportedEncodingException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
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
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
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
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.Description;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;
import org.polarsys.kitalpha.ad.viewpoint.ui.provider.AFContextProvider;
import org.polarsys.kitalpha.model.detachment.ui.editor.DetachmentHelper;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointManagerView extends ViewPart {

	private final class RefreshJob extends Job {
		private RefreshJob() {
			super("Refresh ViewpointManager view");
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			final Description[] availableViewpoints = ViewpointManager.getAvailableViewpointDescriptions();
			if (viewer != null && viewer.getControl() != null && !viewer.getControl().isDisposed())
			{
				getSite().getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						viewer.setInput(availableViewpoints);
						updateActions(null);
					}
				});
			}
			return Status.OK_STATUS;
		}
	}

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
	private MyAction activateAction;
	private MyAction desacticateAction;
	private Action referenceAction;
	private Action unReferenceAction;
	private Action refreshAction;
	private Action showHiddenViewpointAction;
	private OpenViewAction openViewAction;
	private ViewpointManager.OverallListener vpListener = new ViewpointManager.OverallListener() {

		public void hasBeenDeactivated(Object ctx, Resource vp) {
			init();
		}

		public void hasBeenActivated(Object ctx, Resource vp) {
			init();
		}

		@Override
		public void hasBeenFiltered(Object ctx, Resource vp) {
			init();
		}

		@Override
		public void hasBeenDisplayed(Object ctx, Resource vp) {
			init();
		}
	};
	private final IResourceChangeListener wsListener = new IResourceChangeListener() {

		public void resourceChanged(IResourceChangeEvent event) {
			IResourceDelta delta = event.getDelta();
			IResource resource = event.getResource();
			int type = event.getType();
			if ((type == IResourceChangeEvent.PRE_DELETE || type == IResourceChangeEvent.PRE_CLOSE) && resource instanceof IProject)
				delayedInit();
			else if (type == IResourceChangeEvent.POST_CHANGE) {
				for (IResourceDelta childDelta : delta.getAffectedChildren()) {
					resource = childDelta.getResource();
					if (resource instanceof IProject) {
						delayedInit();
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
		clayout.marginWidth = 2;
		clayout.marginHeight = 2;
		clayout.horizontalSpacing = 0;
		clayout.verticalSpacing = 0;
		composite.setLayout(clayout);

		final Label imgLabel = new Label(composite, SWT.None);
		final Label textLabel = new Label(composite, SWT.None);
		imgLabel.setLayoutData(new GridData());
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layoutData.horizontalSpan = 2;
		textLabel.setLayoutData(layoutData);
		imgLabel.setImage(Activator.getDefault().getImage(AFImages.WARNING));
		textLabel.setText(Messages.ViewpointManagerView_default_label);
		createViewer(composite);
		init();
		ViewpointManager.addOverallListener(vpListener);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(wsListener);
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().addSelectionListener(new ISelectionListener() {

			@Override
			public void selectionChanged(IWorkbenchPart part, ISelection selection) {
				context = analyseChange(part, selection);

				if (!textLabel.isDisposed() && !imgLabel.isDisposed()) {
					imgLabel.setImage(context == null ? Activator.getDefault().getImage(AFImages.WARNING) : null);
					textLabel.setText(computeLabel());
				}
				if (viewer != null && !viewer.getControl().isDisposed()) {
					updateActions(null);
					labelProvider.setContext(context);
					viewer.refresh();
				}
			}

			private String computeLabel() {
				if (context == null)
					return Messages.ViewpointManagerView_default_label;
				if (context.getResources().isEmpty())
					return "";
				String segment = context.getResources().get(0).getURI().segment(1);
				try {
					segment = java.net.URLDecoder.decode(segment, "UTF-8");
				} catch (UnsupportedEncodingException e) {
					AD_Log.getDefault().logWarning(e);
				}
				return "Project " + segment;
			}

			private ResourceSet analyseChange(IWorkbenchPart part, ISelection selection) {

				for (AFContextProvider prov : AFContextProvider.INSTANCE.getProviders())
				{
					ResourceSet computeContext = prov.computeContext(part, selection);
					if (computeContext != null)
						return computeContext;
				}
				return null;
			}

		});
	}

	public void createViewer(final Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout clayout = new GridLayout();
		clayout.horizontalSpacing = 0;
		clayout.verticalSpacing = 0;
		clayout.marginWidth = 2;
		clayout.marginHeight = 2;
		composite.setLayout(clayout);
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.horizontalSpan = 2;
		composite.setLayoutData(layoutData);
		viewer = new TableViewer(composite, SWT.FULL_SELECTION | SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		viewer.getControl().setFont(composite.getFont());
		final TableViewerSorter comparator = new TableViewerSorter();
		viewer.setComparator(comparator);

		GridData data = new GridData(GridData.FILL_BOTH);
		data.horizontalSpan = 3;
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

		TableViewerColumn versionColumn = new TableViewerColumn(viewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(2, 50, true));
		versionColumn.getColumn().setText("Version");
		versionColumn.getColumn().setResizable(true);

		TableViewerColumn stateColumn = new TableViewerColumn(viewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(2, 50, true));
		stateColumn.getColumn().setText("State");
		stateColumn.getColumn().setResizable(true);

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
				updateActions((IStructuredSelection) event.getSelection());
			}
		});

		viewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (((Description) element).shloudBeHidden())
					return showHiddenViewpointAction.isChecked();
				return true;
			}
		});
	}

	private void delayedInit() {
		new RefreshJob().schedule(1000);
	}

	private void init() {

		new RefreshJob().schedule();
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				openViewAction.run();
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
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(referenceAction);
		manager.add(unReferenceAction);
		if (activateAction.isVisible() && desacticateAction.isVisible()) {
			manager.add(new Separator());
			manager.add(activateAction);
			manager.add(desacticateAction);
		}
		manager.add(new Separator());
		manager.add(openViewAction);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(refreshAction);
		manager.add(new Separator());
//		manager.add(useAction);
//		manager.add(unUseAction);
//		manager.add(new Separator());
//		manager.add(filterAction);
//		manager.add(unFilterAction);
//		manager.add(new Separator());
//		manager.add(openViewAction);
//		manager.add(new Separator());
		manager.add(showHiddenViewpointAction);
	}

	protected void updateActions(IStructuredSelection selection) {
		int size = selection == null ? 0 : selection.size();
		if (size == 1 && !isTeamContext()) {
			Description res = (Description) selection.getFirstElement();
			if (context != null) {
				boolean used = ViewpointManager.getInstance(context).isUsed(res.getId());
				boolean canChangeState = ViewpointManager.canChangeState(res.getId());
				boolean canChangeActivation = ViewpointManager.canChangeActivation(res.getId());
				referenceAction.setEnabled(!used && canChangeState);
				unReferenceAction.setEnabled(used && canChangeState);
				if (used) {
					boolean filtered = ViewpointManager.getInstance(context).isFiltered(res.getId());
					activateAction.setEnabled(filtered && canChangeState);
					desacticateAction.setEnabled(!filtered && canChangeState);
				} else {
					activateAction.setEnabled(false);
					desacticateAction.setEnabled(false);
				}
				activateAction.setVisible(canChangeActivation);
				desacticateAction.setVisible(canChangeActivation);
			}
			openViewAction.setResource(ViewpointManager.getViewpoint(res.getId()));
		} else {
			referenceAction.setEnabled(false);
			unReferenceAction.setEnabled(false);
			activateAction.setEnabled(false);
			desacticateAction.setEnabled(false);
			openViewAction.setResource(null);
		}
	}

	private boolean isTeamContext() {
		if (context != null) 
		{
			for (org.eclipse.emf.ecore.resource.Resource re : context.getResources()) {
				if ("cdo".equals(re.getURI().scheme()))
					return true;
			}
		}
		return false;
	}

	private void makeActions() {
		showHiddenViewpointAction = new Action("", IAction.AS_CHECK_BOX) {
			public void run() {
				viewer.refresh();
			}
		};
		showHiddenViewpointAction.setText("Show all viewpoints");
		showHiddenViewpointAction.setToolTipText("Show all viewpoints");
		showHiddenViewpointAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.DISPLAY_ALL));

		referenceAction = new Action() {
			public void run() {
				IStructuredSelection ss = (IStructuredSelection) viewer.getSelection();
				int size = ss.size();
				if (size != 1 || context == null)
					return;
				final Description res = (Description) ss.getFirstElement();
				ViewpointManager vpMgr = ViewpointManager.getInstance(context);
				if (vpMgr.isReferenced(res.getId()))
					return;
				try {
					vpMgr.reference(res.getId());
				} catch (ViewpointActivationException e) {
					MessageDialog.openError(getSite().getShell(), "Error", e.getMessage());
					AD_Log.getDefault().logError(e);
				}
			}
		};
		referenceAction.setText("Reference");
		referenceAction.setToolTipText("Reference this viewpoint");
		referenceAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.REFERENCE));

		unReferenceAction = new Action() {
			public void run() {
				IStructuredSelection ss = (IStructuredSelection) viewer.getSelection();
				int size = ss.size();
				if (size != 1 || context == null)
					return;
				Description res = (Description) ss.getFirstElement();
				ViewpointManager vpMgr = ViewpointManager.getInstance(context);
				if (!vpMgr.isReferenced(res.getId()))
					return;
				Shell site = getSite().getShell();
				try {
					boolean dirty = false;
					org.eclipse.emf.ecore.resource.Resource airdResource = null;
					for (org.eclipse.emf.ecore.resource.Resource r: context.getResources())
					{
						URI uri = r.getURI();
						if (uri.isPlatformResource()) {
							dirty |= r.isModified(); 
							if (airdResource == null && !"afm".equals(uri.fileExtension())){ //$NON-NLS-1$
								airdResource = r;
							}
						}
					}
					String title = "Unreference viewpoint " + res.getLabel();
					if (dirty) {
						MessageDialog.openInformation(site, title, "You must save the model before unreferencing the viewpoint.");
						return ;
					}
					if (airdResource == null)
					{
						MessageDialog.openError(site, title, "Cannot locate resource to work on.");
						return ;
					}
					
					if (!MessageDialog.openQuestion(site, title, "Viewpoint Detachment is required. Proceed ?"))
						return;
					// Launch detach editor
					// if the detachement is successful then the viewpoint is no more in use
					IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(airdResource.getURI().toPlatformString(true)));
					DetachmentHelper.openEditor(file, new NullProgressMonitor());

				} catch (Exception e) {
					MessageDialog.openError(site, "Error", e.getMessage());
					Activator.getDefault().logError(e);
				}
			}
		};
		unReferenceAction.setText("Unreference");
		unReferenceAction.setToolTipText("Unreference the viewpoint");
		unReferenceAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.UNREFERENCE));

		activateAction = new MyAction() {
			public void run() {
				IStructuredSelection ss = (IStructuredSelection) viewer.getSelection();
				int size = ss.size();
				if (size != 1 || context == null)
					return;
				Description res = (Description) ss.getFirstElement();
				ViewpointManager vpMgr = ViewpointManager.getInstance(context);
				if (!vpMgr.isReferenced(res.getId()))
					return;
				try {
					vpMgr.setActivationState(res.getId(), true);
				} catch (ViewpointActivationException e) {
					MessageDialog.openError(getSite().getShell(), "Error", e.getMessage());
					Activator.getDefault().logError(e);
				}
			}
		};
		activateAction.setText("Activate");
		activateAction.setToolTipText("Activate the viewpoint");
		activateAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.ACTIVATE));

		desacticateAction = new MyAction() {
			public void run() {
				IStructuredSelection ss = (IStructuredSelection) viewer.getSelection();
				int size = ss.size();
				if (size != 1 || context == null)
					return;
				Description res = (Description) ss.getFirstElement();
				ViewpointManager vpMgr = ViewpointManager.getInstance(context);
				if (!vpMgr.isReferenced(res.getId()))
					return;
				try {
					vpMgr.setActivationState(res.getId(), false);
				} catch (ViewpointActivationException e) {
					MessageDialog.openError(getSite().getShell(), "Error", e.getMessage());
					Activator.getDefault().logError(e);
				}
			}
		};
		desacticateAction.setText("Desactivate");
		desacticateAction.setToolTipText("Desactiavte the viewpoint");
		desacticateAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.DEACTIVATE));

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
	
	private class MyAction extends Action {
		private boolean visible = false;

		
		public boolean isVisible() {
			return visible;
		}

		public void setVisible(boolean visible) {
			this.visible = visible;
		}
		
		
	}

}
