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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.tasks;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.project.AfProjectManager;

/**
 * @author Boubekeur Zendagui
 */

public class SaveAFModelTask implements ITaskProduction {


	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}


	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		try {
			AfProjectManager.INSTANCE.saveModel();
		} catch (CoreException e) {
			throw new InvocationException("Unable to save model", e.getCause());
		} catch (ViewpointActivationException e) {
			throw new InvocationException(e.getMessage(), e.getCause());
		}
	}


	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

}
