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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractClass;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Domain Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeDomainElementImpl#getDomain_Class <em>Domain Class</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeDomainElementImpl#getChlidren_list <em>Chlidren list</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeDomainElementImpl#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeDomainElementImpl extends EObjectImpl implements
		NodeDomainElement {

	/**
	 * The cached value of the '{@link #getDomain_Class() <em>Domain Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain_Class()
	 * @generated
	 * @ordered
	 */
	protected AbstractClass domain_Class;

	/**
	 * The cached value of the '{@link #getChlidren_list() <em>Chlidren list</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChlidren_list()
	 * @generated
	 * @ordered
	 */
	protected AbstractAssociation chlidren_list;

	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeDomainElementImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.NODE_DOMAIN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractClass getDomain_Class() {

		return domain_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetDomain_Class(
			AbstractClass newDomain_Class, NotificationChain msgs) {

		AbstractClass oldDomain_Class = domain_Class;
		domain_Class = newDomain_Class;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.NODE_DOMAIN_ELEMENT__DOMAIN_CLASS, oldDomain_Class, newDomain_Class);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setDomain_Class(AbstractClass newDomain_Class) {

		if (newDomain_Class != domain_Class) {
			NotificationChain msgs = null;
			if (domain_Class != null)
				msgs = ((InternalEObject)domain_Class).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.NODE_DOMAIN_ELEMENT__DOMAIN_CLASS, null, msgs);
			if (newDomain_Class != null)
				msgs = ((InternalEObject)newDomain_Class).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.NODE_DOMAIN_ELEMENT__DOMAIN_CLASS, null, msgs);
			msgs = basicSetDomain_Class(newDomain_Class, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.NODE_DOMAIN_ELEMENT__DOMAIN_CLASS, newDomain_Class, newDomain_Class));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractAssociation getChlidren_list() {

		return chlidren_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetChlidren_list(
			AbstractAssociation newChlidren_list, NotificationChain msgs) {

		AbstractAssociation oldChlidren_list = chlidren_list;
		chlidren_list = newChlidren_list;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.NODE_DOMAIN_ELEMENT__CHLIDREN_LIST, oldChlidren_list, newChlidren_list);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setChlidren_list(AbstractAssociation newChlidren_list) {

		if (newChlidren_list != chlidren_list) {
			NotificationChain msgs = null;
			if (chlidren_list != null)
				msgs = ((InternalEObject)chlidren_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.NODE_DOMAIN_ELEMENT__CHLIDREN_LIST, null, msgs);
			if (newChlidren_list != null)
				msgs = ((InternalEObject)newChlidren_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.NODE_DOMAIN_ELEMENT__CHLIDREN_LIST, null, msgs);
			msgs = basicSetChlidren_list(newChlidren_list, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.NODE_DOMAIN_ELEMENT__CHLIDREN_LIST, newChlidren_list, newChlidren_list));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getQuery() {

		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setQuery(String newQuery) {

		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.NODE_DOMAIN_ELEMENT__QUERY, oldQuery, query));

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
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT__DOMAIN_CLASS:
				return basicSetDomain_Class(null, msgs);
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT__CHLIDREN_LIST:
				return basicSetChlidren_list(null, msgs);
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
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT__DOMAIN_CLASS:
				return getDomain_Class();
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT__CHLIDREN_LIST:
				return getChlidren_list();
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT__QUERY:
				return getQuery();
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
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT__DOMAIN_CLASS:
				setDomain_Class((AbstractClass)newValue);
				return;
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT__CHLIDREN_LIST:
				setChlidren_list((AbstractAssociation)newValue);
				return;
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT__QUERY:
				setQuery((String)newValue);
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
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT__DOMAIN_CLASS:
				setDomain_Class((AbstractClass)null);
				return;
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT__CHLIDREN_LIST:
				setChlidren_list((AbstractAssociation)null);
				return;
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT__QUERY:
				setQuery(QUERY_EDEFAULT);
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
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT__DOMAIN_CLASS:
				return domain_Class != null;
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT__CHLIDREN_LIST:
				return chlidren_list != null;
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
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
		result.append(" (query: ");
		result.append(query);
		result.append(')');
		return result.toString();
	}

} //NodeDomainElementImpl
