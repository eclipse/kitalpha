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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.ui.validation.constraints;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ICoreConstraintContribution;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI;

/**
 * @author Boubekeur Zendagui
 */

public class UniqueUIName implements ICoreConstraintContribution {

	public UniqueUIName() {
	}

	public boolean isObjectInScope(Object object) {
		return object instanceof UI;
	}

	public List<String> brothersEStructuralFeatures() {
		List<String> list = new ArrayList<String>();
		list.add("UIs");
		return list;
	}

}
