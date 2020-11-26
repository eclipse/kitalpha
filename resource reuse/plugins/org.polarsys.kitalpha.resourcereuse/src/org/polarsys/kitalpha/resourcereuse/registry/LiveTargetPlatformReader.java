/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
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

import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.ModelEntry;
import org.eclipse.pde.internal.core.IPluginModelListener;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.PluginModelDelta;
import org.polarsys.kitalpha.resourcereuse.helper.Disposable;


/**
 * @author Thomas Guiu
 * 
 */
public class LiveTargetPlatformReader extends TargetPlatformReader implements Disposable, IPluginModelListener {

	@Override
	public ResourceRegistry readResources(ResourceRegistry parent) {
		ResourceRegistry readResources = super.readResources(parent);
		PDECore.getDefault().getModelManager().addPluginModelListener(this);
		return readResources;
	}

	@Override
	public void dispose() {
		PDECore.getDefault().getModelManager().removePluginModelListener(this);
	}

	@Override
	public void modelsChanged(PluginModelDelta delta) {
		for (ModelEntry entry : delta.getRemovedEntries()) {
			registry.clear(entry.getId());
		}
		for (ModelEntry entry : delta.getAddedEntries()) {
			for (IPluginModelBase base : entry.getExternalModels()) {
				handleExtensions(base.getExtensions());
			}
		}
	}

}
