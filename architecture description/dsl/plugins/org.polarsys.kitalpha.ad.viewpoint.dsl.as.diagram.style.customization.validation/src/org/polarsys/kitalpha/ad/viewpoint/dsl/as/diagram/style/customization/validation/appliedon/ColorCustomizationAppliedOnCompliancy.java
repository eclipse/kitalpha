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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorUseCase;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.helper.ColorsUseCasesHelper;

/**
 * @author Boubekeur Zendagui
 */
public class ColorCustomizationAppliedOnCompliancy implements IAdditionalConstraint{

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#isObjectInScope(java.lang.Object)
	 */
	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof ColorCustomization;
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#validationRules(java.lang.Object)
	 */
	@Override
	public ValidationStatus validationRules(Object data) {
		ColorCustomization colorCustomization = (ColorCustomization) data;
		EList<EObject> appliedOn = colorCustomization.getAppliedOn();
		for (EObject eObject : appliedOn) 
		{
			boolean acceptColor = ColorsUseCasesHelper.acceptColor(colorCustomization, eObject);
			if (acceptColor == false)
				return ValidationStatus.Error;
		}
		return ValidationStatus.Ok;
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#getMessage(org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus, java.lang.Object)
	 */
	@Override
	public String getMessage(ValidationStatus status, Object object) {
		String msg = "Every thing is well :)";
		if (status.equals(ValidationStatus.Error))
		{
			EList<EClass> wrongSelectedElements = new BasicEList<>();
			ColorCustomization colorCustomization = (ColorCustomization) object;
			EList<EObject> appliedOn = colorCustomization.getAppliedOn();
			for (EObject eObject : appliedOn) 
			{
				if (false == ColorsUseCasesHelper.acceptColor(colorCustomization, eObject) &&
					false == wrongSelectedElements.contains(eObject.eClass()))
					wrongSelectedElements.add(eObject.eClass());
			}
			
			if (wrongSelectedElements.isEmpty() == false)
			{
				ColorUseCase colorUseCase = colorCustomization.getColorUseCase();
				String property = colorUseCase.equals(ColorUseCase.COLOR) ? colorUseCase.toString() : colorUseCase.toString() + " Color"; 
				msg = "The customization of the \""+  property + "\" is not applicable on ";
				
				for (EClass eClass : wrongSelectedElements) 
				{
					msg += eClass.getName();
					if (wrongSelectedElements.indexOf(eClass) == wrongSelectedElements.size() - 2)
						msg += " and " ;
					else if (wrongSelectedElements.indexOf(eClass) < wrongSelectedElements.size() - 2)
						msg += ", ";
				}
				msg += " style description" + (wrongSelectedElements.size() > 1 ? "s" : "");
			}
		}
		return msg;
	}
}
