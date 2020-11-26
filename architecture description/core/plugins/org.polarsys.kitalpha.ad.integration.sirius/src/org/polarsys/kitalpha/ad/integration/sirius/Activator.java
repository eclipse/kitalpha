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
import org.polarsys.kitalpha.ad.integration.sirius.listeners.RegisterMetadataListener;
import org.polarsys.kitalpha.ad.integration.sirius.listeners.SiriusViewpointActivationManager;
import org.polarsys.kitalpha.ad.integration.sirius.listeners.ViewpointActivationStateListener;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.OverallListener;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFUIActivator;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;
import org.polarsys.kitalpha.emde.extension.ModelExtensionOverallListener;

public class Activator extends AFUIActivator {

	public static final String IMG_CHECKBOX_GRAYED_SELECTED = "icons/checkboxgrayedselected.gif";
	public static final String IMG_CHECKBOX_GRAYED_UNSELECTED = "icons/checkboxgrayedunselected.gif";

	public static final String AF_VP_NAME = "ad";
	public static final String AF_DESIGN = "/org.polarsys.kitalpha.ad.integration.sirius/description/ad.odesign";
	public static final URI GENERIC_VP_URI = URIFix.createPlatformPluginURI(Activator.AF_DESIGN + "#//@ownedViewpoints[name='"+AF_VP_NAME+"']", false);
	public static final URI FILTER_URI = URIFix.createPlatformPluginURI(Activator.AF_DESIGN + "#//@ownedViewpoints[name='"+AF_VP_NAME+"']/@ownedRepresentations[name='AD%20diagram']/@filters[name='ModelExtensionFilter']", false);

	private final OverallListener listener = new SiriusViewpointActivationManager();
	private final SessionManagerListener[] sessionListeners = { new ViewpointActivationStateListener() , new RegisterMetadataListener()};
	private final ModelExtensionOverallListener[] listeners = { new DiagramUpdater() };

	private static Activator plugin;
	private static final Set<Viewpoint> viewpoints = new HashSet<Viewpoint>();

	@Override
	public void start(BundleContext context) throws Exception {
		plugin = this;
		super.start(context);
		viewpoints.clear();
		viewpoints.addAll(ViewpointRegistry.getInstance().registerFromPlugin(AF_DESIGN));


		ViewpointManager.addOverallListener(listener);
		for (SessionManagerListener l : sessionListeners){
			SessionManager.INSTANCE.addSessionsListener(l);
		}
		for (ModelExtensionOverallListener l : listeners){
			ModelExtensionHelper.addOverallListener(l);
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		for (SessionManagerListener l : sessionListeners){
			SessionManager.INSTANCE.removeSessionsListener(l);
		}
		ViewpointManager.removeOverallListener(listener);
		for (ModelExtensionOverallListener l : listeners){
			ModelExtensionHelper.removeOverallListener(l);
		}

		for (final Viewpoint viewpoint : viewpoints) {
			ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
		}
		viewpoints.clear();

		super.stop(context);
	}

	public static Activator getDefault() {
		return plugin;
	}

	public static String getSymbolicName() {
		return plugin.getBundle().getSymbolicName();
	}

}
