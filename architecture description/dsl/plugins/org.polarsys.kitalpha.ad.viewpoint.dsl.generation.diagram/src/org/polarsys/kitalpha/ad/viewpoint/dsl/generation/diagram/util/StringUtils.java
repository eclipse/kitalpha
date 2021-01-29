/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util;

/**
 * @author Boubekeur Zendagui
 */

public class StringUtils {

	/**
	 * 
	 * @param string to transform
	 * @return
	 */
	public static String getDisplayableShortName(String string){
		String result = string.replaceAll("(.)([A-Z])", "$1 $2");
		result = result.replaceAll("  ", "");
		return result;
	}
	
	/**
	 * Transform the first character of a {@link String} to upper case 
	 * @param string to transform
	 * @return The same string but with the first character in upper case format 
	 */
	public static String transformeFirstToUperCase(String string){
		String firstCharacter = String.valueOf(string.charAt(0));
		firstCharacter = firstCharacter.toUpperCase();
		string = firstCharacter+ string.substring(1, string.length());
		return string;
	}
}
