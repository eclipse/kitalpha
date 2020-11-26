/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.polarsys.kitalpha.resourcereuse.model.Location;

/**
 * @author Thomas Guiu
 * 
 */
public class TargetPlatformReader extends ModelBasedReader {

	@Override
	protected IPluginModelBase[] getModels() {
		IPluginModelBase[] externalModels = PluginRegistry.getExternalModels();

		List<IPluginModelBase> result = new ArrayList<IPluginModelBase>(externalModels.length);

		String installDir = new File(Platform.getInstallLocation().getURL().getFile()).toString();
		for (IPluginModelBase base : externalModels) {
			String installLocation = base.getInstallLocation();
			if (!installLocation.contains(installDir)) {
				result.add(base);
			}
		}
		return result.toArray(new IPluginModelBase[result.size()]);
	}

	@Override
	protected Location getLocation() {
		return Location.TARGET;
	}

}
