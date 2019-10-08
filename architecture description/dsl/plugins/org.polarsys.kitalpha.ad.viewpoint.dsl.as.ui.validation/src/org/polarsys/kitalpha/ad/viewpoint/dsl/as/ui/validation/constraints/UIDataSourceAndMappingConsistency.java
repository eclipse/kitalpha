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

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.FieldMapping;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.LocalClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.ui.validation.message.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class UIDataSourceAndMappingConsistency implements IAdditionalConstraint {

	private String className;
	
	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof FieldMapping;
	}

	@Override
	public ValidationStatus validationRules(Object data) {
		EObject parent = ((EObject)data).eContainer();

		parent = getUIAncestor(parent);

		Class clazz = null; 

		if (parent != null)
		{
			UI ui = (UI) parent;
			EObject ds = ui.getUI_DataSource();

			if (ds == null)
			{
				return ValidationStatus.Ok;
			}
			else
			{
				if (ds instanceof LocalClass)
				{
					LocalClass localClass = (LocalClass) ds;
					clazz = localClass.getUI_For_LocalClass();
				}
			}
		}

		if (clazz != null){
			className = clazz.getName();
			
			FieldMapping fMapping = (FieldMapping) data;
			
			AbstractFeature abstractFeature = fMapping.getUI_Field_Mapped_To();

			for (AbstractFeature iAbstractFeature : clazz.getVP_Class_Attributes())
			{
				if (iAbstractFeature.equals(abstractFeature))
				{
					return ValidationStatus.Ok;
				}
			}

			for (AbstractFeature iAbstractFeature : clazz.getVP_Classes_Associations()) 
			{
				if (iAbstractFeature.equals(abstractFeature))
				{
					return ValidationStatus.Ok;
				}
			}
		}	

		return ValidationStatus.Error;
	}

	private EObject getUIAncestor(EObject parent) {
		while (! (parent instanceof UI))
		{
			parent = parent.eContainer();
		}
		return parent;
	}

	@Override
	public String getMessage(ValidationStatus status, Object object) {
		FieldMapping fMapping = (FieldMapping) object;
		UIField field = (UIField) fMapping.eContainer();
		String fieldName = field.getName();
		return Messages.bind(Messages.Validation_Mapping_Data_check, fieldName,className);
	}

}
