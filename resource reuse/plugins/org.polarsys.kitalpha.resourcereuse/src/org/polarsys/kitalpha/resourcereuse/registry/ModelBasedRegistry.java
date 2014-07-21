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
import java.util.Map.Entry;
import java.util.Set;

import org.polarsys.kitalpha.resourcereuse.helper.Disposable;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReader;
import org.polarsys.kitalpha.resourcereuse.model.Resource;


/**
 * @author Thomas Guiu
 * 
 */
public class ModelBasedRegistry extends ResourceRegistry {

	protected final Map<String, Set<String>> bundle2resource = new HashMap<String, Set<String>>();
	protected final Map<String, Set<String>> bundle2concern = new HashMap<String, Set<String>>();
	private final ResourceReader reader;

	public ModelBasedRegistry(ResourceRegistry parent, ResourceReader reader) {
		super(parent);
		this.reader = reader;
	}

	public ModelBasedRegistry(ResourceRegistry parent) {
		this(parent, null);
	}

	public void clear(String bundleId) {
		Set<String> set = bundle2resource.get(bundleId);
		if (set != null && !set.isEmpty()) {
			for (String resourceId : set) {
				id2resource.remove(resourceId);
			}
			set.clear();
		}
		set = bundle2concern.get(bundleId);
		if (set != null && !set.isEmpty()) {
			for (Entry<String, Set<String>> entry : user2concern.entrySet()) {
				for (String concern : entry.getValue()) {
					if (set.contains(concern))
						entry.getValue().remove(concern);
				}
			}
			for (Entry<String, Set<String>> entry : used2concern.entrySet()) {
				for (String concern : entry.getValue()) {
					if (set.contains(concern))
						entry.getValue().remove(concern);
				}
			}
			set.clear();
		}
	}

	public void addResource(String bundleId, Resource res) {
		addResource(res);
		Set<String> resources = bundle2resource.get(bundleId);
		if (resources == null) {
			resources = new HashSet<String>();
			bundle2resource.put(bundleId, resources);
		}
		resources.add(res.getId());
	}

	public void addConcern(String bundleId, String concernName, String user, String used) {
		addConcern(concernName, user, used);
		Set<String> concerns = bundle2concern.get(bundleId);
		if (concerns == null) {
			concerns = new HashSet<String>();
			bundle2concern.put(bundleId, concerns);
		}
		concerns.add(concernName);
	}

	public void dispose() {
		super.dispose();
		if (reader != null && reader instanceof Disposable)
			((Disposable) reader).dispose();
		bundle2resource.clear();
		bundle2resource.clear();
	}
}
