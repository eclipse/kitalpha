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
package org.polarsys.kitalpha.cadence.examples.basic.ecore.workflow.activities;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;

import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.cadence.examples.basic.ecore.workflow.Activator;

public class ModelValidation implements IActivity {

	public ModelValidation() {
		// TODO Auto-generated constructor stub
	}

	public Collection<DeclaredParameter> getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public IStatus run(ActivityParameters activityParams_p) {
		IStatus status = Status.OK_STATUS;

		List<EObject> semanticModelRoot = (List<EObject>) activityParams_p
				.getParameter("semanticModel").getValue();
		for (EObject e : semanticModelRoot) {
			Diagnostic diagnostic = validateWithEMFMetamodelConstraints(e);

			int nbError = 0;
			int nbWarning = 0;
			int nbInfo = 0;

			for (Diagnostic d : diagnostic.getChildren()) {
				if (d.getSeverity() == Diagnostic.ERROR)
					nbError++;
				if (d.getSeverity() == Diagnostic.WARNING)
					nbWarning++;

				if (d.getSeverity() == Diagnostic.INFO)
					nbInfo++;
			}
			String message = "ERROR in the semantic model : " + nbError
					+ " errors and " + nbWarning + " warnings or " + nbInfo
					+ " informations -> validate the model.";

			status = new Status(diagnostic.getSeverity(), Activator.PLUGIN_ID,
					message);
		}

		return status;
	}

	public Map<String, ParameterError<?>> validateParameters(
			ActivityParameters valuedParameters_p) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Diagnostic validateWithEMFMetamodelConstraints(
			EObject eobject_p) {
		EObject eObject = eobject_p;

		Diagnostician diagnostician = new Diagnostician() {

			@Override
			public String getObjectLabel(EObject eObject) {
				return super.getObjectLabel(eObject);
			}

			@Override
			public Diagnostic validate(EObject eObject) {
				return super.validate(eObject);
			}
		};

		return diagnostician.validate(eObject);
	}

}
