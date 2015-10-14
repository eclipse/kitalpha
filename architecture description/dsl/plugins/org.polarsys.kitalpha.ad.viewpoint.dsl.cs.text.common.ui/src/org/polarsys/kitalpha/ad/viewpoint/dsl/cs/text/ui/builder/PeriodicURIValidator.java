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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.resource.IResourceUIServiceProvider;
import org.eclipse.xtext.ui.resource.IResourceUIServiceProviderExtension;
import org.eclipse.xtext.ui.resource.UriValidator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;

import com.google.inject.Inject;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class PeriodicURIValidator extends UriValidator {

	@Inject
	private IResourceServiceProvider.Registry registry;
	
	@Override
	public boolean isValid(URI uri, IStorage storage) {
		if (uri==null)
			return false;
		
		IResourceServiceProvider resourceServiceProvider = getResourceServiceProvider(uri);
		
		if (resourceServiceProvider!=null) {
			if (resourceServiceProvider instanceof IResourceUIServiceProvider) {
				return ((IResourceUIServiceProvider) resourceServiceProvider).canHandle(uri, storage);
			} else {
				return resourceServiceProvider.canHandle(uri);
			}
		}
		return false;
	}
	
	public boolean canBuild(URI uri, IStorage storage) {
		if (uri == null)
			return false;
		
		IResourceServiceProvider resourceServiceProvider = getResourceServiceProvider(uri);
		
		if (resourceServiceProvider != null) {
			if (resourceServiceProvider instanceof IResourceUIServiceProviderExtension) {
				return ((IResourceUIServiceProviderExtension) resourceServiceProvider).canBuild(uri, storage);
			} else if (resourceServiceProvider instanceof IResourceUIServiceProvider) {
				return ((IResourceUIServiceProvider) resourceServiceProvider).canHandle(uri, storage);
			} else {
				return resourceServiceProvider.canHandle(uri);
			}
		}
		return false;
	}
	
	private IResourceServiceProvider getResourceServiceProvider(URI uri)
	{
		if (ResourceHelper.hasPeriodicFileExtension(uri))
		{
			Map<String, Object> extensionToFactoryMap = registry.getExtensionToFactoryMap();
			return ResourceHelper.getServiceProvider(uri, extensionToFactoryMap, ResourceHelper.getFileExtension(uri));
		}
		else
		{
			return registry.getResourceServiceProvider(uri);
		}
	}
	
	@Override
	public boolean isPossiblyManaged(IStorage storage) {
		if (!registry.getContentTypeToFactoryMap().isEmpty())
			return true;
		
		String name = storage.getName();
		if (name == null) {
			return true;
		}
		name = URI.encodeSegment(name, true); 
		int index = name.indexOf('.');
		if (index == -1) {
			return true;
		}
		return registry.getExtensionToFactoryMap().containsKey(name.substring(index + 1));
	}
}
