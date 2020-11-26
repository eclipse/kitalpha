/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.style.customization.validation.appliedon;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.style.customization.validation.internal.AbstractStyleCustomizationReuseRule;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse;

/**
 * @author Boubekeur Zendagui
 */
public class StyleCustomizationReuseAppliedOnNotEmpty extends AbstractStyleCustomizationReuseRule{

	@Override
	protected EList<EObject> getListTocheck(StyleCustomizationReuse reuse) {
		if (reuse != null)
			return reuse.getAppliedOn();
		else
			return new BasicEList<EObject>();
	}

	@Override
	protected String getListName() {
		return "\"Styles\"";
	}


}
