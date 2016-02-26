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
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class UpdateViewpointVersionCommand extends RecordingCommand {

	private Integration integration;
	private Resource vpResource;

	public UpdateViewpointVersionCommand(TransactionalEditingDomain domain, Integration integration, Resource resource) {
		super(domain);
		this.integration = integration;
		this.vpResource = resource;
	}

	@Override
	protected void doExecute() {
		for (UsedViewpoint uv : new ArrayList<UsedViewpoint>(integration.getUsedViewpoints())) {
			if (vpResource.equals(uv.getVpId())) {
				uv.setVersion(vpResource.getVersion());
				return ;
			}
		}
	}

}
