/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
		if (feature != null) {
			if (eData.eGet(feature) != null) {
				return true;
			}
		}
		
		return false;
	}
}
