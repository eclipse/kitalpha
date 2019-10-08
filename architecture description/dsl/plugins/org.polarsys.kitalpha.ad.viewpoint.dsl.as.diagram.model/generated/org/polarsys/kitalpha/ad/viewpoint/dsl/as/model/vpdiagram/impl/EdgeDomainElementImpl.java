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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractClass;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Domain Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDomainElementImpl#getSource_Locator <em>Source Locator</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDomainElementImpl#getThe_Domain <em>The Domain</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDomainElementImpl#getSource_query <em>Source query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeDomainElementImpl extends EdgeDomainAssociationImpl implements
		EdgeDomainElement {

	/**
	 * The cached value of the '{@link #getSource_Locator() <em>Source Locator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_Locator()
	 * @generated
	 * @ordered
	 */
	protected AbstractAssociation source_Locator;

	/**
	 * The cached value of the '{@link #getThe_Domain() <em>The Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThe_Domain()
	 * @generated
	 * @ordered
	 */
	protected AbstractClass the_Domain;

	/**
	 * The default value of the '{@link #getSource_query() <em>Source query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_query()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource_query() <em>Source query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_query()
	 * @generated
	 * @ordered
	 */
	protected String source_query = SOURCE_QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeDomainElementImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.EDGE_DOMAIN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractAssociation getSource_Locator() {

		return source_Locator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetSource_Locator(
			AbstractAssociation newSource_Locator, NotificationChain msgs) {

		AbstractAssociation oldSource_Locator = source_Locator;
		source_Locator = newSource_Locator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DOMAIN_ELEMENT__SOURCE_LOCATOR, oldSource_Locator, newSource_Locator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setSource_Locator(AbstractAssociation newSource_Locator) {

		if (newSource_Locator != source_Locator) {
			NotificationChain msgs = null;
			if (source_Locator != null)
				msgs = ((InternalEObject)source_Locator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.EDGE_DOMAIN_ELEMENT__SOURCE_LOCATOR, null, msgs);
			if (newSource_Locator != null)
				msgs = ((InternalEObject)newSource_Locator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.EDGE_DOMAIN_ELEMENT__SOURCE_LOCATOR, null, msgs);
			msgs = basicSetSource_Locator(newSource_Locator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DOMAIN_ELEMENT__SOURCE_LOCATOR, newSource_Locator, newSource_Locator));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractClass getThe_Domain() {

		return the_Domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetThe_Domain(AbstractClass newThe_Domain,
			NotificationChain msgs) {

		AbstractClass oldThe_Domain = the_Domain;
		the_Domain = newThe_Domain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DOMAIN_ELEMENT__THE_DOMAIN, oldThe_Domain, newThe_Domain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setThe_Domain(AbstractClass newThe_Domain) {

		if (newThe_Domain != the_Domain) {
			NotificationChain msgs = null;
			if (the_Domain != null)
				msgs = ((InternalEObject)the_Domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.EDGE_DOMAIN_ELEMENT__THE_DOMAIN, null, msgs);
			if (newThe_Domain != null)
				msgs = ((InternalEObject)newThe_Domain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.EDGE_DOMAIN_ELEMENT__THE_DOMAIN, null, msgs);
			msgs = basicSetThe_Domain(newThe_Domain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DOMAIN_ELEMENT__THE_DOMAIN, newThe_Domain, newThe_Domain));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getSource_query() {

		return source_query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setSource_query(String newSource_query) {

		String oldSource_query = source_query;
		source_query = newSource_query;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DOMAIN_ELEMENT__SOURCE_QUERY, oldSource_query, source_query));

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
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT__SOURCE_LOCATOR:
				return basicSetSource_Locator(null, msgs);
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT__THE_DOMAIN:
				return basicSetThe_Domain(null, msgs);
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
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT__SOURCE_LOCATOR:
				return getSource_Locator();
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT__THE_DOMAIN:
				return getThe_Domain();
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT__SOURCE_QUERY:
				return getSource_query();
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
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT__SOURCE_LOCATOR:
				setSource_Locator((AbstractAssociation)newValue);
				return;
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT__THE_DOMAIN:
				setThe_Domain((AbstractClass)newValue);
				return;
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT__SOURCE_QUERY:
				setSource_query((String)newValue);
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
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT__SOURCE_LOCATOR:
				setSource_Locator((AbstractAssociation)null);
				return;
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT__THE_DOMAIN:
				setThe_Domain((AbstractClass)null);
				return;
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT__SOURCE_QUERY:
				setSource_query(SOURCE_QUERY_EDEFAULT);
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
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT__SOURCE_LOCATOR:
				return source_Locator != null;
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT__THE_DOMAIN:
				return the_Domain != null;
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT__SOURCE_QUERY:
				return SOURCE_QUERY_EDEFAULT == null ? source_query != null : !SOURCE_QUERY_EDEFAULT.equals(source_query);
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
		result.append(" (source_query: ");
		result.append(source_query);
		result.append(')');
		return result.toString();
	}

} //EdgeDomainElementImpl
