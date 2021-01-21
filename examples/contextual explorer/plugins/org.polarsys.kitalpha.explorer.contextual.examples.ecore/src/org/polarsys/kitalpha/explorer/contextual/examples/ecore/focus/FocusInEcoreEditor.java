/******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *****************************************************************************/

package org.polarsys.kitalpha.explorer.contextual.examples.ecore.focus;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.explorer.contextual.view.focus.IFocusInEditor;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;

/**
 * @author Boubekeur Zendagui
 */
public class FocusInEcoreEditor implements IFocusInEditor {

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.amalgam.explorer.contextual.view.focus.IFocusInEditor#accept(org.eclipse.ui.IEditorPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public boolean accept(IEditorPart activeEditor_p, ISelection selection_p) {
		IStructuredSelection sSelection = (IStructuredSelection) selection_p;
		Object firstElement = sSelection.getFirstElement();
		return activeEditor_p instanceof EcoreEditor && (firstElement instanceof EModelElement);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.amalgam.explorer.contextual.view.focus.IFocusInEditor#focusInEditor(org.eclipse.ui.IEditorPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public boolean focusInEditor(IEditorPart activeEditor_p, ISelection selection_p) {
		try {
			EcoreEditor editor = (EcoreEditor) activeEditor_p;
			Object firstElement = ((IStructuredSelection) selection_p).getFirstElement();
			if (firstElement instanceof EObject)
			{
				List<Object> parents = new ArrayList<Object>();
				EObject element = (EObject) firstElement;
				parents.add(element);
				while (element.eContainer() != null) 
				{
					element = element.eContainer();
					parents.add(0, element);
				}
				ResourceSet input = (ResourceSet) editor.getViewer().getInput();
				parents.add(0, input.getResources().get(0));
				TreePath treePath = new TreePath(parents.toArray());
				TreeSelection selection = new TreeSelection(treePath);
				editor.getViewer().setSelection(selection, true);
			}
			return true;
		} 
		catch (Exception e) 
		{
			return false;
		} 
	}

}
