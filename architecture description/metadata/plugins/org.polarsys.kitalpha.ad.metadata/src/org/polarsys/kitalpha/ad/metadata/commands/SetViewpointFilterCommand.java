/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.metadata.commands;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.polarsys.kitalpha.ad.metadata.helpers.MetadataHelper;

/**
 * @author Thomas Guiu
 * 
 */
public class SetViewpointFilterCommand extends MetadataCommand {

	private String vpid;
	private boolean filter;
	private ResourceSet ctx;

	public SetViewpointFilterCommand(ResourceSet ctx, String vpid, boolean filter) {
		super(filter ? "Hide viewpoint" : "Display viewpoin");
		this.ctx = ctx;
		this.vpid = vpid;
		this.filter = filter;
	}

	private void perform(boolean filter) {
		MetadataHelper.getViewpointMetadata(ctx).setFilter(vpid, filter);
	}

	@Override
	public void execute() {
		perform(filter);

	}

	@Override
	public void undo() {
		perform(!filter);
	}

}
