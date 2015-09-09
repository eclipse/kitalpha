/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.validatation.rules;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.DynamicIcon;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.validatation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.icons.AsbtractValidIconPathConstraint;

/**
 * @author Boubekeur Zendagui
 */
public class IconOnFileExistsConstraint extends AsbtractValidIconPathConstraint {

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#isObjectInScope(java.lang.Object)
	 */
	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof DynamicIcon;
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#getMessage(org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus, java.lang.Object)
	 */
	@Override
	public String getMessage(ValidationStatus status, Object object) {
		return Messages.bind(Messages.Validation_Icon_DynamicIconOnExistence_IconOn, getIconPath((EObject)object));
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.icons.AsbtractValidIconPathConstraint#getIconAttributeName(java.lang.Object)
	 */
	@Override
	public String getIconAttributeName(Object context) {
		return ViewpointActivityExplorerPackage.eINSTANCE.getDynamicIcon_ImagePathOn().getName();
	}

}
