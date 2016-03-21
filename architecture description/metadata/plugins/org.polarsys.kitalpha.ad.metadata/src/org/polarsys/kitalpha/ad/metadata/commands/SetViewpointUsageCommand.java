/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.metadata.commands;

import java.util.ArrayList;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.metadata.metadata.Metadata;
import org.polarsys.kitalpha.ad.metadata.metadata.MetadataFactory;
import org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class SetViewpointUsageCommand extends RecordingCommand {

	private Metadata metadata;
	private Resource vpResource;
	private boolean usage;
	private Version version;

	public SetViewpointUsageCommand(TransactionalEditingDomain domain, Metadata integration, Resource resource, Version version, boolean usage) {
		super(domain);
		this.metadata = integration;
		this.vpResource = resource;
		this.version = version;
		this.usage = usage;
	}

	@Override
	protected void doExecute() {
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
			uv.setVersion(version);
			metadata.getViewpointUsages().add(uv);
		}

	}

}
