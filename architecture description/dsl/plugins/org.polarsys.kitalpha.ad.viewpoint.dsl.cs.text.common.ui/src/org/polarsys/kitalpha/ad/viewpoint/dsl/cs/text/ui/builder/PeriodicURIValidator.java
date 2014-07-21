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

import org.eclipse.core.resources.IStorage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.resource.IResourceUIServiceProvider;
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
	
	public boolean isValid(URI uri, IStorage storage) {
		if (uri==null)
			return false;
		IResourceServiceProvider resourceServiceProvider = null;
		//handle periodic file extensions
		if (ResourceHelper.hasPeriodicFileExtension(uri)) {
			Map<String, Object> extensionToFactoryMap = registry.getExtensionToFactoryMap();
			resourceServiceProvider = ResourceHelper.getServiceProvider(uri, extensionToFactoryMap, ResourceHelper.getFileExtension(uri));
		} else {
			resourceServiceProvider = registry.getResourceServiceProvider(uri);
		}			
		if (resourceServiceProvider!=null) {
			if (resourceServiceProvider instanceof IResourceUIServiceProvider) {
				return ((IResourceUIServiceProvider) resourceServiceProvider).canHandle(uri, storage);
			} else {
				return resourceServiceProvider.canHandle(uri);
			}
		}
		return false;
	}
}
