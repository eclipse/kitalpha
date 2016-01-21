/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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