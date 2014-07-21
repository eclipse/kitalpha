/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.cs.text.resources;

import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;
/**
 * 
 * @author Amine Lajmi
 *
 */
public class AfdescResourceHelper {

	private AfdescResourceHelper() {}
	
	/**
	 * Get the available vpdsl-defined viewpoints
	 * @return
	 */
	public static org.polarsys.kitalpha.resourcereuse.model.Resource[] getViewpointResources() {
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setDomain("vpdsl");
		searchCriteria.getTags().add("vpdesc");
		return ResourceReuse.createHelper().getResources(searchCriteria);
	}
}
