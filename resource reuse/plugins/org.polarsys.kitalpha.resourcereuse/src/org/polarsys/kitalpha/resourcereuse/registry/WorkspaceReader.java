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
package org.polarsys.kitalpha.resourcereuse.registry;

import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.polarsys.kitalpha.resourcereuse.model.Location;


/**
 * @author Thomas Guiu
 * 
 */
public class WorkspaceReader extends ModelBasedReader {

	@Override
	protected IPluginModelBase[] getModels() {
		return PluginRegistry.getWorkspaceModels();
	}

	@Override
	protected Location getLocation() {
		return Location.WORSPACE;
	}

}
