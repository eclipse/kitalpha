/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.registry;

import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.ModelEntry;
import org.eclipse.pde.internal.core.IExtensionDeltaEvent;
import org.eclipse.pde.internal.core.IExtensionDeltaListener;
import org.eclipse.pde.internal.core.IPluginModelListener;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.PluginModelDelta;
import org.polarsys.kitalpha.resourcereuse.helper.Disposable;


/**
 * @author Thomas Guiu
 * 
 */
public class LiveWorkspaceReader extends WorkspaceReader implements Disposable, IExtensionDeltaListener, IPluginModelListener {

	public void extensionsChanged(IExtensionDeltaEvent event) {
		for (IPluginModelBase base : event.getChangedModels()) {
			handleExtensions(base.getExtensions());
		}
	}

	public ResourceRegistry readResources(ResourceRegistry parent) {
		ResourceRegistry readResources = super.readResources(parent);
		PDECore.getDefault().getModelManager().addExtensionDeltaListener(this);
		PDECore.getDefault().getModelManager().addPluginModelListener(this);
		return readResources;
	}

	public void dispose() {
		PDECore.getDefault().getModelManager().removeExtensionDeltaListener(this);
		PDECore.getDefault().getModelManager().removePluginModelListener(this);
	}

	public void modelsChanged(PluginModelDelta delta) {
		for (ModelEntry entry : delta.getAddedEntries()) {
			for (IPluginModelBase base : entry.getWorkspaceModels()) {
				handleExtensions(base.getExtensions());
			}
		}
		for (ModelEntry entry : delta.getRemovedEntries()) {
			registry.clear(entry.getId());
		}
	}

}
