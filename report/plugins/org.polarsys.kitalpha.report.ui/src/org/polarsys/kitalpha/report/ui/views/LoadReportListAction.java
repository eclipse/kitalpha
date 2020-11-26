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

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.SWT;
import org.polarsys.kitalpha.report.model.LogEntry;
import org.polarsys.kitalpha.report.model.ReportList;
import org.polarsys.kitalpha.report.registry.ReportRegistry;
import org.polarsys.kitalpha.report.ui.Activator;
import org.polarsys.kitalpha.report.ui.ReportImages;
import org.polarsys.kitalpha.report.ui.description.ReportsUI;

/**
 * @author Thomas Guiu
 * 
 */
public class LoadReportListAction extends FileAction {
	public static final String LOADED_REPORT_LIST = "loaded.report.list";

	public LoadReportListAction(ReportsView view) {
		super(view);
		setToolTipText("Load reports from a file");
		setImageDescriptor(Activator.getDefault().getImageDescriptor(ReportImages.IMG_LOAD));
		setDisabledImageDescriptor(Activator.getDefault().getImageDescriptor(ReportImages.IMG_LOAD_DISABLED));
	}

	@Override
	protected void doRun(String filename) throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createFileURI(filename);
		Resource resource = resourceSet.getResource(uri, true);
		resource.load(Collections.emptyMap());
		EcoreUtil.resolveAll(resource);

		final ReportList list = ReportRegistry.INSTANCE.getList(LOADED_REPORT_LIST);
		for (EObject object : new ArrayList<EObject>(resource.getContents())) {
			if (object instanceof LogEntry) {
				LogEntry entry = (LogEntry) object;
				list.getReports().add(entry);
			}
		}

		resource.unload();

		ReportsUI.showList(list);
	}

	@Override
	protected int getDialogStyle() {
		return SWT.OPEN;
	}

}
