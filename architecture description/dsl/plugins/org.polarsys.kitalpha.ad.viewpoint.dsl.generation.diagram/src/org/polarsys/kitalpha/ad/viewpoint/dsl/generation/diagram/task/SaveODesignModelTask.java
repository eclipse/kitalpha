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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.conf.DiagramGenerationConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.resource.DoremiResourceManager;

/**
 * @author Boubekeur Zendagui
 */

public class SaveODesignModelTask implements ITaskProduction {

	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
	}

	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		if (precondition(productionContext))
			DoremiResourceManager.save();
	}
	
	private boolean precondition(ITaskProductionContext productionContext) throws InvocationException{
		EMFDomain domain = productionContext.getInputValue("vpdesc.model", EMFDomain.class);
		if (domain != null)
		{
			EObject root = (EObject) domain.getContent().get(0);
			if (root != null)
				return DiagramGenerationConfigurationHelper.generateVSM(root);
		}
		
		return true;
	}

	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

}
