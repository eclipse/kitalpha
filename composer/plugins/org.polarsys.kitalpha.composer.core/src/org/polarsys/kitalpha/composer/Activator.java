/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation.
 *******************************************************************************/


package org.polarsys.kitalpha.composer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 * 
 * @author THALESGROUP
 */
public class Activator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.polarsys.kitalpha.composer.core";

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
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

	/**
	 * Logs the given message.
	 * 
	 * @param message
	 *            the message to log.
	 */
	public void info(String message) {
		IStatus status = new Status(IStatus.INFO, PLUGIN_ID, message);
		getLog().log(status);
	}

	/**
	 * Logs the given message with a warning level.
	 * 
	 * @param message
	 *            the message to log.
	 */
	public void warning(String message) {
		warning(message, null);
	}

	/**
	 * Logs the given message and exception with a warning level.
	 * 
	 * @param message
	 *            the message to log.
	 * @param e
	 *            the exception to log.
	 */
	public void warning(String message, Throwable e) {
		IStatus status = new Status(IStatus.WARNING, PLUGIN_ID, message, e);
		getLog().log(status);
	}

	/**
	 * Logs the given message and exception with an error level.
	 * 
	 * @param message
	 *            the message to log.
	 * @param e
	 *            the exception to log.
	 */
	public void error(String message, Throwable e) {
		IStatus status = new Status(IStatus.ERROR, PLUGIN_ID, message, e);
		getLog().log(status);
	}

}
