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
