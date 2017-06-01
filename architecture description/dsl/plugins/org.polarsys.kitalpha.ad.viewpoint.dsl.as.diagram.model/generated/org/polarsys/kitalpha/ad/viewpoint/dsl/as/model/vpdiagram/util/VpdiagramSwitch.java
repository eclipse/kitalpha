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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.*;
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container;
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.OpenAction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ReconnectEdge;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

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
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage
 * @generated
 */
public class VpdiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VpdiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpdiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = VpdiagramPackage.eINSTANCE;
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
			case VpdiagramPackage.DIAGRAM_REPRESENTATION: {
				DiagramRepresentation diagramRepresentation = (DiagramRepresentation)theEObject;
				T result = caseDiagramRepresentation(diagramRepresentation);
				if (result == null) result = caseNamedElement(diagramRepresentation);
				if (result == null) result = caseViewpointElement(diagramRepresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.DIAGRAM: {
				Diagram diagram = (Diagram)theEObject;
				T result = caseDiagram(diagram);
				if (result == null) result = caseDiagramRepresentation(diagram);
				if (result == null) result = caseNamedElement(diagram);
				if (result == null) result = caseViewpointElement(diagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.DIAGRAM_EXTENSION: {
				DiagramExtension diagramExtension = (DiagramExtension)theEObject;
				T result = caseDiagramExtension(diagramExtension);
				if (result == null) result = caseDiagramRepresentation(diagramExtension);
				if (result == null) result = caseNamedElement(diagramExtension);
				if (result == null) result = caseViewpointElement(diagramExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.ACTION_SET: {
				ActionSet actionSet = (ActionSet)theEObject;
				T result = caseActionSet(actionSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.MAPPING_SET: {
				MappingSet mappingSet = (MappingSet)theEObject;
				T result = caseMappingSet(mappingSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = caseViewpointElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseDiagramChildren(node);
				if (result == null) result = caseAbstractNode(node);
				if (result == null) result = caseDiagramElement(node);
				if (result == null) result = caseNamedElement(node);
				if (result == null) result = caseViewpointElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = caseAbstractEdge(edge);
				if (result == null) result = caseDiagramChildren(edge);
				if (result == null) result = caseDiagramElement(edge);
				if (result == null) result = caseNamedElement(edge);
				if (result == null) result = caseViewpointElement(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.DIAGRAM_CHILDREN: {
				DiagramChildren diagramChildren = (DiagramChildren)theEObject;
				T result = caseDiagramChildren(diagramChildren);
				if (result == null) result = caseDiagramElement(diagramChildren);
				if (result == null) result = caseNamedElement(diagramChildren);
				if (result == null) result = caseViewpointElement(diagramChildren);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.CREATE: {
				Create create = (Create)theEObject;
				T result = caseCreate(create);
				if (result == null) result = caseAction(create);
				if (result == null) result = caseNamedElement(create);
				if (result == null) result = caseViewpointElement(create);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.DELETE: {
				Delete delete = (Delete)theEObject;
				T result = caseDelete(delete);
				if (result == null) result = caseAction(delete);
				if (result == null) result = caseNamedElement(delete);
				if (result == null) result = caseViewpointElement(delete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.OPEN_ACTION: {
				OpenAction openAction = (OpenAction)theEObject;
				T result = caseOpenAction(openAction);
				if (result == null) result = caseNamedElement(openAction);
				if (result == null) result = caseViewpointElement(openAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.RECONNECT_EDGE: {
				ReconnectEdge reconnectEdge = (ReconnectEdge)theEObject;
				T result = caseReconnectEdge(reconnectEdge);
				if (result == null) result = caseAction(reconnectEdge);
				if (result == null) result = caseNamedElement(reconnectEdge);
				if (result == null) result = caseViewpointElement(reconnectEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.DROP: {
				Drop drop = (Drop)theEObject;
				T result = caseDrop(drop);
				if (result == null) result = caseAction(drop);
				if (result == null) result = caseNamedElement(drop);
				if (result == null) result = caseViewpointElement(drop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.EDGE_IMPORT: {
				EdgeImport edgeImport = (EdgeImport)theEObject;
				T result = caseEdgeImport(edgeImport);
				if (result == null) result = caseAbstractEdge(edgeImport);
				if (result == null) result = caseDiagramChildren(edgeImport);
				if (result == null) result = caseDiagramElement(edgeImport);
				if (result == null) result = caseNamedElement(edgeImport);
				if (result == null) result = caseViewpointElement(edgeImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.EDGE_DESCRIPTION: {
				EdgeDescription edgeDescription = (EdgeDescription)theEObject;
				T result = caseEdgeDescription(edgeDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.NODE_DESCRIPTION: {
				NodeDescription nodeDescription = (NodeDescription)theEObject;
				T result = caseNodeDescription(nodeDescription);
				if (result == null) result = caseAbstractDescription(nodeDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.EDGE_STYLE: {
				EdgeStyle edgeStyle = (EdgeStyle)theEObject;
				T result = caseEdgeStyle(edgeStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.BASIC_STYLE: {
				BasicStyle basicStyle = (BasicStyle)theEObject;
				T result = caseBasicStyle(basicStyle);
				if (result == null) result = caseAbstractNodeStyle(basicStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT: {
				EdgeDomainElement edgeDomainElement = (EdgeDomainElement)theEObject;
				T result = caseEdgeDomainElement(edgeDomainElement);
				if (result == null) result = caseEdgeDomainAssociation(edgeDomainElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.ABSTRACT_NODE_STYLE: {
				AbstractNodeStyle abstractNodeStyle = (AbstractNodeStyle)theEObject;
				T result = caseAbstractNodeStyle(abstractNodeStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.IMAGE_STYLE: {
				ImageStyle imageStyle = (ImageStyle)theEObject;
				T result = caseImageStyle(imageStyle);
				if (result == null) result = caseAbstractNodeStyle(imageStyle);
				if (result == null) result = caseAbstractContainerStyle(imageStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.HISTOGRAM_STYLE: {
				HistogramStyle histogramStyle = (HistogramStyle)theEObject;
				T result = caseHistogramStyle(histogramStyle);
				if (result == null) result = caseAbstractNodeStyle(histogramStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.HISTOGRAM_SECTION: {
				HistogramSection histogramSection = (HistogramSection)theEObject;
				T result = caseHistogramSection(histogramSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseDiagramChildren(container);
				if (result == null) result = caseAbstractNode(container);
				if (result == null) result = caseDiagramElement(container);
				if (result == null) result = caseNamedElement(container);
				if (result == null) result = caseViewpointElement(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.CONTAINER_DESCRIPTION: {
				ContainerDescription containerDescription = (ContainerDescription)theEObject;
				T result = caseContainerDescription(containerDescription);
				if (result == null) result = caseAbstractDescription(containerDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.FLAT_STYLE: {
				FlatStyle flatStyle = (FlatStyle)theEObject;
				T result = caseFlatStyle(flatStyle);
				if (result == null) result = caseAbstractContainerStyle(flatStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.BORDERED_NODE: {
				BorderedNode borderedNode = (BorderedNode)theEObject;
				T result = caseBorderedNode(borderedNode);
				if (result == null) result = caseAbstractNode(borderedNode);
				if (result == null) result = caseDiagramElement(borderedNode);
				if (result == null) result = caseNamedElement(borderedNode);
				if (result == null) result = caseViewpointElement(borderedNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.DIAGRAM_ELEMENT: {
				DiagramElement diagramElement = (DiagramElement)theEObject;
				T result = caseDiagramElement(diagramElement);
				if (result == null) result = caseNamedElement(diagramElement);
				if (result == null) result = caseViewpointElement(diagramElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.ABSTRACT_DESCRIPTION: {
				AbstractDescription abstractDescription = (AbstractDescription)theEObject;
				T result = caseAbstractDescription(abstractDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.ABSTRACT_EDGE: {
				AbstractEdge abstractEdge = (AbstractEdge)theEObject;
				T result = caseAbstractEdge(abstractEdge);
				if (result == null) result = caseDiagramChildren(abstractEdge);
				if (result == null) result = caseDiagramElement(abstractEdge);
				if (result == null) result = caseNamedElement(abstractEdge);
				if (result == null) result = caseViewpointElement(abstractEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT: {
				NodeDomainElement nodeDomainElement = (NodeDomainElement)theEObject;
				T result = caseNodeDomainElement(nodeDomainElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION: {
				EdgeDomainAssociation edgeDomainAssociation = (EdgeDomainAssociation)theEObject;
				T result = caseEdgeDomainAssociation(edgeDomainAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.ABSTRACT_CONTAINER_STYLE: {
				AbstractContainerStyle abstractContainerStyle = (AbstractContainerStyle)theEObject;
				T result = caseAbstractContainerStyle(abstractContainerStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.CONTAINER_CHILDREN: {
				ContainerChildren containerChildren = (ContainerChildren)theEObject;
				T result = caseContainerChildren(containerChildren);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.ABSTRACT_NODE: {
				AbstractNode abstractNode = (AbstractNode)theEObject;
				T result = caseAbstractNode(abstractNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.NODE_CHILDREN: {
				NodeChildren nodeChildren = (NodeChildren)theEObject;
				T result = caseNodeChildren(nodeChildren);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.DOMAIN_CONTAINER: {
				DomainContainer domainContainer = (DomainContainer)theEObject;
				T result = caseDomainContainer(domainContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VpdiagramPackage.DIAGRAM_SET: {
				DiagramSet diagramSet = (DiagramSet)theEObject;
				T result = caseDiagramSet(diagramSet);
				if (result == null) result = caseAspect(diagramSet);
				if (result == null) result = caseNamedElement(diagramSet);
				if (result == null) result = caseViewpointElement(diagramSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramRepresentation(DiagramRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramExtension(DiagramExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionSet(ActionSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingSet(MappingSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Children</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Children</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramChildren(DiagramChildren object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreate(Create object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelete(Delete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenAction(OpenAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconnect Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconnect Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconnectEdge(ReconnectEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrop(Drop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeImport(EdgeImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeDescription(EdgeDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeDescription(NodeDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeStyle(EdgeStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicStyle(BasicStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeDomainElement(EdgeDomainElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Node Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Node Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNodeStyle(AbstractNodeStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageStyle(ImageStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Histogram Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Histogram Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistogramStyle(HistogramStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Histogram Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Histogram Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistogramSection(HistogramSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerDescription(ContainerDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flat Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flat Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlatStyle(FlatStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bordered Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bordered Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorderedNode(BorderedNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramElement(DiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDescription(AbstractDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEdge(AbstractEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeDomainElement(NodeDomainElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Domain Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Domain Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeDomainAssociation(EdgeDomainAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Container Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Container Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractContainerStyle(AbstractContainerStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Children</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Children</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerChildren(ContainerChildren object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNode(AbstractNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Children</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Children</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeChildren(NodeChildren object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainContainer(DomainContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramSet(DiagramSet object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspect(Aspect object) {
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

} //VpdiagramSwitch
