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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.reporter;

import java.util.Map;

import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.model.pattern.PatternExecutionReporter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.IContractProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.exception.EcoreNotAvailableException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.util.ECoreFileInformation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.util.ECoreResourceManager;

/**
 * @author Boubekeur Zendagui
 */

public class ECoreModelReporter implements PatternExecutionReporter, IContractProvider {


	@Override
	public void executionFinished(String output, PatternContext context) {
		
		if (ECoreResourceManager.INSTANCE.areResourcesInitialized())
		{
			ECoreResourceManager.INSTANCE.saveModel();
		}
		else
		{
			try 
			{
				boolean generate = ECoreResourceManager.INSTANCE.generateEcoreModel(false);
				if (generate)
				{
					ECoreFileInformation eCoreFileInformation = ECoreResourceManager.INSTANCE.getECoreFileInformation();
					throw new EcoreNotAvailableException(eCoreFileInformation);
				}
			} 
			catch (Exception e) 
			{
				if (e instanceof EcoreNotAvailableException) {
					((EcoreNotAvailableException) e).logErrorMessage();
				}
				
				e.printStackTrace();
			}
		}
	}


	@Override
	public void loopFinished(String output, String outputWithCallBack,
			PatternContext context, Map<String, Object> parameterValues) {
	}

}
