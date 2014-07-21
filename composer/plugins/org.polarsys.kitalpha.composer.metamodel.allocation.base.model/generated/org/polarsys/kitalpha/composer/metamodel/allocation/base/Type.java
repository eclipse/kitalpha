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


package org.polarsys.kitalpha.composer.metamodel.allocation.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.composer.metamodel.allocation.base.Type#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.composer.metamodel.allocation.base.BasePackage#getType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Type extends EObject {





	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Element</em>' reference.
	 * @see #setReferencedElement(EObject)
	 * @see org.polarsys.kitalpha.composer.metamodel.allocation.base.BasePackage#getType_ReferencedElement()
	 * @model required="true"
	 * @generated
	 */

	EObject getReferencedElement();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.composer.metamodel.allocation.base.Type#getReferencedElement <em>Referenced Element</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Element</em>' reference.
	 * @see #getReferencedElement()
	 * @generated
	 */

	void setReferencedElement(EObject value);





} // Type
