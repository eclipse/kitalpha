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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.names;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.constraint.VpDescAbstractModelConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Operation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Parameter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Value;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointClassifier;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointElement;

/**
 * @author Boubekeur Zendagui
 */

public class UniqueValueConstraint extends VpDescAbstractModelConstraint {

	private Object duplicateData = null;
	
	@Override
	protected boolean isObjectInScope(Object object) {
		return (object instanceof NamedElement ?
				object instanceof Attribute || 
				object instanceof AbstractAssociation ||
				object instanceof Value ||
				object instanceof ViewpointClassifier  ||
				object instanceof Parameter || 
				object instanceof Operation
				: false);
	}


	@Override
	protected boolean getDisplayContainerInformations(Object object) {
		return object instanceof Attribute || object instanceof AbstractAssociation;
	}

	
	@Override
	protected void setEStructuralFeatureName(EObject eObject){
		eStructuralFeatureName = "name";
		brothersEStucturalFeature.clear();
		if (eObject instanceof ViewpointClassifier)
		{
			brothersEStucturalFeature.add("VP_Classes");
			brothersEStucturalFeature.add("VP_Enumerations");
		}
		
		if (eObject instanceof Parameter)
			brothersEStucturalFeature.add("parameters");
		
		if (eObject instanceof Value)
			brothersEStucturalFeature.add("ownedValues");
		
		if (eObject instanceof Attribute || eObject instanceof AbstractAssociation || eObject instanceof Operation)
		{
			brothersEStucturalFeature.add("VP_Classes_Associations");
			brothersEStucturalFeature.add("VP_Class_Attributes");
			brothersEStucturalFeature.add("VP_Class_Operations");
		}
	}

	private String getContainerName(EObject eObject){
		String name = ((NamedElement)eObject.eContainer()).getName();
		
		return (name != null && name.trim().length() > 0  
				? name 
				: Messages.bind(Messages.Validation_NoName, 
								eObject.eContainer().eClass().getName()));
	}
	
	@Override
	protected String getMessageToDisplay(EObject eObject) {
		String msg = "";
		
		if (getDisplayContainerInformations(eObject))
		{
			Object[] bindings = {
								  eStructuralFeatureName, 
								  eObject.eClass().getName(), 
								  getContainerName(eObject), 
								  duplicateData.toString()
								};
			msg = Messages.bind(Messages.Validation_UniqueValue_WithParent, bindings);
		}
		else
		{
			Object[] bindings = {
					  			 eStructuralFeatureName, 
					  			 eObject.eClass().getName(), 
					  			 duplicateData.toString()
								};
			msg = Messages.bind(Messages.Validation_UniqueValue_WithoutParent, bindings);
		}
		
		return msg; 
					
	}

	private Object getEStructuralFeatureValue(EObject eObject, String name){
		EStructuralFeature eStructuralFeature = eObject.eClass().getEStructuralFeature(name);
		return eObject.eGet(eStructuralFeature);
	}
	
	/**
	 * This method analyze data parameter and keep only {@link ViewpointElement}.
	 * @param data the data
	 * @return a {@link List} containing only {@link ViewpointElement}.
	 */
	private List<ViewpointElement> keepOnlyViewpointElement(Object data){
		List<ViewpointElement> result = new BasicEList<ViewpointElement>();
		if (data instanceof List<?>)
		{
			List<?> list = (List<?>) data;
			for (Object object : list) 
			{
				if (object instanceof ViewpointElement)
					result.add((ViewpointElement) object);
			}
		}
		
		if (data instanceof ViewpointElement)
		{
			result.add((ViewpointElement) data);
		}
		
		return result;
	}
	
	@Override
	protected boolean isValidData(EObject context, Object data) {
		List<ViewpointElement> list = keepOnlyViewpointElement(data);
		
		for (ViewpointElement vpElement : list) 
		{
			Object fixedValue = getEStructuralFeatureValue(vpElement, eStructuralFeatureName);
			for (ViewpointElement vpElement2 : list) 
			{
				Object currentValue = getEStructuralFeatureValue(vpElement2, eStructuralFeatureName);
				
				fixedValue = (fixedValue instanceof String ? ((String)fixedValue).toLowerCase() : fixedValue);
				currentValue = (currentValue instanceof String ? ((String)currentValue).toLowerCase() : currentValue);
				
				if (currentValue != null && fixedValue != null && vpElement2 != vpElement && fixedValue.equals(currentValue))
				{
					boolean uniqueOperationNameAndSignatureIsOK = false;
					if (vpElement instanceof Operation && vpElement2 instanceof Operation)
					{
						uniqueOperationNameAndSignatureIsOK = ! isThereOperationWithSameNameAndSignature((Operation) vpElement, (Operation) vpElement2);
					}
					
					if (! uniqueOperationNameAndSignatureIsOK)
					{
						duplicateData = fixedValue;
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
	/**
	 * @param operations a set of {@link Operation} to check
	 * @return True if there is operation sharing the same name and the same signature, False otherwise 
	 */
	private boolean isThereOperationWithSameNameAndSignature(Operation fixedOperation, Operation currentOperation){
		if (! currentOperation.equals(fixedOperation))
		{
			final EList<Parameter> fixedOperationParameters = fixedOperation.getParameters();
			final EList<Parameter> currentOperationParameters = currentOperation.getParameters();
			// Condition 1: Same Parameter count
			if (currentOperationParameters.size() == fixedOperationParameters.size())
			{
				boolean sameSignature = true;
				for (int i = 0; i < currentOperationParameters.size(); i++) 
				{
					final Parameter cParameter = currentOperationParameters.get(i);
					final AbstractType cParameterType = cParameter.getParameter_type();
					final Parameter fParameter = fixedOperationParameters.get(i);
					final AbstractType fParameterType = fParameter.getParameter_type();
					if (cParameterType.getConcretType().equals(fParameterType.getConcretType()) 
							&& cParameterType.getCardinality().isMultiple() == fParameterType.getCardinality().isMultiple()	)
						continue;
					else
					{
						sameSignature = false;
						break;
					}
				}

				// Condition 2: Same SIGNATURE
				if (sameSignature)
				{
					return true;
				}
			}
		}
		return false;
	}

}
