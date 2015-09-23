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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VpdiagramFactoryImpl extends EFactoryImpl implements
		VpdiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VpdiagramFactory init() {
		try {
			VpdiagramFactory theVpdiagramFactory = (VpdiagramFactory)EPackage.Registry.INSTANCE.getEFactory(VpdiagramPackage.eNS_URI);
			if (theVpdiagramFactory != null) {
				return theVpdiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VpdiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpdiagramFactoryImpl() {
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
			case VpdiagramPackage.DIAGRAM: return createDiagram();
			case VpdiagramPackage.DIAGRAM_EXTENSION: return createDiagramExtension();
			case VpdiagramPackage.ACTION_SET: return createActionSet();
			case VpdiagramPackage.MAPPING_SET: return createMappingSet();
			case VpdiagramPackage.NODE: return createNode();
			case VpdiagramPackage.EDGE: return createEdge();
			case VpdiagramPackage.CREATE: return createCreate();
			case VpdiagramPackage.DELETE: return createDelete();
			case VpdiagramPackage.OPEN_ACTION: return createOpenAction();
			case VpdiagramPackage.RECONNECT_EDGE: return createReconnectEdge();
			case VpdiagramPackage.DROP: return createDrop();
			case VpdiagramPackage.LABEL: return createLabel();
			case VpdiagramPackage.EDGE_IMPORT: return createEdgeImport();
			case VpdiagramPackage.EDGE_DESCRIPTION: return createEdgeDescription();
			case VpdiagramPackage.NODE_DESCRIPTION: return createNodeDescription();
			case VpdiagramPackage.EDGE_STYLE: return createEdgeStyle();
			case VpdiagramPackage.BASIC_STYLE: return createBasicStyle();
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT: return createEdgeDomainElement();
			case VpdiagramPackage.IMAGE_STYLE: return createImageStyle();
			case VpdiagramPackage.HISTOGRAM_STYLE: return createHistogramStyle();
			case VpdiagramPackage.HISTOGRAM_SECTION: return createHistogramSection();
			case VpdiagramPackage.CONTAINER: return createContainer();
			case VpdiagramPackage.CONTAINER_DESCRIPTION: return createContainerDescription();
			case VpdiagramPackage.FLAT_STYLE: return createFlatStyle();
			case VpdiagramPackage.BORDERED_NODE: return createBorderedNode();
			case VpdiagramPackage.CONDITION: return createCondition();
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT: return createNodeDomainElement();
			case VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION: return createEdgeDomainAssociation();
			case VpdiagramPackage.CONTAINER_CHILDREN: return createContainerChildren();
			case VpdiagramPackage.NODE_CHILDREN: return createNodeChildren();
			case VpdiagramPackage.DOMAIN_CONTAINER: return createDomainContainer();
			case VpdiagramPackage.DIAGRAM_SET: return createDiagramSet();
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
			case VpdiagramPackage.NODE_FORM:
				return createNode_FormFromString(eDataType, initialValue);
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
			case VpdiagramPackage.NODE_FORM:
				return convertNode_FormToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramExtension createDiagramExtension() {
		DiagramExtensionImpl diagramExtension = new DiagramExtensionImpl();
		return diagramExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSet createActionSet() {
		ActionSetImpl actionSet = new ActionSetImpl();
		return actionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingSet createMappingSet() {
		MappingSetImpl mappingSet = new MappingSetImpl();
		return mappingSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenAction createOpenAction() {
		OpenActionImpl openAction = new OpenActionImpl();
		return openAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconnectEdge createReconnectEdge() {
		ReconnectEdgeImpl reconnectEdge = new ReconnectEdgeImpl();
		return reconnectEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drop createDrop() {
		DropImpl drop = new DropImpl();
		return drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeImport createEdgeImport() {
		EdgeImportImpl edgeImport = new EdgeImportImpl();
		return edgeImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeDescription createEdgeDescription() {
		EdgeDescriptionImpl edgeDescription = new EdgeDescriptionImpl();
		return edgeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeDescription createNodeDescription() {
		NodeDescriptionImpl nodeDescription = new NodeDescriptionImpl();
		return nodeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeStyle createEdgeStyle() {
		EdgeStyleImpl edgeStyle = new EdgeStyleImpl();
		return edgeStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicStyle createBasicStyle() {
		BasicStyleImpl basicStyle = new BasicStyleImpl();
		return basicStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeDomainElement createEdgeDomainElement() {
		EdgeDomainElementImpl edgeDomainElement = new EdgeDomainElementImpl();
		return edgeDomainElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageStyle createImageStyle() {
		ImageStyleImpl imageStyle = new ImageStyleImpl();
		return imageStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistogramStyle createHistogramStyle() {
		HistogramStyleImpl histogramStyle = new HistogramStyleImpl();
		return histogramStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistogramSection createHistogramSection() {
		HistogramSectionImpl histogramSection = new HistogramSectionImpl();
		return histogramSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerDescription createContainerDescription() {
		ContainerDescriptionImpl containerDescription = new ContainerDescriptionImpl();
		return containerDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatStyle createFlatStyle() {
		FlatStyleImpl flatStyle = new FlatStyleImpl();
		return flatStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderedNode createBorderedNode() {
		BorderedNodeImpl borderedNode = new BorderedNodeImpl();
		return borderedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeDomainElement createNodeDomainElement() {
		NodeDomainElementImpl nodeDomainElement = new NodeDomainElementImpl();
		return nodeDomainElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeDomainAssociation createEdgeDomainAssociation() {
		EdgeDomainAssociationImpl edgeDomainAssociation = new EdgeDomainAssociationImpl();
		return edgeDomainAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerChildren createContainerChildren() {
		ContainerChildrenImpl containerChildren = new ContainerChildrenImpl();
		return containerChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeChildren createNodeChildren() {
		NodeChildrenImpl nodeChildren = new NodeChildrenImpl();
		return nodeChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainContainer createDomainContainer() {
		DomainContainerImpl domainContainer = new DomainContainerImpl();
		return domainContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramSet createDiagramSet() {
		DiagramSetImpl diagramSet = new DiagramSetImpl();
		return diagramSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node_Form createNode_FormFromString(EDataType eDataType,
			String initialValue) {
		Node_Form result = Node_Form.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNode_FormToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpdiagramPackage getVpdiagramPackage() {
		return (VpdiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VpdiagramPackage getPackage() {
		return VpdiagramPackage.eINSTANCE;
	}

} //VpdiagramFactoryImpl
