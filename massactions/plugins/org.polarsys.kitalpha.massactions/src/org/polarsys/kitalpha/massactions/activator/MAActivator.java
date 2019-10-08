/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.activator;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author Sandu Postaru 
 *  
 */
public class MAActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.polarsys.kitalpha.massactions";
	
  public static final String ME_VIEW_ID = "org.polarsys.kitalpha.massactions.edit.view";
  public static final String MV_VIEW_ID = "org.polarsys.kitalpha.massactions.visualize.view";

	public static final String IMAGE_CLEAR = "IMAGE_CLEAR";
	public static final String IMAGE_FILTER = "IMAGE_FILTER";
	public static final String IMAGE_ADD = "IMAGE_ADD";
	public static final String IMAGE_ME_NEW_VIEW = "IMAGE_ME_NEW_VIEW";
	public static final String IMAGE_MV_NEW_VIEW = "IMAGE_MV_NEW_VIEW";
	public static final String IMAGE_EXPORT_CSV = "IMAGE_EXPORT_CSV";

	// The shared instance
	private static MAActivator plugin;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

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
	public static MAActivator getDefault() {
		return plugin;
	}

	@Override
	protected void initializeImageRegistry(ImageRegistry reg) {
		super.initializeImageRegistry(reg);

		reg.put(IMAGE_CLEAR, imageDescriptorFromPlugin(PLUGIN_ID, "icons/clear.png"));
		reg.put(IMAGE_FILTER, imageDescriptorFromPlugin(PLUGIN_ID, "icons/filter_ps.png"));
		reg.put(IMAGE_ADD, imageDescriptorFromPlugin(PLUGIN_ID, "icons/add.png"));
		reg.put(IMAGE_ME_NEW_VIEW, imageDescriptorFromPlugin(PLUGIN_ID, "icons/me_new_view.gif"));
		reg.put(IMAGE_MV_NEW_VIEW, imageDescriptorFromPlugin(PLUGIN_ID, "icons/mv_new_view.gif"));
		reg.put(IMAGE_EXPORT_CSV, imageDescriptorFromPlugin(PLUGIN_ID, "icons/export_csv.png"));
		
	}
}
