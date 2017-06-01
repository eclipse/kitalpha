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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage
 * @generated
 */
public interface VpdiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VpdiagramFactory eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram</em>'.
	 * @generated
	 */
	Diagram createDiagram();

	/**
	 * Returns a new object of class '<em>Diagram Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Extension</em>'.
	 * @generated
	 */
	DiagramExtension createDiagramExtension();

	/**
	 * Returns a new object of class '<em>Action Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Set</em>'.
	 * @generated
	 */
	ActionSet createActionSet();

	/**
	 * Returns a new object of class '<em>Mapping Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Set</em>'.
	 * @generated
	 */
	MappingSet createMappingSet();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	Edge createEdge();

	/**
	 * Returns a new object of class '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create</em>'.
	 * @generated
	 */
	Create createCreate();

	/**
	 * Returns a new object of class '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete</em>'.
	 * @generated
	 */
	Delete createDelete();

	/**
	 * Returns a new object of class '<em>Open Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Action</em>'.
	 * @generated
	 */
	OpenAction createOpenAction();

	/**
	 * Returns a new object of class '<em>Reconnect Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconnect Edge</em>'.
	 * @generated
	 */
	ReconnectEdge createReconnectEdge();

	/**
	 * Returns a new object of class '<em>Drop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop</em>'.
	 * @generated
	 */
	Drop createDrop();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Edge Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Import</em>'.
	 * @generated
	 */
	EdgeImport createEdgeImport();

	/**
	 * Returns a new object of class '<em>Edge Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Description</em>'.
	 * @generated
	 */
	EdgeDescription createEdgeDescription();

	/**
	 * Returns a new object of class '<em>Node Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Description</em>'.
	 * @generated
	 */
	NodeDescription createNodeDescription();

	/**
	 * Returns a new object of class '<em>Edge Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Style</em>'.
	 * @generated
	 */
	EdgeStyle createEdgeStyle();

	/**
	 * Returns a new object of class '<em>Basic Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Style</em>'.
	 * @generated
	 */
	BasicStyle createBasicStyle();

	/**
	 * Returns a new object of class '<em>Edge Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Domain Element</em>'.
	 * @generated
	 */
	EdgeDomainElement createEdgeDomainElement();

	/**
	 * Returns a new object of class '<em>Image Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Style</em>'.
	 * @generated
	 */
	ImageStyle createImageStyle();

	/**
	 * Returns a new object of class '<em>Histogram Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Histogram Style</em>'.
	 * @generated
	 */
	HistogramStyle createHistogramStyle();

	/**
	 * Returns a new object of class '<em>Histogram Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Histogram Section</em>'.
	 * @generated
	 */
	HistogramSection createHistogramSection();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Container Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Description</em>'.
	 * @generated
	 */
	ContainerDescription createContainerDescription();

	/**
	 * Returns a new object of class '<em>Flat Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flat Style</em>'.
	 * @generated
	 */
	FlatStyle createFlatStyle();

	/**
	 * Returns a new object of class '<em>Bordered Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bordered Node</em>'.
	 * @generated
	 */
	BorderedNode createBorderedNode();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Node Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Domain Element</em>'.
	 * @generated
	 */
	NodeDomainElement createNodeDomainElement();

	/**
	 * Returns a new object of class '<em>Edge Domain Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Domain Association</em>'.
	 * @generated
	 */
	EdgeDomainAssociation createEdgeDomainAssociation();

	/**
	 * Returns a new object of class '<em>Container Children</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Children</em>'.
	 * @generated
	 */
	ContainerChildren createContainerChildren();

	/**
	 * Returns a new object of class '<em>Node Children</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Children</em>'.
	 * @generated
	 */
	NodeChildren createNodeChildren();

	/**
	 * Returns a new object of class '<em>Domain Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Container</em>'.
	 * @generated
	 */
	DomainContainer createDomainContainer();

	/**
	 * Returns a new object of class '<em>Diagram Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Set</em>'.
	 * @generated
	 */
	DiagramSet createDiagramSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VpdiagramPackage getVpdiagramPackage();

} //VpdiagramFactory
