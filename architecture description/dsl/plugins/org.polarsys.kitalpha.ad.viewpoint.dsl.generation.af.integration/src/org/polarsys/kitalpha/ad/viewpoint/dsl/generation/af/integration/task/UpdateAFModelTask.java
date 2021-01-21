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
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.AFIntegrationManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.exception.AFIntegrationException;

/**
 * @author Boubekeur Zendagui
 */

public class UpdateAFModelTask implements ITaskProduction {
	
	protected static final String MODEL_URI_CONTRACT = "af.model.platform.uri"; // NON-NLS-N$ 

	@Override
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		
		String modeluri = productionContext.getInputValue(MODEL_URI_CONTRACT, String.class);
		try {
			AFIntegrationManager.getInstance().patchModel(modeluri);
		} catch (AFIntegrationException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

}
