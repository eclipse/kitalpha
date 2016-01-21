/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * @author Thomas Guiu
 * 
 */
public class Activator extends Plugin {

	private static Activator plugin;

	public void start(BundleContext context) throws Exception {
		plugin = this;
		super.start(context);
	}

	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	public static Activator getDefault() {
		return plugin;
	}
	
	public static String getSymbolicName() {
		return plugin.getBundle().getSymbolicName();
	}

}
