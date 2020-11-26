/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {
	private static final String ICONS_PATH = "$nl$/icons/full/"; //$NON-NLS-1$ 
	private static Activator plugin;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this; // NOSONAR
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null; // NOSONAR
		super.stop(context);
	}

	public static Activator getDefault() {
		return plugin;
	}

	public ImageDescriptor getImageDescriptor(String key) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(getBundle().getSymbolicName(), ICONS_PATH + key);
	}

	public Image getImage(String key) {
		ImageRegistry imageRegistry = getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getImageDescriptor(key);
			imageRegistry.put(key, imageDescriptor);
			image = imageRegistry.get(key);
		}
		return image;
	}

}
