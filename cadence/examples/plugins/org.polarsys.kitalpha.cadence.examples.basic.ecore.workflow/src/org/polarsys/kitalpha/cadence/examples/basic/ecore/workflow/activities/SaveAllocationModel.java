/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.cadence.examples.basic.ecore.workflow.activities;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.cadence.examples.basic.ecore.workflow.Activator;

public class SaveAllocationModel implements IActivity {

	private static final String ALLOCATION_MODEL_PARAMETER_NAME = "allocationModel"; //$NON-NLS-1$
	private static final String SEMANTIC_MODEL_PARAMETER_NAME = "semanticModel";//$NON-NLS-1$
	private static final String SUFFIX_DESCRIPTION = "The suffix for the copy of the allocation model.";//$NON-NLS-1$
	private static final String SUFFIX_VALUE = "_temp"; //$NON-NLS-1$
	private static final String FILE_NAME_SUFFIX_NAME = "File name suffix";
	private Collection<DeclaredParameter> cdp = new HashSet<DeclaredParameter>();

	public SaveAllocationModel() {

		DeclaredParameter suffix = new DeclaredParameter(FILE_NAME_SUFFIX_NAME,
				SUFFIX_VALUE, SUFFIX_DESCRIPTION);
		cdp.add(suffix);

	}

	public Collection<DeclaredParameter> getParameters() {

		return cdp;
	}

	@SuppressWarnings("unchecked")
	public IStatus run(ActivityParameters activityParams_p) {

		IStatus status = Status.OK_STATUS;

		List<EObject> semanticModelRoot = (List<EObject>) activityParams_p
				.getParameter(SEMANTIC_MODEL_PARAMETER_NAME).getValue();
		EObject allocationModel = (EObject) activityParams_p.getParameter(
				ALLOCATION_MODEL_PARAMETER_NAME).getValue();
		EObject semanticModel = semanticModelRoot.get(0);

		Resource semanticModelResource = semanticModel.eResource();
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		String modelname = semanticModelResource.getURI()
				.toPlatformString(true);

		String suffix = "";

		GenericParameter<?> declaredParameter = activityParams_p
				.getParameter(FILE_NAME_SUFFIX_NAME);
		suffix = (String) declaredParameter.getValue();

		// Get the URI of the model file.
		String extension = suffix + "."
				+ (allocationModel.eClass().getEPackage().getName()).toString();

		URI fileURI = URI.createPlatformResourceURI(modelname.replaceAll(
				semanticModelResource.getURI().fileExtension(), extension),
				true);

		// Create a resource for this file.
		Resource resource = resourceSet.createResource(fileURI);
		resource.getContents().add(allocationModel);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			status = new Status(Status.ERROR, Activator.PLUGIN_ID, e
					.getMessage());
			Activator.getDefault().getLog().log(status);
		}

		return status;
	}

	@SuppressWarnings("unchecked")
	public Map<String, ParameterError<?>> validateParameters(
			ActivityParameters valuedParameters_p) {
		Map<String, ParameterError<?>> errors = new HashMap<String, ParameterError<?>>();

		GenericParameter<String> declaredParameter = (GenericParameter<String>) valuedParameters_p
				.getParameter(FILE_NAME_SUFFIX_NAME);

		String suffix = (String) declaredParameter.getValue();
		if (suffix.equals("") || !Pattern.matches("[(\\w|_)*]*", suffix)) {
			String reason = "The suffix can't contain any charaters except : a-z, 0-9 and _ ";
			if (suffix.equals("")) {
				reason = "You should define a suffix";
			}

			ParameterError<String> badValue = new ParameterError<String>(
					declaredParameter, reason);
			errors.put(FILE_NAME_SUFFIX_NAME, badValue);
		}

		return errors;
	}

}
