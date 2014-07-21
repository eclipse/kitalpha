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

	public String getText(LogEntry entry) {
		return "";
	}

	protected Image getImage(LogEntry entry) {
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