/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.report.example.customization;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.polarsys.kitalpha.report.registry.ReportRegistry;
import org.polarsys.kitalpha.report.ui.description.ReportsUI;

public class NewReportAction implements IObjectActionDelegate {

	/**
	 * Constructor for Action1.
	 */
	public NewReportAction() {
		super();
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// no need
	}

	@Override
	public void run(IAction action) {
		String listId = ExampleReportFactory.INSTANCE.getListId();
		ReportsUI.showList(ReportRegistry.INSTANCE.getList(listId));
		ExampleReportFactory.INSTANCE.logFatalError("My fatal error message", "My comment !", null);
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		//no need
	}

}
