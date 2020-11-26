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
package org.polarsys.kitalpha.massactions.example.data.convert;

import org.polarsys.kitalpha.massactions.core.data.convert.MADisplayConverter;

/**
 * 
 * @author Sandu Postaru 
 *
 */
public class CountDisplayConverter extends MADisplayConverter {

	@Override
	public String canonicalToDisplayValue(Object canonicalValue) {
		return String.valueOf(canonicalValue);
	}
}
