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
package org.polarsys.kitalpha.resourcereuse.internal.emfscheme.resource.load.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.polarsys.kitalpha.resourcereuse.emfscheme.api.IModelReuseLoader;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

public class ModelReuseLoader implements IModelReuseLoader {
	
	private IModelReuseLoader delegate;
	
	public static IModelReuseLoader newInstance(IModelReuseLoader loader){
		return new ModelReuseLoader(loader);
	}
	
	
	private ModelReuseLoader(IModelReuseLoader delegate) {
		this.delegate = delegate;
	}
	
	@Override
	public Resource load(EObject eObject, URI uri) {
		if (checkNull(eObject)) {
			return null;
		}
		return load(eObject.eResource(), uri);
	}

	@Override
	public Resource load(EObject eObject, String uri) {
		return load(eObject, URI.createURI(uri));
	}

	@Override
	public Resource load(Resource resource, URI uri) {
		if (checkNull(resource)) {
			return null;
		}
		return load(resource.getResourceSet(), uri);
	}

	@Override
	public Resource load(Resource resource, String uri) {
		return load(resource, URI.createURI(uri));
	}

	@Override
	public Resource load(ResourceSet resourceSet, URI uri) {
		if (checkNull(resourceSet)) {
			return null;
		}
		return delegate.load(resourceSet, uri);
	}

	@Override
	public Resource load(ResourceSet resourceSet, String uri) {
		return load(resourceSet, URI.createURI(uri));
	}

	@Override
	public Resource load(EObject eObject, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse) {
		if (checkNull(eObject)) {
			return null;
		}
		return load(eObject.eResource(), resourcereuse);
	}

	@Override
	public Resource load(Resource resource, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse) {
		if (checkNull(resource)) {
			return null;
		}
		return load(resource.getResourceSet(), resourcereuse);
	}

	@Override
	public Resource load(ResourceSet resourceSet, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse) {
		if (checkNull(resourceSet)) {
			return null;
		}
		return delegate.load(resourceSet, resourcereuse);
	}

	@Override
	public Resource load(EObject eObject, String id, String name, String version, String domain, String weight, String... tags) {
		if (checkNull(eObject)) {
			return null;
		}
		return load(eObject.eResource(), id, name, version, domain, weight, tags);
	}

	@Override
	public Resource load(Resource resource, String id, String name, String version, String domain, String weight, String... tags) {
		if (checkNull(resource)) {
			return null;
		}
		return load(resource.getResourceSet(), id, name, version, domain, weight, tags);
	}

	@Override
	public Resource load(ResourceSet resourceSet, String id, String name, String version, String domain, String weight, String... tags) {
		if (checkNull(resourceSet)) {
			return null;
		}
		return delegate.load(resourceSet, id, name, version, domain, weight, tags);
	}

	@Override
	public Resource load(EObject eObject, SearchCriteria criteria) {
		if (checkNull(eObject)) {
			return null;
		}
		return load(eObject.eResource(), criteria);
	}

	@Override
	public Resource load(Resource resource, SearchCriteria criteria) {
		if (checkNull(resource)) {
			return null;
		}
		return load(resource.getResourceSet(), criteria);
	}

	@Override
	public Resource load(ResourceSet resourceSet, SearchCriteria criteria) {
		if (checkNull(resourceSet)) {
			return null;
		}
		return delegate.load(resourceSet, criteria);
	}
	

	@Override
	public Resource load(EObject eObject, URIConverter uriConverter, URI uri) {
		if (checkNull(eObject)) {
			return null;
		}
		return load(eObject.eResource(), uriConverter, uri);
	}


	@Override
	public Resource load(EObject eObject, URIConverter uriConverter, String uri) {
		return load(eObject, uriConverter, URI.createURI(uri));
	}


	@Override
	public Resource load(Resource resource, URIConverter uriConverter, URI uri) {
		if (checkNull(resource)) {
			return null;
		}
		return load(resource.getResourceSet(), uriConverter, uri);
	}


	@Override
	public Resource load(Resource resource, URIConverter uriConverter, String uri) {
		return load(resource, uriConverter, URI.createURI(uri));
	}


	@Override
	public Resource load(ResourceSet resourceSet, URIConverter uriConverter, URI uri) {
		if (checkNull(resourceSet)) {
			return null;
		}
		return delegate.load(resourceSet, uriConverter, uri);
	}


	@Override
	public Resource load(ResourceSet resourceSet, URIConverter uriConverter, String uri) {
		return load(resourceSet, uriConverter, URI.createURI(uri));
	}


	@Override
	public Resource load(EObject eObject, URIConverter uriConverter, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse) {
		if (checkNull(eObject)) {
			return null;
		}
		return load(eObject.eResource(), uriConverter, resourcereuse);
	}


	@Override
	public Resource load(Resource resource, URIConverter uriConverter, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse) {
		if (checkNull(resource)) {
			return null;
		}
		return load(resource.getResourceSet(), uriConverter, resourcereuse);
	}


	@Override
	public Resource load(ResourceSet resourceSet, URIConverter uriConverter, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse) {
		if (checkNull(resourceSet)) {
			return null;
		}
		return delegate.load(resourceSet, uriConverter, resourcereuse);
	}


	@Override
	public Resource load(EObject eObject, URIConverter uriConverter, String id, String name, String version, String domain, String weight, String... tags) {
		if (checkNull(eObject)) {
			return null;
		}
		return load(eObject.eResource(), uriConverter, id, name, version, domain, weight, tags);
	}


	@Override
	public Resource load(Resource resource, URIConverter uriConverter, String id, String name, String version, String domain, String weight, String... tags) {
		if (checkNull(resource)) {
			return null;
		}
		return load(resource.getResourceSet(), uriConverter, id, name, version, domain, weight, tags);
	}


	@Override
	public Resource load(ResourceSet resourceSet, URIConverter uriConverter, String id, String name, String version, String domain, String weight, String... tags) {
		if (checkNull(resourceSet)) {
			return null;
		}
		return delegate.load(resourceSet, uriConverter, id, name, version, domain, weight, tags);
	}


	@Override
	public Resource load(EObject eObject, URIConverter uriConverter, SearchCriteria criteria) {
		if (checkNull(eObject)) {
			return null;
		}
		return load(eObject.eResource(), uriConverter, criteria);
	}


	@Override
	public Resource load(Resource resource, URIConverter uriConverter, SearchCriteria criteria) {
		if (checkNull(resource)) {
			return null;
		}
		return load(resource.getResourceSet(), uriConverter, criteria);
	}


	@Override
	public Resource load(ResourceSet resourceSet, URIConverter uriConverter, SearchCriteria criteria) {
		if (checkNull(resourceSet)) {
			return null;
		}
		return delegate.load(resourceSet, uriConverter, criteria);
	}
	
	private boolean checkNull(EObject eObject){
		return eObject == null || eObject.eResource() == null || eObject.eResource().getResourceSet() == null;
	}
	
	private boolean checkNull(Resource resource){
		return resource == null || resource.getResourceSet() == null;
	}
	
	private boolean checkNull(ResourceSet resourceSet){
		return resourceSet == null;
	}

}
