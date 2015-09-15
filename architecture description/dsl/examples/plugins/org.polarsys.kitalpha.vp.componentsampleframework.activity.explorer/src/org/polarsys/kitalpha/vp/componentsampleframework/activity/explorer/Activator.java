/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/  
package org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
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
		if (plugin == null){
			//Force starting of bundle
			try {
				Platform.getBundle(PLUGIN_ID).start();
			} catch (BundleException e) {
				e.printStackTrace();
			}
		}
		return plugin;
	}
	
	public Image getImage(String key_p) {
		return getImage(PLUGIN_ID, key_p);
	}
	
	public Image getImage(String plugin_id, String key_p) {
		ImageRegistry imageRegistry = getImageRegistry();

		Image image = imageRegistry.get(key_p);
		if (null == image) {
			// Create an image descriptor for given id.
			ImageDescriptor imageDescriptor = createImageDescriptor(key_p, plugin_id);
			// Store the (id, imageDescriptor) rather than (id,image)
			// because with storing (id,image) the getDescriptor method will
			// return null in later usage
			// this way, everything is correctly initialized.
			imageRegistry.put(key_p, imageDescriptor);

			// Everything is all right at this step, let's get the real image
			image = imageRegistry.get(key_p);
		}
		return image;
	}
	
	protected ImageDescriptor createImageDescriptor(String key_p, String id) {
		ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(id, key_p);
		return imageDescriptor;
	}

}