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

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.util.MappingUtils;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription;

/**
 * @author Boubekeur Zendagui
 */

public class MappingRepresentationStyleNLabelRules implements IAdditionalConstraint {
	
	private static final int Flag_Container_Import_EitherLabelOrStyle = 1;
	private static final int Flag_Node_Import_EitherLabelOrStyle = 2;

	private static final int Flag_Container_StyleIsNull = 3;
	private static final int Flag_Node_StyleIsNull = 4;

	
	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof AbstractDescription;
	}

	@Override
	public ValidationStatus validationRules(Object data) {
		if (data instanceof ContainerDescription)
		{
			ContainerDescription cDescription = (ContainerDescription) data;
			EObject container = cDescription.eContainer();
			if (MappingUtils.isImport(container))
			{
				if (cDescription.getStyle() == null && cDescription.getNode_Label() == null) {
					return ValidationStatus.getErrorStatusWithRuleFlag(Flag_Container_Import_EitherLabelOrStyle);
				}
			}
			else
			{
				if (cDescription.getStyle() == null) {
					return ValidationStatus.getErrorStatusWithRuleFlag(Flag_Container_StyleIsNull);
				}
			}
		}
		
		if (data instanceof NodeDescription)
		{
			NodeDescription nDescription = (NodeDescription) data;
			EObject node = nDescription.eContainer();
			if (MappingUtils.isImport(node))
			{
				if (nDescription.getStyle() == null && nDescription.getNode_Label() == null) {
					return ValidationStatus.getErrorStatusWithRuleFlag(Flag_Node_Import_EitherLabelOrStyle);
				}
			}
			else
			{
				if (nDescription.getStyle() == null) {
					return ValidationStatus.getErrorStatusWithRuleFlag(Flag_Node_StyleIsNull);
				}
			}
		}
		
		return ValidationStatus.Ok;
	}

	@Override
	public String getMessage(ValidationStatus status, Object object) {
		NamedElement container = (NamedElement) ((EObject) object).eContainer();
		
		String elementType = container.eClass().getName();
		String nodeName = container.getName();
		
		String message = (nodeName != null && nodeName.trim().length() > 0 ? nodeName : "A " + elementType );
		String messageImport = (nodeName != null && nodeName.trim().length() > 0 ? nodeName : "An imported " + elementType );
		
		int flag = Integer.valueOf(status.getRuleFlag().toString());
		switch (flag) {
			case Flag_Container_Import_EitherLabelOrStyle:
			case Flag_Node_Import_EitherLabelOrStyle:
				return Messages.bind(Messages.Validation_Representation_Import_EitherLabelOrStyle, messageImport);
			
			case Flag_Container_StyleIsNull:	
			case Flag_Node_StyleIsNull:	
				return Messages.bind(Messages.Validation_Representation_StyleIsNull, message);
		}
		return null;
	}

}
