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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.conf.DiagramGenerationConfigurationHelper;

/**
 * @author Boubekeur Zendagui
 *
 */
public abstract class AbstractDiagramGenerationTask implements ITaskProduction {

	/**
	 * @see org.eclipse.egf.ftask.producer.invocation.ITaskProduction#preExecute(org.eclipse.egf.ftask.producer.context.ITaskProductionContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		DiagramGenerationConfigurationHelper.generateVSM(null);
	}

	/**
	 * @see org.eclipse.egf.ftask.producer.invocation.ITaskProduction#doExecute(org.eclipse.egf.ftask.producer.context.ITaskProductionContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public abstract void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException ;

	/**
	 * @see org.eclipse.egf.ftask.producer.invocation.ITaskProduction#postExecute(org.eclipse.egf.ftask.producer.context.ITaskProductionContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public abstract void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException ;

}
