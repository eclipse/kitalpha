/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.services.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.osgi.util.NLS;
import org.osgi.framework.Bundle;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.common.utils.URIHelper;
import org.polarsys.kitalpha.ad.metadata.helpers.MetadataHelper;
import org.polarsys.kitalpha.ad.services.Activator;
import org.polarsys.kitalpha.ad.services.Messages;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.model.Location;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointManager {

	private static final String VIEWPOINT_STATE_READ_ONLY = "stateReadOnly";
	private final static Set<String> discarded = new HashSet<String>();
	private final static List<OverallListener> overallListeners = new ArrayList<OverallListener>();
	private final List<Listener> listeners = new ArrayList<Listener>();
	private static final int ACTIVATED = 1;
	private static final int DEACTIVATED = 2;
	private static final int DISPLAYED = 4;
	private static final int FILTERED = 8;
	private final static Map<ResourceSet, ViewpointManager> instances = new HashMap<ResourceSet, ViewpointManager>();

	private final Map<String, List<String>> dependencies = new HashMap<String, List<String>>();
	private final Set<String> managed = new HashSet<String>();
	private ResourceSet target;

	public static boolean canChangeState(String id) {
		Resource res = getViewpoint(id);
		return res != null && !res.getTags().contains(VIEWPOINT_STATE_READ_ONLY);
	}

	public void setTarget(ResourceSet target) {
		this.target = target;
	}

	public static Resource getViewpoint(String id) {
		for (Resource res : getAvailableViewpoints()) {
			if (id.equals(res.getId()))
				return res;
		}
		return null;
	}

	public static void pinError(Resource vp, Exception e) {
		discarded.add(vp.getId());
		String msg = "Resource '" + vp.getId() + "' cannot be loaded, The viewpoint is discarded.";
		AD_Log.getDefault().logError(msg, e);
	}

	public static void pinError(Resource vp, String details) {
		discarded.add(vp.getId());
		String msg = "Resource '" + vp.getId() + "' cannot be loaded, The viewpoint is discarded.\n" + details;
		AD_Log.getDefault().logError(msg);
	}

	public static Description[] getAvailableViewpointDescriptions() {
		ResourceSet set = new ResourceSetImpl();
		List<Description> result = new ArrayList<ViewpointManager.Description>();
		try {
			for (Resource resource : getAvailableViewpoints()) {
				try {
					URI uri = URIHelper.createURI(resource);
					Viewpoint vp = (Viewpoint) set.getEObject(uri, true);
					result.add(new Description(vp.getId(), vp.getName(), vp.getVersion()));
				} catch (Exception e) {
					pinError(resource, e);
				}
			}
		} finally {
			for (org.eclipse.emf.ecore.resource.Resource r : set.getResources()) {
				r.unload();
			}
			set.getResources().clear();
		}
		return result.toArray(new Description[result.size()]);
	}

	public static Version readVersion(Resource resource) {
		ResourceSet set = new ResourceSetImpl();
		try {
			return readVersion(set, resource);
		} finally {
			for (org.eclipse.emf.ecore.resource.Resource r : set.getResources()) {
				r.unload();
			}
			set.getResources().clear();
		}
	}

	private static Version readVersion(ResourceSet set, Resource resource) {
		try {
			URI uri = URIHelper.createURI(resource);
			Viewpoint vp = (Viewpoint) set.getEObject(uri, true);
			return vp.getVersion();
		} catch (Exception e) {
			pinError(resource, e);
			return null;
		}

	}

	/**
	 * Ensure the vp declared into the model match the vp available into the platform.
	 * 
	 * @param context
	 * @return
	 */
	public static IStatus checkViewpointsCompliancy(ResourceSet context) {
		MultiStatus error = new MultiStatus(Activator.getDefault().getBundle().getSymbolicName(), 0, "Error with used viewpoints", null);

		Map<String, Version> availableViewpoints = computeAvailableViewpointVersions();
		Map<String, Version> viewpointUsages = MetadataHelper.getViewpointMetadata(context).getViewpointUsages();

		for (Entry<String, Version> usage : viewpointUsages.entrySet()) {
			IStatus res = useViewpoint(availableViewpoints, usage.getKey(), usage.getValue());
			if (!res.isOK())
				error.add(res);
		}
		if (!error.isOK())
			return error;
		return Status.OK_STATUS;
	}

	private static Map<String, Version> computeAvailableViewpointVersions() {
		Map<String, Version> availableViewpoints = new HashMap<String, Version>();
		ResourceSet set = new ResourceSetImpl();
		Resource resource = null;
		try {
			for (Resource res : getAvailableViewpoints()) {
				try {
					resource = res;
					URI uri = URIHelper.createURI(res);
					Viewpoint vp = (Viewpoint) set.getEObject(uri, true);
					if (vp == null) {
						pinError(resource, "Cannot get object from " + uri.toString());
						continue;
					}
					availableViewpoints.put(res.getId(), vp.getVersion());
				} catch (Exception e) {
					pinError(resource, e);
				}
			}
		} finally {
			for (org.eclipse.emf.ecore.resource.Resource r : set.getResources()) {
				r.unload();
			}
			set.getResources().clear();
		}
		return availableViewpoints;
	}

	private static IStatus useViewpoint(Map<String, Version> availableViewpoints, String id, Version version) {
		for (Entry<String, Version> res : availableViewpoints.entrySet()) {
			if (res.getKey().equals(id)) {
				if (version == null || version.equals(res.getValue()))
					return Status.OK_STATUS;
				return new Status(IStatus.ERROR, Activator.getDefault().getBundle().getSymbolicName(), "Expecting version '" + version + "' for viewpoint '" + id + "' (current version: '" + res.getValue() + "')");
			}
		}
		return new Status(IStatus.ERROR, Activator.getDefault().getBundle().getSymbolicName(), "Missing viewpoint '" + id + "'");
	}

	public static Resource[] getAvailableViewpoints() {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setDomain("AF");
		searchCriteria.getTags().add("vp");
		Resource[] resources = ResourceReuse.createHelper().getResources(searchCriteria);
		if (discarded.isEmpty())
			return resources;
		List<Resource> result = new ArrayList<Resource>(resources.length);
		for (Resource res : resources) {
			if (!discarded.contains(res.getId()))
				result.add(res);
		}
		return result.toArray(new Resource[result.size()]);
	}

	public boolean isActive(String id) {
		return MetadataHelper.getViewpointMetadata(target).isInUse(id);
	}

	public boolean isUsed(String id) {
		return MetadataHelper.getViewpointMetadata(target).isInUse(id);
	}

	public boolean isFiltered(String id) {
		return MetadataHelper.getViewpointMetadata(target).isFiltered(id);
	}

	public void filter(String id, boolean state) throws ViewpointActivationException {
		Resource vpResource = getViewpoint(id);
		if (vpResource == null)
			throw new ViewpointActivationException(NLS.bind(Messages.Viewpoint_Manager_error_3, id));
		if (!isUsed(id))
			throw new AlreadyInStateException(NLS.bind(Messages.Viewpoint_Manager_error_4, id));
		MetadataHelper.getViewpointMetadata(target).setFilter(id, state);
		fireEvent(vpResource, state ? FILTERED : DISPLAYED);
	}

	public void activate(String id) throws ViewpointActivationException {
		startUse(id);
	}

	public void startUse(String id) throws ViewpointActivationException {
		Resource vpResource = getViewpoint(id);
		if (vpResource == null)
			throw new ViewpointActivationException(NLS.bind(Messages.Viewpoint_Manager_error_3, id));
		if (isUsed(id))
			throw new AlreadyInStateException(NLS.bind(Messages.Viewpoint_Manager_error_4, id));

		ResourceSet set = new ResourceSetImpl();
		try {
			doStartUse(set, vpResource);
		} finally {
			for (org.eclipse.emf.ecore.resource.Resource r : set.getResources()) {
				r.unload();
			}
			set.getResources().clear();
		}
	}

	protected void doStartUse(ResourceSet set, Resource vpResource) throws ViewpointActivationException {
		startBundle(vpResource);
		manageDependencies(set, vpResource);
		Version readVersion = readVersion(set, vpResource);
		MetadataHelper.getViewpointMetadata(target).setUsage(vpResource, readVersion, true);
		managed.add(vpResource.getProviderSymbolicName());
		if (Location.WORSPACE.equals(vpResource.getProviderLocation()))
			managed.add(vpResource.getProviderSymbolicName());
		fireEvent(vpResource, ACTIVATED);
	}

	protected void manageDependencies(ResourceSet set, Resource vpResource) throws ViewpointActivationException {

		URI uri = URIHelper.createURI(vpResource);
		Viewpoint vp = (Viewpoint) set.getEObject(uri, true);
		List<String> vpDependencies = dependencies.get(vpResource.getId());
		if (vpDependencies == null)
			dependencies.put(vpResource.getId(), vpDependencies = new ArrayList<String>());
		vpDependencies.clear();
		List<Viewpoint> dependencies = new ArrayList<Viewpoint>(10);
		dependencies.addAll(vp.getDependencies());
		dependencies.addAll(vp.getParents());
		for (Viewpoint dep : dependencies) {
			String id = dep.getId();
			vpDependencies.add(id);
			if (!isUsed(id))
				doStartUse(set, getViewpoint(id));
		}

	}

	protected void startBundle(Resource vpResource) throws ViewpointActivationException {
		String providerSymbolicName = vpResource.getProviderSymbolicName();
		Bundle bundle = Platform.getBundle(providerSymbolicName);
		if (bundle == null || managed.contains(providerSymbolicName)) {
			activateBundle(providerSymbolicName);
			bundle = Platform.getBundle(providerSymbolicName);
		}
		if (bundle == null)
			throw new ViewpointActivationException(NLS.bind(Messages.Viewpoint_Manager_error_7, providerSymbolicName));

		try {
			bundle.start(Bundle.START_TRANSIENT);
			// wait for event dispatch
			Thread.sleep(100);
		} catch (Exception e) {
			throw new ViewpointActivationException(e);
		}
	}

	protected void activateBundle(String id) throws ViewpointActivationException {
		// This implementation does not intend to add or update any bundle
		if (Platform.getBundle(id) == null)
			throw new ViewpointActivationException(Messages.Viewpoint_Manager_error_5);
	}

	protected void desactivateBundle(String id) throws ViewpointActivationException {

	}

	public void desactivate(String id) throws ViewpointActivationException {
		stopUse(id);
	}

	public void stopUse(String id) throws ViewpointActivationException {
		Resource vpResource = getViewpoint(id);
		if (vpResource == null)
			throw new ViewpointActivationException(NLS.bind(Messages.Viewpoint_Manager_error_3, id));
		if (!isUsed(id))
			throw new AlreadyInStateException(NLS.bind(Messages.Viewpoint_Manager_error_6, id));
		for (Entry<String, List<String>> entry : dependencies.entrySet()) {
			if (entry.getValue().contains(id))
				throw new ViewpointActivationException(NLS.bind(Messages.Viewpoint_Manager_error_8, id, entry.getKey()));

		}
		dependencies.remove(id);
		// notify listeners and then desactivate viewpoint. Maybe we need
		// additional events such PRE_DEACTIVATED or POST_DEACTIVATED
		String providerSymbolicName = vpResource.getProviderSymbolicName();
		desactivateBundle(providerSymbolicName);
		MetadataHelper.getViewpointMetadata(target).setUsage(vpResource, null, false);
		fireEvent(vpResource, DEACTIVATED);
	}

	public static void addOverallListener(OverallListener l) {
		if (overallListeners.contains(l))
			return;
		overallListeners.add(l);
	}

	public static void removeOverallListener(OverallListener l) {
		overallListeners.remove(l);
	}

	public void addListener(Listener l) {
		if (listeners.contains(l))
			return;
		listeners.add(l);
	}

	public void removeListener(Listener l) {
		listeners.remove(l);
	}

	protected void fireEvent(Resource vpResource, int event) {
		for (Listener l : listeners.toArray(new Listener[listeners.size()])) {
			switch (event) {
			case ACTIVATED:
				l.hasBeenActivated(vpResource);
				break;
			case DEACTIVATED:
				l.hasBeenDeactivated(vpResource);
				break;
			case FILTERED:
				l.hasBeenFiltered(vpResource);
				break;
			case DISPLAYED:
				l.hasBeenDisplayed(vpResource);
				break;
			}
		}
		for (OverallListener l : overallListeners.toArray(new OverallListener[overallListeners.size()])) {
			switch (event) {
			case ACTIVATED:
				l.hasBeenActivated(target, vpResource);
				break;
			case DEACTIVATED:
				l.hasBeenDeactivated(target, vpResource);
				break;
			case FILTERED:
				l.hasBeenFiltered(target, vpResource);
				break;
			case DISPLAYED:
				l.hasBeenDisplayed(target, vpResource);
				break;
			}
		}
	}

	public static interface OverallListener {
		void hasBeenActivated(Object ctx, Resource vp);

		void hasBeenDeactivated(Object ctx, Resource vp);

		void hasBeenFiltered(Object ctx, Resource vp);

		void hasBeenDisplayed(Object ctx, Resource vp);
	}

	public static interface Listener {
		void hasBeenActivated(Resource vp);

		void hasBeenDeactivated(Resource vp);

		void hasBeenFiltered(Resource vp);

		void hasBeenDisplayed(Resource vp);

	}

	public static ViewpointManager getInstance(EObject ctx1) {
		ResourceSet ctx = ctx1.eResource().getResourceSet();
		return getInstance(ctx);
	}

	public static ViewpointManager getInstance(final ResourceSet ctx) {
		ViewpointManager instance = instances.get(ctx);
		if (instance == null) {
			instances.put(ctx, instance = createInstance());
			ctx.eAdapters().add(new AdapterImpl() {

				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getEventType() == Notification.REMOVE && ctx.getResources().isEmpty())
						instances.remove(ctx);
				}

			});
			instance.setTarget(ctx);
		}
		return instance;
	}

	private static ViewpointManager createInstance() {
		ViewpointManager instance = null;
		try {
			IConfigurationElement[] elts = Platform.getExtensionRegistry().getConfigurationElementsFor("org.polarsys.kitalpha.ad.services.viewpoint.manager");
			if (elts == null || elts.length == 0)
				instance = new ViewpointManager();
			else
				instance = (ViewpointManager) elts[0].createExecutableExtension("class");
		} catch (CoreException e) {
			AD_Log.getDefault().logError(Messages.Viewpoint_Manager_error_2, e);
			instance = new ViewpointManager();
		}
		return instance;
	}

	public static class Description {
		private final String id;
		private final String label;
		private final Version version;

		public Description(String id, String label, Version version) {
			super();
			this.id = id;
			this.label = label;
			this.version = version;
		}

		public String getId() {
			return id;
		}

		public String getLabel() {
			return label;
		}

		public Version getVersion() {
			return version;
		}

	}

}
