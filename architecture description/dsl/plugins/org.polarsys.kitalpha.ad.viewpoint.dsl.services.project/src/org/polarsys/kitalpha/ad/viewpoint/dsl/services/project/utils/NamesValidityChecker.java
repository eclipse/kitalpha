/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.utils;

import java.util.regex.Pattern;

/**
 * @author Boubekeur Zendagui
 */

public class NamesValidityChecker{
	
	public static boolean isValid(String name, boolean pojectName){
		// If the name contains a space --> error
		if (name.contains(" "))
			return false;
		
		// Remove "." characters if name is a project name
		String nameCopy = name;
		if (pojectName)
			nameCopy = name.replace(".", "");
		
		// Check name content
		return Pattern.matches("^([A-Za-z0-9_-]+$)", nameCopy);
	}
}
