/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
		if (!useViewpoint.isEmpty())
		{
			for (Viewpoint iUsedViewpoint : useViewpoint) 
			{
				List<EPackage> viewpointEPackage = getViewpointEPackage(iUsedViewpoint);
				if (!viewpointEPackage.isEmpty())
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
	 * @param resourceId
	 * @param resourceSet accept null
	 * @return a Core domain Viewpoint 
	 */
	public static org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint getCoreDomainViewpoint(String resourceId, ResourceSet resourceSet){
		org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint result = null;
		Resource[] resourceAfList = getResources(resourceId, AF_MODELREUSE_DOMAIN_, AF_MODELREUSE_TAG_);
		
		if (resourceAfList != null && resourceAfList.length > 0)
		{
			Resource resourceAf = resourceAfList[0];
			URI uri = getResourceURI(resourceAf);
			EObject eObject = getResourceRootObject(uri, resourceSet);
			if (eObject != null && eObject instanceof org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint) {
				result = (org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint) eObject;
			}
		}
		return result;
	}
}
