/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator

import java.util.List
import org.eclipse.emf.ecore.EObject
import org.polarsys.kitalpha.ad.viewpoint.dsl.^as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.CommonGenerator

/**
 * @author Faycal Abka
 */

class ActivityexplorerGenerator extends CommonGenerator {
	override checkInput(List<EObject> objects) {
		var activityExplorer = objects.findFirst(c | c instanceof ViewpointActivityExplorer)
		if (activityExplorer==null)
			return false
			
		return true;
	}
	
}
