/*******************************************************************************
 * Copyright (c) 2015, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.style.customization.validation.appliedon;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Switch;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.style.customization.validation.internal.CustomizationLabelSwitch;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelAlignmentCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificNodeStyleCustomization;


/**
 * @author Boubekeur Zendagui
 */
public class SpecificCustomizationAppliedOnNotEmpty implements IAdditionalConstraint {

	public SpecificCustomizationAppliedOnNotEmpty() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#isObjectInScope(java.lang.Object)
	 */
	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof SpecificContainerStyleCustomization ||
			   object instanceof SpecificNodeStyleCustomization ||
			   object instanceof LabelAlignmentCustomization;
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#validationRules(java.lang.Object)
	 */
	@Override
	public ValidationStatus validationRules(Object data) {
		EList<? extends EObject> appliedOn = null;
		if (data instanceof SpecificNodeStyleCustomization)
		{
			SpecificNodeStyleCustomization specificNodeStyleCustomization = (SpecificNodeStyleCustomization) data;
			appliedOn = specificNodeStyleCustomization.getAppliedOn();
		}
		
		if (data instanceof SpecificContainerStyleCustomization)
		{
			SpecificContainerStyleCustomization specificContainerStyleCustomization = (SpecificContainerStyleCustomization) data;
			appliedOn = specificContainerStyleCustomization.getAppliedOn();
		}
		
		if (data instanceof LabelAlignmentCustomization)
		{
			LabelAlignmentCustomization labelAlignmentCustomization = (LabelAlignmentCustomization) data;
			appliedOn = labelAlignmentCustomization.getAppliedOn();
		}
		
		// A guard to avoid NPE
		if (appliedOn == null)
			return  ValidationStatus.Ignored;
		
		EObject eData = (EObject) data;
		AbstractCustomization parent = (AbstractCustomization) eData.eContainer();
		boolean applyOnAll = parent.isApplyonAll();

		if (!applyOnAll && appliedOn.isEmpty())
		{
			return ValidationStatus.Error;
		} 
		else
		{
			return ValidationStatus.Ok;
		}
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#getMessage(org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus, java.lang.Object)
	 */
	@Override
	public String getMessage(ValidationStatus status, Object object) {
		String msg = "";
		
		if (status.equals(ValidationStatus.Error))
		{
			Switch<String> snscNameSwitch = new CustomizationLabelSwitch();
			String sscName = snscNameSwitch.doSwitch((EObject)object);
			if (sscName != null && !sscName.isEmpty())
			{
				msg = sscName + " is not useful, it should be removed";
			}
		}
		
		return msg;
	}
}