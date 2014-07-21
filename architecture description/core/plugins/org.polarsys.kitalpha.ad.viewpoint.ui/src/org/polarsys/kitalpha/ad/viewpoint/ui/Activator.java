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
package org.polarsys.kitalpha.ad.viewpoint.ui;

import java.io.IOException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.osgi.framework.BundleContext;

public class Activator extends AFUIActivator {

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

	public static String getSymbolicName() {
		return plugin.getBundle().getSymbolicName();
	}

	public static void saveWizardSettings(IDialogSettings settings) {
		IPath stateLocation = Platform.getStateLocation(getDefault().getBundle());
		stateLocation = stateLocation.append(DIALOG_SETTINGS_FILE);

		try {
			settings.save(stateLocation.toOSString());
		} catch (IOException e) {
			getDefault().logError(e);
		}
	}

	public static IDialogSettings loadWizardSettings() {
		IDialogSettings settings = new DialogSettings("root");
		IPath stateLocation = Platform.getStateLocation(Activator.getDefault().getBundle());
		stateLocation = stateLocation.append(DIALOG_SETTINGS_FILE);
		// return getDefaultDialogSettings();
		try {
			settings.load(stateLocation.toOSString());
		} catch (IOException e) {
			Activator.getDefault().logError(e);
			return getDefaultWizardSettings();
		}
		return settings;
	}

	private static IDialogSettings getDefaultWizardSettings() {
		IDialogSettings settings = new DialogSettings("root");
		IDialogSettings wizardSettings = settings.addNewSection(RULE_PROVIDER_WIZARD_SECTION);
		wizardSettings = settings.addNewSection(SERVICE_PROVIDER_WIZARD_SECTION);
		return settings;
	}

	public static final String DIALOG_SETTINGS_FILE = "dialogSettings.xml";
	public static final String RULE_PROVIDER_WIZARD_SECTION = "rule.provider.wizard.section";
	public static final String SERVICE_PROVIDER_WIZARD_SECTION = "service.provider.wizard.section";
	public static final String DEFAULT_LOCATION_KEY = "default.location.key";
	public static final String DEFAULT_PACKAGE_KEY = "default.package.key";
}