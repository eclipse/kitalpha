/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.report.ui.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.polarsys.kitalpha.report.ui.Activator;
import org.polarsys.kitalpha.report.ui.ReportImages;

/**
 * @author Thomas Guiu
 * 
 */
public class DeleteReportsAction extends Action {

	private final ReportsView view;

	public DeleteReportsAction(ReportsView view) {
		this.view = view;
		setToolTipText("Delete selected reports");
		setImageDescriptor(Activator.getDefault().getImageDescriptor(ReportImages.IMG_DELETE));
		setDisabledImageDescriptor(Activator.getDefault().getImageDescriptor(ReportImages.IMG_DELETE_DISABLED));
	}

	@Override
	public void run() {
		for (Object obj : view.getSelection().toArray()) {
			EcoreUtil.delete((EObject) obj, true);
		}
		view.refreshView();

	}

}
