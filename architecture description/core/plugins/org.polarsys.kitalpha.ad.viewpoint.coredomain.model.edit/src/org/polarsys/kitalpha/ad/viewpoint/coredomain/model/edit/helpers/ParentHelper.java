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
package org.polarsys.kitalpha.ad.viewpoint.coredomain.model.edit.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.common.utils.URIHelper;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * @author Thomas Guiu
 * 
 */
public class ParentHelper extends AbstractHelper {
	
	protected ParentHelper(EObject target) {
		super(target);
	}

	public static Collection<?> getCandidateResources(EObject target) {
		ParentHelper helper = new ParentHelper(target);
		
		Set<String> bundleScope = new HashSet<>();
		IPluginModelBase model = PluginRegistry.findModel(helper.getProject());
		if (model == null) {
			AD_Log.getDefault().logError("Cannot find plugin related to project "+helper.getProject());
			return Collections.emptyList();
		}
		helper.fillScope(model, bundleScope);
		
		Resource[] resources = ResourceReuse.createHelper().getResources(createDefaultCriteria());

		return helper.filter(resources, bundleScope);
	}
	
	public static Collection<?> getCandidates(EObject target) {
		ParentHelper helper = new ParentHelper(target);
		
		Set<String> bundleScope = new HashSet<>();
		IPluginModelBase model = PluginRegistry.findModel(helper.getProject());
		if (model == null) {
			AD_Log.getDefault().logError("Cannot find plugin related to project "+helper.getProject());
			return Collections.emptyList();
		}
		helper.fillScope(model, bundleScope);
		
		Resource[] resources = ResourceReuse.createHelper().getResources(createDefaultCriteria());

		Collection<Resource> filtered = helper.filter(resources, bundleScope);
		
		ResourceSet resourceSet = target.eResource().getResourceSet();
		List<Viewpoint> vps = new ArrayList<>();
		for (org.polarsys.kitalpha.resourcereuse.model.Resource res : filtered) {
			URI uri = URIHelper.createURI(res);
			Viewpoint vp = (Viewpoint) resourceSet.getEObject(uri, true);
			vps.add(vp);
		}

		return vps;

	}
	
	private Collection<Resource> filter(Resource[] resources, Set<String> bundleScope) {
		if (bundleScope == null){
			return Arrays.asList(resources);
		}
		HashMap<String, Resource> res = new HashMap<>();
		for (Resource resource : resources) {
			if (!res.containsKey(resource.getPath()) && bundleScope.contains(resource.getProviderSymbolicName()) && !resource.getPath().contains(pathToExclude)){
				res.put(resource.getPath(), resource);
			}
		}
		return res.values();
	}

	protected static SearchCriteria createDefaultCriteria() {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setDomain("AF");
		searchCriteria.getTags().add("vp");
		return searchCriteria;
	}

}
