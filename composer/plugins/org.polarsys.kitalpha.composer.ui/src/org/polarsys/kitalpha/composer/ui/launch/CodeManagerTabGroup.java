/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation.
 *******************************************************************************/


package org.polarsys.kitalpha.composer.ui.launch;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

import org.polarsys.kitalpha.cadence.ui.api.CadenceTab;
import org.polarsys.kitalpha.composer.ui.launch.tabs.ComposerTab;
import org.polarsys.kitalpha.composer.ui.launch.tabs.LibraryTab;

/**
 * Tabs to edit a Composer Launch Configuration.
 * 
 * @author THALESGROUP
 */
public class CodeManagerTabGroup extends AbstractLaunchConfigurationTabGroup {

	private static String WORKFLOW_ID = "org.polarsys.kitalpha.composer.core.workflow";

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTabGroup#createTabs(org.eclipse.debug.ui.ILaunchConfigurationDialog,
	 *      java.lang.String)
	 */
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				new ComposerTab(),new LibraryTab(),new CadenceTab(WORKFLOW_ID),new CommonTab() };
		this.setTabs(tabs);
	}

}
