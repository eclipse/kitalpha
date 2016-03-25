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

import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.metadata.metadata.Metadata;
import org.polarsys.kitalpha.ad.metadata.metadata.MetadataFactory;
import org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class UpdateViewpointVersionCommand extends MetadataCommand {

	private Metadata metadata;
	private Resource vpResource;
	private Version version;
	private Version oldVersion;

	public UpdateViewpointVersionCommand(Metadata metadata, Resource resource, Version version) {
		super("set viewpoint version");
		this.metadata = metadata;
		this.vpResource = resource;
		this.version = version;
	}

		private void perform(Version version) {
		for (ViewpointUsage uv : new ArrayList<ViewpointUsage>(metadata.getViewpointUsages())) {
			if (vpResource.getId().equals(uv.getVpId())) {
				oldVersion = uv.getVersion();
				uv.setVersion(version);
				return ;
			}
		}
		ViewpointUsage uv = MetadataFactory.eINSTANCE.createViewpointUsage();
		uv.setFiltered(false);
		uv.setVpId(vpResource.getId());
		uv.setVersion(version);
		metadata.getViewpointUsages().add(uv);

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
