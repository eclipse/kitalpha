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

package org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.helpers;

import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * Class which can find all viewpoints of the platform
 * 
 * @author Faycal Abka
 */
public class ViewpointsSearcherHelper {
	
	private static final String VIEWPOINT_DOMAIN = "AF"; //$NON-NLS-1$
	private static final String VIEWPOINT_TAG	 = "vp"; //$NON-NLS-1$
	
	private static SearchCriteria criteria;
	
	
	private static void initCriteria(){
		criteria = new SearchCriteria();
		criteria.setDomain(VIEWPOINT_DOMAIN);
		criteria.getTags().add(VIEWPOINT_TAG);
	}
	
	public static Resource [] getAllViewpoints(){
		initCriteria();
		return ResourceReuse.createHelper().getResources(criteria);
	}
}
