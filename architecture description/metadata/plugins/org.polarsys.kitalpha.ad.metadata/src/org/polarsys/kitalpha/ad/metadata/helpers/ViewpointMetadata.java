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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.metadata.commands.CreateMetadataResourceCommand;
import org.polarsys.kitalpha.ad.metadata.commands.MetadataCommand;
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
		if (context.getResources().isEmpty())
			return id2version;

		Metadata metadataStorage = getMetadataStorage();

		if (metadataStorage == null)
			return id2version;

		for (ViewpointUsage usedViewpoint : metadataStorage.getViewpointUsages())
			id2version.put(usedViewpoint.getVpId(), usedViewpoint.getVersion());
		return id2version;
	}

	public Version getVersion(org.polarsys.kitalpha.resourcereuse.model.Resource vpResource) {
		Metadata metadata = getMetadataStorage();
		if (metadata == null)
			throw new IllegalStateException("cannot find metadata resource");

		for (ViewpointUsage uv : new ArrayList<ViewpointUsage>(metadata.getViewpointUsages())) {
			if (vpResource.getId().equals(uv.getVpId())) {
				return uv.getVersion();
			}
		}
		return null;
	}

	public void updateVersion(org.polarsys.kitalpha.resourcereuse.model.Resource vpResource, Version version) {
		Metadata metadata = getMetadataStorage(true);

		for (ViewpointUsage uv : new ArrayList<ViewpointUsage>(metadata.getViewpointUsages())) {
			if (vpResource.getId().equals(uv.getVpId())) {
				uv.setVersion(version);
				return;
			}
		}
		setUsage(vpResource, version, true);

	}

	public void setUsage(org.polarsys.kitalpha.resourcereuse.model.Resource vpResource, Version version,
			boolean usage) {
		Metadata metadata = getMetadataStorage(true);

		for (ViewpointUsage uv : new ArrayList<ViewpointUsage>(metadata.getViewpointUsages())) {
			if (vpResource.getId().equals(uv.getVpId())) {
				if (usage)
					return; // object is already there, nothing to do
				metadata.getViewpointUsages().remove(uv);
			}

		}
		if (usage) {
			ViewpointUsage uv = MetadataFactory.eINSTANCE.createViewpointUsage();
			uv.setId(EcoreUtil.generateUUID());
			uv.setFiltered(false);
			uv.setVpId(vpResource.getId());
			uv.setVersion(version);
			metadata.getViewpointUsages().add(uv);
		}
	}

	private void executeCommandInTransaction(MetadataCommand command) {
		EditingDomain editingDomain = TransactionUtil.getEditingDomain(context);
		if (editingDomain == null && context instanceof IEditingDomainProvider)
			editingDomain = ((IEditingDomainProvider) context).getEditingDomain();

		if (editingDomain == null)
			command.execute();
		else
			editingDomain.getCommandStack().execute(command);
	}

	public void setFilter(String id, boolean filter) {
		Metadata metadata = getMetadataStorage(true);

		for (ViewpointUsage uv : new ArrayList<ViewpointUsage>(metadata.getViewpointUsages())) {
			if (id.equals(uv.getVpId())) {
				uv.setFiltered(filter);
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

	public Resource initMetadataStorage(URI location) {
		CreateMetadataResourceCommand command = new CreateMetadataResourceCommand(context, location);
		executeCommandInTransaction(command);
		return command.getMetadataResource();
	}

	/**
	 * Used by generated editors
	 * 
	 * @return
	 */
	public Resource initMetadataStorage() {
		return initMetadataStorage(getExpectedMetadataStorageURI());

	}

	public URI getExpectedMetadataStorageURI() {
		URI uri = context.getResources().get(0).getURI();
		String path = uri.toPlatformString(true);
		if (path.contains(".")) {
			int index = path.lastIndexOf('.');
			path = path.substring(0, index) + "." + STORAGE_EXTENSION;
		}
		uri = URI.createPlatformResourceURI(path, true);
		return uri;
	}

	public boolean hasMetadata() {
		return getMetadataStorage() != null;
	}

	protected Metadata getMetadataStorage() {
		return getMetadataStorage(false);
	}

	protected Metadata getMetadataStorage(boolean create) {
		Resource resource = getResource(STORAGE_EXTENSION);
		if (create && resource == null)
			resource = initMetadataStorage();
		if (resource == null)
			return null;
		if (resource.getContents().isEmpty())
			return null;
		Metadata integ = (Metadata) resource.getContents().get(0);
		return integ;
	}

	private Resource getResource(String extension) {
		for (Resource res : context.getResources()) {
			if (res.getURI().toString().endsWith(extension)) {
				return res;
			}
		}
		// None loaded, try to load an existing one
		URI uri = getExpectedMetadataStorageURI();
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
