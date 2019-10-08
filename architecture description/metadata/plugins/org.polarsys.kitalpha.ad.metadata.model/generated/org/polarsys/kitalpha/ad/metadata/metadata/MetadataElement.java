/**
 * ******************************************************************************
 *  Copyright (c) 2016-2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *  Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 * *******************************************************************************
 * 
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.metadata.metadata;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.MetadataElement#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage#getMetadataElement()
 * @model abstract="true"
 * @generated
 */

public interface MetadataElement extends EObject {





	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage#getMetadataElement_Id()
	 * @model id="true" required="true"
	 * @generated
	 */

	String getId();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.metadata.metadata.MetadataElement#getId <em>Id</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */

	void setId(String value);





} // MetadataElement
