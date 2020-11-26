/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;


/**
 * @author Thomas Guiu
 * 
 */
public class Matcher {
	private String id;
	private Pattern idPattern;
	private String name;
	private Pattern namePattern;
	private String version;
	private String domain;
	private Pattern domainPattern;
	private final List<String> tags = new ArrayList<String>();
	private final List<String> matchedIds = new ArrayList<String>();
	private final List<String> userInConcerns = new ArrayList<String>();
	private final List<String> usedInConcerns = new ArrayList<String>();
	private final List<String> concerns = new ArrayList<String>();

	public Matcher(SearchCriteria criteria) {
		super();
		this.id = criteria.getId();
		idPattern = createPattern(id);

		this.name = criteria.getName();
		namePattern = createPattern(name);

		this.version = criteria.getVersion();

		this.domain = criteria.getDomain();
		domainPattern = createPattern(domain);

		tags.addAll(criteria.getTags());
		userInConcerns.addAll(criteria.getUserInConcerns());
		usedInConcerns.addAll(criteria.getUsedInConcerns());
		concerns.addAll(criteria.getConcerns());
	}

	private Pattern createPattern(String regex) {
		if (regex == null || "".equals(regex)) {
			return null;
		}
		return Pattern.compile(regex);
	}

	public boolean matchUserConcerns(Set<String> concerns) {
		if (concerns == null) {
			return this.userInConcerns.isEmpty();
		}
		for (String concern : this.userInConcerns) {
			if (!concerns.contains(concern)) {
				return false;
			}
		}
		return true;
	}

	public boolean matchUsedConcerns(Set<String> concerns) {
		if (concerns == null) {
			return this.usedInConcerns.isEmpty();
		}
		for (String concern : this.usedInConcerns) {
			if (!concerns.contains(concern)) {
				return false;
			}
		}
		return true;
	}

	public boolean internalMatchUsedConcerns(List<String> criteria, Set<String> concerns) {
		if (concerns == null) {
			return criteria.isEmpty();
		}
		for (String concern : criteria) {
			if (!concerns.contains(concern)) {
				return false;
			}
		}
		return true;
	}

	public boolean matchConcerns(Set<String> usedConcerns, Set<String> userConcerns) {
		if (!internalMatchUsedConcerns(this.userInConcerns, userConcerns)) {
			return false;
		}
		if (!internalMatchUsedConcerns(this.usedInConcerns, usedConcerns)) {
			return false;
		}
		if (concerns.isEmpty()) {
			return true;
		}
		Set<String> all = new HashSet<String>();
		if (userConcerns != null) {
			all.addAll(userConcerns);
		}
		if (usedConcerns != null) {
			all.addAll(usedConcerns);
		}
		return internalMatchUsedConcerns(this.concerns, all);
	}

	public boolean matchResource(Resource res) {
		if (isAlreadyMatched(res)) {
			return false;
		}
		if (idPattern != null && !idPattern.matcher(res.getId()).matches()) {
			return false;
		}
		if (namePattern != null && (res.getName() == null || !namePattern.matcher(res.getName()).matches())) {
			return false;
		}
		if (domainPattern != null && (res.getDomain() == null || !domainPattern.matcher(res.getDomain()).matches())) {
			return false;
		}
		if (version != null && !"".equals(version) && (res.getVersion() == null || !res.getVersion().equals(version))) {
			return false;
		}
		for (String tag : tags) {
			if (!res.getTags().contains(tag)) {
				return false;
			}
		}
		matchedIds.add(res.getId());
		return true;
	}

	private boolean isAlreadyMatched(Resource res) {
		return matchedIds.contains(res.getId());
	}
}
