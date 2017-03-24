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
package org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.activities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.UMLPackage;
import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.transposer.TransposerCorePlugin;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.emf.resource.ResourceUtil;

/**
 * 
 * @author Guillaume Gebhart
 *
 */
public class FinalizeTransformation implements IActivity, ITransposerWorkflow
{

	public FinalizeTransformation()
	{
	}

	protected Resource getUMLResource(ResourceSet resourceSet){
		if (resourceSet != null && !resourceSet.getResources().isEmpty()) {
			for(Resource r : resourceSet.getResources()){
				if (r.getURI() != null && r.getURI().fileExtension().equals(UMLPackage.eNAME)){
					return r;
				}
			}
		}
		return null;
	}

	@Override
	public IStatus run(ActivityParameters activityParams_p)
	{
		
		IStatus status = Status.CANCEL_STATUS;
		
		IContext context = (IContext)activityParams_p.getParameter(TRANSPOSER_CONTEXT).getValue();
		ResourceSet resourceSet = (ResourceSet)context.get(ResourceUtil.TRANSPOSER_RESOURCE_SET);
		Resource resource = getUMLResource(resourceSet);
		
		if (resource != null)
		{
			ResourceUtil.saveResource(resource);
			dispose(context);
			status = Status.OK_STATUS;
		} 
		else 
		{
			status = new Status(IStatus.ERROR, TransposerCorePlugin.PLUGIN_ID, "No ResourceSet Specified");
		}
		
		return status;
	}

	@Override
	public Collection<DeclaredParameter> getParameters()
	{
		return new ArrayList<DeclaredParameter>();
	}

	@Override
	public Map<String, ParameterError<?>> validateParameters(
			ActivityParameters valuedParameters_p) 
	{
		return new HashMap<String, ParameterError<?>>();
	}
	
	
	private void dispose(IContext context_p)
	{
		context_p.reset();
	}
}
