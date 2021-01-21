/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.integration.services;

import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ModelManager;
import org.polarsys.kitalpha.ad.viewpoint.integration.services.ServiceRunner;

/**
 * @author Thomas Guiu
 * 
 */
public class UIServiceRunner extends ServiceRunner {

	@Override
	public boolean run(Service action, ModelManager vpMgr, List<Object> selection) {
		String msg = doRun(action, vpMgr, selection);
		if (msg != null){
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error with service", msg);
		}
		return msg == null;
	}
	
}
