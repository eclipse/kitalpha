/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.metadata.helpers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

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
}
