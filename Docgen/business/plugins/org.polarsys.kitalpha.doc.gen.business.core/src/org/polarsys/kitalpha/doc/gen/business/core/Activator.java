/*******************************************************************************
 * Copyright (c) 2014-2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.polarsys.kitalpha.doc.gen.business.core";

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
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
	public static Activator getDefault() {
		return plugin;
	}
	
	/**
	 * Logs a warning
	 * @param message the message to display
	 */
	public static void logWarning(String message){
		logWarning(message, null);
	}
	
	/**
	 * Logs a warning
	 * @param message the message to display
	 * @param e the exception
	 */
	public static void logWarning(String message, Throwable e){
		Activator.getDefault().getLog().log(new Status(IStatus.WARNING, PLUGIN_ID, message, e));
	}
	
	/**
	 * Logs an Error
	 * @param message the message to display
	 */
	public static void logError(String message){
		logError(message, null);
	}
	
	/**
	 * Logs an Error
	 * @param message the message to display
	 * @param e the exception
	 */
	public static void logError(String message, Throwable e){
		Activator.getDefault().getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, message, e));
	}
	
	/**
	 * Logs an Information
	 * @param message the message to display
	 */
	public static void logInfo(String message){
		logInfo(message, null);
	}
	
	/**
	 * Logs an Information
	 * @param message the message to display
	 * @param e the exception
	 */
	public static void logInfo(String message, Throwable e){
		Activator.getDefault().getLog().log(new Status(IStatus.INFO, PLUGIN_ID, message, e));
	}

}
