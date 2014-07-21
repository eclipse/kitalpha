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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.builder;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.builder.clustering.ClusteringBuilderState;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;

import com.google.inject.Inject;

/**
 * 
 * @author Amine Lajmi
 *
 */
@SuppressWarnings("restriction")
public class PeriodicClusteringBuilderState extends ClusteringBuilderState {

    @Inject
    private IResourceServiceProvider.Registry managerRegistry;
    
    /**
     * Adds a resource to the ResourceSet if the ResourceSet doesn't contain it yet.
     *
     * @param resource the resource
     * @param resourceSet the resource set
     * @return the resource
     */
	@Override
    protected Resource addResource(Resource resource, ResourceSet resourceSet) {
        URI uri = resource.getURI();
        Resource r = resourceSet.getResource(uri, false);
        if (r == null) {
            resourceSet.getResources().add(resource);
            return resource;
        } else {
            return r;
        }
    }
	
	@Override	
	protected IResourceDescription.Manager getResourceDescriptionManager(URI uri) {
		//handle periodic file extensions
		if (ResourceHelper.hasPeriodicFileExtension(uri)) {
			Map<String, Object> extensionToFactoryMap = managerRegistry.getExtensionToFactoryMap();
			IResourceServiceProvider resourceServiceProvider = ResourceHelper.getServiceProvider(uri, extensionToFactoryMap, ResourceHelper.getFileExtension(uri));
			return resourceServiceProvider != null ? resourceServiceProvider.getResourceDescriptionManager() : null;
		} else {
	        IResourceServiceProvider resourceServiceProvider = managerRegistry.getResourceServiceProvider(uri);
	        if (resourceServiceProvider == null) {
	            return null;
	        }
	        return resourceServiceProvider.getResourceDescriptionManager();
		}
	}
}
