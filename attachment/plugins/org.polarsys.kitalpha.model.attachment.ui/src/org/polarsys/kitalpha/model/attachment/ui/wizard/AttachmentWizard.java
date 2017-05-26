/*******************************************************************************
 * Copyright (c) 2014, 2017 Thales Global Services S.A.S.
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.diffmerge.api.Role;
import org.eclipse.emf.diffmerge.api.diff.IDifference;
import org.eclipse.emf.diffmerge.ui.EMFDiffMergeUIPlugin;
import org.eclipse.emf.diffmerge.ui.setup.ComparisonSetup;
import org.eclipse.emf.diffmerge.ui.setup.ComparisonSetupManager;
import org.eclipse.emf.diffmerge.ui.specification.IComparisonMethod;
import org.eclipse.emf.diffmerge.ui.specification.IComparisonMethodFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.Wizard;
import org.polarsys.kitalpha.model.attachment.ui.Activator;
import org.polarsys.kitalpha.model.attachment.ui.Messages;
import org.polarsys.kitalpha.model.attachment.ui.merge.MergeCommand;
import org.polarsys.kitalpha.model.attachment.ui.merge.OpenConflictEditorRunnable;
import org.polarsys.kitalpha.model.common.commands.action.ModelCommand;

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

	private ModelCommand getCommand(String id) throws CoreException {
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor("org.polarsys.kitalpha.model.common.commands.definition");
		for (IConfigurationElement elt : configurationElements) {
			String attribute = elt.getAttribute("id");
			if (attribute != null && id.equals(attribute)) {
				return (ModelCommand) elt.createExecutableExtension("class");
			}
		}
		return null;
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
		final Collection<IDifference> conflicts = new ArrayList<IDifference>();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					URI uri = URI.createPlatformResourceURI(modelPage.getTargetFile().getFullPath().toString(), false);
					Resource resource = domain.getResourceSet().getResource(uri, true);
					EcoreUtil.resolveAll(resource);

					getCommand("org.polarsys.kitalpha.model.common.commands.contrib.detachment.checkFileResourceAttributes").exec(null, resource, monitor);
					getCommand("org.polarsys.kitalpha.model.actions.contrib.detachment.backupAndSave").exec(null, resource, monitor);

					domain.getCommandStack().execute(new MergeCommand((TransactionalEditingDomain) domain, method, viewpointPage.analysisResult.getSelectedUris(), conflicts, monitor));
				} catch (Exception e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(false, false, op);
			if (!conflicts.isEmpty()) {
				getContainer().getShell().getDisplay().asyncExec(new OpenConflictEditorRunnable(method, conflicts));
			}
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), Messages.error_dialog_title, realException.getMessage());
			Activator.LOG.logError(e);
			return false;
		}

		return true;
	}

}
