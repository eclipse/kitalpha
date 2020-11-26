/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.BackwardSynchronizer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.util.GeneratorsUtil;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class BackwardSynchronizerAction extends BaseSelectionListenerAction implements IObjectActionDelegate {
	
	private ISelection selection;
	
	public BackwardSynchronizerAction() {
		super(Messages.ViewpointDSLActions_BackwardSynchronizer_GeneratorMessage);
	}
	
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		selection = targetPart.getSite().getWorkbenchWindow().getSelectionService().getSelection();	
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

	public void run(IAction action) {
		if (selection instanceof IStructuredSelection)
		{
			Object obj = ((IStructuredSelection) selection).getFirstElement();
			if (obj instanceof IFile)
			{
				IFile vpSpecFile = (IFile) obj;
				String projectName = vpSpecFile.getProject().getName();
				
				IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
				
				if (project != null && !XtextProjectHelper.hasNature(project))
					GeneratorsUtil.toggleXtextNature(projectName);
			}
		}
		
		new BackwardSynchronizer().doBackwardSynchronize((IStructuredSelection)selection);
	}
}
