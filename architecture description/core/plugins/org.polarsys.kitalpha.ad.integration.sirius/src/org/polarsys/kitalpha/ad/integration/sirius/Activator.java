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
package org.polarsys.kitalpha.ad.integration.sirius;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.osgi.framework.BundleContext;
import org.polarsys.kitalpha.ad.common.utils.URIFix;
import org.polarsys.kitalpha.ad.integration.sirius.listeners.DiagramUpdater;
import org.polarsys.kitalpha.ad.integration.sirius.listeners.SiriusViewpointActivationManager;
import org.polarsys.kitalpha.ad.integration.sirius.listeners.ViewpointActivationStateListener;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.Listener;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFUIActivator;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;
import org.polarsys.kitalpha.emde.extension.ModelExtensionListener;

public class Activator extends AFUIActivator {

	public static final String IMG_CHECKBOX_GRAYED_SELECTED = "icons/checkboxgrayedselected.gif";
	public static final String IMG_CHECKBOX_GRAYED_UNSELECTED = "icons/checkboxgrayedunselected.gif";

	public static final String AF_DESIGN = "/org.polarsys.kitalpha.ad.integration.sirius/description/ad.odesign";
	public static final URI GENERIC_VP_URI = URIFix.createPlatformPluginURI(Activator.AF_DESIGN + "#//@ownedViewpoints[name='ad']", false);
	public static final URI FILTER_URI = URIFix.createPlatformPluginURI(Activator.AF_DESIGN + "#//@ownedViewpoints[name='ad']/@ownedRepresentations[name='AD%20diagram']/@filters[name='ModelExtensionFilter']", false);

	private final Listener listener = new SiriusViewpointActivationManager();
	private final SessionManagerListener[] sessionListeners = { new ViewpointActivationStateListener() };
	private final ModelExtensionListener[] listeners = { new DiagramUpdater() };

	private static Activator plugin;
	private static Set<Viewpoint> viewpoints;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		plugin = this;
		super.start(context);
		viewpoints = new HashSet<Viewpoint>();
		viewpoints.addAll(ViewpointRegistry.getInstance().registerFromPlugin(AF_DESIGN));

		// load AF model manager
		// ModelExtensionHelper.getInstance(eObject);

		ViewpointManager.addListener(listener);
		for (SessionManagerListener l : sessionListeners)
			SessionManager.INSTANCE.addSessionsListener(l);
		for (ModelExtensionListener l : listeners)
			ModelExtensionHelper.addListener(l);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		for (SessionManagerListener l : sessionListeners)
			SessionManager.INSTANCE.removeSessionsListener(l);
		ViewpointManager.removeListener(listener);
		for (ModelExtensionListener l : listeners)
			ModelExtensionHelper.removeListener(l);

		if (viewpoints != null) {
			for (final Viewpoint viewpoint : viewpoints) {
				ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
			}
			viewpoints.clear();
			viewpoints = null;
		}

		super.stop(context);
	}

	public static Activator getDefault() {
		return plugin;
	}

	public static String getSymbolicName() {
		return plugin.getBundle().getSymbolicName();
	}

}
