/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

/**
 * 
 */
package org.polarsys.kitalpha.composer.ui.launch.tabs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.extension.points.ParameterizedComposerElement;

/**
 * @author Guillaume Gebhart
 *
 */
public class ComposerHelper {

	/**
	 * Returns the map of parameters from the table.
	 * 
	 * @return the map of parameters.
	 */
	public static  Map<String, String> getMapFromTable(Collection<Parameter> parameters_p) {

		Collection<Parameter> parameters = parameters_p;

		Map<String, String> params = new HashMap<String, String>();
		if (parameters != null) {
			for (Parameter p : parameters) {
				params.put(p.getName(), p.getValue());
			}
		}

		return params;

	}
	
	/**
	 * Converts a map of string to a map of parameters.
	 * 
	 * @param map
	 *            the map of string.
	 * @param reference
	 *            composer element.
	 * @return the map of parameters.
	 */
	public static Map<String, Parameter> buildMapFromString(
			final Map<String, String> map,
			ParameterizedComposerElement reference) {

		Map<String, Parameter> goodMap = null;

		if (reference != null) {
			goodMap = reference.getParameters();
			if (goodMap != null) {
				for (Map.Entry<String, Parameter> parameterEntry: goodMap.entrySet()) {
					Parameter parameter = parameterEntry.getValue();
					final String param = parameterEntry.getKey();
					if (!map.containsKey(param)) {
						//
						// It's a new parameter
						map.put(param, parameter.getValue());
					} else {
						String stringValue = (String) map.get(param);
						parameter.setName(param);
						parameter.setValue(stringValue);
						goodMap.put(param, parameter);
					}
				}
			}
		}
		return goodMap;
	}
	
}
