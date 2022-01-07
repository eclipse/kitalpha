/*******************************************************************************
 * Copyright (c) 2014, 2022 Thales Global Services S.A.S.
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.core.runtime.spi.RegistryContributor;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.polarsys.kitalpha.resourcereuse.model.Location;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * An implementation of the {@link ModelBasedReader} focusing on retrieving information focused on Platform bundles
 * only.
 * 
 * @author Thomas Guiu
 * @author <a href="mailto:arnaud.dieumegard@obeo.fr">Arnaud Dieumegard</a>
 * 
 */
public class TargetPlatformReader extends ModelBasedReader {
    
    private List<String> clearedBundles = new ArrayList<String>();

    @Override
    /*
     * In this implementation we override readResources and thus do not need the content of the getModels method. The
     * ModelBasedReader signature may need to be updated to allow to remove this method.
     */
    protected IPluginModelBase[] getModels() {
        return new IPluginModelBase[0];
    }

    @Override
    public ResourceRegistry readResources(ResourceRegistry parent) {
        registry = new ModelBasedRegistry(parent, this);
        // Ensure clearedBundles list is cleaned
        clearedBundles.clear();
        IExtensionRegistry extensionRegistry = RegistryFactory.getRegistry();

        for (IConfigurationElement confElement : extensionRegistry.getConfigurationElementsFor(CONCERN_EXTENSION_ID)) {
            String bundleName = getBundleName(confElement);
            String concernName = confElement.getAttribute("name");
            String user = confElement.getAttribute("userResourceId");
            String used = confElement.getAttribute("usedResourceId");

            // Only clear once a bundle content in the registry
            if (!clearedBundles.contains(bundleName)) {
                registry.clear(bundleName);
                clearedBundles.add(bundleName);
            }
            registry.addConcern(bundleName, concernName, user, used);
        }
        for (IConfigurationElement confElement : extensionRegistry.getConfigurationElementsFor(RESOURCE_EXTENSION_ID)) {
            String bundleName = getBundleName(confElement);
            Resource res = createResource(confElement);

            // Only clear once a bundle content in the registry
            if (!clearedBundles.contains(bundleName)) {
                registry.clear(bundleName);
                clearedBundles.add(bundleName);
            }
            registry.addResource(bundleName, res);
        }

        // Clean cleared bundles
        clearedBundles.clear();
        return registry;
    }

    private String getBundleName(IConfigurationElement confElement) {
        IExtension declaringExtension = confElement.getDeclaringExtension();
        IContributor contributor = declaringExtension.getContributor();
        
        String bundleName;
        if (contributor instanceof RegistryContributor) {
            bundleName = ((RegistryContributor)contributor).getActualName();
        } else {
            bundleName = contributor.getName();
        }
        return bundleName;
    }

    private Resource createResource(IConfigurationElement confElement) {
        Resource res = new Resource();
        String symbolicName = getBundleName(confElement);
        res.setProviderSymbolicName(symbolicName);
        res.setProviderLocation(getLocation());

        String id = confElement.getAttribute("id");
        if (id != null) {
            res.setId(id);
        }
        String name = confElement.getAttribute("name");
        if (name != null) {
            res.setName(name.trim());
        }
        String weight = confElement.getAttribute("weight");
        if (weight != null) {
            res.setWeight(Integer.parseInt(weight));
        }
        String domain = confElement.getAttribute("domain");
        if (domain != null) {
            res.setDomain(domain.trim());
        }
        String description = confElement.getAttribute("description");
        if (description != null) {
            res.setDescription(description.trim());
        }
        String version = confElement.getAttribute("version");
        if (version != null) {
            res.setVersion(version.trim());
        }
        String path = confElement.getAttribute("path");
        if (path != null) {
            res.setPath(path.trim());
        }
        String metadata = confElement.getAttribute("metadata");
        if (metadata != null) {
            res.setMetadataPath(metadata.trim());
        }
        String tags = confElement.getAttribute("tags");
        if (tags != null) {
            for (String tag : tags.split(",")) {
                res.getTags().add(tag.trim());
            }
        }
        return res;
    }

    @Override
    protected Location getLocation() {
        return Location.TARGET;
    }

}
