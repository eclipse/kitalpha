/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VpstylecustomizationFactoryImpl extends EFactoryImpl implements VpstylecustomizationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VpstylecustomizationFactory init() {
		try {
			VpstylecustomizationFactory theVpstylecustomizationFactory = (VpstylecustomizationFactory)EPackage.Registry.INSTANCE.getEFactory(VpstylecustomizationPackage.eNS_URI);
			if (theVpstylecustomizationFactory != null) {
				return theVpstylecustomizationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VpstylecustomizationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpstylecustomizationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VpstylecustomizationPackage.CUSTOMIZATIONS: return createCustomizations();
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS: return createStyleCustomizationDescriptions();
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_REUSE: return createStyleCustomizationReuse();
			case VpstylecustomizationPackage.CUSTOMIZATION_EXPRESSION: return createCustomizationExpression();
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION: return createLabelCustomization();
			case VpstylecustomizationPackage.LABEL_ALIGNMENT_CUSTOMIZATION: return createLabelAlignmentCustomization();
			case VpstylecustomizationPackage.COLOR_CUSTOMIZATION: return createColorCustomization();
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION: return createEdgeStyleCustomization();
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION: return createContainerStyleCustomization();
			case VpstylecustomizationPackage.SHAPE_CONTAINER_STYLE_CUSTOMIZATION: return createShapeContainerStyleCustomization();
			case VpstylecustomizationPackage.FLAT_CONTAINER_STYLE_CUSTOMIZATION: return createFlatContainerStyleCustomization();
			case VpstylecustomizationPackage.CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION: return createContainerWorkspaceImageCustomization();
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION: return createNodeStyleCustomization();
			case VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION: return createEllipseCustomization();
			case VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION: return createLozengeCustomization();
			case VpstylecustomizationPackage.SQUARE_CUSTOMIZATION: return createSquareCustomization();
			case VpstylecustomizationPackage.BUNDLED_IMAGE_CUSTOMIZATION: return createBundledImageCustomization();
			case VpstylecustomizationPackage.DOT_CUSTOMIZATION: return createDotCustomization();
			case VpstylecustomizationPackage.GAUGE_CUSTOMIZATION: return createGaugeCustomization();
			case VpstylecustomizationPackage.NODE_WORKSPACE_IMAGE_CUSTOMIZATION: return createNodeWorkspaceImageCustomization();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VpstylecustomizationPackage.COLOR_USE_CASE:
				return createColorUseCaseFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VpstylecustomizationPackage.COLOR_USE_CASE:
				return convertColorUseCaseToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customizations createCustomizations() {
		CustomizationsImpl customizations = new CustomizationsImpl();
		return customizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleCustomizationDescriptions createStyleCustomizationDescriptions() {
		StyleCustomizationDescriptionsImpl styleCustomizationDescriptions = new StyleCustomizationDescriptionsImpl();
		return styleCustomizationDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelCustomization createLabelCustomization() {
		LabelCustomizationImpl labelCustomization = new LabelCustomizationImpl();
		return labelCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAlignmentCustomization createLabelAlignmentCustomization() {
		LabelAlignmentCustomizationImpl labelAlignmentCustomization = new LabelAlignmentCustomizationImpl();
		return labelAlignmentCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorCustomization createColorCustomization() {
		ColorCustomizationImpl colorCustomization = new ColorCustomizationImpl();
		return colorCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeStyleCustomization createEdgeStyleCustomization() {
		EdgeStyleCustomizationImpl edgeStyleCustomization = new EdgeStyleCustomizationImpl();
		return edgeStyleCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerStyleCustomization createContainerStyleCustomization() {
		ContainerStyleCustomizationImpl containerStyleCustomization = new ContainerStyleCustomizationImpl();
		return containerStyleCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeContainerStyleCustomization createShapeContainerStyleCustomization() {
		ShapeContainerStyleCustomizationImpl shapeContainerStyleCustomization = new ShapeContainerStyleCustomizationImpl();
		return shapeContainerStyleCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatContainerStyleCustomization createFlatContainerStyleCustomization() {
		FlatContainerStyleCustomizationImpl flatContainerStyleCustomization = new FlatContainerStyleCustomizationImpl();
		return flatContainerStyleCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerWorkspaceImageCustomization createContainerWorkspaceImageCustomization() {
		ContainerWorkspaceImageCustomizationImpl containerWorkspaceImageCustomization = new ContainerWorkspaceImageCustomizationImpl();
		return containerWorkspaceImageCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeStyleCustomization createNodeStyleCustomization() {
		NodeStyleCustomizationImpl nodeStyleCustomization = new NodeStyleCustomizationImpl();
		return nodeStyleCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipseCustomization createEllipseCustomization() {
		EllipseCustomizationImpl ellipseCustomization = new EllipseCustomizationImpl();
		return ellipseCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LozengeCustomization createLozengeCustomization() {
		LozengeCustomizationImpl lozengeCustomization = new LozengeCustomizationImpl();
		return lozengeCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SquareCustomization createSquareCustomization() {
		SquareCustomizationImpl squareCustomization = new SquareCustomizationImpl();
		return squareCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundledImageCustomization createBundledImageCustomization() {
		BundledImageCustomizationImpl bundledImageCustomization = new BundledImageCustomizationImpl();
		return bundledImageCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotCustomization createDotCustomization() {
		DotCustomizationImpl dotCustomization = new DotCustomizationImpl();
		return dotCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaugeCustomization createGaugeCustomization() {
		GaugeCustomizationImpl gaugeCustomization = new GaugeCustomizationImpl();
		return gaugeCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeWorkspaceImageCustomization createNodeWorkspaceImageCustomization() {
		NodeWorkspaceImageCustomizationImpl nodeWorkspaceImageCustomization = new NodeWorkspaceImageCustomizationImpl();
		return nodeWorkspaceImageCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleCustomizationReuse createStyleCustomizationReuse() {
		StyleCustomizationReuseImpl styleCustomizationReuse = new StyleCustomizationReuseImpl();
		return styleCustomizationReuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomizationExpression createCustomizationExpression() {
		CustomizationExpressionImpl customizationExpression = new CustomizationExpressionImpl();
		return customizationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorUseCase createColorUseCaseFromString(EDataType eDataType, String initialValue) {
		ColorUseCase result = ColorUseCase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorUseCaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpstylecustomizationPackage getVpstylecustomizationPackage() {
		return (VpstylecustomizationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VpstylecustomizationPackage getPackage() {
		return VpstylecustomizationPackage.eINSTANCE;
	}

} //VpstylecustomizationFactoryImpl
