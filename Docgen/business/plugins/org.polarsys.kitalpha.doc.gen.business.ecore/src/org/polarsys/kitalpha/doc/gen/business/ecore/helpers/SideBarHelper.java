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
package org.polarsys.kitalpha.doc.gen.business.ecore.helpers;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

public class SideBarHelper {

	public static boolean hasChildren(EObject parameter) {
		if (parameter instanceof EPackage) {
			return ((EPackage) parameter).getEClassifiers().size() > 0;
		} else if (parameter instanceof EClass) {
			return false;
		} else if (parameter instanceof EEnum) {
			return false;
		}
		return parameter.eContents().size() > 0;
	}
}
