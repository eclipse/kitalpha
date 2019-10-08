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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation;

/**
 * @author Boubekeur Zendagui
 */

public class LocalClassAssociationLocalTargetNotEmptyConstraint extends AbstractTypedElementConstraint {

	@Override
	protected void setEStructuralFeatureName(EObject eObject) {
		eStructuralFeatureName = "LocalTarget";
	}

	@Override
	protected boolean isObjectInScope(Object object) {
		return object instanceof LocalClassAssociation;
	}

}
