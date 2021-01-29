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
import org.eclipse.sirius.viewpoint.description.Group;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.bundles.AFBundlesIntegration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.exception.AFIntegrationException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.model.AFRepresentationIntegration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.resource.DoremiResourceManager;

/**
 * @author Boubekeur Zendagui
 */

public class AFDiagramIntergrationTask implements ITaskProduction {

	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		String projectname = productionContext.getInputValue("design.project.name", String.class);
		AFBundlesIntegration.getInstance().registerBundle(projectname);
		try {
			Group group = DoremiResourceManager.getGroup();
			AFRepresentationIntegration.getInstance().registerDoremiRepresentation(group);
		} catch (AFIntegrationException e) {
			e.printStackTrace();
		}
	}

	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

}
