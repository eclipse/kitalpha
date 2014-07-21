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
package org.polarsys.kitalpha.report.example.customization;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.polarsys.kitalpha.report.ui.description.ReportsUI;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin implements IStartup {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.polarsys.kitalpha.examples.report"; //$NON-NLS-1$
	public static final String IMG_SEVERITY_FATAL = "icons/failure.gif";

	public static final String COMMENT_COLUMN_ID = "comment";

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
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		ExampleSeverityFactory.INSTANCE.registerSeverities();
		ReportsUI.registerImage(ExampleSeverityFactory.INSTANCE.createFatalError(), getImage(IMG_SEVERITY_FATAL));
		ReportsUI.registerColumnDescription(new CommentColumnDescription("Comment", COMMENT_COLUMN_ID, SWT.LEFT, 80));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		ReportsUI.unRegisterImage(ExampleSeverityFactory.INSTANCE.createFatalError());
		ReportsUI.unRegisterColumnDescription(COMMENT_COLUMN_ID);
		ExampleSeverityFactory.INSTANCE.unRegisterSeverities();
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

	public void earlyStartup() {
		// TODO Auto-generated method stub

	}

}
