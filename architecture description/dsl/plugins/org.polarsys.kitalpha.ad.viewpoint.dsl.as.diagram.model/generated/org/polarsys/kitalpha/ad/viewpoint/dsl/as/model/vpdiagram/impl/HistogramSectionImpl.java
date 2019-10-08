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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.sirius.viewpoint.description.SystemColors;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ForeignExpressionElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Histogram Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.HistogramSectionImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.HistogramSectionImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.HistogramSectionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.HistogramSectionImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.HistogramSectionImpl#getForgroundColor <em>Forground Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistogramSectionImpl extends EObjectImpl implements
		HistogramSection {

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected ForeignExpressionElement minValue;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected ForeignExpressionElement maxValue;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ForeignExpressionElement value;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final SystemColors BACKGROUND_COLOR_EDEFAULT = SystemColors.BLACK_LITERAL;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected SystemColors backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getForgroundColor() <em>Forground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final SystemColors FORGROUND_COLOR_EDEFAULT = SystemColors.BLACK_LITERAL;

	/**
	 * The cached value of the '{@link #getForgroundColor() <em>Forground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForgroundColor()
	 * @generated
	 * @ordered
	 */
	protected SystemColors forgroundColor = FORGROUND_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistogramSectionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.HISTOGRAM_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ForeignExpressionElement getMinValue() {

		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetMinValue(
			ForeignExpressionElement newMinValue, NotificationChain msgs) {

		ForeignExpressionElement oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.HISTOGRAM_SECTION__MIN_VALUE, oldMinValue, newMinValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMinValue(ForeignExpressionElement newMinValue) {

		if (newMinValue != minValue) {
			NotificationChain msgs = null;
			if (minValue != null)
				msgs = ((InternalEObject)minValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.HISTOGRAM_SECTION__MIN_VALUE, null, msgs);
			if (newMinValue != null)
				msgs = ((InternalEObject)newMinValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.HISTOGRAM_SECTION__MIN_VALUE, null, msgs);
			msgs = basicSetMinValue(newMinValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.HISTOGRAM_SECTION__MIN_VALUE, newMinValue, newMinValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ForeignExpressionElement getMaxValue() {

		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetMaxValue(
			ForeignExpressionElement newMaxValue, NotificationChain msgs) {

		ForeignExpressionElement oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.HISTOGRAM_SECTION__MAX_VALUE, oldMaxValue, newMaxValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMaxValue(ForeignExpressionElement newMaxValue) {

		if (newMaxValue != maxValue) {
			NotificationChain msgs = null;
			if (maxValue != null)
				msgs = ((InternalEObject)maxValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.HISTOGRAM_SECTION__MAX_VALUE, null, msgs);
			if (newMaxValue != null)
				msgs = ((InternalEObject)newMaxValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.HISTOGRAM_SECTION__MAX_VALUE, null, msgs);
			msgs = basicSetMaxValue(newMaxValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.HISTOGRAM_SECTION__MAX_VALUE, newMaxValue, newMaxValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ForeignExpressionElement getValue() {

		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetValue(ForeignExpressionElement newValue,
			NotificationChain msgs) {

		ForeignExpressionElement oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.HISTOGRAM_SECTION__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setValue(ForeignExpressionElement newValue) {

		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.HISTOGRAM_SECTION__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.HISTOGRAM_SECTION__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.HISTOGRAM_SECTION__VALUE, newValue, newValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public SystemColors getBackgroundColor() {

		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setBackgroundColor(SystemColors newBackgroundColor) {

		SystemColors oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor == null ? BACKGROUND_COLOR_EDEFAULT : newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.HISTOGRAM_SECTION__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public SystemColors getForgroundColor() {

		return forgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setForgroundColor(SystemColors newForgroundColor) {

		SystemColors oldForgroundColor = forgroundColor;
		forgroundColor = newForgroundColor == null ? FORGROUND_COLOR_EDEFAULT : newForgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.HISTOGRAM_SECTION__FORGROUND_COLOR, oldForgroundColor, forgroundColor));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpdiagramPackage.HISTOGRAM_SECTION__MIN_VALUE:
				return basicSetMinValue(null, msgs);
			case VpdiagramPackage.HISTOGRAM_SECTION__MAX_VALUE:
				return basicSetMaxValue(null, msgs);
			case VpdiagramPackage.HISTOGRAM_SECTION__VALUE:
				return basicSetValue(null, msgs);
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
			case VpdiagramPackage.HISTOGRAM_SECTION__MIN_VALUE:
				return getMinValue();
			case VpdiagramPackage.HISTOGRAM_SECTION__MAX_VALUE:
				return getMaxValue();
			case VpdiagramPackage.HISTOGRAM_SECTION__VALUE:
				return getValue();
			case VpdiagramPackage.HISTOGRAM_SECTION__BACKGROUND_COLOR:
				return getBackgroundColor();
			case VpdiagramPackage.HISTOGRAM_SECTION__FORGROUND_COLOR:
				return getForgroundColor();
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
			case VpdiagramPackage.HISTOGRAM_SECTION__MIN_VALUE:
				setMinValue((ForeignExpressionElement)newValue);
				return;
			case VpdiagramPackage.HISTOGRAM_SECTION__MAX_VALUE:
				setMaxValue((ForeignExpressionElement)newValue);
				return;
			case VpdiagramPackage.HISTOGRAM_SECTION__VALUE:
				setValue((ForeignExpressionElement)newValue);
				return;
			case VpdiagramPackage.HISTOGRAM_SECTION__BACKGROUND_COLOR:
				setBackgroundColor((SystemColors)newValue);
				return;
			case VpdiagramPackage.HISTOGRAM_SECTION__FORGROUND_COLOR:
				setForgroundColor((SystemColors)newValue);
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
			case VpdiagramPackage.HISTOGRAM_SECTION__MIN_VALUE:
				setMinValue((ForeignExpressionElement)null);
				return;
			case VpdiagramPackage.HISTOGRAM_SECTION__MAX_VALUE:
				setMaxValue((ForeignExpressionElement)null);
				return;
			case VpdiagramPackage.HISTOGRAM_SECTION__VALUE:
				setValue((ForeignExpressionElement)null);
				return;
			case VpdiagramPackage.HISTOGRAM_SECTION__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case VpdiagramPackage.HISTOGRAM_SECTION__FORGROUND_COLOR:
				setForgroundColor(FORGROUND_COLOR_EDEFAULT);
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
			case VpdiagramPackage.HISTOGRAM_SECTION__MIN_VALUE:
				return minValue != null;
			case VpdiagramPackage.HISTOGRAM_SECTION__MAX_VALUE:
				return maxValue != null;
			case VpdiagramPackage.HISTOGRAM_SECTION__VALUE:
				return value != null;
			case VpdiagramPackage.HISTOGRAM_SECTION__BACKGROUND_COLOR:
				return backgroundColor != BACKGROUND_COLOR_EDEFAULT;
			case VpdiagramPackage.HISTOGRAM_SECTION__FORGROUND_COLOR:
				return forgroundColor != FORGROUND_COLOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (backgroundColor: ");
		result.append(backgroundColor);
		result.append(", forgroundColor: ");
		result.append(forgroundColor);
		result.append(')');
		return result.toString();
	}

} //HistogramSectionImpl
