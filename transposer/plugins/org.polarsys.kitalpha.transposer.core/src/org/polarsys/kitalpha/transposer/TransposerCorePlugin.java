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


package org.polarsys.kitalpha.transposer;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 * @author Guillaume Gebhart
 */
public class TransposerCorePlugin extends Plugin {

  // The plug-in ID
  public static final String PLUGIN_ID = "org.polarsys.kitalpha.transposer"; //$NON-NLS-1$

  // The shared instance
  private static TransposerCorePlugin plugin;

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
  public static TransposerCorePlugin getDefault() {
    return plugin;
  }

  public void logError(String message_p, Throwable e) {
    logError(PLUGIN_ID, message_p, e);
  }

  public void logError(String pluginId_p, String message_p, Throwable e) {
    log(IStatus.ERROR, pluginId_p, message_p, e);
  }

  public void logWarning(String message_p, Throwable e) {
    logWarning(PLUGIN_ID, message_p, e);
  }

  public void logWarning(String pluginId_p, String message_p, Throwable e) {
    log(IStatus.WARNING, pluginId_p, message_p, e);
  }

  public void logInfo(String message_p, Throwable e) {
    logInfo(PLUGIN_ID, message_p, e);
  }

  public void logInfo(String pluginId_p, String message_p, Throwable e) {
    log(IStatus.INFO, pluginId_p, message_p, e);
  }

  /**
   * @param error_p
   * @param message_p
   * @param e_p
   */
  public void log(int severity_p, String message_p, Throwable e_p) {
    log(severity_p, PLUGIN_ID, message_p, e_p);
  }

  /**
   * @param error_p
   * @param message_p
   * @param e_p
   */
  public void log(int severity_p, String pluginId_p, String message_p, Throwable e_p) {
    ILog log = getLog();

    if (log == null)
      return;

    log.log(new Status(severity_p, pluginId_p, message_p, e_p));
  }

}
