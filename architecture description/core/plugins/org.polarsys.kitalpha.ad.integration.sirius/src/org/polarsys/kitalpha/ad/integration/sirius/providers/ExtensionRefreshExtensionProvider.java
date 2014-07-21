/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.integration.sirius.providers;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.business.api.refresh.IRefreshExtension;
import org.eclipse.sirius.diagram.business.api.refresh.IRefreshExtensionProvider;

/**
 * @author Thomas Guiu
 * 
 */
public class ExtensionRefreshExtensionProvider implements IRefreshExtensionProvider {

	private static final ExtensionRefreshExtension REFRESH = new ExtensionRefreshExtension();

	public ExtensionRefreshExtensionProvider() {
	}

	public IRefreshExtension getRefreshExtension(DDiagram viewPoint) {
		return REFRESH;
	}

	public boolean provides(DDiagram viewPoint) {
		// TODO Ne s'interesser qu'aux diagrammes MA
		return true;
	}

}
