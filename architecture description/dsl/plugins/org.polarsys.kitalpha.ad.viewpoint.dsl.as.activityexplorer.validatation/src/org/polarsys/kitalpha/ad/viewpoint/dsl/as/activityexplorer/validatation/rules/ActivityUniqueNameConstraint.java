/*******************************************************************************
 * Copyright (c) 2015, 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.validatation.rules;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Activity;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.validatation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;

/**
 * @author Boubekeur Zendagui
 */
public class ActivityUniqueNameConstraint implements IAdditionalConstraint {
	
	private String duplicatedName = "";

	public ActivityUniqueNameConstraint() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof Activity;
	}

	@Override
	public ValidationStatus validationRules(Object data) {
		Activity activity = (Activity) data;
		
		EObject eContainer = activity.eContainer().eContainer();
		if (false == eContainer instanceof ViewpointActivityExplorer)
			eContainer = eContainer.eContainer();
		
		if (false == eContainer instanceof ViewpointActivityExplorer)
			throw new RuntimeException(Messages.Validation_Runtime_CantLocateViewpointActivityExplorer);
		
		final ViewpointActivityExplorer activityExplorer = (ViewpointActivityExplorer) eContainer;
		final EList<Activity> allActivities = activityExplorer.getAllActivities();
		
		final String activityName = activity.getName();
		for (Activity iAactivity : allActivities) 
		{
			final String jActivityName = iAactivity.getName();
			if (false == iAactivity.equals(activity) && activityName.equals(jActivityName))
			{
				duplicatedName = activityName;
				return ValidationStatus.Error;
			}
		}
		
		return ValidationStatus.Ok;
	}

	@Override
	public String getMessage(ValidationStatus status, Object object) {
		return Messages.bind(Messages.Validation_Activity_Unique_ActivityName, duplicatedName);
	}

}
