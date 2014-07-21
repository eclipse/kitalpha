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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.util.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.eclipse.resources.mgt.CreateFeatureTask;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.IContractProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.utils.GenchainAdditionsManager;

/**
 * @author Boubekeur Zendagui
 */

public class CreateAndRegisterFeature extends CreateFeatureTask implements IContractProvider{
	@Override
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		if (feature != null) {
			String vpShortName = productionContext.getInputValue(SHORT_NAME, String.class);
			GenchainAdditionsManager.INSTANCE.setVpName(vpShortName);			
			GenchainAdditionsManager.INSTANCE.registerFeature(feature.getName());
		}
	}

}
