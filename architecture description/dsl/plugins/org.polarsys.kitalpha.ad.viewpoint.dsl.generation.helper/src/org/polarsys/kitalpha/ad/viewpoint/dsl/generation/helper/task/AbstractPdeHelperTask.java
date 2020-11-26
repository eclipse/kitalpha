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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;

/**
 * @author Boubekeur Zendagui
 *
 */
public abstract class AbstractPdeHelperTask implements ITaskProduction {
	
	protected static final String PLUGIN_ID_CONTRACT = "plugin.id";
	protected static final String ENTRY_NAME_CONTRACT = "entry.name";
	protected static final String IS_FOLDER_CONTRACT = "is.folder";
	protected static final String SILENT_CONTRACT = "silent";

	/**
	 * @see org.eclipse.egf.ftask.producer.invocation.ITaskProduction#preExecute(ITaskProductionContext, IProgressMonitor)
	 */
	@Override
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

	/**
	 * This method is abstract to force derived classes to implement it at least.
	 * 
	 * @see org.eclipse.egf.ftask.producer.invocation.ITaskProduction#doExecute(ITaskProductionContext, IProgressMonitor)
	 */
	@Override
	public abstract void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException ;

	/**
	 * @see org.eclipse.egf.ftask.producer.invocation.ITaskProduction#postExecute(ITaskProductionContext, IProgressMonitor)
	 */
	@Override
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}
}
