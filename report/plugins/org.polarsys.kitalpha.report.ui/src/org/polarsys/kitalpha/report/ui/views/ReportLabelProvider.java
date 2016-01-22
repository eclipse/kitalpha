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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.polarsys.kitalpha.report.model.LogEntry;
import org.polarsys.kitalpha.report.ui.description.ReportsUI;

/**
 * @author S0019531
 */
public class ReportLabelProvider extends LabelProvider implements ITableLabelProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object,
	 *      int)
	 */
	@Override
	public String getColumnText(Object element, int columnIndex) {
		String result = "";
		if (element instanceof LogEntry) {
			LogEntry logEntry = (LogEntry) element;
			switch (columnIndex) { // NOSONAR
			case 0:
				result = logEntry.getMessage();
				break;
			case 1:
				Date date = logEntry.getDate();
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				result = dateFormat.format(date);
			}
		}

		return result;
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		Image image = ReportsUI.getImage(((LogEntry) element).getSeverity());
		return columnIndex == 0 ? image : null;
	}

}
