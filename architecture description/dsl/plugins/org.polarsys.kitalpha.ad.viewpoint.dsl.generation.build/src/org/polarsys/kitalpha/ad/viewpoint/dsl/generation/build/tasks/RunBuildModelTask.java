/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.tasks;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.domain.TargetPlatformResourceSet;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.egf.portfolio.genchain.tools.utils.RunActivityHelper;
import org.eclipse.emf.common.util.URI;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class RunBuildModelTask implements ITaskProduction {
	
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
	}

	public void doExecute(ITaskProductionContext productionContext,IProgressMonitor monitor) throws InvocationException {
		//build runner uri
		String buildRunnerURI = productionContext.getInputValue(GeneratorConstants.BUILD_RUNNER_URI, String.class);
		if (buildRunnerURI == null || "".equals(buildRunnerURI)) {
			throw new InvocationException(Messages.GeneratorError_BuildModelNotFound);
		}
		FactoryComponent fc = (FactoryComponent) new TargetPlatformResourceSet().getEObject(URI.createURI(buildRunnerURI), true);
		try {
			RunActivityHelper.run(fc, monitor);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void postExecute(ITaskProductionContext productionContext,IProgressMonitor monitor) throws InvocationException {
	}
}
