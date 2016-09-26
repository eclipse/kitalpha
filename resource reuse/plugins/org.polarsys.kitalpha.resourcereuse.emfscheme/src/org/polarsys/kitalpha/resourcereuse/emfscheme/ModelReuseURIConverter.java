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
package org.polarsys.kitalpha.resourcereuse.emfscheme;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceHelper;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.internal.emfscheme.Activator;
import org.polarsys.kitalpha.resourcereuse.model.Location;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

public class ModelReuseURIConverter extends ExtensibleURIConverterImpl {
	
	private static Map<URI, org.eclipse.emf.ecore.resource.Resource> cache = new HashMap<URI, org.eclipse.emf.ecore.resource.Resource>();
	private static HashMap<URI, URI> logicalToPhysicalHashMapURI = new HashMap<URI, URI>();
	
	private static final Logger logger = Logger.getLogger(ModelReuseURIConverter.class);
	
	private final static Pattern pattern;

	static {
		
		// Here are patterns for my regex
		final String IdPattern = "(Id=([A-Za-z0-9-.-[ \t]]*[A-Za-z0-9-.]))?"; //$NON-NLS-1$
		final String whitespacePattern = "[ \t]*"; //$NON-NLS-1$
		final String namePattern = "(Name=([A-Za-z0-9-.-[ \t]]*[A-Za-z0-9-.]))?"; //$NON-NLS-1$
		final String domainPattern = "(Domain=([A-Za-z0-9-.-[ \t]]*[A-Za-z0-9-.]))?"; //$NON-NLS-1$
		final String versionPattern = "(Version=([A-Za-z0-9-.]*))?"; //$NON-NLS-1$
		final String tagsPattern = "(Tags=\\[([A-Za-z0-9-.-[ \t]-;]*[A-Za-z0-9-.-[ \t]])?\\])?"; //$NON-NLS-1$

		final String globalPattern = IdPattern + whitespacePattern + namePattern
				+ whitespacePattern + domainPattern + whitespacePattern
				+ versionPattern + whitespacePattern + tagsPattern;
		
		pattern = Pattern.compile(globalPattern);
	}

	
	public ModelReuseURIConverter() {
		super();
	}
	
	@Override
	public URI normalize(URI uri) {
		String scheme = uri.scheme();

		if (scheme != null && scheme.equals("modelreuse")){
			try {
				/*
				 * Workaround to decode uri from Sirius representation
				 */
				String decodedURI = URLDecoder.decode(uri.toString(), "UTF-8");
				return translateReuseURIToPhysicalURI(URI.createURI(decodedURI));
			}catch (UnsupportedEncodingException e){
				/*
				 * Log the error and try to normalize it with default URIConverter
				 */
				logger.error(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}
		}
		
		return super.normalize(uri);
	}
	
	private URI translateReuseURIToPhysicalURI(URI uri) {
		
		// we check that the cache is valid
		Set<URI> uris = cache.keySet();
		for (URI currentURI : uris) {
			org.eclipse.emf.ecore.resource.Resource currentResource = cache
					.get(currentURI);
			if (!currentResource.isLoaded())
				cache.remove(currentURI);
		}

		// usage of the cache
		if (cache.containsKey(uri)) {
			return logicalToPhysicalHashMapURI.get(uri);
		}

		List<String> criteriaSpecifications = findCriteriaSpecifications(uri);

		ResourceHelper resourceHelperPlatform = ResourceReuse
				.createPlatformHelper();
		ResourceHelper resourceHelperWorkspace = ResourceReuse
				.createWorkspaceHelper();

		SearchCriteria criteria = new SearchCriteria();

		criteria.setId(criteriaSpecifications.get(0));

		if (criteriaSpecifications.get(1).isEmpty())
			criteria.setName(null);
		else
			criteria.setName(criteriaSpecifications.get(1));

		if (criteriaSpecifications.get(2).isEmpty()) {
			criteria.setDomain(null);
		} else
			criteria.setDomain(criteriaSpecifications.get(2));

		if (criteriaSpecifications.get(3).isEmpty()) {
			criteria.setVersion(null);
		} else
			criteria.setVersion(criteriaSpecifications.get(3));

		// I remove id,name,domain and version for fill in tags
		criteriaSpecifications.remove(0);
		criteriaSpecifications.remove(0);
		criteriaSpecifications.remove(0);
		criteriaSpecifications.remove(0);

		if (!criteriaSpecifications.isEmpty()) {
			for (String tag : criteriaSpecifications) {
				criteria.getTags().add(tag);
			}
		}

		// Here i clear my list
		criteriaSpecifications.clear();

		Resource resourceFoundWithModelreuseProtocol = null;
		URI modelResourceURI = null;

		Resource[] resourceSelectedWorkspace = resourceHelperWorkspace
				.getResources(criteria);
		Resource[] resourceSelectedPlatform = resourceHelperPlatform
				.getResources(criteria);

		Boolean resourceFound = false;
		if (resourceSelectedWorkspace.length != 0) {
			resourceFoundWithModelreuseProtocol = resourceSelectedWorkspace[0];
			resourceFound = true;
		} else if (resourceSelectedPlatform.length != 0) {
			Resource resource = resourceSelectedPlatform[0];
			resourceFoundWithModelreuseProtocol = resource;
			resourceFound = true;
		}

		if (resourceFound) {
			Location location = resourceFoundWithModelreuseProtocol
					.getProviderLocation();
			String pathString = "";
			pathString = resourceFoundWithModelreuseProtocol.getPath();
			switch (location) {

			case PLATFORM:
				modelResourceURI = URI.createPlatformPluginURI(pathString, true);
				logicalToPhysicalHashMapURI.put(uri, modelResourceURI);
				break;

			case WORSPACE:
				modelResourceURI = URI.createPlatformResourceURI(pathString, true);
				logicalToPhysicalHashMapURI.put(uri, modelResourceURI);
				break;
			default:
				break;
			}
		}
		if (modelResourceURI != null)
			return modelResourceURI;
		
		throw new RuntimeException("EMF Scheme: Could not translate a logical URI " + uri.toString() + " to physical URI.");
	}
	
	private List<String> findCriteriaSpecifications(URI abstractURI) {

		List<String> criteriaSpecifications = new ArrayList<String>();
		String[] uriSegments = abstractURI.segments();

		// Here i handle my regex to get criterias from my URI
		String abstractURIString = uriSegments[0];

		Matcher m = getPattern().matcher(abstractURIString);

		m.matches();

		// i=2 =>id
		String id = m.group(2);
		// i=3 et 4 => name
		String name = m.group(4);
		// i= 5 et 6 => domain
		String domain = m.group(6);
		// i = 7 et 8 => version
		String version = m.group(8);
		// i = 9 et 10 => Tags
		String tag = m.group(10);

		int i = -1;
		// Here i fill my list of strings
		if (id != null) {
			i++;
			criteriaSpecifications.add(i, id);
		}

		if (name != null) {
			i++;
			criteriaSpecifications.add(i, name);
		} else {
			i++;
			criteriaSpecifications.add(i, ""); //$NON-NLS-1$
		}
		if (domain != null) {
			i++;
			criteriaSpecifications.add(i, domain);
		} else {
			i++;
			criteriaSpecifications.add(i, ""); //$NON-NLS-1$
		}
		if (version != null) {
			i++;
			criteriaSpecifications.add(i, version);
		} else {
			i++;
			criteriaSpecifications.add(i, ""); //$NON-NLS-1$
		}

		// Here i fill tags
		if (tag != null) {
			if (!tag.isEmpty()) {
				String[] split = tag.split(";"); //$NON-NLS-1$
				int length = split.length;
				for (int j = 0; j < length; j++) {
					criteriaSpecifications.add(split[j]);
				}
			}
		}
		return criteriaSpecifications;
	}

	private static Pattern getPattern() {
		return pattern;
	}
	
}
