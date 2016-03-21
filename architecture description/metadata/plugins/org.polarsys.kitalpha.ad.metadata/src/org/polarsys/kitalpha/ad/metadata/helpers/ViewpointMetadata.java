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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.polarsys.kitalpha.ad.metadata.commands.SetViewpointFilterCommand;
import org.polarsys.kitalpha.ad.metadata.commands.SetViewpointUsageCommand;
import org.polarsys.kitalpha.ad.metadata.commands.UpdateViewpointVersionCommand;
import org.polarsys.kitalpha.ad.metadata.metadata.Metadata;
import org.polarsys.kitalpha.ad.metadata.metadata.MetadataFactory;
import org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointMetadata {

	public static final String STORAGE_EXTENSION = "afm";

	private final ResourceSet context;
	
	public ViewpointMetadata(ResourceSet context) {
		this.context = context;
	}

	public Map<String, String> getViewpointUsages() {
		Map<String, String> id2version = new HashMap<String, String>();
		Metadata metadataStorage = getMetadataStorage();

		if (metadataStorage == null)
			return id2version;
			
		for (ViewpointUsage usedViewpoint : metadataStorage.getViewpointUsages()) 
			id2version.put(usedViewpoint.getVpId(), usedViewpoint.getVersion());
		return id2version;
	}
	
	public void updateVersion(org.polarsys.kitalpha.resourcereuse.model.Resource vpResource) {
		Metadata metadata = getMetadataStorage();
		if (metadata == null)
			throw new UnsupportedOperationException("cannot find integration resource");
		TransactionalEditingDomain transactionalEditingDomain = TransactionUtil.getEditingDomain(context);
		if (transactionalEditingDomain != null) {
			transactionalEditingDomain.getCommandStack().execute(new UpdateViewpointVersionCommand(transactionalEditingDomain, metadata, vpResource));
		} else {
			for (ViewpointUsage uv : new ArrayList<ViewpointUsage>(metadata.getViewpointUsages())) {
				if (vpResource.getId().equals(uv.getVpId())) {
					uv.setVersion(vpResource.getVersion());
					return ;
				}
			}
		}
	}

	public void setUsage(org.polarsys.kitalpha.resourcereuse.model.Resource vpResource, boolean usage) {
		Metadata metadata = getMetadataStorage();
		if (metadata == null)
			throw new UnsupportedOperationException("cannot find integration resource");
		TransactionalEditingDomain transactionalEditingDomain = TransactionUtil.getEditingDomain(context);
		if (transactionalEditingDomain != null) {
			transactionalEditingDomain.getCommandStack().execute(new SetViewpointUsageCommand(transactionalEditingDomain, metadata, vpResource, usage));
		} else {
			for (ViewpointUsage uv : new ArrayList<ViewpointUsage>(metadata.getViewpointUsages())) {
				if (vpResource.getId().equals(uv.getVpId())) {
					if (usage)
						return; // object is already there, nothing to do
					metadata.getViewpointUsages().remove(uv);
				}
			}
			if (usage) {
				ViewpointUsage uv = MetadataFactory.eINSTANCE.createViewpointUsage();
				uv.setFiltered(false);
				uv.setVpId(vpResource.getId());
				uv.setVersion(vpResource.getVersion());
				metadata.getViewpointUsages().add(uv);
			}

		}
	}

	public void setFilter(String id, boolean filter) {
		Metadata metadata = getMetadataStorage();
		if (metadata == null)
			throw new UnsupportedOperationException("cannot find integration resource");
		TransactionalEditingDomain transactionalEditingDomain = TransactionUtil.getEditingDomain(context);
		if (transactionalEditingDomain != null) {
			transactionalEditingDomain.getCommandStack().execute(new SetViewpointFilterCommand(transactionalEditingDomain, metadata, id, filter));
		} else {
			for (ViewpointUsage uv : new ArrayList<ViewpointUsage>(metadata.getViewpointUsages())) {
				if (id.equals(uv.getVpId())) {
					uv.setFiltered(filter);
				}
			}
		}
	}

	public boolean isInUse(String id) {
		Metadata integ = getMetadataStorage();
		if (integ != null) {
			for (ViewpointUsage uv : integ.getViewpointUsages()) {
				if (id.equals(uv.getVpId()))
					return true;
			}
		}
		return false;
	}

	public boolean isFiltered(String id) {
		Metadata integ = getMetadataStorage();
		if (integ != null) {
			for (ViewpointUsage uv : integ.getViewpointUsages()) {
				if (id.equals(uv.getVpId()))
					return uv.isFiltered();
			}
		}
		return false;
	}

	public Resource initMetadataStorage() {
		URI uri = getMetadataStorageURI();
		try {
			context.getResource(uri, true);
		}catch ( Exception e) {
			return createMetadataStorage(uri);
		}
		return null;
	}

	private Resource createMetadataStorage(URI uri) {
		// delete proxy resource.
		Resource resource = context.getResource(uri, false);
		if (resource != null && resource.getContents().isEmpty()) {
			resource.unload();
			context.getResources().remove(resource);
		}
		resource = context.createResource(uri);
		Metadata integration = MetadataFactory.eINSTANCE.createMetadata();
		//TODO init the integration object
		context.getResources().add(resource);
		resource.getContents().add(integration);
		return resource;
	}

	private URI getMetadataStorageURI() {
		URI uri = context.getResources().get(0).getURI();
		String path = uri.toPlatformString(true);
		if (path.contains(".")) {
			int index = path.lastIndexOf('.');
			path = path.substring(0, index) + "." + STORAGE_EXTENSION;
		}
		uri = URI.createPlatformResourceURI(path, true);
		return uri;
	}

	protected Metadata getMetadataStorage() {
		Resource resource = getResource(STORAGE_EXTENSION);
		if (resource == null )
			return null;
		Metadata integ = (Metadata) resource.getContents().get(0);
		if (integ == null)
			throw new IllegalStateException("can't find integration resource");
		return integ;
	}

	private Resource getResource(String extension) {
		for (Resource res : context.getResources()) {
			if (res.getURI().toString().endsWith(extension)) {
				return res;
			}
		}
		// No luck, create one
		URI uri = getMetadataStorageURI();
		try {
			return context.getResource(uri, true);
		} catch (Exception e) {
			// clean proxy resource
			Resource resource = context.getResource(uri, false);
			if (resource != null && resource.getContents().isEmpty()) {
				resource.unload();
				context.getResources().remove(resource);
			}
		}
		return null;
//		return createMetadataStorage(resourceSet, uri);
	}
}
