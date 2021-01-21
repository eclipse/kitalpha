/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

/**
 * The activator.
 * 
 * @author THALESGROUP
 */
public class AccuracyPlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.polarsys.kitalpha.accuracy";

	// The shared instance
	private static AccuracyPlugin plugin;

	/**
	 * The constructor
	 */
	public AccuracyPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
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
	public static AccuracyPlugin getDefault() {
		return plugin;
	}

	/**
	 * Logs the given message as information level.
	 * 
	 * @param message
	 *            the message.
	 */
	public void info(String message) {
		log(IStatus.INFO, message, null);
	}

	/**
	 * Logs the given message as warning level.
	 * 
	 * @param message
	 *            the message.
	 */
	public void warning(String message) {
		log(IStatus.WARNING, message, null);
	}

	/**
	 * Logs the given message as warning level.
	 * 
	 * @param message
	 *            the message.
	 * @param e
	 *            the exception.
	 */
	public void warning(String message, Exception e) {
		log(IStatus.WARNING, message, e);
	}

	/**
	 * Logs the given message as warning level.
	 * 
	 * @param message
	 *            the message.
	 * @param e
	 *            the exception.
	 */
	public void error(String message, Exception e) {
		log(IStatus.ERROR, message, e);
	}

	private void log(int severity, String message, Exception e) {
		IStatus status = new Status(severity, PLUGIN_ID, message, e);
		getLog().log(status);
	}

}
