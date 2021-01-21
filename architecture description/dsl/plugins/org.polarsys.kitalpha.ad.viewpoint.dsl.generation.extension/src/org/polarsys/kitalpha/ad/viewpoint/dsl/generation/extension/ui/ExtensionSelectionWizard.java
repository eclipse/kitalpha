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
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.Activator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.constant.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.data.LauncherExtension;

/**
 * @author Boubekeur Zendagui
 */

public class ExtensionSelectionWizard extends Wizard {

	private ExtensionSelectionMainPage extensionSelectionMainPage_;
	final private ImageDescriptor image_ = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID, //$NON-NLS-1$
														"icons/selection.png"); //$NON-NLS-1$
	
	public ExtensionSelectionWizard(List<LauncherExtension> availableExtensions) {
		super();
		this.setWindowTitle(Messages.ExtensionSelection_Wizard_Title);
		extensionSelectionMainPage_ = new ExtensionSelectionMainPage(availableExtensions);
		super.addPage(extensionSelectionMainPage_);
		super.setDefaultPageImageDescriptor(image_);
		super.setHelpAvailable(false);
	}
	
	@Override
	public boolean performFinish() {
		return true;
	}
	@Override
	public boolean performCancel() {
		for (LauncherExtension launcherExtension : getAvailableExtensions()) 
		{
			launcherExtension.setActive(true);
		}
		return true;
	}

	public List<LauncherExtension> getAvailableExtensions() {
		if (extensionSelectionMainPage_ != null)
		{
			return extensionSelectionMainPage_.getAvailableExtensions();
		}
		else
		{
			return new ArrayList<LauncherExtension>();
		}
	}
}
