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
package org.polarsys.kitalpha.report.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.polarsys.kitalpha.report.ui.description.DateColumnDescription;
import org.polarsys.kitalpha.report.ui.description.MessageColumnDescription;
import org.polarsys.kitalpha.report.ui.description.ReportsUI;
import org.polarsys.kitalpha.report.utils.SeverityFactory;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.polarsys.kitalpha.report.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context); 
		plugin = this; // NOSONAR
		// register new severity kinds
		SeverityFactory.INSTANCE.registerSeverities();

		// register decoration for new severities
		ReportsUI.registerImage(SeverityFactory.INSTANCE.createDebug(), Activator.getDefault().getImage(ReportImages.IMG_SEVERITY_DEBUG));
		ReportsUI.registerImage(SeverityFactory.INSTANCE.createInfo(), Activator.getDefault().getImage(ReportImages.IMG_SEVERITY_INFO));
		ReportsUI.registerImage(SeverityFactory.INSTANCE.createWarning(), Activator.getDefault().getImage(ReportImages.IMG_SEVERITY_WARNING));
		ReportsUI.registerImage(SeverityFactory.INSTANCE.createError(), Activator.getDefault().getImage(ReportImages.IMG_SEVERITY_ERROR));

		ReportsUI.getDisplayedColumns().add("msg");
		ReportsUI.getDisplayedColumns().add("date");
		// register new columns for report view
		ReportsUI.registerColumnDescription(new MessageColumnDescription("Message", "msg", SWT.LEFT, 250));
		ReportsUI.registerColumnDescription(new DateColumnDescription("Date", "date", SWT.LEFT, 100));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;// NOSONAR
		super.stop(context);
	}

	/** // NOSONAR
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public ImageDescriptor getImageDescriptor(String key) {
		ImageRegistry imageRegistry = getImageRegistry();
		ImageDescriptor image = imageRegistry.getDescriptor(key);
		if (image == null) {
			// Create an image descriptor for given id.
			image = AbstractUIPlugin.imageDescriptorFromPlugin(getBundle().getSymbolicName(), key);
			// Store the (id, imageDescriptor) rather than (id,image)
			// because with storing (id,image) the getDescriptor method will
			// return null in later usage
			// this way, everything is correctly initialized.
			imageRegistry.put(key, image);
		}
		return image;
	}

	public Image getImage(String key) {
		ImageRegistry imageRegistry = getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null) {
			// Create an image descriptor for given id.
			ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(getBundle().getSymbolicName(), key);
			// Store the (id, imageDescriptor) rather than (id,image)
			// because with storing (id,image) the getDescriptor method will
			// return null in later usage
			// this way, everything is correctly initialized.
			imageRegistry.put(key, imageDescriptor);
			// Everything is all right at this step, let's get the real image
			image = imageRegistry.get(key);
		}
		return image;
	}

}
