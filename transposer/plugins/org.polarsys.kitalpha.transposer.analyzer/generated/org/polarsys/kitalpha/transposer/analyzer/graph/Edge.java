/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An edge is a graph element whichg relies two vertices. An edge is oriented, it references a source Vertex and a target Vertex.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.Edge#isCritical <em>Critical</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.Edge#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge<ContentClass> extends GraphElement<ContentClass> {





	/**
	 * Returns the value of the '<em><b>Critical</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical</em>' attribute.
	 * @see #setCritical(boolean)
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getEdge_Critical()
	 * @model required="true"
	 * @generated
	 */

	boolean isCritical();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.analyzer.graph.Edge#isCritical <em>Critical</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical</em>' attribute.
	 * @see #isCritical()
	 * @generated
	 */

	void setCritical(boolean value);







	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.kitalpha.transposer.analyzer.graph.Vertex#getOutgoingEdges <em>Outgoing Edges</em>}'.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Vertex)
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getEdge_Source()
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.Vertex#getOutgoingEdges
	 * @model opposite="outgoingEdges" required="true"
	 * @generated
	 */

	Vertex<?> getSource();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.analyzer.graph.Edge#getSource <em>Source</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */

	void setSource(Vertex<?> value);







	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.kitalpha.transposer.analyzer.graph.Vertex#getIncomingEdges <em>Incoming Edges</em>}'.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Vertex)
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getEdge_Target()
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.Vertex#getIncomingEdges
	 * @model opposite="incomingEdges" required="true"
	 * @generated
	 */

	Vertex<?> getTarget();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.analyzer.graph.Edge#getTarget <em>Target</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */

	void setTarget(Vertex<?> value);






	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update the current edge : source and target.
	 * <!-- end-model-doc -->
	 * @model sourceVertex_pRequired="true" targetVertex_pRequired="true"
	 * @generated
	 */

	void update(Vertex<?> sourceVertex_p, Vertex<?> targetVertex_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update the current edge : source, target and criticality.
	 * <!-- end-model-doc -->
	 * @model sourceVertex_pRequired="true" targetVertex_pRequired="true" criticalEdge_pRequired="true"
	 * @generated
	 */

	void update(Vertex<?> sourceVertex_p, Vertex<?> targetVertex_p, boolean criticalEdge_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update the current edge : source, target, name and criticality.
	 * <!-- end-model-doc -->
	 * @model sourceVertex_pRequired="true" targetVertex_pRequired="true" edgeName_pRequired="true" criticalEdge_pRequired="true"
	 * @generated
	 */

	void update(Vertex<?> sourceVertex_p, Vertex<?> targetVertex_p, String edgeName_p, boolean criticalEdge_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update the current edge : source, target, content, name and criticality.
	 * <!-- end-model-doc -->
	 * @model sourceVertex_pRequired="true" targetVertex_pRequired="true" edgeContent_pRequired="true" edgeName_pRequired="true" criticalEdge_pRequired="true"
	 * @generated
	 */

	void update(Vertex<?> sourceVertex_p, Vertex<?> targetVertex_p, ContentClass edgeContent_p, String edgeName_p, boolean criticalEdge_p);




} // Edge
