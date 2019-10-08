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
package org.polarsys.kitalpha.massactions.example.edit.control;

import org.eclipse.nebula.widgets.nattable.data.convert.IDisplayConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.massactions.core.control.AbstractMACellControl;

/**
 * 
 * @author Sandu Postaru 
 *
 */
public class CountCellControl extends AbstractMACellControl {

	private Button editorButton;
	
	private String canonicalValue;

	private final SelectionAdapter selectionAdapter = new SelectionAdapter() {
		@Override
		public void widgetSelected(SelectionEvent event) {

			int charValue = canonicalValue.charAt(0);
			canonicalValue = String.valueOf((char) (charValue + 1));
			setEditorValue(canonicalValue);
		}
	};

	public CountCellControl(Composite parent, int style, IDisplayConverter displayConverter) {
		super(parent, style, displayConverter);

		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		setLayoutData(gridData);

		final GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		setLayout(gridLayout);

		editorButton = new Button(this, SWT.NONE);
		editorButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		editorButton.addSelectionListener(selectionAdapter);
	}

	@Override
	public Object getEditorValue() {
		Object currentCanonicalValue = getCanonicalValue();
		return getDisplayConverterValue(currentCanonicalValue);
	}

	@Override
	public void setEditorValue(Object editorValue) {
		if (editorValue instanceof String) {
			this.editorButton.setText((String) editorValue);
		}
	}

	@Override
	public Object getCanonicalValue() {
		return canonicalValue;
	}

	@Override
	public void setCanonicalValue(Object value) {

		// multi selection with no common value
		if (value == null) {
			canonicalValue = "A";
		} else {
			canonicalValue = (String) value;
		}

		Object editorValue = getDisplayConverterValue(canonicalValue);
		setEditorValue(editorValue);
	}

}
