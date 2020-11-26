/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.emfscheme.api;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * 
 * @author Faycal ABKA
 *
 */
public interface IModelReuseLoader {

	/**
	 * Load the content (resource) of the uri in the resourceSet which contains the resource of the eObject
	 * @param eObject to retrieve the resourceSet
	 * @param uri of the content to load
	 * @return the loaded resource or <code>null</code> if <code>eObject == null or eObeject.eResource() == null or eObject.eResource().getResourceSet() == null</code>
	 */
	Resource load(EObject eObject, URI uri);

	/**
	 * Load the content (resource) of the uri in the resourceSet which contains the resource of the eObject
	 * @param eObject to retrieve the resourceSet
	 * @param uri of the content to load
	 * @return the loaded resource or <code>null</code> if <code>eObject == null or eObeject.eResource() == null or eObject.eResource().getResourceSet() == null</code>
	 */
	Resource load(EObject eObject, String uri);

	/**
	 * Load the content (resource) of the uri in the resourceSet which contains the resource
	 * @param resource to retrieve the resourceSet
	 * @param uri of the content to load
	 * @return the loaded resource or <code>null</code> if <code>resource == null or resource().getResourceSet() == null</code>
	 */
	Resource load(Resource resource, URI uri);

	/**
	 * Load the content (resource) of the uri in the resourceSet which contains the resource
	 * @param resource to retrieve the resourceSet
	 * @param uri of the content to load
	 * @return the loaded resource or <code>null</code> if <code>resource == null or resource().getResourceSet() == null</code>
	 */
	Resource load(Resource resource, String uri);

	/**
	 * Load the content (resource) of the uri in the resourceSet
	 * @param resourceSet where to load
	 * @param uri of the content to load
	 * @return the loaded resource or <code>null</code> if <code>resourceSet == null</code>
	 */
	Resource load(ResourceSet resourceSet, URI uri);

	/**
	 * Load the content (resource) of the uri in the resourceSet
	 * @param resourceSet where to load
	 * @param uri of the content to load
	 * @return the loaded resource or <code>null</code> if <code>resourceSet == null</code>
	 */
	Resource load(ResourceSet resourceSet, String uri);

	/**
	 * load the content (resource) indexed by the resourcereuse type
	 * @param eObject to retrieve the resourceSet
	 * @param resourcereuse of the content to load
	 * @return the loaded resource or <code>null</code> if <code>eObject == null or eObeject.eResource() == null or eObject.eResource().getResourceSet() == null</code>
	 */
	Resource load(EObject eObject, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse);
	
	/**
	 * load the content (resource) indexed by the resourcereuse type
	 * @param resource to retrieve the resourceSet
	 * @param resourcereuse of the content to load
	 * @return the loaded resource or <code>null</code> if <code>resource == null or resource.getResourceSet() == null</code>
	 */
	Resource load(Resource resource, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse);

	/**
	 * Load the content (resource) indexed by the resourcereuse type
	 * @param resourceSet where to load
	 * @param resourcereuse of the content to load
	 * @return the loaded resource or <code>null</code> if <code>resourceSet() == null</code>
	 */
	Resource load(ResourceSet resourceSet, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse);

	/**
	 * Load the first content found by resourcereuse attributes
	 * @param eObject to retrieve the resourceSet
	 * @param id of the content to load
	 * @param name of the content to load
	 * @param version of the content to load
	 * @param domain of the content to load
	 * @param weight of the content to load
	 * @param tags of the content to load
	 * @return the loaded resource or <code>null</code> if <code>eObject == null or eObeject.eResource() == null or eObject.eResource().getResourceSet() == null</code>
	 */
	Resource load(EObject eObject, String id, String name, String version, String domain, String weight, String... tags);

	/**
	 * Load the first content (resource) indexed by the resourcereuse attributes
	 * @param resource to retrieve the resourceSet
	 * @param id of the content to load
	 * @param name of the content to load
	 * @param version of the content to load
	 * @param domain of the content to load
	 * @param weight of the content to load
	 * @param tags of the content to load
	 * @return the loaded resource or <code>null</code> if <code>resource == null or resource.getResourceSet() == null</code>
	 */
	Resource load(Resource resource, String id, String name, String version, String domain, String weight, String... tags);

	/**
	 * Load the first content (resource) indexed by the resourcereuse attributes 
	 * @param resourceSet where to load
	 * @param id of the content to load
	 * @param name of the content to load
	 * @param version of the content to load
	 * @param domain of the content to load
	 * @param weight of the content to load
	 * @param tags of the content to load
	 * @return the loaded resource or <code>null</code> if <code>resourceSet == null</code>
	 */
	Resource load(ResourceSet resourceSet, String id, String name, String version, String domain, String weight, String... tags);

	/**
	 * Load the first content (resource) indexed by the criteria
	 * @param eObject to retrive the resourceSet
	 * @param criteria to find the first content to load
	 * @return the loaded resource or <code>null</code> if <code>eObject == null or eObeject.eResource() == null or eObject.eResource().getResourceSet() == null</code>
	 */
	Resource load(EObject eObject, SearchCriteria criteria);

	/**
	 * Load the first content (resource) indexed by the criteria
	 * @param resource to retrive the resourceSet
	 * @param criteria to find the first content to load
	 * @return the loaded resource or <code>null</code> if <code>resource == null or resource.getResourceSet() == null</code>
	 */
	Resource load(Resource resource, SearchCriteria criteria);

	/**
	 * Load the first content (resource) indexed by the criteria
	 * @param resourceSet where to load
	 * @param criteria to find the first content to load
	 * @return the loaded resource or <code>null</code> if <code>resourceSet == null</code>
	 */
	Resource load(ResourceSet resourceSet, SearchCriteria criteria);

	/**
	 * Load the content (resource) of the uri in the resourceSet which contains the resource of the eObject
	 * @param eObject to retrieve the resourceSet
	 * @param uriConverter to perform loading of the content (resource) of the uri
	 * @param uri of the content to load
	 * @return the loaded resource or <code>null</code> if <code>eObject == null or eObeject.eResource() == null or eObject.eResource().getResourceSet() == null</code>
	 */
	Resource load(EObject eObject, URIConverter uriConverter, URI uri);

	/**
	 * Load the content (resource) of the uri in the resourceSet which contains the resource of the eObject
	 * @param eObject to retrieve the resourceSet
	 * @param uriConverter to perform loading of the content (resource) of the uri
	 * @param uri of the content to load
	 * @return the loaded resource or <code>null</code> if <code>eObject == null or eObeject.eResource() == null or eObject.eResource().getResourceSet() == null</code>
	 */
	Resource load(EObject eObject, URIConverter uriConverter, String uri);

	/**
	 * Load the content (resource) of the uri in the resourceSet which contains the resource
	 * @param resource to retrieve the resourceSet
	 * @param uriConverter to perform loading of the content (resource) of the uri
	 * @param uri of the content to load
	 * @return the loaded resource or <code>null</code> if <code>resource == null or resource().getResourceSet() == null</code>
	 */
	Resource load(Resource resource, URIConverter uriConverter, URI uri);

	/**
	 * Load the content (resource) of the uri in the resourceSet which contains the resource
	 * @param resource to retrieve the resourceSet
	 * @param uriConverter to perform loading of the content (resource) of the uri
	 * @param uri of the content to load
	 * @return the loaded resource or <code>null</code> if <code>resource == null or resource().getResourceSet() == null</code>
	 */
	Resource load(Resource resource, URIConverter uriConverter, String uri);

	/**
	 * Load the content (resource) of the uri in the resourceSet
	 * @param resourceSet where to load
	 * @param uriConverter to perform loading of the content (resource) of the uri
	 * @param uri of the content to load
	 * @return the loaded resource or <code>null</code> if <code>resourceSet == null</code>
	 */
	Resource load(ResourceSet resourceSet, URIConverter uriConverter, URI uri);

	/**
	 * Load the content (resource) of the uri in the resourceSet
	 * @param resourceSet where to load
	 * @param uri of the content to load
	 * @return the loaded resource or <code>null</code> if <code>resourceSet == null</code>
	 */
	Resource load(ResourceSet resourceSet, URIConverter uriConverter, String uri);

	/**
	 * load the content (resource) indexed by the resourcereuse type
	 * @param eObject to retrieve the resourceSet
	 * @param uriConverter to perform loading of the content (resource) of the uri
	 * @param resourcereuse of the content to load
	 * @return the loaded resource or <code>null</code> if <code>eObject == null or eObeject.eResource() == null or eObject.eResource().getResourceSet() == null</code>
	 */
	Resource load(EObject eObject, URIConverter uriConverter, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse);

	/**
	 * load the content (resource) indexed by the resourcereuse type
	 * @param resource to retrieve the resourceSet
	 * @param uriConverter to perform loading of the content (resource) of the uri
	 * @param resourcereuse of the content to load
	 * @return the loaded resource or <code>null</code> if <code>resource == null or resource.getResourceSet() == null</code>
	 */
	Resource load(Resource resource, URIConverter uriConverter, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse);

	/**
	 * Load the content (resource) indexed by the resourcereuse type
	 * @param resourceSet where to load
	 * @param uriConverter to perform loading of the content (resource) of the uri
	 * @param resourcereuse of the content to load
	 * @return the loaded resource or <code>null</code> if <code>resourceSet() == null</code>
	 */
	Resource load(ResourceSet resourceSet, URIConverter uriConverter, org.polarsys.kitalpha.resourcereuse.model.Resource resourcereuse);

	/**
	 * Load the first content found by resourcereuse attributes
	 * @param eObject to retrieve the resourceSet
	 * @param uriConverter to perform loading of the content (resource) of the uri
	 * @param id of the content to load
	 * @param name of the content to load
	 * @param version of the content to load
	 * @param domain of the content to load
	 * @param weight of the content to load
	 * @param tags of the content to load
	 * @return the loaded resource or <code>null</code> if <code>eObject == null or eObeject.eResource() == null or eObject.eResource().getResourceSet() == null</code>
	 */
	Resource load(EObject eObject, URIConverter uriConverter, String id, String name, String version, String domain, String weight, String... tags);

	/**
	 * Load the first content (resource) indexed by the resourcereuse attributes
	 * @param resource to retrieve the resourceSet
	 * @param uriConverter to perform loading of the content (resource) of the uri
	 * @param id of the content to load
	 * @param name of the content to load
	 * @param version of the content to load
	 * @param domain of the content to load
	 * @param weight of the content to load
	 * @param tags of the content to load
	 * @return the loaded resource or <code>null</code> if <code>resource == null or resource.getResourceSet() == null</code>
	 */
	Resource load(Resource resource, URIConverter uriConverter, String id, String name, String version, String domain, String weight, String... tags);

	/**
	 * Load the first content (resource) indexed by the resourcereuse attributes 
	 * @param resourceSet where to load
	 * @param uriConverter to perform loading of the content (resource) of the uri
	 * @param id of the content to load
	 * @param name of the content to load
	 * @param version of the content to load
	 * @param domain of the content to load
	 * @param weight of the content to load
	 * @param tags of the content to load
	 * @return the loaded resource or <code>null</code> if <code>resourceSet == null</code>
	 */
	Resource load(ResourceSet resourceSet, URIConverter uriConverter, String id, String name, String version, String domain, String weight, String... tags);

	/**
	 * Load the first content (resource) indexed by the criteria
	 * @param eObject to retrive the resourceSet
	 * @param uriConverter to perform loading of the content (resource) of the uri
	 * @param criteria to find the first content to load
	 * @return the loaded resource or <code>null</code> if <code>eObject == null or eObeject.eResource() == null or eObject.eResource().getResourceSet() == null</code>
	 */
	Resource load(EObject eObject, URIConverter uriConverter, SearchCriteria criteria);

	/**
	 * Load the first content (resource) indexed by the criteria
	 * @param resource to retrive the resourceSet
	 * @param uriConverter to perform loading of the content (resource) of the uri
	 * @param criteria to find the first content to load
	 * @return the loaded resource or <code>null</code> if <code>resource == null or resource.getResourceSet() == null</code>
	 */
	Resource load(Resource resource, URIConverter uriConverter, SearchCriteria criteria);

	/**
	 * Load the first content (resource) indexed by the criteria
	 * @param resourceSet where to load
	 * @param uriConverter to perform loading of the content (resource) of the uri
	 * @param criteria to find the first content to load
	 * @return the loaded resource or <code>null</code> if <code>resourceSet == null</code>
	 */
	Resource load(ResourceSet resourceSet, URIConverter uriConverter, SearchCriteria criteria);

}
