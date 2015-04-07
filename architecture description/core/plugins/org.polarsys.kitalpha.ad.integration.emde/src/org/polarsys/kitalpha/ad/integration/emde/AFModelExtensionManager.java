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

package org.polarsys.kitalpha.ad.integration.emde;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.common.utils.URIHelper;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.EarlyListener;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.emde.extension.DefaultModelExtensionManager;
import org.polarsys.kitalpha.emde.extension.ExtendedModel;
import org.polarsys.kitalpha.emde.extension.ExtensibleModel;
import org.polarsys.kitalpha.emde.extension.ModelExtensionDescriptor;
import org.polarsys.kitalpha.emde.extension.preferences.PreferenceModelExtensionManager;

/**
 * @author Thomas Guiu
 * 
 */
public class AFModelExtensionManager extends PreferenceModelExtensionManager {

	static {
	}

	public AFModelExtensionManager() {
		super();
		// TODO Auto-generated constructor stub
		ViewpointManager.addListener(new EarlyListener() {

			private final ResourceSet set = new ResourceSetImpl();

			public void hasBeenDeactivated(org.polarsys.kitalpha.resourcereuse.model.Resource res) {
				sendEvent(res, false);
			}

			private void sendEvent(org.polarsys.kitalpha.resourcereuse.model.Resource res, boolean enable) {
				URI uri = URIHelper.createURI(res);
				Viewpoint vp = (Viewpoint) set.getEObject(uri, true);
				if (vp == null || vp.eIsProxy())
					return;
				if (vp.getMetamodel() != null) {
					for (EPackage pack : vp.getMetamodel().getModels()) {
						extension2state.put(pack.getNsURI(), enable);
						managedByAF2state.put(pack.getNsURI(), Boolean.TRUE);
						DefaultModelExtensionManager.fireExtensionEvent(pack.getNsURI(), enable);
					}
				}
				for (Resource r : set.getResources()) {
					r.unload();
				}
				set.getResources().clear();
			}

			public void hasBeenActivated(org.polarsys.kitalpha.resourcereuse.model.Resource vp) {
				sendEvent(vp, true);
			}
		});

		// TODO: quick solution clear all data
		ViewpointManager.addListener(new EarlyListener() {

			@Override
			public void hasBeenActivated(org.polarsys.kitalpha.resourcereuse.model.Resource vp) {
			}

			@Override
			public void hasBeenDeactivated(org.polarsys.kitalpha.resourcereuse.model.Resource vp) {
				extension2state.clear();
				managedByAF2state.clear();
				ModelExtensionDescriptor.INSTANCE.loadExtensibleModels();
			}

		});
	}

	private static final Map<String, Boolean> extension2state = new HashMap<String, Boolean>();
	private static final Map<String, Boolean> managedByAF2state = new HashMap<String, Boolean>();
	private final ViewpointManager vpManager = ViewpointManager.createInstance();

	@Override
	public boolean canDisableExtensionModel(ExtendedModel extended) {
		if (getTarget() == null)
			throw new UnsupportedOperationException();
		String nsURI = extended.getName();
		if (managedByAF2state.containsKey(nsURI))
			return !managedByAF2state.get(nsURI);
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
							if (pack.getNsURI() != null && pack.getNsURI().equals(nsURI)) {
								managedByAF2state.put(nsURI, Boolean.TRUE);
								return false;
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
		boolean result = super.canDisableExtensionModel(extended);
		managedByAF2state.put(nsURI, Boolean.FALSE);
		return result;
	}

	/*
	 * TODO we're loading all VP models at any calls ... What is the cost ?
	 * Tested on model with 14 000 logical components, we need to cache result
	 * of computations
	 */
	public boolean isExtensionModelDisabled(ExtendedModel extended) {
		if (getTarget() == null)
			throw new UnsupportedOperationException();
		String nsURI = extended.getName();
		if (extension2state.containsKey(nsURI)) {
			return !extension2state.get(nsURI);
		}
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
							if (pack.getNsURI() != null && pack.getNsURI().equals(nsURI)) {
								boolean vpActive = vpManager.isActive(res.getId());
								extension2state.put(nsURI, vpActive);
								return !vpActive;
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
		boolean extensionModelDisabled = super.isExtensionModelDisabled(extended);
		extension2state.put(nsURI, !extensionModelDisabled);
		return extensionModelDisabled;
	}

	protected void handleBrokenViewpoint(org.polarsys.kitalpha.resourcereuse.model.Resource res, Exception e) {
		ViewpointManager.pinError(res);
		String msg = "Resource '" + res.getId() + "' cannot be loaded, The viewpoint is discarded.";
		AD_Log.getDefault().logError(msg, e);
	}

	@Override
	public void setExtensionModelDisabled(ExtensibleModel extensibleModel, ExtendedModel extendedModel, boolean disabled) {
		super.setExtensionModelDisabled(extensibleModel, extendedModel, disabled);
		extension2state.put(extendedModel.getName(), !disabled);
	}

	public void setTarget(EObject target) {
		super.setTarget(target);
		vpManager.setTarget(target);
	}

}
