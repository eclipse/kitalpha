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

	public String getText(LogEntry entry) {
		Date date = entry.getDate();
		return dateFormat.format(date);
	}
}