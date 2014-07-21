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
package org.polarsys.kitalpha.ad.viewpoint.sdk.actions;

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.CommonNavigator;

public class DebugAction implements IObjectActionDelegate {

	private Shell shell;
	private IProject project;

	/**
	 * Constructor for Action1.
	 */
	public DebugAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		CommonNavigator view = (CommonNavigator) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("melody.project.explorer");
		view.getCommonViewer().refresh();

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		project = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sselect = (IStructuredSelection) selection;
			if (sselect.size() == 1) {
				if (sselect.getFirstElement() instanceof IProject)

					project = (IProject) sselect.getFirstElement();
				else if (sselect.getFirstElement() instanceof IJavaProject)
					project = ((IJavaProject) sselect.getFirstElement()).getProject();
			}
		}
	}

}
