/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.tasks;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.project.AfProjectManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.utils.AfConstants;

/**
 * @author Boubekeur Zendagui
 */

public class AfProjectManagerTask implements ITaskProduction {


	@Override
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

		// Read contracts values
		String vpName = productionContext.getInputValue(AfConstants.NAME, String.class);
		String vpShortName = productionContext.getInputValue(AfConstants.SHORT_NAME, String.class);
		String projectName = productionContext.getInputValue(AfConstants.CONTRACT_PROJECT_NAME, String.class);
		productionContext.setOutputValue(AfConstants.CONTRACT_FEATURE_NAME, projectName+".af.feature");
		productionContext.setOutputValue(AfConstants.CONTRACT_PROJECT_NAME, projectName+".af");
		String vpID = projectName;
		try {
			
			// AF Project creation
			IProject afProject = AfProjectManager.INSTANCE.createProject(projectName, vpName, vpShortName, vpID, monitor);

			// Register the created project in the output list contract.
			// This is done in order to add the project in the AF feature.
			ArrayList<String> prjList = new ArrayList<String>();
			prjList.add(afProject.getName());
			productionContext.setOutputValue(AfConstants.CONTRACT_PROJECT_LIST, prjList);
			
			
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}


	@Override
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

}
