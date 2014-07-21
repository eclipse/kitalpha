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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author Boubekeur Zendagui
 */

public class MappingUtils {

	public static boolean isImport(Object data){
		EObject eData = ((EObject)data);
		EStructuralFeature feature = eData.eClass().getEStructuralFeature("imports");
		if (feature != null)
			if (eData.eGet(feature) != null)
				return true;
		
		return false;
	}
}
