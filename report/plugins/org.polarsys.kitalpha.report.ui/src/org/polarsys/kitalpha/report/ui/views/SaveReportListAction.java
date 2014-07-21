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

	protected void doRun(String filename) throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createFileURI(filename);
		Resource resource = resourceSet.createResource(uri);
		// for (LogEntry entry : view.getDisplayedReports())
		// resource.getContents().add(EcoreUtil.c);
		resource.getContents().addAll(EcoreUtil.copyAll(view.getDisplayedReports()));
		resource.save(Collections.emptyMap());
		view.refreshView();
	}

	@Override
	protected int getDialogStyle() {
		return SWT.SAVE;
	}

}
