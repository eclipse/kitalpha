/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Faycal Abka 
 *
 */
public class VpdiagramIdentifierNormalizerHelper {
	
	private static final String SPECIAL_CHARACTERS_PATTERN_STRING = "[^a-zA-Z0-9_\\\\^\\\\s]";
	private static final Pattern SPECIAL_CHARACTERS_PATERN = Pattern.compile(SPECIAL_CHARACTERS_PATTERN_STRING, Pattern.CASE_INSENSITIVE);
	
	/**
	 * Process the identifier to find not allowed characters in the identifier
	 * and trim them
	 * @param identifier
	 * @return
	 */
	public static String normalizeIdentifier(String identifier)
	{
		Matcher matcher = SPECIAL_CHARACTERS_PATERN.matcher(identifier);
		
		while (matcher.find())
		{
			return matcher.replaceAll("");
		}
		
		return identifier;
	}

}
