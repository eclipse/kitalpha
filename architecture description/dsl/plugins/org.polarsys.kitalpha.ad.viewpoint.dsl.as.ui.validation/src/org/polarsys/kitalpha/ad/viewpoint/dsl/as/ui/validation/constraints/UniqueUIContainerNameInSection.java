/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.ui.validation.constraints;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.ui.validation.message.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class UniqueUIContainerNameInSection implements IAdditionalConstraint {

	private String duplicatedName = "";
	
	// Select only SubContainers
	@Override
	public boolean isObjectInScope(Object object) {
		return (object instanceof UIContainer 
				&& ((EObject)object).eContainer() instanceof UIContainer);
	}

	@Override
	public ValidationStatus validationRules(Object data) {
		duplicatedName = "";
		
		// Get the concerned UIField
		UIContainer current = (UIContainer) data;
		
		if (current.getName() == null)
		{
			return ValidationStatus.Ok;
		}
		
		// Get the UIContainer used to generate the Section
		UIContainer section = getSection(current);
		return duplicateContainersName(section, current) ? ValidationStatus.Error : ValidationStatus.Ok;
	}
	
	private boolean duplicateContainersName(UIContainer parent, UIContainer referenceObject){
		for (UIContainer uiContainer : parent.getSubContainers()) 
		{
			String name = uiContainer.getName();
			if (referenceObject != null && !referenceObject.equals(uiContainer) &&
					referenceObject.getName().equalsIgnoreCase(name.toLowerCase()))
			{
				duplicatedName = name;
				return true;
			}

			boolean error = false;

			error = duplicateContainersName(uiContainer, referenceObject);
			if (error) 
			{
				return true;
			}
		}

		return false;
	}

	private UIContainer getSection(UIContainer uiField){
		UIContainer result = (UIContainer) uiField.eContainer();
		while (!(result.eContainer() instanceof UI)) {
			result = (UIContainer) result.eContainer();
		}
		
		return result;
	}

	@Override
	public String getMessage(ValidationStatus status, Object eObject) {
		return Messages.bind(Messages.Validation_UIContainer_Unique_NameInSection, duplicatedName);
	}

}
