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
 ******************************************************************************/

package org.polarsys.kitalpha.ad.ta.helper;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author Boubekeur Zendagui
 */

public class SemanticResourceLoder {
	
	public enum LoadingPreferences{
		LoadByNsUri, LoadByPlatformUri;
	}
	
	/**
	 * Load target application semantic resource in the ResourceSet given by parameter set
	 * @param taName Target application name
	 * @param resourceSet à {@link ResourceSet} wherein target application resources will be loaded
	 */
	@Deprecated
	public static void loadSemanticResources(String taName, ResourceSet resourceSet, LoadingPreferences perference){
		// Get target application NsUri list
		switch (perference) {
		case LoadByNsUri:
			// TODO: implement this case
			throw new UnsupportedOperationException("Target application resouse loading by using NsUri is not supported");
		case LoadByPlatformUri:
			loadSemanticPlatformResources(taName, resourceSet);
			break;
		}
	}
	
	@Deprecated
	private static void loadSemanticPlatformResources(String taName, ResourceSet set){
		List<URI> uriList = null;
		for (URI uri : uriList) 
		{
			Resource resource = set.getResource(uri, true);
			if (null != resource) {
				set.getResources().add(resource);
			}
		}

	}
	
	
}
