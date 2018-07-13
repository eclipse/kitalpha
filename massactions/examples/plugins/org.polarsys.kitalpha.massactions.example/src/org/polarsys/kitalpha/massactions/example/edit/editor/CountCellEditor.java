/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.example.edit.editor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.massactions.core.control.AbstractMACellControl;
import org.polarsys.kitalpha.massactions.core.editor.AbstractMACellEditor;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.example.edit.control.CountCellControl;

/**
 * 
 * @author Sandu Postaru 
 *
 */
public class CountCellEditor extends AbstractMACellEditor {

	public CountCellEditor(IMABodyLayer bodyLayer) {
		super(bodyLayer);
	}

	@Override
	public AbstractMACellControl createEditorControl(Composite parent) {
		return new CountCellControl(parent, SWT.NONE, displayConverter);
	}
	
}
