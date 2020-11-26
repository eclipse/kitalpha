/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractNodeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.CustomizationExpression;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Node Style Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.AbstractNodeStyleCustomizationImpl#getTooltipExpression <em>Tooltip Expression</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.AbstractNodeStyleCustomizationImpl#getBorderSizeComputationExpression <em>Border Size Computation Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractNodeStyleCustomizationImpl extends AbstractCustomizationImpl implements AbstractNodeStyleCustomization {

	/**
	 * The cached value of the '{@link #getTooltipExpression() <em>Tooltip Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltipExpression()
	 * @generated
	 * @ordered
	 */
	protected CustomizationExpression tooltipExpression;




	/**
	 * The cached value of the '{@link #getBorderSizeComputationExpression() <em>Border Size Computation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderSizeComputationExpression()
	 * @generated
	 * @ordered
	 */
	protected CustomizationExpression borderSizeComputationExpression;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractNodeStyleCustomizationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.ABSTRACT_NODE_STYLE_CUSTOMIZATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CustomizationExpression getTooltipExpression() {

		return tooltipExpression;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetTooltipExpression(CustomizationExpression newTooltipExpression, NotificationChain msgs) {

		CustomizationExpression oldTooltipExpression = tooltipExpression;
		tooltipExpression = newTooltipExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION, oldTooltipExpression, newTooltipExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setTooltipExpression(CustomizationExpression newTooltipExpression) {

		if (newTooltipExpression != tooltipExpression) {
			NotificationChain msgs = null;
			if (tooltipExpression != null)
				msgs = ((InternalEObject)tooltipExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION, null, msgs);
			if (newTooltipExpression != null)
				msgs = ((InternalEObject)newTooltipExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION, null, msgs);
			msgs = basicSetTooltipExpression(newTooltipExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION, newTooltipExpression, newTooltipExpression));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CustomizationExpression getBorderSizeComputationExpression() {

		return borderSizeComputationExpression;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetBorderSizeComputationExpression(CustomizationExpression newBorderSizeComputationExpression, NotificationChain msgs) {

		CustomizationExpression oldBorderSizeComputationExpression = borderSizeComputationExpression;
		borderSizeComputationExpression = newBorderSizeComputationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION, oldBorderSizeComputationExpression, newBorderSizeComputationExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setBorderSizeComputationExpression(CustomizationExpression newBorderSizeComputationExpression) {

		if (newBorderSizeComputationExpression != borderSizeComputationExpression) {
			NotificationChain msgs = null;
			if (borderSizeComputationExpression != null)
				msgs = ((InternalEObject)borderSizeComputationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION, null, msgs);
			if (newBorderSizeComputationExpression != null)
				msgs = ((InternalEObject)newBorderSizeComputationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION, null, msgs);
			msgs = basicSetBorderSizeComputationExpression(newBorderSizeComputationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION, newBorderSizeComputationExpression, newBorderSizeComputationExpression));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION:
				return basicSetTooltipExpression(null, msgs);
			case VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION:
				return basicSetBorderSizeComputationExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION:
				return getTooltipExpression();
			case VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION:
				return getBorderSizeComputationExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION:
				setTooltipExpression((CustomizationExpression)newValue);
				return;
			case VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION:
				setBorderSizeComputationExpression((CustomizationExpression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION:
				setTooltipExpression((CustomizationExpression)null);
				return;
			case VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION:
				setBorderSizeComputationExpression((CustomizationExpression)null);
				return;
		}
		super.eUnset(featureID);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION:
				return tooltipExpression != null;
			case VpstylecustomizationPackage.ABSTRACT_NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION:
				return borderSizeComputationExpression != null;
		}
		return super.eIsSet(featureID);
	}



} //AbstractNodeStyleCustomizationImpl
