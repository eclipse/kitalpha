/**
 * Copyright (c) THALES, 2009. All rights reserved.
 */
package org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.activities;

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
import org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.constants.IConstants;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.emf.resource.ResourceUtil;

/**
 * @author Guillaume Gebahrt
 */
public class InitializeTranformation implements IActivity, ITransposerWorkflow {

	@SuppressWarnings({ "unchecked", "cast" })
	public IStatus run(ActivityParameters activityParams_p) {

		Resource umlResource = null;
		
		// extract the parameters from launch configuration.
		
		//get User Selection
		Collection<Object> selection =  (Collection<Object>) activityParams_p.getParameter(
				TRANSPOSER_SELECTION).getValue();
		
		//get Transposer Context 
		IContext context = (IContext) activityParams_p.getParameter(
				TRANSPOSER_CONTEXT).getValue();

		if (selection == null || selection.isEmpty()) {
			return new Status(IStatus.ERROR, TransposerCorePlugin.PLUGIN_ID,
					"the selection is empty or null");//$NON-NLS-1$
		}

		//force single selection
		Object selectedElement = selection.iterator().next();

		final ResourceSet resourceSet = new ResourceSetImpl();

		if (selectedElement instanceof IFile) {

			String path = ((IFile) selectedElement).getFullPath().toString();
			List<EObject> newSelection = ResourceUtil.loadPlatformResourceURI(
					path, resourceSet);
			
			// clear the user selection
			selection.clear();
			// we relace the selection by this one
			selection.addAll(newSelection);
			selectedElement = newSelection.get(0);
		}
		
		if (selectedElement instanceof EObject
				&& ((EObject) selectedElement).eResource() != null) {
			URI uri = EcoreUtil.getURI((EObject) selectedElement);
			if(uri!=null){
				uri = uri.trimFragment().trimFileExtension().appendFileExtension(IConstants.COMPONENTSIMPLE_EXTENSION).trimFragment(); // compute a URI for UML Model
			}
				 umlResource = resourceSet.createResource(uri);
			
		}
		

		context.put(ResourceUtil.TRANSPOSER_RESOURCE_SET, resourceSet);
		context.put(IConstants.COMPONENTSIMPLE_RESOURCE, umlResource);

		return Status.OK_STATUS;
	}

	/**
	 * @see com.thalesgroup.mde.cadence.core.api.IActivity#getParameters()
	 */
	public Collection<DeclaredParameter> getParameters() {
		//no parameters
		Collection<DeclaredParameter> params = new ArrayList<DeclaredParameter>();
		return params;
	}

	/**
	 * @see com.thalesgroup.mde.cadence.core.api.IActivity#validateParameters(com.thalesgroup.mde.cadence.core.api.parameter.ActivityParameters)
	 */
	public Map<String, ParameterError<?>> validateParameters(
			ActivityParameters valuedParameters_p) {
		//no validation of theses parameters
		Map<String, ParameterError<?>> errors = new HashMap<String, ParameterError<?>>();
		return errors;
	}
}
