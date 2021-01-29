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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.services.validation.constrains;

import java.util.List;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Property;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Service;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ICoreConstraintContribution;

/**
 * @author Boubekeur Zendagui
 */

public class ServicesNameNotEmptyAndValidityCheck implements ICoreConstraintContribution {

	public boolean isObjectInScope(Object object) {
		return (object instanceof Rule || object instanceof Service ||  object instanceof Property);
	}

	public List<String> brothersEStructuralFeatures() {
		return null;
	}

}
