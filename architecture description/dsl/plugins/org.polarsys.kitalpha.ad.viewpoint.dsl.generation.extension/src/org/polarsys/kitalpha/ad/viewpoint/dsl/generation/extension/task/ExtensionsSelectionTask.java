/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
		Boolean userSelection_Value = productionContext.getInputValue(IContractNames.userSelection, Boolean.class);
		
		List<LauncherExtension> collectedExtensionPointContributions_Value = 
			productionContext.getInputValue(IContractNames.collectedExtensionPointContributions, List.class);
		
		List<LauncherExtension> selectedExtensions = new ArrayList<LauncherExtension>(); 
		
		if (userSelection_Value != null && userSelection_Value)
		{
			String extensionNameAttributeName_Value = 
				productionContext.getInputValue(IContractNames.extensionNameAttributeName, String.class);
			String extensionCategoryAttributeName_Value = 
				productionContext.getInputValue(IContractNames.extensionCategoryAttributeName, String.class);
			String extensionDescriptionAttributeName_Value = 
				productionContext.getInputValue(IContractNames.extensionDescriptionAttributeName, String.class);

			// Set for each extension the information about data to Display in the Selection UI
			for (LauncherExtension launcherExtension : collectedExtensionPointContributions_Value)
			{
				launcherExtension.setDiplayableData(extensionNameAttributeName_Value, 
													extensionCategoryAttributeName_Value, 
													extensionDescriptionAttributeName_Value);
			}

			// Display Selection UI
			final ExtensionSelectionWizard wizard = new ExtensionSelectionWizard(collectedExtensionPointContributions_Value);
			// Final link of the monitor to use in the run() method.
			final IProgressMonitor monitor_l = monitor;
			
			PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
				public void run() {
					WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
					dialog.open();
					switch (dialog.getReturnCode()) {
						case Window.CANCEL:
							monitor_l.setCanceled(true);
						break;
					}
				}
			});

			// Keep only extensions selected by user  
			for (LauncherExtension iLauncherExtension : collectedExtensionPointContributions_Value) 
			{
				if (iLauncherExtension.isActive())
					selectedExtensions.add(iLauncherExtension);
			}
		}
		else
		{
			selectedExtensions.addAll(collectedExtensionPointContributions_Value);
		}

		// Return in the output contract the selected extensions  
		productionContext.setOutputValue(IContractNames.selectedExtensionPointContributions, selectedExtensions);
	}

	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

}
