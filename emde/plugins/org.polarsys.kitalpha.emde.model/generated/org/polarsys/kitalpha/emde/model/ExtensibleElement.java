/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extensible Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.emde.model.ExtensibleElement#getOwnedExtensions <em>Owned Extensions</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.emde.model.EmdePackage#getExtensibleElement()
 * @model abstract="true"
 * @generated
 */
public interface ExtensibleElement extends Element {
  /**
   * Returns the value of the '<em><b>Owned Extensions</b></em>' containment reference list.
   * The list contents are of type {@link org.polarsys.kitalpha.emde.model.ElementExtension}.
  
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Extensions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Extensions</em>' containment reference list.
   * @see org.polarsys.kitalpha.emde.model.EmdePackage#getExtensibleElement_OwnedExtensions()
   * @model containment="true"
   * @generated
   */
  EList<ElementExtension> getOwnedExtensions();

} // ExtensibleElement
