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

package org.polarsys.kitalpha.ad.af.dsl.generation.desc.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.af.dsl.as.desc.helper.model.AFSpecConfigurationHelper;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework;
import org.polarsys.kitalpha.ad.af.dsl.generation.desc.internal.Constants;

/**
 * @author Boubekeur Zendagui
 */

public class AFDataGetterTask implements ITaskProduction {

	
	@Override
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

	}

	@Override
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		EMFDomain domainModel = productionContext.getInputValue(Constants.CONTRACT_DOMAIN_MODEL, EMFDomain.class);
		EList<Object> content = domainModel.getContent();
		
		String shortName = ""; 
		String projectName = ""; 
		
		if (content != null && content.size() > 0)
		{
			EObject eObject = (EObject) content.get(0);
			if (eObject instanceof ArchitectureFramework)
			{
				ArchitectureFramework af = (ArchitectureFramework) eObject;
				shortName = af.getShortName();
				projectName = AFSpecConfigurationHelper.getAFProjectName(af) ;
			}
		}
		else
		{
			 throw new InvocationException("Architecture framework description model is empty"); 
		}
		
		productionContext.setOutputValue(Constants.CONTRACT_SHORT_NAME, shortName);
		productionContext.setOutputValue(Constants.CONTRACT_PROJECT_NAME, projectName);
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

	}

}
