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
/**
 * 
 */
package org.polarsys.kitalpha.ad.common.utils;

import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.resourcereuse.model.Location;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class URIHelper {

	public static URI createURI(Resource vpResource) {
		return Location.WORSPACE.equals(vpResource.getProviderLocation()) ? URIFix.createPlatformResourceURI(vpResource.getPath(), false) : URIFix.createPlatformPluginURI(vpResource.getPath(), false);

	}

	private URIHelper() {
		super();
		
	}
	
}
