/*******************************************************************************
 * Copyright (c) 2020, 2021 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.common.sirius.extension.rotativeimage;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.polarsys.kitalpha.common.sirius.extension.rotativeimage.extension.RotativeDescription;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.polarsys.kitalpha.common.sirius.extension.rotativeimage";

	public static final String EXT_ID = "org.polarsys.kitalpha.common.sirius.extension.rotativeimage";
	
	// The shared instance
	private static Activator plugin;

	private Map<String, RotativeDescription> descriptions;
	
	public Map<String, RotativeDescription> getDescriptions() {
	    if (descriptions == null) {
	        descriptions = new HashMap<>();
	        
	        IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(EXT_ID);
	        for (IConfigurationElement e : config) {
	            String id = e.getAttribute("id");
	            int kind = RotativeDescription.ROTATIVE;
	            if (e.getAttribute("kind").equals("4images")) kind=RotativeDescription.FOUR_IMAGES;
	            descriptions.put(id, new RotativeDescription(id, kind));
	        }
	    }
		return descriptions;
	}
	
	public RotativeDescription getBestDescription(String id) {
	    if (id==null) return null;
		if (descriptions == null) {
		    getDescriptions();
		}
		RotativeDescription result = null;
		if (descriptions != null) {
		    result = descriptions.get(id);
		}
		return result;
	}
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
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
