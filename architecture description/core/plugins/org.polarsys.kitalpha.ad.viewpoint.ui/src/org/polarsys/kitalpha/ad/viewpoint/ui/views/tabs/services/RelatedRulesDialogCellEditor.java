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

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.services;

import java.util.Arrays;

import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IRuleHandler;
import org.polarsys.kitalpha.ad.viewpoint.integration.services.Implementations;

/**
 * @author Thomas Guiu
 * 
 */
public class RelatedRulesDialogCellEditor extends DialogCellEditor {

	private IRuleHandler handler;

	public RelatedRulesDialogCellEditor(Composite parent) {
		super(parent);
	}

	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		Object value = getValue();
		RelatedRulesDialog dialog = new RelatedRulesDialog(cellEditorWindow.getShell(), handler, (Rule[]) value);
		if (dialog.open() == Window.OK) {
			return dialog.getResult();
		}
		return null;
	}

	@Override
	protected void updateContents(Object value) {
		if (getDefaultLabel() == null) {
			return;
		}

		String text = "";//$NON-NLS-1$
		if (value != null && value instanceof Rule[]) {
			text = Implementations.toString((Arrays.asList((Rule[]) value)));
		}
		getDefaultLabel().setText(text);
	}

	public void setRuleHandler(IRuleHandler viewpoint) {
		this.handler = viewpoint;
	}

}
