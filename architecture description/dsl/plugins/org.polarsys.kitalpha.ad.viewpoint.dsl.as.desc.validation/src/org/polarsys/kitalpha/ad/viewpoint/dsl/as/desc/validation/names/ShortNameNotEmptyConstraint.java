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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.names;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 */

public class ShortNameNotEmptyConstraint extends NameNotEmptyConstraint{
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
		String message = Messages.bind(Messages.Validation_NoShortName, eObject.eClass().getName());
		return message;
	}
}
