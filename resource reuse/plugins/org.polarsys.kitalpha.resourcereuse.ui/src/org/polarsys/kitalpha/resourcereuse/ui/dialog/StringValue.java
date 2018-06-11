/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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