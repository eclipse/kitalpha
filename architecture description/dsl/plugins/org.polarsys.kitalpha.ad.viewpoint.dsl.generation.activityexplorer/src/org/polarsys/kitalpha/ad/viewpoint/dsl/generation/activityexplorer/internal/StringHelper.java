/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.activityexplorer.internal;

/**
 * @author Boubekeur Zendagui
 */
public class StringHelper {

	/**
	 * Convert an Array of Strings to a String
	 * @param array
	 * @return
	 */
	public static String arrayToStriong(String[] array){
		String result = null;
		if (array.length > 0) {
			result = "\"" + array[0] +  "\"";
		}
		
		if (array.length > 1)
		{
			for (int i = 1; i < array.length; i++) 
			{
				result += ", \"" + array[i] +  "\"";
			}
		}
		
		return result;
	}
}
