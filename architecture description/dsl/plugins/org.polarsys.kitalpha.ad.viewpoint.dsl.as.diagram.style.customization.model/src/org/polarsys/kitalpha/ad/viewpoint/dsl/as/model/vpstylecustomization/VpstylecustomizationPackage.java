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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationFactory
 * @model kind="package"
 * @generated
 */
public interface VpstylecustomizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vpstylecustomization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpdiagram/vpstylecustomization/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vpstylecustomization";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VpstylecustomizationPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.CustomizationsImpl <em>Customizations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.CustomizationsImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getCustomizations()
	 * @generated
	 */
	int CUSTOMIZATIONS = 0;

	/**
	 * The feature id for the '<em><b>Owned Customization Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMIZATIONS__OWNED_CUSTOMIZATION_DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Owned Customization Reuse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMIZATIONS__OWNED_CUSTOMIZATION_REUSE = 1;

	/**
	 * The number of structural features of the '<em>Customizations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMIZATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Customizations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMIZATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.AbstractCustomizationImpl <em>Abstract Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.AbstractCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getAbstractCustomization()
	 * @generated
	 */
	int ABSTRACT_CUSTOMIZATION = 1;

	/**
	 * The feature id for the '<em><b>Applyon All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CUSTOMIZATION__APPLYON_ALL = 0;

	/**
	 * The number of structural features of the '<em>Abstract Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CUSTOMIZATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CUSTOMIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.StyleCustomizationDescriptionsImpl <em>Style Customization Descriptions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.StyleCustomizationDescriptionsImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getStyleCustomizationDescriptions()
	 * @generated
	 */
	int STYLE_CUSTOMIZATION_DESCRIPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CUSTOMIZATION_DESCRIPTIONS__ID = VpdescPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CUSTOMIZATION_DESCRIPTIONS__NAME = VpdescPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CUSTOMIZATION_DESCRIPTIONS__DESCRIPTION = VpdescPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned Customizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CUSTOMIZATION_DESCRIPTIONS__OWNED_CUSTOMIZATIONS = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precondtion Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CUSTOMIZATION_DESCRIPTIONS__PRECONDTION_EXPRESSION = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Style Customization Descriptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CUSTOMIZATION_DESCRIPTIONS_FEATURE_COUNT = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Style Customization Descriptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	int STYLE_CUSTOMIZATION_DESCRIPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelCustomizationImpl <em>Label Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getLabelCustomization()
	 * @generated
	 */
	int LABEL_CUSTOMIZATION = 5;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelAlignmentCustomizationImpl <em>Label Alignment Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelAlignmentCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getLabelAlignmentCustomization()
	 * @generated
	 */
	int LABEL_ALIGNMENT_CUSTOMIZATION = 6;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ColorCustomizationImpl <em>Color Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ColorCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getColorCustomization()
	 * @generated
	 */
	int COLOR_CUSTOMIZATION = 7;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl <em>Edge Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getEdgeStyleCustomization()
	 * @generated
	 */
	int EDGE_STYLE_CUSTOMIZATION = 8;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.AbstractNodeStyleCustomizationImpl <em>Abstract Node Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.AbstractNodeStyleCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getAbstractNodeStyleCustomization()
	 * @generated
	 */
	int ABSTRACT_NODE_STYLE_CUSTOMIZATION = 9;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ContainerStyleCustomizationImpl <em>Container Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ContainerStyleCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getContainerStyleCustomization()
	 * @generated
	 */
	int CONTAINER_STYLE_CUSTOMIZATION = 10;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.SpecificContainerStyleCustomizationImpl <em>Specific Container Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.SpecificContainerStyleCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getSpecificContainerStyleCustomization()
	 * @generated
	 */
	int SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION = 11;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ShapeContainerStyleCustomizationImpl <em>Shape Container Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ShapeContainerStyleCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getShapeContainerStyleCustomization()
	 * @generated
	 */
	int SHAPE_CONTAINER_STYLE_CUSTOMIZATION = 12;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.FlatContainerStyleCustomizationImpl <em>Flat Container Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.FlatContainerStyleCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getFlatContainerStyleCustomization()
	 * @generated
	 */
	int FLAT_CONTAINER_STYLE_CUSTOMIZATION = 13;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ContainerWorkspaceImageCustomizationImpl <em>Container Workspace Image Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ContainerWorkspaceImageCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getContainerWorkspaceImageCustomization()
	 * @generated
	 */
	int CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION = 14;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.NodeStyleCustomizationImpl <em>Node Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.NodeStyleCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getNodeStyleCustomization()
	 * @generated
	 */
	int NODE_STYLE_CUSTOMIZATION = 15;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.SpecificNodeStyleCustomizationImpl <em>Specific Node Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.SpecificNodeStyleCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getSpecificNodeStyleCustomization()
	 * @generated
	 */
	int SPECIFIC_NODE_STYLE_CUSTOMIZATION = 16;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EllipseCustomizationImpl <em>Ellipse Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EllipseCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getEllipseCustomization()
	 * @generated
	 */
	int ELLIPSE_CUSTOMIZATION = 17;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LozengeCustomizationImpl <em>Lozenge Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LozengeCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getLozengeCustomization()
	 * @generated
	 */
	int LOZENGE_CUSTOMIZATION = 18;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.SquareCustomizationImpl <em>Square Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.SquareCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getSquareCustomization()
	 * @generated
	 */
	int SQUARE_CUSTOMIZATION = 19;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.BundledImageCustomizationImpl <em>Bundled Image Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.BundledImageCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getBundledImageCustomization()
	 * @generated
	 */
	int BUNDLED_IMAGE_CUSTOMIZATION = 20;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.DotCustomizationImpl <em>Dot Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.DotCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getDotCustomization()
	 * @generated
	 */
	int DOT_CUSTOMIZATION = 21;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.GaugeCustomizationImpl <em>Gauge Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.GaugeCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getGaugeCustomization()
	 * @generated
	 */
	int GAUGE_CUSTOMIZATION = 22;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.NodeWorkspaceImageCustomizationImpl <em>Node Workspace Image Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.NodeWorkspaceImageCustomizationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getNodeWorkspaceImageCustomization()
	 * @generated
	 */
	int NODE_WORKSPACE_IMAGE_CUSTOMIZATION = 23;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.StyleCustomizationReuseImpl <em>Style Customization Reuse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.StyleCustomizationReuseImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getStyleCustomizationReuse()
	 * @generated
	 */
	int STYLE_CUSTOMIZATION_REUSE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CUSTOMIZATION_REUSE__ID = VpdescPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CUSTOMIZATION_REUSE__NAME = VpdescPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CUSTOMIZATION_REUSE__DESCRIPTION = VpdescPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Reused Customization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CUSTOMIZATION_REUSE__REUSED_CUSTOMIZATION = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CUSTOMIZATION_REUSE__APPLIED_ON = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Style Customization Reuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_CUSTOMIZATION_REUSE_FEATURE_COUNT = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Style Customization Reuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	int STYLE_CUSTOMIZATION_REUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.CustomizationExpressionImpl <em>Customization Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.CustomizationExpressionImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getCustomizationExpression()
	 * @generated
	 */
	int CUSTOMIZATION_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Owned Expression Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMIZATION_EXPRESSION__OWNED_EXPRESSION_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Customization Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMIZATION_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Customization Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMIZATION_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Applyon All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CUSTOMIZATION__APPLYON_ALL = ABSTRACT_CUSTOMIZATION__APPLYON_ALL;

	/**
	 * The feature id for the '<em><b>Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CUSTOMIZATION__COLOR = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Label Alignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CUSTOMIZATION__OWNED_LABEL_ALIGNMENT = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CUSTOMIZATION__APPLIED_ON = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CUSTOMIZATION__SIZE = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CUSTOMIZATION__FORMAT = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Show Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CUSTOMIZATION__SHOW_ICON = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CUSTOMIZATION__EXPRESSION = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CUSTOMIZATION__ICON_PATH = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Label Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CUSTOMIZATION_FEATURE_COUNT = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Label Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CUSTOMIZATION_OPERATION_COUNT = ABSTRACT_CUSTOMIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ALIGNMENT_CUSTOMIZATION__APPLIED_ON = 0;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ALIGNMENT_CUSTOMIZATION__ALIGNMENT = 1;

	/**
	 * The number of structural features of the '<em>Label Alignment Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ALIGNMENT_CUSTOMIZATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Label Alignment Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ALIGNMENT_CUSTOMIZATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Applyon All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_CUSTOMIZATION__APPLYON_ALL = ABSTRACT_CUSTOMIZATION__APPLYON_ALL;

	/**
	 * The feature id for the '<em><b>Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_CUSTOMIZATION__COLOR = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_CUSTOMIZATION__APPLIED_ON = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_CUSTOMIZATION__COLOR_USE_CASE = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Color Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_CUSTOMIZATION_FEATURE_COUNT = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Color Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_CUSTOMIZATION_OPERATION_COUNT = ABSTRACT_CUSTOMIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applyon All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_CUSTOMIZATION__APPLYON_ALL = ABSTRACT_CUSTOMIZATION__APPLYON_ALL;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_CUSTOMIZATION__APPLIED_ON = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Centered Source Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_CUSTOMIZATION__CENTERED_SOURCE_MAPPINGS = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Centered Target Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_CUSTOMIZATION__CENTERED_TARGET_MAPPINGS = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Begin Label Style Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_CUSTOMIZATION__BEGIN_LABEL_STYLE_DESCRIPTION = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Center Label Style Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_CUSTOMIZATION__CENTER_LABEL_STYLE_DESCRIPTION = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End Label Style Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_CUSTOMIZATION__END_LABEL_STYLE_DESCRIPTION = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_CUSTOMIZATION__LINE_STYLE = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source Arrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_CUSTOMIZATION__SOURCE_ARROW = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target Arrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_CUSTOMIZATION__TARGET_ARROW = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Size Computation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Routing Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_CUSTOMIZATION__ROUTING_STYLE = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Folding Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_CUSTOMIZATION__FOLDING_STYLE = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>End Centering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_CUSTOMIZATION__END_CENTERING = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Edge Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_CUSTOMIZATION_FEATURE_COUNT = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Edge Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_CUSTOMIZATION_OPERATION_COUNT = ABSTRACT_CUSTOMIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applyon All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_STYLE_CUSTOMIZATION__APPLYON_ALL = ABSTRACT_CUSTOMIZATION__APPLYON_ALL;

	/**
	 * The feature id for the '<em><b>Tooltip Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Border Size Computation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Node Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT = ABSTRACT_CUSTOMIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Node Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_STYLE_CUSTOMIZATION_OPERATION_COUNT = ABSTRACT_CUSTOMIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applyon All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_STYLE_CUSTOMIZATION__APPLYON_ALL = ABSTRACT_NODE_STYLE_CUSTOMIZATION__APPLYON_ALL;

	/**
	 * The feature id for the '<em><b>Tooltip Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION = ABSTRACT_NODE_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Border Size Computation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION = ABSTRACT_NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON = ABSTRACT_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Specific Container Style Customization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION = ABSTRACT_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arc With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_STYLE_CUSTOMIZATION__ARC_WITH = ABSTRACT_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arc Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_STYLE_CUSTOMIZATION__ARC_HEIGHT = ABSTRACT_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rounded Corner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_STYLE_CUSTOMIZATION__ROUNDED_CORNER = ABSTRACT_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Container Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_STYLE_CUSTOMIZATION_FEATURE_COUNT = ABSTRACT_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Container Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_STYLE_CUSTOMIZATION_OPERATION_COUNT = ABSTRACT_NODE_STYLE_CUSTOMIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON = 0;

	/**
	 * The number of structural features of the '<em>Specific Container Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Specific Container Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON = SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONTAINER_STYLE_CUSTOMIZATION__SHAPE = SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shape Container Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONTAINER_STYLE_CUSTOMIZATION_FEATURE_COUNT = SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shape Container Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONTAINER_STYLE_CUSTOMIZATION_OPERATION_COUNT = SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON = SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON;

	/**
	 * The feature id for the '<em><b>Background Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_CONTAINER_STYLE_CUSTOMIZATION__BACKGROUND_STYLE = SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flat Container Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_CONTAINER_STYLE_CUSTOMIZATION_FEATURE_COUNT = SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Flat Container Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_CONTAINER_STYLE_CUSTOMIZATION_OPERATION_COUNT = SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION__APPLIED_ON = SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON;

	/**
	 * The feature id for the '<em><b>Workspace Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION__WORKSPACE_PATH = SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Workspace Image Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION_FEATURE_COUNT = SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container Workspace Image Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION_OPERATION_COUNT = SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applyon All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE_CUSTOMIZATION__APPLYON_ALL = ABSTRACT_NODE_STYLE_CUSTOMIZATION__APPLYON_ALL;

	/**
	 * The feature id for the '<em><b>Tooltip Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION = ABSTRACT_NODE_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Border Size Computation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION = ABSTRACT_NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE_CUSTOMIZATION__APPLIED_ON = ABSTRACT_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Specific Node Style Customization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION = ABSTRACT_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size Computation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION = ABSTRACT_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE_CUSTOMIZATION__LABEL_POSITION = ABSTRACT_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hide Label By Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE_CUSTOMIZATION__HIDE_LABEL_BY_DEFAULT = ABSTRACT_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resize Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE_CUSTOMIZATION__RESIZE_KIND = ABSTRACT_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Node Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT = ABSTRACT_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Node Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE_CUSTOMIZATION_OPERATION_COUNT = ABSTRACT_NODE_STYLE_CUSTOMIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_NODE_STYLE_CUSTOMIZATION__APPLIED_ON = 0;

	/**
	 * The number of structural features of the '<em>Specific Node Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Specific Node Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_NODE_STYLE_CUSTOMIZATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_CUSTOMIZATION__APPLIED_ON = SPECIFIC_NODE_STYLE_CUSTOMIZATION__APPLIED_ON;

	/**
	 * The feature id for the '<em><b>Horizontal Diameter Computation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_CUSTOMIZATION__HORIZONTAL_DIAMETER_COMPUTATION_EXPRESSION = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vertical Diameter Computation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_CUSTOMIZATION__VERTICAL_DIAMETER_COMPUTATION_EXPRESSION = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ellipse Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_CUSTOMIZATION_FEATURE_COUNT = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ellipse Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_CUSTOMIZATION_OPERATION_COUNT = SPECIFIC_NODE_STYLE_CUSTOMIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOZENGE_CUSTOMIZATION__APPLIED_ON = SPECIFIC_NODE_STYLE_CUSTOMIZATION__APPLIED_ON;

	/**
	 * The feature id for the '<em><b>Width Computation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOZENGE_CUSTOMIZATION__WIDTH_COMPUTATION_EXPRESSION = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height Computation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOZENGE_CUSTOMIZATION__HEIGHT_COMPUTATION_EXPRESSION = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lozenge Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOZENGE_CUSTOMIZATION_FEATURE_COUNT = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lozenge Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOZENGE_CUSTOMIZATION_OPERATION_COUNT = SPECIFIC_NODE_STYLE_CUSTOMIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_CUSTOMIZATION__APPLIED_ON = SPECIFIC_NODE_STYLE_CUSTOMIZATION__APPLIED_ON;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_CUSTOMIZATION__WIDTH = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_CUSTOMIZATION__HEIGHT = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Square Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_CUSTOMIZATION_FEATURE_COUNT = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Square Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_CUSTOMIZATION_OPERATION_COUNT = SPECIFIC_NODE_STYLE_CUSTOMIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLED_IMAGE_CUSTOMIZATION__APPLIED_ON = SPECIFIC_NODE_STYLE_CUSTOMIZATION__APPLIED_ON;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLED_IMAGE_CUSTOMIZATION__SHAPE = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bundled Image Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLED_IMAGE_CUSTOMIZATION_FEATURE_COUNT = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bundled Image Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLED_IMAGE_CUSTOMIZATION_OPERATION_COUNT = SPECIFIC_NODE_STYLE_CUSTOMIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_CUSTOMIZATION__APPLIED_ON = SPECIFIC_NODE_STYLE_CUSTOMIZATION__APPLIED_ON;

	/**
	 * The feature id for the '<em><b>Stroke Size Computation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_CUSTOMIZATION__STROKE_SIZE_COMPUTATION_EXPRESSION = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dot Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_CUSTOMIZATION_FEATURE_COUNT = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dot Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_CUSTOMIZATION_OPERATION_COUNT = SPECIFIC_NODE_STYLE_CUSTOMIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE_CUSTOMIZATION__APPLIED_ON = SPECIFIC_NODE_STYLE_CUSTOMIZATION__APPLIED_ON;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE_CUSTOMIZATION__SECTIONS = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alignement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE_CUSTOMIZATION__ALIGNEMENT = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gauge Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE_CUSTOMIZATION_FEATURE_COUNT = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gauge Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE_CUSTOMIZATION_OPERATION_COUNT = SPECIFIC_NODE_STYLE_CUSTOMIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applied On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_WORKSPACE_IMAGE_CUSTOMIZATION__APPLIED_ON = SPECIFIC_NODE_STYLE_CUSTOMIZATION__APPLIED_ON;

	/**
	 * The feature id for the '<em><b>Workspace Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_WORKSPACE_IMAGE_CUSTOMIZATION__WORKSPACE_PATH = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Workspace Image Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_WORKSPACE_IMAGE_CUSTOMIZATION_FEATURE_COUNT = SPECIFIC_NODE_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node Workspace Image Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_WORKSPACE_IMAGE_CUSTOMIZATION_OPERATION_COUNT = SPECIFIC_NODE_STYLE_CUSTOMIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorUseCase <em>Color Use Case</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorUseCase
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getColorUseCase()
	 * @generated
	 */
	int COLOR_USE_CASE = 24;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.Customizations <em>Customizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customizations</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.Customizations
	 * @generated
	 */
	EClass getCustomizations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.Customizations#getOwnedCustomizationDescriptions <em>Owned Customization Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Customization Descriptions</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.Customizations#getOwnedCustomizationDescriptions()
	 * @see #getCustomizations()
	 * @generated
	 */
	EReference getCustomizations_OwnedCustomizationDescriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.Customizations#getOwnedCustomizationReuse <em>Owned Customization Reuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Customization Reuse</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.Customizations#getOwnedCustomizationReuse()
	 * @see #getCustomizations()
	 * @generated
	 */
	EReference getCustomizations_OwnedCustomizationReuse();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractCustomization <em>Abstract Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractCustomization
	 * @generated
	 */
	EClass getAbstractCustomization();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractCustomization#isApplyonAll <em>Applyon All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applyon All</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractCustomization#isApplyonAll()
	 * @see #getAbstractCustomization()
	 * @generated
	 */
	EAttribute getAbstractCustomization_ApplyonAll();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions <em>Style Customization Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Customization Descriptions</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions
	 * @generated
	 */
	EClass getStyleCustomizationDescriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions#getOwnedCustomizations <em>Owned Customizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Customizations</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions#getOwnedCustomizations()
	 * @see #getStyleCustomizationDescriptions()
	 * @generated
	 */
	EReference getStyleCustomizationDescriptions_OwnedCustomizations();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions#getPrecondtionExpression <em>Precondtion Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondtion Expression</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions#getPrecondtionExpression()
	 * @see #getStyleCustomizationDescriptions()
	 * @generated
	 */
	EReference getStyleCustomizationDescriptions_PrecondtionExpression();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization <em>Label Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization
	 * @generated
	 */
	EClass getLabelCustomization();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Color</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getColor()
	 * @see #getLabelCustomization()
	 * @generated
	 */
	EReference getLabelCustomization_Color();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getOwnedLabelAlignment <em>Owned Label Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Label Alignment</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getOwnedLabelAlignment()
	 * @see #getLabelCustomization()
	 * @generated
	 */
	EReference getLabelCustomization_OwnedLabelAlignment();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getAppliedOn <em>Applied On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied On</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getAppliedOn()
	 * @see #getLabelCustomization()
	 * @generated
	 */
	EReference getLabelCustomization_AppliedOn();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getSize()
	 * @see #getLabelCustomization()
	 * @generated
	 */
	EAttribute getLabelCustomization_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getFormat()
	 * @see #getLabelCustomization()
	 * @generated
	 */
	EAttribute getLabelCustomization_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#isShowIcon <em>Show Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Icon</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#isShowIcon()
	 * @see #getLabelCustomization()
	 * @generated
	 */
	EAttribute getLabelCustomization_ShowIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getExpression()
	 * @see #getLabelCustomization()
	 * @generated
	 */
	EReference getLabelCustomization_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getIconPath <em>Icon Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Path</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getIconPath()
	 * @see #getLabelCustomization()
	 * @generated
	 */
	EAttribute getLabelCustomization_IconPath();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelAlignmentCustomization <em>Label Alignment Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Alignment Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelAlignmentCustomization
	 * @generated
	 */
	EClass getLabelAlignmentCustomization();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelAlignmentCustomization#getAppliedOn <em>Applied On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied On</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelAlignmentCustomization#getAppliedOn()
	 * @see #getLabelAlignmentCustomization()
	 * @generated
	 */
	EReference getLabelAlignmentCustomization_AppliedOn();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelAlignmentCustomization#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelAlignmentCustomization#getAlignment()
	 * @see #getLabelAlignmentCustomization()
	 * @generated
	 */
	EAttribute getLabelAlignmentCustomization_Alignment();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization <em>Color Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization
	 * @generated
	 */
	EClass getColorCustomization();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Color</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization#getColor()
	 * @see #getColorCustomization()
	 * @generated
	 */
	EReference getColorCustomization_Color();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization#getAppliedOn <em>Applied On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied On</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization#getAppliedOn()
	 * @see #getColorCustomization()
	 * @generated
	 */
	EReference getColorCustomization_AppliedOn();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization#getColorUseCase <em>Color Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Use Case</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization#getColorUseCase()
	 * @see #getColorCustomization()
	 * @generated
	 */
	EAttribute getColorCustomization_ColorUseCase();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization <em>Edge Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Style Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization
	 * @generated
	 */
	EClass getEdgeStyleCustomization();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getAppliedOn <em>Applied On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied On</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getAppliedOn()
	 * @see #getEdgeStyleCustomization()
	 * @generated
	 */
	EReference getEdgeStyleCustomization_AppliedOn();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getCenteredSourceMappings <em>Centered Source Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Centered Source Mappings</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getCenteredSourceMappings()
	 * @see #getEdgeStyleCustomization()
	 * @generated
	 */
	EReference getEdgeStyleCustomization_CenteredSourceMappings();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getCenteredTargetMappings <em>Centered Target Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Centered Target Mappings</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getCenteredTargetMappings()
	 * @see #getEdgeStyleCustomization()
	 * @generated
	 */
	EReference getEdgeStyleCustomization_CenteredTargetMappings();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getBeginLabelStyleDescription <em>Begin Label Style Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Begin Label Style Description</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getBeginLabelStyleDescription()
	 * @see #getEdgeStyleCustomization()
	 * @generated
	 */
	EReference getEdgeStyleCustomization_BeginLabelStyleDescription();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getCenterLabelStyleDescription <em>Center Label Style Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Center Label Style Description</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getCenterLabelStyleDescription()
	 * @see #getEdgeStyleCustomization()
	 * @generated
	 */
	EReference getEdgeStyleCustomization_CenterLabelStyleDescription();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getEndLabelStyleDescription <em>End Label Style Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Label Style Description</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getEndLabelStyleDescription()
	 * @see #getEdgeStyleCustomization()
	 * @generated
	 */
	EReference getEdgeStyleCustomization_EndLabelStyleDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getLineStyle()
	 * @see #getEdgeStyleCustomization()
	 * @generated
	 */
	EAttribute getEdgeStyleCustomization_LineStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getSourceArrow <em>Source Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Arrow</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getSourceArrow()
	 * @see #getEdgeStyleCustomization()
	 * @generated
	 */
	EAttribute getEdgeStyleCustomization_SourceArrow();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getTargetArrow <em>Target Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Arrow</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getTargetArrow()
	 * @see #getEdgeStyleCustomization()
	 * @generated
	 */
	EAttribute getEdgeStyleCustomization_TargetArrow();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getSizeComputationExpression <em>Size Computation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size Computation Expression</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getSizeComputationExpression()
	 * @see #getEdgeStyleCustomization()
	 * @generated
	 */
	EReference getEdgeStyleCustomization_SizeComputationExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getRoutingStyle <em>Routing Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getRoutingStyle()
	 * @see #getEdgeStyleCustomization()
	 * @generated
	 */
	EAttribute getEdgeStyleCustomization_RoutingStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getFoldingStyle <em>Folding Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folding Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getFoldingStyle()
	 * @see #getEdgeStyleCustomization()
	 * @generated
	 */
	EAttribute getEdgeStyleCustomization_FoldingStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getEndCentering <em>End Centering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Centering</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization#getEndCentering()
	 * @see #getEdgeStyleCustomization()
	 * @generated
	 */
	EAttribute getEdgeStyleCustomization_EndCentering();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractNodeStyleCustomization <em>Abstract Node Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node Style Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractNodeStyleCustomization
	 * @generated
	 */
	EClass getAbstractNodeStyleCustomization();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractNodeStyleCustomization#getTooltipExpression <em>Tooltip Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tooltip Expression</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractNodeStyleCustomization#getTooltipExpression()
	 * @see #getAbstractNodeStyleCustomization()
	 * @generated
	 */
	EReference getAbstractNodeStyleCustomization_TooltipExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractNodeStyleCustomization#getBorderSizeComputationExpression <em>Border Size Computation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Border Size Computation Expression</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractNodeStyleCustomization#getBorderSizeComputationExpression()
	 * @see #getAbstractNodeStyleCustomization()
	 * @generated
	 */
	EReference getAbstractNodeStyleCustomization_BorderSizeComputationExpression();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization <em>Container Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Style Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization
	 * @generated
	 */
	EClass getContainerStyleCustomization();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#getAppliedOn <em>Applied On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied On</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#getAppliedOn()
	 * @see #getContainerStyleCustomization()
	 * @generated
	 */
	EReference getContainerStyleCustomization_AppliedOn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#getOwnedSpecificContainerStyleCustomization <em>Owned Specific Container Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Specific Container Style Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#getOwnedSpecificContainerStyleCustomization()
	 * @see #getContainerStyleCustomization()
	 * @generated
	 */
	EReference getContainerStyleCustomization_OwnedSpecificContainerStyleCustomization();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#getArcWith <em>Arc With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arc With</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#getArcWith()
	 * @see #getContainerStyleCustomization()
	 * @generated
	 */
	EAttribute getContainerStyleCustomization_ArcWith();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#getArcHeight <em>Arc Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arc Height</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#getArcHeight()
	 * @see #getContainerStyleCustomization()
	 * @generated
	 */
	EAttribute getContainerStyleCustomization_ArcHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#isRoundedCorner <em>Rounded Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounded Corner</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#isRoundedCorner()
	 * @see #getContainerStyleCustomization()
	 * @generated
	 */
	EAttribute getContainerStyleCustomization_RoundedCorner();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificContainerStyleCustomization <em>Specific Container Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Container Style Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificContainerStyleCustomization
	 * @generated
	 */
	EClass getSpecificContainerStyleCustomization();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificContainerStyleCustomization#getAppliedOn <em>Applied On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied On</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificContainerStyleCustomization#getAppliedOn()
	 * @see #getSpecificContainerStyleCustomization()
	 * @generated
	 */
	EReference getSpecificContainerStyleCustomization_AppliedOn();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ShapeContainerStyleCustomization <em>Shape Container Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Container Style Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ShapeContainerStyleCustomization
	 * @generated
	 */
	EClass getShapeContainerStyleCustomization();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ShapeContainerStyleCustomization#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ShapeContainerStyleCustomization#getShape()
	 * @see #getShapeContainerStyleCustomization()
	 * @generated
	 */
	EAttribute getShapeContainerStyleCustomization_Shape();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.FlatContainerStyleCustomization <em>Flat Container Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flat Container Style Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.FlatContainerStyleCustomization
	 * @generated
	 */
	EClass getFlatContainerStyleCustomization();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.FlatContainerStyleCustomization#getBackgroundStyle <em>Background Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.FlatContainerStyleCustomization#getBackgroundStyle()
	 * @see #getFlatContainerStyleCustomization()
	 * @generated
	 */
	EAttribute getFlatContainerStyleCustomization_BackgroundStyle();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerWorkspaceImageCustomization <em>Container Workspace Image Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Workspace Image Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerWorkspaceImageCustomization
	 * @generated
	 */
	EClass getContainerWorkspaceImageCustomization();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerWorkspaceImageCustomization#getWorkspacePath <em>Workspace Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workspace Path</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerWorkspaceImageCustomization#getWorkspacePath()
	 * @see #getContainerWorkspaceImageCustomization()
	 * @generated
	 */
	EAttribute getContainerWorkspaceImageCustomization_WorkspacePath();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization <em>Node Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Style Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization
	 * @generated
	 */
	EClass getNodeStyleCustomization();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getAppliedOn <em>Applied On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied On</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getAppliedOn()
	 * @see #getNodeStyleCustomization()
	 * @generated
	 */
	EReference getNodeStyleCustomization_AppliedOn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getOwnedSpecificNodeStyleCustomization <em>Owned Specific Node Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Specific Node Style Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getOwnedSpecificNodeStyleCustomization()
	 * @see #getNodeStyleCustomization()
	 * @generated
	 */
	EReference getNodeStyleCustomization_OwnedSpecificNodeStyleCustomization();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getSizeComputationExpression <em>Size Computation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size Computation Expression</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getSizeComputationExpression()
	 * @see #getNodeStyleCustomization()
	 * @generated
	 */
	EReference getNodeStyleCustomization_SizeComputationExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getLabelPosition <em>Label Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Position</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getLabelPosition()
	 * @see #getNodeStyleCustomization()
	 * @generated
	 */
	EAttribute getNodeStyleCustomization_LabelPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#isHideLabelByDefault <em>Hide Label By Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Label By Default</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#isHideLabelByDefault()
	 * @see #getNodeStyleCustomization()
	 * @generated
	 */
	EAttribute getNodeStyleCustomization_HideLabelByDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getResizeKind <em>Resize Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resize Kind</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getResizeKind()
	 * @see #getNodeStyleCustomization()
	 * @generated
	 */
	EAttribute getNodeStyleCustomization_ResizeKind();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificNodeStyleCustomization <em>Specific Node Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Node Style Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificNodeStyleCustomization
	 * @generated
	 */
	EClass getSpecificNodeStyleCustomization();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificNodeStyleCustomization#getAppliedOn <em>Applied On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied On</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificNodeStyleCustomization#getAppliedOn()
	 * @see #getSpecificNodeStyleCustomization()
	 * @generated
	 */
	EReference getSpecificNodeStyleCustomization_AppliedOn();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization <em>Ellipse Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization
	 * @generated
	 */
	EClass getEllipseCustomization();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization#getHorizontalDiameterComputationExpression <em>Horizontal Diameter Computation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Horizontal Diameter Computation Expression</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization#getHorizontalDiameterComputationExpression()
	 * @see #getEllipseCustomization()
	 * @generated
	 */
	EReference getEllipseCustomization_HorizontalDiameterComputationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization#getVerticalDiameterComputationExpression <em>Vertical Diameter Computation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vertical Diameter Computation Expression</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization#getVerticalDiameterComputationExpression()
	 * @see #getEllipseCustomization()
	 * @generated
	 */
	EReference getEllipseCustomization_VerticalDiameterComputationExpression();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LozengeCustomization <em>Lozenge Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lozenge Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LozengeCustomization
	 * @generated
	 */
	EClass getLozengeCustomization();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LozengeCustomization#getWidthComputationExpression <em>Width Computation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Width Computation Expression</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LozengeCustomization#getWidthComputationExpression()
	 * @see #getLozengeCustomization()
	 * @generated
	 */
	EReference getLozengeCustomization_WidthComputationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LozengeCustomization#getHeightComputationExpression <em>Height Computation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Height Computation Expression</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LozengeCustomization#getHeightComputationExpression()
	 * @see #getLozengeCustomization()
	 * @generated
	 */
	EReference getLozengeCustomization_HeightComputationExpression();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SquareCustomization <em>Square Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SquareCustomization
	 * @generated
	 */
	EClass getSquareCustomization();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SquareCustomization#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SquareCustomization#getWidth()
	 * @see #getSquareCustomization()
	 * @generated
	 */
	EAttribute getSquareCustomization_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SquareCustomization#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SquareCustomization#getHeight()
	 * @see #getSquareCustomization()
	 * @generated
	 */
	EAttribute getSquareCustomization_Height();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.BundledImageCustomization <em>Bundled Image Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundled Image Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.BundledImageCustomization
	 * @generated
	 */
	EClass getBundledImageCustomization();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.BundledImageCustomization#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.BundledImageCustomization#getShape()
	 * @see #getBundledImageCustomization()
	 * @generated
	 */
	EAttribute getBundledImageCustomization_Shape();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.DotCustomization <em>Dot Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dot Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.DotCustomization
	 * @generated
	 */
	EClass getDotCustomization();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.DotCustomization#getStrokeSizeComputationExpression <em>Stroke Size Computation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stroke Size Computation Expression</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.DotCustomization#getStrokeSizeComputationExpression()
	 * @see #getDotCustomization()
	 * @generated
	 */
	EReference getDotCustomization_StrokeSizeComputationExpression();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization <em>Gauge Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gauge Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization
	 * @generated
	 */
	EClass getGaugeCustomization();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sections</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization#getSections()
	 * @see #getGaugeCustomization()
	 * @generated
	 */
	EReference getGaugeCustomization_Sections();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization#getAlignement <em>Alignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignement</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization#getAlignement()
	 * @see #getGaugeCustomization()
	 * @generated
	 */
	EAttribute getGaugeCustomization_Alignement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeWorkspaceImageCustomization <em>Node Workspace Image Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Workspace Image Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeWorkspaceImageCustomization
	 * @generated
	 */
	EClass getNodeWorkspaceImageCustomization();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeWorkspaceImageCustomization#getWorkspacePath <em>Workspace Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workspace Path</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeWorkspaceImageCustomization#getWorkspacePath()
	 * @see #getNodeWorkspaceImageCustomization()
	 * @generated
	 */
	EAttribute getNodeWorkspaceImageCustomization_WorkspacePath();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse <em>Style Customization Reuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Customization Reuse</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse
	 * @generated
	 */
	EClass getStyleCustomizationReuse();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse#getReusedCustomization <em>Reused Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reused Customization</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse#getReusedCustomization()
	 * @see #getStyleCustomizationReuse()
	 * @generated
	 */
	EReference getStyleCustomizationReuse_ReusedCustomization();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse#getAppliedOn <em>Applied On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied On</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse#getAppliedOn()
	 * @see #getStyleCustomizationReuse()
	 * @generated
	 */
	EReference getStyleCustomizationReuse_AppliedOn();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.CustomizationExpression <em>Customization Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customization Expression</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.CustomizationExpression
	 * @generated
	 */
	EClass getCustomizationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.CustomizationExpression#getOwnedExpressionElement <em>Owned Expression Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Expression Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.CustomizationExpression#getOwnedExpressionElement()
	 * @see #getCustomizationExpression()
	 * @generated
	 */
	EReference getCustomizationExpression_OwnedExpressionElement();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorUseCase <em>Color Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Use Case</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorUseCase
	 * @generated
	 */
	EEnum getColorUseCase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VpstylecustomizationFactory getVpstylecustomizationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.CustomizationsImpl <em>Customizations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.CustomizationsImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getCustomizations()
		 * @generated
		 */
		EClass CUSTOMIZATIONS = eINSTANCE.getCustomizations();

		/**
		 * The meta object literal for the '<em><b>Owned Customization Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMIZATIONS__OWNED_CUSTOMIZATION_DESCRIPTIONS = eINSTANCE.getCustomizations_OwnedCustomizationDescriptions();

		/**
		 * The meta object literal for the '<em><b>Owned Customization Reuse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMIZATIONS__OWNED_CUSTOMIZATION_REUSE = eINSTANCE.getCustomizations_OwnedCustomizationReuse();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.AbstractCustomizationImpl <em>Abstract Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.AbstractCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getAbstractCustomization()
		 * @generated
		 */
		EClass ABSTRACT_CUSTOMIZATION = eINSTANCE.getAbstractCustomization();

		/**
		 * The meta object literal for the '<em><b>Applyon All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CUSTOMIZATION__APPLYON_ALL = eINSTANCE.getAbstractCustomization_ApplyonAll();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.StyleCustomizationDescriptionsImpl <em>Style Customization Descriptions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.StyleCustomizationDescriptionsImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getStyleCustomizationDescriptions()
		 * @generated
		 */
		EClass STYLE_CUSTOMIZATION_DESCRIPTIONS = eINSTANCE.getStyleCustomizationDescriptions();

		/**
		 * The meta object literal for the '<em><b>Owned Customizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_CUSTOMIZATION_DESCRIPTIONS__OWNED_CUSTOMIZATIONS = eINSTANCE.getStyleCustomizationDescriptions_OwnedCustomizations();

		/**
		 * The meta object literal for the '<em><b>Precondtion Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_CUSTOMIZATION_DESCRIPTIONS__PRECONDTION_EXPRESSION = eINSTANCE.getStyleCustomizationDescriptions_PrecondtionExpression();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelCustomizationImpl <em>Label Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getLabelCustomization()
		 * @generated
		 */
		EClass LABEL_CUSTOMIZATION = eINSTANCE.getLabelCustomization();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_CUSTOMIZATION__COLOR = eINSTANCE.getLabelCustomization_Color();

		/**
		 * The meta object literal for the '<em><b>Owned Label Alignment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_CUSTOMIZATION__OWNED_LABEL_ALIGNMENT = eINSTANCE.getLabelCustomization_OwnedLabelAlignment();

		/**
		 * The meta object literal for the '<em><b>Applied On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_CUSTOMIZATION__APPLIED_ON = eINSTANCE.getLabelCustomization_AppliedOn();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_CUSTOMIZATION__SIZE = eINSTANCE.getLabelCustomization_Size();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_CUSTOMIZATION__FORMAT = eINSTANCE.getLabelCustomization_Format();

		/**
		 * The meta object literal for the '<em><b>Show Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_CUSTOMIZATION__SHOW_ICON = eINSTANCE.getLabelCustomization_ShowIcon();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_CUSTOMIZATION__EXPRESSION = eINSTANCE.getLabelCustomization_Expression();

		/**
		 * The meta object literal for the '<em><b>Icon Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_CUSTOMIZATION__ICON_PATH = eINSTANCE.getLabelCustomization_IconPath();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelAlignmentCustomizationImpl <em>Label Alignment Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelAlignmentCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getLabelAlignmentCustomization()
		 * @generated
		 */
		EClass LABEL_ALIGNMENT_CUSTOMIZATION = eINSTANCE.getLabelAlignmentCustomization();

		/**
		 * The meta object literal for the '<em><b>Applied On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_ALIGNMENT_CUSTOMIZATION__APPLIED_ON = eINSTANCE.getLabelAlignmentCustomization_AppliedOn();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_ALIGNMENT_CUSTOMIZATION__ALIGNMENT = eINSTANCE.getLabelAlignmentCustomization_Alignment();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ColorCustomizationImpl <em>Color Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ColorCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getColorCustomization()
		 * @generated
		 */
		EClass COLOR_CUSTOMIZATION = eINSTANCE.getColorCustomization();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR_CUSTOMIZATION__COLOR = eINSTANCE.getColorCustomization_Color();

		/**
		 * The meta object literal for the '<em><b>Applied On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR_CUSTOMIZATION__APPLIED_ON = eINSTANCE.getColorCustomization_AppliedOn();

		/**
		 * The meta object literal for the '<em><b>Color Use Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_CUSTOMIZATION__COLOR_USE_CASE = eINSTANCE.getColorCustomization_ColorUseCase();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl <em>Edge Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EdgeStyleCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getEdgeStyleCustomization()
		 * @generated
		 */
		EClass EDGE_STYLE_CUSTOMIZATION = eINSTANCE.getEdgeStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Applied On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_STYLE_CUSTOMIZATION__APPLIED_ON = eINSTANCE.getEdgeStyleCustomization_AppliedOn();

		/**
		 * The meta object literal for the '<em><b>Centered Source Mappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_STYLE_CUSTOMIZATION__CENTERED_SOURCE_MAPPINGS = eINSTANCE.getEdgeStyleCustomization_CenteredSourceMappings();

		/**
		 * The meta object literal for the '<em><b>Centered Target Mappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_STYLE_CUSTOMIZATION__CENTERED_TARGET_MAPPINGS = eINSTANCE.getEdgeStyleCustomization_CenteredTargetMappings();

		/**
		 * The meta object literal for the '<em><b>Begin Label Style Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_STYLE_CUSTOMIZATION__BEGIN_LABEL_STYLE_DESCRIPTION = eINSTANCE.getEdgeStyleCustomization_BeginLabelStyleDescription();

		/**
		 * The meta object literal for the '<em><b>Center Label Style Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_STYLE_CUSTOMIZATION__CENTER_LABEL_STYLE_DESCRIPTION = eINSTANCE.getEdgeStyleCustomization_CenterLabelStyleDescription();

		/**
		 * The meta object literal for the '<em><b>End Label Style Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_STYLE_CUSTOMIZATION__END_LABEL_STYLE_DESCRIPTION = eINSTANCE.getEdgeStyleCustomization_EndLabelStyleDescription();

		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE_CUSTOMIZATION__LINE_STYLE = eINSTANCE.getEdgeStyleCustomization_LineStyle();

		/**
		 * The meta object literal for the '<em><b>Source Arrow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE_CUSTOMIZATION__SOURCE_ARROW = eINSTANCE.getEdgeStyleCustomization_SourceArrow();

		/**
		 * The meta object literal for the '<em><b>Target Arrow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE_CUSTOMIZATION__TARGET_ARROW = eINSTANCE.getEdgeStyleCustomization_TargetArrow();

		/**
		 * The meta object literal for the '<em><b>Size Computation Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION = eINSTANCE.getEdgeStyleCustomization_SizeComputationExpression();

		/**
		 * The meta object literal for the '<em><b>Routing Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE_CUSTOMIZATION__ROUTING_STYLE = eINSTANCE.getEdgeStyleCustomization_RoutingStyle();

		/**
		 * The meta object literal for the '<em><b>Folding Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE_CUSTOMIZATION__FOLDING_STYLE = eINSTANCE.getEdgeStyleCustomization_FoldingStyle();

		/**
		 * The meta object literal for the '<em><b>End Centering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE_CUSTOMIZATION__END_CENTERING = eINSTANCE.getEdgeStyleCustomization_EndCentering();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.AbstractNodeStyleCustomizationImpl <em>Abstract Node Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.AbstractNodeStyleCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getAbstractNodeStyleCustomization()
		 * @generated
		 */
		EClass ABSTRACT_NODE_STYLE_CUSTOMIZATION = eINSTANCE.getAbstractNodeStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Tooltip Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION = eINSTANCE.getAbstractNodeStyleCustomization_TooltipExpression();

		/**
		 * The meta object literal for the '<em><b>Border Size Computation Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION = eINSTANCE.getAbstractNodeStyleCustomization_BorderSizeComputationExpression();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ContainerStyleCustomizationImpl <em>Container Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ContainerStyleCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getContainerStyleCustomization()
		 * @generated
		 */
		EClass CONTAINER_STYLE_CUSTOMIZATION = eINSTANCE.getContainerStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Applied On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON = eINSTANCE.getContainerStyleCustomization_AppliedOn();

		/**
		 * The meta object literal for the '<em><b>Owned Specific Container Style Customization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION = eINSTANCE.getContainerStyleCustomization_OwnedSpecificContainerStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Arc With</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_STYLE_CUSTOMIZATION__ARC_WITH = eINSTANCE.getContainerStyleCustomization_ArcWith();

		/**
		 * The meta object literal for the '<em><b>Arc Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_STYLE_CUSTOMIZATION__ARC_HEIGHT = eINSTANCE.getContainerStyleCustomization_ArcHeight();

		/**
		 * The meta object literal for the '<em><b>Rounded Corner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_STYLE_CUSTOMIZATION__ROUNDED_CORNER = eINSTANCE.getContainerStyleCustomization_RoundedCorner();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.SpecificContainerStyleCustomizationImpl <em>Specific Container Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.SpecificContainerStyleCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getSpecificContainerStyleCustomization()
		 * @generated
		 */
		EClass SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION = eINSTANCE.getSpecificContainerStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Applied On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON = eINSTANCE.getSpecificContainerStyleCustomization_AppliedOn();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ShapeContainerStyleCustomizationImpl <em>Shape Container Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ShapeContainerStyleCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getShapeContainerStyleCustomization()
		 * @generated
		 */
		EClass SHAPE_CONTAINER_STYLE_CUSTOMIZATION = eINSTANCE.getShapeContainerStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_CONTAINER_STYLE_CUSTOMIZATION__SHAPE = eINSTANCE.getShapeContainerStyleCustomization_Shape();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.FlatContainerStyleCustomizationImpl <em>Flat Container Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.FlatContainerStyleCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getFlatContainerStyleCustomization()
		 * @generated
		 */
		EClass FLAT_CONTAINER_STYLE_CUSTOMIZATION = eINSTANCE.getFlatContainerStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Background Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_CONTAINER_STYLE_CUSTOMIZATION__BACKGROUND_STYLE = eINSTANCE.getFlatContainerStyleCustomization_BackgroundStyle();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ContainerWorkspaceImageCustomizationImpl <em>Container Workspace Image Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ContainerWorkspaceImageCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getContainerWorkspaceImageCustomization()
		 * @generated
		 */
		EClass CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION = eINSTANCE.getContainerWorkspaceImageCustomization();

		/**
		 * The meta object literal for the '<em><b>Workspace Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION__WORKSPACE_PATH = eINSTANCE.getContainerWorkspaceImageCustomization_WorkspacePath();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.NodeStyleCustomizationImpl <em>Node Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.NodeStyleCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getNodeStyleCustomization()
		 * @generated
		 */
		EClass NODE_STYLE_CUSTOMIZATION = eINSTANCE.getNodeStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Applied On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_STYLE_CUSTOMIZATION__APPLIED_ON = eINSTANCE.getNodeStyleCustomization_AppliedOn();

		/**
		 * The meta object literal for the '<em><b>Owned Specific Node Style Customization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION = eINSTANCE.getNodeStyleCustomization_OwnedSpecificNodeStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Size Computation Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION = eINSTANCE.getNodeStyleCustomization_SizeComputationExpression();

		/**
		 * The meta object literal for the '<em><b>Label Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_STYLE_CUSTOMIZATION__LABEL_POSITION = eINSTANCE.getNodeStyleCustomization_LabelPosition();

		/**
		 * The meta object literal for the '<em><b>Hide Label By Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_STYLE_CUSTOMIZATION__HIDE_LABEL_BY_DEFAULT = eINSTANCE.getNodeStyleCustomization_HideLabelByDefault();

		/**
		 * The meta object literal for the '<em><b>Resize Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_STYLE_CUSTOMIZATION__RESIZE_KIND = eINSTANCE.getNodeStyleCustomization_ResizeKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.SpecificNodeStyleCustomizationImpl <em>Specific Node Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.SpecificNodeStyleCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getSpecificNodeStyleCustomization()
		 * @generated
		 */
		EClass SPECIFIC_NODE_STYLE_CUSTOMIZATION = eINSTANCE.getSpecificNodeStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Applied On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_NODE_STYLE_CUSTOMIZATION__APPLIED_ON = eINSTANCE.getSpecificNodeStyleCustomization_AppliedOn();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EllipseCustomizationImpl <em>Ellipse Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EllipseCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getEllipseCustomization()
		 * @generated
		 */
		EClass ELLIPSE_CUSTOMIZATION = eINSTANCE.getEllipseCustomization();

		/**
		 * The meta object literal for the '<em><b>Horizontal Diameter Computation Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELLIPSE_CUSTOMIZATION__HORIZONTAL_DIAMETER_COMPUTATION_EXPRESSION = eINSTANCE.getEllipseCustomization_HorizontalDiameterComputationExpression();

		/**
		 * The meta object literal for the '<em><b>Vertical Diameter Computation Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELLIPSE_CUSTOMIZATION__VERTICAL_DIAMETER_COMPUTATION_EXPRESSION = eINSTANCE.getEllipseCustomization_VerticalDiameterComputationExpression();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LozengeCustomizationImpl <em>Lozenge Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LozengeCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getLozengeCustomization()
		 * @generated
		 */
		EClass LOZENGE_CUSTOMIZATION = eINSTANCE.getLozengeCustomization();

		/**
		 * The meta object literal for the '<em><b>Width Computation Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOZENGE_CUSTOMIZATION__WIDTH_COMPUTATION_EXPRESSION = eINSTANCE.getLozengeCustomization_WidthComputationExpression();

		/**
		 * The meta object literal for the '<em><b>Height Computation Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOZENGE_CUSTOMIZATION__HEIGHT_COMPUTATION_EXPRESSION = eINSTANCE.getLozengeCustomization_HeightComputationExpression();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.SquareCustomizationImpl <em>Square Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.SquareCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getSquareCustomization()
		 * @generated
		 */
		EClass SQUARE_CUSTOMIZATION = eINSTANCE.getSquareCustomization();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE_CUSTOMIZATION__WIDTH = eINSTANCE.getSquareCustomization_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE_CUSTOMIZATION__HEIGHT = eINSTANCE.getSquareCustomization_Height();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.BundledImageCustomizationImpl <em>Bundled Image Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.BundledImageCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getBundledImageCustomization()
		 * @generated
		 */
		EClass BUNDLED_IMAGE_CUSTOMIZATION = eINSTANCE.getBundledImageCustomization();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLED_IMAGE_CUSTOMIZATION__SHAPE = eINSTANCE.getBundledImageCustomization_Shape();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.DotCustomizationImpl <em>Dot Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.DotCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getDotCustomization()
		 * @generated
		 */
		EClass DOT_CUSTOMIZATION = eINSTANCE.getDotCustomization();

		/**
		 * The meta object literal for the '<em><b>Stroke Size Computation Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOT_CUSTOMIZATION__STROKE_SIZE_COMPUTATION_EXPRESSION = eINSTANCE.getDotCustomization_StrokeSizeComputationExpression();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.GaugeCustomizationImpl <em>Gauge Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.GaugeCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getGaugeCustomization()
		 * @generated
		 */
		EClass GAUGE_CUSTOMIZATION = eINSTANCE.getGaugeCustomization();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAUGE_CUSTOMIZATION__SECTIONS = eINSTANCE.getGaugeCustomization_Sections();

		/**
		 * The meta object literal for the '<em><b>Alignement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUGE_CUSTOMIZATION__ALIGNEMENT = eINSTANCE.getGaugeCustomization_Alignement();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.NodeWorkspaceImageCustomizationImpl <em>Node Workspace Image Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.NodeWorkspaceImageCustomizationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getNodeWorkspaceImageCustomization()
		 * @generated
		 */
		EClass NODE_WORKSPACE_IMAGE_CUSTOMIZATION = eINSTANCE.getNodeWorkspaceImageCustomization();

		/**
		 * The meta object literal for the '<em><b>Workspace Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_WORKSPACE_IMAGE_CUSTOMIZATION__WORKSPACE_PATH = eINSTANCE.getNodeWorkspaceImageCustomization_WorkspacePath();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.StyleCustomizationReuseImpl <em>Style Customization Reuse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.StyleCustomizationReuseImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getStyleCustomizationReuse()
		 * @generated
		 */
		EClass STYLE_CUSTOMIZATION_REUSE = eINSTANCE.getStyleCustomizationReuse();

		/**
		 * The meta object literal for the '<em><b>Reused Customization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_CUSTOMIZATION_REUSE__REUSED_CUSTOMIZATION = eINSTANCE.getStyleCustomizationReuse_ReusedCustomization();

		/**
		 * The meta object literal for the '<em><b>Applied On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_CUSTOMIZATION_REUSE__APPLIED_ON = eINSTANCE.getStyleCustomizationReuse_AppliedOn();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.CustomizationExpressionImpl <em>Customization Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.CustomizationExpressionImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getCustomizationExpression()
		 * @generated
		 */
		EClass CUSTOMIZATION_EXPRESSION = eINSTANCE.getCustomizationExpression();

		/**
		 * The meta object literal for the '<em><b>Owned Expression Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMIZATION_EXPRESSION__OWNED_EXPRESSION_ELEMENT = eINSTANCE.getCustomizationExpression_OwnedExpressionElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorUseCase <em>Color Use Case</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorUseCase
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.VpstylecustomizationPackageImpl#getColorUseCase()
		 * @generated
		 */
		EEnum COLOR_USE_CASE = eINSTANCE.getColorUseCase();

	}

} //VpstylecustomizationPackage
