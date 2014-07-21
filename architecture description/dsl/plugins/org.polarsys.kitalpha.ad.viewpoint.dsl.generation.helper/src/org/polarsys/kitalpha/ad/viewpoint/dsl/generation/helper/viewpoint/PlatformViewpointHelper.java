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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.viewpoint;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.ViewpointModelReuseResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.message.Messages;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Boubekeur Zendagui
 */

public class PlatformViewpointHelper extends ViewpointModelReuseResourceHelper{

	/**
	 *
	 */
	private static final String AF_MODELREUSE_DOMAIN_ = "AF";
	private static final String AF_MODELREUSE_TAG_ = "vp";
	
	
	public static boolean isAFViewpointAvailable(org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint viewpoint){
		String viewpointID = VpDslConfigurationHelper.getRootProjectName(viewpoint);
		Viewpoint viewpoint_af = getAFViewpoint(viewpointID, new ResourceSetImpl());
		
		return viewpoint_af != null;
	}
	
	
	public static boolean isAFViewpointAvailable(String resource_id){
		Resource[] resource_af_list = getResources(resource_id, AF_MODELREUSE_DOMAIN_, AF_MODELREUSE_TAG_);
		
		if (resource_af_list != null && resource_af_list.length == 1)
			return true;
		
		if (resource_af_list != null && resource_af_list.length > 0)
		{
			String message = Messages.bind(Messages.Viewpoint_ID_Not_Unique, resource_id);
			throw new RuntimeException(message);
		}
		
		return false;
	}
	
	public static Viewpoint getAFViewpoint(String resource_id, ResourceSet resourceSet_e){
		Viewpoint result = null;
		Resource[] resource_af_list = getResources(resource_id, AF_MODELREUSE_DOMAIN_, AF_MODELREUSE_TAG_);
		
		if (resource_af_list != null && resource_af_list.length > 0)
		{
			Resource resource_af = resource_af_list[0];
			URI uri = getResourceURI(resource_af);
			EObject eObject = getResourceRootObject(uri, resourceSet_e);
			if (eObject != null && eObject instanceof Viewpoint)
				result = (Viewpoint) eObject;
		}
		return result;
	}
}
