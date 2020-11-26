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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.condition;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.DomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ForeignExpressionElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Condition;

/**
 * @author Boubekeur Zendagui
 */

public class NoCollectionDomainAttributeCondition implements IAdditionalConstraint {

	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof Condition;
	}

	@Override
	public ValidationStatus validationRules(Object data) {
		Condition condition = (Condition) data;
		ForeignExpressionElement foreignExpressionElement = condition.getExpression();
		if (foreignExpressionElement instanceof DomainElement)
		{
			DomainElement domainElement = (DomainElement) foreignExpressionElement;
			Attribute attribute = domainElement.getAttribute();
			if (attribute != null)
			{
				Cardinalities cardinality = attribute.getCardinality();
				if (cardinality.equals(Cardinalities.NOTHING_OR_MANY) || 
						cardinality.equals(Cardinalities.ONE_OR_MANY)) {
					return ValidationStatus.Error;
				}
			}
		}
		return ValidationStatus.Ignored;
	}

	@Override
	public String getMessage(ValidationStatus status, Object object) {
		if (status.equals(ValidationStatus.Error))
		{
			Condition condition = (Condition) object;
			DomainElement domainElement = (DomainElement) condition.getExpression();
			Attribute attribute = domainElement.getAttribute();
			String attributeName = attribute.getName();
			if (attributeName == null || attributeName.length() == 0)
			{
				attributeName = Messages.Validation_VpSpec_Attribute_NoName;
			}
			Class clazz = (Class)attribute.eContainer();
			String clazzName = clazz.getName();
			if (clazzName == null || clazzName.length() == 0)
			{
				clazzName = Messages.Validation_VpSpec_Class_NoName;
			}
			
			return Messages.bind(Messages.Validation_Condition_Attribute_CollectionKind, clazzName, attributeName);
		}
		return "OK";
	}

}
