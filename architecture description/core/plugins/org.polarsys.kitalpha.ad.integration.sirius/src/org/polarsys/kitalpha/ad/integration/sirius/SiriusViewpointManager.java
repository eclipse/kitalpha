/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.integration.sirius;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.polarsys.kitalpha.ad.common.utils.URIHelper;
import org.polarsys.kitalpha.ad.integration.sirius.listeners.SiriusHelper;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;

/**
 * @author Thomas Guiu
 * 
 */
public class SiriusViewpointManager {
	
	
	public void filter(Session session, Collection<Viewpoint> selectedViewpoints) {
		final Set<String> toActivate = new HashSet<String>();
		final Set<String> toDesactivate = new HashSet<String>();
		ViewpointManager mgr = SiriusHelper.getViewpointManager(session);
		SiriusViewpointManager.INSTANCE.collectSiriusViewpoint(mgr, toActivate, toDesactivate);
		
		for (Viewpoint vp : new ArrayList<Viewpoint>(selectedViewpoints))
		{
			if (toDesactivate.contains(vp.getName())){
				selectedViewpoints.remove(vp);
			}
		}
	}
	
	
	public Map<String, Viewpoint> getAllSiriusViewpoints() {
		Map<String, org.eclipse.sirius.viewpoint.description.Viewpoint> vps = new HashMap<String, org.eclipse.sirius.viewpoint.description.Viewpoint>();
		for (org.eclipse.sirius.viewpoint.description.Viewpoint vp : ViewpointRegistry.getInstance().getViewpoints()) {
			vps.put(vp.getName(), vp);
		}
		return vps;

	}

	// walk through AF VP to list Sirius vp who must be activated and those who
	// must be desactivated
	public void collectSiriusViewpoint(ViewpointManager mgr, Set<String> toActivate, Set<String> toDesactivate) {
		// TODO que faire des dépendences entre VP Sirius ?
		
		// ensure this viewpoint is added.
		toActivate.add(Activator.AF_VP_NAME);
		
		ResourceSet set = new ResourceSetImpl();
		try {
			for (org.polarsys.kitalpha.resourcereuse.model.Resource res : ViewpointManager.getAvailableViewpoints()) {
				try {
					URI uri = URIHelper.createURI(res);

					List<String> siriusVps = new ArrayList<String>();
					org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint vp = (org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint) set.getEObject(uri, true);
					for (org.eclipse.sirius.viewpoint.description.Viewpoint dvp : SiriusHelper.getViewpoints(vp)) {
						siriusVps.add(dvp.getName());
					}
					if (siriusVps.isEmpty()){
						continue;
					}
					if (mgr.isUsed(res.getId()) && !mgr.isFiltered(res.getId())){
						toActivate.addAll(siriusVps);
					} else {
						toDesactivate.addAll(siriusVps);
					}
				} catch (Exception e) {
					// we got a screw up model file, we don't care
				}
			}
		} finally {
			for (Resource r : set.getResources()) {
				r.unload();
			}
			set.getResources().clear();
		}

	}

	
	
	
	
	
	public static final SiriusViewpointManager INSTANCE = new SiriusViewpointManager();
	private final Set<String> managedSiriusViewpoints = new HashSet<String>();

	protected void load() {
		ResourceSet set = new ResourceSetImpl();
		try {
			for (org.polarsys.kitalpha.resourcereuse.model.Resource res : ViewpointManager.getAvailableViewpoints()) {
				try {
					URI uri = URIHelper.createURI(res);
					org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint vp = (org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint) set.getEObject(uri, true);
					EcoreUtil.resolveAll(vp);

				} catch (Exception e) {
					// we got a screw up model file, we don't care
				}
			}
		} finally {
			managedSiriusViewpoints.add(Activator.AF_DESIGN);
			for (Resource r : set.getResources()) {
				String key = getKey(r);
				if (key != null){
					managedSiriusViewpoints.add(key);
				}
				r.unload();
			}
			set.getResources().clear();
		}

	}

	private String getKey(Resource r) {
		URI uri = r.getURI();
		return getKey(uri);
	}

	private String getKey(URI uri) {
		if ("odesign".equals(uri.fileExtension())) {
			String devicePath = uri.devicePath();
			if (uri.isPlatformPlugin()){
				return devicePath.substring("/plugin".length());
			}
			if (uri.isPlatformResource()){
				return devicePath.substring("/resource".length());
			}
			return devicePath;
		}
		return null;
	}

	public boolean isUnderControl(Viewpoint viewpoint) {
		String key = getKey(viewpoint.eResource());
		return key != null && getManagedDoremiViewpoints().contains(key);
	}

	protected Set<String> getManagedDoremiViewpoints() {
		if (managedSiriusViewpoints.isEmpty())
			load();
		return managedSiriusViewpoints;
	}



}
