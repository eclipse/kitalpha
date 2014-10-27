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

package org.polarsys.kitalpha.model.attachment.ui.wizard;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.diffmerge.api.Role;
import org.eclipse.emf.diffmerge.ui.EMFDiffMergeUIPlugin;
import org.eclipse.emf.diffmerge.ui.setup.ComparisonSetup;
import org.eclipse.emf.diffmerge.ui.setup.ComparisonSetupManager;
import org.eclipse.emf.diffmerge.ui.specification.IComparisonMethod;
import org.eclipse.emf.diffmerge.ui.specification.IComparisonMethodFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.Wizard;
import org.polarsys.kitalpha.model.attachment.ui.Messages;
import org.polarsys.kitalpha.model.attachment.ui.merge.MergeCommand;

/**
 * @author Thomas Guiu
 * 
 */
public class AttachmentWizard extends Wizard {

	private List<IFile> files;

	private ModelPage modelPage;
	ViewpointPage viewpointPage;

	public AttachmentWizard(List<IFile> files) {
		this.files = files;
		setNeedsProgressMonitor(true);
		setWindowTitle(Messages.wizard_title);

	}

	@Override
	public void addPages() {
		addPage(modelPage = new ModelPage(files));
		addPage(viewpointPage = new ViewpointPage());
	}

	@Override
	public boolean performFinish() {
		ComparisonSetupManager manager = EMFDiffMergeUIPlugin.getDefault().getSetupManager();
		ComparisonSetup setup = manager.createComparisonSetup(modelPage.getTargetFile(), modelPage.getSourceFile(), modelPage.getAncestorFile());
		IComparisonMethodFactory comparisonMethodFactory = setup.getApplicableComparisonMethodFactories().get(0);
		final IComparisonMethod method = comparisonMethodFactory.createComparisonMethod(setup.getScopeDefinition(Role.TARGET), setup.getScopeDefinition(Role.REFERENCE), setup.getScopeDefinition(Role.ANCESTOR));
		final EditingDomain domain = method.getEditingDomain();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					domain.getCommandStack().execute(new MergeCommand((TransactionalEditingDomain) domain, method, viewpointPage.analysisResult.getSelectedUris(), monitor));
				} catch (Exception e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(false, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), Messages.error_dialog_title, realException.getMessage());
			return false;
		}

		return true;
	}

}
