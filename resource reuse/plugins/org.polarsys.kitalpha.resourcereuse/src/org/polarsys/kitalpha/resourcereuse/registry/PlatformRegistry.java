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
