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

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.services;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TableViewer;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IRuleHandler;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.editing.BasicEditingSupport;

/**
 * @author Thomas Guiu
 * 
 */
public class RelatedRulesEditingSupport extends BasicEditingSupport {

	private final RelatedRulesDialogCellEditor cellEditor;

	public RelatedRulesEditingSupport(TableViewer viewer) {
		super(viewer);
		cellEditor = new RelatedRulesDialogCellEditor(viewer.getTable());
	}

	@Override
	protected void doSetValue(Object element, Object value) {
		Service service = (Service) element;
		service.getRelatedRules().clear();
		for (Object obj : (Object[]) value) {
			service.getRelatedRules().add((Rule) obj);
		}
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		return cellEditor;
	}

	@Override
	protected Object getValue(Object element) {
		Service service = (Service) element;
		return service.getRelatedRules().toArray();
	}

	public void setRuleHandler(IRuleHandler handler) {
		cellEditor.setRuleHandler(handler);
	}

}
