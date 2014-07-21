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

package org.polarsys.kitalpha.ad.services.detachment.core.utils.tree.builder;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.polarsys.kitalpha.ad.services.detachment.core.utils.tree.IViewpointTreeDescription;
import org.polarsys.kitalpha.ad.services.detachment.core.utils.tree.ViewpointTreeContainer;
import org.polarsys.kitalpha.ad.services.detachment.core.utils.tree.ViewpointTreeDescription;
import org.polarsys.kitalpha.ad.services.detachment.core.utils.vp.helper.ViewpointRelationshipHelper;
import org.polarsys.kitalpha.ad.services.detachment.core.utils.vp.helper.ViewpointsSearcherHelper;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * Builder for a viewpoints hierarchy tree
 * 
 * @author Faycal Abka
 */

public class ViewpointTreeBuilder {
	
	private ViewpointTreeContainer treeContainer;
	private Resource[] viewpointResources;			//Warning: Resourcereuse resources
	private Session session;						//To retrieve a semantic models
	
	public ViewpointTreeBuilder(Session session){
		this.treeContainer = new ViewpointTreeContainer();
		this.viewpointResources = ViewpointsSearcherHelper.getViewpoints();
		this.session = session;
	}
	
	
	/**
	 * @return the container of hierarchies of all installed viewpoints
	 */
	public ViewpointTreeContainer getViewpointTreeContainer(){
		this.treeContainer.dispose();
		
		Map<String, Collection<String>> relationships = viewpointRelationships();
		Collection<Resource>  filtredResources = filterViewpointResources(viewpointResources, relationships);
		Collection<IViewpointTreeDescription> vpd_set = buildViewpointTreeDescriptions(filtredResources, relationships);
		
		for (IViewpointTreeDescription vpd : vpd_set) {
			Viewpoint viewpoint = getViewpointRootEObject(vpd.getRootEObject());
			computeViewpointTreeDescriptionAggregations(vpd, vpd_set, viewpoint);
			computeViewpointTreeDescriptionParents(vpd, vpd_set, relationships, viewpoint);
		}
		
		initVpdContainerRoots(vpd_set);
		
		return this.treeContainer;
	}
	
	
	private Map<String, Collection<String>> viewpointRelationships(){
		
		Collection<EList<EPackage>> viewpointsEPackages = ViewpointRelationshipHelper.collectAllViewpointsEPackages(viewpointResources);
		
		Map<String, Collection<String>> relationships = new HashMap<String, Collection<String>>();
		
		Collection<org.eclipse.emf.ecore.resource.Resource> semanticResources = session.getSemanticResources();
		
		if (semanticResources != null){
			Iterator<org.eclipse.emf.ecore.resource.Resource> it = semanticResources.iterator();

			while (it.hasNext()){
				org.eclipse.emf.ecore.resource.Resource current = (org.eclipse.emf.ecore.resource.Resource)it.next();
				
				EcoreUtil.resolveAll(current);
				
				TreeIterator<EObject> resourceIterator = current.getAllContents();
				
				while(resourceIterator.hasNext()){
					EObject currentObj = resourceIterator.next();
					ViewpointRelationshipHelper.discoverEClassDependencies(currentObj.eClass(), viewpointsEPackages, relationships, false);
				}
			}
		}
		return relationships;
	}
	
	
	private Collection<Resource> filterViewpointResources(Resource [] resources, Map<String, Collection<String>> relationship){
		Collection<Resource> usedViewpointResources = new HashSet<Resource>();
		
		for (Resource resource2 : resources) {
			Viewpoint current = getViewpointRootEObject(resource2.getPath());
			EList<EPackage> ePackages = current.getMetamodel().getModels();
			
			FOR_LOOP:
			for (EPackage ePackage : ePackages) {
				if (relationship.containsKey(ePackage.getNsURI())){
					usedViewpointResources.add(resource2);
					break FOR_LOOP;
				}
			}
			
		}
		
		return usedViewpointResources;
	}
	
	
	
	private Collection<IViewpointTreeDescription> buildViewpointTreeDescriptions(Collection<Resource> filtredResources, Map<String, Collection<String>> relationships){
		
		Collection<IViewpointTreeDescription> viewpointTreeDescriptions = new HashSet<IViewpointTreeDescription>();
		
		for (Resource resource : filtredResources) {
			Viewpoint current = getViewpointRootEObject(resource.getPath());
			EList<EPackage> ePackages = current.getMetamodel().getModels();
			
			IViewpointTreeDescription vpd = createNewViewpointDescription(resource);
			
			for (EPackage ePackage : ePackages) {
				vpd.getViewpointNsUri().add(ePackage.getNsURI());
			}
			
			viewpointTreeDescriptions.add(vpd);
			
		}
		
		return viewpointTreeDescriptions;
	}
	
	
	private IViewpointTreeDescription createNewViewpointDescription(Resource resource){
		
		String viewpoint_name = resource.getName();
		String viewpoint_id = resource.getId();
		String viewpoint_ePath = resource.getPath();
		
		IViewpointTreeDescription vpd = new ViewpointTreeDescription(viewpoint_name, viewpoint_id, viewpoint_ePath);
		
		return vpd;
	}
	
	
	private Collection<IViewpointTreeDescription> searchViewpointTreeDescriptions(String nsuri, Collection<IViewpointTreeDescription> vpd_set){

		Collection<IViewpointTreeDescription> vpdFound = new HashSet<IViewpointTreeDescription>();

		if (vpd_set != null){
			Iterator<IViewpointTreeDescription> it = vpd_set.iterator();
			while (it.hasNext()){
				IViewpointTreeDescription tmp = (IViewpointTreeDescription)it.next();
				Collection<String> nsUris = tmp.getViewpointNsUri();

				if (nsUris.contains(nsuri)){
					vpdFound.add(tmp);
				}
			}
		}
		return vpdFound;
	}
	
	
	
	/**
	 * Compute viewpoints dependencies
	 * @param vpd
	 * @param tmp
	 * @param eVpRoot
	 */
	private void computeViewpointTreeDescriptionAggregations(IViewpointTreeDescription vpd, Collection<IViewpointTreeDescription> vpd_set, Viewpoint eVpRoot) {
		if (vpd_set == null)
			//TODO Log error, throw an exception?
			return;
		
		EList<Viewpoint> dependencies = eVpRoot.getDependencies();
		
		if (dependencies != null && !dependencies.isEmpty()) {
			for (Viewpoint viewpoint : dependencies) {
				
				EList<EPackage> ePackages = viewpoint.getMetamodel().getModels();
				
				for (EPackage ePackage : ePackages) {
					
					String nsuri = ePackage.getNsURI();
					Collection<IViewpointTreeDescription> vpdDependencies = searchViewpointTreeDescriptions(nsuri, vpd_set);
					
					if (vpdDependencies != null && !vpdDependencies.isEmpty()){
//						//If viewpoint A refrence B, B must know which viewpoint use it (i.e A)
//						theDependency.addDependency(vpd);
						
						//FIXME : not sure. See the comment before!!!
						for (IViewpointTreeDescription dependency : vpdDependencies) {
							vpd.addDependency(dependency);
						}
						
					}
					
				}
				
			}
		}
		
	}
	
	
	
	/**
	 * Compute the root viewpoints hierarchy
	 * @param vpd
	 * @param tmp
	 * @param eVpRoot
	 */
	private void computeViewpointTreeDescriptionParents(IViewpointTreeDescription vpd, Collection<IViewpointTreeDescription> vpd_set, Map<String, Collection<String>> relationships, Viewpoint eVpRoot) {
		if (vpd_set == null)
			//TODO Log error, throw an exception?
			return;
		
		EList<Viewpoint> parents = eVpRoot.getParents();
		
		if (parents != null && !parents.isEmpty()){
			for (Viewpoint viewpoint : parents) {
				EList<EPackage> ePackages = viewpoint.getMetamodel().getModels();

				for (EPackage ePackage : ePackages) {
					String nsUri = ePackage.getNsURI();

					Collection<IViewpointTreeDescription> vpd_parents = searchViewpointTreeDescriptions(nsUri, vpd_set);

					if (vpd_parents != null && !vpd_parents.isEmpty()){
						for (IViewpointTreeDescription vpd_parent : vpd_parents) {
							vpd.addParent(vpd_parent);
							vpd_parent.addChild(vpd);
						}
					}

				}
			}
		}
		
		//Compute uses as parent (imports)
		Collection<String> vpd_nsuri = vpd.getViewpointNsUri();
		
		for (String nsUri : vpd_nsuri) {
			Collection<String> uses = relationships.get(nsUri);
			
			for (String used_nsUri : uses) {
				Collection<IViewpointTreeDescription> used_vpd = searchViewpointTreeDescriptions(used_nsUri, vpd_set);
				
				for (IViewpointTreeDescription usedVpd : used_vpd) {
					vpd.addParent(usedVpd);
					usedVpd.addChild(vpd);
					vpd.addUsedViewpoint(usedVpd);
				}
			}
		}
	}
	
	
	private void initVpdContainerRoots(Collection<IViewpointTreeDescription> vpd_set){
		
		for (IViewpointTreeDescription vpd : vpd_set) {
			if (vpd.getParents().isEmpty())
				treeContainer.getRoots().add(vpd);
		}
	}
	

	/**
	 * Returns the root EObject of viewpoint
	 * @param path URI of the root EObject
	 * @return EObject of the viewpoint or null
	 */
	private Viewpoint getViewpointRootEObject(String path){
		
		if (checkString(path)){
			URI uri = URI.createPlatformPluginURI(path, false);
			ResourceSet resourceSet = new ResourceSetImpl();
			
			return (Viewpoint) resourceSet.getEObject(uri, true);
			
		}
		return null;
	}
	
	
	private boolean checkString(String s){
		return s != null && !s.equals("");
	}
	
}
