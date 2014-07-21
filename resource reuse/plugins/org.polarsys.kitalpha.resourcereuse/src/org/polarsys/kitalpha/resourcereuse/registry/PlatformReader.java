/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.registry;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.polarsys.kitalpha.resourcereuse.helper.Constants;
import org.polarsys.kitalpha.resourcereuse.model.Location;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class PlatformReader implements Constants {

	private Resource createResource(IConfigurationElement element) {
		Resource res = new Resource();
		String symbolicName = element.getContributor().getName();
		res.setProviderSymbolicName(symbolicName);
		res.setProviderLocation(Location.PLATFORM);
		res.setId(element.getAttribute("id"));
		String value = element.getAttribute("weight");
		if (value != null)
			res.setWeight(Integer.parseInt(value));
		res.setName(element.getAttribute("name"));
		res.setDomain(element.getAttribute("domain"));
		res.setDescription(element.getAttribute("description"));
		res.setVersion(element.getAttribute("version"));
		res.setPath(element.getAttribute("path"));
		String tags = element.getAttribute("tags");
		if (tags != null) {
			for (String tag : tags.split(", "))
				res.getTags().add(tag);
		}
		return res;
	}

	public ResourceRegistry readResources() {
		Map<String, Set<String>> user2concern = new HashMap<String, Set<String>>(100);
		Map<String, Set<String>> used2concern = new HashMap<String, Set<String>>(100);
		for (IConfigurationElement element : Platform.getExtensionRegistry().getConfigurationElementsFor(CONCERN_EXTENSION_ID)) {
			String concernName = element.getAttribute("name");
			String user = element.getAttribute("userResourceId");
			String used = element.getAttribute("usedResourceId");
			addConcern(user2concern, user, concernName);
			addConcern(used2concern, used, concernName);
		}

		PlatformRegistry registry = new PlatformRegistry();
		// TODO voir comment se passe la surcharge de bundle par une version
		// differente
		// par ex. dans platform bundle A_1.0.0, target avec A_0.5.0 ... quel
		// est une bundle actif ?

		for (IConfigurationElement element : Platform.getExtensionRegistry().getConfigurationElementsFor(RESOURCE_EXTENSION_ID)) {
			Resource resource = createResource(element);
			registry.addResource(resource, user2concern.get(resource.getId()), used2concern.get(resource.getId()));
		}
		return registry;
	}

	private void addConcern(Map<String, Set<String>> resourceId2concern, String resourceId, String concernName) {
		Set<String> concerns = resourceId2concern.get(resourceId);
		if (concerns == null) {
			concerns = new HashSet<String>();
			resourceId2concern.put(resourceId, concerns);
		}
		concerns.add(concernName);
	}
}
