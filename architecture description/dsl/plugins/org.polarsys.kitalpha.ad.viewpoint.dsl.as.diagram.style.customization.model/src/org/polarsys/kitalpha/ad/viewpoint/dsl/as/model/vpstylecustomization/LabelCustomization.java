/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization;

import org.eclipse.emf.common.util.EList;

import org.eclipse.sirius.viewpoint.FontFormat;

import org.eclipse.sirius.viewpoint.description.SystemColors;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Customization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getColor <em>Color</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getOwnedLabelAlignment <em>Owned Label Alignment</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getAppliedOn <em>Applied On</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getSize <em>Size</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getFormat <em>Format</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#isShowIcon <em>Show Icon</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getIconPath <em>Icon Path</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getLabelCustomization()
 * @model
 * @generated
 */

public interface LabelCustomization extends AbstractCustomization {





	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.viewpoint.description.SystemColors}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #setColor(SystemColors)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getLabelCustomization_Color()
	 * @model
	 * @generated
	 */

	SystemColors getColor();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getColor <em>Color</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #getColor()
	 * @generated
	 */

	void setColor(SystemColors value);




	/**
	 * Returns the value of the '<em><b>Owned Label Alignment</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Label Alignment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Label Alignment</em>' containment reference.
	 * @see #setOwnedLabelAlignment(LabelAlignmentCustomization)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getLabelCustomization_OwnedLabelAlignment()
	 * @model containment="true"
	 * @generated
	 */

	LabelAlignmentCustomization getOwnedLabelAlignment();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getOwnedLabelAlignment <em>Owned Label Alignment</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Label Alignment</em>' containment reference.
	 * @see #getOwnedLabelAlignment()
	 * @generated
	 */

	void setOwnedLabelAlignment(LabelAlignmentCustomization value);







	/**
	 * Returns the value of the '<em><b>Applied On</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied On</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getLabelCustomization_AppliedOn()
	 * @model
	 * @generated
	 */

	EList<BasicLabelStyleDescription> getAppliedOn();







	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getLabelCustomization_Size()
	 * @model
	 * @generated
	 */

	int getSize();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getSize <em>Size</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */

	void setSize(int value);







	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.viewpoint.FontFormat}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.FontFormat
	 * @see #setFormat(FontFormat)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getLabelCustomization_Format()
	 * @model
	 * @generated
	 */

	FontFormat getFormat();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getFormat <em>Format</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.FontFormat
	 * @see #getFormat()
	 * @generated
	 */

	void setFormat(FontFormat value);







	/**
	 * Returns the value of the '<em><b>Show Icon</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Icon</em>' attribute.
	 * @see #setShowIcon(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getLabelCustomization_ShowIcon()
	 * @model
	 * @generated
	 */

	boolean isShowIcon();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#isShowIcon <em>Show Icon</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Icon</em>' attribute.
	 * @see #isShowIcon()
	 * @generated
	 */

	void setShowIcon(boolean value);







	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(CustomizationExpression)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getLabelCustomization_Expression()
	 * @model containment="true"
	 * @generated
	 */

	CustomizationExpression getExpression();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getExpression <em>Expression</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */

	void setExpression(CustomizationExpression value);




	/**
	 * Returns the value of the '<em><b>Icon Path</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Path</em>' attribute.
	 * @see #setIconPath(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getLabelCustomization_IconPath()
	 * @model
	 * @generated
	 */

	String getIconPath();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization#getIconPath <em>Icon Path</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Path</em>' attribute.
	 * @see #getIconPath()
	 * @generated
	 */

	void setIconPath(String value);





} // LabelCustomization
