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
package org.polarsys.kitalpha.richtext.widget.toolbar.handlers.links;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.utils.MDERichTextHelper;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.utils.Tuple;

/**
 * 
 * @author Faycal Abka
 *
 */
public abstract class AbstractLinkTypeHandler implements LinkTypeHandler {

	protected Tuple<String, String> customizeLink(String link, Object object) {
		if (object instanceof EObject){
			return new Tuple<String, String>(link, MDERichTextHelper.getName((EObject)object));
		}
		return new Tuple<String, String>(link, null);
	}

}
