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
package org.polarsys.kitalpha.resourcereuse.registry;

import java.util.Set;

import org.polarsys.kitalpha.resourcereuse.model.Resource;


/**
 * @author Thomas Guiu
 * 
 */
public class PlatformRegistry extends ResourceRegistry {

	public PlatformRegistry() {
		super(null);

	}

	public void addResource(Resource resource, Set<String> userConcerns, Set<String> usedConcerns) {
		addResource(resource);
		if (userConcerns != null) {
			user2concern.put(resource.getId(), userConcerns);
		}
		if (usedConcerns != null) {
			used2concern.put(resource.getId(), usedConcerns);
		}
	}

}
