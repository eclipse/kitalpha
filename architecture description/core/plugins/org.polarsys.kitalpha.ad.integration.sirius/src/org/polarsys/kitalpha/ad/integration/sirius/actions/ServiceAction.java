/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.integration.sirius.actions;

import org.eclipse.jface.action.Action;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ModelManager;
import org.polarsys.kitalpha.ad.viewpoint.ui.integration.services.UIServiceRunner;
import org.polarsys.kitalpha.ad.viewpoint.ui.provider.AFSelectionProvider;

/**
 * @author Thomas Guiu
 * 
 */
public final class ServiceAction extends Action {
	private final ModelManager vpMgr;
	private final Service service;
	private AFSelectionProvider selectionProvider;

	public ServiceAction(ModelManager vpMgr, Service service, AFSelectionProvider selectionProvider) {
		this.vpMgr = vpMgr;
		this.service = service;
		this.selectionProvider = selectionProvider;
	}

	@Override
	public void run() {
		new UIServiceRunner().run(service, vpMgr, selectionProvider.getSelection());
	}
}