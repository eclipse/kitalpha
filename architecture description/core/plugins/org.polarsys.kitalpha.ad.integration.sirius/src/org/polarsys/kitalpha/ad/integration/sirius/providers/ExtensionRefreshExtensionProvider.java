/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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

	@Override
	public IRefreshExtension getRefreshExtension(DDiagram viewPoint) {
		return REFRESH;
	}

	@Override
	public boolean provides(DDiagram viewPoint) {
		// TODO Ne s'interesser qu'aux diagrammes MA
		return true;
	}

}
