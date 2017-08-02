/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.mde.tools.selection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.CommonNavigator;
import org.polarsys.kitalpha.richtext.mde.tools.internal.extension.ExtensionManager;

public class SelectionRunnable implements Runnable {

	private EObject element;

	public SelectionRunnable(EObject element) {
		this.element = element;
	}

	@SuppressWarnings("synthetic-access")
	public void run() {
		if (null == element) {
			return;
		}

		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (null == window) {
			return;
		}

		IWorkbenchPage page = window.getActivePage();
		if (null == page) {
			return;
		}
		
		try {
			// Gets the right explorer identifier.
			String viewId = ExtensionManager.getExplorerID();
			
			if (viewId != null && !viewId.isEmpty()){
				IViewPart viewPart = page.showView(viewId);
				if ((null != viewPart) && (viewPart instanceof CommonNavigator)) {
					CommonNavigator navigator = (CommonNavigator) viewPart;
					ISelection selection = new StructuredSelection(element);
					navigator.getCommonViewer().setSelection(selection);
				}
			}
		} catch (PartInitException pie) {
			//TODO log
		}
	}
}
