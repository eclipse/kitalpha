/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.analyzer.graph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract named element contained by a graph.
 * Its "contents" reference allows to point to an object (eg : a model object) 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.GraphElement#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.GraphElement#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getGraphElement()
 * @model abstract="true"
 * @generated
 */
public interface GraphElement<ContentClass> extends EObject {





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
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getGraphElement_Name()
	 * @model
	 * @generated
	 */

	String getName();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.analyzer.graph.GraphElement#getName <em>Name</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */

	void setName(String value);







	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(Object)
	 * @see org.polarsys.kitalpha.transposer.analyzer.graph.GraphPackage#getGraphElement_Content()
	 * @model kind="reference"
	 * @generated
	 */

	ContentClass getContent();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.analyzer.graph.GraphElement#getContent <em>Content</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */

	void setContent(ContentClass value);





} // GraphElement
