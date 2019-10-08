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

import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.Customizations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension#getExtented_diagram <em>Extented diagram</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension#getOwnedCustomizations <em>Owned Customizations</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getDiagramExtension()
 * @model
 * @generated
 */
public interface DiagramExtension extends DiagramRepresentation {

	/**
	 * Returns the value of the '<em><b>Extented diagram</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extented diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extented diagram</em>' reference.
	 * @see #setExtented_diagram(DiagramDescription)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getDiagramExtension_Extented_diagram()
	 * @model required="true"
	 * @generated
	 */

	DiagramDescription getExtented_diagram();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension#getExtented_diagram <em>Extented diagram</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extented diagram</em>' reference.
	 * @see #getExtented_diagram()
	 * @generated
	 */

	void setExtented_diagram(DiagramDescription value);

	/**
	 * Returns the value of the '<em><b>Owned Customizations</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Customizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Customizations</em>' containment reference.
	 * @see #setOwnedCustomizations(Customizations)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getDiagramExtension_OwnedCustomizations()
	 * @model containment="true"
	 * @generated
	 */

	Customizations getOwnedCustomizations();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension#getOwnedCustomizations <em>Owned Customizations</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Customizations</em>' containment reference.
	 * @see #getOwnedCustomizations()
	 * @generated
	 */

	void setOwnedCustomizations(Customizations value);

} // DiagramExtension
