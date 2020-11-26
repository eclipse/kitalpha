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

import java.util.Set;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Control;
import org.polarsys.kitalpha.report.ui.Activator;
import org.polarsys.kitalpha.report.ui.ReportImages;
import org.polarsys.kitalpha.report.ui.description.ColumnDescription;
import org.polarsys.kitalpha.report.ui.description.ReportsUI;

/**
 * @author Thomas Guiu
 * 
 */
public class ManageColumnsAction extends MenuCreatorAction {

	private final ReportsView view;

	public ManageColumnsAction(ReportsView view) {
		this.view = view;
		setToolTipText("Manage columns");
		setImageDescriptor(Activator.getDefault().getImageDescriptor(ReportImages.IMG_MANAGR_COLUMNS));
	}

	@Override
	protected void fillMenu(Control parent) {
		Set<String> displayedColumns = ReportsUI.getDisplayedColumns();
		for (ColumnDescription desc : ReportsUI.getAvailableColumns()) {
			ColumnAction action = new ColumnAction(desc);
			action.setChecked(displayedColumns.contains(desc.getId()));
			addActionToMenu(menu, action);
		}
	}

	class ColumnAction extends Action {

		private final ColumnDescription desc;

		public ColumnAction(ColumnDescription desc) {
			super(desc.getLabel(), AS_CHECK_BOX);
			this.desc = desc;
		}

		@Override
		public void run() {
			String id = desc.getId();
			if (ReportsUI.getDisplayedColumns().contains(id)) {
				ReportsUI.getDisplayedColumns().remove(id);
				view.deleteColumn(id);
			} else {
				ReportsUI.getDisplayedColumns().add(id);
				view.createColumn(id);
			}

			view.refreshView();
		}

	}

}
