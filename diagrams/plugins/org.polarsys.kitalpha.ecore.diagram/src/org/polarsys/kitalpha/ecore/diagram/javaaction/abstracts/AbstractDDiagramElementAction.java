/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ecore.diagram.javaaction.abstracts;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.polarsys.kitalpha.ecore.diagram.internal.FocusEdgeItemProviderAdapterFactory;

public abstract class AbstractDDiagramElementAction extends AbstractFocusExternalJavaAction {
	
	protected abstract Collection<DEdge> filter(Collection<DEdge> collection);

	@Override
	protected void run(Collection<? extends EObject> context, Map<String, Object> parameters) {
		Collection<DEdge> dCollection = getElement(parameters);

		Collection<DEdge> collection = filter(dCollection);
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(window.getShell(), new AdapterFactoryLabelProvider(new FocusEdgeItemProviderAdapterFactory()));
		dialog.setMessage("Select elements :");
		dialog.setMultipleSelection(true);
		dialog.setTitle("Selection wizard");
		dialog.setElements(collection.toArray());

		if (dialog.open() == Window.OK) 
		{
			Set<EObject> selectedElements = new HashSet<EObject>();
			//FIXME: check this collection initialization
			for (Object object : Arrays.asList(dialog.getResult())) 
			{
				if (object instanceof EObject) {
					selectedElements.add((EObject)object);
				}
			}
			RecordingCommand command = getCommand((TransactionalEditingDomain) editingDomain, selectedElements);
			editingDomain.getCommandStack().execute(command);
		}
	}

	@SuppressWarnings("unchecked")
	private Collection<DEdge> getElement(Map<String, Object> parameters) {
		Collection<DEdge> result = (Collection<DEdge>) parameters.get(ELEMENT);
		if (result != null) {
			return result;
		} else {
			return Collections.emptyList();
		}
	}
}
