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

package org.polarsys.kitalpha.report.ui.dialogs;

import org.eclipse.swt.widgets.Shell;
import org.polarsys.kitalpha.report.model.LogEntry;
import org.polarsys.kitalpha.report.utils.ReportFactory;

/**
 * @author Thomas Guiu
 * 
 */
public class ReportHelper {

	private ReportHelper() {
		super();
	}

	public static void logAndDisplayError(Shell parent, ReportFactory factory, String message) {
		ReportDialog.openError(parent, factory.logError(message));
	}

	public static void logAndDisplayError(Shell shell, ReportFactory factory, Throwable e) {

		ReportDialog.openError(shell, factory.logError(e));
	}

	public static String getSummary(LogEntry entry) {
		String message = entry.getMessage().trim();
		int indexOf = message.indexOf('\n');
		if (indexOf == -1)
			return message;
		return message.substring(0, indexOf).trim();
	}
}
