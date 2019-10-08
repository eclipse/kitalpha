/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.activities;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.transposer.TransposerCorePlugin;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.constants.IConstants;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.emf.resource.ResourceUtil;

/**
 * 
 * @author Guillaume Gebahrt
 *
 */
public class FinalizeTransformation implements IActivity, ITransposerWorkflow {



	public FinalizeTransformation() {
	}

	@Override
	public Collection<DeclaredParameter> getParameters() {
		return null;
	}


	@Override
	public IStatus run(ActivityParameters activityParams_p) {

		IStatus status = Status.CANCEL_STATUS;

		IContext context = (IContext) activityParams_p.getParameter(TRANSPOSER_CONTEXT).getValue();
		Resource resource = (Resource) context.get(IConstants.COMPONENTSIMPLE_RESOURCE);

		if(resource != null){
			ResourceUtil.saveResource(resource);
			dispose(context);

			status = Status.OK_STATUS;
		}else{
			status = new Status(IStatus.ERROR,TransposerCorePlugin.PLUGIN_ID,"no ResourceSet specified");  
		}
		return status;
	}


	/**
	 * @param context_p
	 */
	private void dispose(IContext context_p) {
		context_p.reset();

	}


	@Override
	public Map<String, ParameterError<?>> validateParameters(
			ActivityParameters arg0) {
		return null;
	}

}