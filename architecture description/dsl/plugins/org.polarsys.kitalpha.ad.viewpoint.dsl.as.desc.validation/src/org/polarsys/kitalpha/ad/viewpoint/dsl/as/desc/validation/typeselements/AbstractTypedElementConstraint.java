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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.typeselements;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.constraint.VpDescAbstractModelConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.message.Messages;

/**
 * @author Boubekeur Zendagui
 */

public abstract class AbstractTypedElementConstraint extends VpDescAbstractModelConstraint{

	@Override
	protected abstract void setEStructuralFeatureName(EObject eObject);
	
	@Override
	protected abstract boolean isObjectInScope(Object object);
	
	/**
	 * Default implementation
	 */
	@Override
	protected boolean isValidData(EObject context, Object data) {
		return data != null;
	}

	/**
	 * Default implementation
	 */
	@Override
	protected boolean getDisplayContainerInformations(Object object) {
		return false;
	}

	/**
	 * Compute the message to display if data is not valid
	 * @param eObject object to validate
	 */
	@Override
	protected String getMessageToDisplay(EObject eObject) {
		String containerName = getElementName(eObject.eContainer());
		String objectName = getElementName(eObject);
		// Do this test to ensure that objectName value is not null 
		objectName = (isNotEmpty(objectName) ?  objectName : "");
		
		String msg = "";
		
		if(isNotEmpty(containerName))
		{
			Object[] bindings = {
								  eObject.eClass().getName(),
								  containerName,
								  objectName,
								  eStructuralFeatureName
								};
			msg = Messages.bind(Messages.Validation_AttributeType_NotEmpty_WithParent, bindings);
		}
		else
		{
			Object[] bindings = {
								  eObject.eContainer().eClass().getName(),
								  objectName,
								  eStructuralFeatureName
								};
			msg = Messages.bind(Messages.Validation_AttributeType_NotEmpty_WithoutParent, bindings);
		}
			
		return msg;
	}

}
