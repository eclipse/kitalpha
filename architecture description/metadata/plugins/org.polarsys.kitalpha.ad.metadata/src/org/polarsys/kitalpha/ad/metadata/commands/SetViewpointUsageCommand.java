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

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.metadata.helpers.MetadataHelper;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class SetViewpointUsageCommand extends MetadataCommand {

	private Resource vpResource;
	private boolean usage;
	private Version version;
	private ResourceSet ctx;

	public SetViewpointUsageCommand(ResourceSet ctx, Resource resource, Version version, boolean usage) {
		super(usage ? "use viewpoint" : "unuse viewpoint");
		this.vpResource = resource;
		this.version = version;
		this.usage = usage;
		this.ctx = ctx;
	}

	private void perform(boolean usage) {
		MetadataHelper.getViewpointMetadata(ctx).setUsage(vpResource, version, usage);
	}

	@Override
	public void execute() {
		perform(usage);

	}

	@Override
	public void undo() {
		perform(!usage);
	}

}
