/*******************************************************************************
 * Copyright (c) 2014, 2017 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Thomas Guiu
 * 
 */
public class Resource {
	private String id;
	private String providerSymbolicName;
	private Location providerLocation;
	private String name;
	private String description;
	private String version;
	private String domain;
	private String path;
	private String metadataPath;
	private int weight = 0;
	private final List<String> tags = new ArrayList<String>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<String> getTags() {
		return tags;
	}

	public String getProviderSymbolicName() {
		return providerSymbolicName;
	}

	public void setProviderSymbolicName(String providerSymbolicName) {
		this.providerSymbolicName = providerSymbolicName;
	}

	public Location getProviderLocation() {
		return providerLocation;
	}

	public void setProviderLocation(Location providerLocation) {
		this.providerLocation = providerLocation;
	}
	
	public String getMetadataPath() {
		return metadataPath;
	}

	public void setMetadataPath(String metadatPath) {
		this.metadataPath = metadatPath;
	}

	@Override
	public String toString() {
		return "Resource [id=" + id + ", name=" + name + ", version=" + version + ", domain=" + domain + ", path=" + path + ", metadata=" + metadataPath + ", tags=" + Arrays.toString(tags.toArray()) + "]";
	}

}
