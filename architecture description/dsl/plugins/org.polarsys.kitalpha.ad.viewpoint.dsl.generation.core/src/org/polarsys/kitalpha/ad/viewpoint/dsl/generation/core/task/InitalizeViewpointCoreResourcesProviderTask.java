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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.exception.ViewpointResourceProviderException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl.ViewpointResourceProviderRegistry;

/**
 * @author Boubekeur Zendagui
 */

public class InitalizeViewpointCoreResourcesProviderTask extends TaskProductionAdapter {

	@Override
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		// Clean previous generation data.
		ViewpointResourceProviderRegistry.getInstance().unload();
		
		// Load data for the current generation.
		EMFDomain domainModel = productionContext.getInputValue(VPDESC_MODEL, EMFDomain.class);
		EList<Object> content = domainModel.getContent();
		Viewpoint viewpoint = null;
		// Check if the content list is not null and contains data.
		if (content != null && content.size() > 0)
		{
			// in this case, the resource is already loaded
			viewpoint = (Viewpoint) content.get(0);
		}
		else
		{
			// in this case, the resource is not loaded, so try to load it.
			ResourceSet rSet = new ResourceSetImpl();
			Resource domainResource = rSet.getResource(domainModel.getUri(), true);
			if (! domainResource.getContents().isEmpty()) {
				viewpoint = (Viewpoint) domainResource.getContents().get(0);
			}
		}

		if (viewpoint != null)
		{
			try {
				ViewpointResourceProviderRegistry.getInstance().setViewpoint(viewpoint);
			} catch (ViewpointResourceProviderException e) {
				if (e.isCritical()) {
					throw new InvocationException(e);
				} 
			}
		}
	}
}
