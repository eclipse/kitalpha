/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.scrutiny.contrib.viewpoints.scrutinizes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.Integration;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.ViewpointTreeContainer;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.helpers.FinderAFViewpointHelper;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.helpers.ViewpointsSearcherHelper;

/**
 * @author Faycal Abka
 */
public class UsedAFViewpoints implements IScrutinize<ViewpointTreeContainer, Object> {
	
	private Set<String> usedNsURI = new HashSet<String>();
	private Set<String> usedViewpoints = new HashSet<String>();
	private ViewpointTreeContainer container;
	

	public UsedAFViewpoints() {
	}

	@Override
	public void findIn(EObject eObject) {
		String ePackageURI = FinderAFViewpointHelper.getEPackageNsURI_of(eObject);
		
		if (!usedNsURI.contains(ePackageURI)){
			usedNsURI.add(ePackageURI);
		}
	}

	@Override
	public void findIn(Resource resource) {
		if (!resource.getContents().isEmpty() && resource.getContents().get(0) instanceof Integration) {
			Integration root = (Integration) resource.getContents().get(0);
			for (UsedViewpoint uv : root.getUsedViewpoints()) {
				usedViewpoints.add(uv.getVpId());
			}
		}
	}

	@Override
	public ViewpointTreeContainer getAnalysisResult() {
		if (container != null)
			return container;
		
		//initialize container
		computeUsedViewpointsHierarchy();
		return container;
	}
	
	private void computeUsedViewpointsHierarchy(){
		
		org.polarsys.kitalpha.resourcereuse.model.Resource[] allVpResources = ViewpointsSearcherHelper.getAllViewpoints();
		
		Map<String, Collection<String>> viewpointsURIDependencies = ViewpointRelationshipHelper.getUsedRelationship(allVpResources);
		
		usedNsURI = FinderAFViewpointHelper.filterURISet(usedNsURI, viewpointsURIDependencies);
		Map<String, Collection<String>> filtredVpDependencies = FinderAFViewpointHelper.filterURIMap(viewpointsURIDependencies, usedNsURI);
		
		ViewpointTreeBuilder vpTreeBuilder = new ViewpointTreeBuilder();
		
		//Initialize container
		container = vpTreeBuilder.getViewpointTreeContainer(filtredVpDependencies, usedViewpoints);
	}

	@Override
	public Object getFeedbackAnalysisMessages() {
		// Not need to feedback the user. ViewpointTreeContainer is used for this aim
		return null;
	}
	
	public void dispose(){
		container.dispose();
		container = null;
	}

	public Collection<String> getUsedNsURIs() {
		return new ArrayList<String>(usedNsURI);
	}

}
