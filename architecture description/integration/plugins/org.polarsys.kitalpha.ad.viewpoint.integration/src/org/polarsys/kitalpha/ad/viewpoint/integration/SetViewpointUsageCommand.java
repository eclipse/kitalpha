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
package org.polarsys.kitalpha.ad.viewpoint.integration;

import java.util.ArrayList;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.Integration;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.IntegrationFactory;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class SetViewpointUsageCommand extends RecordingCommand {

	private Integration integration;
	private Resource vpResource;
	private boolean usage;

	public SetViewpointUsageCommand(TransactionalEditingDomain domain, Integration integration, Resource resource, boolean usage) {
		super(domain);
		this.integration = integration;
		this.vpResource = resource;
		this.usage = usage;
	}

	@Override
	protected void doExecute() {
		for (UsedViewpoint uv : new ArrayList<UsedViewpoint>(integration.getUsedViewpoints())) {
			if (vpResource.getId().equals(uv.getVpId())) {
				if (usage)
					return; // object is already there, nothing to do
				integration.getUsedViewpoints().remove(uv);
			}

		}
		if (usage) {
			UsedViewpoint uv = IntegrationFactory.eINSTANCE.createUsedViewpoint();
			uv.setFiltered(false);
			uv.setVpId(vpResource.getId());
			uv.setVersion(vpResource.getVersion());
			integration.getUsedViewpoints().add(uv);
		}

	}

}
