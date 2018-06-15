/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
/**
 * 
 */
package org.polarsys.kitalpha.ad.viewpoint.ui.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.ViewpointView;

/**
 * @author Thomas Guiu
 * 
 */
public class DefaultSelectionProvider implements AFSelectionProvider {

	protected final List<Object> selectedObjects = new ArrayList<>();
	private final List<ISelectionListener> listeners = new ArrayList<>();
	private final ISelectionListener listener;

	public DefaultSelectionProvider() {
		super();
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		listener = (part, selection) -> {
			if (part instanceof ViewpointView){
				return;
			}
			selectedObjects.clear();

			if (selection instanceof IStructuredSelection) {
				for (Object obj : ((IStructuredSelection) selection).toArray()) {
					selectedObjects.add(obj);
				}
			}
			for (ISelectionListener l : listeners){
				l.selectionChanged(part, selection);
			}
		};
		selectionService.addSelectionListener(listener);

		// update object state accordingly to the platform state
		IWorkbenchPart activePart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().getActivePart();
		listener.selectionChanged(activePart, selectionService.getSelection());
	}

	/**
	 * Returns only EMF objects
	 */
	@Override
	public List<Object> getSelection() {
		List<Object> result = new ArrayList<>();
		for (Object obj : selectedObjects) {
			if (obj instanceof EObject){
				result.add(obj);
			}
		}
		return result;
	}

	@Override
	public void addListener(ISelectionListener listener) {
		listeners.add(listener);
	}

	@Override
	public void removeListener(ISelectionListener listener) {
		listeners.remove(listener);
	}

	@Override
	public void dispose() {
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		selectionService.removeSelectionListener(listener);
	}

}
