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
package org.polarsys.kitalpha.ad.metadata.commands;

import java.util.ArrayList;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.kitalpha.ad.metadata.metadata.Metadata;
import org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage;

/**
 * @author Thomas Guiu
 * 
 */
public class SetViewpointFilterCommand extends RecordingCommand {

	private Metadata metadata;
	private String vpid;
	private boolean filter;

	public SetViewpointFilterCommand(TransactionalEditingDomain domain, Metadata metadata, String vpid, boolean filter) {
		super(domain);
		this.metadata = metadata;
		this.vpid = vpid;
		this.filter = filter;
	}

	@Override
	protected void doExecute() {
		for (ViewpointUsage uv : new ArrayList<ViewpointUsage>(metadata.getViewpointUsages())) {
			if (vpid.equals(uv.getVpId())) {
				uv.setFiltered(filter);
			}

		}
	}

}
