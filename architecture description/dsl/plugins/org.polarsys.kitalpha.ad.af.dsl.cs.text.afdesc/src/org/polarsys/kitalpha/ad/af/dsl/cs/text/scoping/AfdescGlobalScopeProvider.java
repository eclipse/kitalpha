/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.cs.text.scoping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.MultimapBasedScope;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;
import org.polarsys.kitalpha.ad.af.dsl.cs.text.resources.AfdescResourceHelper;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import org.polarsys.kitalpha.resourcereuse.model.Location;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class AfdescGlobalScopeProvider extends DefaultGlobalScopeProvider{
	
	@Inject
	IResourceDescription.Manager descriptionManager;
		
	@Override
	protected IScope getScope(IScope parent, final Resource context, boolean ignoreCase, EClass type, Predicate<IEObjectDescription> filter) {	
		Iterable<IEObjectDescription> exportedObjects = Collections.emptyList();
		IScope result = parent;
		List<IContainer> containers = Lists.newArrayList(getVisibleContainers(context));
		Iterator<IContainer> iter = containers.iterator();
		while (iter.hasNext()) {
			IContainer container = iter.next();		
			if (container instanceof AfdescContainer) {
				result = createAedslContainerScope(context, result, container, filter, type, ignoreCase);
			}
		}
		return MultimapBasedScope.createScope(result, exportedObjects, ignoreCase);	
	}
	
	@Override
	protected IScope createContainerScope(IScope parent, IContainer container, Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase) {
		return SelectableBasedScope.createScope(parent, container, filter, type, ignoreCase);
	}

	protected IScope createAedslContainerScope(Resource eResource, IScope parent, IContainer container,
			Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase) {
		Iterable<IEObjectDescription> exportedObjects = Collections.emptyList();		
		ResourceSet resourceSet = eResource.getResourceSet();
		List<URI> uris = getReferenceableResourceURIs();
		for (URI uri: uris) {
			Resource referencedResource = loadResource(uri, resourceSet);
			if (referencedResource!=null) {
				addResource(referencedResource, resourceSet);
				IResourceDescription resourceDescription =	descriptionManager.getResourceDescription(referencedResource);
				exportedObjects = Iterables.concat(exportedObjects, resourceDescription.getExportedObjects());
			}
		}
		return MultimapBasedScope.createScope(parent, exportedObjects, ignoreCase);	
	}
	
    private Resource loadResource(URI uri, ResourceSet resourceSet) {
		try {
			if ("http".equalsIgnoreCase(uri.scheme()))
			{
				return null;
			}
			if (uri.fragment() == null) {
				Resource resource = resourceSet.getResource(uri, true);
				if (resource.getContents().isEmpty())
				{
					return null;
				}
				return resource;
			}
			EObject result = resourceSet.getEObject(uri, true);
			return result.eResource();
		} catch(RuntimeException ex) {
			if (uri.isPlatformResource()) {
				String platformString = uri.toPlatformString(true);
				URI platformPluginURI = AfdescResourceHelper.URIFix.createPlatformPluginURI(platformString, true);
				return loadResource(platformPluginURI, resourceSet);
			}
			return null;
		}
	}
    
	private Resource addResource(Resource resource, ResourceSet resourceSet) {
        URI uri = resource.getURI();
        Resource r = resourceSet.getResource(uri, false);
        if (r == null) {
            resourceSet.getResources().add(resource);
            return resource;
        } else {
            return r;
        }
    }
	
	private List<URI> getReferenceableResourceURIs() {
		List<URI> resourceURIs = new ArrayList<URI>();
		org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = AfdescResourceHelper.getViewpointResources();
		for (org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			URI uri = null;
			if (r.getProviderLocation().equals(Location.WORSPACE)) {
				uri = AfdescResourceHelper.URIFix.createPlatformResourceURI(r.getPath(), false);
			} else {
				uri = AfdescResourceHelper.URIFix.createPlatformPluginURI(r.getPath(), false);
			}
			resourceURIs.add(uri);
		}
		return resourceURIs;
	}	
}
