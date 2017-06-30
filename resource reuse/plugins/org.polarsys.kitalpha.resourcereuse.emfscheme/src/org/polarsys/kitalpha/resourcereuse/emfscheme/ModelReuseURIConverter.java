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
package org.polarsys.kitalpha.resourcereuse.emfscheme;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
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
	
	private static final Logger logger = Logger.getLogger(ModelReuseURIConverter.class);
	
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
	
	private SearchCriteria extractCriteria(URI uri) {
		SearchCriteria criteria = new SearchCriteria();
		
		for (String segment : uri.segments()) {
			if (segment.startsWith("id="))
				criteria.setId(segment.substring(3));
			else if (segment.startsWith("name="))
				criteria.setName(segment.substring(5));
			else if (segment.startsWith("domain="))
				criteria.setDomain(segment.substring(7));
			else if (segment.startsWith("version="))
				criteria.setVersion(segment.substring(7));
			else if (segment.startsWith("tags=")) {
				String tags = segment.substring(5);
				criteria.getTags().addAll(Arrays.asList(tags.split(",")));
			}
		}
		return criteria;
	}
	private URI translateReuseURIToPhysicalURI(URI uri) {
		SearchCriteria criteria = extractCriteria(uri);
		
		Resource[] resources = ResourceReuse.createHelper().getResources(criteria);
	
		if (resources.length == 0)
			throw new RuntimeException("The uri '"+uri.toString()+"' does not matche any resource");
		if (resources.length > 1)
			logger.error(new Status(IStatus.WARNING, Activator.PLUGIN_ID, "The uri '"+uri.toString()+"' matches several resources, using the first one."));
		
		Resource resource = resources[0];
		Location location = resource.getProviderLocation();
		
		boolean useMetadata = useMetadata(uri);
		String pathString = useMetadata ? resource.getMetadataPath() : resource.getPath();
		
		switch (location) {

		case TARGET:
		case PLATFORM:
			return URI.createPlatformPluginURI(pathString, true);

		case WORSPACE:
			return URI.createPlatformResourceURI(pathString, true);
		}
		throw new IllegalStateException("Cannot find provider location for resource: "+resource);
	}

	private boolean useMetadata(URI uri) {
		for (String seg : uri.segments())
			if ("useMetadata".equals(seg))
				return true;
		return false;
	}
	
}
