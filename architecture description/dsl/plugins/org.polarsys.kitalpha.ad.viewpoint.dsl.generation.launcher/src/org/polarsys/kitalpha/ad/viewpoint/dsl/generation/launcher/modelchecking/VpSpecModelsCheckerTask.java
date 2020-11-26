/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.launcher.modelchecking;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.utils.LaunchBachMode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.Activator;

/**
 * @author Boubekeur Zendagui
 */

public class VpSpecModelsCheckerTask extends TaskProductionAdapter {

	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor)  throws InvocationException {
		EMFDomain emfDomain = productionContext.getInputValue(VPDESC_MODEL, EMFDomain.class);

		EObject eObject = (EObject) emfDomain.getContent().get(0);

		if (LaunchBachMode.isObjectConcerned(eObject)){
			IStatus status = LaunchBachMode.checkEObject(eObject);
			if (! status.isOK()) 
			{
				String modelName = emfDomain.getUri().segments()[3];
				putErrorOnConsol(modelName, status, monitor);
				monitor.setCanceled(true);
			}
		}
	}
	
	private void putErrorOnConsol(String modelName,IStatus status, IProgressMonitor monitor){
		if (status.getChildren().length != 0)
		{
			for (int i=0; i< status.getChildren().length ; i++)
			{
				String msg = "["+modelName+"] "+status.getChildren()[i].getMessage();
				Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, msg));
			}
		}
		else
		{
			String msg = "["+modelName+"] "+status.getMessage();
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, msg));
		}
	}
}
