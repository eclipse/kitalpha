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

import org.eclipse.sirius.diagram.LabelPosition;
import org.eclipse.sirius.diagram.ResizeKind;

import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Style Customization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getAppliedOn <em>Applied On</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getOwnedSpecificNodeStyleCustomization <em>Owned Specific Node Style Customization</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getSizeComputationExpression <em>Size Computation Expression</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getLabelPosition <em>Label Position</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#isHideLabelByDefault <em>Hide Label By Default</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getResizeKind <em>Resize Kind</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getNodeStyleCustomization()
 * @model
 * @generated
 */

public interface NodeStyleCustomization extends AbstractNodeStyleCustomization {





	/**
	 * Returns the value of the '<em><b>Applied On</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.diagram.description.style.NodeStyleDescription}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied On</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getNodeStyleCustomization_AppliedOn()
	 * @model
	 * @generated
	 */

	EList<NodeStyleDescription> getAppliedOn();







	/**
	 * Returns the value of the '<em><b>Owned Specific Node Style Customization</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificNodeStyleCustomization}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Specific Node Style Customization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Specific Node Style Customization</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getNodeStyleCustomization_OwnedSpecificNodeStyleCustomization()
	 * @model containment="true"
	 * @generated
	 */

	EList<SpecificNodeStyleCustomization> getOwnedSpecificNodeStyleCustomization();







	/**
	 * Returns the value of the '<em><b>Size Computation Expression</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Computation Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Computation Expression</em>' containment reference.
	 * @see #setSizeComputationExpression(CustomizationExpression)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getNodeStyleCustomization_SizeComputationExpression()
	 * @model containment="true"
	 * @generated
	 */

	CustomizationExpression getSizeComputationExpression();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getSizeComputationExpression <em>Size Computation Expression</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Computation Expression</em>' containment reference.
	 * @see #getSizeComputationExpression()
	 * @generated
	 */

	void setSizeComputationExpression(CustomizationExpression value);







	/**
	 * Returns the value of the '<em><b>Label Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.diagram.LabelPosition}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Position</em>' attribute.
	 * @see org.eclipse.sirius.diagram.LabelPosition
	 * @see #setLabelPosition(LabelPosition)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getNodeStyleCustomization_LabelPosition()
	 * @model
	 * @generated
	 */

	LabelPosition getLabelPosition();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getLabelPosition <em>Label Position</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Position</em>' attribute.
	 * @see org.eclipse.sirius.diagram.LabelPosition
	 * @see #getLabelPosition()
	 * @generated
	 */

	void setLabelPosition(LabelPosition value);







	/**
	 * Returns the value of the '<em><b>Hide Label By Default</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide Label By Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide Label By Default</em>' attribute.
	 * @see #setHideLabelByDefault(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getNodeStyleCustomization_HideLabelByDefault()
	 * @model
	 * @generated
	 */

	boolean isHideLabelByDefault();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#isHideLabelByDefault <em>Hide Label By Default</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide Label By Default</em>' attribute.
	 * @see #isHideLabelByDefault()
	 * @generated
	 */

	void setHideLabelByDefault(boolean value);







	/**
	 * Returns the value of the '<em><b>Resize Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.diagram.ResizeKind}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resize Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resize Kind</em>' attribute.
	 * @see org.eclipse.sirius.diagram.ResizeKind
	 * @see #setResizeKind(ResizeKind)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getNodeStyleCustomization_ResizeKind()
	 * @model
	 * @generated
	 */

	ResizeKind getResizeKind();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization#getResizeKind <em>Resize Kind</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resize Kind</em>' attribute.
	 * @see org.eclipse.sirius.diagram.ResizeKind
	 * @see #getResizeKind()
	 * @generated
	 */

	void setResizeKind(ResizeKind value);





} // NodeStyleCustomization
