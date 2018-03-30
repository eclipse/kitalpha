/*******************************************************************************
 * Copyright (c) 2015, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.style.customization.validation.internal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse;

/**
 * @author Boubekeur Zendagui
 */
public abstract class AbstractStyleCustomizationReuseRule implements IAdditionalConstraint{

	/**
	 * @param reuse a {@link StyleCustomizationReuse} element 
	 * @return Derived classes should returns the list to check
	 */
	protected abstract EList<? extends EObject> getListTocheck(StyleCustomizationReuse reuse);
	
	/**
	 * @return Derived classes should returns the list name to display to the end user
	 */
	protected abstract String getListName();
	
	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#isObjectInScope(java.lang.Object)
	 */
	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof StyleCustomizationReuse;
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#validationRules(java.lang.Object)
	 */
	@Override
	public ValidationStatus validationRules(Object data) {
		final EList<? extends EObject> listTocheck = getListTocheck((StyleCustomizationReuse)data);
		return listTocheck != null && !listTocheck.isEmpty()? ValidationStatus.Ok : ValidationStatus.Error;
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#getMessage(org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus, java.lang.Object)
	 */
	@Override
	public String getMessage(ValidationStatus status, Object object) {
		final String listName = getListName();
		final StyleCustomizationReuse reuse = (StyleCustomizationReuse) object;
		final String name = reuse.getName();
		String message = "style customization "; 
		message = name != null && !name.isEmpty()? "The " + message + name + " ": "A "+  message;
		message += "sould have at least one element in the list " + listName; 
		return message;
	}

}
