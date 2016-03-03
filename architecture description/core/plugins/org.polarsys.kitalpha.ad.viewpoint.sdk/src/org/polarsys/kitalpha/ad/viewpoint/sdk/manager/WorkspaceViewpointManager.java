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

package org.polarsys.kitalpha.ad.viewpoint.sdk.manager;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.osgi.util.NLS;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.osgi.framework.BundleException;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.services.manager.AlreadyInStateException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.sdk.Messages;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class WorkspaceViewpointManager extends ViewpointManager {

	static {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(new IResourceChangeListener() {

			public void resourceChanged(IResourceChangeEvent event) {
				if (INSTANCE == null)
					return; // not ready
				IProject project = event.getResource().getProject();
				if (project == null)
					return;
				IPluginModelBase bundle = PluginRegistry.findModel(project);
				if (bundle == null)
					return;
				String symbolicName = bundle.getBundleDescription().getSymbolicName();
				for (Resource res : INSTANCE.getAvailableViewpoints()) {
					if (symbolicName.equals(res.getProviderSymbolicName()))
						try {
							INSTANCE.desactivate(res.getId());
						} catch (AlreadyInStateException e) {
							// we don't care...
						} catch (ViewpointActivationException e) {
							AD_Log.getDefault().logError(e);
						}
				}
			}
		}, IResourceChangeEvent.PRE_DELETE);
	}

	protected void activateBundle(String id) throws ViewpointActivationException {
		try {
			BundleManager.INSTANCE.load(id);
		} catch (Exception e) {
			throw new ViewpointActivationException(NLS.bind(Messages.ManageBundle_error_title8, id), e);
		}
	}

	protected void desactivateBundle(String id) throws ViewpointActivationException {
		if (!BundleManager.INSTANCE.isManaged(id))
			return;
		try {

			BundleManager.INSTANCE.unLoad(id);
		} catch (IllegalStateException e) {
			// we don't care
		} catch (BundleException e) {
			throw new ViewpointActivationException(NLS.bind(Messages.ManageBundle_error_title9, id), e);
		}
	}

}
