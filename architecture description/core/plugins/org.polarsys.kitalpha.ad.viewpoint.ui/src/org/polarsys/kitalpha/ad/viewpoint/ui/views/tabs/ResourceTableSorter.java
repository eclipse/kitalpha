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

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;

/**
 * @author Thomas Guiu
 * 
 */
public class ResourceTableSorter extends ViewerSorter {

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		TableViewer tableViewer = (TableViewer) viewer;
		ITableLabelProvider lprov = (ITableLabelProvider) tableViewer.getLabelProvider();
		Integer column = (Integer) tableViewer.getTable().getSortColumn().getData();
		String name1 = lprov.getColumnText(e1, column == null ? 0 : column.intValue());
		String name2 = lprov.getColumnText(e2, column == null ? 0 : column.intValue());
		if (name1 == null) {
			name1 = "";
		}
		if (name2 == null) {
			name2 = "";
		}
		if (tableViewer.getTable().getSortDirection() == SWT.UP) {
			return getComparator().compare(name1, name2);
		}
		return getComparator().compare(name2, name1);
	}
}