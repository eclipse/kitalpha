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

import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.message.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class NameNotValidConstraint extends NameNotEmptyConstraint {

	private static Pattern p = Pattern.compile("^[A-Za-z0-9_]+$"); //$NON-NLS-1$
	@Override
	protected boolean isValidData(EObject context, Object data){
		String name = (String) data;
		if (super.isValidData(context, name))
			return p.matcher(name).matches();
		else
			return true; /* Return true to not fire the Not Valid Name constraint a second time */
	}
	@Override
	protected String getMessageToDisplay(EObject eObject) {
		String message = "";
		if (! getDisplayContainerInformations(eObject))
		{
			Object[] bindings = {
								 eObject.eClass().getName(), 
								 eStructuralFeatureName, 
								 getElementName(eObject)
								};
			
			message = Messages.bind(Messages.Validation_Name_NotValid_OnlyElement, bindings);
		}
		else
		{
			Object[] bindings = {
								 eObject.eClass().getName(), 
								 getElementName(eObject.eContainer()),
								 getElementName(eObject), 
								 eStructuralFeatureName
								};
			
			message = Messages.bind(Messages.Validation_Name_NotValid_WithParent, bindings);
		}
		return message;
	}
}
