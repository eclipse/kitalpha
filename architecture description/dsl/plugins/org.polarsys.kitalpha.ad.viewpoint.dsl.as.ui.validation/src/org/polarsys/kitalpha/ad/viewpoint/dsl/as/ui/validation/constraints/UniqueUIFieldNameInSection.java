/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.ui.validation.constraints;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.ui.validation.message.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class UniqueUIFieldNameInSection implements IAdditionalConstraint {

	private String duplicatedName = "";
	
	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#isObjectInScope(java.lang.Object)
	 */
	public boolean isObjectInScope(Object object) {
		return object instanceof UIField;
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#validationRules(java.lang.Object)
	 */
	public ValidationStatus validationRules(Object data) {
		// Init local variables
		duplicatedName = "";
		
		// Get the concerned UIField
		UIField current = (UIField) data;
		/* 
		 * If the name of the UIField is null then Return an OK Status and let the non-null name 
		 * Validation rule doing it work
		 */
		if (current.getName() == null)
			return ValidationStatus.Ok;
		
		final List<UIContainer> allAvailableSections = getAllAvailableSections(current);
		for (UIContainer uiContainer : allAvailableSections) 
		{
			if (duplicateFieldsName(uiContainer, current))
			{
				return ValidationStatus.Error;
			}
		}
		
		return ValidationStatus.Ok;
	}
	
	/**
	 * Look for duplicate Name in a given {@link UIContainer}
	 * @param parent the parent {@link UIContainer} of the {@link UIField} under validation 
	 * @param referenceObject the {@link UIField} under validation 
	 * @return <code> True </code> if there is a duplicate name, <code>False</code> otherwise
	 */
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
	
	/**
	 * Get the UI Container that will be used to generate a Section in the UI Tab
	 * @param uiField the concerned {@link UIField}
	 * @return the {@link UIContainer} used to generate a Section
	 */
	private List<UIContainer> getAllAvailableSections(UIField uiField){
		EList<UIContainer> result = new BasicEList<UIContainer>();
		EObject current = uiField.eContainer();
		while (! (current instanceof UIDescription))
		{
			current = current.eContainer();
		}
		
		UIDescription uiDescription = (UIDescription) current;
		for (UI ui : uiDescription.getUIs()) 
		{
			final EList<UIContainer> uiContainers = ui.getUI_Containers();
			if (! uiContainers.isEmpty())
			{
				result.addAll(uiContainers);
			}
		}
		
		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#getMessage(...)
	 */
	public String getMessage(ValidationStatus status, Object eObject) {
		return Messages.bind(Messages.Validation_UIField_Unique_NameInSection, duplicatedName);
	}

}
