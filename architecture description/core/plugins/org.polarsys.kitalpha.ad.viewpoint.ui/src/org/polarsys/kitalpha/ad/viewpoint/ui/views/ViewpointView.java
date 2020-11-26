/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.polarsys.kitalpha.ad.af.coredomain.af.model.edit.provider.AfItemProviderAdapterFactory;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.common.utils.URIHelper;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.OverallListener;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.edit.provider.ToolsItemProviderAdapterFactory;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ModelManager;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ResourceManager;
import org.polarsys.kitalpha.ad.viewpoint.handlers.workspace.WorkspaceManager;
import org.polarsys.kitalpha.ad.viewpoint.ui.provider.AFSelectionProvider;
import org.polarsys.kitalpha.ad.viewpoint.ui.provider.DefaultSelectionProvider;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.Tab;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.TabFactory;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceNotFoundException;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.model.Location;

/**
 * @author Thomas Guiu
 * 
 */

public class ViewpointView extends ViewPart implements ISelectionProvider {

	private Viewpoint viewpoint;
	private org.polarsys.kitalpha.resourcereuse.model.Resource viewpointResource;
	private ModelManager modelManager;
	private final List<Tab> tabs = new ArrayList<>();
	private ModelLoader loader;
	private ProjectSelectionListener projectListener;
	private AFSelectionProvider selectionProvider;

	private PropertySheetPage propertySheetPage;
	private String resourceId;
	private OverallListener viewpointListener;
	private FormToolkit toolkit;
	private CTabFolder folder;

	@Override
	public void init(final IViewSite site) throws PartInitException {
		super.init(site);
		try {
			initResource();

			viewpointListener = new HiddingListener(site);
			ViewpointManager.addOverallListener(viewpointListener);
		} catch (Exception e) {
			throw new PartInitException(e.getMessage(), e);
		}
		selectionProvider = AFSelectionProvider.INSTANCE.getSelectionProvider(AFSelectionProvider.DEFAULT_PROVIDER_ID);
		if (selectionProvider == null) {
			AD_Log.getDefault().logWarning("Cannot find selection provider: " + AFSelectionProvider.DEFAULT_PROVIDER_ID);
			selectionProvider = AFSelectionProvider.INSTANCE.getSelectionProvider(AFSelectionProvider.DEFAULT_PROVIDER_ID2);
			if (selectionProvider == null) {
				AD_Log.getDefault().logError("Cannot find selection provider: " + AFSelectionProvider.DEFAULT_PROVIDER_ID2);
				selectionProvider = new DefaultSelectionProvider();
			}
		}
		loader.loadModel();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(loader, IResourceChangeEvent.PRE_REFRESH | IResourceChangeEvent.PRE_CLOSE | IResourceChangeEvent.POST_CHANGE | IResourceChangeEvent.PRE_DELETE);

		TabFactory.INSTANCE.createTab(resourceId, tabs, site);

		initializeEditingDomain();
	}

	private void initResource() throws ResourceNotFoundException {
		viewpointResource = ResourceReuse.createHelper().getResource(resourceId);
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize it.
	 */
	@Override
	public void createPartControl(Composite parent) {

		Display display = parent.getDisplay();
		toolkit = new FormToolkit(display);
		Composite composite = toolkit.createComposite(parent);
		composite.setLayout(new GridLayout());

		folder = new CTabFolder(composite, SWT.CLOSE | SWT.BOTTOM);
		folder.setUnselectedCloseVisible(false);
		folder.setSimple(false);

		init();

		getSite().setSelectionProvider(this);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	@Override
	public void setFocus() {
		// Nothing to do
	}

	@Override
	public void setInitializationData(IConfigurationElement cfig, String propertyName, Object data) {
		super.setInitializationData(cfig, propertyName, data);
		resourceId = cfig.getAttribute("resourceId");
		loader = new ModelLoader();
	}

	@Override
	public void dispose() {
		for (Tab tab : tabs) {
			tab.dispose();
		}
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(loader);
		loader.disposeModel();
		if (selectionProvider != null) {
			selectionProvider.removeListener(projectListener);
			selectionProvider.dispose();
		}
		if (viewpointListener != null) {
			ViewpointManager.removeOverallListener(viewpointListener);
		}
		viewpointListener = null;
		viewpointResource = null;
		super.dispose();
	}

	private void init() {
		// set part name
		updatePartName();

		// set tabs
		boolean designMode = isDesignMode();
		int selectionIndex = folder.getSelectionIndex();
		for (Tab tab : tabs) {
			tab.dispose();
			if (tab.isDesignOnly() && !isDesignMode()) {
				continue;
			}
			tab.createTab(toolkit, folder);
		}
		folder.setLayoutData(new GridData(GridData.FILL_BOTH));
		folder.setSelection(selectionIndex == -1 ? 0 : selectionIndex);

		for (Tab tab : tabs) {
			if (tab.isDesignOnly() && !designMode) {
				continue;
			}
			tab.setModelManager(viewpoint, modelManager);
			tab.setSelectionProvider(selectionProvider);
			tab.init();
		}
	}

	public void updatePartName() {
		String name = viewpoint.getName();
		boolean designMode = isDesignMode();
		if (designMode) {
			name += " [design]";
		}
		setPartName(name);
	}

	private boolean isDesignMode() {
		return !modelManager.getResourceManager().equals(WorkspaceManager.INSTANCE);
	}

	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IPropertySheetPage.class)) {
			return propertySheetPage;
		}
		return super.getAdapter(key);
	}

	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new AfItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ToolsItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create the command stack that will notify this editor as commands are
		// executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to
		// be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener(event -> {
				if (propertySheetPage != null && !propertySheetPage.getControl().isDisposed()) {
					propertySheetPage.refresh();
				}
			});

		// Create the editing domain with a special command stack.
		//
		AdapterFactoryEditingDomain editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());
		propertySheetPage = new ExtendedPropertySheetPage(editingDomain);
		propertySheetPage.setPropertySourceProvider(new org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider(adapterFactory));
	}

	private final class HiddingListener implements OverallListener {
		private final IViewSite site;

		private HiddingListener(IViewSite site) {
			this.site = site;
		}

		@Override
		public void hasBeenDeactivated(Object ctx, org.polarsys.kitalpha.resourcereuse.model.Resource vp) {
			if (resourceId != null && resourceId.equals(vp.getId())) {
				getSite().getShell().getDisplay().asyncExec( () -> site.getPage().hideView(ViewpointView.this));
			}
		}

		@Override
		public void hasBeenActivated(Object ctx, org.polarsys.kitalpha.resourcereuse.model.Resource vp) {
			//nothing to do
		}

		@Override
		public void hasBeenFiltered(Object ctx, org.polarsys.kitalpha.resourcereuse.model.Resource vp) {
			//nothing to do
		}

		@Override
		public void hasBeenDisplayed(Object ctx, org.polarsys.kitalpha.resourcereuse.model.Resource vp) {
			//nothing to do
		}
	}

	private class ModelLoader implements IResourceChangeListener {

		private URI currentURI;

		public void reloadModel(final long timeStamp) {
			Job job = new Job("Update view") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					long modelTimeStamp = modelManager.getResourceManager().getModelTimeStamp();
					// no need to refresh if changes come from this view
					if (timeStamp == modelTimeStamp) {
						return Status.OK_STATUS;
					}
					disposeModel();
					try {
						initResource();
					} catch (ResourceNotFoundException e) {
						AD_Log.getDefault().logError(e);
					}
					loadModel();
					getSite().getShell().getDisplay().asyncExec( () -> init());
					return Status.OK_STATUS;
				}
			};
			job.schedule(400);
		}

		private boolean isLocalViewpoint() {
			return viewpointResource.getProviderLocation().equals(Location.WORSPACE);
		}

		public void loadModel() {
			URI uri = URIHelper.createURI(viewpointResource);
			if (currentURI == null || !currentURI.equals(uri)) {
				disposeModel();
				viewpoint = (Viewpoint) ResourceManager.getResourceSet().getEObject(uri, true);
				if (viewpoint == null) {
					throw new IllegalStateException("Viewpoint has not been loaded: " + uri.toString());
				}
				viewpoint.eAdapters().add(new AdapterImpl() {

					@Override
					public void notifyChanged(Notification msg) {
						int eventType = msg.getEventType();
						Object feature = msg.getFeature();
						if (eventType == Notification.SET && ViewpointPackage.eINSTANCE.getNameElement_Name().equals(feature)) {
							updatePartName();
						}
					}

				});
				if (isLocalViewpoint()) {
					modelManager = ModelManager.createViewpointManager(viewpoint);
				} else {
					modelManager = ModelManager.createWorkspaceManager(viewpoint);
					projectListener = new ProjectSelectionListener();
					selectionProvider.addListener(projectListener);
				}
				currentURI = uri;
			}
		}

		public void disposeModel() {
			if (viewpoint != null) {
				Resource eResource = viewpoint.eResource();
				eResource.unload();
				ResourceManager.getResourceSet().getResources().remove(eResource);
				viewpoint = null;
			}
			if (modelManager != null) {
				if (projectListener != null) {
					getSite().getPage().removeSelectionListener(projectListener);
					projectListener = null;
				}
				for (Tab tab : tabs) {
					tab.setModelManager(viewpoint, null);
				}
				modelManager.dispose();
				modelManager = null;
			}
			currentURI = null;
		}

		@Override
		public void resourceChanged(IResourceChangeEvent event) {

			if (currentURI != null) {
				String project = currentURI.segment(1);
				IResourceDelta delta = event.getDelta();
				if (delta == null) {
					return;
				}

				String path = viewpointResource.getPath().substring(0, viewpointResource.getPath().indexOf('#'));
				IResourceDelta modelDelta = delta.findMember(new Path(path));
				IResourceDelta projectDelta = delta.findMember(new Path(project));
				boolean open = projectDelta == null ? false : (projectDelta.getFlags() & IResourceDelta.OPEN) != 0;
				boolean changed = modelDelta == null ? false : (modelDelta.getKind() & IResourceDelta.CHANGED) != 0;
				boolean deleted = modelDelta == null ? false : (modelDelta.getKind() & IResourceDelta.REMOVED) != 0;

				if (open || changed || deleted) {
					// force reload in of an open/close event
					reloadModel(open ? 0 : modelDelta.getResource().getLocalTimeStamp());
				}
			}

		}
	}

	@Override
	public ISelection getSelection() { 
		return null;
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		for (Tab tab : tabs) {
			ISelectionProvider prov = tab.getSelectionProvider();
			if (prov == null) {
				continue;
			}
			prov.addSelectionChangedListener(listener);
		}
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		for (Tab tab : tabs) {
			ISelectionProvider prov = tab.getSelectionProvider();
			if (prov == null) {
				continue;
			}
			prov.removeSelectionChangedListener(listener);
		}
	}

	@Override
	public void setSelection(ISelection selection) {
		for (Tab tab : tabs) {
			ISelectionProvider prov = tab.getSelectionProvider();
			if (prov == null){
				continue;
			}
			prov.setSelection(selection);
		}
	}

	public ViewpointView() {
		super();
	}

}