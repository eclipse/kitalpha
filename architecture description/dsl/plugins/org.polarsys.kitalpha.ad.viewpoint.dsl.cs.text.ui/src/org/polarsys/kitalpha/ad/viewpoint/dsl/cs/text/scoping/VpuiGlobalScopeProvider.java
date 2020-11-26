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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.MultimapBasedScope;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpuiGlobalScopeProvider extends DefaultGlobalScopeProvider {

	@Inject
	IResourceServiceProvider.Registry registry;
	
	@Inject
	IResourceDescription.Manager descriptionManager;
	
	@Override
	protected IScope getScope(IScope parent, final Resource context, boolean ignoreCase, EClass type, Predicate<IEObjectDescription> filter) {	
		Iterable<IEObjectDescription> exportedObjects = Collections.emptyList();
		IScope result = parent;
		List<IContainer> containers = getVisibleContainers(context);
		Iterator<IContainer> iter = containers.iterator();
		while (iter.hasNext()) {
			IContainer container = iter.next();
			if (container instanceof VpuiContainer) {
				result = createVpuiContainerScope(context, result, container, filter, type, ignoreCase);
			}
		}
		return MultimapBasedScope.createScope(result, exportedObjects, ignoreCase);	
	}

	protected IScope createVpuiContainerScope(Resource eResource, IScope parent, IContainer container, Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase) {
		Iterable<IEObjectDescription> exportedObjects = Collections.emptyList();		
		ResourceSet resourceSet = eResource.getResourceSet();
		exportedObjects = getAspectObjectDescriptions(resourceSet, exportedObjects, FileExtension.DATA_EXTENSION);
		return MultimapBasedScope.createScope(parent, exportedObjects, ignoreCase);	
	}
	
	private Iterable<IEObjectDescription> getAspectObjectDescriptions(ResourceSet resourceSet, Iterable<IEObjectDescription> exportedObjects, String extension) {	
		List<URI> secondaryResources = ResourceHelper.getSecondaryResourceURIsByExtension(extension);
		for (URI uri: secondaryResources) {
			Resource referencedResource = ResourceHelper.loadResource(uri, resourceSet);
			if (referencedResource!=null) {
				IResourceDescription.Manager manager = getResourceDescriptionManager(uri);
				IResourceDescription description = manager.getResourceDescription(referencedResource);
				exportedObjects = Iterables.concat(exportedObjects, description.getExportedObjects());
			}
		}
		return exportedObjects;
	}
	
	private IResourceDescription.Manager getResourceDescriptionManager(URI uri) {
		if (ResourceHelper.hasPeriodicFileExtension(uri)) {
			Map<String, Object> extensionToFactoryMap = registry.getExtensionToFactoryMap();
			IResourceServiceProvider resourceServiceProvider = ResourceHelper.getServiceProvider(uri, extensionToFactoryMap, ResourceHelper.getFileExtension(uri));
			return resourceServiceProvider != null ? resourceServiceProvider.getResourceDescriptionManager() : null;
		}
		return descriptionManager;
	}
}
