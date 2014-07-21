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

	public void run() {
		for (ReportList list : ReportsUI.getDisplayedLists()) {
			list.getReports().clear();
		}
	}

}
