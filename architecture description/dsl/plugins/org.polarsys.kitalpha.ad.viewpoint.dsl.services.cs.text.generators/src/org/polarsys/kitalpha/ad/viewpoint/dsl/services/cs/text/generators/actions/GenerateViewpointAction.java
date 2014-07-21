/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.Messages;

import org.polarsys.kitalpha.ad.viewpoint.dsl.services.action.popup.LaunchVPGenerationAndBuildAction;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class GenerateViewpointAction extends BaseSelectionListenerAction implements IObjectActionDelegate{

	ISelection fakeSelection;
	
	LaunchVPGenerationAndBuildAction delegate;
	
	public GenerateViewpointAction() {
		super(Messages.ViewpointDSLActions_GenerateViewpointAction_DefaultTitle);
		delegate = new LaunchVPGenerationAndBuildAction();	
	}
	
	protected GenerateViewpointAction(String text) {
		super(text);
	}

	public void run(IAction action) {
		IFile file = null;
		Iterator<?> iterator = ((StructuredSelection)fakeSelection).iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			if (object instanceof IFile) {
				file = (IFile) object;
				break;
			}
		}
		IFile standalone = ResourceHelper.getStandaloneFile(file);
		if (standalone != null) {
			fakeSelection = new StructuredSelection(standalone);
			delegate.selectionChanged(action, fakeSelection);
			delegate.run(action);
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {		
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		fakeSelection = targetPart.getSite().getWorkbenchWindow().getSelectionService().getSelection();	
	}
}
