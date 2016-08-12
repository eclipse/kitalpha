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
package org.polarsys.kitalpha.resourcereuse.internal.emfscheme.resource.load.impl;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.polarsys.kitalpha.resourcereuse.emfscheme.ModelReuseURIConverter;
import org.polarsys.kitalpha.resourcereuse.emfscheme.api.IModelReuseLoader;
import org.polarsys.kitalpha.resourcereuse.emfscheme.helpers.ModelReuseHelper;
import org.polarsys.kitalpha.resourcereuse.internal.emfscheme.Activator;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * Client should never use this class
 * @author Faycal ABKA
 *
 */
public class InternalModelReuseLoader implements IModelReuseLoader {
	
	private static final Logger logger = Logger.getLogger(IModelReuseLoader.class);

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
		setURIConverter(resourceSet, uriConverter);
		
		java.util.List<URI> modelResourcesURI = ModelReuseHelper.findModelsURIAccordingToCriteria(criteria);
		
		if (!modelResourcesURI.isEmpty()){
			//Get the first uri
			URI uri = modelResourcesURI.get(0);
			return load(resourceSet, uri);
		}
		
		int size = modelResourcesURI.size();
		logger.warn(new Status(IStatus.WARNING, Activator.PLUGIN_ID, 
				"The criteria matchs: " + size + " resources. " + 
						((size == 0)?
								"No resource will be loaded" : //Then statement
								" The first one will be loaded [" + modelResourcesURI.get(0) + "]"))); //Else statement
		
		return null;
	}
	
	/**
	 * Set a new URI converter. if uriConverter is null, take a default one
	 * @param resourceSet
	 * @param uriConverter
	 */
	private void setURIConverter(ResourceSet resourceSet, URIConverter uriConverter){
		if (uriConverter != null)
			resourceSet.setURIConverter(uriConverter);
	}
	
	private Resource loadFromResourceReuse(ResourceSet resourceSet, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse){
		URI uri = ModelReuseHelper.createModelReuseURI(resourcereuse);
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
