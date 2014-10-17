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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.task;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.log.ViewpointDslLogger;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.extension.IExtensionFilter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.data.LauncherExtension;

/**
 * @author Boubekeur Zendagui
 */

public class FilterGeneratorExtensionByTargetApplicationTask extends TaskProductionAdapter {

	public static final String collectedExtensionPointContributions = "collected.extension.point.contributions";
	public static final String filteredExtensionPointContributions = "filtered.extension.point.contributions";
	
	@SuppressWarnings("unchecked")
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		
		List<LauncherExtension> holdedExtensionPointContributions = new ArrayList<LauncherExtension>();
		List<LauncherExtension> extensionPointContributions_Value = productionContext.getInputValue(collectedExtensionPointContributions, List.class);
		if (extensionPointContributions_Value == null)
			throw new IllegalArgumentException("Mondatory contract Collected.extension.point.contributions has no value.");
		
		EMFDomain domainModel = productionContext.getInputValue(VPDESC_MODEL, EMFDomain.class);
		String targetApplication = getTargetApplication(domainModel);
		
		if (targetApplication == null || (targetApplication != null && targetApplication.trim().length() == 0))
		{
			holdedExtensionPointContributions.addAll(extensionPointContributions_Value);
		}
		else
		{
			for (LauncherExtension launcherExtension : extensionPointContributions_Value) 
			{
				boolean noFilter = true;
				for (IConfigurationElement iConfigurationElement : launcherExtension.iExtension.getConfigurationElements())
				{
					if (iConfigurationElement.getName().equals("filter"))
					{
						boolean filterOK = true;
						// Filter by Target Application
						String extensionTargetApplication = iConfigurationElement.getAttribute("TargetApplication");
						if (extensionTargetApplication != null)
						{
							noFilter = false;
							filterOK &= extensionTargetApplication.equals(targetApplication);
						}
						
						// Filter by Java filter
						try {
							IExtensionFilter createExecutableExtension = (IExtensionFilter) iConfigurationElement.createExecutableExtension("java");
							if (createExecutableExtension != null)
							{
								noFilter = false;
								filterOK &= createExecutableExtension.accept(domainModel);
							}
						} catch (CoreException e) {
							e.printStackTrace();
						}
						
						if (filterOK)
						{
							holdedExtensionPointContributions.add(launcherExtension);
							break;
						}
					}
				}
				
				if (noFilter)
				{
					holdedExtensionPointContributions.add(launcherExtension);
				}
			}
		}
		productionContext.setOutputValue(filteredExtensionPointContributions, holdedExtensionPointContributions);
	}
	
	private String getTargetApplication(EMFDomain domainModel){
		ResourceSet rSet = new ResourceSetImpl();
		Resource domainResource = rSet.getResource(domainModel.getUri(), true);
		if (! domainResource.getContents().isEmpty())
		{
			Viewpoint viewpoint = (Viewpoint) domainResource.getContents().get(0);
			return VpDslConfigurationHelper.getTargetApplication(viewpoint);
		}
		else
			ViewpointDslLogger.doLogWarning("Model is Empty !!");
		
		return null;
	}
}
