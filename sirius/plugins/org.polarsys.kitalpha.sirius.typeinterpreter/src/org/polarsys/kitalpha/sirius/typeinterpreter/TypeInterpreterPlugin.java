/*******************************************************************************
 * Copyright (c) 2009, 2011 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *      Thales Global Services S.A.S - Initial API and implementation.
 *******************************************************************************/
package org.polarsys.kitalpha.sirius.typeinterpreter;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class TypeInterpreterPlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.polarsys.kitalpha.sirius.typeinterpreter";

	// The shared instance
	private static TypeInterpreterPlugin plugin;
	
	/**
	 * The constructor
	 */
	public TypeInterpreterPlugin() {
	    // Nothing needed
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static TypeInterpreterPlugin getDefault() {
		return plugin;
	}

}
