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

import java.util.List;


/**
 * 
 * @author Faycal Abka
 *
 */
public interface LinkManager {
	
	List<String> getAllLinkTypes();
	
	List<String> getAllLinkLabels();
	
	void addLinkType(final String type, final String label, final LinkTypeHandler handler);
	
	String encode(final String type, final String url, final String displayText);
	
	String decode(final String type, final String link, final String basePath);
	
	void openLink(final String link);
	
	/**
	 * @param type
	 * @param object
	 * @return couple composed by the url and the humain readable string (for instance, to display)
	 */
	Tuple<String, String> getPath(final String type, final Object object);
}