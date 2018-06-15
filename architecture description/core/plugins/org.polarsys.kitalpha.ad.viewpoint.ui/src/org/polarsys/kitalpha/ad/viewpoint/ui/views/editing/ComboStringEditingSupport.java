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

package org.polarsys.kitalpha.ad.viewpoint.ui.views.editing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;

/**
 * @author Thomas Guiu
 * 
 */
public class ComboStringEditingSupport extends AbstractStringEditingSupport {

	private ComboBoxCellEditor cellEditor;
	private String[] initialItems;

	public ComboStringEditingSupport(TableViewer viewer, Class<?> candidate, String propertyName) {
		super(viewer, candidate, propertyName);
		cellEditor = new ComboBoxCellEditor(viewer.getTable(), initialItems = new String[0], SWT.NONE);
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		String value = super.getValue(element).toString();
		List<String> strs = new ArrayList<String>();
		strs.addAll(Arrays.asList(initialItems));
		if (!strs.contains(value)) {
			strs.add(value);
			cellEditor.setItems(strs.toArray(new String[strs.size()]));
		}
		return cellEditor;
	}

	@Override
	protected Object getValue(Object element) {
		Object value = super.getValue(element);
		return Arrays.asList(cellEditor.getItems()).indexOf(value);
	}

	@Override
	protected final void doSetValue(Object element, Object value) {
		Integer value2 = (Integer) value;
		if (value2 >= 0) {
			String val = cellEditor.getItems()[value2];
			super.doSetValue(element, val);
		} else {
			CCombo combo = (CCombo) cellEditor.getControl();
			String text = combo.getText();
			super.doSetValue(element, text);
		}
	}

	public void setItems(String[] array) {
		this.initialItems = array;
		cellEditor.setItems(array);
	}

}
