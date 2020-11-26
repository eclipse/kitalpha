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
package org.polarsys.kitalpha.emde.extension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.polarsys.kitalpha.emde.extension.preferences.PreferenceModelExtensionManager;
import org.polarsys.kitalpha.emde.extension.utils.Log;

/**
 * @author Thomas Guiu
 * 
 */
public class ModelExtensionHelper {

	private static final ModelExtensionManager nullManager = new NullModelExtensionManager();
	private static final Map<Object, ModelExtensionManager> instances = new HashMap<Object, ModelExtensionManager>();
	/**
	 * This is an helper method to retrieve the ModelExtensionManager instance associated to the resourceSet instance who owns the given resource instance.
	 * 
	 * @param ctx
	 * @return a ModelExtensionManager instance.
	 */
	public static ModelExtensionManager getInstance(Resource resource) {
		if (resource == null) {
			return nullManager;
		}
		return getInstance(resource.getResourceSet());
	}
	
	/**
	 * This method returns the ModelExtensionManager instance associated to the given ResourceSet instance.
	 * 
	 * @param ctx
	 * @return a ModelExtensionManager instance.
	 */
	public static ModelExtensionManager getInstance(final ResourceSet ctx) {
		if (ctx == null) {
			return nullManager;
		}
		ModelExtensionManager instance = instances.get(ctx);
		if (instance == null) {
			instances.put(ctx, instance = createInstance());
			((DefaultModelExtensionManager) instance).setTarget(ctx);
			ctx.eAdapters().add(new AdapterImpl() {
				
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getEventType() == Notification.REMOVE && ctx.getResources().isEmpty()) {
						instances.remove(ctx);
					}
				}
				
			});
		}
		return instance;
	}

	
	/**
	 * This is an helper method to retrieve the ModelExtensionManager instance associated to the parameter's model.
	 * 
	 * @param ctx
	 * @return a ModelExtensionManager instance.
	 */
	public static ModelExtensionManager getInstance(EObject ctx) {
		if (ctx == null) {
			return nullManager;
		}
		return getInstance(ctx.eResource());
	}

	private static ModelExtensionManager createInstance() {

		try {
			IConfigurationElement[] elts = Platform.getExtensionRegistry().getConfigurationElementsFor("org.polarsys.kitalpha.emde.extension.model.manager");
			if (elts.length == 0) {
				return new PreferenceModelExtensionManager();
			}
			if (elts.length == 1) {
				return configure((ModelExtensionManager) elts[0].createExecutableExtension("class"));
			}
			if (elts.length > 1) {
				Log.getDefault().logWarning("Got " + elts.length + " implementations for PE 'org.polarsys.kitalpha.emde.extension.model.manager'");
			}
			return configure((ModelExtensionManager) elts[0].createExecutableExtension("class"));
		} catch (CoreException e) {
			Log.getDefault().logError(e);
			return new PreferenceModelExtensionManager();
		}

	}

	private static ModelExtensionManager configure(ModelExtensionManager mgr) throws CoreException {
		for (IConfigurationElement elt : Platform.getExtensionRegistry().getConfigurationElementsFor("org.polarsys.kitalpha.emde.extension.model.manager.delegate")) {
			ExtensionManagerDelegate delegate = (ExtensionManagerDelegate) elt.createExecutableExtension("class");
			mgr.getDelegates().add(delegate);
		}

		return mgr;
	}

	public static void addOverallListener(ModelExtensionOverallListener l) {
		DefaultModelExtensionManager.addOverallListener(l);
	}

	public static void removeOverallListener(ModelExtensionOverallListener l) {
		DefaultModelExtensionManager.removeOverallListener(l);
	}
	
	/**
	 * This implementation is used when the context cannot be computed.
	 * 
	 * @author Thomas Guiu
	 * 
	 */
	private static class NullModelExtensionManager implements ModelExtensionManager {

		@Override
		public boolean isExtensionModelDisabled(String extensibleModel, String extendedModel) {
			return false;
		}

		@Override
		public boolean canDisableExtensionModel(ExtendedModel extended) {
			return false;
		}

		@Override
		public boolean isExtensionModelDisabled(ExtendedModel extended) {
			return false;
		}

		@Override
		public boolean isExtensionModelDisabled(Object object) {
			return false;
		}

		@Override
		public boolean isExtensionModelDisabled(EObject eObject) {
			return false;
		}

		@Override
		public void setExtensionModelDisabled(ExtensibleModel extensibleModel, ExtendedModel extendedModel,
				boolean disabled) {
		}

		@Override
		public List<ExtensionManagerDelegate> getDelegates() {
			return new ArrayList<ExtensionManagerDelegate>();
		}

		@Override
		public void addListener(ModelExtensionListener l) {
		}

		@Override
		public void removeListener(ModelExtensionListener l) {
		}
		
	}
}
