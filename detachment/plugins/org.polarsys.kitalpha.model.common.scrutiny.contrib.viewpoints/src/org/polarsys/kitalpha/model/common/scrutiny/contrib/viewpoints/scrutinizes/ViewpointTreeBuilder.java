/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.model.common.scrutiny.contrib.viewpoints.scrutinizes;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Metamodel;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.IViewpointTreeDescription;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.ViewpointTreeContainer;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.ViewpointTreeDescription;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.helpers.ViewpointsSearcherHelper;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * Builder for a viewpoints hierarchy tree
 * 
 * @author Faycal Abka
 * @author Guillaume Gebhart
 */

public class ViewpointTreeBuilder {

	private ViewpointTreeContainer treeContainer;
	private Resource[] viewpointResources; // Warning: Resourcereuse resources

	public ViewpointTreeBuilder() {
		this.treeContainer = new ViewpointTreeContainer();
		this.viewpointResources = ViewpointsSearcherHelper.getAllViewpoints();
	}

	public ViewpointTreeContainer getViewpointTreeContainer(Map<String, Collection<String>> relationships) {
		return getViewpointTreeContainer(relationships, null);
	}

	/**
	 * @return the container of hierarchies of all installed viewpoints
	 */
	public ViewpointTreeContainer getViewpointTreeContainer(Map<String, Collection<String>> relationships,
			Set<String> additionalViewpoints) {
		this.treeContainer.dispose();

		Collection<Resource> filtredResources = filterViewpointResources(viewpointResources, relationships,
				additionalViewpoints);
		Collection<IViewpointTreeDescription> vpd_set = buildViewpointTreeDescriptions(filtredResources, relationships);

		for (IViewpointTreeDescription vpd : vpd_set) {
			Viewpoint viewpoint = getViewpointRootEObject(vpd.getRootEObject());
			computeViewpointTreeDescriptionAggregations(vpd, vpd_set, viewpoint);
			computeViewpointTreeDescriptionParents(vpd, vpd_set, relationships, viewpoint);
		}

		initVpdContainerRoots(vpd_set);

		return this.treeContainer;
	}

	private Collection<Resource> filterViewpointResources(Resource[] resources,
			Map<String, Collection<String>> relationship, Set<String> additionalViewpoints) {
		Collection<Resource> usedViewpointResources = new HashSet<Resource>();

		for (Resource resource2 : resources) {
			if (additionalViewpoints != null && additionalViewpoints.contains(resource2.getId())) {
				usedViewpointResources.add(resource2);
				additionalViewpoints.remove(resource2.getId());
				continue;
			}

			Viewpoint current = getViewpointRootEObject(resource2.getPath());
			final Metamodel metamodel = current.getMetamodel();
			if (metamodel != null) {
				EList<EPackage> ePackages = metamodel.getModels();

				INNER_FOR_LOOP: for (EPackage ePackage : ePackages) {
					if (relationship.containsKey(ePackage.getNsURI())) {
						usedViewpointResources.add(resource2);
						break INNER_FOR_LOOP;
					}
				}
			}
		}
		if (additionalViewpoints != null) {
			for (String id : additionalViewpoints) {
				// create placeholder for missing viewpoint
				Resource resource = new Resource();
				resource.setId(id);
				resource.setName(id);
				resource.setPath("/" + id); //$NON-NLS-1$
				usedViewpointResources.add(resource);
			}
		}

		// remove resource with readonly state
		for (Resource r : usedViewpointResources.toArray(new Resource[usedViewpointResources.size()])) {
			if (!ViewpointManager.canChangeState(r))
				usedViewpointResources.remove(r);
		}

		return usedViewpointResources;
	}

	private Collection<IViewpointTreeDescription> buildViewpointTreeDescriptions(Collection<Resource> filtredResources,
			Map<String, Collection<String>> relationships) {

		Collection<IViewpointTreeDescription> viewpointTreeDescriptions = new HashSet<IViewpointTreeDescription>();

		for (Resource resource : filtredResources) {
			Viewpoint current = getViewpointRootEObject(resource.getPath());

			IViewpointTreeDescription vpd = createNewViewpointDescription(resource);

			if (current != null) {
				final Metamodel metamodel = current.getMetamodel();
				if (metamodel != null) {
					EList<EPackage> ePackages = metamodel.getModels();
					for (EPackage ePackage : ePackages) {
						String nsURI = ePackage.getNsURI();
						if (nsURI == null)
							continue; // model has not been resolved successfully
						vpd.getViewpointNsUri().add(nsURI);
					}
				}
			}

			viewpointTreeDescriptions.add(vpd);

		}

		return viewpointTreeDescriptions;
	}

	private IViewpointTreeDescription createNewViewpointDescription(Resource resource) {

		String viewpoint_name = resource.getName();
		String viewpoint_id = resource.getId();
		String viewpoint_ePath = resource.getPath();

		IViewpointTreeDescription vpd = new ViewpointTreeDescription(viewpoint_name, viewpoint_id, viewpoint_ePath);

		return vpd;
	}

	private Collection<IViewpointTreeDescription> searchViewpointTreeDescriptions(String nsuri,
			Collection<IViewpointTreeDescription> vpd_set) {

		Collection<IViewpointTreeDescription> vpdFound = new HashSet<IViewpointTreeDescription>();

		if (vpd_set != null) {
			Iterator<IViewpointTreeDescription> it = vpd_set.iterator();
			while (it.hasNext()) {
				IViewpointTreeDescription tmp = (IViewpointTreeDescription) it.next();
				Collection<String> nsUris = tmp.getViewpointNsUri();

				if (nsUris.contains(nsuri)) {
					vpdFound.add(tmp);
				}
			}
		}
		return vpdFound;
	}

	/**
	 * Compute viewpoints dependencies
	 * 
	 * @param vpd
	 * @param tmp
	 * @param eVpRoot
	 */
	private void computeViewpointTreeDescriptionAggregations(IViewpointTreeDescription vpd,
			Collection<IViewpointTreeDescription> vpd_set, Viewpoint eVpRoot) {
		if (vpd_set == null || eVpRoot == null)
			return;

		EList<Viewpoint> dependencies = eVpRoot.getDependencies();

		if (dependencies != null && !dependencies.isEmpty()) {
			for (Viewpoint viewpoint : dependencies) {

				final Metamodel metamodel = viewpoint.getMetamodel();
				
				if (metamodel != null){
					EList<EPackage> ePackages = metamodel.getModels();
					
					for (EPackage ePackage : ePackages) {

						String nsuri = ePackage.getNsURI();
						if (nsuri == null)
							continue; //model has not been resolved successfully
						Collection<IViewpointTreeDescription> vpdDependencies = searchViewpointTreeDescriptions(nsuri,
								vpd_set);

						if (vpdDependencies != null && !vpdDependencies.isEmpty()) {
							// //If viewpoint A refrence B, B must know which
							// viewpoint use it (i.e A)
							// theDependency.addDependency(vpd);

							// FIXME : not sure. See the comment before!!!
							for (IViewpointTreeDescription dependency : vpdDependencies) {
								vpd.addDependency(dependency);
							}

						}
					}
				}
			}
		}
	}

	/**
	 * Compute the root viewpoints hierarchy
	 * 
	 * @param vpd
	 * @param tmp
	 * @param eVpRoot
	 */
	private void computeViewpointTreeDescriptionParents(IViewpointTreeDescription vpd,
			Collection<IViewpointTreeDescription> vpd_set, Map<String, Collection<String>> relationships,
			Viewpoint eVpRoot) {
		if (vpd_set == null || eVpRoot == null)
			return;

		EList<Viewpoint> parents = eVpRoot.getParents();

		if (parents != null && !parents.isEmpty()) {
			for (Viewpoint viewpoint : parents) {
				final Metamodel metamodel = viewpoint.getMetamodel();
				if (metamodel != null) {
					EList<EPackage> ePackages = metamodel.getModels();

					for (EPackage ePackage : ePackages) {
						String nsUri = ePackage.getNsURI();
 
						if (nsUri == null)
							continue ; // model has not been resolved successfully
						Collection<IViewpointTreeDescription> vpd_parents = searchViewpointTreeDescriptions(nsUri,
								vpd_set);

						if (vpd_parents != null && !vpd_parents.isEmpty()) {
							for (IViewpointTreeDescription vpd_parent : vpd_parents) {
								vpd.addParent(vpd_parent);
								vpd_parent.addChild(vpd);
							}
						}

					}
				}
			}
		}

		// Compute uses as parent (imports)
		Collection<String> vpd_nsuri = vpd.getViewpointNsUri();

		for (String nsUri : vpd_nsuri) {
			Collection<String> uses = relationships.get(nsUri);
			if (uses == null)
				continue;

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

	private void initVpdContainerRoots(Collection<IViewpointTreeDescription> vpd_set) {

		for (IViewpointTreeDescription vpd : vpd_set) {
			if (vpd.getParents().isEmpty())
				treeContainer.getRoots().add(vpd);
		}
	}

	/**
	 * Returns the root EObject of viewpoint
	 * 
	 * @param path
	 *            URI of the root EObject
	 * @return EObject of the viewpoint or null
	 */
	private Viewpoint getViewpointRootEObject(String path) {

		if (checkString(path)) {
			URI uri = ViewpointRelationshipHelper.createPlatformPluginURI(path, false);
			ResourceSet resourceSet = new ResourceSetImpl();

			try {
				return (Viewpoint) resourceSet.getEObject(uri, true);
			} catch (Exception e) {

			}

		}
		return null;
	}

	private boolean checkString(String s) {
		return s != null && !s.equals("");
	}

}
