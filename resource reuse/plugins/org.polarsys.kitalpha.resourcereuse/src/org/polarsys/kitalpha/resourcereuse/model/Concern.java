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
package org.polarsys.kitalpha.resourcereuse.model;

/**
 * @author Thomas Guiu
 * 
 */
public class Concern {
	private String name;
	// TODO we keep the resource id and resolve it later
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
