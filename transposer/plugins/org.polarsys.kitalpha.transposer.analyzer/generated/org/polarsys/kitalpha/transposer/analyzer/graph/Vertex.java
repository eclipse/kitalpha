/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.analyzer.graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Vertex can be considered as a graph node.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.Vertex#isHotSpot <em>Hot Spot</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.Vertex#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.Vertex#getIncomingEdges <em>Incoming Edges</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.Vertex#getAdjacents <em>Adjacents</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.Vertex#getOutgoingAdjacents <em>Outgoing Adjacents</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.Vertex#getIncomingAdjacents <em>Incoming Adjacents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getVertex()
 * @model
 * @generated
 */
public interface Vertex<ContentClass> extends GraphElement<ContentClass> {





	/**
	 * Returns the value of the '<em><b>Hot Spot</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hot Spot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Spot</em>' attribute.
	 * @see #setHotSpot(boolean)
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getVertex_HotSpot()
	 * @model required="true"
	 * @generated
	 */

	boolean isHotSpot();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.analyzer.graph.Vertex#isHotSpot <em>Hot Spot</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Spot</em>' attribute.
	 * @see #isHotSpot()
	 * @generated
	 */

	void setHotSpot(boolean value);







	/**
	 * Returns the value of the '<em><b>Outgoing Edges</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.analyzer.graph.Edge}&lt;?>.
	 * It is bidirectional and its opposite is '{@link org.polarsys.kitalpha.transposer.analyzer.graph.Edge#getSource <em>Source</em>}'.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edges</em>' reference list.
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getVertex_OutgoingEdges()
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.Edge#getSource
	 * @model opposite="source"
	 * @generated
	 */

	EList<Edge<?>> getOutgoingEdges();







	/**
	 * Returns the value of the '<em><b>Incoming Edges</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.analyzer.graph.Edge}&lt;?>.
	 * It is bidirectional and its opposite is '{@link org.polarsys.kitalpha.transposer.analyzer.graph.Edge#getTarget <em>Target</em>}'.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Edges</em>' reference list.
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getVertex_IncomingEdges()
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.Edge#getTarget
	 * @model opposite="target"
	 * @generated
	 */

	EList<Edge<?>> getIncomingEdges();







	/**
	 * Returns the value of the '<em><b>Adjacents</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.analyzer.graph.Vertex}&lt;?>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjacents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjacents</em>' reference list.
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getVertex_Adjacents()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */

	EList<Vertex<?>> getAdjacents();







	/**
	 * Returns the value of the '<em><b>Outgoing Adjacents</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.analyzer.graph.Vertex}&lt;?>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Adjacents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Adjacents</em>' reference list.
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getVertex_OutgoingAdjacents()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */

	EList<Vertex<?>> getOutgoingAdjacents();







	/**
	 * Returns the value of the '<em><b>Incoming Adjacents</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.analyzer.graph.Vertex}&lt;?>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Adjacents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Adjacents</em>' reference list.
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getVertex_IncomingAdjacents()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */

	EList<Vertex<?>> getIncomingAdjacents();






	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Check if the given vertex is adjacent to the current one (e.g. there is an edge between them).
	 * <!-- end-model-doc -->
	 * @model required="true" vertex_pRequired="true"
	 * @generated
	 */

	boolean hasForAdjacent(Vertex<?> vertex_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Check if the given vertex is 'outgoing' adjacent to the current one (e.g. it is the target of an outgoing edge).
	 * <!-- end-model-doc -->
	 * @model required="true" vertex_pRequired="true"
	 * @generated
	 */

	boolean hasForOutgoingAdjacent(Vertex<?> vertex_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Check if the given vertex is 'incoming' adjacent to the current one (e.g. it is the source of an incoming edge).
	 * <!-- end-model-doc -->
	 * @model required="true" vertex_pRequired="true"
	 * @generated
	 */

	boolean hasForIncomingAdjacent(Vertex<?> vertex_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the incoming edge from the given vertex.
	 * <!-- end-model-doc -->
	 * @model required="true" vertex_pRequired="true"
	 * @generated
	 */

	Edge<?> getIncomingEdgeFrom(Vertex<?> vertex_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the outgoing edge to the given vertex.
	 * <!-- end-model-doc -->
	 * @model required="true" vertex_pRequired="true"
	 * @generated
	 */

	Edge<?> getOutgoingEdgeTo(Vertex<?> vertex_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the edge which has the given vertex as source (resp.target) and the current vertex as target (resp. source).
	 * <!-- end-model-doc -->
	 * @model required="true" vertex_pRequired="true"
	 * @generated
	 */

	Edge<?> getEdgeTo(Vertex<?> vertex_p);




} // Vertex
