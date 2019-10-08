/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramElement#getSynchronizationMode <em>Synchronization Mode</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElement extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Synchronization Mode</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.SynchronizationMode}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronization Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronization Mode</em>' attribute.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.SynchronizationMode
	 * @see #setSynchronizationMode(SynchronizationMode)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getDiagramElement_SynchronizationMode()
	 * @model default=""
	 * @generated
	 */

	SynchronizationMode getSynchronizationMode();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramElement#getSynchronizationMode <em>Synchronization Mode</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronization Mode</em>' attribute.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.SynchronizationMode
	 * @see #getSynchronizationMode()
	 * @generated
	 */

	void setSynchronizationMode(SynchronizationMode value);

} // DiagramElement
