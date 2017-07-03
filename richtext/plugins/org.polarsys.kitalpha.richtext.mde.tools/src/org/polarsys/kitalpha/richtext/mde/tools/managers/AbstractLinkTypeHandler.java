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


import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.richtext.mde.tools.utils.MDERichTextToolsHelper;

/**
 * 
 * @author Faycal Abka
 *
 */
public abstract class AbstractLinkTypeHandler implements LinkTypeHandler {

	protected Tuple<String, String> customizeLink(String link, Object object) {
		if (object instanceof EObject){
			return new Tuple<String, String>(link, MDERichTextToolsHelper.getName((EObject)object));
		}
		return new Tuple<String, String>(link, null);
	}
	
	/**
	 * Escape special charachers in String parameter to be displayed on the link<br/>
	 * Default implementation escapes HTML entities. The client must override this methode to have
	 * a custom behavior
	 * @param toEscape String to escape
	 * @return String contains escaped special characters
	 */
	protected String escapeDisplayedText(String toEscape){
		return StringEscapeUtils.escapeHtml(toEscape);
	}

}
