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

package org.polarsys.kitalpha.ad.integration.emde;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.common.utils.URIHelper;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.Listener2;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.emde.extension.ExtendedModel;
import org.polarsys.kitalpha.emde.extension.ExtensibleModel;
import org.polarsys.kitalpha.emde.extension.ModelExtensionDescriptor;
import org.polarsys.kitalpha.emde.extension.preferences.PreferenceModelExtensionManager;

/**
 * @author Thomas Guiu
 * 
 */
public class AFModelExtensionManager extends PreferenceModelExtensionManager {

	private final class StateManager implements Listener2 {
		private final ResourceSet set = new ResourceSetImpl();

		@Override
		public void handleReferencing(org.polarsys.kitalpha.resourcereuse.model.Resource vp) {
			sendEvent(vp, true);
		}

		@Override
		public void handleUnReferencing(org.polarsys.kitalpha.resourcereuse.model.Resource vp) {
			sendEvent(vp, false);
		}

		@Override
		public void handleActivation(org.polarsys.kitalpha.resourcereuse.model.Resource vp) {
			sendEvent(vp, true);
		}

		@Override
		public void handleInactivation(org.polarsys.kitalpha.resourcereuse.model.Resource vp) {
			sendEvent(vp, false);
		}

		private void sendEvent(org.polarsys.kitalpha.resourcereuse.model.Resource res, boolean enable) {
			URI uri = URIHelper.createURI(res);
			Viewpoint vp = (Viewpoint) set.getEObject(uri, true);
			if (vp == null || vp.eIsProxy()) {
				return;
			}
			if (vp.getMetamodel() != null) {
				for (EPackage pack : vp.getMetamodel().getModels()) {
					String nsURI = pack.getNsURI();
					extension2state.put(nsURI, extension2state.containsKey(nsURI) ? (extension2state.get(nsURI) || enable) :enable);
					managedByAF2state.put(nsURI, Boolean.TRUE);
					fireExtensionEvent(nsURI, enable);
				}
			}
			for (Resource r : set.getResources()) {
				r.unload();
			}
			set.getResources().clear();
		}
	}

	// quick solution clear all data
	private final class ReloadListener implements Listener2 {
		@Override
		public void handleReferencing(org.polarsys.kitalpha.resourcereuse.model.Resource vp) {
			// nothing to do
		}

		@Override
		public void handleUnReferencing(org.polarsys.kitalpha.resourcereuse.model.Resource vp) {
			extension2state.clear();
			managedByAF2state.clear();
			ModelExtensionDescriptor.INSTANCE.loadExtensibleModels();
		}

		@Override
		public void handleActivation(org.polarsys.kitalpha.resourcereuse.model.Resource vp) {
			// nothing to do
		}

		@Override
		public void handleInactivation(org.polarsys.kitalpha.resourcereuse.model.Resource vp) {
			// nothing to do
		}
	}

	public AFModelExtensionManager() {
		super();
	}

	@Override
	public void setTarget(ResourceSet target) {
		super.setTarget(target);
		ViewpointManager mgr = ViewpointManager.getInstance(getTarget());
		mgr.addListener(new StateManager());
		mgr.addListener(new ReloadListener());
	}

	private final Map<String, Boolean> extension2state = new HashMap<String, Boolean>();
	private final Map<String, Boolean> managedByAF2state = new HashMap<String, Boolean>();

	@Override
	public boolean canDisableExtensionModel(ExtendedModel extended) {
		if (getTarget() == null) {
			throw new IllegalStateException();
		}
		String nsURI = extended.getName();
		if (managedByAF2state.containsKey(nsURI)) {
			return !managedByAF2state.get(nsURI);
		}
		computeManagedByAFFlag();
		if (managedByAF2state.containsKey(nsURI)) {
			return !managedByAF2state.get(nsURI);
		}
		managedByAF2state.put(nsURI, Boolean.FALSE);
		return super.canDisableExtensionModel(extended);
	}

	/*
	 * we're loading all VP models at any calls ... What is the cost ?
	 * Tested on model with 14 000 logical components, we need to cache result
	 * of computations
	 */
	@Override
	public boolean isExtensionModelDisabled(ExtendedModel extended) {
		if (getTarget() == null) {
			throw new IllegalStateException();
		}

		String nsURI = extended.getName();
		if (extension2state.containsKey(nsURI)) {
			return !extension2state.get(nsURI);
		}
		computeExtensionFlag();
		if (extension2state.containsKey(nsURI)) {
			return !extension2state.get(nsURI);
		}

		boolean extensionModelDisabled = super.isExtensionModelDisabled(extended);
		extension2state.put(nsURI, !extensionModelDisabled);
		return extensionModelDisabled;
	}

	private void computeManagedByAFFlag() {
		ResourceSet set = new ResourceSetImpl();
		try {
			for (org.polarsys.kitalpha.resourcereuse.model.Resource res : ViewpointManager.getAvailableViewpoints()) {
				try {
					URI uri = URIHelper.createURI(res);
					Viewpoint vp = (Viewpoint) set.getEObject(uri, true);
					if (vp.getMetamodel() != null) {
						for (EPackage pack : vp.getMetamodel().getModels()) {
							// if the model is owned by a VP we must tell yes or
							// no.
							// In other case let the super implementation answer
							if (pack.getNsURI() != null ) {
								managedByAF2state.put(pack.getNsURI(), Boolean.TRUE);
							}
						}
					}
				} catch (Exception e) {
					handleBrokenViewpoint(res, e);
				}
			}
		} finally {
			for (Resource r : set.getResources()) {
				r.unload();
			}
			set.getResources().clear();
		}
	}


	private void computeExtensionFlag() {
		ResourceSet set = new ResourceSetImpl();
		try {
			for (org.polarsys.kitalpha.resourcereuse.model.Resource res : ViewpointManager.getAvailableViewpoints()) {
				try {
					URI uri = URIHelper.createURI(res);
					Viewpoint vp = (Viewpoint) set.getEObject(uri, true);
					if (vp.getMetamodel() != null) {
						computeExtensionFlag(vp);
					}
				} catch (Exception e) {
					handleBrokenViewpoint(res, e);
				}
			}
		} finally {
			for (Resource r : set.getResources()) {
				r.unload();
			}
			set.getResources().clear();
		}
	}

	private void computeExtensionFlag(Viewpoint vp) {
		for (EPackage pack : vp.getMetamodel().getModels()) {
			// if the model is owned by a VP we must tell yes or
			// no.
			// In other case let the super implementation answer
			String nsURI2 = pack.getNsURI();
			if (nsURI2 != null ) {
				ViewpointManager instance = ViewpointManager.getInstance(getTarget());
				boolean used = instance.isUsed(vp.getId());
				boolean filtered = instance.isFiltered(vp.getId());
				boolean active = used && !filtered;
				if (extension2state.containsKey(nsURI2)){
					active =active || extension2state.get(nsURI2);
				}
				extension2state.put(nsURI2, active);
				
			}
		}
	}

	protected void handleBrokenViewpoint(org.polarsys.kitalpha.resourcereuse.model.Resource res, Exception e) {
		ViewpointManager.pinError(res, e);
	}

	@Override
	public void setExtensionModelDisabled(ExtensibleModel extensibleModel, ExtendedModel extendedModel, boolean disabled) {
		super.setExtensionModelDisabled(extensibleModel, extendedModel, disabled);
		extension2state.put(extendedModel.getName(), !disabled);
	}

}
