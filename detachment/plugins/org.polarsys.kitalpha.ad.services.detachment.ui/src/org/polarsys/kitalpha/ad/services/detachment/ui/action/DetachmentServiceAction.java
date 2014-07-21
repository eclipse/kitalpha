/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.services.detachment.ui.action;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.polarsys.kitalpha.ad.services.detachment.core.services.IDetachmentService;
import org.polarsys.kitalpha.ad.services.detachment.core.services.impl.DetachmentService;
import org.polarsys.kitalpha.ad.services.detachment.ui.wizard.DetachmentWizard;
import org.polarsys.kitalpha.ad.services.detachment.ui.wizard.DetachmentWizardDialog;

/**
 * Handle user action
 * @author Mathieu Helleboid
 *
 */
public class DetachmentServiceAction implements IObjectActionDelegate {
	
	private IFile airdIResource;
	private Shell shell;

	
	@Override
	public void run(IAction action) {
		IDetachmentService detachment = DetachmentService.getInstance(airdIResource);
		DetachmentWizard detachmentWizard = new DetachmentWizard(detachment);
		WizardDialog wizardDialog = new DetachmentWizardDialog(shell, detachmentWizard);
		wizardDialog.open();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		
		if (selection instanceof StructuredSelection){
			StructuredSelection structuredSelection = (StructuredSelection)selection;
			
			Object firstElement = structuredSelection.getFirstElement();
			
			if (firstElement instanceof IFile){
				if (airdIResource != firstElement){
					airdIResource = (IFile)firstElement;
					
					action.setEnabled(true);
					URI uri = URI.createPlatformResourceURI(airdIResource.getFullPath().toPortableString(), true);
					Session session = SessionManager.INSTANCE.getSession(uri, new NullProgressMonitor());
					
					if (session != null){
						action.setEnabled(!session.isOpen());
					}
				}
			}
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = null;
		if (targetPart != null && targetPart.getSite() != null)
			shell = targetPart.getSite().getShell();
	}

}
