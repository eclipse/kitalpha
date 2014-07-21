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
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.MenuItem;
import org.polarsys.kitalpha.report.model.ReportList;
import org.polarsys.kitalpha.report.registry.ReportRegistry;
import org.polarsys.kitalpha.report.ui.Activator;
import org.polarsys.kitalpha.report.ui.ReportImages;
import org.polarsys.kitalpha.report.ui.description.ReportsUI;

/**
 * @author Thomas Guiu
 * 
 */
class SelectReportDropDownAction extends MenuCreatorAction implements IMenuCreator {

	private final Action selectAction = new SelectReportAction();
	private final Action deselectAction = new DeselectReportAction();
	private final ReportsView view;

	public SelectReportDropDownAction(ReportsView view) {
		super();
		this.view = view;
		setToolTipText("Manage reports providers");
		setImageDescriptor(Activator.getDefault().getImageDescriptor(ReportImages.IMG_CHOOSE_LIST));
		setMenuCreator(this);
	}

	protected void fillMenu(Control parent) {
		for (ReportList list : ReportRegistry.INSTANCE.getLists()) {
			ManageReportAction action = new ManageReportAction(list);
			action.setChecked(ReportsUI.getDisplayedLists().contains(list));
			addActionToMenu(menu, action);
		}
		new MenuItem(menu, SWT.SEPARATOR);
		addActionToMenu(menu, selectAction);
		addActionToMenu(menu, deselectAction);
	}

	class DeselectReportAction extends Action {

		public DeselectReportAction() {
			super("Deselect all");
			setImageDescriptor(Activator.getDefault().getImageDescriptor(ReportImages.IMG_DESELECT_ALL));
		}

		public void run() {
			ReportsUI.hideAllLists();
		}

	}

	class SelectReportAction extends Action {

		public SelectReportAction() {
			super("Select all");
			setImageDescriptor(Activator.getDefault().getImageDescriptor(ReportImages.IMG_SELECT_ALL));
		}

		public void run() {
			ReportsUI.showAllLists();
		}

	}

	class ManageReportAction extends Action {

		private final ReportList list;

		public ManageReportAction(ReportList list) {
			super(list.getId(), AS_CHECK_BOX);
			this.list = list;
		}

		@Override
		public void run() {
			if (ReportsUI.getDisplayedLists().contains(list))
				ReportsUI.hideList(list);
			else
				ReportsUI.showList(list);
		}

	}

}
