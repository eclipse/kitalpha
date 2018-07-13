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
package org.polarsys.kitalpha.massactions.core.data.convert;

import org.eclipse.nebula.widgets.nattable.data.convert.DisplayConverter;

/**
 * An abstract Display Converter implementation customized for Mass Action
 * components.
 * 
 * @author Sandu Postaru
 * 
 */
public abstract class MADisplayConverter extends DisplayConverter {

	public static final String EMPTY_SELECTION_MSG = "<undefined>";

	public String canonicalToDisplayValue(Object canonicalValue) {
		return canonicalValue.toString();
	}

	/**
	 * There is no need to convert from the string representation to an Object
	 * by using our custom cell editor, this method is therefore not used.
	 */
	@Override
	public Object displayToCanonicalValue(Object displayValue) {
		throw new UnsupportedOperationException("Value " + displayValue);
	}
}
