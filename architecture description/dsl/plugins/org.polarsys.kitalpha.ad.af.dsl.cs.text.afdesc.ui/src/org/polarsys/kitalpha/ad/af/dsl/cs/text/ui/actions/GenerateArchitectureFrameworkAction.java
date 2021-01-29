/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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

/**
 * 
 * @author Amine Lajmi
 *
 */
public class GenerateArchitectureFrameworkAction implements IEditorActionDelegate{
		
	@Inject
	private XtextEditor currentEditor;
	
	ISelection currentSelection;

	public GenerateArchitectureFrameworkAction() {
		super();
	}
		
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (currentEditor != null) {
			IFile file = currentEditor.getEditorInput().getAdapter(IFile.class);
			currentSelection = new StructuredSelection(file);
		}
	}

	@Override
	public void run(IAction action) {
		if (currentEditor != null) {
			IFile file = currentEditor.getEditorInput().getAdapter(IFile.class);
			currentSelection = new StructuredSelection(file);
		}
	}

	@Override
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		if (targetEditor instanceof XtextEditor) {
			currentEditor = (XtextEditor) targetEditor;
		}
	}	
}
