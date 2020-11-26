/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.servicies.project.ui.util;

import java.util.regex.Pattern;

/**
 * @author Boubekeur Zendagui
 */

public class NamesValidityChecker{
	
	public static boolean isValid(String name, boolean pojectName){
		// If the name contains a space --> error
		if (name.contains(" ")) {
			return false;
	    }
		// Remove "." characters if name is a project name
		String nameCopy = name;
		if (pojectName) {
			nameCopy = name.replace(".", "");
		}
		
		// Check name content
		return Pattern.matches("^([A-Za-z0-9_]+$)", nameCopy);
	}
}
