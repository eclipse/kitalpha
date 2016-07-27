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

package org.polarsys.kitalpha.ad.viewpoint.sdk.manager;

import org.eclipse.osgi.util.NLS;
import org.osgi.framework.BundleException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.sdk.Messages;

/**
 * @author Thomas Guiu
 * 
 */
public class WorkspaceViewpointManager extends ViewpointManager {

	protected void activateBundle(String id) throws ViewpointActivationException {
		try {
			BundleManager.INSTANCE.load(id);
		} catch (Exception e) {
			throw new ViewpointActivationException(NLS.bind(Messages.ManageBundle_error_title8, id), e);
		}
	}

	protected void desactivateBundle(String id) throws ViewpointActivationException {
		if (!BundleManager.INSTANCE.isManaged(id))
			return;
		try {

			BundleManager.INSTANCE.unLoad(id);
		} catch (IllegalStateException e) {
			// we don't care
		} catch (BundleException e) {
			throw new ViewpointActivationException(NLS.bind(Messages.ManageBundle_error_title9, id), e);
		}
	}

}
