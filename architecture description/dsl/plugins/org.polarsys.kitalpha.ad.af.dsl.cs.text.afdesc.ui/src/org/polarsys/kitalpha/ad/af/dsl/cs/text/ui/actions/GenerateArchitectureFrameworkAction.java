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

package org.polarsys.kitalpha.ad.af.dsl.cs.text.ui.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.inject.Inject;
//import org.polarsys.kitalpha.ad.af.dsl.servicies.action.popup.GenerateArchitectureFramework;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class GenerateArchitectureFrameworkAction implements IEditorActionDelegate{
		
	@Inject
	private XtextEditor currentEditor;
	
	ISelection currentSelection;

	//GenerateArchitectureFramework delegate;
	
	public GenerateArchitectureFrameworkAction() {
		super();
		//delegate = new GenerateArchitectureFramework();	
	}
		
	public void selectionChanged(IAction action, ISelection selection) {
		if (currentEditor != null && currentEditor instanceof XtextEditor) {
			IFile file = (IFile) currentEditor.getEditorInput().getAdapter(IFile.class);
			currentSelection = new StructuredSelection(file);
			//delegate.selectionChanged(action, currentSelection);
		}
	}

	public void run(IAction action) {
		if (currentEditor != null) {
			if (currentEditor instanceof XtextEditor) {
				IFile file = (IFile) currentEditor.getEditorInput().getAdapter(IFile.class);
				currentSelection = new StructuredSelection(file);
				//delegate.selectionChanged(action, currentSelection);
			}	
		}
		//delegate.run(action);
	}

	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		if (targetEditor instanceof XtextEditor) {
			currentEditor = (XtextEditor) targetEditor;
		}
	}	
}
