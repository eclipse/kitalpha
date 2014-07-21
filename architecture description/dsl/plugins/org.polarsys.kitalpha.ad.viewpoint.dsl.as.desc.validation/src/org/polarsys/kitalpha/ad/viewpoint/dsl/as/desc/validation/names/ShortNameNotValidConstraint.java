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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 */

public class ShortNameNotValidConstraint extends NameNotValidConstraint  {
	@Override
	protected void setEStructuralFeatureName(EObject eObject) {
		eStructuralFeatureName = "shortName"; //$NON-NLS-1$
	}
	@Override
	protected boolean isObjectInScope(Object object) {
		return object instanceof Viewpoint;
	}
	@Override
	protected String getMessageToDisplay(EObject eObject) {
		String message = Messages.bind(Messages.Validation_ShortName_NotValid, eObject.eClass().getName(), getElementShortName(eObject));
		return message;
	}
}
