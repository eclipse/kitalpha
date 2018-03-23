/*******************************************************************************
 * Copyright (c) 2006, 2018 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.patterns.emde;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;


/**
 * The activator class for this plug-in
 */
public class EmdePatternSupportPlugin extends Plugin {

	/** The shared instance */
	private static EmdePatternSupportPlugin plugin;
	
	
	/**
	 * Constructor
	 */
	public EmdePatternSupportPlugin() {
	  // Nothing
	}
	
  /**
   * Return the shared instance of the activator
   */
  public static EmdePatternSupportPlugin getDefault() {
    return plugin;
  }
  
  /**
   * Return the ID of this plug-in according to MANIFEST.MF
   */
  public String getPluginId() {
    return getBundle().getSymbolicName();
  }
  
  /**
   * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
   */
  @Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}
  
	/**
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
}
