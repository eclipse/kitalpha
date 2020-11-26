/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.polarsys.kitalpha.ad.common.AD_Log;

/**
 * @author Thomas Guiu
 * 
 */
public abstract class AFUIActivator extends AbstractUIPlugin {

	public AFUIActivator() {
		super();
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

	public void logInfo(String message) {
		AD_Log.getDefault().logInfo(message);
	}
	
	public void logInfo(String message, Throwable t) {
		AD_Log.getDefault().logInfo(message, t);
	}
	
	public void logWarning(String message) {
		AD_Log.getDefault().logWarning(message);
	}

	public void logWarning(Throwable t) {
		AD_Log.getDefault().logWarning(t);
	}

	public void logError(Throwable t) {
		AD_Log.getDefault().logError(t);
	}

	public void logError(String message) {
		AD_Log.getDefault().logError(message);
	}

}