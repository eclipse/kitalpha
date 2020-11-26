/*******************************************************************************
 * Copyright (c) 2015, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.validatation.rules;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ActivityExplorerItem;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.validatation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;

/**
 * @author Boubekeur Zendagui
 */
public class ActivityExplorerItemNotEmptyIDConstraint implements IAdditionalConstraint  {

	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof ActivityExplorerItem;
	}

	@Override
	public ValidationStatus validationRules(Object data) {
		ActivityExplorerItem item = (ActivityExplorerItem)data;
		
		String itemID = item.getActivityExplorerItemID();
		
		if (null == itemID) {
			return ValidationStatus.Error;
		}
		
		if (itemID.trim().isEmpty()) {
			return ValidationStatus.Error;
		}
		
		return ValidationStatus.Ok;
	}

	@Override
	public String getMessage(ValidationStatus status, Object object) {
		final ActivityExplorerItem item = (ActivityExplorerItem) object;
		final String eClassName = item.eClass().getName();
		final String name = item.getName();
		if (null == name || name.trim().isEmpty()) {
			return Messages.bind(Messages.Validation_ActivityExplorerItem_NoNamed_NotEmpty_ID, eClassName);
		}
		return Messages.bind(Messages.Validation_ActivityExplorerItem_Named_NotEmpty_ID, eClassName, name);
	}

}
