/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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
import org.polarsys.kitalpha.resourcereuse.emfscheme.ModelReuseURIConverter;
import org.polarsys.kitalpha.resourcereuse.emfscheme.api.IModelReuseLoader;
import org.polarsys.kitalpha.resourcereuse.emfscheme.helpers.ModelReuseHelper;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * Client should never use this class
 * @author Faycal ABKA
 *
 */
public class InternalModelReuseLoader implements IModelReuseLoader {
	

	@Override
	public Resource load(EObject eObject, URI uri) {
		return null;
	}

	@Override
	public Resource load(EObject eObject, String uri) {
		return null;
	}

	@Override
	public Resource load(Resource resource, URI uri) {
		return null;
	}

	@Override
	public Resource load(Resource resource, String uri) {
		return null;
	}

	@Override
	public Resource load(ResourceSet resourceSet, URI uri) {
		return load(resourceSet, new ModelReuseURIConverter(), uri);
	}

	@Override
	public Resource load(ResourceSet resourceSet, String uri) {
		return null;
	}

	@Override
	public Resource load(EObject eObject, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse) {
		return null;
	}

	@Override
	public Resource load(Resource resource, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse) {
		return null;
	}

	@Override
	public Resource load(ResourceSet resourceSet, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse) {
		return load(resourceSet, new ModelReuseURIConverter(), resourcereuse);
	}

	
	@Override
	public Resource load(EObject eObject, String id, String name, String version, String domain, String weight, String... tags) {
		return null;
	}

	@Override
	public Resource load(Resource resource, String id, String name, String version, String domain, String weight, String... tags) {
		return null;
	}

	@Override
	public Resource load(ResourceSet resourceSet, String id, String name, String version, String domain, String weight, String... tags) {
		return load(resourceSet, new ModelReuseURIConverter(), id, name, version, domain, weight, tags);
	}
	
	@Override
	public Resource load(EObject eObject, SearchCriteria criteria) {
		return null;
	}

	@Override
	public Resource load(Resource resource, SearchCriteria criteria) {
		return null;
	}

	@Override
	public Resource load(ResourceSet resourceSet, SearchCriteria criteria) {
		return load(resourceSet, new ModelReuseURIConverter(), criteria);
	}

	@Override
	public Resource load(EObject eObject, URIConverter uriConverter, URI uri) {
		return null;
	}

	@Override
	public Resource load(EObject eObject, URIConverter uriConverter, String uri) {
		return null;
	}

	@Override
	public Resource load(Resource resource, URIConverter uriConverter, URI uri) {
		return null;
	}

	@Override
	public Resource load(Resource resource, URIConverter uriConverter, String uri) {
		return null;
	}

	@Override
	public Resource load(ResourceSet resourceSet, URIConverter uriConverter, URI uri) {
		setURIConverter(resourceSet, uriConverter);
		Resource resource = resourceSet.getResource(uri, true);
		resource.setURI(uri);
		return resource;
	}

	@Override
	public Resource load(ResourceSet resourceSet, URIConverter uriConverter, String uri) {
		return null;
	}

	@Override
	public Resource load(EObject eObject, URIConverter uriConverter, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse) {
		return null;
	}

	@Override
	public Resource load(Resource resource, URIConverter uriConverter, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse) {
		return null;
	}

	@Override
	public Resource load(ResourceSet resourceSet, URIConverter uriConverter, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse) {
		setURIConverter(resourceSet, uriConverter);
		return loadFromResourceReuse(resourceSet, resourcereuse);
	}

	@Override
	public Resource load(EObject eObject, URIConverter uriConverter, String id, String name, String version, String domain, String weight, String... tags) {
		return null;
	}

	@Override
	public Resource load(Resource resource, URIConverter uriConverter, String id, String name, String version, String domain, String weight, String... tags) {
		return null;
	}

	@Override
	public Resource load(ResourceSet resourceSet, URIConverter uriConverter, String id, String name, String version, String domain, String weight, String... tags) {
		setURIConverter(resourceSet, uriConverter);
		final SearchCriteria searchCriteria = initializeSearchCriteria(id, name, version, domain, weight, tags);
		return loadFromCriteriaList(resourceSet, searchCriteria);
	}

	@Override
	public Resource load(EObject eObject, URIConverter uriConverter, SearchCriteria criteria) {
		return null;
	}

	@Override
	public Resource load(Resource resource, URIConverter uriConverter, SearchCriteria criteria) {
		return null;
	}

	@Override
	public Resource load(ResourceSet resourceSet, URIConverter uriConverter, SearchCriteria criteria) {
		
		URI modelResourcesURI = ModelReuseHelper.createModelReuseURI(criteria);
		
		return load(resourceSet, uriConverter, modelResourcesURI);
	}
	
	/**
	 * Set a new URI converter. if uriConverter is null, take a default one
	 * @param resourceSet
	 * @param uriConverter
	 */
	private void setURIConverter(ResourceSet resourceSet, URIConverter uriConverter){
		if (uriConverter != null) {
			resourceSet.setURIConverter(uriConverter);
		}
	}
	
	private Resource loadFromResourceReuse(ResourceSet resourceSet, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse){
		URI[] uris = ModelReuseHelper.createModelReuseURI(resourcereuse);
		Resource result = null;
		for (URI uri : uris)
		{
			Resource r = getResource(resourceSet, uri);
			if (result == null) {
				result = r;
			}
		}
		return result;
	}

	private Resource getResource(ResourceSet resourceSet, URI uri) {
		Resource resource = resourceSet.getResource(uri, true);
		resource.setURI(uri);
		return resource;
	}
	
	private Resource loadFromCriteriaList(ResourceSet resourceSet, SearchCriteria searchCriteria){
		return load(resourceSet, searchCriteria);
	}

	private SearchCriteria initializeSearchCriteria(String id, String name, String version, String domain, String weight, String... tags) {
		
		final SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setId((id != null && id.isEmpty())? null : id); //Must never occur. See extension point specification
		searchCriteria.setName((name != null && name.isEmpty())? null : name); //Must never occur. See extension point specification
		searchCriteria.setVersion((version != null && version.isEmpty())? null : version);
		searchCriteria.setDomain((domain != null && domain.isEmpty())? null : domain);

		for (String tag : tags) {
			searchCriteria.getTags().add(tag);
		}
		return searchCriteria;
	}
}
