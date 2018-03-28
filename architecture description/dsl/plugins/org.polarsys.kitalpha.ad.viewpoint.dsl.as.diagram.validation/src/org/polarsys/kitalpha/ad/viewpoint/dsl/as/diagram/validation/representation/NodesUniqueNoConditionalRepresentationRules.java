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

	public boolean isObjectInScope(Object object) {
		return object instanceof AbstractNode;
	}

	public ValidationStatus validationRules(Object data) {
		EObject eONode = (EObject)data;
		
		EStructuralFeature feature = eONode.eClass().getEStructuralFeature("style");
		if (feature != null)
		{
			Object o_style = eONode.eGet(feature);
			if (o_style != null && o_style instanceof EList<?>)
			{
				@SuppressWarnings("unchecked")
				EList<AbstractDescription> e_Styles =  (EList<AbstractDescription>) o_style;
				int conditional_representation_count = 0;
				for (AbstractDescription abstractDescription : e_Styles) 
				{
					if (abstractDescription.getCondition() == null)
						conditional_representation_count ++;
					
					if (conditional_representation_count > 1)
						return ValidationStatus.Error;
				}
			}
		}
		
		return ValidationStatus.Ok;
	}

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
