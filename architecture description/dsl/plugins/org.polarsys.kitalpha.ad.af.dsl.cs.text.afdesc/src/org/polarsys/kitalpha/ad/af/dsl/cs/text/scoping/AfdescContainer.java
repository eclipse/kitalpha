/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/


package org.polarsys.kitalpha.ad.af.dsl.cs.text.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.IContainerState;
import org.eclipse.xtext.resource.containers.StateBasedContainer;
import org.polarsys.kitalpha.ad.af.dsl.cs.text.resources.AfdescResourceHelper;
import org.polarsys.kitalpha.resourcereuse.model.Location;

/**
 * 
 * @author Amine Lajmi
 *         Faycal Abka
 *
 */
public class AfdescContainer extends StateBasedContainer {

	public AfdescContainer(IResourceDescriptions descriptions, IContainerState state) {
		super(descriptions, state);
	}

	public List<URI> getHandles() {
		List<URI> resourceURIs = new ArrayList<URI>();
		org.polarsys.kitalpha.resourcereuse.model.Resource[] resources = AfdescResourceHelper.getViewpointResources();
		for (org.polarsys.kitalpha.resourcereuse.model.Resource r: resources) {
			URI uri = null;
			if (r.getProviderLocation().equals(Location.WORSPACE)) {
				uri = AfdescResourceHelper.URIFix.createPlatformResourceURI(r.getPath(), false);
			} else {
				uri = AfdescResourceHelper.URIFix.createPlatformPluginURI(r.getPath(), false);
			}
			resourceURIs.add(uri);
		}
		return resourceURIs;	
	}
}
