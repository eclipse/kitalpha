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
package org.polarsys.kitalpha.richtext.mde.tools.links.protocole.handlers;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.richtext.mde.tools.internal.extension.ExtensionManager;
import org.polarsys.kitalpha.richtext.mde.tools.links.handlers.OpenModelElementStrategy;
import org.polarsys.kitalpha.richtext.mde.tools.managers.AbstractLinkTypeHandler;
import org.polarsys.kitalpha.richtext.mde.tools.utils.Constants;

/**
 * 
 * Handler to select model element and transform selection to html link tag
 *
 */
public class ModelElementHandler extends AbstractLinkTypeHandler {

	@Override
	public String resolveType(String link) {
		return link != null && link.contains("hlink:")? Constants.MODEL_ELEMENT:Constants.UNKNOWN;
	}

	@Override
	public String encode(String url, String displayText) {
		return "<a href=\"hlink://" + url + "\">" + escapeDisplayedText(displayText) + "</a>"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Override
	public String decode(String link, String basePath) {
		link = link.replaceFirst("hlink://", ""); //$NON-NLS-1$ //$NON-NLS-2$
		link = link.replaceAll("/", ""); //$NON-NLS-1$ //$NON-NLS-2$
		return link;
	}
	
	public void openLink(EObject eObject, String link, final String basePath) {
		OpenModelElementStrategy strategy = ExtensionManager.getModelElementStrategy(resolveType(link));
		if (strategy != null) {
			strategy.doOpen(eObject, decode(link, basePath));
		}
	}
}
