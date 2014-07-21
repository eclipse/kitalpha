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

package org.polarsys.kitalpha.ad.services.detachment.ui.wizard;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.ad.services.detachment.ui.messages.Messages;

/**
 * @author Matthieu Helleboid
 */
public class DetachmentWizardDialog extends WizardDialog {

	public DetachmentWizardDialog(Shell parentShell, IWizard newWizard) {
		super(parentShell, newWizard);
	}

	@Override
	protected Control createContents(Composite parent) {
		Control createContents = super.createContents(parent);
		
		
		if (getWizard().canFinish())
			getButton(IDialogConstants.FINISH_ID).setEnabled(true);
		else
			getButton(IDialogConstants.FINISH_ID).setEnabled(false);
			
		getButton(IDialogConstants.CANCEL_ID).setVisible(true);
		//getButton(IDialogConstants.BACK_ID).setVisible(true);
	
		return createContents;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * Change the label of finish button to Detach
	 * 
	 * @see
	 * org.eclipse.jface.wizard.WizardDialog#createButtonsForButtonBar(org.eclipse
	 * .swt.widgets.Composite)
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
		Button finishButton = getButton(IDialogConstants.FINISH_ID);
		finishButton.setText(Messages.DETACH_BUTTON_LABEL);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * Enable the detach button if we are at the last page
	 * 
	 * @see org.eclipse.jface.wizard.WizardDialog#nextPressed()
	 */
	@Override
	protected void nextPressed() {
		super.nextPressed();

		if (!getCurrentPage().canFlipToNextPage())
			getButton(IDialogConstants.FINISH_ID).setEnabled(true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * Disable the detach button if we are at the last page
	 * 
	 * @see org.eclipse.jface.wizard.WizardDialog#backPressed()
	 */
	@Override
	protected void backPressed() {
		super.backPressed();
		if (getCurrentPage().canFlipToNextPage())
			getButton(IDialogConstants.FINISH_ID).setEnabled(false);
	}
	
	/*
	 * Set the wizard dialog in the middle of the workbench
	 * (non-Javadoc)
	 * @see org.eclipse.jface.wizard.WizardDialog#configureShell(org.eclipse.swt.widgets.Shell)
	 */
	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		
		shell.setSize(550, 500);
		
		//Display the wizard at the center of the active workbench window
		Rectangle bounds = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getBounds();
		Rectangle rectangle = shell.getBounds();
		
		int x = bounds.x + (bounds.width - rectangle.width) / 2;
		int y = bounds.y + (bounds.height - rectangle.height) / 2;
		
		shell.setLocation(x, y);
	}
}
