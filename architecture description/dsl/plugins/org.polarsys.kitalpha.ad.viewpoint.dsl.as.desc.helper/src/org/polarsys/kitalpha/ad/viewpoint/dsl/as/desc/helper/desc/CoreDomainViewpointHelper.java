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
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Metamodel;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Boubekeur Zendagui
 *
 */
public class CoreDomainViewpointHelper extends ViewpointModelReuseResourceHelper{
	
	private static final String AF_MODELREUSE_DOMAIN_ = "AF";
	private static final String AF_MODELREUSE_TAG_ = "vp";
	
	/**
	 * Retrieve all accessible EPackages for a given viewpoint by regarding is viewpoint uses.
	 * @param viewpoint
	 * @return
	 */
	public static List<EPackage> getViewpointAccessibleEPackage(Viewpoint viewpoint){
		List<EPackage> result = new ArrayList<EPackage>();
		
		EList<Viewpoint> useViewpoint = viewpoint.getUseViewpoint();
		if (useViewpoint.isEmpty() == false)
		{
			for (Viewpoint iUsedViewpoint : useViewpoint) 
			{
				List<EPackage> viewpointEPackage = getViewpointEPackage(iUsedViewpoint);
				if (viewpointEPackage.isEmpty() == false)
				{
					result.addAll(viewpointEPackage);
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Get a EPackage generated from a given Dsl Viewpoint
	 * @param viewpoint
	 * @return
	 */
	public static List<EPackage> getViewpointEPackage(Viewpoint viewpoint){
		String rootProjectName = VpDslConfigurationHelper.getRootProjectName(viewpoint);
		org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint coreDomainViewpoint = getCoreDomainViewpoint(rootProjectName, null);
		if (coreDomainViewpoint != null)
		{
			Metamodel metamodel = coreDomainViewpoint.getMetamodel();
			if (metamodel != null)
			{
				return metamodel.getModels();
			}
		}
		
		return Collections.emptyList();
	}
	
	/**
	 * 
	 * @param resource_id
	 * @param resourceSet_e accept null
	 * @return a Core domain Viewpoint 
	 */
	public static org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint getCoreDomainViewpoint(String resource_id, ResourceSet resourceSet_e){
		org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint result = null;
		Resource[] resource_af_list = getResources(resource_id, AF_MODELREUSE_DOMAIN_, AF_MODELREUSE_TAG_);
		
		if (resource_af_list != null && resource_af_list.length > 0)
		{
			Resource resource_af = resource_af_list[0];
			URI uri = getResourceURI(resource_af);
			EObject eObject = getResourceRootObject(uri, resourceSet_e);
			if (eObject != null && eObject instanceof org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint)
				result = (org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint) eObject;
		}
		return result;
	}
}
