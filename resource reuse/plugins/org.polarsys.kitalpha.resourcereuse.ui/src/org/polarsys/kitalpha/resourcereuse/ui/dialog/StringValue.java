/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.ui.dialog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Thomas Guiu
 * 
 */
class StringValue {
	
	String value;
	
	public StringValue(String string) {
		value = string;
	}

	@Override
	public String toString() {
		return value;
	}

	public static List<StringValue> toStringValueList(List<String> tags) {
		List<StringValue> result = new ArrayList<StringValue>();
		for (String value : tags) {
			result.add(new StringValue(value));
		}
		return result;
	}

	public static Collection<String> toStringList(List<StringValue> list) {
		List<String> result = new ArrayList<String>();
		for (StringValue value : list) {
			result.add(value.value);
		}
		return result;
	}

}