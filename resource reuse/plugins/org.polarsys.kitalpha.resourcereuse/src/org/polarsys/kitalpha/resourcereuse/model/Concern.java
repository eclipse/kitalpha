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
package org.polarsys.kitalpha.resourcereuse.model;

/**
 * @author Thomas Guiu
 * 
 */
public class Concern {
	private String name;
	// we keep the resource id and resolve it later
	private String userResourceId;
	private String usedResourceId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserResourceId() {
		return userResourceId;
	}

	public void setUserResourceId(String userResourceId) {
		this.userResourceId = userResourceId;
	}

	public String getUsedResourceId() {
		return usedResourceId;
	}

	public void setUsedResourceId(String usedResourceId) {
		this.usedResourceId = usedResourceId;
	}

}
