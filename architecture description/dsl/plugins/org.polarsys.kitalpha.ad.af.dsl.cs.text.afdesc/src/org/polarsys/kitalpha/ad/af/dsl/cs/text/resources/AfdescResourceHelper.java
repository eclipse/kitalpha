/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.cs.text.resources;

import org.eclipse.emf.common.util.URI;
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
	
	/**
	 * Copied from {@link org.polarsys.kitalpha.ad.common.utils.URIFix}
	 */
	public static class URIFix {

		public static URI createPlatformPluginURI(String path, boolean encode) {
			return createURI("platform:/plugin/", path);
		}

		public static URI createPlatformResourceURI(String path, boolean encode) {
			return createURI("platform:/resource/", path);
		}

		private static URI createURI(String prefix, String path) {
			String uri = prefix;
			if (path.startsWith("/"))
			{
				uri += path.substring(1);
			}
			else
			{
				uri += path;
			}
			return URI.createURI(uri);
		}

	}
}
