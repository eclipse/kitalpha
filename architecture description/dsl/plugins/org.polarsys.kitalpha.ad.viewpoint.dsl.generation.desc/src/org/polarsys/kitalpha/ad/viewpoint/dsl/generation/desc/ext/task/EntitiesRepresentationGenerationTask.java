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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.ext.task;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.ext.operation.EntitiesRepresentationCreationOperation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.helper.GenerationConfigurationHelper;

/**
 * @author Boubekeur Zendagui
 */
public class EntitiesRepresentationGenerationTask extends TaskProductionAdapter {

	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter#doExecute(org.eclipse.egf.ftask.producer.context.ITaskProductionContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		EMFDomain domain = productionContext.getInputValue("vpdsl.model", EMFDomain.class);
		if (GenerationConfigurationHelper.canGegenrate(domain))
		{
			URI domainURI = productionContext.getInputValue("ecore.uri", URI.class);
			if (domainURI == null)
			 {
				return ; // Must log error message in the console
			}

			EntitiesRepresentationCreationOperation operation = new EntitiesRepresentationCreationOperation(domainURI);
			try {
				operation.run(new NullProgressMonitor());
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
