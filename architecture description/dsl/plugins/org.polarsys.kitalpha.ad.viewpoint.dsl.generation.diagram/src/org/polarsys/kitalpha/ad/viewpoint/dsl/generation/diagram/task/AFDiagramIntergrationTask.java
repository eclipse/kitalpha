/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
