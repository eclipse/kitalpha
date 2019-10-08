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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.constraint;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.exception.NoFeatureNameProvided;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ICoreConstraintContribution;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.VPElementValidatorsManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ShortNamedElement;

/**
 * @author Boubekeur Zendagui
 */

public abstract class VpDescAbstractModelConstraint extends AbstractModelConstraint {

	protected List<String> brothersEStucturalFeature = new ArrayList<String>();
	
	protected String eStructuralFeatureName;
	
	/** Setter of the EStructuralFeature to check */
	protected abstract void setEStructuralFeatureName(EObject eObject);
	
	protected abstract String getMessageToDisplay(EObject eObject);

	/** This method allows to provide implement the data checking routine. */ 
	protected abstract boolean isValidData(EObject context, Object data);
	
	/** Verify if the current EObject is in scope. 
	 *  If it return true, the validate method ask the model for data stored in 
	 *  the registered EStructuralFeature and run the isValidMethod(data) */
	protected abstract boolean isObjectInScope(Object object);
	
	protected abstract boolean getDisplayContainerInformations(Object object);
	
	
	protected void init(EObject object){
		// Purge data
		eStructuralFeatureName =""; //$NON-NLS-1$
		brothersEStucturalFeature.clear();
		
		// Ask derived classes for data
		registerEStructuralFeature(object);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		boolean objectInScope = isObjectInScope(eObj);
		boolean extensionObjectInScope = isObjectInExtensionsScope(eObj, ctx.getCurrentConstraintId());
		
		if (objectInScope || extensionObjectInScope ){
			init(eObj);
			EMFEventType eType = ctx.getEventType();
			// In the case of batch mode.
			if (eType == EMFEventType.NULL) 
			{
				if (extensionObjectInScope)
				{
					List<String> brothers = getBrothersSet(eObj, ctx.getCurrentConstraintId());
					if (brothers != null && brothers.size() > 0) {
						brothersEStucturalFeature = brothers;
					}
				}

				Object dataToCheck = null;
				List<Object> dataToCheckList = new ArrayList<Object>();

				if (brothersEStucturalFeature != null && ! brothersEStucturalFeature.isEmpty())
				{
					for (String current : brothersEStucturalFeature) 
					{
						EStructuralFeature feature = eObj.eContainer().eClass().getEStructuralFeature(current);
						if (feature != null)
						{
							Object currentData = eObj.eContainer().eGet(feature);
							if (currentData != null)
							{
								if (currentData instanceof EList<?>) {
									dataToCheckList.addAll((EList<EObject>)currentData);
								}

								if (currentData instanceof EObject) {
									dataToCheckList.add((EObject)currentData);
								} 
							}
						}
					}
					dataToCheck = dataToCheckList;
				} 
				else {
					dataToCheck = eObj.eGet(eObj.eClass().getEStructuralFeature(eStructuralFeatureName));
				}

				if (! isValidData(eObj, dataToCheck)) {
					return ctx.createFailureStatus(new Object[] {getMessageToDisplay(eObj)});
				}
			}
		}
		
		return ctx.createSuccessStatus();
	}
	
	private List<String> getBrothersSet(EObject object, String currentConstraintID){
		List<ICoreConstraintContribution> list = VPElementValidatorsManager.getValidatorFor(currentConstraintID);
		
		if (list == null || list.size() == 0) {
			return null;
		}
		
		ArrayList<String> additionalSRF = new ArrayList<String>();

		for (ICoreConstraintContribution vpElementValidator : list) 
		{
			if (vpElementValidator.isObjectInScope(object))
			{
				List<String> additional = vpElementValidator.brothersEStructuralFeatures();
				if (additional != null && additional.size() > 0) {
					additionalSRF.addAll(additional);
				}
			}
		}
		
		return additionalSRF;
	}

	
	protected boolean isObjectInExtensionsScope(EObject object, String currentConstraintID){
		List<ICoreConstraintContribution> list = VPElementValidatorsManager.getValidatorFor(currentConstraintID);
		
		if (list == null || list.size() == 0) {
			return false;
		}
		
		for (ICoreConstraintContribution vpElementValidator : list) 
		{
			if (vpElementValidator.isObjectInScope(object)) {
				return true;
			}
		}
		
		return false;
	}

	private void registerEStructuralFeature(EObject eObject) {
		setEStructuralFeatureName(eObject);
		if (eStructuralFeatureName == null || eStructuralFeatureName.trim().length() == 0)
		{
			try {
				throw new NoFeatureNameProvided();
			} catch (NoFeatureNameProvided e) {
				e.printStackTrace();
			}
		}
	}
	
	protected String getElementName(EObject eObject) {
		String result = Messages.bind(Messages.Validation_NoName, eObject.eClass().getName());
		String name = ((NamedElement)eObject).getName();
		return (!(eObject instanceof NamedElement) || ! isNotEmpty(name)? result :  name );
	}
	
	protected String getElementShortName(EObject eObject) {
		String result = Messages.bind(Messages.Validation_NoName, eObject.eClass().getName());
		String shortName = ((ShortNamedElement)eObject).getShortName();
		return (isNotEmpty(shortName) ? shortName : result ) ;
	}
	
	protected boolean isNotEmpty(String data){
		return data != null && data.trim().length() != 0;
	}
}

