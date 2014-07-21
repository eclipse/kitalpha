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
/**
 * 
 */
package org.polarsys.kitalpha.ad.viewpoint.ui.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
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

	private final List<Object> selectedObjects = new ArrayList<Object>();
	private final List<ISelectionListener> listeners = new ArrayList<ISelectionListener>();
	private final ISelectionListener listener;

	public DefaultSelectionProvider() {
		super();
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		selectionService.addSelectionListener(listener = new ISelectionListener() {

			public void selectionChanged(IWorkbenchPart part, ISelection selection) {
				if (part instanceof ViewpointView)
					return;
				selectedObjects.clear();

				if (selection instanceof IStructuredSelection) {
					for (Object obj : ((IStructuredSelection) selection).toArray())
						selectedObjects.add(obj);
				}
				for (ISelectionListener listener : listeners)
					listener.selectionChanged(part, selection);
			}
		});
	}

	public List<Object> getSelection() {
		List<Object> result = new ArrayList<Object>();
		for (Object obj : selectedObjects) {
			result.add(obj);
		}
		return result;
	}

	public void addListener(ISelectionListener listener) {
		listeners.add(listener);
	}

	public void removeListener(ISelectionListener listener) {
		listeners.remove(listener);
	}

	public void dispose() {
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		selectionService.removeSelectionListener(listener);
	}

}
