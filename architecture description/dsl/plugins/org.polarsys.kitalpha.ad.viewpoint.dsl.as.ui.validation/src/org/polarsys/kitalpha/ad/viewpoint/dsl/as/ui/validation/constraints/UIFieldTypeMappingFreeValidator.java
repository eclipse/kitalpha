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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.ui.validation.constraints;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.FieldMapping;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI_Field_Type;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.ui.validation.message.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class UIFieldTypeMappingFreeValidator implements IAdditionalConstraint {

	public boolean isObjectInScope(Object object) {
		return object instanceof UIField;
	}

	public ValidationStatus validationRules(Object data) {
		UIField uiField = (UIField) data;
		UI_Field_Type uiFieldType = uiField.getType();
		FieldMapping fieldMapping =  uiField.getMapping();

		if (uiFieldType == null || fieldMapping == null) 
		{
			return ValidationStatus.Ignored;
		}

		AbstractFeature abstractFeature = fieldMapping.getUI_Field_Mapped_To();
		if (abstractFeature == null)
		{
			return ValidationStatus.Ignored;
		}

		// Case of an Association
		if (abstractFeature instanceof AbstractAssociation)
		{
			Cardinalities cardinalities =  ((AbstractAssociation)abstractFeature).getCardinality();
			switch (cardinalities) {
			case NOTHING_OR_MANY:
			case ONE_OR_MANY:
				return (uiFieldType.equals(UI_Field_Type.MULTIPLE_CHOICE_LIST) ? ValidationStatus.Ok : ValidationStatus.Error);

			case NOTHING_OR_ONE:
			case ONLY_ONE:
				return (uiFieldType.equals(UI_Field_Type.SIMPLE_CHOICE_LIST) ? ValidationStatus.Ok : ValidationStatus.Error);
			}
		}

		// Case of an Attribute
		if (abstractFeature instanceof Attribute)
		{
			Attribute attribute = (Attribute) abstractFeature;
			AbstractAttributeType attributeType = attribute.getOwned_type();

			/** 
			 * Check if the attribute has a type. If this is the case, ignore this validation 
			 * rule because attribute validity is checked by another rule.
			 */
			if (attributeType == null)
			{
				return ValidationStatus.Ignored;
			}

			String typeName = attributeType.getName();

			switch (uiFieldType) {
			case CHECKBOX:
				return (typeName.equals("EBoolean") ? ValidationStatus.Ok : ValidationStatus.Error);

			case RADIOBOX:
				return (checkAttributeTypeForRadioBox(attributeType) ? ValidationStatus.Ok : ValidationStatus.Error);

			case TEXT:
			case RICHTEXT:
			case TEXTAREA:
				return (! (typeName.equals("EBoolean") || typeName.equals("EEnumerator")) ? ValidationStatus.Ok : ValidationStatus.Error);

			case MULTIPLE_CHOICE_LIST:
			case SIMPLE_CHOICE_LIST:
				return ValidationStatus.Error;
			}
		}
		return ValidationStatus.Ignored;
	}
	
	private boolean checkAttributeTypeForRadioBox(AbstractAttributeType type){
		if (type instanceof LocalAttributeType)
		{
			return ((LocalAttributeType) type).getType() != null;
		}
		
		if (type instanceof ExternalAttributeType)
		{
			final EDataType eType = ((ExternalAttributeType) type).getType();
			return eType instanceof EEnum || eType.getName().equals("EEnumerator"); 
		}
		
		
		return false;
	}
	
	public String getMessage(ValidationStatus status, Object eObject) {
		UIField uiField = (UIField) eObject;
		UI_Field_Type uiFieldType = uiField.getType();
		FieldMapping fieldMapping =  uiField.getMapping();

		if (uiFieldType == null || fieldMapping == null) 
		{
			return null;
		}

		UIContainer container = (UIContainer)uiField.eContainer();
		Object[] bindings = {container.getName(), uiField.getName(), uiFieldType.getLiteral()};
		String mainMessage = Messages.bind(Messages.Validation_UIField_Mapping_MainMessage, bindings);
		String canNotBeMapped = Messages.Validation_UIField_Mapping_CanNotBeMapped;
		String mustBeMapped = Messages.Validation_UIField_Mapping_MustBeMapped;

		AbstractFeature abstractFeature = fieldMapping.getUI_Field_Mapped_To();
		if (abstractFeature == null) {
			return null;
		}

		// Case of an Association
		if (abstractFeature instanceof AbstractAssociation)
		{
			if ((! uiFieldType.equals(UI_Field_Type.SIMPLE_CHOICE_LIST)) && 
					(! uiFieldType.equals(UI_Field_Type.MULTIPLE_CHOICE_LIST)))
			{
				return mainMessage + canNotBeMapped + Messages.Validation_UIField_Association_Fragment1;
			}

			Cardinalities cardinalities =  ((AbstractAssociation)abstractFeature).getCardinality();
			mainMessage += canNotBeMapped + Messages.Validation_UIField_Association_Fragment2;

			switch (cardinalities) {
			case NOTHING_OR_MANY:
			case ONE_OR_MANY:
				final String nothingOrMany = Cardinalities.NOTHING_OR_MANY.getLiteral();
				final String oneOrMany = Cardinalities.ONE_OR_MANY.getLiteral();
				return mainMessage + Messages.bind(Messages.Validation_UIField_Association_Cardinalities, nothingOrMany, oneOrMany);
			case NOTHING_OR_ONE:
			case ONLY_ONE:
				final String nothingOrOne = Cardinalities.NOTHING_OR_ONE.getLiteral();
				final String onlyOne = Cardinalities.ONLY_ONE.getLiteral() ;
				return mainMessage + Messages.bind(Messages.Validation_UIField_Association_Cardinalities, nothingOrOne, onlyOne);
			}
		}

		// Case of an Attribute
		if (abstractFeature instanceof Attribute)
		{
			switch (uiFieldType) {
			case CHECKBOX:
				return mainMessage + mustBeMapped + Messages.Validation_UIField_Attribute_Boolean;

			case RADIOBOX:
				return mainMessage + mustBeMapped + Messages.Validation_UIField_Attribute_Enumerator;

			case TEXT:
			case RICHTEXT:
			case TEXTAREA:
				return mainMessage + canNotBeMapped + Messages.Validation_UIField_Attribute_Other;

			case MULTIPLE_CHOICE_LIST:
			case SIMPLE_CHOICE_LIST:
				return mainMessage + canNotBeMapped + Messages.Validation_UIField_Attribute;
			}
		}

		return "";
	}

}
