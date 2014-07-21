/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.ui.validation.constraints;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.ui.validation.message.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class UniqueUIFieldNameInSection implements IAdditionalConstraint {

	private String duplicatedName = "";
	
	public boolean isObjectInScope(Object object) {
		return object instanceof UIField;
	}

	public ValidationStatus validationRules(Object data) {
		// Init local variables
		duplicatedName = "";
		
		// Get the concerned UIField
		UIField current = (UIField) data;
		if (current.getName() == null)
			return ValidationStatus.Ok;
		
		// Get the UIContainer used to generate the Section
		UIContainer section = getSection(current);
		
		// Check of there is duplicated names and return the result
		return duplicateFieldsName(section, current) ? ValidationStatus.Error : ValidationStatus.Ok;
	}
	
	private boolean duplicateFieldsName(UIContainer parent, UIField referenceObject){
		for (UIField uiField : parent.getUI_fields()) 
		{
			String curName = uiField.getName();
			String referencedName = referenceObject.getName();
			if (uiField != referenceObject && 
					referencedName != null && 
					curName != null &&
					curName.toLowerCase().equals(referencedName.toLowerCase()))
			{
				duplicatedName = curName;
				return true;
			}
		}
		
		boolean error = false;
		
		for (UIContainer uiContainer : parent.getSubContainers()) 
		{
			if (uiContainer.getName().toLowerCase().equals(referenceObject.getName().toLowerCase()))
			{
				duplicatedName = referenceObject.getName();
				return true;
			}
			
			error = duplicateFieldsName(uiContainer, referenceObject);
			if (error)
				return true;
		}
		
		return false;
	}
	
	private UIContainer getSection(UIField uiField){
		UIContainer result = (UIContainer) uiField.eContainer();
		while (result instanceof UIContainer && ! (result.eContainer() instanceof UI))
		{
			result = (UIContainer) result.eContainer();
		}
		
		return result;
	}

	public String getMessage(ValidationStatus status, Object eObject) {
		return Messages.bind(Messages.Validation_UIField_Unique_NameInSection, duplicatedName);
	}

}
