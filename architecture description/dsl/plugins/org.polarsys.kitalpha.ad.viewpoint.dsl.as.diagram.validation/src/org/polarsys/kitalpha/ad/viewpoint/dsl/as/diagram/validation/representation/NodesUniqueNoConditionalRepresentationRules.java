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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.representation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode;

/**
 * @author Boubekeur Zendagui
 */

public class NodesUniqueNoConditionalRepresentationRules implements IAdditionalConstraint{

	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof AbstractNode;
	}

	@Override
	public ValidationStatus validationRules(Object data) {
		EObject eONode = (EObject)data;
		
		EStructuralFeature feature = eONode.eClass().getEStructuralFeature("style");
		if (feature != null)
		{
			Object ostyle = eONode.eGet(feature);
			if (ostyle != null && ostyle instanceof EList<?>)
			{
				@SuppressWarnings("unchecked")
				EList<AbstractDescription> eStyles =  (EList<AbstractDescription>) ostyle;
				int conditionalRepresentationCount = 0;
				for (AbstractDescription abstractDescription : eStyles) 
				{
					if (abstractDescription.getCondition() == null) {
						conditionalRepresentationCount ++;
					}
					
					if (conditionalRepresentationCount > 1) {
						return ValidationStatus.Error;
					}
				}
			}
		}
		
		return ValidationStatus.Ok;
	}

	@Override
	public String getMessage(ValidationStatus status, Object object) {
		NamedElement node = (NamedElement) object;
		String elementType = node.eClass().getName();
		String nodeName = node.getName();
		
		if (nodeName != null && nodeName.trim().length() > 0 )
		{
			return Messages.bind(Messages.Validation_Representation_Condition_Unique_WithName, nodeName, elementType);
		}
		else
		{
			return Messages.bind(Messages.Validation_Representation_Condition_Unique_WithoutName, elementType);
		}
	}

}
