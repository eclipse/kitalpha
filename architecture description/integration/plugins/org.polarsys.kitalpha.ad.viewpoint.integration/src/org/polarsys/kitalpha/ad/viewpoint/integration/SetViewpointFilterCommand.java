/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.integration;

import java.util.ArrayList;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.Integration;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint;

/**
 * @author Thomas Guiu
 * 
 */
public class SetViewpointFilterCommand extends RecordingCommand {

	private Integration integration;
	private String vpid;
	private boolean filter;

	public SetViewpointFilterCommand(TransactionalEditingDomain domain, Integration integration, String vpid, boolean filter) {
		super(domain);
		this.integration = integration;
		this.vpid = vpid;
		this.filter = filter;
	}

	@Override
	protected void doExecute() {
		for (UsedViewpoint uv : new ArrayList<UsedViewpoint>(integration.getUsedViewpoints())) {
			if (vpid.equals(uv.getVpId())) {
				uv.setFiltered(filter);
			}

		}
	}

}
