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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.task;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.constant.IContractNames;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.constant.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.data.LauncherExtension;

/**
 * @author Boubekeur Zendagui
 */

public class FactoryComponentsCollectorTask implements ITaskProduction {
	
	@SuppressWarnings("unchecked")
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		// Get the vales of the Input Contracts
		List<LauncherExtension> extensionPointContributionsValue = productionContext.getInputValue(IContractNames.extensionPointContributions, List.class);
		
		if (extensionPointContributionsValue == null)
			throw new IllegalArgumentException(Messages.Contract_ExtensionPointContributions);
		
		List<URI> collectedFactoryComponents = new ArrayList<URI>();
		
		if (extensionPointContributionsValue.size() > 0){
			for (LauncherExtension taguableExtension : extensionPointContributionsValue) 
			{
				String fCoreURI =  taguableExtension.extensionFCoreAttributeValue;

				if (fCoreURI != null && fCoreURI.trim().length() > 0)
					collectedFactoryComponents.add(URI.createURI(fCoreURI));
				else
					throw new IllegalArgumentException(Messages.Contract_ExtensionFcore);
			}
		}
		
		productionContext.setOutputValue(IContractNames.factoryComponentsList, collectedFactoryComponents);
	}

	/******************
	 ***** Unused *****
	 ******************/
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

}
