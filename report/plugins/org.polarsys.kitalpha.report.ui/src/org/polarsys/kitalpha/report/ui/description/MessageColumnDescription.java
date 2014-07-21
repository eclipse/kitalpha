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
package org.polarsys.kitalpha.report.ui.description;

import org.eclipse.swt.graphics.Image;
import org.polarsys.kitalpha.report.model.LogEntry;
import org.polarsys.kitalpha.report.ui.dialogs.ReportHelper;

public class MessageColumnDescription extends ColumnDescription {
	public MessageColumnDescription(String label, String id, int alignment, int size) {
		super(label, id, alignment, size);
	}

	public String getText(LogEntry entry) {
		String fullMessage = entry.getMessage().trim();
		String summary = ReportHelper.getSummary(entry);
		if (summary.equals(fullMessage))
			return fullMessage;
		return summary + " [...]";
	}

	public Image getImage(LogEntry entry) {
		return ReportsUI.getImage(entry.getSeverity());
	}
}