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
import org.polarsys.kitalpha.ad.viewpoint.integration.rules.ElementDescriptor;
import org.polarsys.kitalpha.ad.viewpoint.integration.rules.Rules;

/**
 * @author Thomas Guiu
 * 
 */
public class RuleIDTypeEditingSupport extends BasicEditingSupport {

	private ComboBoxCellEditor cellEditor;
	private ElementDescriptor[] implementations;

	public RuleIDTypeEditingSupport(TableViewer viewer) {
		super(viewer);
		cellEditor = new ComboBoxCellEditor(viewer.getTable(), new String[0], SWT.READ_ONLY);
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		Rule rule = (Rule) element;
		implementations = Rules.getAvailableImplementations(rule.getType());
		cellEditor.setItems(ElementDescriptor.getNames(implementations));
		return cellEditor;
	}

	@Override
	protected Object getValue(Object element) {
		String implementation = ((Rule) element).getImplementation();
		String name = ElementDescriptor.getName(implementations, implementation);
		if (name == null) {
			return new Integer(0);
		}
		return Arrays.asList(cellEditor.getItems()).indexOf(name);
	}

	@Override
	protected final void doSetValue(Object element, Object value) {
		Integer value2 = (Integer) value;
		if (value2 == -1) {
			return;
		}
		String name = cellEditor.getItems()[value2];
		((Rule) element).setImplementation(ElementDescriptor.getImplementation(implementations, name));
	}

}
