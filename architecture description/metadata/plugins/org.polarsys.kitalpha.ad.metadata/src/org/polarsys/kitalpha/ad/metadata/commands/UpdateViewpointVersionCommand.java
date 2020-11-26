/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.metadata.commands;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.metadata.helpers.MetadataHelper;
import org.polarsys.kitalpha.ad.metadata.helpers.ViewpointMetadata;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class UpdateViewpointVersionCommand extends MetadataCommand {

	private Resource vpResource;
	private Version version;
	private Version oldVersion;
	private ResourceSet ctx;

	public UpdateViewpointVersionCommand(ResourceSet ctx, Resource resource, Version version) {
		super("set viewpoint version");
		this.ctx = ctx;
		this.vpResource = resource;
		this.version = version;
	}

	private void perform(Version version) {
		ViewpointMetadata helper = MetadataHelper.getViewpointMetadata(ctx);
		oldVersion = helper.getVersion(vpResource);
		helper.updateVersion(vpResource, version);

	}

	@Override
	public void execute() {
		perform(version);

	}

	@Override
	public void undo() {
		perform(oldVersion);
	}

}
