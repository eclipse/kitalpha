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

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces.AbstractDetachmentWizard;
import org.polarsys.kitalpha.ad.services.detachment.core.services.IDetachmentService;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback;
import org.polarsys.kitalpha.ad.services.detachment.ui.messages.Messages;
import org.polarsys.kitalpha.ad.services.detachment.ui.pages.DetachmentUndefinedReferencesPage;
import org.polarsys.kitalpha.ad.services.detachment.ui.pages.DetachmentViewpointTreePage;

/**
 * @author Matthieu Helleboid
 */
public class DetachmentWizard extends Wizard {

	IDetachmentService detachment;
	IWizardPage undefReferencesPages;	//to get the selection of check button
	IWizardPage viewpointDetachmentPage;

	public DetachmentWizard(IDetachmentService detachment) {
		//TODO: Use internationalization for the title
		
		this.detachment = detachment;
		this.undefReferencesPages = null;
		this.viewpointDetachmentPage = null;
		
		setWindowTitle("Viewpoint detachment");
		setNeedsProgressMonitor(true);
	}

	@Override
	public void addPages() {
		
		Collection<AbstractDetachmentWizard> contributedWizardPages = detachment.getWizardPages();
		
		//Unknown reference page is the first page
		IFeedback messages = detachment.getUndefinedReferences();
		
		if (messages != null && 
				messages.getFeedbackMessages() != null &&
				!messages.getFeedbackMessages().isEmpty()){
			undefReferencesPages = new DetachmentUndefinedReferencesPage(messages);
			addPage(undefReferencesPages);
		}
		
		if (contributedWizardPages != null &&
				!contributedWizardPages.isEmpty()){
			
			for (AbstractDetachmentWizard newWizardPages : contributedWizardPages) {
				addPage(newWizardPages);
			}
			
		}
		
		//Detach viewpoints page is the last page
		viewpointDetachmentPage = new DetachmentViewpointTreePage(detachment);
		
		addPage(viewpointDetachmentPage);
	}

	@Override
	public boolean performFinish() {
		
		final boolean removeUnknownReferences;
		if (undefReferencesPages != null)
		{
			removeUnknownReferences = ((DetachmentUndefinedReferencesPage)undefReferencesPages).getRemoveUndefRefSelection();
		} 
		else 
		{
			removeUnknownReferences = false;
		}
		
		try {
			getContainer().run(true, true, new IRunnableWithProgress() {
				
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException,
						InterruptedException {
					try {
						detachment.performDetachment(removeUnknownReferences, monitor);
					} catch (IOException e) {
						showIOError(Messages.MSG_ERROR_SAVE_CLEANED_RESOURCE, e);
						e.printStackTrace();
					} catch (CoreException e) {
						showIOError(Messages.MSG_ERROR_BACKUP_RESOURCE, e);
						e.printStackTrace();
					}
					
				}
			});
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.dispose();
		return true;
	}
	
	@Override
	public boolean canFinish(){

		boolean finish = true;
		
		IWizardPage[] pages = getPages();
		
		
		for (int i = 0; i < pages.length; i++) {
			finish = finish && pages[i].isPageComplete();
		}
		
		finish = finish && (getContainer().getCurrentPage() == viewpointDetachmentPage);

		
		return finish;
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}
	
	private void showIOError(final String message, final Throwable t){
		
		final String PLUGIN_IO_ID = "org.polarsys.kitalpha.ad.services.detachment.io";
		
		Display.getDefault().syncExec(new Runnable() {
			
			@Override
			public void run() {
				IStatus status = new Status(IStatus.ERROR, PLUGIN_IO_ID, t.getMessage(), t);
				ErrorDialog.openError(Display.getDefault().getActiveShell(), Messages.MODEL_ERROR_DIALOG_TITLE, message, status);
			}
		});
	}
}
