/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.report.example.customization;

import org.polarsys.kitalpha.report.example.customization.model.CustomEntry;
import org.polarsys.kitalpha.report.model.LogEntry;
import org.polarsys.kitalpha.report.ui.description.ColumnDescription;

/**
 * @author Thomas Guiu
 * 
 */
public class CommentColumnDescription extends ColumnDescription {
	public CommentColumnDescription(String label, String id, int alignment, int size) {
		super(label, id, alignment, size);
	}

	@Override
	public String getText(LogEntry entry) {
		if (entry instanceof CustomEntry) {
			CustomEntry eentry = (CustomEntry) entry;
			if (eentry.getComment() != null) {
				return eentry.getComment();
			}
		}
		return super.getText(entry);
	}
}