/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs;

import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ModelManager;


/**
 * @author Thomas Guiu
 * 
 */
public class ReportTab extends AbstractTab {

	public ReportTab(ModelManager wsManager, IViewSite site) {
		super(null);
	}

	@Override
	public void createTab(FormToolkit toolkit, CTabFolder folder) {
		Composite composite = createTab(toolkit, folder, "Report", (String) null);
		GridLayout clayout = new GridLayout();
		clayout.numColumns = 2;
		composite.setLayout(clayout);

	}

	@Override
	public void init() {
	}

	@Override
	public void workspaceHasChanged() {
		super.workspaceHasChanged();
	}

}
