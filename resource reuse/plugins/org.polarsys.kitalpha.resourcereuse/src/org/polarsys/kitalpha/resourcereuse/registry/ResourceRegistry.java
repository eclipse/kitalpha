/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.registry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.polarsys.kitalpha.resourcereuse.Messages;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceHelper;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceNotFoundException;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;
import org.polarsys.kitalpha.resourcereuse.utils.Assert;
import org.polarsys.kitalpha.resourcereuse.utils.Matcher;


/**
 * @author Thomas Guiu
 * 
 */
public abstract class ResourceRegistry implements ResourceHelper {
	private final ResourceRegistry parent;

	protected final Map<String, Resource> id2resource = new HashMap<String, Resource>();
	protected final Map<String, Set<String>> user2concern = new HashMap<String, Set<String>>();
	protected final Map<String, Set<String>> used2concern = new HashMap<String, Set<String>>();

	public ResourceRegistry(ResourceRegistry parent) {
		this.parent = parent;
	}

	public boolean containsResource(String id) {
		return id2resource.containsKey(id);
	}

	protected void addResource(Resource resource) {
		id2resource.put(resource.getId(), resource);
	}

	protected void addConcern(String concernName, String user, String used) {
		Set<String> concerns = user2concern.get(user);
		if (concerns == null) {
			concerns = new HashSet<String>();
			user2concern.put(user, concerns);
		}
		concerns.add(concernName);
		concerns = used2concern.get(used);
		if (concerns == null) {
			concerns = new HashSet<String>();
			used2concern.put(used, concerns);
		}
		concerns.add(concernName);

	}

	@Override
	public Resource getResource(String id) throws ResourceNotFoundException {
		Assert.notNullnotEmpty(id);
		Resource resource = id2resource.get(id);
		if (resource == null) {
			if (parent == null) {
				throw new ResourceNotFoundException(Messages.bind(Messages.ResourceId_Not_Found, id));
			}
			return parent.getResource(id);
		}
		return resource;
	}

	@Override
	public Resource[] getResources(SearchCriteria criteria) {
		Assert.usable(criteria);
		List<Resource> result = new ArrayList<Resource>();
		Matcher matcher = new Matcher(criteria);
		applyCriteria(result, matcher);
		Collections.sort(result, new Comparator<Resource>() {

			@Override
			public int compare(Resource o1, Resource o2) {
				return o2.getWeight() - o1.getWeight();
			}
		});
		return result.toArray(new Resource[result.size()]);
	}

	protected void applyCriteria(List<Resource> result, Matcher matcher) {
		for (Entry<String, Resource> entry : id2resource.entrySet()) {
			Resource resource = entry.getValue();
			Set<String> usedConcerns = used2concern.get(resource.getId());
			Set<String> userConcerns = user2concern.get(resource.getId());
			if (matcher.matchResource(resource) && matcher.matchConcerns(usedConcerns, userConcerns)) {
				result.add(resource);
			}
		}
		if (parent != null) {
			parent.applyCriteria(result, matcher);
		}
	}

	@Override
	public void dispose() {
		if (parent != null) {
			parent.dispose();
		}
		id2resource.clear();
		used2concern.clear();
		user2concern.clear();
	}
}
