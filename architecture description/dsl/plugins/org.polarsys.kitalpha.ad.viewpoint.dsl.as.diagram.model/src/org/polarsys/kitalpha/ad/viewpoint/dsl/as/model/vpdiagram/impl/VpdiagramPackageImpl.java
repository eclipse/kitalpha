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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.diagram.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractContainerStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractEdge;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNodeStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Action;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ActionSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BasicStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Condition;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerChildren;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Create;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Delete;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Diagram;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramChildren;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DomainContainer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Drop;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Edge;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ImageStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeChildren;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node_Form;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.OpenAction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ReconnectEdge;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.ConfigurationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.impl.ConfigurationPackageImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.VpconfPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VpdiagramPackageImpl extends EPackageImpl implements
		VpdiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramChildrenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconnectEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeDomainElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass histogramStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass histogramSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flatStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass borderedNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeDomainElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeDomainAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractContainerStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerChildrenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeChildrenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum node_FormEEnum = null;

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
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VpdiagramPackageImpl() {
		super(eNS_URI, VpdiagramFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VpdiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VpdiagramPackage init() {
		if (isInited) return (VpdiagramPackage)EPackage.Registry.INSTANCE.getEPackage(VpdiagramPackage.eNS_URI);

		// Obtain or create and register package
		VpdiagramPackageImpl theVpdiagramPackage = (VpdiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VpdiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VpdiagramPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommondataPackage.eINSTANCE.eClass();
		VpconfPackage.eINSTANCE.eClass();
		VpstylecustomizationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theVpdiagramPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theVpdiagramPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVpdiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VpdiagramPackage.eNS_URI, theVpdiagramPackage);
		return theVpdiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramRepresentation() {
		return diagramRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramRepresentation_The_MappingSet() {
		return (EReference)diagramRepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramRepresentation_The_ActionSet() {
		return (EReference)diagramRepresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagram() {
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_The_domain() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramExtension() {
		return diagramExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramExtension_Extented_diagram() {
		return (EReference)diagramExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramExtension_OwnedCustomizations() {
		return (EReference)diagramExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionSet() {
		return actionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionSet_Actions() {
		return (EReference)actionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionSet_OpenActions() {
		return (EReference)actionSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingSet() {
		return mappingSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingSet_Diagram_Elements() {
		return (EReference)mappingSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Tool_For() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Label() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Precondition() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Style() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Imports() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Children() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Source() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Target() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_The_domain() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramChildren() {
		return diagramChildrenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreate() {
		return createEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreate_Icon() {
		return (EAttribute)createEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelete() {
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenAction() {
		return openActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenAction_Label() {
		return (EAttribute)openActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenAction_Precondition() {
		return (EAttribute)openActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenAction_Icon() {
		return (EAttribute)openActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconnectEdge() {
		return reconnectEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrop() {
		return dropEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Size() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Bold() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Italic() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabel_Value() {
		return (EReference)labelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Color() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeImport() {
		return edgeImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeImport_Imports() {
		return (EReference)edgeImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeDescription() {
		return edgeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeDescription_Style() {
		return (EReference)edgeDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeDescription_Begin_Label() {
		return (EReference)edgeDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeDescription_Center_label() {
		return (EReference)edgeDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeDescription_End_label() {
		return (EReference)edgeDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeDescription_Condition() {
		return (EReference)edgeDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeDescription() {
		return nodeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeDescription_Style() {
		return (EReference)nodeDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeDescription_Label_position() {
		return (EAttribute)nodeDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeDescription_Label_alignement() {
		return (EAttribute)nodeDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeStyle() {
		return edgeStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeStyle_LineStyle() {
		return (EAttribute)edgeStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeStyle_BeginDecorator() {
		return (EAttribute)edgeStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeStyle_EndDecorator() {
		return (EAttribute)edgeStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeStyle_Color() {
		return (EAttribute)edgeStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicStyle() {
		return basicStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicStyle_BackgroundColor() {
		return (EAttribute)basicStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicStyle_Form() {
		return (EAttribute)basicStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeDomainElement() {
		return edgeDomainElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeDomainElement_Source_Locator() {
		return (EReference)edgeDomainElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeDomainElement_The_Domain() {
		return (EReference)edgeDomainElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeDomainElement_Source_query() {
		return (EAttribute)edgeDomainElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNodeStyle() {
		return abstractNodeStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNodeStyle_BorderColor() {
		return (EAttribute)abstractNodeStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageStyle() {
		return imageStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageStyle_ImagePath() {
		return (EAttribute)imageStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistogramStyle() {
		return histogramStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistogramStyle_Sections() {
		return (EReference)histogramStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistogramSection() {
		return histogramSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistogramSection_MinValue() {
		return (EReference)histogramSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistogramSection_MaxValue() {
		return (EReference)histogramSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistogramSection_Value() {
		return (EReference)histogramSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramSection_BackgroundColor() {
		return (EAttribute)histogramSectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramSection_ForgroundColor() {
		return (EAttribute)histogramSectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Style() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Imports() {
		return (EReference)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Children() {
		return (EReference)containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_ContentLayout() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerDescription() {
		return containerDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerDescription_Style() {
		return (EReference)containerDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlatStyle() {
		return flatStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlatStyle_BackgroundColor() {
		return (EAttribute)flatStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlatStyle_ForgroundColor() {
		return (EAttribute)flatStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlatStyle_BorderColor() {
		return (EAttribute)flatStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlatStyle_BackgroundStyle() {
		return (EAttribute)flatStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBorderedNode() {
		return borderedNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBorderedNode_Imports() {
		return (EReference)borderedNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBorderedNode_Style() {
		return (EReference)borderedNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramElement() {
		return diagramElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDescription() {
		return abstractDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDescription_Node_Label() {
		return (EReference)abstractDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDescription_Condition() {
		return (EReference)abstractDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEdge() {
		return abstractEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEdge_E_description() {
		return (EReference)abstractEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Expression() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeDomainElement() {
		return nodeDomainElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeDomainElement_Domain_Class() {
		return (EReference)nodeDomainElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeDomainElement_Chlidren_list() {
		return (EReference)nodeDomainElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeDomainElement_Query() {
		return (EAttribute)nodeDomainElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeDomainAssociation() {
		return edgeDomainAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeDomainAssociation_Target_Locator() {
		return (EReference)edgeDomainAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeDomainAssociation_Target_query() {
		return (EAttribute)edgeDomainAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractContainerStyle() {
		return abstractContainerStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerChildren() {
		return containerChildrenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerChildren_Owned_nodes() {
		return (EReference)containerChildrenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerChildren_Reused_nodes() {
		return (EReference)containerChildrenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNode() {
		return abstractNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_The_domain() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeChildren() {
		return nodeChildrenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeChildren_Owned_boderednodes() {
		return (EReference)nodeChildrenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeChildren_Reused_boderednodes() {
		return (EReference)nodeChildrenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainContainer() {
		return domainContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainContainer_The_domain() {
		return (EReference)domainContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramSet() {
		return diagramSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramSet_Diagrams() {
		return (EReference)diagramSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramSet_AdditionalExternalGroup() {
		return (EReference)diagramSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramSet_AdditionalExternalData() {
		return (EReference)diagramSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNode_Form() {
		return node_FormEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpdiagramFactory getVpdiagramFactory() {
		return (VpdiagramFactory)getEFactoryInstance();
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
		diagramRepresentationEClass = createEClass(DIAGRAM_REPRESENTATION);
		createEReference(diagramRepresentationEClass, DIAGRAM_REPRESENTATION__THE_MAPPING_SET);
		createEReference(diagramRepresentationEClass, DIAGRAM_REPRESENTATION__THE_ACTION_SET);

		diagramEClass = createEClass(DIAGRAM);
		createEReference(diagramEClass, DIAGRAM__THE_DOMAIN);

		diagramExtensionEClass = createEClass(DIAGRAM_EXTENSION);
		createEReference(diagramExtensionEClass, DIAGRAM_EXTENSION__EXTENTED_DIAGRAM);
		createEReference(diagramExtensionEClass, DIAGRAM_EXTENSION__OWNED_CUSTOMIZATIONS);

		actionSetEClass = createEClass(ACTION_SET);
		createEReference(actionSetEClass, ACTION_SET__ACTIONS);
		createEReference(actionSetEClass, ACTION_SET__OPEN_ACTIONS);

		mappingSetEClass = createEClass(MAPPING_SET);
		createEReference(mappingSetEClass, MAPPING_SET__DIAGRAM_ELEMENTS);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__TOOL_FOR);
		createEAttribute(actionEClass, ACTION__LABEL);
		createEAttribute(actionEClass, ACTION__PRECONDITION);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__STYLE);
		createEReference(nodeEClass, NODE__IMPORTS);
		createEReference(nodeEClass, NODE__CHILDREN);

		edgeEClass = createEClass(EDGE);
		createEReference(edgeEClass, EDGE__SOURCE);
		createEReference(edgeEClass, EDGE__TARGET);
		createEReference(edgeEClass, EDGE__THE_DOMAIN);

		diagramChildrenEClass = createEClass(DIAGRAM_CHILDREN);

		createEClass = createEClass(CREATE);
		createEAttribute(createEClass, CREATE__ICON);

		deleteEClass = createEClass(DELETE);

		openActionEClass = createEClass(OPEN_ACTION);
		createEAttribute(openActionEClass, OPEN_ACTION__LABEL);
		createEAttribute(openActionEClass, OPEN_ACTION__PRECONDITION);
		createEAttribute(openActionEClass, OPEN_ACTION__ICON);

		reconnectEdgeEClass = createEClass(RECONNECT_EDGE);

		dropEClass = createEClass(DROP);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__SIZE);
		createEAttribute(labelEClass, LABEL__BOLD);
		createEAttribute(labelEClass, LABEL__ITALIC);
		createEReference(labelEClass, LABEL__VALUE);
		createEAttribute(labelEClass, LABEL__COLOR);

		edgeImportEClass = createEClass(EDGE_IMPORT);
		createEReference(edgeImportEClass, EDGE_IMPORT__IMPORTS);

		edgeDescriptionEClass = createEClass(EDGE_DESCRIPTION);
		createEReference(edgeDescriptionEClass, EDGE_DESCRIPTION__STYLE);
		createEReference(edgeDescriptionEClass, EDGE_DESCRIPTION__BEGIN_LABEL);
		createEReference(edgeDescriptionEClass, EDGE_DESCRIPTION__CENTER_LABEL);
		createEReference(edgeDescriptionEClass, EDGE_DESCRIPTION__END_LABEL);
		createEReference(edgeDescriptionEClass, EDGE_DESCRIPTION__CONDITION);

		nodeDescriptionEClass = createEClass(NODE_DESCRIPTION);
		createEReference(nodeDescriptionEClass, NODE_DESCRIPTION__STYLE);
		createEAttribute(nodeDescriptionEClass, NODE_DESCRIPTION__LABEL_POSITION);
		createEAttribute(nodeDescriptionEClass, NODE_DESCRIPTION__LABEL_ALIGNEMENT);

		edgeStyleEClass = createEClass(EDGE_STYLE);
		createEAttribute(edgeStyleEClass, EDGE_STYLE__LINE_STYLE);
		createEAttribute(edgeStyleEClass, EDGE_STYLE__BEGIN_DECORATOR);
		createEAttribute(edgeStyleEClass, EDGE_STYLE__END_DECORATOR);
		createEAttribute(edgeStyleEClass, EDGE_STYLE__COLOR);

		basicStyleEClass = createEClass(BASIC_STYLE);
		createEAttribute(basicStyleEClass, BASIC_STYLE__BACKGROUND_COLOR);
		createEAttribute(basicStyleEClass, BASIC_STYLE__FORM);

		edgeDomainElementEClass = createEClass(EDGE_DOMAIN_ELEMENT);
		createEReference(edgeDomainElementEClass, EDGE_DOMAIN_ELEMENT__SOURCE_LOCATOR);
		createEReference(edgeDomainElementEClass, EDGE_DOMAIN_ELEMENT__THE_DOMAIN);
		createEAttribute(edgeDomainElementEClass, EDGE_DOMAIN_ELEMENT__SOURCE_QUERY);

		abstractNodeStyleEClass = createEClass(ABSTRACT_NODE_STYLE);
		createEAttribute(abstractNodeStyleEClass, ABSTRACT_NODE_STYLE__BORDER_COLOR);

		imageStyleEClass = createEClass(IMAGE_STYLE);
		createEAttribute(imageStyleEClass, IMAGE_STYLE__IMAGE_PATH);

		histogramStyleEClass = createEClass(HISTOGRAM_STYLE);
		createEReference(histogramStyleEClass, HISTOGRAM_STYLE__SECTIONS);

		histogramSectionEClass = createEClass(HISTOGRAM_SECTION);
		createEReference(histogramSectionEClass, HISTOGRAM_SECTION__MIN_VALUE);
		createEReference(histogramSectionEClass, HISTOGRAM_SECTION__MAX_VALUE);
		createEReference(histogramSectionEClass, HISTOGRAM_SECTION__VALUE);
		createEAttribute(histogramSectionEClass, HISTOGRAM_SECTION__BACKGROUND_COLOR);
		createEAttribute(histogramSectionEClass, HISTOGRAM_SECTION__FORGROUND_COLOR);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__STYLE);
		createEReference(containerEClass, CONTAINER__IMPORTS);
		createEReference(containerEClass, CONTAINER__CHILDREN);
		createEAttribute(containerEClass, CONTAINER__CONTENT_LAYOUT);

		containerDescriptionEClass = createEClass(CONTAINER_DESCRIPTION);
		createEReference(containerDescriptionEClass, CONTAINER_DESCRIPTION__STYLE);

		flatStyleEClass = createEClass(FLAT_STYLE);
		createEAttribute(flatStyleEClass, FLAT_STYLE__BACKGROUND_COLOR);
		createEAttribute(flatStyleEClass, FLAT_STYLE__FORGROUND_COLOR);
		createEAttribute(flatStyleEClass, FLAT_STYLE__BORDER_COLOR);
		createEAttribute(flatStyleEClass, FLAT_STYLE__BACKGROUND_STYLE);

		borderedNodeEClass = createEClass(BORDERED_NODE);
		createEReference(borderedNodeEClass, BORDERED_NODE__IMPORTS);
		createEReference(borderedNodeEClass, BORDERED_NODE__STYLE);

		diagramElementEClass = createEClass(DIAGRAM_ELEMENT);

		abstractDescriptionEClass = createEClass(ABSTRACT_DESCRIPTION);
		createEReference(abstractDescriptionEClass, ABSTRACT_DESCRIPTION__NODE_LABEL);
		createEReference(abstractDescriptionEClass, ABSTRACT_DESCRIPTION__CONDITION);

		abstractEdgeEClass = createEClass(ABSTRACT_EDGE);
		createEReference(abstractEdgeEClass, ABSTRACT_EDGE__EDESCRIPTION);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__EXPRESSION);

		nodeDomainElementEClass = createEClass(NODE_DOMAIN_ELEMENT);
		createEReference(nodeDomainElementEClass, NODE_DOMAIN_ELEMENT__DOMAIN_CLASS);
		createEReference(nodeDomainElementEClass, NODE_DOMAIN_ELEMENT__CHLIDREN_LIST);
		createEAttribute(nodeDomainElementEClass, NODE_DOMAIN_ELEMENT__QUERY);

		edgeDomainAssociationEClass = createEClass(EDGE_DOMAIN_ASSOCIATION);
		createEReference(edgeDomainAssociationEClass, EDGE_DOMAIN_ASSOCIATION__TARGET_LOCATOR);
		createEAttribute(edgeDomainAssociationEClass, EDGE_DOMAIN_ASSOCIATION__TARGET_QUERY);

		abstractContainerStyleEClass = createEClass(ABSTRACT_CONTAINER_STYLE);

		containerChildrenEClass = createEClass(CONTAINER_CHILDREN);
		createEReference(containerChildrenEClass, CONTAINER_CHILDREN__OWNED_NODES);
		createEReference(containerChildrenEClass, CONTAINER_CHILDREN__REUSED_NODES);

		abstractNodeEClass = createEClass(ABSTRACT_NODE);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__THE_DOMAIN);

		nodeChildrenEClass = createEClass(NODE_CHILDREN);
		createEReference(nodeChildrenEClass, NODE_CHILDREN__OWNED_BODEREDNODES);
		createEReference(nodeChildrenEClass, NODE_CHILDREN__REUSED_BODEREDNODES);

		domainContainerEClass = createEClass(DOMAIN_CONTAINER);
		createEReference(domainContainerEClass, DOMAIN_CONTAINER__THE_DOMAIN);

		diagramSetEClass = createEClass(DIAGRAM_SET);
		createEReference(diagramSetEClass, DIAGRAM_SET__DIAGRAMS);
		createEReference(diagramSetEClass, DIAGRAM_SET__ADDITIONAL_EXTERNAL_GROUP);
		createEReference(diagramSetEClass, DIAGRAM_SET__ADDITIONAL_EXTERNAL_DATA);

		// Create enums
		node_FormEEnum = createEEnum(NODE_FORM);
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
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);
		VpdescPackage theVpdescPackage = (VpdescPackage)EPackage.Registry.INSTANCE.getEPackage(VpdescPackage.eNS_URI);
		DescriptionPackage theDescriptionPackage = (DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI);
		VpstylecustomizationPackage theVpstylecustomizationPackage = (VpstylecustomizationPackage)EPackage.Registry.INSTANCE.getEPackage(VpstylecustomizationPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
		org.eclipse.sirius.viewpoint.description.DescriptionPackage theDescriptionPackage_1 = (org.eclipse.sirius.viewpoint.description.DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(org.eclipse.sirius.viewpoint.description.DescriptionPackage.eNS_URI);
		DiagramPackage theDiagramPackage = (DiagramPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramPackage.eNS_URI);
		ViewpointPackage theViewpointPackage = (ViewpointPackage)EPackage.Registry.INSTANCE.getEPackage(ViewpointPackage.eNS_URI);
		CommondataPackage theCommondataPackage = (CommondataPackage)EPackage.Registry.INSTANCE.getEPackage(CommondataPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theConfigurationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		diagramRepresentationEClass.getESuperTypes().add(theVpdescPackage.getNamedElement());
		diagramEClass.getESuperTypes().add(this.getDiagramRepresentation());
		diagramExtensionEClass.getESuperTypes().add(this.getDiagramRepresentation());
		actionEClass.getESuperTypes().add(theVpdescPackage.getNamedElement());
		nodeEClass.getESuperTypes().add(this.getDiagramChildren());
		nodeEClass.getESuperTypes().add(this.getAbstractNode());
		edgeEClass.getESuperTypes().add(this.getAbstractEdge());
		diagramChildrenEClass.getESuperTypes().add(this.getDiagramElement());
		createEClass.getESuperTypes().add(this.getAction());
		deleteEClass.getESuperTypes().add(this.getAction());
		openActionEClass.getESuperTypes().add(theVpdescPackage.getNamedElement());
		reconnectEdgeEClass.getESuperTypes().add(this.getAction());
		dropEClass.getESuperTypes().add(this.getAction());
		edgeImportEClass.getESuperTypes().add(this.getAbstractEdge());
		nodeDescriptionEClass.getESuperTypes().add(this.getAbstractDescription());
		basicStyleEClass.getESuperTypes().add(this.getAbstractNodeStyle());
		edgeDomainElementEClass.getESuperTypes().add(this.getEdgeDomainAssociation());
		imageStyleEClass.getESuperTypes().add(this.getAbstractNodeStyle());
		imageStyleEClass.getESuperTypes().add(this.getAbstractContainerStyle());
		histogramStyleEClass.getESuperTypes().add(this.getAbstractNodeStyle());
		containerEClass.getESuperTypes().add(this.getDiagramChildren());
		containerEClass.getESuperTypes().add(this.getAbstractNode());
		containerDescriptionEClass.getESuperTypes().add(this.getAbstractDescription());
		flatStyleEClass.getESuperTypes().add(this.getAbstractContainerStyle());
		borderedNodeEClass.getESuperTypes().add(this.getAbstractNode());
		borderedNodeEClass.getESuperTypes().add(this.getDiagramElement());
		diagramElementEClass.getESuperTypes().add(theVpdescPackage.getNamedElement());
		abstractEdgeEClass.getESuperTypes().add(this.getDiagramChildren());
		diagramSetEClass.getESuperTypes().add(theVpdescPackage.getAspect());

		// Initialize classes and features; add operations and parameters
		initEClass(diagramRepresentationEClass, DiagramRepresentation.class, "DiagramRepresentation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramRepresentation_The_MappingSet(), this.getMappingSet(), null, "the_MappingSet", null, 0, 1, DiagramRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramRepresentation_The_ActionSet(), this.getActionSet(), null, "the_ActionSet", null, 0, 1, DiagramRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagram_The_domain(), this.getDomainContainer(), null, "the_domain", null, 1, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramExtensionEClass, DiagramExtension.class, "DiagramExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramExtension_Extented_diagram(), theDescriptionPackage.getDiagramDescription(), null, "extented_diagram", null, 1, 1, DiagramExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramExtension_OwnedCustomizations(), theVpstylecustomizationPackage.getCustomizations(), null, "ownedCustomizations", null, 0, 1, DiagramExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionSetEClass, ActionSet.class, "ActionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionSet_Actions(), this.getAction(), null, "actions", null, 0, -1, ActionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionSet_OpenActions(), this.getOpenAction(), null, "openActions", null, 0, -1, ActionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingSetEClass, MappingSet.class, "MappingSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingSet_Diagram_Elements(), this.getDiagramChildren(), null, "diagram_Elements", null, 0, -1, MappingSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Tool_For(), this.getDiagramElement(), null, "tool_For", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Label(), ecorePackage.getEString(), "label", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Precondition(), ecorePackage.getEString(), "precondition", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Style(), this.getNodeDescription(), null, "style", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Imports(), theDescriptionPackage.getNodeMapping(), null, "imports", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Children(), this.getNodeChildren(), null, "children", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdge_Source(), this.getDiagramElement(), null, "source", null, 1, -1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Target(), this.getDiagramElement(), null, "target", null, 1, -1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_The_domain(), this.getEdgeDomainAssociation(), null, "the_domain", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramChildrenEClass, DiagramChildren.class, "DiagramChildren", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createEClass, Create.class, "Create", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreate_Icon(), theEcorePackage.getEString(), "icon", null, 0, 1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openActionEClass, OpenAction.class, "OpenAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenAction_Label(), ecorePackage.getEString(), "label", null, 0, 1, OpenAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenAction_Precondition(), ecorePackage.getEString(), "precondition", null, 0, 1, OpenAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenAction_Icon(), theEcorePackage.getEString(), "icon", null, 0, 1, OpenAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconnectEdgeEClass, ReconnectEdge.class, "ReconnectEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dropEClass, Drop.class, "Drop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Size(), ecorePackage.getEInt(), "size", "8", 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Bold(), ecorePackage.getEBoolean(), "bold", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Italic(), ecorePackage.getEBoolean(), "italic", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabel_Value(), theExpressionPackage.getExpression(), null, "value", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Color(), theDescriptionPackage_1.getSystemColors(), "color", "", 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeImportEClass, EdgeImport.class, "EdgeImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeImport_Imports(), theDescriptionPackage.getEdgeMapping(), null, "imports", null, 1, 1, EdgeImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeDescriptionEClass, EdgeDescription.class, "EdgeDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeDescription_Style(), this.getEdgeStyle(), null, "style", null, 0, 1, EdgeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeDescription_Begin_Label(), this.getLabel(), null, "begin_Label", null, 0, 1, EdgeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeDescription_Center_label(), this.getLabel(), null, "center_label", null, 0, 1, EdgeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeDescription_End_label(), this.getLabel(), null, "end_label", null, 0, 1, EdgeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeDescription_Condition(), this.getCondition(), null, "condition", null, 0, 1, EdgeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeDescriptionEClass, NodeDescription.class, "NodeDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeDescription_Style(), this.getAbstractNodeStyle(), null, "style", null, 0, 1, NodeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeDescription_Label_position(), theDiagramPackage.getLabelPosition(), "label_position", null, 0, 1, NodeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeDescription_Label_alignement(), theViewpointPackage.getLabelAlignment(), "label_alignement", null, 0, 1, NodeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeStyleEClass, EdgeStyle.class, "EdgeStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdgeStyle_LineStyle(), theDiagramPackage.getLineStyle(), "lineStyle", null, 0, 1, EdgeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeStyle_BeginDecorator(), theDiagramPackage.getEdgeArrows(), "beginDecorator", null, 0, 1, EdgeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeStyle_EndDecorator(), theDiagramPackage.getEdgeArrows(), "endDecorator", null, 0, 1, EdgeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeStyle_Color(), theDescriptionPackage_1.getSystemColors(), "color", null, 0, 1, EdgeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicStyleEClass, BasicStyle.class, "BasicStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicStyle_BackgroundColor(), theDescriptionPackage_1.getSystemColors(), "backgroundColor", null, 0, 1, BasicStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicStyle_Form(), this.getNode_Form(), "form", null, 0, 1, BasicStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeDomainElementEClass, EdgeDomainElement.class, "EdgeDomainElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeDomainElement_Source_Locator(), theCommondataPackage.getAbstractAssociation(), null, "source_Locator", null, 0, 1, EdgeDomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeDomainElement_The_Domain(), theCommondataPackage.getAbstractClass(), null, "the_Domain", null, 1, 1, EdgeDomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeDomainElement_Source_query(), theEcorePackage.getEString(), "source_query", null, 0, 1, EdgeDomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNodeStyleEClass, AbstractNodeStyle.class, "AbstractNodeStyle", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractNodeStyle_BorderColor(), theDescriptionPackage_1.getSystemColors(), "borderColor", null, 0, 1, AbstractNodeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageStyleEClass, ImageStyle.class, "ImageStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageStyle_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, ImageStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(histogramStyleEClass, HistogramStyle.class, "HistogramStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistogramStyle_Sections(), this.getHistogramSection(), null, "sections", null, 0, -1, HistogramStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(histogramSectionEClass, HistogramSection.class, "HistogramSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistogramSection_MinValue(), theExpressionPackage.getForeignExpressionElement(), null, "minValue", null, 0, 1, HistogramSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistogramSection_MaxValue(), theExpressionPackage.getForeignExpressionElement(), null, "maxValue", null, 0, 1, HistogramSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistogramSection_Value(), theExpressionPackage.getForeignExpressionElement(), null, "value", null, 0, 1, HistogramSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramSection_BackgroundColor(), theDescriptionPackage_1.getSystemColors(), "backgroundColor", null, 0, 1, HistogramSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramSection_ForgroundColor(), theDescriptionPackage_1.getSystemColors(), "forgroundColor", null, 0, 1, HistogramSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Style(), this.getContainerDescription(), null, "style", null, 0, -1, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Imports(), theDescriptionPackage.getContainerMapping(), null, "imports", null, 0, 1, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Children(), this.getContainerChildren(), null, "children", null, 0, 1, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_ContentLayout(), theDiagramPackage.getContainerLayout(), "contentLayout", null, 0, 1, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerDescriptionEClass, ContainerDescription.class, "ContainerDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerDescription_Style(), this.getAbstractContainerStyle(), null, "style", null, 0, 1, ContainerDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flatStyleEClass, FlatStyle.class, "FlatStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlatStyle_BackgroundColor(), theDescriptionPackage_1.getSystemColors(), "backgroundColor", null, 0, 1, FlatStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlatStyle_ForgroundColor(), theDescriptionPackage_1.getSystemColors(), "forgroundColor", null, 0, 1, FlatStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlatStyle_BorderColor(), theDescriptionPackage_1.getSystemColors(), "borderColor", null, 0, 1, FlatStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlatStyle_BackgroundStyle(), theDiagramPackage.getBackgroundStyle(), "backgroundStyle", null, 0, 1, FlatStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(borderedNodeEClass, BorderedNode.class, "BorderedNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBorderedNode_Imports(), theDescriptionPackage.getNodeMapping(), null, "imports", null, 0, 1, BorderedNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBorderedNode_Style(), this.getNodeDescription(), null, "style", null, 0, -1, BorderedNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramElementEClass, DiagramElement.class, "DiagramElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractDescriptionEClass, AbstractDescription.class, "AbstractDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractDescription_Node_Label(), this.getLabel(), null, "node_Label", null, 0, 1, AbstractDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractDescription_Condition(), this.getCondition(), null, "condition", null, 0, 1, AbstractDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEdgeEClass, AbstractEdge.class, "AbstractEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractEdge_E_description(), this.getEdgeDescription(), null, "e_description", null, 0, -1, AbstractEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Expression(), theExpressionPackage.getForeignExpressionElement(), null, "expression", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeDomainElementEClass, NodeDomainElement.class, "NodeDomainElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeDomainElement_Domain_Class(), theCommondataPackage.getAbstractClass(), null, "domain_Class", null, 1, 1, NodeDomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeDomainElement_Chlidren_list(), theCommondataPackage.getAbstractAssociation(), null, "chlidren_list", null, 0, 1, NodeDomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeDomainElement_Query(), theEcorePackage.getEString(), "query", null, 0, 1, NodeDomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeDomainAssociationEClass, EdgeDomainAssociation.class, "EdgeDomainAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeDomainAssociation_Target_Locator(), theCommondataPackage.getAbstractAssociation(), null, "target_Locator", null, 0, 1, EdgeDomainAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeDomainAssociation_Target_query(), theEcorePackage.getEString(), "target_query", null, 0, 1, EdgeDomainAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractContainerStyleEClass, AbstractContainerStyle.class, "AbstractContainerStyle", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerChildrenEClass, ContainerChildren.class, "ContainerChildren", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerChildren_Owned_nodes(), this.getAbstractNode(), null, "owned_nodes", null, 0, -1, ContainerChildren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerChildren_Reused_nodes(), this.getAbstractNode(), null, "reused_nodes", null, 0, -1, ContainerChildren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNodeEClass, AbstractNode.class, "AbstractNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractNode_The_domain(), this.getNodeDomainElement(), null, "the_domain", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeChildrenEClass, NodeChildren.class, "NodeChildren", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeChildren_Owned_boderednodes(), this.getBorderedNode(), null, "owned_boderednodes", null, 0, -1, NodeChildren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeChildren_Reused_boderednodes(), this.getBorderedNode(), null, "reused_boderednodes", null, 0, -1, NodeChildren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainContainerEClass, DomainContainer.class, "DomainContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainContainer_The_domain(), theCommondataPackage.getAbstractClass(), null, "the_domain", null, 1, 1, DomainContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramSetEClass, DiagramSet.class, "DiagramSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramSet_Diagrams(), this.getDiagramRepresentation(), null, "diagrams", null, 0, -1, DiagramSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramSet_AdditionalExternalGroup(), theDescriptionPackage_1.getGroup(), null, "additionalExternalGroup", null, 0, -1, DiagramSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramSet_AdditionalExternalData(), theEcorePackage.getEPackage(), null, "additionalExternalData", null, 0, -1, DiagramSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(node_FormEEnum, Node_Form.class, "Node_Form");
		addEEnumLiteral(node_FormEEnum, Node_Form.SQUARE);
		addEEnumLiteral(node_FormEEnum, Node_Form.LOZENGE);
		addEEnumLiteral(node_FormEEnum, Node_Form.ECLIPSE);
		addEEnumLiteral(node_FormEEnum, Node_Form.NOTE);
		addEEnumLiteral(node_FormEEnum, Node_Form.DOT);
		addEEnumLiteral(node_FormEEnum, Node_Form.TRIANGLE);
		addEEnumLiteral(node_FormEEnum, Node_Form.STROKE);
		addEEnumLiteral(node_FormEEnum, Node_Form.RING);

		// Create resource
		createResource(eNS_URI);
	}

} //VpdiagramPackageImpl
