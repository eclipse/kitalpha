/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.action.popup.LaunchVPGenerationAndBuildAction;

import com.google.inject.Inject;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class GenerateViewpointEditorAction implements IEditorActionDelegate{
		
	@Inject
	private XtextEditor currentEditor;
	
	ISelection currentSelection;

	LaunchVPGenerationAndBuildAction delegate;
	
	public GenerateViewpointEditorAction() {
		super();
		delegate = new LaunchVPGenerationAndBuildAction();	
	}
		
	public void selectionChanged(IAction action, ISelection selection) {
		if (currentEditor != null && currentEditor.getEditorInput()!=null) {
			IFile file = currentEditor.getEditorInput().getAdapter(IFile.class);
			IFile standalone = ResourceHelper.getStandaloneFile(file);
			if (standalone!=null) {
				currentSelection = new StructuredSelection(standalone);
				delegate.selectionChanged(action, currentSelection);
			}
		}
	}

	public void run(IAction action) {
		if (currentEditor != null) {
			IFile file = currentEditor.getEditorInput().getAdapter(IFile.class);
			IFile standalone = ResourceHelper.getStandaloneFile(file);
			if (standalone!=null) {
				currentSelection = new StructuredSelection(standalone);
				delegate.selectionChanged(action, currentSelection);
				delegate.run(action);
			}
		}
	}

	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		if (targetEditor instanceof XtextEditor) {
			currentEditor = (XtextEditor) targetEditor;
		}
	}
}
