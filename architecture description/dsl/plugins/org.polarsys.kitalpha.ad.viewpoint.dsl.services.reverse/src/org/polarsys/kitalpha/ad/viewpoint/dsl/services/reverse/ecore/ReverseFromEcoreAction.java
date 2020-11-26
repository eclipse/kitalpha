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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.ecore;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.wizard.ReverseDSLVPProjectWizard;

/**
 * @author Boubekeur Zendagui
 */

public class ReverseFromEcoreAction extends BaseSelectionListenerAction implements IObjectActionDelegate{
	
	private IStructuredSelection selection;

	public ReverseFromEcoreAction() 
	{
		super(Messages.Reverse_EcoreAction_Name);
	}

	public void run(IAction action) {
		 ReverseDSLVPProjectWizard wizard = new ReverseDSLVPProjectWizard(selection);
		 WizardDialog wizardDialog = new WizardDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), wizard);
		 wizardDialog.open();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}
	
}
