/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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
	private static final String AF_MODELREUSE_DOMAIN = "AF";
	private static final String AF_MODELREUSE_TAG = "vp";
	
	
	public static boolean isAFViewpointAvailable(org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint viewpoint){
		String viewpointID = VpDslConfigurationHelper.getRootProjectName(viewpoint);
		Viewpoint viewpointaf = getAFViewpoint(viewpointID, new ResourceSetImpl());
		
		return viewpointaf != null;
	}
	
	
	public static boolean isAFViewpointAvailable(String resourceid){
		Resource[] resourceaflist = getResources(resourceid, AF_MODELREUSE_DOMAIN, AF_MODELREUSE_TAG);
		
		if (resourceaflist != null && resourceaflist.length == 1)
			return true;
		
		if (resourceaflist != null && resourceaflist.length > 0)
		{
			String message = Messages.bind(Messages.Viewpoint_ID_Not_Unique, resourceid);
			throw new RuntimeException(message);
		}
		
		return false;
	}
	
	public static Viewpoint getAFViewpoint(String resourceid, ResourceSet resourceSet){
		Viewpoint result = null;
		Resource[] resourceaflist = getResources(resourceid, AF_MODELREUSE_DOMAIN, AF_MODELREUSE_TAG);
		
		if (resourceaflist != null && resourceaflist.length > 0)
		{
			Resource resourceaf = resourceaflist[0];
			URI uri = getResourceURI(resourceaf);
			EObject eObject = getResourceRootObject(uri, resourceSet);
			if (eObject != null && eObject instanceof Viewpoint)
				result = (Viewpoint) eObject;
		}
		return result;
	}
}
