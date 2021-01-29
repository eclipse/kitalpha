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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalAttributeType;

/**
 * @author Boubekeur Zendagui
 */

public class AttrbuteTypeNotEmptyConstraint extends AbstractTypedElementConstraint {

	@Override
	protected void setEStructuralFeatureName(EObject eObject) {
		eStructuralFeatureName = "owned_type";
	}

	@Override
	protected boolean isObjectInScope(Object object) {
		return object instanceof Attribute;
	}

	@Override
	protected boolean isValidData(EObject context, Object data) {
		Object type = null;
		if (data instanceof ExternalAttributeType) {
			type = ((ExternalAttributeType)data).getType();
		}
		
		if (data instanceof LocalAttributeType) {
			type = ((LocalAttributeType)data).getType();
		}
		
		return data != null && type != null;
	}
}
