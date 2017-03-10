/*******************************************************************************
 * Copyright (c) 2016-2017 Thales Global Services.
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
import java.util.Arrays;
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
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.osgi.util.NLS;
import org.osgi.framework.Bundle;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.common.utils.URIHelper;
import org.polarsys.kitalpha.ad.metadata.helpers.MetadataHelper;
import org.polarsys.kitalpha.ad.metadata.helpers.ViewpointMetadata;
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
	private static final String VIEWPOINT_STATE_HIDDEN = "stateHidden";
	private static final String VIEWPOINT_STATE_MUTABLE_ACTIVATION = "stateMutableActivation";
	
	private final static List<OverallListener> overallListeners = new ArrayList<OverallListener>();
	private final static List<OverallListener2> overallListener2s = new ArrayList<OverallListener2>();
	private final List<Listener> listeners = new ArrayList<Listener>();
	private final List<Listener2> listener2s = new ArrayList<Listener2>();
	private static final int REFERENCE = 16;
	private static final int UNREFERENCE = 32;
	private static final int ACTIVE = 64;
	private static final int INACTIVE = 128;
	private final static ViewpointManager nullManager = new NullViewpointManager();
	private final static Map<ResourceSet, ViewpointManager> instances = new HashMap<ResourceSet, ViewpointManager>();
	protected static ViewpointFinder VP_FINDER = new CachingFinder();

	private final Map<String, List<String>> dependencies = new HashMap<String, List<String>>();
	private final Set<String> managed = new HashSet<String>();
	private ResourceSet target;

	public static boolean canChangeState(String id) {
		Resource res = getViewpoint(id);
		return canChangeState(res);
	}

	public static boolean canChangeActivation(String id) {
		Resource res = getViewpoint(id);
		return canChangeActivation(res);
	}

	public static boolean canChangeState(Resource res) {
		return res != null && !res.getTags().contains(VIEWPOINT_STATE_READ_ONLY);
	}
	
	public static boolean canChangeActivation(Resource res) {
		return res != null && res.getTags().contains(VIEWPOINT_STATE_MUTABLE_ACTIVATION);
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
		VP_FINDER.pinError(vp, e);
	}

	public static void pinError(Resource vp, String details) {
		VP_FINDER.pinError(vp, details);
	}

	public static Description[] getAvailableViewpointDescriptions() {
		ResourceSet set = new ResourceSetImpl();
		List<Description> result = new ArrayList<ViewpointManager.Description>();
		try {
			for (Resource resource : getAvailableViewpoints()) {
				try {
					URI uri = URIHelper.createURI(resource);
					Viewpoint vp = (Viewpoint) set.getEObject(uri, true);
					result.add(new Description(vp.getId(), vp.getName(), vp.getVersion(), resource));
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

		ViewpointMetadata viewpointMetadata = MetadataHelper.getViewpointMetadata(context);
		if (!viewpointMetadata.hasMetadata()) {
			URI uri = viewpointMetadata.getExpectedMetadataStorageURI();
			error.add(new Status(IStatus.ERROR, Activator.getDefault().getBundle().getSymbolicName(), "Cannot find metadata resource: "+uri.toPlatformString(false)));
			return error;
		}
		Map<String, Version> availableViewpoints = computeAvailableViewpointVersions();
		Map<String, Version> viewpointUsages = viewpointMetadata.getViewpointReferences();

		for (Entry<String, Version> usage : viewpointUsages.entrySet()) {
			IStatus res = useViewpoint(availableViewpoints, usage.getKey(), usage.getValue());
			if (!res.isOK())
				error.add(res);
		}
		if (!error.isOK())
			return error;
		return Status.OK_STATUS;
	}
	
	public static IStatus checkViewpointCompliancy(ResourceSet context, String vpId) {
		Map<String, Version> availableViewpoints = computeAvailableViewpointVersions();
		ViewpointMetadata viewpointMetadata = MetadataHelper.getViewpointMetadata(context);
		Map<String, Version> viewpointUsages = viewpointMetadata.getViewpointReferences();
		if (viewpointUsages.containsKey(vpId)) {
			return useViewpoint(availableViewpoints, vpId, viewpointUsages.get(vpId));
		}
		return new Status(IStatus.ERROR, Activator.getDefault().getBundle().getSymbolicName(), "Not used viewpoint '" + vpId + "'");
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
				if (version == null || areEquivalentTo(version, res.getValue()))
					return Status.OK_STATUS;
				return new Status(IStatus.ERROR, Activator.getDefault().getBundle().getSymbolicName(), "Expecting version '" + version + "' for viewpoint '" + id + "' (current version: '" + res.getValue() + "')");
			}
		}
		return new Status(IStatus.ERROR, Activator.getDefault().getBundle().getSymbolicName(), "Missing viewpoint '" + id + "'");
	}

	private static boolean areEquivalentTo(Version v1, Version v2) {
		if (v1 == null || v2 == null)
			return true;
		return v1.getMajor() == v2.getMajor() && v1.getMinor() == v2.getMinor();
	}

	public static Resource[] getAvailableViewpoints() {
		return VP_FINDER.getAvailableViewpoints();
	}

	/**
	 * @deprecated replaced by isUsed(String id) and isFiltered(String id)
	 */
	public boolean isActive(String id) {
		return isUsed(id) && !isFiltered(id);
	}

	
	/**
	 * @deprecated replaced by isReferenced(String id)
	 */
	public boolean isUsed(String id) {
		return isReferenced(id);
	}
	
	public boolean isReferenced(String id) {
		return MetadataHelper.getViewpointMetadata(target).isReferenced(id);
	}

	/**
	 * @deprecated replaced by isInactive(String id)
	 */
	public boolean isFiltered(String id) {
		return isInactive(id);
	}
	
	public boolean isInactive(String id) {
		return MetadataHelper.getViewpointMetadata(target).isInactive(id);
	}

	/**
	 * @deprecated replaced by setActivationState(String id)
	 */
	public void filter(String id, boolean state) throws ViewpointActivationException {
		setActivationState(id, !state);
	}
	
	public void setActivationState(String id, boolean active) throws ViewpointActivationException {
		Resource vpResource = getViewpoint(id);
		if (vpResource == null)
			throw new ViewpointActivationException(NLS.bind(Messages.Viewpoint_Manager_error_3, id));
		if (!isReferenced(id))
			throw new AlreadyInStateException(NLS.bind(Messages.Viewpoint_Manager_error_4, id));

		ChangeViewpointVisibilityCommand command = new ChangeViewpointVisibilityCommand(vpResource, active);
		executeCommand(command);

	}

	public boolean hasMetadata() {
		return MetadataHelper.getViewpointMetadata(target).hasMetadata();
	}

	/**
	 * @deprecated replaced by reference(String id)
	 */
	public void activate(String id) throws ViewpointActivationException {
		reference(id);
	}

	/**
	 * @deprecated replaced by reference(String id)
	 */
	public void startUse(String id) throws ViewpointActivationException {
		reference(id);
	}
	
	public void reference(String id) throws ViewpointActivationException {
		Resource vpResource = getViewpoint(id);
		if (vpResource == null)
			throw new ViewpointActivationException(NLS.bind(Messages.Viewpoint_Manager_error_3, id));
		if (isUsed(id))
			throw new AlreadyInStateException(NLS.bind(Messages.Viewpoint_Manager_error_4, id));

		ResourceSet set = new ResourceSetImpl();
		try {
			doReference(set, vpResource);
		} finally {
			for (org.eclipse.emf.ecore.resource.Resource r : set.getResources()) {
				r.unload();
			}
			set.getResources().clear();
		}
	}

	protected void doReference(ResourceSet set, Resource vpResource) throws ViewpointActivationException {
		startBundle(vpResource);
		manageDependencies(set, vpResource);

		Command command = new ReferenceViewpointCommand(vpResource, set);
		executeCommand(command);
	}

	private void executeCommand(Command command) {
		EditingDomain editingDomain = TransactionUtil.getEditingDomain(target);
		if (editingDomain == null && target instanceof IEditingDomainProvider)
			editingDomain = ((IEditingDomainProvider) target).getEditingDomain();

		editingDomain.getCommandStack().execute(command);
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
			if (!isReferenced(id))
				doReference(set, getViewpoint(id));
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

	/**
	 * There is really no for this method since to stop usage of a viewpoint a detachment is performed
	 * 
	 * @param id
	 * @throws ViewpointActivationException
	 * @deprecated replaced by stopUse(String id)
	 */
	public void desactivate(String id) throws ViewpointActivationException {
		stopUse(id);
	}

	/**
	 * There is really no for this method since to stop usage of a viewpoint a detachment is performed
	 * 
	 * @param id
	 * @throws ViewpointActivationException
	 * @deprecated use unReference()
	 * 
	 */
	public void stopUse(String id) throws ViewpointActivationException {
		unReference(id);
	}
	
	public void unReference(String id) throws ViewpointActivationException {
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
		fireEvent(vpResource, UNREFERENCE);
	}

	public static void addOverallListener(OverallListener2 l) {
		if (overallListener2s.contains(l))
			return;
		overallListener2s.add(l);
	}
	
	public static void removeOverallListener(OverallListener2 l) {
		overallListener2s.remove(l);
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

	public void addListener(Listener2 l) {
		if (listener2s.contains(l))
			return;
		listener2s.add(l);
	}

	public void removeListener(Listener2 l) {
		listener2s.remove(l);
	}

	protected void fireEvent(Resource vpResource, int event) {
		for (Listener l : listeners.toArray(new Listener[listeners.size()])) {
			try {
				switch (event) {
				case REFERENCE:
					l.hasBeenActivated(vpResource);
					break;
				case UNREFERENCE:
					l.hasBeenDeactivated(vpResource);
					break;
				case INACTIVE:
					l.hasBeenFiltered(vpResource);
					break;
				case ACTIVE:
					l.hasBeenDisplayed(vpResource);
					break;
				}
			}catch (Exception e) {
				AD_Log.getDefault().logError(Messages.Viewpoint_Manager_error_9, e);				
			}
		}
		for (Listener2 l : listener2s.toArray(new Listener2[listener2s.size()])) {
			try {
				switch (event) {
				case REFERENCE:
					l.handleReferencing(vpResource);
					break;
				case UNREFERENCE:
					l.handleUnReferencing(vpResource);
					break;
				case ACTIVE:
					l.handleActivation(vpResource);
					break;
				case INACTIVE:
					l.handleInactivation(vpResource);
					break;
				}
			}catch (Exception e) {
				AD_Log.getDefault().logError(Messages.Viewpoint_Manager_error_9, e);				
			}
		}
		for (OverallListener l : overallListeners.toArray(new OverallListener[overallListeners.size()])) {
			try {
				switch (event) {
				case REFERENCE:
					l.hasBeenActivated(target, vpResource);
					break;
				case UNREFERENCE:
					l.hasBeenDeactivated(target, vpResource);
					break;
				case INACTIVE:
					l.hasBeenFiltered(target, vpResource);
					break;
				case ACTIVE:
					l.hasBeenDisplayed(target, vpResource);
					break;
				}
			}catch (Exception e) {
				AD_Log.getDefault().logError(Messages.Viewpoint_Manager_error_9, e);				
			}
		}
		
		for (OverallListener2 l : overallListener2s.toArray(new OverallListener2[overallListener2s.size()])) {
			try {
				switch (event) {
				case REFERENCE:
					l.handleReferencing(target, vpResource);
					break;
				case UNREFERENCE:
					l.handleUnReferencing(target, vpResource);
					break;
				case ACTIVE:
					l.handleActivation(target, vpResource);
					break;
				case INACTIVE:
					l.handleInactivation(target, vpResource);
					break;
				}
			}catch (Exception e) {
				AD_Log.getDefault().logError(Messages.Viewpoint_Manager_error_9, e);				
			}
		}
	}

	protected final class ChangeViewpointVisibilityCommand extends AbstractCommand {

		private boolean visible;
		private Resource vpResource;

		public ChangeViewpointVisibilityCommand(Resource vpResource, boolean visible) {
			super(visible ? "Show viewpoint" : "Hide viewpoint");
			this.vpResource = vpResource;
			this.visible = visible;
		}

		@Override
		public void execute() {
			MetadataHelper.getViewpointMetadata(target).setActivationSate(vpResource.getId(), visible);
			fireEvent(vpResource, visible ? ACTIVE : INACTIVE);
		}

		public void undo() {
			MetadataHelper.getViewpointMetadata(target).setActivationSate(vpResource.getId(), !visible);
			fireEvent(vpResource, !visible ? ACTIVE : INACTIVE);
		}

		@Override
		public void redo() {
			execute();
		}

		protected boolean prepare() {
			return true;
		}

	}

	protected final class ReferenceViewpointCommand extends AbstractCommand {
		private final Resource vpResource;
		private final ResourceSet set;

		public ReferenceViewpointCommand(Resource vpResource, ResourceSet set) {
			super("Reference viewpoint");
			this.vpResource = vpResource;
			this.set = set;
		}

		@Override
		public void execute() {
			Version readVersion = readVersion(set, vpResource);
			MetadataHelper.getViewpointMetadata(target).reference(vpResource, readVersion);
			if (Location.WORSPACE.equals(vpResource.getProviderLocation()))
				managed.add(vpResource.getProviderSymbolicName());
			fireEvent(vpResource, REFERENCE);

		}

		@Override
		public void undo() {
			MetadataHelper.getViewpointMetadata(target).unReference(vpResource);
			fireEvent(vpResource, UNREFERENCE);
		}

		@Override
		public void redo() {
			execute();
		}

		protected boolean prepare() {
			return true;
		}
	}

	@Deprecated
	public static interface OverallListener {
		@Deprecated
		void hasBeenActivated(Object ctx, Resource vp);
		@Deprecated
		void hasBeenDeactivated(Object ctx, Resource vp);
		@Deprecated
		void hasBeenFiltered(Object ctx, Resource vp);
		@Deprecated
		void hasBeenDisplayed(Object ctx, Resource vp);
	}
	
	public static interface OverallListener2 {
		void handleReferencing(Object ctx, Resource vp);
		void handleUnReferencing(Object ctx, Resource vp);
		void handleActivation(Object ctx, Resource vp);
		void handleInactivation(Object ctx, Resource vp);
	}

	@Deprecated
	public static interface Listener {
		@Deprecated
		void hasBeenActivated(Resource vp);
		@Deprecated
		void hasBeenDeactivated(Resource vp);
		@Deprecated
		void hasBeenFiltered(Resource vp);
		@Deprecated
		void hasBeenDisplayed(Resource vp);
	}
	
	public static interface Listener2 {
		void handleReferencing(Resource vp);
		void handleUnReferencing(Resource vp);
		void handleActivation(Resource vp);
		void handleInactivation(Resource vp);
	}

	/**
	 * This is an helper method to retrieve the ViewpointManager instance associated to the parameter's model.
	 * 
	 * @param ctx1
	 * @return a ViewpointManager instance.
	 */
	public static ViewpointManager getInstance(EObject ctx1) {
		if (ctx1 == null || ctx1.eResource() == null)
			return nullManager;
		ResourceSet ctx = ctx1.eResource().getResourceSet();
		return getInstance(ctx);
	}

	/**
	 * This method returns the ViewpointManager instance associated to the given ResourceSet instance.
	 * 
	 * @param ctx
	 * @return a ViewpointManager instance.
	 */
	public static ViewpointManager getInstance(final ResourceSet ctx) {
		if (ctx == null)
			return nullManager;
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
		private Resource resource;

		public Description(String id, String label, Version version, Resource resource) {
			super();
			this.id = id;
			this.label = label;
			this.version = version;
			this.resource = resource;
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

		public boolean shloudBeHidden() {
			return resource.getTags().contains(VIEWPOINT_STATE_HIDDEN);
		}

	}

	public static abstract class ViewpointFinder {
		
		private final Set<String> discarded = new HashSet<String>();
		
		public Resource[] getAvailableViewpoints() {
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
		
		public void pinError(Resource vp, Exception e) {
			pinError(vp.getId());
			String msg = "Resource '" + vp.getId() + "' cannot be loaded, The viewpoint is discarded.";
			AD_Log.getDefault().logError(msg, e);
		}

		public void pinError(Resource vp, String details) {
			pinError(vp.getId());
			String msg = "Resource '" + vp.getId() + "' cannot be loaded, The viewpoint is discarded.\n" + details;
			AD_Log.getDefault().logError(msg);
		}
		
		protected void pinError(String id) {
			discarded.add(id);
		}


	}

	private static class CachingFinder extends ViewpointFinder {

		private Resource[] availableViewpoints;
		
		public Resource[] getAvailableViewpoints() {
			if (availableViewpoints == null)
				availableViewpoints = super.getAvailableViewpoints();
			return availableViewpoints;
		}
		
		protected void pinError(String id) {
			super.pinError(id);
			if (availableViewpoints != null)
			{
				for (Resource r : availableViewpoints) {
					if (id.equals(r.getId())) {
						List<Resource> result = new ArrayList<Resource>();
						result.addAll(Arrays.asList(availableViewpoints));
						result.remove(r);
						availableViewpoints = result.toArray(new Resource[result.size()]);
						return ;
					}
				}
			}
		}

		
	}
	
	/**
	 * This implementation is used when the context cannot be computed.
	 * 
	 * @author Thomas Guiu
	 * 
	 */
	private static class NullViewpointManager extends ViewpointManager {

		public NullViewpointManager() {
			super();
		}

		public void unReference(String id) throws ViewpointActivationException {
		}

		public void reference(String id) throws ViewpointActivationException {
		}

		public boolean hasMetadata() {
			return false;
		}

		public void setActivationState(String id, boolean active) throws ViewpointActivationException {
		}

		public boolean isInactive(String id) {
			return false;
		}

		public boolean isReferenced(String id) {
			return false;
		}

	}
}
