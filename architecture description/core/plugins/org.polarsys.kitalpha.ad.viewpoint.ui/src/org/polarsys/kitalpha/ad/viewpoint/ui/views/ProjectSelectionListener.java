/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ProjectUtils;
import org.polarsys.kitalpha.ad.viewpoint.handlers.workspace.WorkspaceManager;


/**
 * @author Thomas Guiu
 * 
 */
public class ProjectSelectionListener implements ISelectionListener {

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (!(selection instanceof IStructuredSelection)){
			return;
		}
		IStructuredSelection sselection = (IStructuredSelection) selection;
		if (sselection.size() > 1){
			return;
		}
		if (part instanceof ViewpointView){
			return;
		}
		if (sselection.isEmpty()){
			projectSelected(null);
		} else {
			analyseElement(sselection.getFirstElement());
		}
	}

	private void analyseElement(Object firstElement) {
		if (firstElement instanceof IResource) {
			IResource res = (IResource) firstElement;
			IProject project = res.getProject();
			projectSelected(project);
			return ;
		}
		if (firstElement instanceof IAdaptable) {
			IAdaptable adaptable = (IAdaptable) firstElement;
			IResource res = adaptable.getAdapter(IResource.class);
			if (res != null) {
				IProject project = res.getProject();
				projectSelected(project);
				return;
			}
			EObject obj = adaptable.getAdapter(EObject.class);
			if (obj != null) {
				firstElement = obj;
			}
		}
		if (firstElement instanceof EObject) {
			EObject eobj = (EObject) firstElement;
			IProject project = ProjectUtils.getContainingProject(eobj);
			projectSelected(project);
		}
	}

	private void projectSelected(IProject project) {
		WorkspaceManager.INSTANCE.projectSelected(project);

	}

}
