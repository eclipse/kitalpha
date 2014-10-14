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

package org.polarsys.kitalpha.model.attachment.ui.action;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.model.attachment.ui.wizard.AttachmentWizard;

/**
 * @author Thomas Guiu
 * 
 */
public class ModelAttachmentAction implements IObjectActionDelegate {

	private final List<IFile> files = new ArrayList<IFile>();

	public ModelAttachmentAction() {
	}

	@Override
	public void run(IAction action) {

		WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), new AttachmentWizard(files));
		dialog.setHelpAvailable(false);
		dialog.open();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		files.clear();
		if (selection instanceof StructuredSelection) {
			for (Object obj : ((StructuredSelection) selection).toList()) {
				if (obj instanceof IFile)
					files.add((IFile) obj);
			}
		}

	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {

	}
}
