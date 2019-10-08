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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAssociation;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Domain Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDomainAssociationImpl#getTarget_Locator <em>Target Locator</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDomainAssociationImpl#getTarget_query <em>Target query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeDomainAssociationImpl extends EObjectImpl implements
		EdgeDomainAssociation {

	/**
	 * The cached value of the '{@link #getTarget_Locator() <em>Target Locator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_Locator()
	 * @generated
	 * @ordered
	 */
	protected AbstractAssociation target_Locator;

	/**
	 * The default value of the '{@link #getTarget_query() <em>Target query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_query()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget_query() <em>Target query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_query()
	 * @generated
	 * @ordered
	 */
	protected String target_query = TARGET_QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeDomainAssociationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.EDGE_DOMAIN_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractAssociation getTarget_Locator() {

		return target_Locator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetTarget_Locator(
			AbstractAssociation newTarget_Locator, NotificationChain msgs) {

		AbstractAssociation oldTarget_Locator = target_Locator;
		target_Locator = newTarget_Locator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION__TARGET_LOCATOR, oldTarget_Locator, newTarget_Locator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setTarget_Locator(AbstractAssociation newTarget_Locator) {

		if (newTarget_Locator != target_Locator) {
			NotificationChain msgs = null;
			if (target_Locator != null)
				msgs = ((InternalEObject)target_Locator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION__TARGET_LOCATOR, null, msgs);
			if (newTarget_Locator != null)
				msgs = ((InternalEObject)newTarget_Locator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION__TARGET_LOCATOR, null, msgs);
			msgs = basicSetTarget_Locator(newTarget_Locator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION__TARGET_LOCATOR, newTarget_Locator, newTarget_Locator));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getTarget_query() {

		return target_query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setTarget_query(String newTarget_query) {

		String oldTarget_query = target_query;
		target_query = newTarget_query;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION__TARGET_QUERY, oldTarget_query, target_query));

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
			case VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION__TARGET_LOCATOR:
				return basicSetTarget_Locator(null, msgs);
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
			case VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION__TARGET_LOCATOR:
				return getTarget_Locator();
			case VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION__TARGET_QUERY:
				return getTarget_query();
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
			case VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION__TARGET_LOCATOR:
				setTarget_Locator((AbstractAssociation)newValue);
				return;
			case VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION__TARGET_QUERY:
				setTarget_query((String)newValue);
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
			case VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION__TARGET_LOCATOR:
				setTarget_Locator((AbstractAssociation)null);
				return;
			case VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION__TARGET_QUERY:
				setTarget_query(TARGET_QUERY_EDEFAULT);
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
			case VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION__TARGET_LOCATOR:
				return target_Locator != null;
			case VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION__TARGET_QUERY:
				return TARGET_QUERY_EDEFAULT == null ? target_query != null : !TARGET_QUERY_EDEFAULT.equals(target_query);
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
		result.append(" (target_query: ");
		result.append(target_query);
		result.append(')');
		return result.toString();
	}

} //EdgeDomainAssociationImpl
