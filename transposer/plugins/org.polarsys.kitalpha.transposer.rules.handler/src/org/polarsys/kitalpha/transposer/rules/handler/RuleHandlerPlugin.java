/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.transposer.rules.handler;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import org.polarsys.kitalpha.transposer.rules.handler.business.registry.GenericPurposeRegistry;

/**
 * The activator class controls the plug-in life cycle
 * @author Guillaume GEBHART
 */
public class RuleHandlerPlugin extends Plugin {

  // The plug-in ID
  public static final String PLUGIN_ID = "org.polarsys.kitalpha.transposer.rules.handler"; //$NON-NLS-1$

  // The shared instance
  private static RuleHandlerPlugin plugin;

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
    GenericPurposeRegistry.getInstance().reset();
    super.stop(context);
    
  }

  /**
   * Returns the shared instance
   * 
   * @return the shared instance
   */
  public static RuleHandlerPlugin getDefault() {
    return plugin;
  }

}
