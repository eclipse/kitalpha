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
package org.polarsys.kitalpha.report.ui.description;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.polarsys.kitalpha.report.model.LogEntry;

public class DateColumnDescription extends ColumnDescription {
	protected final DateFormat dateFormat;

	public DateColumnDescription(String label, String id, int alignment, int size) {
		this(label, id, alignment, size, "yyyy-MM-dd hh:mm:ss");
	}

	public DateColumnDescription(String label, String id, int alignment, int size, String dateFormat) {
		super(label, id, alignment, size);
		this.dateFormat = new SimpleDateFormat(dateFormat);
	}

	@Override
	public String getText(LogEntry entry) {
		Date date = entry.getDate();
		return dateFormat.format(date);
	}
}