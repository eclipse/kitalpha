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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.viewpoint.description.SystemColors;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ForeignExpressionElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Histogram Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getForgroundColor <em>Forground Color</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getHistogramSection()
 * @model
 * @generated
 */
public interface HistogramSection extends EObject {

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' containment reference.
	 * @see #setMinValue(ForeignExpressionElement)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getHistogramSection_MinValue()
	 * @model containment="true"
	 * @generated
	 */

	ForeignExpressionElement getMinValue();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getMinValue <em>Min Value</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' containment reference.
	 * @see #getMinValue()
	 * @generated
	 */

	void setMinValue(ForeignExpressionElement value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' containment reference.
	 * @see #setMaxValue(ForeignExpressionElement)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getHistogramSection_MaxValue()
	 * @model containment="true"
	 * @generated
	 */

	ForeignExpressionElement getMaxValue();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getMaxValue <em>Max Value</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' containment reference.
	 * @see #getMaxValue()
	 * @generated
	 */

	void setMaxValue(ForeignExpressionElement value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ForeignExpressionElement)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getHistogramSection_Value()
	 * @model containment="true"
	 * @generated
	 */

	ForeignExpressionElement getValue();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getValue <em>Value</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */

	void setValue(ForeignExpressionElement value);

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.viewpoint.description.SystemColors}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #setBackgroundColor(SystemColors)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getHistogramSection_BackgroundColor()
	 * @model
	 * @generated
	 */

	SystemColors getBackgroundColor();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getBackgroundColor <em>Background Color</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #getBackgroundColor()
	 * @generated
	 */

	void setBackgroundColor(SystemColors value);

	/**
	 * Returns the value of the '<em><b>Forground Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.viewpoint.description.SystemColors}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forground Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forground Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #setForgroundColor(SystemColors)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getHistogramSection_ForgroundColor()
	 * @model
	 * @generated
	 */

	SystemColors getForgroundColor();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getForgroundColor <em>Forground Color</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forground Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #getForgroundColor()
	 * @generated
	 */

	void setForgroundColor(SystemColors value);

} // HistogramSection
