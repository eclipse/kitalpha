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

package org.polarsys.kitalpha.ad.viewpoint.utils;

import java.util.HashMap;
import java.util.Map;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ModelManager;

/**
 * @author Thomas Guiu
 * 
 */
public class ModelAccessor {
	private final ModelManager modelManager;

	public ModelAccessor(ModelManager modelManager) {
		super();
		this.modelManager = modelManager;
	}

	public Rule resolveRule(String id) {
		for (ViewpointElement elt : modelManager.getRuleHandler().getElements()) {
			if (id.equals(elt.getId())){
				return (Rule) elt;
			}
		}
		return null;
	}

	public Map<String, Property> getProperties() {
		Map<String, Property> props = new HashMap<String, Property>();
		for (ViewpointElement elt : modelManager.getConfigurationHandler().getElements()) {
			Property prop = (Property) elt;
			props.put(prop.getName(), prop);
		}
		return props;
	}

}
