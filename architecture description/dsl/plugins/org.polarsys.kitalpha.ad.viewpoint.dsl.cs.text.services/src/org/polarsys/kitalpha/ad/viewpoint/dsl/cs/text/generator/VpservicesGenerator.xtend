/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator

import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.model.vpservices.PropertySet
import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.model.vpservices.RuleSet
import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.model.vpservices.ServiceSet
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.CommonGenerator

class VpservicesGenerator extends CommonGenerator {

	override checkInput(List<EObject> objects) {
		var services = objects.findFirst(c | c instanceof ServiceSet)
		if (services!=null)
			return true
		var rules = objects.findFirst(c | c instanceof RuleSet)
		if (rules!=null)
			return true
		var properties = objects.findFirst(c | c instanceof PropertySet)
		if (properties!=null)
			return true
		return false
	}
}