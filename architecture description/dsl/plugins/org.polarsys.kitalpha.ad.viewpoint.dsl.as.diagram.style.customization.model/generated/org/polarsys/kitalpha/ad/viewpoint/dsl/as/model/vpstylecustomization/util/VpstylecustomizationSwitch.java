/*******************************************************************************
 * Copyright (c) 2015, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage
 * @generated
 */
public class VpstylecustomizationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VpstylecustomizationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpstylecustomizationSwitch() {
		if (modelPackage == null) {
			modelPackage = VpstylecustomizationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VpstylecustomizationPackage.CUSTOMIZATIONS: {
				Customizations customizations = (Customizations)theEObject;
				T result = caseCustomizations(customizations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.ABSTRACT_CUSTOMIZATION: {
				AbstractCustomization abstractCustomization = (AbstractCustomization)theEObject;
				T result = caseAbstractCustomization(abstractCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS: {
				StyleCustomizationDescriptions styleCustomizationDescriptions = (StyleCustomizationDescriptions)theEObject;
				T result = caseStyleCustomizationDescriptions(styleCustomizationDescriptions);
				if (result == null) result = caseNamedElement(styleCustomizationDescriptions);
				if (result == null) result = caseViewpointElement(styleCustomizationDescriptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_REUSE: {
				StyleCustomizationReuse styleCustomizationReuse = (StyleCustomizationReuse)theEObject;
				T result = caseStyleCustomizationReuse(styleCustomizationReuse);
				if (result == null) result = caseNamedElement(styleCustomizationReuse);
				if (result == null) result = caseViewpointElement(styleCustomizationReuse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.CUSTOMIZATION_EXPRESSION: {
				CustomizationExpression customizationExpression = (CustomizationExpression)theEObject;
				T result = caseCustomizationExpression(customizationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION: {
				LabelCustomization labelCustomization = (LabelCustomization)theEObject;
				T result = caseLabelCustomization(labelCustomization);
				if (result == null) result = caseAbstractCustomization(labelCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.LABEL_ALIGNMENT_CUSTOMIZATION: {
				LabelAlignmentCustomization labelAlignmentCustomization = (LabelAlignmentCustomization)theEObject;
				T result = caseLabelAlignmentCustomization(labelAlignmentCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.COLOR_CUSTOMIZATION: {
				ColorCustomization colorCustomization = (ColorCustomization)theEObject;
				T result = caseColorCustomization(colorCustomization);
				if (result == null) result = caseAbstractCustomization(colorCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION: {
				EdgeStyleCustomization edgeStyleCustomization = (EdgeStyleCustomization)theEObject;
				T result = caseEdgeStyleCustomization(edgeStyleCustomization);
				if (result == null) result = caseAbstractCustomization(edgeStyleCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION: {
				AbstractNodeStyleCustomization abstractNodeStyleCustomization = (AbstractNodeStyleCustomization)theEObject;
				T result = caseAbstractNodeStyleCustomization(abstractNodeStyleCustomization);
				if (result == null) result = caseAbstractCustomization(abstractNodeStyleCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION: {
				ContainerStyleCustomization containerStyleCustomization = (ContainerStyleCustomization)theEObject;
				T result = caseContainerStyleCustomization(containerStyleCustomization);
				if (result == null) result = caseAbstractNodeStyleCustomization(containerStyleCustomization);
				if (result == null) result = caseAbstractCustomization(containerStyleCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION: {
				SpecificContainerStyleCustomization specificContainerStyleCustomization = (SpecificContainerStyleCustomization)theEObject;
				T result = caseSpecificContainerStyleCustomization(specificContainerStyleCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.SHAPE_CONTAINER_STYLE_CUSTOMIZATION: {
				ShapeContainerStyleCustomization shapeContainerStyleCustomization = (ShapeContainerStyleCustomization)theEObject;
				T result = caseShapeContainerStyleCustomization(shapeContainerStyleCustomization);
				if (result == null) result = caseSpecificContainerStyleCustomization(shapeContainerStyleCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.FLAT_CONTAINER_STYLE_CUSTOMIZATION: {
				FlatContainerStyleCustomization flatContainerStyleCustomization = (FlatContainerStyleCustomization)theEObject;
				T result = caseFlatContainerStyleCustomization(flatContainerStyleCustomization);
				if (result == null) result = caseSpecificContainerStyleCustomization(flatContainerStyleCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION: {
				ContainerWorkspaceImageCustomization containerWorkspaceImageCustomization = (ContainerWorkspaceImageCustomization)theEObject;
				T result = caseContainerWorkspaceImageCustomization(containerWorkspaceImageCustomization);
				if (result == null) result = caseSpecificContainerStyleCustomization(containerWorkspaceImageCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION: {
				NodeStyleCustomization nodeStyleCustomization = (NodeStyleCustomization)theEObject;
				T result = caseNodeStyleCustomization(nodeStyleCustomization);
				if (result == null) result = caseAbstractNodeStyleCustomization(nodeStyleCustomization);
				if (result == null) result = caseAbstractCustomization(nodeStyleCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.SPECIFIC_NODE_STYLE_CUSTOMIZATION: {
				SpecificNodeStyleCustomization specificNodeStyleCustomization = (SpecificNodeStyleCustomization)theEObject;
				T result = caseSpecificNodeStyleCustomization(specificNodeStyleCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION: {
				EllipseCustomization ellipseCustomization = (EllipseCustomization)theEObject;
				T result = caseEllipseCustomization(ellipseCustomization);
				if (result == null) result = caseSpecificNodeStyleCustomization(ellipseCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION: {
				LozengeCustomization lozengeCustomization = (LozengeCustomization)theEObject;
				T result = caseLozengeCustomization(lozengeCustomization);
				if (result == null) result = caseSpecificNodeStyleCustomization(lozengeCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.SQUARE_CUSTOMIZATION: {
				SquareCustomization squareCustomization = (SquareCustomization)theEObject;
				T result = caseSquareCustomization(squareCustomization);
				if (result == null) result = caseSpecificNodeStyleCustomization(squareCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.BUNDLED_IMAGE_CUSTOMIZATION: {
				BundledImageCustomization bundledImageCustomization = (BundledImageCustomization)theEObject;
				T result = caseBundledImageCustomization(bundledImageCustomization);
				if (result == null) result = caseSpecificNodeStyleCustomization(bundledImageCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.DOT_CUSTOMIZATION: {
				DotCustomization dotCustomization = (DotCustomization)theEObject;
				T result = caseDotCustomization(dotCustomization);
				if (result == null) result = caseSpecificNodeStyleCustomization(dotCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.GAUGE_CUSTOMIZATION: {
				GaugeCustomization gaugeCustomization = (GaugeCustomization)theEObject;
				T result = caseGaugeCustomization(gaugeCustomization);
				if (result == null) result = caseSpecificNodeStyleCustomization(gaugeCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpstylecustomizationPackage.NODE_WORKSPACE_IMAGE_CUSTOMIZATION: {
				NodeWorkspaceImageCustomization nodeWorkspaceImageCustomization = (NodeWorkspaceImageCustomization)theEObject;
				T result = caseNodeWorkspaceImageCustomization(nodeWorkspaceImageCustomization);
				if (result == null) result = caseSpecificNodeStyleCustomization(nodeWorkspaceImageCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customizations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customizations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomizations(Customizations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCustomization(AbstractCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Customization Descriptions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Customization Descriptions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleCustomizationDescriptions(StyleCustomizationDescriptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelCustomization(LabelCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Alignment Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Alignment Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelAlignmentCustomization(LabelAlignmentCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorCustomization(ColorCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeStyleCustomization(EdgeStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Node Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Node Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNodeStyleCustomization(AbstractNodeStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerStyleCustomization(ContainerStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Container Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Container Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificContainerStyleCustomization(SpecificContainerStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Container Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Container Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeContainerStyleCustomization(ShapeContainerStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flat Container Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flat Container Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlatContainerStyleCustomization(FlatContainerStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Workspace Image Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Workspace Image Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerWorkspaceImageCustomization(ContainerWorkspaceImageCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeStyleCustomization(NodeStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Node Style Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Node Style Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificNodeStyleCustomization(SpecificNodeStyleCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipse Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipse Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEllipseCustomization(EllipseCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lozenge Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lozenge Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLozengeCustomization(LozengeCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Square Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Square Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSquareCustomization(SquareCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundled Image Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundled Image Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundledImageCustomization(BundledImageCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dot Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dot Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDotCustomization(DotCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gauge Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gauge Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGaugeCustomization(GaugeCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Workspace Image Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Workspace Image Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeWorkspaceImageCustomization(NodeWorkspaceImageCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewpoint Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewpoint Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewpointElement(ViewpointElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Customization Reuse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Customization Reuse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleCustomizationReuse(StyleCustomizationReuse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customization Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customization Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomizationExpression(CustomizationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VpstylecustomizationSwitch
