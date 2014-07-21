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
package org.polarsys.kitalpha.emde.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	private static Activator plugin;

	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static Activator getDefault() {
		return plugin;
	}

	public ImageDescriptor getImageDescriptor(String path) {
		ImageRegistry imageRegistry = getImageRegistry();
		ImageDescriptor image = imageRegistry.getDescriptor(path);
		if (image == null) {
			// Create an image descriptor for given id.
			image = AbstractUIPlugin.imageDescriptorFromPlugin(getBundle().getSymbolicName(), path);
			// Store the (id, imageDescriptor) rather than (id,image)
			// because with storing (id,image) the getDescriptor method will
			// return null in later usage
			// this way, everything is correctly initialized.
			imageRegistry.put(path, image);
		}
		return image;
	}

	public Image getImage(String path) {
		ImageRegistry imageRegistry = getImageRegistry();
		Image image = imageRegistry.get(path);
		if (image == null) {
			// Create an image descriptor for given id.
			ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(getBundle().getSymbolicName(), path);
			// Store the (id, imageDescriptor) rather than (id,image)
			// because with storing (id,image) the getDescriptor method will
			// return null in later usage
			// this way, everything is correctly initialized.
			imageRegistry.put(path, imageDescriptor);
			// Everything is all right at this step, let's get the real image
			image = imageRegistry.get(path);
		}
		return image;
	}

}
