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
		 return createModelReuseURI(MODELREUSE_SCHEME_PREFIX, manageMetadata, resource);
	}
	public static URI[] createModelReuseURI(Resource resource){
		return new URI[] {createModelReuseURI(MODELREUSE_SCHEME_PREFIX, false, resource), createModelReuseURI(MODELREUSE_SCHEME_PREFIX, true, resource)};
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
			int nb = uri.path().indexOf(TAGS_KEYWORD);
			if (nb == -1)
				return  URI.createURI(MODELREUSE_SCHEME_PREFIX +":/"+ uri.path()+" "+METADATA_KEYWORD);
			return URI.createURI(MODELREUSE_SCHEME_PREFIX +":/"+ uri.path().substring(0, nb)+METADATA_KEYWORD+" "+uri.path().substring(nb));
		}
		return uri;
	}
	
	public static boolean hasModelReuseScheme(URI uri) {
		return uri.scheme().equals(MODELREUSE_SCHEME_PREFIX);
	}

	private static URI createModelReuseURI(String protocolName, boolean useMetadata,
			Resource resource) {
		if (useMetadata && resource.getMetadataPath() == null)
			return null;
		String elementID = resource.getId();
		List<String> tags = resource.getTags();
		String finalResult = "Id=" + elementID; //$NON-NLS-1$
		int i = 0;

		if (useMetadata && resource.getMetadataPath() != null) {
			finalResult += " "+METADATA_KEYWORD; //$NON-NLS-1$
		}

		if (resource.getName() != null) {
			finalResult += " Name=" + resource.getName(); //$NON-NLS-1$
		}
		if (resource.getDomain() != null) {
			finalResult += " Domain=" + resource.getDomain(); //$NON-NLS-1$
		}
		if (resource.getVersion() != null) {
			finalResult += " Version=" + resource.getVersion(); //$NON-NLS-1$
		}

		if (tags != null) {
			finalResult += " "+TAGS_KEYWORD+"=["; //$NON-NLS-1$
			for (String tag : tags) {
				int size = tags.size();
				// if we're at the last tag
				i++;
				if (i == size)
					finalResult += tag;
				else
					finalResult += tag + ";"; //$NON-NLS-1$
			}
			finalResult += "]"; //$NON-NLS-1$
		}

		URI result = URI.createURI(protocolName +":/"+ finalResult);

		return result;
	}
	public static List<URI> findMetadataURIAccordingToCriteria(
			SearchCriteria criteria) {

		List<URI> foundModels = new ArrayList<URI>();

		List<Resource> resourceSelected = findModelsAccordingToCriteria(criteria);

		// Browse resources found
		for (Resource resource : resourceSelected) {

			URI modelResourceURI = null;

			// Evaluating the new uri of the resource with the new protocol
			// (This uri will be parsed with a new factory associated to the
			// protocol to retrieve the resource)
			modelResourceURI = createModelReuseURI(resource, true);

			// The modelreuse uri is added to modelsToLoad
			if (modelResourceURI != null)
				foundModels.add(modelResourceURI);
		}
		return foundModels;
	}


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

				if (resourceInResourceSelected.getName().equals(
						resource.getName())) {
					resourceAlreadyFound = true;
				}
			}
			if (!resourceAlreadyFound)
				resourceSelected.add(resource);
		}
		return resourceSelected;
	}

}
