/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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