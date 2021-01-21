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

import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.graphics.Image;
import org.polarsys.kitalpha.report.model.LogEntry;

public abstract class ColumnDescription {
	private final String label;
	private final int alignment;
	private final int width;
	private final String id;

	public ColumnDescription(String label, String id, int alignment, int size) {
		this.label = label;
		this.id = id;
		this.alignment = alignment;
		this.width = size;
	}

	public String getText(LogEntry entry) { // NOSONAR
		return "";
	}

	protected Image getImage(LogEntry entry) { // NOSONAR
		return null;
	}

	public String getLabel() {
		return label;
	}

	public int getAlignment() {
		return alignment;
	}

	public int getWidth() {
		return width;
	}

	public String getId() {
		return id;
	}

	public void update(ViewerCell cell) {
		LogEntry entry = (LogEntry) cell.getElement();
		cell.setText(getText(entry));
		cell.setImage(getImage(entry));

	}

}