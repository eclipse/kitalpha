/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.style.customization.validation.appliedon;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Switch;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.style.customization.validation.internal.CustomizationLabelSwitch;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractCustomization;

/**
 * @author Boubekeur Zendagui
 */
public class AbstractCustomizationAppliedOnNotEmpty implements IAdditionalConstraint {

	public AbstractCustomizationAppliedOnNotEmpty() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#isObjectInScope(java.lang.Object)
	 */
	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof AbstractCustomization;
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#validationRules(java.lang.Object)
	 */
	@Override
	public ValidationStatus validationRules(Object data) {
		final AbstractCustomization eData = (AbstractCustomization) data;
		final EStructuralFeature appliedOnESF = eData.eClass().getEStructuralFeature("appliedOn");
		if (appliedOnESF != null)
		{
			Object appliedOn_e = eData.eGet(appliedOnESF);
			if (appliedOn_e instanceof EList<?>)
			{
				@SuppressWarnings("unchecked")
				EList<EObject> appliedOn_l = (EList<EObject>) appliedOn_e;
				if (eData.isApplyonAll() == ! appliedOn_l.isEmpty())
					return ValidationStatus.Error;
			}
		}
		return ValidationStatus.Ok;
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#getMessage(org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus, java.lang.Object)
	 */
	@Override
	public String getMessage(ValidationStatus status, Object object) {
		String msg = "";
		final AbstractCustomization eData = (AbstractCustomization) object;
	
		if (status.equals(ValidationStatus.Error))
		{
			Switch<String> snscNameSwitch = new CustomizationLabelSwitch();
			String sscName = snscNameSwitch.doSwitch((EObject)object);
			if (sscName != null && sscName.isEmpty() == false)
			{
				if (eData.isApplyonAll())
					msg = sscName + " \"AppliedOn\" and \"Apply on all\" are used at the same time";
				else
					msg = sscName + " must use either \"AppliedOn\" or \"Apply on all\"";
			}
		}
		
		return msg;
	}

}
