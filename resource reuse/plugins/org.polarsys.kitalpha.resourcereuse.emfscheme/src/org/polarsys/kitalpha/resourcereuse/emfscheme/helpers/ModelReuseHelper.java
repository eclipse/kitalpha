/*******************************************************************************
 * Copyright (c) 2016, 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.emfscheme.helpers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceHelper;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class ModelReuseHelper {

	private static final String METADATA_KEYWORD = "useMetadata"; //$NON-NLS-1$
	private static final String TAGS_KEYWORD = "Tags"; //$NON-NLS-1$
	
	private static final String MODELREUSE_SCHEME_PREFIX = "modelreuse"; //$NON-NLS-1$
	

	public static URI createModelReuseURI(Resource resource, boolean manageMetadata){
		StringBuilder sb = new StringBuilder(50);
		sb.append(MODELREUSE_SCHEME_PREFIX).append(":/");
		sb.append("id=").append(URI.encodeSegment(resource.getId(), false));
		if (manageMetadata)
			sb.append("/").append(URI.encodeSegment(METADATA_KEYWORD, false));
		return URI.createURI(sb.toString());
	}

	public static URI[] createModelReuseURI(Resource resource){
		if (resource.getMetadataPath() != null)
			return new URI[] {createModelReuseURI(resource, false), createModelReuseURI(resource, true)};
		return new URI[] {createModelReuseURI(resource, false)};
	}
	
	/**
	 * Return the metadata uri for the given uri.
	 * @param uri must be a modelreuse uri
	 * @return
	 */
	public static URI createMetatadaURI(URI uri) {
		if (hasModelReuseScheme(uri))
		{
			if (uri.path().contains(METADATA_KEYWORD))
				return uri;
			return uri.appendSegment(METADATA_KEYWORD);
		}
		return uri;
	}
	
	public static boolean hasModelReuseScheme(URI uri) {
		return uri.scheme().equals(MODELREUSE_SCHEME_PREFIX);
	}

	public static URI createModelReuseURI(SearchCriteria criteria){
		return createModelReuseURI(criteria, false);
	}
	
	public static URI createModelReuseMetadataURI(SearchCriteria criteria){
		return createModelReuseURI(criteria, true);
	}
	
	private static URI createModelReuseURI(SearchCriteria criteria, boolean manageMetadata){
		StringBuilder sb = new StringBuilder(200);
		sb.append(MODELREUSE_SCHEME_PREFIX).append(":/");
		
		if (criteria.getId() != null && !criteria.getId().isEmpty())
			sb.append("id=").append(URI.encodeSegment(criteria.getId(), false)).append('/');
		if (criteria.getName() != null && !criteria.getName().isEmpty())
			sb.append("name=").append(URI.encodeSegment(criteria.getName(), false)).append('/');
		if (criteria.getDomain() != null && !criteria.getDomain().isEmpty())
			sb.append("domain=").append(URI.encodeSegment(criteria.getDomain(), false)).append('/');
		if (criteria.getVersion() != null && !criteria.getVersion().isEmpty())
			sb.append("version=").append(URI.encodeSegment(criteria.getVersion(), false)).append('/');
		if (criteria.getTags() != null && !criteria.getTags().isEmpty() )
		{
			sb.append("tags=");
			for (String tag : criteria.getTags()) {
				sb.append(URI.encodeSegment(tag, false)).append(',');
			}
			sb.deleteCharAt(sb.length() - 1).append("/");
		}
		if (manageMetadata)
			sb.append(URI.encodeSegment(METADATA_KEYWORD, false)).append("/");

		return URI.createURI(sb.toString());
	}


	/**
	 * @deprecated use createModelReuseURI() instead
	 */
	public static List<URI> findModelsURIAccordingToCriteria(
			SearchCriteria criteria) {

		List<URI> foundModels = new ArrayList<URI>();

		List<Resource> resourceSelected = findModelsAccordingToCriteria(criteria);

		// Browse resources found
		for (Resource resource : resourceSelected) {

			URI modelResourceURI = null;

			// Evaluating the new uri of the resource with the new protocol
			// (This uri will be parsed with a new factory associated to the
			// protocol to retrieve the resource)
			modelResourceURI = createModelReuseURI(resource, false);

			// The modelreuse uri is added to modelsToLoad
			foundModels.add(modelResourceURI);
		}
		return foundModels;
	}

	public static List<Resource> findModelsAccordingToCriteria(
			SearchCriteria criteria) {
		// Creating resourcehelper, needed to retrieve plugin contributing to
		// ResourceReuse extension point
		ResourceHelper resourceHelperPlatform = ResourceReuse
				.createPlatformHelper();
		ResourceHelper resourceHelperWorkspace = ResourceReuse
				.createWorkspaceHelper();

		// Introspection models are found from all results applying a criteria :
		// all introspections model containers' extension are tagged
		// IntrospectionModel

		List<Resource> resourceSelected = new ArrayList<Resource>();

		Resource[] resourceSelectedWorkspace = resourceHelperWorkspace
				.getResources(criteria);
		for (Resource resource : resourceSelectedWorkspace) {
			resourceSelected.add(resource);
		}
		Resource[] resourceSelectedPlatform = resourceHelperPlatform
				.getResources(criteria);
		for (Resource resource : resourceSelectedPlatform) {

			boolean resourceAlreadyFound = false;

			// Complicated... resourceHelperPlatform also contain resources
			// referenced
			// from the workspace, but only once a resourceHelperWorkspace has
			// been used (in the factory).
			// So it's not always true, and better not add them if it occurs
			for (Resource resourceInResourceSelected : resourceSelected) {

				if (resourceInResourceSelected.getId().equals(
						resource.getId())) {
					resourceAlreadyFound = true;
				}
			}
			if (!resourceAlreadyFound)
				resourceSelected.add(resource);
		}
		return resourceSelected;
	}

}
