/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.activities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.transposer.TransposerCorePlugin;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.constants.IConstants;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.emf.resource.ResourceUtil;

public class InitializeTransformation implements IActivity, ITransposerWorkflow 
{

	public InitializeTransformation()
	{
	}

	@SuppressWarnings("unchecked")
	@Override
	public IStatus run(ActivityParameters activityParams_p)
	{
		Resource umlResource = null;
		
		/*
		 * extract parameters from the launch configuration
		 */
		//1. Get the selection
		Collection<Object> selection = (Collection<Object>)activityParams_p.getParameter(TRANSPOSER_SELECTION).getValue();
		
		//2. get Transposer context
		IContext context = (IContext) activityParams_p.getParameter(TRANSPOSER_CONTEXT).getValue();
		
		if (selection == null || selection.isEmpty())
		{
			return new Status(IStatus.ERROR, TransposerCorePlugin.PLUGIN_ID, "This selection is empty or null");
		}
		
		//3. force single selection
		Object selectedElement = selection.iterator().next();
		
		final ResourceSet resourceSet = new ResourceSetImpl();
		
		if (selectedElement instanceof IFile)
		{
			IFile selectedFile = (IFile)selectedElement;
			String path = selectedFile.getFullPath().toString();
			
			List<EObject> newSelection = ResourceUtil.loadPlatformResourceURI(path, resourceSet);
			
			//4. Clear the user selection
			selection.clear();
			
			//5. Replace the old selection by the new one
			selection.addAll(newSelection);
			selectedElement = newSelection.get(0);
		}
		
		
		if (selectedElement instanceof EObject
				&& ((EObject)selectedElement).eResource() != null)
		{
			URI uri = EcoreUtil.getURI((EObject)selectedElement);
			
			if (uri != null)
			{
				//6. compute the URI of the UML model
				uri = uri.trimFileExtension().appendFileExtension(IConstants.UML_EXTENSION).trimFragment();
			}
			
			umlResource = resourceSet.createResource(uri);
		}
		
		//7. Put the resourceSet and Resource in Transposer context
		context.put(ResourceUtil.TRANSPOSER_RESOURCE_SET, resourceSet);
		context.put(IConstants.UML_RESOURCE, umlResource);
		
		return Status.OK_STATUS;
		
	}

	@Override
	public Collection<DeclaredParameter> getParameters() 
	{
		//No parameters
		return new ArrayList<DeclaredParameter>();
	}

	@Override
	public Map<String, ParameterError<?>> validateParameters(
			ActivityParameters valuedParameters_p) 
	{
		//No validation of these parameters
		Map<String, ParameterError<?>> errors = new HashMap<String, ParameterError<?>>();
		return errors;
	}

}
