
// Generated on 26.10.2015 at 01:48:55 CET by Viewpoint DSL Generator V 0.1

package org.polarsys.kitalpha.vp.componentsample.design.service.customizations;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentPackage;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the Sirius JavaExtension '<em><b>[org.polarsys.kitalpha.vp.componentsample.design.service.customizations.InnerHardwareStyleStyleCustomization_Service]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated NOT
 */

public class InnerHardwareStyleStyleCustomization_Service {
	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param eObject : the current semantic object
	* @param view : the current View
	* @param container : the semantic container
	* @generated NOT
	*/
	public boolean switchInnerHardwareStyle(EObject eObject, DDiagramElement view, EObject container) {
		if (eObject instanceof HardwareComponent) {
			EObject hcContainer = eObject.eContainer();
			if (hcContainer instanceof ComponentPackage) {
				return false;
			}
			return (getHierarchyDepth(eObject) % 2) == 0;
		}
		return false;
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