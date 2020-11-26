/*******************************************************************************
 * Copyright (c) 2014, 2017 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.model.detachment.ui.editor;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.SharedHeaderFormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;
import org.polarsys.kitalpha.model.common.commands.registry.WorkflowType;
import org.polarsys.kitalpha.model.common.commands.runner.ModelCommandRunner;
import org.polarsys.kitalpha.model.detachment.ui.Activator;
import org.polarsys.kitalpha.model.detachment.ui.Messages;
import org.polarsys.kitalpha.model.detachment.ui.page.AbstractDetachmentFormPage;
import org.polarsys.kitalpha.model.detachment.ui.registry.ModelDetachmentPageRegistry;


/**
 * @author Faycal Abka
 */
public class ModelDetachmentEditor extends SharedHeaderFormEditor {
	
	private static final Logger LOGGER = Logger.getLogger(ModelDetachmentEditor.class);

	private static final String IMG_PATH = "icons/run_detach.png";	//$NON-NLS-1$
	
	private Action perfomDetachment;
	
	public void initAndLaunchDetachmentAction(final Resource resource){

		if (perfomDetachment == null){
			
			perfomDetachment = new Action() {


				@Override
				public void run(){

					final ModelCommandRunner actionRunner = new ModelCommandRunner();
					
					final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

					boolean canPerform = MessageDialog.openQuestion(shell, Messages.QUESTION_DIALOG_TITLE, Messages.QUESTION_IN_DIALOG);
					
					if (canPerform){
						try {
							PlatformUI.getWorkbench().getProgressService()
								.busyCursorWhile(new IRunnableWithProgress() {
								
								@Override
								public void run(IProgressMonitor monitor) throws InvocationTargetException,
										InterruptedException {
										try {
											
											monitor.setCanceled(false);
											EnumSet<WorkflowType> workflows = EnumSet.of(WorkflowType.ALL, WorkflowType.DETACHMENT);
											
											DetachmentEditorInput input = (DetachmentEditorInput)getEditorInput();
											actionRunner.run(input.getAnalysis(), resource, workflows, monitor);
											
											Display.getDefault().syncExec(new Runnable() {
												
												@Override
												public void run() {
													MessageDialog.openConfirm(shell, Messages.CONFIRM_DIALOG_TITLE, Messages.FINISH_DETACHMENT_MESSAGE);
													getEditorSite().getPage().closeEditor(ModelDetachmentEditor.this, false);
												}
											});
											
											
											
										} catch (final ModelCommandException e) {

											Display.getDefault().syncExec(new Runnable() {
												
												@Override
												public void run() {
													
													IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
													ErrorDialog.openError(shell, Messages.ERROR_DIALOG_TITLE, e.getMessage(), status);
													LOGGER.error(e.getMessage(), e);
												}
											});
											
											
											LOGGER.error(e.getMessage(), e);
										}
								}
							});
							
						} catch (InvocationTargetException | InterruptedException e) {
							LOGGER.error(e.getMessage(), e);
						}
						
					}
				}
			};

			perfomDetachment.setToolTipText(Messages.PERFORM_DETACHMENT);
			perfomDetachment.setText(Messages.PERFORM_DETACHMENT);
			
			
			Bundle currentBundle = Activator.getDefault().getBundle();
			URL url = FileLocator.find(currentBundle, new Path(IMG_PATH), null);
			
			perfomDetachment.setImageDescriptor(ImageDescriptor.createFromURL(url));

			getHeaderForm().getForm().getForm().getToolBarManager().add(perfomDetachment);
			getHeaderForm().getForm().getForm().getToolBarManager().update(true);
			getHeaderForm().getForm().getForm().setToolBarVerticalAlignment(SWT.RIGHT);
			getHeaderForm().reflow(true);
		}
		
	}
	
	
	
	@Override
	protected void createHeaderContents(IManagedForm headerForm) {
		FormToolkit tk = headerForm.getToolkit();
		tk.decorateFormHeading(headerForm.getForm().getForm());
		headerForm.getForm().getForm().setText(Messages.HEADER_EDITOR_TITLE);
		getHeaderForm().getForm().getForm().getToolBarManager().update(true);
	}

	@Override
	protected void addPages() {
		
		Set<AbstractDetachmentFormPage> pageRegistry = ModelDetachmentPageRegistry.INSTANCE.initRegistry(this);
		//Sort pages
		List<AbstractDetachmentFormPage> sortedPages = new ArrayList<>(pageRegistry);
		Collections.sort(sortedPages, new Comparator<AbstractDetachmentFormPage>() {

			@Override
			public int compare(AbstractDetachmentFormPage arg0, AbstractDetachmentFormPage arg1) {
				return arg0.getPartName().compareTo(arg1.getPartName());
			}
		});
		
		for (AbstractDetachmentFormPage detachmentPage : sortedPages) {
			try {
				addPage(detachmentPage);
			} catch (PartInitException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		//This editor can not be saved
	}

	@Override
	public void doSaveAs() {
		//This editor can not be saved
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
	
	@Override
	public boolean isDirty() {
		return false;
	}
}
