/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.vp.componentsample.design.service;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentPackage;
// Generated on 22.09.2014 at 03:53:03 CEST by Viewpoint DSL Generator V 0.1

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the DoReMi JavaExtension '<em><b>[org.polarsys.kitalpha.vp.componentsample.design.service.ComponentSampleOpenJavaService]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class ComponentSampleOpenJavaService {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated NOT
	*/
	public ComponentSampleOpenJavaService() {
	}

	public int getRed(EObject eObject, EObject view) {
		return 255;
	}

	public int getGreen(EObject eObject, EObject view) {
		int depth = getHierarchyDepth(eObject);
		if ((depth % 2) == 0) {
			int green = (int) (214 + ((depth * 0.03f) * 255));
			return green == 255 ? 214 : green;
		}
		return 255;
	}

	public int getBlue(EObject eObject, EObject view) {
		int depth = getHierarchyDepth(eObject);
		if ((depth % 2) == 0) {
			int blue = (int) (75 + ((depth * 0.03f) * 255));
			return blue == 255 ? 75 : blue;
		}
		return 255;
	}

	private int getHierarchyDepth(EObject eObject) {
		int i = 0;

		EObject eContainer = eObject.eContainer();
		while (eContainer != null) {
			if (eContainer instanceof ComponentPackage)
				return i;
			i++;
			eContainer = eContainer.eContainer();
		}
		return 0;
	}
}