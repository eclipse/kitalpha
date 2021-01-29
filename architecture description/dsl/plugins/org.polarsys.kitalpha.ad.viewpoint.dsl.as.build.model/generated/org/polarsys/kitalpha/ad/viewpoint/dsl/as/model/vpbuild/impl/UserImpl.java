/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Trigger;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.User;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.UserPermission;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.UserImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.UserImpl#getPermission <em>Permission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends EObjectImpl implements User {

	/**
	 * The default value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected String login = LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPermission() <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected static final UserPermission PERMISSION_EDEFAULT = UserPermission.READ;

	/**
	 * The cached value of the '{@link #getPermission() <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected UserPermission permission = PERMISSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpbuildPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getLogin() {

		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setLogin(String newLogin) {

		String oldLogin = login;
		login = newLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpbuildPackage.USER__LOGIN, oldLogin, login));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public UserPermission getPermission() {

		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setPermission(UserPermission newPermission) {

		UserPermission oldPermission = permission;
		permission = newPermission == null ? PERMISSION_EDEFAULT : newPermission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpbuildPackage.USER__PERMISSION, oldPermission,
					permission));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VpbuildPackage.USER__LOGIN:
			return getLogin();
		case VpbuildPackage.USER__PERMISSION:
			return getPermission();
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
		case VpbuildPackage.USER__LOGIN:
			setLogin((String) newValue);
			return;
		case VpbuildPackage.USER__PERMISSION:
			setPermission((UserPermission) newValue);
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
		case VpbuildPackage.USER__LOGIN:
			setLogin(LOGIN_EDEFAULT);
			return;
		case VpbuildPackage.USER__PERMISSION:
			setPermission(PERMISSION_EDEFAULT);
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
		case VpbuildPackage.USER__LOGIN:
			return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
		case VpbuildPackage.USER__PERMISSION:
			return permission != PERMISSION_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (login: "); //$NON-NLS-1$
		result.append(login);
		result.append(", permission: "); //$NON-NLS-1$
		result.append(permission);
		result.append(')');
		return result.toString();
	}

} //UserImpl
