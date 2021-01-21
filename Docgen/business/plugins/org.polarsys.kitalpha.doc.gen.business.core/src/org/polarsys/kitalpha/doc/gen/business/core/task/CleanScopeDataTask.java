/*******************************************************************************
 * Copyright (c) 2015, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.polarsys.kitalpha.doc.gen.business.core.scope.GenerationGlobalScope;

/**
 * @author Boubekeur Zendagui
 */
public class CleanScopeDataTask implements ITaskProduction {

	@Override
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		// No need for this step
	}

	@Override
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		GenerationGlobalScope.getInstance().cleanScope();

	}

	@Override
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		// No need for this step
	}

}
