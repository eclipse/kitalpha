/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
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
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.services.helpers.ViewpointHelper;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.Description;
import org.polarsys.kitalpha.ad.viewpoint.predicate.exceptions.EvaluationException;
import org.polarsys.kitalpha.ad.viewpoint.predicate.factories.FactoryProvider;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.ContextProvider;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.TransitionEngine;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;
import org.polarsys.kitalpha.ad.viewpoint.ui.internal.actions.ViewpointUIContextProvider;
import org.polarsys.kitalpha.ad.viewpoint.ui.provider.AFContextProvider;
import org.polarsys.kitalpha.model.common.commands.registry.WorkflowType;
import org.polarsys.kitalpha.model.common.commands.runner.IModelCommandRunner;
import org.polarsys.kitalpha.model.common.commands.runner.ModelCommandRunner;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.Scrutineer;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry.RegistryElement;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.IViewpointTreeDescription;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.ViewpointTreeContainer;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointManagerView extends ViewPart {
	
	private static final String ERROR_LABEL = "Error";
	private static final String DISPLAY_VIEWPOINT_ACTION = "Display.Viewpoint"; //$NON-NLS-1$

	private final class SelectionListener implements ISelectionListener {
		private final Label textLabel;
		private final Label imgLabel;

		private SelectionListener(Label textLabel, Label imgLabel) {
			this.textLabel = textLabel;
			this.imgLabel = imgLabel;
		}

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
			if (context == null){
				return Messages.ViewpointManagerView_default_label;
			}
			if (context.getResources().isEmpty()){
				return "";
			}
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
				if (computeContext != null){
					return computeContext;
				}
			}
			return null;
		}
	}


	private final class RefreshJob extends Job {
		private RefreshJob() {
			super("Refresh ViewpointManager view");
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			final Description[] availableViewpoints = getFilteredViewpoints();
			if (viewer != null && viewer.getControl() != null && !viewer.getControl().isDisposed())
			{
				getSite().getShell().getDisplay().asyncExec(() -> {
						viewer.setInput(availableViewpoints);
						updateActions(null);
					});
			}
			return Status.OK_STATUS;
		}
		
		private Description[] getFilteredViewpoints(){
			Description[] viewpointDescriptions = ViewpointManager.getAvailableViewpointDescriptions();
			List<Description> result = new ArrayList<>();
			for (Description description : viewpointDescriptions) {
				final ViewpointUIContextProvider displayContextProvider = (new ViewpointUIContextProvider(description.getId(), ViewpointManager.getInstance(context)));
				TransitionEngine transitionEngine = FactoryProvider.getTransitionFactory().createTransitionEngine(description.getId(), DISPLAY_VIEWPOINT_ACTION, displayContextProvider);
				try {
					if (transitionEngine.eval()){
						result.add(description);
					}
				} catch (EvaluationException e) {
					AD_Log.getDefault().logWarning(e);
				}
			}
			return result.toArray(new Description[result.size()]);
		}
	}
	

	private final class HeaderSelectionListener extends SelectionListener2 {
		private final TableViewerSorter comparator;
		private final int columnIndex;

		private HeaderSelectionListener(TableViewerSorter comparator, int columnIndex) {
			this.comparator = comparator;
			this.columnIndex = columnIndex;
		}

		@Override
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
			ITableLabelProvider prov = (ITableLabelProvider) ((TableViewer) viewer).getLabelProvider();
			String name1 = prov.getColumnText(e1, sortColumn);
			String name2 = prov.getColumnText(e2, sortColumn);
			if (ascending){
				return getComparator().compare(name1, name2);
			}
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

		@Override
		public void hasBeenDeactivated(Object ctx, Resource vp) {
			init();
		}

		@Override
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
	private final IResourceChangeListener wsListener = event ->  {

			IResourceDelta delta = event.getDelta();
			IResource resource = event.getResource();
			int type = event.getType();
			if ((type == IResourceChangeEvent.PRE_DELETE || type == IResourceChangeEvent.PRE_CLOSE) && resource instanceof IProject){
				delayedInit();
			} else if (type == IResourceChangeEvent.POST_CHANGE) {
				for (IResourceDelta childDelta : delta.getAffectedChildren()) {
					resource = childDelta.getResource();
					if (resource instanceof IProject) {
						delayedInit();
						break;
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
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().addSelectionListener(new SelectionListener(textLabel, imgLabel));
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
		layout.addColumnData(new ColumnWeightData(5, 250, true));
		nameColumn.getColumn().setText("Name");
		nameColumn.getColumn().setResizable(true);

		TableViewerColumn versionColumn = new TableViewerColumn(viewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 150, true));
		versionColumn.getColumn().setText("Version");
		versionColumn.getColumn().setResizable(true);

		TableViewerColumn stateColumn = new TableViewerColumn(viewer, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(1, 50, true));
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
		
		viewer.addSelectionChangedListener(event ->  updateActions((IStructuredSelection) event.getSelection()));

		viewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (((Description) element).shloudBeHidden()){
					return showHiddenViewpointAction.isChecked();
				}
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
		viewer.addDoubleClickListener(event -> openViewAction.run());
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(manager -> ViewpointManagerView.this.fillContextMenu(manager));
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
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
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(refreshAction);
		manager.add(new Separator());
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
				if ("cdo".equals(re.getURI().scheme())){
					return true;
				}
			}
		}
		return false;
	}

	private void makeActions() {
		showHiddenViewpointAction = new Action("", IAction.AS_CHECK_BOX) {
			@Override
			public void run() {
				viewer.refresh();
			}
		};
		showHiddenViewpointAction.setText("Show all viewpoints");
		showHiddenViewpointAction.setToolTipText("Show all viewpoints");
		showHiddenViewpointAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.DISPLAY_ALL));

		referenceAction = new Action() {
			@Override
			public void run() {
				IStructuredSelection ss = (IStructuredSelection) viewer.getSelection();
				int size = ss.size();
				if (size != 1 || context == null){
					return;
				}
				final Description res = (Description) ss.getFirstElement();
				ViewpointManager vpMgr = ViewpointManager.getInstance(context);
				if (vpMgr.isReferenced(res.getId())){
					return;
				}
				try {
					vpMgr.reference(res.getId());
				} catch (ViewpointActivationException | EvaluationException e) {
					MessageDialog.openError(getSite().getShell(), ERROR_LABEL, e.getMessage());
					AD_Log.getDefault().logError(e);
				}
			}
		};
		referenceAction.setText("Reference");
		referenceAction.setToolTipText("Reference this viewpoint");
		referenceAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.REFERENCE));

		unReferenceAction = new Action() {
			@Override
			public void run() {
				IStructuredSelection ss = (IStructuredSelection) viewer.getSelection();
				int size = ss.size();
				if (size != 1 || context == null){
					return;
				}
				Description res = (Description) ss.getFirstElement();
				ViewpointManager vpMgr = ViewpointManager.getInstance(context);
				String id = res.getId();
				if (!vpMgr.isReferenced(id)){
					return;
				}
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
					if (airdResource == null){
						MessageDialog.openError(site, title, "Cannot locate resource to work on.");
						return ;
					}
					
					if (!MessageDialog.openQuestion(site, title, "Viewpoint Detachment is required. Proceed ?")){
						return;
					}
					// Launch detach editor
					// if the detachement is successful then the viewpoint is no more in use
					
					ContextProvider contextProvider = new ViewpointUIContextProvider(res.getId(), vpMgr);
					TransitionEngine transitionEngine = FactoryProvider.getTransitionFactory().createTransitionEngine(res.getId(), "Unreference.Viewpoint", contextProvider); 

					if (transitionEngine.eval()){
						ModelScrutinyRegistry analysis = Scrutineer.startScrutiny(airdResource);
						RegistryElement vpReg = analysis.getRegistryElement("org.polarsys.kitalpha.model.common.scrutiny.contrib.scrutiny.viewpoints"); //$NON-NLS-1$
						Collection<IScrutinize> finders = vpReg.getFinders();
						for (IScrutinize s : finders) {
							ViewpointTreeContainer vps = (ViewpointTreeContainer) s.getAnalysisResult();
							for (IViewpointTreeDescription root : vps.getRoots()) {
								unselect(root, id);
							}
						}

						//Run Commands
						IModelCommandRunner commandRunner = new ModelCommandRunner();
						commandRunner.run(analysis, airdResource, EnumSet.of(WorkflowType.ALL, WorkflowType.DETACHMENT), new NullProgressMonitor());
					} else {
						String message = ViewpointHelper.buildDiagnosticMessage(transitionEngine, false, "Cannot Unreference viewpoint: " + res.getId()); //$NON-NLS-1$
						throw new ViewpointActivationException(message);
					}
				} catch (Exception e) {
					MessageDialog.openError(site, ERROR_LABEL, e.getMessage());
					Activator.getDefault().logError(e);
				}
			}
			private void unselect(IViewpointTreeDescription iViewpointTreeDescription, final String vpid) {
				String viewpointId = iViewpointTreeDescription.getViewpointId();
				if (vpid.equals(viewpointId)){
					iViewpointTreeDescription.setAsCandidateToKeep(false);
					iViewpointTreeDescription.updateCandidates(false);
					return;
				}
				Collection<IViewpointTreeDescription> children = iViewpointTreeDescription.getChildren();
				if (children != null && !children.isEmpty()){
					for (IViewpointTreeDescription vpd : children) {
						unselect(vpd, vpid);
					}
				}
			}
			
		};
		unReferenceAction.setText("Unreference");
		unReferenceAction.setToolTipText("Unreference the viewpoint");
		unReferenceAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.UNREFERENCE));

		activateAction = new MyAction() {
			@Override
			public void run() {
				IStructuredSelection ss = (IStructuredSelection) viewer.getSelection();
				int size = ss.size();
				if (size != 1 || context == null){
					return;
				}
				Description res = (Description) ss.getFirstElement();
				ViewpointManager vpMgr = ViewpointManager.getInstance(context);
				if (!vpMgr.isReferenced(res.getId())){
					return;
				}
				try {
					vpMgr.setActivationState(res.getId(), true);
				} catch (ViewpointActivationException e) {
					MessageDialog.openError(getSite().getShell(), ERROR_LABEL, e.getMessage());
					Activator.getDefault().logError(e);
				}
			}
		};
		activateAction.setText("Activate");
		activateAction.setToolTipText("Activate the viewpoint");
		activateAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.ACTIVATE));

		desacticateAction = new MyAction() {
			@Override
			public void run() {
				IStructuredSelection ss = (IStructuredSelection) viewer.getSelection();
				int size = ss.size();
				if (size != 1 || context == null){
					return;
				}
				Description res = (Description) ss.getFirstElement();
				ViewpointManager vpMgr = ViewpointManager.getInstance(context);
				if (!vpMgr.isReferenced(res.getId())){
					return;
				}
				try {
					vpMgr.setActivationState(res.getId(), false);
				} catch (ViewpointActivationException e) {
					MessageDialog.openError(getSite().getShell(), ERROR_LABEL, e.getMessage());
					Activator.getDefault().logError(e);
				}
			}
		};
		desacticateAction.setText("Desactivate");
		desacticateAction.setToolTipText("Desactiavte the viewpoint");
		desacticateAction.setImageDescriptor(Activator.getDefault().getImageDescriptor(AFImages.DEACTIVATE));

		refreshAction = new Action() {
			@Override
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
