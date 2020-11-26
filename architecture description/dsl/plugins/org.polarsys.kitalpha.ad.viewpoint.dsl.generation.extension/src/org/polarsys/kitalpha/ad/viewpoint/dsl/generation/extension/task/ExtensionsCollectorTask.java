/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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

import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.constant.IContractNames;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.constant.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.data.LauncherExtension;

/**
 * @author Boubekeur Zendagui
 */

public class ExtensionsCollectorTask implements ITaskProduction {

	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		String extensionPointIDValue = productionContext.getInputValue(IContractNames.extensionPointID, String.class);
		String configurationElementNameValue = productionContext.getInputValue(IContractNames.configurationElementName, String.class);
		String extensionFCoreAttributeNameValue = productionContext.getInputValue(IContractNames.extensionFCoreAttributeName, String.class);
		
		if (extensionPointIDValue == null)
			throw new IllegalArgumentException(Messages.Contract_ExtensionPointId);
		if (configurationElementNameValue == null)
			throw new IllegalArgumentException(Messages.Contract_ExtensionConfigurationElementName);
		if (extensionFCoreAttributeNameValue == null)
			throw new IllegalArgumentException(Messages.Contract_ExtensionFcoreAttributeName);
		
		
		// get all defined extensions
		List<IExtension> availableExtensions = getAvailavleExtension(extensionPointIDValue);

		// TaguableExtension list construction
		List<LauncherExtension> extensions = new ArrayList<LauncherExtension>();
		for (IExtension iExtension : availableExtensions)
			extensions.add(new LauncherExtension(iExtension, configurationElementNameValue, extensionFCoreAttributeNameValue));

		productionContext.setOutputValue(IContractNames.extensionPointContributions, extensions);
	}
	
	private List<IExtension> getAvailavleExtension(String extensionPointID){
		IExtension[] tExtensions = Platform.getExtensionRegistry().getExtensionPoint(extensionPointID).getExtensions();
		List<IExtension> aExtensions = new ArrayList<IExtension>();
		
		if (tExtensions.length > 0)
			for (IExtension iExtension : tExtensions)
				aExtensions.add(iExtension);
		
		return aExtensions;
	}

	
	/******************
	 ***** Unused *****
	 ******************/
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}
	
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

}
