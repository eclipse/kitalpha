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
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram;

import org.eclipse.sirius.diagram.LabelPosition;
import org.eclipse.sirius.viewpoint.LabelAlignment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription#getStyle <em>Style</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription#getLabel_position <em>Label position</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription#getLabel_alignement <em>Label alignement</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getNodeDescription()
 * @model
 * @generated
 */
public interface NodeDescription extends AbstractDescription {

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(AbstractNodeStyle)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getNodeDescription_Style()
	 * @model containment="true"
	 * @generated
	 */

	AbstractNodeStyle getStyle();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription#getStyle <em>Style</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */

	void setStyle(AbstractNodeStyle value);

	/**
	 * Returns the value of the '<em><b>Label position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.diagram.LabelPosition}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label position</em>' attribute.
	 * @see org.eclipse.sirius.diagram.LabelPosition
	 * @see #setLabel_position(LabelPosition)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getNodeDescription_Label_position()
	 * @model
	 * @generated
	 */

	LabelPosition getLabel_position();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription#getLabel_position <em>Label position</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label position</em>' attribute.
	 * @see org.eclipse.sirius.diagram.LabelPosition
	 * @see #getLabel_position()
	 * @generated
	 */

	void setLabel_position(LabelPosition value);

	/**
	 * Returns the value of the '<em><b>Label alignement</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.viewpoint.LabelAlignment}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label alignement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label alignement</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.LabelAlignment
	 * @see #setLabel_alignement(LabelAlignment)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getNodeDescription_Label_alignement()
	 * @model
	 * @generated
	 */

	LabelAlignment getLabel_alignement();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription#getLabel_alignement <em>Label alignement</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label alignement</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.LabelAlignment
	 * @see #getLabel_alignement()
	 * @generated
	 */

	void setLabel_alignement(LabelAlignment value);

} // NodeDescription
