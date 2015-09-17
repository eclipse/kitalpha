/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.model.Location;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * @author Boubekeur Zendagui
 */

public class ViewpointModelReuseResourceHelper {
	
	/**
	 * 
	 */
	private static final String VPDSL_MODELREUSE_DOMAIN_ = "vpdsl";
	private static final String VPDSL_MODELREUSE_TAG_ = "vpdesc";
	
	/**
	 * Ask the platform for the available viewpoint. 
	 * @param resourceSet the resource set wherein the model trying to reference 
	 * viewpoints is loaded. 
	 * resourceSet parameter accept <code>null</code> value.
	 * @return list platform and workspace viewpoints 
	 */
	public static List<Viewpoint> getAvailableVpdslViewpoints(ResourceSet resourceSet){
		List<Viewpoint> result = new ArrayList<Viewpoint>();
		// Ask model reuse for all viewpoint dsl resources
		Resource[] _resource_vpdsl_list = getResources(null, VPDSL_MODELREUSE_DOMAIN_, VPDSL_MODELREUSE_TAG_);
		if (_resource_vpdsl_list.length > 0)
		{
			for (Resource resource_vpdsl : _resource_vpdsl_list) 
			{
				URI uri = getResourceURI(resource_vpdsl);
				EObject eObject = getResourceRootObject(uri, resourceSet);
				if (eObject != null && eObject instanceof Viewpoint)
					result.add((Viewpoint)eObject);
			}
		}
		return result;
	}
	
	public static List<Viewpoint> getAllViewpointExceptCurrent(Viewpoint currentViewpoint){
		// Gather all available VpDsl viewpoint in the platform 
		List<Viewpoint> available_viewpoint = getAvailableVpdslViewpoints(null);

		// Look for the current one and remove it.
		boolean checkName = currentViewpoint.getName() != null && currentViewpoint.getName().length() > 0;
		boolean checkShortName = currentViewpoint.getShortName() != null && currentViewpoint.getShortName().length() > 0;
		Viewpoint viewpointToRemove = null;
		for (Viewpoint iViewpoint : available_viewpoint) 
		{
			boolean equals = true;
			boolean iCheckName = iViewpoint.getName() != null && iViewpoint.getName().length() > 0;
			boolean iCheckShortName = iViewpoint.getShortName() != null && iViewpoint.getShortName().length() > 0;
			if (iCheckName && checkName && !iViewpoint.getName().equals(currentViewpoint.getName())) 
			{
				equals = false;
			}

			if (iCheckShortName && checkShortName && !iViewpoint.getShortName().equals(currentViewpoint.getShortName())) 
			{
				equals = false;
			}

			if (equals) 
			{
				viewpointToRemove = iViewpoint;
				break;
			}
		}

		if (viewpointToRemove != null) 
		{
			available_viewpoint.remove(viewpointToRemove);
		}

		return available_viewpoint;
	}
	
	/**
	 * Look for declared VpDsl resource by Model reuse extension point
	 * @param id_s model reuse resource ID 
	 * @param domain_s model reuse resource domain
	 * @param tag_s model reuse resource tag
	 * @return an array of found {@link Resource}
	 */
	protected static Resource[] getResources(String id_s, String domain_s, String tag_s) {
		SearchCriteria searchCriteria = new SearchCriteria();
		if (id_s != null && id_s.trim().length() > 0)
			searchCriteria.setId(id_s);
		
		searchCriteria.setDomain(domain_s);
		searchCriteria.getTags().add(tag_s);
		return ResourceReuse.createHelper().getResources(searchCriteria);
	}
	
	/**
	 * Return the root element of the resource
	 * @param uri an {@link URI} that accept Fragment
	 * @param resourceSet the resource set wherein is loaded the resource
	 * @return an {@link EObject} 
	 */
	protected static EObject getResourceRootObject(URI uri, ResourceSet resourceSet){
		EObject result = null;
		
		// Ensure that the resource set is not null
		if (resourceSet == null)
			resourceSet = new ResourceSetImpl();
		
		if (uri != null)
		{
			if (uri.fragment() == null)
			{
				// In this case, the result is the root object of the resource
				org.eclipse.emf.ecore.resource.Resource e_resource = 
					resourceSet.getResource(uri, true);

				if (e_resource != null && e_resource.getContents() != null && e_resource.getContents().size() > 0)
					result = e_resource.getContents().get(0);
			}
			else
			{
				// In this case, the result is the object identified by the URI fragment
				result = resourceSet.getEObject(uri, true);
			}
		}

		return result;
	}
	
	protected static URI getResourceURI(Resource resource_af){
		Location resourceLocation = resource_af.getProviderLocation();
		URI uri = null;
		String resourcePath = resource_af.getPath();
		switch (resourceLocation) 
		{
			case WORSPACE:
				uri = URI.createURI("platform:/resource" + resourcePath, false);
			break;
			case PLATFORM:
			case TARGET:
				uri = URI.createURI("platform:/plugin" + resourcePath, false);
			break;
		}
		return uri;
	}
}
