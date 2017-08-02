/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.mde.tools.managers;

/**
 * 
 * @author Faycal Abka
 *
 */
public interface LinkTypeHandler {
	
	String resolveType(String link);

	String encode(final String url, final String displayText);

	String decode(final String link, final String basePath);
	
	void openLink(String link, final String basePath);
	
	Tuple<String, String> getURI(Object object, String type);
}
