/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.services.validation.constrains;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ICoreConstraintContribution;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule;

/**
 * @author Boubekeur Zendagui
 */

public class UniqueRuleName implements ICoreConstraintContribution {


	public boolean isObjectInScope(Object object) {
		return object instanceof Rule;
	}

	public List<String> brothersEStructuralFeatures() {
		List<String> list = new ArrayList<String>();
		list.add("vpRules");
		return list;
	}

}
