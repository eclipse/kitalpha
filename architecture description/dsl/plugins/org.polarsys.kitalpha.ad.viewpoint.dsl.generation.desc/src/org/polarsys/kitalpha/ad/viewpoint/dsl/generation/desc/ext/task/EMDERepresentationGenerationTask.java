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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.ext.task;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.ext.operation.EMDERepresentationCreationOperation;

/**
 * @author Boubekeur Zendagui
 */
public class EMDERepresentationGenerationTask extends TaskProductionAdapter{

	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter#doExecute(org.eclipse.egf.ftask.producer.context.ITaskProductionContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		URI domainURI = productionContext.getInputValue("ecore.uri", URI.class);
		EMDERepresentationCreationOperation creationOperation = new EMDERepresentationCreationOperation(domainURI);
		if (domainURI == null)
			throw new RuntimeException("Ecore URI can't be null");
		
		try {
			creationOperation.run(new NullProgressMonitor());
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
