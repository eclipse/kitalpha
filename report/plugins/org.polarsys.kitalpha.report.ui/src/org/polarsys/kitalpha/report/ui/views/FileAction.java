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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.polarsys.kitalpha.report.ui.Activator;

public abstract class FileAction extends Action {

	protected final ReportsView view;

	public FileAction(ReportsView view) {
		this.view = view;
	}

	@Override
	public void run() {
		FileDialog fd = new FileDialog(view.getViewSite().getShell(), getDialogStyle());
		final String filename = fd.open();
		if (filename != null && filename.length() > 0) {
			try {
				doRun(filename);
			} catch (Exception ex) {
				Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, ex.getMessage(), ex));
				MessageDialog.openError(view.getViewSite().getShell(), "Error", ex.getMessage());
			}
		}

	}

	protected abstract int getDialogStyle();
 
	protected abstract void doRun(String filename) throws Exception; // NOSONAR

}