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
// Generated on 22.09.2014 at 03:53:03 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.kitalpha.vp.componentsample.design.service.tools;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the DoReMi JavaExtension '<em><b>[org.polarsys.kitalpha.vp.componentsample.design.service.tools.OpenActionService]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class OpenActionService {
	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param element : the element
	* @param newSemanticContainer : the element view
	* @generated NOT
	*/
	public boolean GoAction(EObject element, EObject newSemanticContainer) {
		return MyAction(element, newSemanticContainer);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param element : the element
	* @param newSemanticContainer : the element view
	* @generated NOT
	*/
	public boolean MyAction(EObject element, EObject newSemanticContainer) {
		ComponentElement componentElement = (ComponentElement) element;

		MessageDialog.openConfirm(Display.getDefault().getActiveShell(), "My Componentsample Action",
				"Action on the element: " + componentElement.getName());
		return true;
	}
}