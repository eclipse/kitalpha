/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.control;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.data.convert.IDisplayConverter;
import org.eclipse.nebula.widgets.nattable.edit.editor.ICellEditor;
import org.eclipse.swt.widgets.Composite;

/**
 * An editor control that is wrapped by a {@link AbstractMACellEditor}, having a
 * dual role.
 * 
 * First of all please note that the control is a Composite, meaning that when
 * the associated editor is invoked, a dialog containing this composite will be
 * opened. By customizing this control you customize the way your users will
 * select a new value for the cells they are currently editing. This can be as
 * simple as a text field or as complex as a multi-grid dialog with plenty of
 * buttons and sparkly colors.
 * 
 * Second of all the control provides access to both the editor value (the
 * representation displayed in the cell editor) and the canonical value (normal
 * data representation).
 * 
 * For example, the canonical representation might be a Date object, whereas the
 * editor representation could be a formatted String.
 * 
 * Note that in NatTable a new cell control is created whenever a user invokes
 * an edit command.
 * 
 * @author Sandu Postaru
 * 
 */

public abstract class AbstractMACellControl extends Composite {

	/**
	 * The current display converter configured for the wrapping cell editor.
	 */
	protected IDisplayConverter displayConverter;

	/**
	 * The current row objects that were selected by the user when the edit
	 * command was issued.
	 */
	protected List<EObject> selectedRowObjects;

	public AbstractMACellControl(Composite parent, int style, IDisplayConverter displayConverter) {
		super(parent, style);
		this.displayConverter = displayConverter;
	}

	/**
	 * Returns the current display value in this editor prior to conversion. See
	 * {@link ICellEditor#getEditorValue()}.
	 * 
	 * @return The current value in this editor prior to conversion.
	 * 
	 */
	public abstract Object getEditorValue();

	/**
	 * Sets the given display value to the editor control. {link
	 * {@link ICellEditor#setEditorValue(Object)}.
	 *
	 * @param value
	 *            The display value to set to the wrapped editor control.
	 */
	public abstract void setEditorValue(Object editorValue);

	/**
	 * Returns the canonical value for this cell editor. This is the value that
	 * will be commited once the editing action is finished.
	 * {@link ICellEditor#getCanonicalValue()}.
	 * 
	 * @return the canonical value that will be commited.
	 */
	public abstract Object getCanonicalValue();

	/**
	 * Sets the given canonical value to the wrapped editor control.
	 * {@link ICellEditor#setCanonicalValue(Object)}
	 * 
	 * @param canonicalValue
	 */
	public abstract void setCanonicalValue(Object canonicalValue);

	public void setSelectedRowObjects(List<EObject> selectedRowObjects) {
		this.selectedRowObjects = selectedRowObjects;
	}

	protected Object getDisplayConverterValue(Object value) {
		Object displayValue;

		if (this.displayConverter != null) {
			displayValue = this.displayConverter.canonicalToDisplayValue(value);
		} else {
			displayValue = value;
		}

		return displayValue;
	}
}
