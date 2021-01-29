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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.diagram.DiagramPackage;

import org.eclipse.sirius.viewpoint.ViewpointPackage;

import org.eclipse.sirius.viewpoint.description.DescriptionPackage;

import org.eclipse.sirius.viewpoint.description.style.StylePackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractNodeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.BundledImageCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorUseCase;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerWorkspaceImageCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.CustomizationExpression;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.Customizations;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.DotCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.FlatContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelAlignmentCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LozengeCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeWorkspaceImageCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ShapeContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificNodeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SquareCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VpstylecustomizationPackageImpl extends EPackageImpl implements VpstylecustomizationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customizationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleCustomizationDescriptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelAlignmentCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificContainerStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeContainerStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flatContainerStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerWorkspaceImageCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificNodeStyleCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipseCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lozengeCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass squareCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundledImageCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaugeCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeWorkspaceImageCustomizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleCustomizationReuseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customizationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorUseCaseEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VpstylecustomizationPackageImpl() {
		super(eNS_URI, VpstylecustomizationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VpstylecustomizationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VpstylecustomizationPackage init() {
		if (isInited) return (VpstylecustomizationPackage)EPackage.Registry.INSTANCE.getEPackage(VpstylecustomizationPackage.eNS_URI);

		// Obtain or create and register package
		VpstylecustomizationPackageImpl theVpstylecustomizationPackage = (VpstylecustomizationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VpstylecustomizationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VpstylecustomizationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ExpressionPackage.eINSTANCE.eClass();
		DiagramPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVpstylecustomizationPackage.createPackageContents();

		// Initialize created meta-data
		theVpstylecustomizationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVpstylecustomizationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VpstylecustomizationPackage.eNS_URI, theVpstylecustomizationPackage);
		return theVpstylecustomizationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomizations() {
		return customizationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomizations_OwnedCustomizationDescriptions() {
		return (EReference)customizationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomizations_OwnedCustomizationReuse() {
		return (EReference)customizationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCustomization() {
		return abstractCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCustomization_ApplyonAll() {
		return (EAttribute)abstractCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleCustomizationDescriptions() {
		return styleCustomizationDescriptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleCustomizationDescriptions_OwnedCustomizations() {
		return (EReference)styleCustomizationDescriptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleCustomizationDescriptions_PrecondtionExpression() {
		return (EReference)styleCustomizationDescriptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelCustomization() {
		return labelCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelCustomization_Color() {
		return (EAttribute)labelCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelCustomization_OwnedLabelAlignment() {
		return (EReference)labelCustomizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelCustomization_AppliedOn() {
		return (EReference)labelCustomizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelCustomization_Size() {
		return (EAttribute)labelCustomizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelCustomization_Format() {
		return (EAttribute)labelCustomizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelCustomization_ShowIcon() {
		return (EAttribute)labelCustomizationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelCustomization_Expression() {
		return (EReference)labelCustomizationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelCustomization_IconPath() {
		return (EAttribute)labelCustomizationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelAlignmentCustomization() {
		return labelAlignmentCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelAlignmentCustomization_AppliedOn() {
		return (EReference)labelAlignmentCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelAlignmentCustomization_Alignment() {
		return (EAttribute)labelAlignmentCustomizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorCustomization() {
		return colorCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorCustomization_Color() {
		return (EAttribute)colorCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColorCustomization_AppliedOn() {
		return (EReference)colorCustomizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorCustomization_ColorUseCase() {
		return (EAttribute)colorCustomizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeStyleCustomization() {
		return edgeStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeStyleCustomization_AppliedOn() {
		return (EReference)edgeStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeStyleCustomization_CenteredSourceMappings() {
		return (EReference)edgeStyleCustomizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeStyleCustomization_CenteredTargetMappings() {
		return (EReference)edgeStyleCustomizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeStyleCustomization_BeginLabelStyleDescription() {
		return (EReference)edgeStyleCustomizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeStyleCustomization_CenterLabelStyleDescription() {
		return (EReference)edgeStyleCustomizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeStyleCustomization_EndLabelStyleDescription() {
		return (EReference)edgeStyleCustomizationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeStyleCustomization_LineStyle() {
		return (EAttribute)edgeStyleCustomizationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeStyleCustomization_SourceArrow() {
		return (EAttribute)edgeStyleCustomizationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeStyleCustomization_TargetArrow() {
		return (EAttribute)edgeStyleCustomizationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeStyleCustomization_SizeComputationExpression() {
		return (EReference)edgeStyleCustomizationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeStyleCustomization_RoutingStyle() {
		return (EAttribute)edgeStyleCustomizationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeStyleCustomization_FoldingStyle() {
		return (EAttribute)edgeStyleCustomizationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeStyleCustomization_EndCentering() {
		return (EAttribute)edgeStyleCustomizationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNodeStyleCustomization() {
		return abstractNodeStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNodeStyleCustomization_TooltipExpression() {
		return (EReference)abstractNodeStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNodeStyleCustomization_BorderSizeComputationExpression() {
		return (EReference)abstractNodeStyleCustomizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerStyleCustomization() {
		return containerStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerStyleCustomization_AppliedOn() {
		return (EReference)containerStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerStyleCustomization_OwnedSpecificContainerStyleCustomization() {
		return (EReference)containerStyleCustomizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerStyleCustomization_ArcWith() {
		return (EAttribute)containerStyleCustomizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerStyleCustomization_ArcHeight() {
		return (EAttribute)containerStyleCustomizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerStyleCustomization_RoundedCorner() {
		return (EAttribute)containerStyleCustomizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificContainerStyleCustomization() {
		return specificContainerStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificContainerStyleCustomization_AppliedOn() {
		return (EReference)specificContainerStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeContainerStyleCustomization() {
		return shapeContainerStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeContainerStyleCustomization_Shape() {
		return (EAttribute)shapeContainerStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlatContainerStyleCustomization() {
		return flatContainerStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlatContainerStyleCustomization_BackgroundStyle() {
		return (EAttribute)flatContainerStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerWorkspaceImageCustomization() {
		return containerWorkspaceImageCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerWorkspaceImageCustomization_WorkspacePath() {
		return (EAttribute)containerWorkspaceImageCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeStyleCustomization() {
		return nodeStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeStyleCustomization_AppliedOn() {
		return (EReference)nodeStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeStyleCustomization_OwnedSpecificNodeStyleCustomization() {
		return (EReference)nodeStyleCustomizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeStyleCustomization_SizeComputationExpression() {
		return (EReference)nodeStyleCustomizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeStyleCustomization_LabelPosition() {
		return (EAttribute)nodeStyleCustomizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeStyleCustomization_HideLabelByDefault() {
		return (EAttribute)nodeStyleCustomizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeStyleCustomization_ResizeKind() {
		return (EAttribute)nodeStyleCustomizationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificNodeStyleCustomization() {
		return specificNodeStyleCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificNodeStyleCustomization_AppliedOn() {
		return (EReference)specificNodeStyleCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipseCustomization() {
		return ellipseCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipseCustomization_HorizontalDiameterComputationExpression() {
		return (EReference)ellipseCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipseCustomization_VerticalDiameterComputationExpression() {
		return (EReference)ellipseCustomizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLozengeCustomization() {
		return lozengeCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLozengeCustomization_WidthComputationExpression() {
		return (EReference)lozengeCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLozengeCustomization_HeightComputationExpression() {
		return (EReference)lozengeCustomizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSquareCustomization() {
		return squareCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSquareCustomization_Width() {
		return (EAttribute)squareCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSquareCustomization_Height() {
		return (EAttribute)squareCustomizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundledImageCustomization() {
		return bundledImageCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundledImageCustomization_Shape() {
		return (EAttribute)bundledImageCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDotCustomization() {
		return dotCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDotCustomization_StrokeSizeComputationExpression() {
		return (EReference)dotCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaugeCustomization() {
		return gaugeCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaugeCustomization_Sections() {
		return (EReference)gaugeCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGaugeCustomization_Alignement() {
		return (EAttribute)gaugeCustomizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeWorkspaceImageCustomization() {
		return nodeWorkspaceImageCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeWorkspaceImageCustomization_WorkspacePath() {
		return (EAttribute)nodeWorkspaceImageCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleCustomizationReuse() {
		return styleCustomizationReuseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleCustomizationReuse_ReusedCustomization() {
		return (EReference)styleCustomizationReuseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleCustomizationReuse_AppliedOn() {
		return (EReference)styleCustomizationReuseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomizationExpression() {
		return customizationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomizationExpression_OwnedExpressionElement() {
		return (EReference)customizationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorUseCase() {
		return colorUseCaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpstylecustomizationFactory getVpstylecustomizationFactory() {
		return (VpstylecustomizationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		customizationsEClass = createEClass(CUSTOMIZATIONS);
		createEReference(customizationsEClass, CUSTOMIZATIONS__OWNED_CUSTOMIZATION_DESCRIPTIONS);
		createEReference(customizationsEClass, CUSTOMIZATIONS__OWNED_CUSTOMIZATION_REUSE);

		abstractCustomizationEClass = createEClass(ABSTRACT_CUSTOMIZATION);
		createEAttribute(abstractCustomizationEClass, ABSTRACT_CUSTOMIZATION__APPLYON_ALL);

		styleCustomizationDescriptionsEClass = createEClass(STYLE_CUSTOMIZATION_DESCRIPTIONS);
		createEReference(styleCustomizationDescriptionsEClass, STYLE_CUSTOMIZATION_DESCRIPTIONS__OWNED_CUSTOMIZATIONS);
		createEReference(styleCustomizationDescriptionsEClass, STYLE_CUSTOMIZATION_DESCRIPTIONS__PRECONDTION_EXPRESSION);

		styleCustomizationReuseEClass = createEClass(STYLE_CUSTOMIZATION_REUSE);
		createEReference(styleCustomizationReuseEClass, STYLE_CUSTOMIZATION_REUSE__REUSED_CUSTOMIZATION);
		createEReference(styleCustomizationReuseEClass, STYLE_CUSTOMIZATION_REUSE__APPLIED_ON);

		customizationExpressionEClass = createEClass(CUSTOMIZATION_EXPRESSION);
		createEReference(customizationExpressionEClass, CUSTOMIZATION_EXPRESSION__OWNED_EXPRESSION_ELEMENT);

		labelCustomizationEClass = createEClass(LABEL_CUSTOMIZATION);
		createEAttribute(labelCustomizationEClass, LABEL_CUSTOMIZATION__COLOR);
		createEReference(labelCustomizationEClass, LABEL_CUSTOMIZATION__OWNED_LABEL_ALIGNMENT);
		createEReference(labelCustomizationEClass, LABEL_CUSTOMIZATION__APPLIED_ON);
		createEAttribute(labelCustomizationEClass, LABEL_CUSTOMIZATION__SIZE);
		createEAttribute(labelCustomizationEClass, LABEL_CUSTOMIZATION__FORMAT);
		createEAttribute(labelCustomizationEClass, LABEL_CUSTOMIZATION__SHOW_ICON);
		createEReference(labelCustomizationEClass, LABEL_CUSTOMIZATION__EXPRESSION);
		createEAttribute(labelCustomizationEClass, LABEL_CUSTOMIZATION__ICON_PATH);

		labelAlignmentCustomizationEClass = createEClass(LABEL_ALIGNMENT_CUSTOMIZATION);
		createEReference(labelAlignmentCustomizationEClass, LABEL_ALIGNMENT_CUSTOMIZATION__APPLIED_ON);
		createEAttribute(labelAlignmentCustomizationEClass, LABEL_ALIGNMENT_CUSTOMIZATION__ALIGNMENT);

		colorCustomizationEClass = createEClass(COLOR_CUSTOMIZATION);
		createEAttribute(colorCustomizationEClass, COLOR_CUSTOMIZATION__COLOR);
		createEReference(colorCustomizationEClass, COLOR_CUSTOMIZATION__APPLIED_ON);
		createEAttribute(colorCustomizationEClass, COLOR_CUSTOMIZATION__COLOR_USE_CASE);

		edgeStyleCustomizationEClass = createEClass(EDGE_STYLE_CUSTOMIZATION);
		createEReference(edgeStyleCustomizationEClass, EDGE_STYLE_CUSTOMIZATION__APPLIED_ON);
		createEReference(edgeStyleCustomizationEClass, EDGE_STYLE_CUSTOMIZATION__CENTERED_SOURCE_MAPPINGS);
		createEReference(edgeStyleCustomizationEClass, EDGE_STYLE_CUSTOMIZATION__CENTERED_TARGET_MAPPINGS);
		createEReference(edgeStyleCustomizationEClass, EDGE_STYLE_CUSTOMIZATION__BEGIN_LABEL_STYLE_DESCRIPTION);
		createEReference(edgeStyleCustomizationEClass, EDGE_STYLE_CUSTOMIZATION__CENTER_LABEL_STYLE_DESCRIPTION);
		createEReference(edgeStyleCustomizationEClass, EDGE_STYLE_CUSTOMIZATION__END_LABEL_STYLE_DESCRIPTION);
		createEAttribute(edgeStyleCustomizationEClass, EDGE_STYLE_CUSTOMIZATION__LINE_STYLE);
		createEAttribute(edgeStyleCustomizationEClass, EDGE_STYLE_CUSTOMIZATION__SOURCE_ARROW);
		createEAttribute(edgeStyleCustomizationEClass, EDGE_STYLE_CUSTOMIZATION__TARGET_ARROW);
		createEReference(edgeStyleCustomizationEClass, EDGE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION);
		createEAttribute(edgeStyleCustomizationEClass, EDGE_STYLE_CUSTOMIZATION__ROUTING_STYLE);
		createEAttribute(edgeStyleCustomizationEClass, EDGE_STYLE_CUSTOMIZATION__FOLDING_STYLE);
		createEAttribute(edgeStyleCustomizationEClass, EDGE_STYLE_CUSTOMIZATION__END_CENTERING);

		abstractNodeStyleCustomizationEClass = createEClass(ABSTRACT_NODE_STYLE_CUSTOMIZATION);
		createEReference(abstractNodeStyleCustomizationEClass, ABSTRACT_NODE_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION);
		createEReference(abstractNodeStyleCustomizationEClass, ABSTRACT_NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION);

		containerStyleCustomizationEClass = createEClass(CONTAINER_STYLE_CUSTOMIZATION);
		createEReference(containerStyleCustomizationEClass, CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON);
		createEReference(containerStyleCustomizationEClass, CONTAINER_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION);
		createEAttribute(containerStyleCustomizationEClass, CONTAINER_STYLE_CUSTOMIZATION__ARC_WITH);
		createEAttribute(containerStyleCustomizationEClass, CONTAINER_STYLE_CUSTOMIZATION__ARC_HEIGHT);
		createEAttribute(containerStyleCustomizationEClass, CONTAINER_STYLE_CUSTOMIZATION__ROUNDED_CORNER);

		specificContainerStyleCustomizationEClass = createEClass(SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION);
		createEReference(specificContainerStyleCustomizationEClass, SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON);

		shapeContainerStyleCustomizationEClass = createEClass(SHAPE_CONTAINER_STYLE_CUSTOMIZATION);
		createEAttribute(shapeContainerStyleCustomizationEClass, SHAPE_CONTAINER_STYLE_CUSTOMIZATION__SHAPE);

		flatContainerStyleCustomizationEClass = createEClass(FLAT_CONTAINER_STYLE_CUSTOMIZATION);
		createEAttribute(flatContainerStyleCustomizationEClass, FLAT_CONTAINER_STYLE_CUSTOMIZATION__BACKGROUND_STYLE);

		containerWorkspaceImageCustomizationEClass = createEClass(CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION);
		createEAttribute(containerWorkspaceImageCustomizationEClass, CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION__WORKSPACE_PATH);

		nodeStyleCustomizationEClass = createEClass(NODE_STYLE_CUSTOMIZATION);
		createEReference(nodeStyleCustomizationEClass, NODE_STYLE_CUSTOMIZATION__APPLIED_ON);
		createEReference(nodeStyleCustomizationEClass, NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION);
		createEReference(nodeStyleCustomizationEClass, NODE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION);
		createEAttribute(nodeStyleCustomizationEClass, NODE_STYLE_CUSTOMIZATION__LABEL_POSITION);
		createEAttribute(nodeStyleCustomizationEClass, NODE_STYLE_CUSTOMIZATION__HIDE_LABEL_BY_DEFAULT);
		createEAttribute(nodeStyleCustomizationEClass, NODE_STYLE_CUSTOMIZATION__RESIZE_KIND);

		specificNodeStyleCustomizationEClass = createEClass(SPECIFIC_NODE_STYLE_CUSTOMIZATION);
		createEReference(specificNodeStyleCustomizationEClass, SPECIFIC_NODE_STYLE_CUSTOMIZATION__APPLIED_ON);

		ellipseCustomizationEClass = createEClass(ELLIPSE_CUSTOMIZATION);
		createEReference(ellipseCustomizationEClass, ELLIPSE_CUSTOMIZATION__HORIZONTAL_DIAMETER_COMPUTATION_EXPRESSION);
		createEReference(ellipseCustomizationEClass, ELLIPSE_CUSTOMIZATION__VERTICAL_DIAMETER_COMPUTATION_EXPRESSION);

		lozengeCustomizationEClass = createEClass(LOZENGE_CUSTOMIZATION);
		createEReference(lozengeCustomizationEClass, LOZENGE_CUSTOMIZATION__WIDTH_COMPUTATION_EXPRESSION);
		createEReference(lozengeCustomizationEClass, LOZENGE_CUSTOMIZATION__HEIGHT_COMPUTATION_EXPRESSION);

		squareCustomizationEClass = createEClass(SQUARE_CUSTOMIZATION);
		createEAttribute(squareCustomizationEClass, SQUARE_CUSTOMIZATION__WIDTH);
		createEAttribute(squareCustomizationEClass, SQUARE_CUSTOMIZATION__HEIGHT);

		bundledImageCustomizationEClass = createEClass(BUNDLED_IMAGE_CUSTOMIZATION);
		createEAttribute(bundledImageCustomizationEClass, BUNDLED_IMAGE_CUSTOMIZATION__SHAPE);

		dotCustomizationEClass = createEClass(DOT_CUSTOMIZATION);
		createEReference(dotCustomizationEClass, DOT_CUSTOMIZATION__STROKE_SIZE_COMPUTATION_EXPRESSION);

		gaugeCustomizationEClass = createEClass(GAUGE_CUSTOMIZATION);
		createEReference(gaugeCustomizationEClass, GAUGE_CUSTOMIZATION__SECTIONS);
		createEAttribute(gaugeCustomizationEClass, GAUGE_CUSTOMIZATION__ALIGNEMENT);

		nodeWorkspaceImageCustomizationEClass = createEClass(NODE_WORKSPACE_IMAGE_CUSTOMIZATION);
		createEAttribute(nodeWorkspaceImageCustomizationEClass, NODE_WORKSPACE_IMAGE_CUSTOMIZATION__WORKSPACE_PATH);

		// Create enums
		colorUseCaseEEnum = createEEnum(COLOR_USE_CASE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		VpdescPackage theVpdescPackage = (VpdescPackage)EPackage.Registry.INSTANCE.getEPackage(VpdescPackage.eNS_URI);
		DescriptionPackage theDescriptionPackage = (DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
		StylePackage theStylePackage = (StylePackage)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI);
		ViewpointPackage theViewpointPackage = (ViewpointPackage)EPackage.Registry.INSTANCE.getEPackage(ViewpointPackage.eNS_URI);
		org.eclipse.sirius.diagram.description.style.StylePackage theStylePackage_1 = (org.eclipse.sirius.diagram.description.style.StylePackage)EPackage.Registry.INSTANCE.getEPackage(org.eclipse.sirius.diagram.description.style.StylePackage.eNS_URI);
		org.eclipse.sirius.diagram.description.DescriptionPackage theDescriptionPackage_1 = (org.eclipse.sirius.diagram.description.DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(org.eclipse.sirius.diagram.description.DescriptionPackage.eNS_URI);
		DiagramPackage theDiagramPackage = (DiagramPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		styleCustomizationDescriptionsEClass.getESuperTypes().add(theVpdescPackage.getNamedElement());
		styleCustomizationReuseEClass.getESuperTypes().add(theVpdescPackage.getNamedElement());
		labelCustomizationEClass.getESuperTypes().add(this.getAbstractCustomization());
		colorCustomizationEClass.getESuperTypes().add(this.getAbstractCustomization());
		edgeStyleCustomizationEClass.getESuperTypes().add(this.getAbstractCustomization());
		abstractNodeStyleCustomizationEClass.getESuperTypes().add(this.getAbstractCustomization());
		containerStyleCustomizationEClass.getESuperTypes().add(this.getAbstractNodeStyleCustomization());
		shapeContainerStyleCustomizationEClass.getESuperTypes().add(this.getSpecificContainerStyleCustomization());
		flatContainerStyleCustomizationEClass.getESuperTypes().add(this.getSpecificContainerStyleCustomization());
		containerWorkspaceImageCustomizationEClass.getESuperTypes().add(this.getSpecificContainerStyleCustomization());
		nodeStyleCustomizationEClass.getESuperTypes().add(this.getAbstractNodeStyleCustomization());
		ellipseCustomizationEClass.getESuperTypes().add(this.getSpecificNodeStyleCustomization());
		lozengeCustomizationEClass.getESuperTypes().add(this.getSpecificNodeStyleCustomization());
		squareCustomizationEClass.getESuperTypes().add(this.getSpecificNodeStyleCustomization());
		bundledImageCustomizationEClass.getESuperTypes().add(this.getSpecificNodeStyleCustomization());
		dotCustomizationEClass.getESuperTypes().add(this.getSpecificNodeStyleCustomization());
		gaugeCustomizationEClass.getESuperTypes().add(this.getSpecificNodeStyleCustomization());
		nodeWorkspaceImageCustomizationEClass.getESuperTypes().add(this.getSpecificNodeStyleCustomization());

		// Initialize classes, features, and operations; add parameters
		initEClass(customizationsEClass, Customizations.class, "Customizations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomizations_OwnedCustomizationDescriptions(), this.getStyleCustomizationDescriptions(), null, "ownedCustomizationDescriptions", null, 0, -1, Customizations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomizations_OwnedCustomizationReuse(), this.getStyleCustomizationReuse(), null, "ownedCustomizationReuse", null, 0, -1, Customizations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractCustomizationEClass, AbstractCustomization.class, "AbstractCustomization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractCustomization_ApplyonAll(), ecorePackage.getEBoolean(), "applyonAll", null, 0, 1, AbstractCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleCustomizationDescriptionsEClass, StyleCustomizationDescriptions.class, "StyleCustomizationDescriptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleCustomizationDescriptions_OwnedCustomizations(), this.getAbstractCustomization(), null, "ownedCustomizations", null, 0, -1, StyleCustomizationDescriptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleCustomizationDescriptions_PrecondtionExpression(), this.getCustomizationExpression(), null, "precondtionExpression", null, 0, 1, StyleCustomizationDescriptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleCustomizationReuseEClass, StyleCustomizationReuse.class, "StyleCustomizationReuse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleCustomizationReuse_ReusedCustomization(), theDescriptionPackage.getEStructuralFeatureCustomization(), null, "reusedCustomization", null, 0, -1, StyleCustomizationReuse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleCustomizationReuse_AppliedOn(), theEcorePackage.getEObject(), null, "appliedOn", null, 0, -1, StyleCustomizationReuse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customizationExpressionEClass, CustomizationExpression.class, "CustomizationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomizationExpression_OwnedExpressionElement(), theExpressionPackage.getAbstractComputableElement(), null, "ownedExpressionElement", null, 0, 1, CustomizationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelCustomizationEClass, LabelCustomization.class, "LabelCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelCustomization_Color(), theDescriptionPackage.getSystemColors(), "color", null, 0, 1, LabelCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelCustomization_OwnedLabelAlignment(), this.getLabelAlignmentCustomization(), null, "ownedLabelAlignment", null, 0, 1, LabelCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelCustomization_AppliedOn(), theStylePackage.getBasicLabelStyleDescription(), null, "appliedOn", null, 0, -1, LabelCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelCustomization_Size(), ecorePackage.getEInt(), "size", null, 0, 1, LabelCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelCustomization_Format(), theViewpointPackage.getFontFormat(), "format", null, 0, 1, LabelCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelCustomization_ShowIcon(), ecorePackage.getEBoolean(), "showIcon", null, 0, 1, LabelCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelCustomization_Expression(), this.getCustomizationExpression(), null, "expression", null, 0, 1, LabelCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelCustomization_IconPath(), ecorePackage.getEString(), "iconPath", null, 0, 1, LabelCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelAlignmentCustomizationEClass, LabelAlignmentCustomization.class, "LabelAlignmentCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelAlignmentCustomization_AppliedOn(), theStylePackage.getLabelStyleDescription(), null, "appliedOn", null, 0, -1, LabelAlignmentCustomization.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelAlignmentCustomization_Alignment(), theViewpointPackage.getLabelAlignment(), "alignment", null, 0, 1, LabelAlignmentCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorCustomizationEClass, ColorCustomization.class, "ColorCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorCustomization_Color(), theDescriptionPackage.getSystemColors(), "color", null, 0, 1, ColorCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColorCustomization_AppliedOn(), theEcorePackage.getEObject(), null, "appliedOn", null, 0, -1, ColorCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorCustomization_ColorUseCase(), this.getColorUseCase(), "colorUseCase", null, 0, 1, ColorCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeStyleCustomizationEClass, EdgeStyleCustomization.class, "EdgeStyleCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeStyleCustomization_AppliedOn(), theStylePackage_1.getEdgeStyleDescription(), null, "appliedOn", null, 0, -1, EdgeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeStyleCustomization_CenteredSourceMappings(), theDescriptionPackage_1.getDiagramElementMapping(), null, "centeredSourceMappings", null, 0, -1, EdgeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeStyleCustomization_CenteredTargetMappings(), theDescriptionPackage_1.getDiagramElementMapping(), null, "centeredTargetMappings", null, 0, -1, EdgeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeStyleCustomization_BeginLabelStyleDescription(), theStylePackage_1.getBeginLabelStyleDescription(), null, "beginLabelStyleDescription", null, 0, 1, EdgeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeStyleCustomization_CenterLabelStyleDescription(), theStylePackage_1.getCenterLabelStyleDescription(), null, "centerLabelStyleDescription", null, 0, 1, EdgeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeStyleCustomization_EndLabelStyleDescription(), theStylePackage_1.getEndLabelStyleDescription(), null, "endLabelStyleDescription", null, 0, 1, EdgeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeStyleCustomization_LineStyle(), theDiagramPackage.getLineStyle(), "lineStyle", null, 0, 1, EdgeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeStyleCustomization_SourceArrow(), theDiagramPackage.getEdgeArrows(), "sourceArrow", null, 0, 1, EdgeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeStyleCustomization_TargetArrow(), theDiagramPackage.getEdgeArrows(), "targetArrow", null, 0, 1, EdgeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeStyleCustomization_SizeComputationExpression(), this.getCustomizationExpression(), null, "sizeComputationExpression", null, 0, 1, EdgeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeStyleCustomization_RoutingStyle(), theDiagramPackage.getEdgeRouting(), "routingStyle", null, 0, 1, EdgeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeStyleCustomization_FoldingStyle(), theDescriptionPackage_1.getFoldingStyle(), "foldingStyle", null, 0, 1, EdgeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeStyleCustomization_EndCentering(), theDescriptionPackage_1.getCenteringStyle(), "endCentering", null, 0, 1, EdgeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNodeStyleCustomizationEClass, AbstractNodeStyleCustomization.class, "AbstractNodeStyleCustomization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractNodeStyleCustomization_TooltipExpression(), this.getCustomizationExpression(), null, "tooltipExpression", null, 0, 1, AbstractNodeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNodeStyleCustomization_BorderSizeComputationExpression(), this.getCustomizationExpression(), null, "borderSizeComputationExpression", null, 0, 1, AbstractNodeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerStyleCustomizationEClass, ContainerStyleCustomization.class, "ContainerStyleCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerStyleCustomization_AppliedOn(), theStylePackage_1.getContainerStyleDescription(), null, "appliedOn", null, 0, -1, ContainerStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerStyleCustomization_OwnedSpecificContainerStyleCustomization(), this.getSpecificContainerStyleCustomization(), null, "ownedSpecificContainerStyleCustomization", null, 0, -1, ContainerStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerStyleCustomization_ArcWith(), ecorePackage.getEInt(), "arcWith", null, 0, 1, ContainerStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerStyleCustomization_ArcHeight(), ecorePackage.getEInt(), "arcHeight", null, 0, 1, ContainerStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerStyleCustomization_RoundedCorner(), ecorePackage.getEBoolean(), "roundedCorner", null, 0, 1, ContainerStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificContainerStyleCustomizationEClass, SpecificContainerStyleCustomization.class, "SpecificContainerStyleCustomization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificContainerStyleCustomization_AppliedOn(), theStylePackage_1.getContainerStyleDescription(), null, "appliedOn", null, 0, -1, SpecificContainerStyleCustomization.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(shapeContainerStyleCustomizationEClass, ShapeContainerStyleCustomization.class, "ShapeContainerStyleCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShapeContainerStyleCustomization_Shape(), theDiagramPackage.getContainerShape(), "shape", null, 0, 1, ShapeContainerStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flatContainerStyleCustomizationEClass, FlatContainerStyleCustomization.class, "FlatContainerStyleCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlatContainerStyleCustomization_BackgroundStyle(), theDiagramPackage.getBackgroundStyle(), "backgroundStyle", null, 0, 1, FlatContainerStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerWorkspaceImageCustomizationEClass, ContainerWorkspaceImageCustomization.class, "ContainerWorkspaceImageCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerWorkspaceImageCustomization_WorkspacePath(), ecorePackage.getEString(), "workspacePath", null, 0, 1, ContainerWorkspaceImageCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeStyleCustomizationEClass, NodeStyleCustomization.class, "NodeStyleCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeStyleCustomization_AppliedOn(), theStylePackage_1.getNodeStyleDescription(), null, "appliedOn", null, 0, -1, NodeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeStyleCustomization_OwnedSpecificNodeStyleCustomization(), this.getSpecificNodeStyleCustomization(), null, "ownedSpecificNodeStyleCustomization", null, 0, -1, NodeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeStyleCustomization_SizeComputationExpression(), this.getCustomizationExpression(), null, "sizeComputationExpression", null, 0, 1, NodeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeStyleCustomization_LabelPosition(), theDiagramPackage.getLabelPosition(), "labelPosition", null, 0, 1, NodeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeStyleCustomization_HideLabelByDefault(), ecorePackage.getEBoolean(), "hideLabelByDefault", null, 0, 1, NodeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeStyleCustomization_ResizeKind(), theDiagramPackage.getResizeKind(), "resizeKind", null, 0, 1, NodeStyleCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificNodeStyleCustomizationEClass, SpecificNodeStyleCustomization.class, "SpecificNodeStyleCustomization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificNodeStyleCustomization_AppliedOn(), theStylePackage_1.getNodeStyleDescription(), null, "appliedOn", null, 0, -1, SpecificNodeStyleCustomization.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ellipseCustomizationEClass, EllipseCustomization.class, "EllipseCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEllipseCustomization_HorizontalDiameterComputationExpression(), this.getCustomizationExpression(), null, "horizontalDiameterComputationExpression", null, 0, 1, EllipseCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEllipseCustomization_VerticalDiameterComputationExpression(), this.getCustomizationExpression(), null, "verticalDiameterComputationExpression", null, 0, 1, EllipseCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lozengeCustomizationEClass, LozengeCustomization.class, "LozengeCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLozengeCustomization_WidthComputationExpression(), this.getCustomizationExpression(), null, "widthComputationExpression", null, 0, 1, LozengeCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLozengeCustomization_HeightComputationExpression(), this.getCustomizationExpression(), null, "heightComputationExpression", null, 0, 1, LozengeCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(squareCustomizationEClass, SquareCustomization.class, "SquareCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSquareCustomization_Width(), ecorePackage.getEInt(), "width", "-1", 0, 1, SquareCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSquareCustomization_Height(), ecorePackage.getEInt(), "height", "-1", 0, 1, SquareCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundledImageCustomizationEClass, BundledImageCustomization.class, "BundledImageCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundledImageCustomization_Shape(), theDiagramPackage.getBundledImageShape(), "shape", null, 0, 1, BundledImageCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dotCustomizationEClass, DotCustomization.class, "DotCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDotCustomization_StrokeSizeComputationExpression(), this.getCustomizationExpression(), null, "strokeSizeComputationExpression", null, 0, 1, DotCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gaugeCustomizationEClass, GaugeCustomization.class, "GaugeCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGaugeCustomization_Sections(), theStylePackage_1.getGaugeSectionDescription(), null, "sections", null, 0, -1, GaugeCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGaugeCustomization_Alignement(), theDiagramPackage.getAlignmentKind(), "alignement", null, 0, 1, GaugeCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeWorkspaceImageCustomizationEClass, NodeWorkspaceImageCustomization.class, "NodeWorkspaceImageCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeWorkspaceImageCustomization_WorkspacePath(), ecorePackage.getEString(), "workspacePath", null, 0, 1, NodeWorkspaceImageCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorUseCaseEEnum, ColorUseCase.class, "ColorUseCase");
		addEEnumLiteral(colorUseCaseEEnum, ColorUseCase.BORDER);
		addEEnumLiteral(colorUseCaseEEnum, ColorUseCase.COLOR);
		addEEnumLiteral(colorUseCaseEEnum, ColorUseCase.BACKGROUND);
		addEEnumLiteral(colorUseCaseEEnum, ColorUseCase.FOREGROUND);

		// Create resource
		createResource(eNS_URI);
	}

} //VpstylecustomizationPackageImpl
