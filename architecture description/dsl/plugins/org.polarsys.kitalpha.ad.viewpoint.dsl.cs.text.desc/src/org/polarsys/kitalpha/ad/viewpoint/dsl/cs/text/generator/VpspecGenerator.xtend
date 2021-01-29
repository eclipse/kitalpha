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

import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.model.vpdesc.Data
import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.model.vpconf.Configuration
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.CommonGenerator

class VpspecGenerator extends CommonGenerator {
	
	override checkInput(List<EObject> objects) {
		var configuration = objects.findFirst(c | c instanceof Configuration)
		if (configuration==null)
			return false
		var data = objects.findFirst(c | c instanceof Data)
		if (data==null)
			return false	
		return true
	}
}