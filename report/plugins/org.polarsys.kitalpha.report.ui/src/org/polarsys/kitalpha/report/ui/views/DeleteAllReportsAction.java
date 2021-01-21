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

package org.polarsys.kitalpha.report.ui.views;

import org.eclipse.jface.action.Action;
import org.polarsys.kitalpha.report.model.ReportList;
import org.polarsys.kitalpha.report.ui.Activator;
import org.polarsys.kitalpha.report.ui.ReportImages;
import org.polarsys.kitalpha.report.ui.description.ReportsUI;

/**
 * @author Thomas Guiu
 * 
 */
public class DeleteAllReportsAction extends Action {

	public DeleteAllReportsAction() {
		setToolTipText("Delete all displayed reports");
		setImageDescriptor(Activator.getDefault().getImageDescriptor(ReportImages.IMG_DELETE_ALL));
		setDisabledImageDescriptor(Activator.getDefault().getImageDescriptor(ReportImages.IMG_DELETE_ALL_DISABLED));
	}

	@Override
	public void run() {
		for (ReportList list : ReportsUI.getDisplayedLists()) {
			list.getReports().clear();
		}
	}

}
