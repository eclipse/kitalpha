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
package org.polarsys.kitalpha.doc.gen.business.core.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.polarsys.kitalpha.doc.gen.business.core.extension.page.PageExtensionRuntimeParameters;

public class LoadPageExtensionRuntimeParameters implements ITaskProduction {

	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {

	}

	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {
		productionContext.setOutputValue(PageExtensionRuntimeParameters.RUNTIME_PARAMETER_CONTRACT_NAME, PageExtensionRuntimeParameters.getInstance().getParameters());
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {

	}

}
