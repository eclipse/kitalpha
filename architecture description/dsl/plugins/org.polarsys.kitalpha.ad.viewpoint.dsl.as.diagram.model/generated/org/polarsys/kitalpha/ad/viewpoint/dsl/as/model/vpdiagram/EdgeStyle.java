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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.EdgeArrows;
import org.eclipse.sirius.diagram.LineStyle;
import org.eclipse.sirius.viewpoint.description.SystemColors;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle#getBeginDecorator <em>Begin Decorator</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle#getEndDecorator <em>End Decorator</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getEdgeStyle()
 * @model
 * @generated
 */
public interface EdgeStyle extends EObject {

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.diagram.LineStyle}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' attribute.
	 * @see org.eclipse.sirius.diagram.LineStyle
	 * @see #setLineStyle(LineStyle)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getEdgeStyle_LineStyle()
	 * @model
	 * @generated
	 */

	LineStyle getLineStyle();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle#getLineStyle <em>Line Style</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' attribute.
	 * @see org.eclipse.sirius.diagram.LineStyle
	 * @see #getLineStyle()
	 * @generated
	 */

	void setLineStyle(LineStyle value);

	/**
	 * Returns the value of the '<em><b>Begin Decorator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.diagram.EdgeArrows}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin Decorator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Decorator</em>' attribute.
	 * @see org.eclipse.sirius.diagram.EdgeArrows
	 * @see #setBeginDecorator(EdgeArrows)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getEdgeStyle_BeginDecorator()
	 * @model
	 * @generated
	 */

	EdgeArrows getBeginDecorator();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle#getBeginDecorator <em>Begin Decorator</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Decorator</em>' attribute.
	 * @see org.eclipse.sirius.diagram.EdgeArrows
	 * @see #getBeginDecorator()
	 * @generated
	 */

	void setBeginDecorator(EdgeArrows value);

	/**
	 * Returns the value of the '<em><b>End Decorator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.diagram.EdgeArrows}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Decorator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Decorator</em>' attribute.
	 * @see org.eclipse.sirius.diagram.EdgeArrows
	 * @see #setEndDecorator(EdgeArrows)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getEdgeStyle_EndDecorator()
	 * @model
	 * @generated
	 */

	EdgeArrows getEndDecorator();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle#getEndDecorator <em>End Decorator</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Decorator</em>' attribute.
	 * @see org.eclipse.sirius.diagram.EdgeArrows
	 * @see #getEndDecorator()
	 * @generated
	 */

	void setEndDecorator(EdgeArrows value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.viewpoint.description.SystemColors}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #setColor(SystemColors)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getEdgeStyle_Color()
	 * @model
	 * @generated
	 */

	SystemColors getColor();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle#getColor <em>Color</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #getColor()
	 * @generated
	 */

	void setColor(SystemColors value);

} // EdgeStyle
