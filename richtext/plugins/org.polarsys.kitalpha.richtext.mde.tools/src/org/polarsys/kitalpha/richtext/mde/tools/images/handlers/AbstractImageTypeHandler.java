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
package org.polarsys.kitalpha.richtext.mde.tools.images.handlers;

import org.polarsys.kitalpha.richtext.mde.tools.managers.LinkTypeHandler;

/**
 * 
 * @author Faycal Abka
 *
 */
public abstract class AbstractImageTypeHandler implements LinkTypeHandler {
	
	protected static String[] allowedExtensions = { "*.jpg;*.png;*.bmp;*.gif", "*.jpg", "*.png", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			"*.bmp", "*.gif" }; //$NON-NLS-1$ //$NON-NLS-2$
	
	@Override
	public String encode(String url, String displayText) {
		return "<img src=\"" + url + "\"/>"; //$NON-NLS-1$ //$NON-NLS-2$
	}

}
