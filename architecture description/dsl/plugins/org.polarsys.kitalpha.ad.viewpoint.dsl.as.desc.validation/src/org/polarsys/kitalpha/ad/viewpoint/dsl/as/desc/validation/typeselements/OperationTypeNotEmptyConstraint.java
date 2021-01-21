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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.typeselements;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalType;

/**
 * @author Boubekeur Zendagui
 */

public class OperationTypeNotEmptyConstraint extends OperationParameterTypeNotEmptyConstraint {

	@Override
	protected void setEStructuralFeatureName(EObject eObject) {
		eStructuralFeatureName = "type";
	}

	@Override
	protected boolean isObjectInScope(Object object) {
		return object instanceof ExternalType || object instanceof LocalType;
	}

	@Override
	protected String getElementName(EObject eObject) {
		if (isObjectInScope(eObject)) {
			return "Type";
		}
		return super.getElementName(eObject);
	}

}
