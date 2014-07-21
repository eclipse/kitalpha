/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.analyzer.graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Graph contains vertices and edges.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.Graph#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.Graph#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.Graph#getVertices <em>Vertices</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.Graph#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {





	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getGraph_Name()
	 * @model
	 * @generated
	 */

	String getName();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.analyzer.graph.Graph#getName <em>Name</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */

	void setName(String value);







	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getGraph_Description()
	 * @model
	 * @generated
	 */

	String getDescription();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.analyzer.graph.Graph#getDescription <em>Description</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */

	void setDescription(String value);







	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.analyzer.graph.Vertex}&lt;?>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertices</em>' containment reference list.
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getGraph_Vertices()
	 * @model containment="true"
	 * @generated
	 */

	EList<Vertex<?>> getVertices();







	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.transposer.analyzer.graph.Edge}&lt;?>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getGraph_Edges()
	 * @model containment="true"
	 * @generated
	 */

	EList<Edge<?>> getEdges();






	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Simply add the target Vertex to the graph as an adjacent of the source one. It will create a non critical edge from the source to the target.
	 * <!-- end-model-doc -->
	 * @model required="true" source_pRequired="true" target_pRequired="true" edgeContent_pRequired="true"
	 * @generated
	 */

	<T> Edge<T> addAdjacent(Vertex<?> source_p, Vertex<?> target_p, T edgeContent_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Simply add the target Vertex to the graph as an adjacent of the source one. It will create an edge from the source to the target. If <code>critical_p = true</code>, the edge created edge will be critical.
	 * <!-- end-model-doc -->
	 * @model required="true" source_pRequired="true" target_pRequired="true" edgeContent_pRequired="true" critical_pRequired="true"
	 * @generated
	 */

	<T> Edge<T> addAdjacent(Vertex<?> source_p, Vertex<?> target_p, T edgeContent_p, boolean critical_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Graph contains vertices and edges.
	 * <!-- end-model-doc -->
	 * @model required="true" sourceRequired="true" targetRequired="true" edgeContentRequired="true" edgeNameRequired="true"
	 * @generated
	 */

	<T> Edge<T> addNamedAdjacent(Vertex<?> source, Vertex<?> target, T edgeContent, String edgeName);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Simply add the target Vertex to the graph as an adjacent of the source one. It will create an edge from the source to the target. If <code>critical_p = true</code>, the edge created edge will be critical.
	 * <!-- end-model-doc -->
	 * @model required="true" source_pRequired="true" target_pRequired="true" edgeContent_pRequired="true" edgeName_pRequired="true" critical_pRequired="true"
	 * @generated
	 */

	<T> Edge<T> addNamedAdjacent(Vertex<?> source_p, Vertex<?> target_p, T edgeContent_p, String edgeName_p, boolean critical_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Simply add the vertex to the graph.
	 * <!-- end-model-doc -->
	 * @model vertex_pRequired="true"
	 * @generated
	 */

	void addVertex(Vertex<?> vertex_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Simply add the edge to the graph.
	 * <!-- end-model-doc -->
	 * @model edge_pRequired="true"
	 * @generated
	 */

	void addEdge(Edge<?> edge_p);




} // Graph
