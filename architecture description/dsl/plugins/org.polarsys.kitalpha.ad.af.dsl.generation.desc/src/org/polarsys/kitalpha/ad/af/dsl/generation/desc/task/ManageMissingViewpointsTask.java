/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.generation.desc.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.egf.model.domain.EMFDomain;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework;
import org.polarsys.kitalpha.ad.af.dsl.generation.desc.internal.AFViewpointGenerationOrchetrator;
import org.polarsys.kitalpha.ad.af.dsl.generation.desc.internal.Constants;

/**
 * @author Boubekeur Zendagui
 */

public class ManageMissingViewpointsTask implements ITaskProduction {
	
	@Override
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

	@Override
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		EMFDomain domainModel = 
			productionContext.getInputValue(Constants.CONTRACT_DOMAIN_MODEL, EMFDomain.class);
		String afModelStringURI = 
			productionContext.getInputValue(Constants.CONTRACT_MODEL_STRING_URI, String.class);
		
		ArchitectureFramework afd = (ArchitectureFramework) domainModel.getContent().get(0);
		
		AFViewpointGenerationOrchetrator orchetrator = new AFViewpointGenerationOrchetrator(afd);
		final int numberOfViewpointToGenerate = orchetrator.getNumberOfViewpointToGenerate();
		productionContext.setOutputValue(Constants.CONTRACT_NUMBER_VIEWPOINT_TO_GENERATE, numberOfViewpointToGenerate);
		orchetrator.orchestrateVPGeneration(afModelStringURI, monitor);
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

	}

}
