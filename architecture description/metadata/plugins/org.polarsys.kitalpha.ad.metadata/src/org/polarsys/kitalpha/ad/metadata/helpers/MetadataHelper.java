/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.metadata.helpers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.polarsys.kitalpha.resourcereuse.emfscheme.helpers.ModelReuseHelper;

/**
 * @author Thomas Guiu
 * 
 */
public class MetadataHelper {
	private static final Map<ResourceSet, ViewpointMetadata> instances = new HashMap<>();

	public static ViewpointMetadata getViewpointMetadata(final ResourceSet context) {
		ViewpointMetadata result = instances.get(context);
		if (result == null) {
			instances.put(context, result = new ViewpointMetadata(context));
			context.eAdapters().add(new AdapterImpl() {

				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getEventType() == Notification.REMOVE && context.getResources().isEmpty())
						instances.remove(context);
				}

			});
		}
		return result;
	}

	public static boolean isMetadataResource(Resource resource) {
		return ViewpointMetadata.STORAGE_EXTENSION.equals(resource.getURI().fileExtension());

	}

	public static boolean isMetadataResource(IResource resource) {
		return ViewpointMetadata.STORAGE_EXTENSION.equals(resource.getFileExtension());

	}
	
	
	/**
	 * Create or update the metadata resource
	 * 
	 * @param modelResource
	 * @return null if the metadata resource already exists
	 */
	public static Resource initMetadata(Resource modelResource) {
		
		ResourceSet ctx = modelResource.getResourceSet();
		ViewpointMetadata metadata = getViewpointMetadata(ctx);
		Resource initMetadataStorage = metadata.initMetadataStorage();
		
		List<Contribution> contributions = Contribution.getContributions();
		
		for (Contribution contrib : contributions)
			contrib.preUpdate(ctx);
		
		for (Contribution contrib : contributions)
			contrib.update(ctx);
		
		for (Contribution contrib : contributions)
			contrib.postUpdate(ctx);
		
		return initMetadataStorage;
	}
	
	/**
	 * The method returns the expected path of the metadata resource for the given model
	 * 
	 * @param uri the uri of the model to consider
	 * @return
	 */

	public static URI getExpectedMetadataStorageURI(URI uri) {
		
		if (uri.isPlatformResource()) {
			String path = uri.toPlatformString(true);
			if (path.contains(".")) {
				int index = path.lastIndexOf('.');
				path = path.substring(0, index) + "." + ViewpointMetadata.STORAGE_EXTENSION;
			} else {
				path = path + "." + ViewpointMetadata.STORAGE_EXTENSION;
			}
			return URI.createPlatformResourceURI(path, true);
		}
		if (ModelReuseHelper.hasModelReuseScheme(uri)) {
			return ModelReuseHelper.createMetatadaURI(uri);
		}
		return uri.trimFileExtension().appendFileExtension(ViewpointMetadata.STORAGE_EXTENSION);
	}

	
}
