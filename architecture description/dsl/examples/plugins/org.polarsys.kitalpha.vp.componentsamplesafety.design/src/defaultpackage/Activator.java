/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package defaultpackage;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
    // The plug-in ID
    public static final String PLUGIN_ID = "org.polarsys.kitalpha.vp.componentsamplesafety.design";

    // The shared instance
    private static Activator plugin;

    private static final Set<Viewpoint> viewpoints = new HashSet<Viewpoint>(); 

    public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		viewpoints.clear();
		viewpoints.addAll(ViewpointRegistry.getInstance()
				.registerFromPlugin(PLUGIN_ID + "/description/ComponentSampleSafety.odesign"));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
    	plugin = null;
	    for (final Viewpoint viewpoint: viewpoints) {
	    	ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
	    }
	    viewpoints.clear();
	    super.stop(context);
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
    	return plugin;
    }
}
