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

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.constraint.VpDescAbstractModelConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Enumeration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Operation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Value;

/**
 * @author Boubekeur Zendagui
 */

public class NameNotEmptyConstraint extends VpDescAbstractModelConstraint{

	@Override
	protected void setEStructuralFeatureName(EObject eObject) {
		eStructuralFeatureName =  "name"; //$NON-NLS-1$
	}

	@Override
	protected boolean isObjectInScope(Object object) {
		return (object instanceof NamedElement ?
				object instanceof Class || 
				object instanceof Attribute || 
				object instanceof AbstractAssociation ||
				object instanceof Enumeration ||
				object instanceof Value ||
				object instanceof Operation
				: false);
	}
	
	protected boolean getDisplayContainerInformations(Object object) {
		if (object instanceof Attribute || object instanceof AbstractAssociation) {
			return true;
		}
		
		return false;
	}
	
	@Override
	protected boolean isValidData(EObject context, Object data) {
		String name = (String) data;
		return name != null && name.trim().length() != 0;
	}

	@Override
	protected String getMessageToDisplay(EObject eObject) {
		if (! getDisplayContainerInformations(eObject)) {
			return Messages.bind(Messages.Validation_Name_Empty_OnlyElement, eObject.eClass().getName());
		}
		Object[] bindins = {
							eObject.eContainer().eClass().getName(), 
							getElementName(eObject.eContainer()), 
							eObject.eClass().getName()
						   };
		
		String message = Messages.bind(Messages.Validation_Name_Empty_WithParent, bindins);
		return message;
	}
}
