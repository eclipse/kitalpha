/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.registry;

import org.eclipse.pde.core.plugin.IExtensions;
import org.eclipse.pde.core.plugin.IPluginAttribute;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginObject;
import org.polarsys.kitalpha.resourcereuse.helper.Constants;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReader;
import org.polarsys.kitalpha.resourcereuse.model.Location;
import org.polarsys.kitalpha.resourcereuse.model.Resource;


/**
 * @author Thomas Guiu
 * 
 */
public abstract class ModelBasedReader implements Constants, ResourceReader {

	protected ModelBasedRegistry registry;

	private Resource createResource(IPluginElement element) {
		Resource res = new Resource();
		String symbolicName = element.getPluginModel().getBundleDescription().getSymbolicName();
		res.setProviderSymbolicName(symbolicName);
		res.setProviderLocation(getLocation());
		IPluginAttribute attribute = element.getAttribute("id");
		if (attribute != null) {
			res.setId(attribute.getValue().trim());
		}
		attribute = element.getAttribute("name");
		if (attribute != null) {
			res.setName(attribute.getValue().trim());
		}
		attribute = element.getAttribute("weight");
		if (attribute != null) {
			res.setWeight(Integer.parseInt(attribute.getValue()));
		}
		attribute = element.getAttribute("domain");
		if (attribute != null) {
			res.setDomain(attribute.getValue().trim());
		}
		attribute = element.getAttribute("description");
		if (attribute != null) {
			res.setDescription(attribute.getValue().trim());
		}
		attribute = element.getAttribute("version");
		if (attribute != null) {
			res.setVersion(attribute.getValue().trim());
		}
		attribute = element.getAttribute("path");
		if (attribute != null) {
			res.setPath(attribute.getValue().trim());
		}
		attribute = element.getAttribute("metadata");
		if (attribute != null) {
			res.setMetadataPath(attribute.getValue().trim());
		}
		attribute = element.getAttribute("tags");
		if (attribute != null) {
			String tags = attribute.getValue();
			for (String tag : tags.split(",")) {
				res.getTags().add(tag.trim());
			}
		}
		return res;
	}

	protected abstract Location getLocation();

	protected void handleExtensions(IExtensions extensions) {
		String bundleId = extensions.getPluginBase().getId();
		registry.clear(bundleId);
		for (IPluginExtension extension : extensions.getExtensions()) {
			handleExtension(extension);
		}
	}

	private void handleExtension(IPluginExtension extension) {
		String bundleId = extension.getPluginBase().getId();
		for (IPluginObject obj : extension.getChildren()) {
			if (CONCERN_EXTENSION_ID.equals(extension.getPoint()) && obj instanceof IPluginElement) {
				IPluginElement element = (IPluginElement) obj;
				String concernName = element.getAttribute("name").getValue();
				String user = element.getAttribute("userResourceId").getValue();
				String used = element.getAttribute("usedResourceId").getValue();
				registry.addConcern(bundleId, concernName, user, used);
			} else if (RESOURCE_EXTENSION_ID.equals(extension.getPoint()) && obj instanceof IPluginElement) {
				IPluginElement elem = (IPluginElement) obj;
				Resource res = createResource(elem);
				registry.addResource(bundleId, res);
			}
		}
	}

	@Override
	public ResourceRegistry readResources(ResourceRegistry parent) {
		registry = new ModelBasedRegistry(parent, this);
		for (IPluginModelBase model : getModels()) {
			handleExtensions(model.getExtensions());
		}
		return registry;
	}

	protected abstract IPluginModelBase[] getModels();

}