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
/**
 * 
 */
package org.polarsys.kitalpha.report.ui.views;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TreeColumn;
import org.polarsys.kitalpha.report.model.LogEntry;
import org.polarsys.kitalpha.report.ui.description.ColumnDescription;

/**
 * @author Thomas Guiu
 * 
 */
public class ReportTableSorter extends ViewerSorter {

	private final String key;

	public ReportTableSorter(String key) {
		this.key = key;
	}

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		TreeViewer treeViewer = (TreeViewer) viewer;
		TreeColumn sortColumn = treeViewer.getTree().getSortColumn();
		if (sortColumn == null) {
			return 0;
		}
		ColumnDescription desc = (ColumnDescription) sortColumn.getData(key);
		String name1 = desc.getText((LogEntry) e1);
		String name2 = desc.getText((LogEntry) e2);
		if (name1 == null) {
			name1 = "";
		}
		if (name2 == null) {
			name2 = "";
		}
		if (treeViewer.getTree().getSortDirection() == SWT.UP) {
			return getComparator().compare(name1, name2);
		}
		return getComparator().compare(name2, name1);
	}
}
