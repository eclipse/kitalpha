/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.tools.ext.strategies.openmodel;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.CommonNavigator;
import org.polarsys.kitalpha.richtext.widget.tools.ext.strategies.Activator;

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

			String viewId = "org.eclipse.sirius.ui.tools.views.model.explorer";
			
			if (viewId != null && !viewId.isEmpty()){
				IViewPart viewPart = page.showView(viewId);
				if ((null != viewPart) && (viewPart instanceof CommonNavigator)) {
					CommonNavigator navigator = (CommonNavigator) viewPart;
					ISelection selection = new StructuredSelection(element);
					navigator.getCommonViewer().setSelection(selection);
				}
			}
		} catch (PartInitException pie) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, pie.getMessage(), pie);
			Activator.getDefault().getLog().log(status);
		}
	}
}
