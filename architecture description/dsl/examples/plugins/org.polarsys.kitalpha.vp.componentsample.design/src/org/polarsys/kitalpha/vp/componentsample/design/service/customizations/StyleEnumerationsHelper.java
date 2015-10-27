
// Generated on 26.10.2015 at 12:00:00 CET by Viewpoint DSL Generator V 0.1

package org.polarsys.kitalpha.vp.componentsample.design.service.customizations;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;

import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.diagram.description.DescriptionPackage;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the Sirius JavaExtension '<em><b>[org.polarsys.kitalpha.vp.componentsample.design.service.customizations.StyleEnumerationsHelper]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class StyleEnumerationsHelper {
	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param any : any model element
	* @generated
	*/
	public EEnumLiteral getLabelPositionNode(EObject any) {
		return DiagramPackage.eINSTANCE.getLabelPosition().getEEnumLiteral("node");
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param any : any model element
	* @generated
	*/
	public EEnumLiteral getLineStyleSolid(EObject any) {
		return DiagramPackage.eINSTANCE.getLineStyle().getEEnumLiteral("solid");
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param any : any model element
	* @generated
	*/
	public EEnumLiteral getEndCenteringBoth(EObject any) {
		return DescriptionPackage.eINSTANCE.getCenteringStyle().getEEnumLiteral("Both");
	}
}