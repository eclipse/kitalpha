/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.exception.AFIntegrationException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.model.AFEcoreIntegration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.util.ECoreResourceManager;

/**
 * @author Boubekeur Zendagui
 */

public class RegisterGeneratedEPackageInAFIntergrationTask extends TaskProductionAdapter {

	@Override
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		// Register generated EPackage in the AF Integration agent 
		try {
			AFEcoreIntegration.getInstance().registerEPackage(ECoreResourceManager.INSTANCE.getEPackage());
		} catch (AFIntegrationException e) {
		}
	}
}
