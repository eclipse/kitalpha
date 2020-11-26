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

package org.polarsys.kitalpha.ad.viewpoint.ui.views.editing;

import java.util.Arrays;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.integration.rules.Rules;

/**
 * @author Thomas Guiu
 * 
 */
public class RuleTypeEditingSupport extends BasicEditingSupport {

	private ComboBoxCellEditor cellEditor;

	public RuleTypeEditingSupport(TableViewer viewer) {
		super(viewer);
		cellEditor = new ComboBoxCellEditor(viewer.getTable(), Rules.getAvailableTypes(), SWT.READ_ONLY);
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		return cellEditor;
	}

	@Override
	protected Object getValue(Object element) {
		String value = ((Rule) element).getType();
		return Arrays.asList(cellEditor.getItems()).indexOf(value);
	}

	@Override
	protected final void doSetValue(Object element, Object value) {
		String val = cellEditor.getItems()[(Integer) value];
		((Rule) element).setType(val);
	}

}
