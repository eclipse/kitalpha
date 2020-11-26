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

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.SWT;
import org.polarsys.kitalpha.report.ui.Activator;
import org.polarsys.kitalpha.report.ui.ReportImages;

/**
 * @author Thomas Guiu
 * 
 */
public class SaveReportListAction extends FileAction {

	public SaveReportListAction(ReportsView view) {
		super(view);
		setToolTipText("Save reports to a file");
		setImageDescriptor(Activator.getDefault().getImageDescriptor(ReportImages.IMG_SAVE));
		setDisabledImageDescriptor(Activator.getDefault().getImageDescriptor(ReportImages.IMG_SAVE_DISABLED));
	}

	@Override
	protected void doRun(String filename) throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createFileURI(filename);
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().addAll(EcoreUtil.copyAll(view.getDisplayedReports()));
		resource.save(Collections.emptyMap());
		view.refreshView();
	}

	@Override
	protected int getDialogStyle() {
		return SWT.SAVE;
	}

}
