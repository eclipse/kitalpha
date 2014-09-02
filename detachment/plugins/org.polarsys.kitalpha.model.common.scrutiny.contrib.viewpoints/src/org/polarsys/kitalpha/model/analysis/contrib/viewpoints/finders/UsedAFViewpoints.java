/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.model.analysis.contrib.viewpoints.finders;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.model.analysis.contrib.viewpoints.helpers.FinderAFViewpointHelper;
import org.polarsys.kitalpha.model.analysis.contrib.viewpoints.helpers.ViewpointRelationshipHelper;
import org.polarsys.kitalpha.model.analysis.contrib.viewpoints.helpers.ViewpointsSearcherHelper;
import org.polarsys.kitalpha.model.analysis.contrib.viewpoints.trees.ViewpointTreeBuilder;
import org.polarsys.kitalpha.model.analysis.contrib.viewpoints.trees.ViewpointTreeContainer;
import org.polarsys.kitalpha.model.analysis.interfaces.IFinder;

/**
 * @author Faycal Abka
 */
public class UsedAFViewpoints implements IFinder<ViewpointTreeContainer, Object> {
	
	private Set<String> usedNsURI;
	private ViewpointTreeContainer container;
	

	public UsedAFViewpoints() {
		this.usedNsURI = new HashSet<String>();
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
		//Do nothing
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
		
		org.polarsys.kitalpha.resourcereuse.model.Resource [] allVpResources = 
				ViewpointsSearcherHelper.getAllViewpoints();
		
		Map<String, Collection<String>> viewpointsURIDependencies = 
				ViewpointRelationshipHelper.getUsedRelationship(allVpResources);
		
		usedNsURI = FinderAFViewpointHelper.filterURISet(usedNsURI, viewpointsURIDependencies);
		Map<String, Collection<String>> filtredVpDependencies = FinderAFViewpointHelper.filterURIMap(viewpointsURIDependencies, usedNsURI);
		
		ViewpointTreeBuilder vpTreeBuilder = new ViewpointTreeBuilder();
		
		//Initialize container
		container = vpTreeBuilder.getViewpointTreeContainer(filtredVpDependencies);
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

}
