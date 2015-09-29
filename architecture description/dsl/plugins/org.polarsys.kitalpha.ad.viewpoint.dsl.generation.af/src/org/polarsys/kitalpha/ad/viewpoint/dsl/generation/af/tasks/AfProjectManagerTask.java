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

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.project.AfProjectManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.utils.AfConstants;

/**
 * @author Boubekeur Zendagui
 */

public class AfProjectManagerTask implements ITaskProduction {


	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

		// Read contracts values
		String vpName = productionContext.getInputValue(AfConstants.NAME, String.class);
		String vpShortName = productionContext.getInputValue(AfConstants.SHORT_NAME, String.class);
		String projectName = productionContext.getInputValue(AfConstants.CONTRACT_PROJECT_NAME, String.class);
		productionContext.setOutputValue(AfConstants.CONTRACT_FEATURE_NAME, projectName+".af.feature");
		productionContext.setOutputValue(AfConstants.CONTRACT_PROJECT_NAME, projectName+".af");
//		
		
		boolean wasVPActive = false;
		// Set the vpID to the value of the projectName local variable.
		// The value of projectName is the viewpoint root project name.
		String vpID = projectName;
		try {
			
			// Check if the viewpoint is active. If this is the case, so disable
			// it in order begin modification/manipulation in order to avoid problems 
			if (ViewpointManager.getInstance((EObject)null).isActive(vpID))
			{
				wasVPActive = true;
				ViewpointManager.getInstance((EObject)null).desactivate(vpID);
			}
			// AF Project creation
			IProject afProject = AfProjectManager.INSTANCE.createProject(projectName, vpName, vpShortName, vpID, monitor);

			// Register the created project in the output list contract.
			// This is done in order to add the project in the AF feature.
			ArrayList<String> prjList = new ArrayList<String>();
//			IProject afProject = AfProjectManager.INSTANCE.getProject(); 
			prjList.add(afProject.getName());
			productionContext.setOutputValue(AfConstants.CONTRACT_PROJECT_LIST, prjList);
			
			// Activate the viewpoint if it was disabled by the current task. 
			if (wasVPActive)
				ViewpointManager.getInstance((EObject)null).activate(vpID);
			
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (ViewpointActivationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}


	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

}
