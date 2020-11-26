/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
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
import java.util.List;

/**
 * @author Thomas Guiu
 * 
 */
public class SearchCriteria {

	private String id;
	private String name;
	private String version;
	private String domain;
	private final List<String> tags = new ArrayList<String>();
	private final List<String> userInConcerns = new ArrayList<String>();
	private final List<String> usedInConcerns = new ArrayList<String>();
	private final List<String> concerns = new ArrayList<String>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<String> getTags() {
		return tags;
	}

	/**
	 * The found resources are used by others in these concern contexts.
	 */
	public List<String> getUsedInConcerns() {
		return usedInConcerns;
	}

	/**
	 * The found resources use others in these concern contexts.
	 */
	public List<String> getUserInConcerns() {
		return userInConcerns;
	}

	/**
	 * The found resources are involved in these concern contexts (used or as user).
	 */
	public List<String> getConcerns() {
		return concerns;
	}

	@Override
	public String toString() {
		return "SearchCriteria [id=" + id + ", name=" + name + ", version=" + version + ", domain=" + domain + ", tags=" + tags + ", concerns=" + concerns + ", usedInConcerns=" + usedInConcerns + ", userInConcerns=" + userInConcerns + "]";
	}

}
