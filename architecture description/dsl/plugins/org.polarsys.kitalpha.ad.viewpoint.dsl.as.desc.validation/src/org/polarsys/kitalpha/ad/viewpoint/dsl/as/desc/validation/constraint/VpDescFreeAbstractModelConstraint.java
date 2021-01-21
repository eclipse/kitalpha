/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.constraint;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.VPElementValidatorsManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;

/**
 * @author Boubekeur Zendagui
 */

public class VpDescFreeAbstractModelConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		
		List<IAdditionalConstraint> objectFreeValidators = getFreeValidatorsFor(eObj, ctx.getCurrentConstraintId()); 
		if (objectFreeValidators != null && objectFreeValidators.size() > 0)
		{
			for (IAdditionalConstraint vpElementFreeValidator : objectFreeValidators) 
			{
				EMFEventType eType = ctx.getEventType();
				// In the case of batch mode.
				if (eType == EMFEventType.NULL) 
				{
					ValidationStatus status = vpElementFreeValidator.validationRules(eObj);
					switch (status) {
					case Error:
						return ctx.createFailureStatus(new Object[] {vpElementFreeValidator.getMessage(status ,eObj)});
					}
				}
			}
			return ctx.createSuccessStatus();
		}
		return ctx.createSuccessStatus();
	}
	
	protected List<IAdditionalConstraint> getFreeValidatorsFor(EObject object, String currentConstraintID){
		List<IAdditionalConstraint> list = VPElementValidatorsManager.getFreeValidatorFor(currentConstraintID);
		List<IAdditionalConstraint> result = new ArrayList<IAdditionalConstraint>();
		
		if (list == null || list.size() == 0) {
			return result;
		}
		
		for (IAdditionalConstraint vpElementFreeValidator : list) 
		{
			if (vpElementFreeValidator.isObjectInScope(object)) {
				result.add(vpElementFreeValidator);
			}
		}
			
		return result;
	}
}
