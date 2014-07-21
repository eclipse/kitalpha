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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.ui.validation.constraints;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.FieldMapping;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.ui.validation.message.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class NoUseOfCollectionAttributKind implements IAdditionalConstraint {

	public boolean isObjectInScope(Object object) {
		return object instanceof FieldMapping;
	}

	public ValidationStatus validationRules(Object object) {
		FieldMapping fieldMapping = (FieldMapping) object;
		AbstractFeature abstractFeature = fieldMapping.getUI_Field_Mapped_To();
		
		if (abstractFeature != null && abstractFeature instanceof Attribute)
		{
			Attribute attribute = (Attribute) abstractFeature;
			Cardinalities cardinalities = attribute.getCardinality();
			if (cardinalities != null)
			{
				switch (cardinalities) {
				case NOTHING_OR_MANY:
				case ONE_OR_MANY:
					return ValidationStatus.Error;
					
				case NOTHING_OR_ONE:
				case ONLY_ONE:
					return ValidationStatus.Ok;
				}
			}
		}
		
		return ValidationStatus.Ignored;
	}

	public String getMessage(ValidationStatus status, Object object) {
		if (status.equals(ValidationStatus.Error))
		{
			FieldMapping fieldMapping = (FieldMapping) object;
			Attribute attribute = (Attribute) fieldMapping.getUI_Field_Mapped_To();
			String attributeName = attribute.getName();
			if (attributeName == null || ( attributeName!= null && attributeName.length() == 0))
				attributeName = Messages.Validation_VpSpec_Attribute_NoName;

			Class clazz = (Class)attribute.eContainer();
			String clazzName = clazz.getName();
			if (clazzName == null || ( clazzName!= null && clazzName.length() == 0))
				clazzName = Messages.Validation_VpSpec_Class_NoName;
			
			return Messages.bind(Messages.Validation_UIField_Attribute_CollectionKind, clazzName, attributeName);
		}
		
		return "OK";
	}

}
