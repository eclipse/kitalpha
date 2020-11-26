/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.task;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.constant.IContractNames;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.data.LauncherExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.ui.ExtensionSelectionWizard;

/**
 * @author Boubekeur Zendagui
 */

public class ExtensionsSelectionTask implements ITaskProduction {

	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}
	
	@SuppressWarnings("unchecked")
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		Boolean userSelectionValue = productionContext.getInputValue(IContractNames.userSelection, Boolean.class);
		
		List<LauncherExtension> collectedExtensionPointContributionsValue = 
			productionContext.getInputValue(IContractNames.collectedExtensionPointContributions, List.class);
		
		List<LauncherExtension> selectedExtensions = new ArrayList<LauncherExtension>(); 
		
		if (userSelectionValue != null && userSelectionValue)
		{
			String extensionNameAttributeNameValue = 
				productionContext.getInputValue(IContractNames.extensionNameAttributeName, String.class);
			String extensionCategoryAttributeNameValue = 
				productionContext.getInputValue(IContractNames.extensionCategoryAttributeName, String.class);
			String extensionDescriptionAttributeNameValue = 
				productionContext.getInputValue(IContractNames.extensionDescriptionAttributeName, String.class);

			// Set for each extension the information about data to Display in the Selection UI
			for (LauncherExtension launcherExtension : collectedExtensionPointContributionsValue)
			{
				launcherExtension.setDiplayableData(extensionNameAttributeNameValue, 
													extensionCategoryAttributeNameValue, 
													extensionDescriptionAttributeNameValue);
			}

			// Display Selection UI
			final ExtensionSelectionWizard wizard = new ExtensionSelectionWizard(collectedExtensionPointContributionsValue);
			// Final link of the monitor to use in the run() method.
			final IProgressMonitor monitorLocal = monitor;
			
			PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
				public void run() {
					WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
					dialog.open();
					switch (dialog.getReturnCode()) {
						case Window.CANCEL:
							monitorLocal.setCanceled(true);
						break;
					}
				}
			});

			// Keep only extensions selected by user  
			for (LauncherExtension iLauncherExtension : collectedExtensionPointContributionsValue) 
			{
				if (iLauncherExtension.isActive())
					selectedExtensions.add(iLauncherExtension);
			}
		}
		else
		{
			selectedExtensions.addAll(collectedExtensionPointContributionsValue);
		}

		// Return in the output contract the selected extensions  
		productionContext.setOutputValue(IContractNames.selectedExtensionPointContributions, selectedExtensions);
	}

	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

}
