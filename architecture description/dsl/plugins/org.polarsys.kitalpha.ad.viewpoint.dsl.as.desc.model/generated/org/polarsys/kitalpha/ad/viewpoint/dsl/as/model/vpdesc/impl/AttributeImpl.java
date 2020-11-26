/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Value;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AttributeImpl#isIsId <em>Is Id</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AttributeImpl#getOwned_values <em>Owned values</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AttributeImpl#getOwned_type <em>Owned type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends AbstractFeatureImpl implements Attribute {

	/**
	 * The default value of the '{@link #isIsId() <em>Is Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsId()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsId() <em>Is Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsId()
	 * @generated
	 * @ordered
	 */
	protected boolean isId = IS_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwned_values() <em>Owned values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwned_values()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> owned_values;

	/**
	 * The cached value of the '{@link #getOwned_type() <em>Owned type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwned_type()
	 * @generated
	 * @ordered
	 */
	protected AbstractAttributeType owned_type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdescPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isIsId() {

		return isId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIsId(boolean newIsId) {

		boolean oldIsId = isId;
		isId = newIsId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.ATTRIBUTE__IS_ID, oldIsId, isId));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Value> getOwned_values() {

		if (owned_values == null) {
			owned_values = new EObjectContainmentEList<Value>(Value.class, this, VpdescPackage.ATTRIBUTE__OWNED_VALUES);
		}
		return owned_values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractAttributeType getOwned_type() {

		return owned_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwned_type(AbstractAttributeType newOwned_type, NotificationChain msgs) {

		AbstractAttributeType oldOwned_type = owned_type;
		owned_type = newOwned_type;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdescPackage.ATTRIBUTE__OWNED_TYPE, oldOwned_type, newOwned_type);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOwned_type(AbstractAttributeType newOwned_type) {

		if (newOwned_type != owned_type) {
			NotificationChain msgs = null;
			if (owned_type != null)
				msgs = ((InternalEObject)owned_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdescPackage.ATTRIBUTE__OWNED_TYPE, null, msgs);
			if (newOwned_type != null)
				msgs = ((InternalEObject)newOwned_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdescPackage.ATTRIBUTE__OWNED_TYPE, null, msgs);
			msgs = basicSetOwned_type(newOwned_type, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.ATTRIBUTE__OWNED_TYPE, newOwned_type, newOwned_type));

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
			case VpdescPackage.ATTRIBUTE__OWNED_VALUES:
				return ((InternalEList<?>)getOwned_values()).basicRemove(otherEnd, msgs);
			case VpdescPackage.ATTRIBUTE__OWNED_TYPE:
				return basicSetOwned_type(null, msgs);
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
			case VpdescPackage.ATTRIBUTE__IS_ID:
				return isIsId();
			case VpdescPackage.ATTRIBUTE__OWNED_VALUES:
				return getOwned_values();
			case VpdescPackage.ATTRIBUTE__OWNED_TYPE:
				return getOwned_type();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VpdescPackage.ATTRIBUTE__IS_ID:
				setIsId((Boolean)newValue);
				return;
			case VpdescPackage.ATTRIBUTE__OWNED_VALUES:
				getOwned_values().clear();
				getOwned_values().addAll((Collection<? extends Value>)newValue);
				return;
			case VpdescPackage.ATTRIBUTE__OWNED_TYPE:
				setOwned_type((AbstractAttributeType)newValue);
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
			case VpdescPackage.ATTRIBUTE__IS_ID:
				setIsId(IS_ID_EDEFAULT);
				return;
			case VpdescPackage.ATTRIBUTE__OWNED_VALUES:
				getOwned_values().clear();
				return;
			case VpdescPackage.ATTRIBUTE__OWNED_TYPE:
				setOwned_type((AbstractAttributeType)null);
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
			case VpdescPackage.ATTRIBUTE__IS_ID:
				return isId != IS_ID_EDEFAULT;
			case VpdescPackage.ATTRIBUTE__OWNED_VALUES:
				return owned_values != null && !owned_values.isEmpty();
			case VpdescPackage.ATTRIBUTE__OWNED_TYPE:
				return owned_type != null;
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
		result.append(" (isId: ");
		result.append(isId);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
