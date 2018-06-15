/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.ui.validation.constraints;

import java.util.List;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ICoreConstraintContribution;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField;

/**
 * @author Boubekeur Zendagui
 */

public class ValidAndNotEmptyVPUIName implements ICoreConstraintContribution {

	public ValidAndNotEmptyVPUIName() {
	}

	@Override
	public boolean isObjectInScope(Object object) {
		return ( object instanceof UI || object instanceof UIContainer || object instanceof UIField);
	}

	@Override
	public List<String> brothersEStructuralFeatures() {
		return null;
	}

}
