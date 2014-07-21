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

package org.polarsys.kitalpha.ad.integration.sirius;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.resourcereuse.model.Location;

/**
 * @author Thomas Guiu
 * 
 */
public class SiriusViewpointManager {
	public static final SiriusViewpointManager INSTANCE = new SiriusViewpointManager();
	private final Set<String> managedDoremiViewpoints = new HashSet<String>();

	protected void load() {
		ResourceSet set = new ResourceSetImpl();
		try {
			for (org.polarsys.kitalpha.resourcereuse.model.Resource res : ViewpointManager.INSTANCE.getAvailableViewpoints()) {
				try {
					URI uri = null;
					if (res.getProviderLocation().equals(Location.WORSPACE))
						uri = URI.createPlatformResourceURI(res.getPath(), false);
					else
						uri = URI.createPlatformPluginURI(res.getPath(), false);
					org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint vp = (org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint) set.getEObject(uri, true);
					EcoreUtil.resolveAll(vp);

				} catch (Exception e) {
					// we got a screw up model file, we don't care
				}
			}
		} finally {
			managedDoremiViewpoints.add(Activator.AF_DESIGN);
			for (Resource r : set.getResources()) {
				String key = getKey(r);
				if (key != null)
					managedDoremiViewpoints.add(key);
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
			if (uri.isPlatformPlugin())
				return devicePath.substring("/plugin".length());
			if (uri.isPlatformResource())
				return devicePath.substring("/resource".length());
			return devicePath;
		}
		return null;
	}

	// public boolean isControlled(URI uriOdesign) {
	// String key = getKey(uriOdesign);
	// return key != null && getManagedDoremiViewpoints().contains(key);
	// }

	public boolean isUnderControl(Viewpoint viewpoint) {
		String key = getKey(viewpoint.eResource());
		return key != null && getManagedDoremiViewpoints().contains(key);
	}

	// /**
	// * return activation state, null if the odesign is not included into a
	// viewpoint
	// */
	//
	// public Boolean getState(URI uriOdesign) {
	// String key = getKey(uriOdesign);
	// if (key == null || !getManagedDoremiViewpoints().contains(key))
	// return null;
	// return getManagedDoremiViewpoints().getClass()(key);
	// }

	protected Set<String> getManagedDoremiViewpoints() {
		if (managedDoremiViewpoints.isEmpty())
			load();
		return managedDoremiViewpoints;
	}

}
