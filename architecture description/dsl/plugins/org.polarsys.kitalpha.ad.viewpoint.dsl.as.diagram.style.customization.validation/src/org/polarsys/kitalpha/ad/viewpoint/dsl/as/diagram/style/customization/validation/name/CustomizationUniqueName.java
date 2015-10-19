/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.style.customization.validation.name;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ICoreConstraintContribution;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse;

/**
 * @author Boubekeur Zendagui
 */
public class CustomizationUniqueName implements ICoreConstraintContribution {

	public CustomizationUniqueName() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ICoreConstraintContribution#isObjectInScope(java.lang.Object)
	 */
	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof StyleCustomizationDescriptions || object instanceof StyleCustomizationReuse;
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ICoreConstraintContribution#brothersEStructuralFeatures()
	 */
	@Override
	public List<String> brothersEStructuralFeatures() {
		List<String> result = new ArrayList<String>();
		result.add("ownedCustomizationDescriptions");
		result.add("ownedCustomizationReuse");
		return result;
	}

}
