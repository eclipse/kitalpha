/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.launcher.precondition;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;

/**
 * @author Boubekeur Zendagui
 */
public class GenerationPreconditionTask extends TaskProductionAdapter{

	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		super.doExecute(productionContext, monitor);
		
		EMFDomain domain = productionContext.getInputValue(VPDESC_MODEL, EMFDomain.class);
		if  (domain != null && domain.isLoaded())
		{
			Viewpoint viewpoint = null;
			EList<Object> content = domain.getContent();
			if (! content.isEmpty())
			{
				viewpoint = (Viewpoint) content.get(0);
			}
			if (viewpoint != null)
			{
				try {
					boolean stopsGeneration = false;
					List<IStatus> statuses = ViewpointGenerationPreconditionManager.checkPreconditions(viewpoint);
					for (IStatus iStatus : statuses) 
					{
						org.eclipse.egf.domain.Activator.getDefault().getLog().log(iStatus);
						if (! stopsGeneration && iStatus.getSeverity() == IStatus.ERROR )
						{
							stopsGeneration = true;
						}
					}
					if (stopsGeneration)
					{
						// Throw an exception to stop viewpoint generation
						throw new InvocationException("Viewpoint generation aborted");
					}
				} catch (CoreException e) {
					throw new InvocationException(e);
				}
			}
		}
	}
}
