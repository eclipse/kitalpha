/*******************************************************************************
 * Copyright (c) 2016, 2019 Thales Global Services S.A.S.
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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

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
import org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference;

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

	/**
	 * @deprecated replaced by getViewpointReferences()
	 */
	public Map<String, Version> getViewpointUsages() {
		return getViewpointReferences();
	}
	
	/**
	 * Gather all ViewpointReference objects accessible from this object.
	 * 
	 * @return a list of ViewpointReference objects 
	 */
	public List<ViewpointReference> getAllViewpointReferences() {
		List<ViewpointReference> result = new ArrayList<>();
		
		Metadata metadata = getMetadataStorage();

		for (Metadata meta : collectAdditionalMetadata(new ArrayList<Metadata>(), metadata)) {
			result.addAll(meta.getViewpointReferences());
		}

		return result;
	}
	
	private List<Metadata> collectAdditionalMetadata(List<Metadata> collector, Metadata metadata)
	{
		if (metadata != null)
		{
			// Breadth first search instead of depth first search: each node may hide its children.

			Queue<Metadata> toVisit = new LinkedList<>();  
			toVisit.add(metadata);
			while (!toVisit.isEmpty())
			{
				Metadata poll = toVisit.poll();
				if (poll == null)
					return collector;
				if (collector.contains(poll))
					continue;
				collector.add(poll);
				toVisit.addAll(poll.getAdditionalMetadata());
			}
		}	
		return collector;
	}
	
	/**
	 * Handle only ViewpointReference objects owned by this object.
	 * 
	 * @return a map: vpid <-> version 
	 */
	public Map<String, Version> getViewpointReferences() {
		Map<String, Version> id2version = new HashMap<String, Version>();
		if (context.getResources().isEmpty())
			return id2version;

		Metadata metadataStorage = getMetadataStorage();

		if (metadataStorage == null)
			return id2version;

		for (ViewpointReference usedViewpoint : metadataStorage.getViewpointReferences())
			id2version.put(usedViewpoint.getVpId(), usedViewpoint.getVersion());
		return id2version;
	}

	/**
	 * Get the version currently in use of the given viewpoint. The method will look among all accessible Metadata objects. 
	 * 
	 * @param vpResource
	 * @return a version or null if the viewpoint is not in use or has no version specified
	 */
	public Version getVersion(org.polarsys.kitalpha.resourcereuse.model.Resource vpResource) {
		Metadata metadata = getMetadataStorage();
		if (metadata == null)
			throw new IllegalStateException("cannot find metadata resource");

		for (Metadata meta : collectAdditionalMetadata(new ArrayList<Metadata>(), metadata)) {
			for (ViewpointReference uv : new ArrayList<ViewpointReference>(meta.getViewpointReferences())) {
				if (vpResource.getId().equals(uv.getVpId())) {
					return uv.getVersion();
				}
			}
		}

		return null;
	}

	public void updateVersion(org.polarsys.kitalpha.resourcereuse.model.Resource vpResource, Version version) {
		Metadata metadata = getMetadataStorage(true);

		for (ViewpointReference uv : new ArrayList<ViewpointReference>(metadata.getViewpointReferences())) {
			if (vpResource.getId().equals(uv.getVpId())) {
				uv.setVersion(version);
				return;
			}
		}
		setUsage(vpResource, version, true);
	}

	/**
	 * @deprecated replaced by reference() and unReference()
	 */
	public void setUsage(org.polarsys.kitalpha.resourcereuse.model.Resource vpResource, Version version, boolean usage) {
		if (usage)
			reference(vpResource, version);
		else
			unReference(vpResource);
	}
	
	public void reference(org.polarsys.kitalpha.resourcereuse.model.Resource vpResource, Version version) {
		Metadata metadata = getMetadataStorage(true);

		for (ViewpointReference uv : new ArrayList<ViewpointReference>(metadata.getViewpointReferences())) {
			if (vpResource.getId().equals(uv.getVpId())) {
				uv.setVersion(version);
				return; // object is already there, nothing to do
			}

		}
		ViewpointReference uv = MetadataFactory.eINSTANCE.createViewpointReference();
		uv.setId(EcoreUtil.generateUUID());
		uv.setInactive(false);
		uv.setVpId(vpResource.getId());
		uv.setVersion(version);
		metadata.getViewpointReferences().add(uv);
	}

	public void unReference(org.polarsys.kitalpha.resourcereuse.model.Resource vpResource) {
		Metadata metadata = getMetadataStorage(false);
		if (metadata != null) {
			for (ViewpointReference uv : new ArrayList<ViewpointReference>(metadata.getViewpointReferences())) {
				if (vpResource.getId().equals(uv.getVpId())) {
					metadata.getViewpointReferences().remove(uv);
				}
			}
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

	/**
	 * @deprecated replaced by setActivationSate(String id, boolean active)
	 */
	public void setFilter(String id, boolean filter) {
		setActivationSate(id, !filter);
	}
	
	public void setActivationSate(String id, boolean active) {
		Metadata metadata = getMetadataStorage(true);

		for (ViewpointReference uv : new ArrayList<ViewpointReference>(metadata.getViewpointReferences())) {
			if (id.equals(uv.getVpId())) {
				uv.setInactive(!active);
			}
		}
	}

	/**
	 * @deprecated replaced by isReferenced(String id)
	 */
	public boolean isInUse(String id) {
		return isReferenced(id);
	}
	
	public boolean isReferenced(String id) {
		Metadata metadata = getMetadataStorage();
		for (Metadata meta : collectAdditionalMetadata(new ArrayList<Metadata>(), metadata)) {
			for (ViewpointReference uv : meta.getViewpointReferences()) {
				if (id.equals(uv.getVpId()))
					return true;
			}
		}
		return false;
	}

	
	/**
	 * @deprecated replaced by isInactive(String id)
	 */
	public boolean isFiltered(String id) {
		return isInactive(id);
	}
	
	public boolean isInactive(String id) {
		Metadata metadata = getMetadataStorage();
		for (Metadata meta : collectAdditionalMetadata(new ArrayList<Metadata>(), metadata)) {
			for (ViewpointReference uv : meta.getViewpointReferences()) {
				if (id.equals(uv.getVpId()))
					return uv.isInactive();
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
		if (hasMetadata())
			return getMetadataStorage().eResource();
		return initMetadataStorage(getExpectedMetadataStorageURI());

	}

	public URI getExpectedMetadataStorageURI() {
		URI uri = context.getResources().get(0).getURI();
		return MetadataHelper.getExpectedMetadataStorageURI(uri);
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
		Metadata metadata = (Metadata) resource.getContents().get(0);
		return metadata;
	}

	private Resource getResource(String extension) {
		if (context.getResources().isEmpty())
			return null;
		for (Resource res : context.getResources()) {
			if (res.getURI().toString().endsWith(extension)) {
				return res;
			}
		}
		// None loaded, try to load an existing one
		URI uri = getExpectedMetadataStorageURI();
		try {
			if (context.getURIConverter().exists(uri, new HashMap<>())) {
				return context.getResource(uri, true);
			}
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
