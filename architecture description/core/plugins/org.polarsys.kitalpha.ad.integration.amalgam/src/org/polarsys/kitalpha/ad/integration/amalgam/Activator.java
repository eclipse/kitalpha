/*******************************************************************************
 * Copyright (c) 2015, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.integration.amalgam;

import org.osgi.framework.BundleContext;
import org.polarsys.kitalpha.ad.integration.amalgam.listeners.ActivityExplorerUpdater;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.OverallListener;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFUIActivator;

/**
 * @author Thomas Guiu
 * 
 */
public class Activator extends AFUIActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.polarsys.kitalpha.ad.integration.amalgam"; //$NON-NLS-1$

	private final OverallListener[] listeners = new OverallListener[] { new ActivityExplorerUpdater() };

	// The shared instance
	private static Activator plugin;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		for (OverallListener l : listeners) {
			ViewpointManager.addOverallListener(l);
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
		for (OverallListener l : listeners) {
			ViewpointManager.removeOverallListener(l);
		}
	}

	public static Activator getDefault() {
		return plugin;
	}

	public static String getSymbolicName() {
		return plugin.getBundle().getSymbolicName();
	}

}
