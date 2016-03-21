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
import org.osgi.framework.Version;
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

	public Map<String, Version> getViewpointUsages() {
		Map<String, Version> id2version = new HashMap<String, Version>();
		Metadata metadataStorage = getMetadataStorage();

		if (metadataStorage == null)
			return id2version;
			
		for (ViewpointUsage usedViewpoint : metadataStorage.getViewpointUsages()) 
			id2version.put(usedViewpoint.getVpId(), usedViewpoint.getVersion());
		return id2version;
	}
	
	public void updateVersion(org.polarsys.kitalpha.resourcereuse.model.Resource vpResource, Version version) {
		Metadata metadata = getMetadataStorage();
		if (metadata == null)
			throw new UnsupportedOperationException("cannot find integration resource");
		TransactionalEditingDomain transactionalEditingDomain = TransactionUtil.getEditingDomain(context);
		UpdateViewpointVersionCommand command = new UpdateViewpointVersionCommand(transactionalEditingDomain, metadata, vpResource, version);
		if (transactionalEditingDomain != null) 
			transactionalEditingDomain.getCommandStack().execute(command);
		 else
			 command.execute();
	}

	public void setUsage(org.polarsys.kitalpha.resourcereuse.model.Resource vpResource, Version version, boolean usage) {
		Metadata metadata = getMetadataStorage();
		if (metadata == null)
			throw new UnsupportedOperationException("cannot find integration resource");
		TransactionalEditingDomain transactionalEditingDomain = TransactionUtil.getEditingDomain(context);
		SetViewpointUsageCommand command = new SetViewpointUsageCommand(transactionalEditingDomain, metadata, vpResource, version, usage);
		
		if (transactionalEditingDomain != null) 
			transactionalEditingDomain.getCommandStack().execute(command);
		 else
			command.execute();
		
	}

	public void setFilter(String id, boolean filter) {
		Metadata metadata = getMetadataStorage();
		if (metadata == null)
			throw new UnsupportedOperationException("cannot find integration resource");
		TransactionalEditingDomain transactionalEditingDomain = TransactionUtil.getEditingDomain(context);
		SetViewpointFilterCommand command = new SetViewpointFilterCommand(transactionalEditingDomain, metadata, id, filter);
		if (transactionalEditingDomain != null) 
			transactionalEditingDomain.getCommandStack().execute(command);
		 else
			 command.execute();
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
	}
}
