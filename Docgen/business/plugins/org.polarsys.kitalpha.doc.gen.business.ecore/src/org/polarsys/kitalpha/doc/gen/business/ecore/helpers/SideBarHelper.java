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
