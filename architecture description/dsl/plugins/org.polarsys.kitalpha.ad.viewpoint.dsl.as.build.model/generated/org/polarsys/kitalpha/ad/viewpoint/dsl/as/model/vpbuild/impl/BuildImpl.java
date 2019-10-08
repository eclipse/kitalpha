/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AspectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.BuildImpl#getTarget_platform <em>Target platform</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.BuildImpl#getMapped_repositories <em>Mapped repositories</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.BuildImpl#getHudsonDeployment <em>Hudson Deployment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildImpl extends AspectImpl implements Build {

	/**
	 * The default value of the '{@link #getTarget_platform() <em>Target platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_platform()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PLATFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget_platform() <em>Target platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_platform()
	 * @generated
	 * @ordered
	 */
	protected String target_platform = TARGET_PLATFORM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMapped_repositories() <em>Mapped repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapped_repositories()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> mapped_repositories;

	/**
	 * The cached value of the '{@link #getHudsonDeployment() <em>Hudson Deployment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHudsonDeployment()
	 * @generated
	 * @ordered
	 */
	protected HudsonDeployment hudsonDeployment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpbuildPackage.Literals.BUILD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getTarget_platform() {

		return target_platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setTarget_platform(String newTarget_platform) {

		String oldTarget_platform = target_platform;
		target_platform = newTarget_platform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpbuildPackage.BUILD__TARGET_PLATFORM,
					oldTarget_platform, target_platform));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Repository> getMapped_repositories() {

		if (mapped_repositories == null) {
			mapped_repositories = new EObjectContainmentEList<Repository>(Repository.class, this,
					VpbuildPackage.BUILD__MAPPED_REPOSITORIES);
		}
		return mapped_repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public HudsonDeployment getHudsonDeployment() {

		return hudsonDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetHudsonDeployment(HudsonDeployment newHudsonDeployment, NotificationChain msgs) {

		HudsonDeployment oldHudsonDeployment = hudsonDeployment;
		hudsonDeployment = newHudsonDeployment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					VpbuildPackage.BUILD__HUDSON_DEPLOYMENT, oldHudsonDeployment, newHudsonDeployment);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setHudsonDeployment(HudsonDeployment newHudsonDeployment) {

		if (newHudsonDeployment != hudsonDeployment) {
			NotificationChain msgs = null;
			if (hudsonDeployment != null)
				msgs = ((InternalEObject) hudsonDeployment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - VpbuildPackage.BUILD__HUDSON_DEPLOYMENT, null, msgs);
			if (newHudsonDeployment != null)
				msgs = ((InternalEObject) newHudsonDeployment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - VpbuildPackage.BUILD__HUDSON_DEPLOYMENT, null, msgs);
			msgs = basicSetHudsonDeployment(newHudsonDeployment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpbuildPackage.BUILD__HUDSON_DEPLOYMENT,
					newHudsonDeployment, newHudsonDeployment));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VpbuildPackage.BUILD__MAPPED_REPOSITORIES:
			return ((InternalEList<?>) getMapped_repositories()).basicRemove(otherEnd, msgs);
		case VpbuildPackage.BUILD__HUDSON_DEPLOYMENT:
			return basicSetHudsonDeployment(null, msgs);
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
		case VpbuildPackage.BUILD__TARGET_PLATFORM:
			return getTarget_platform();
		case VpbuildPackage.BUILD__MAPPED_REPOSITORIES:
			return getMapped_repositories();
		case VpbuildPackage.BUILD__HUDSON_DEPLOYMENT:
			return getHudsonDeployment();
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
		case VpbuildPackage.BUILD__TARGET_PLATFORM:
			setTarget_platform((String) newValue);
			return;
		case VpbuildPackage.BUILD__MAPPED_REPOSITORIES:
			getMapped_repositories().clear();
			getMapped_repositories().addAll((Collection<? extends Repository>) newValue);
			return;
		case VpbuildPackage.BUILD__HUDSON_DEPLOYMENT:
			setHudsonDeployment((HudsonDeployment) newValue);
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
		case VpbuildPackage.BUILD__TARGET_PLATFORM:
			setTarget_platform(TARGET_PLATFORM_EDEFAULT);
			return;
		case VpbuildPackage.BUILD__MAPPED_REPOSITORIES:
			getMapped_repositories().clear();
			return;
		case VpbuildPackage.BUILD__HUDSON_DEPLOYMENT:
			setHudsonDeployment((HudsonDeployment) null);
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
		case VpbuildPackage.BUILD__TARGET_PLATFORM:
			return TARGET_PLATFORM_EDEFAULT == null ? target_platform != null
					: !TARGET_PLATFORM_EDEFAULT.equals(target_platform);
		case VpbuildPackage.BUILD__MAPPED_REPOSITORIES:
			return mapped_repositories != null && !mapped_repositories.isEmpty();
		case VpbuildPackage.BUILD__HUDSON_DEPLOYMENT:
			return hudsonDeployment != null;
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
		result.append(" (target_platform: "); //$NON-NLS-1$
		result.append(target_platform);
		result.append(')');
		return result.toString();
	}

} //BuildImpl
