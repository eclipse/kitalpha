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

package org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Aspect;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Configuration;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Viewpoints;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Framework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ArchitectureFrameworkImpl#getAf_aspects <em>Af aspects</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ArchitectureFrameworkImpl#getAf_viewpoints <em>Af viewpoints</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ArchitectureFrameworkImpl#getOwned_configuration <em>Owned configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureFrameworkImpl extends NamedElementImpl implements
		ArchitectureFramework {

	/**
	 * The cached value of the '{@link #getAf_aspects() <em>Af aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAf_aspects()
	 * @generated
	 * @ordered
	 */
	protected EList<Aspect> af_aspects;

	/**
	 * The cached value of the '{@link #getAf_viewpoints() <em>Af viewpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAf_viewpoints()
	 * @generated
	 * @ordered
	 */
	protected Viewpoints af_viewpoints;

	/**
	 * The cached value of the '{@link #getOwned_configuration() <em>Owned configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwned_configuration()
	 * @generated
	 * @ordered
	 */
	protected Configuration owned_configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureFrameworkImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfdescPackage.Literals.ARCHITECTURE_FRAMEWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Aspect> getAf_aspects() {

		if (af_aspects == null) {
			af_aspects = new EObjectContainmentEList<Aspect>(Aspect.class, this, AfdescPackage.ARCHITECTURE_FRAMEWORK__AF_ASPECTS);
		}
		return af_aspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Viewpoints getAf_viewpoints() {

		return af_viewpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetAf_viewpoints(Viewpoints newAf_viewpoints,
			NotificationChain msgs) {

		Viewpoints oldAf_viewpoints = af_viewpoints;
		af_viewpoints = newAf_viewpoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AfdescPackage.ARCHITECTURE_FRAMEWORK__AF_VIEWPOINTS, oldAf_viewpoints, newAf_viewpoints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setAf_viewpoints(Viewpoints newAf_viewpoints) {

		if (newAf_viewpoints != af_viewpoints) {
			NotificationChain msgs = null;
			if (af_viewpoints != null)
				msgs = ((InternalEObject)af_viewpoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AfdescPackage.ARCHITECTURE_FRAMEWORK__AF_VIEWPOINTS, null, msgs);
			if (newAf_viewpoints != null)
				msgs = ((InternalEObject)newAf_viewpoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AfdescPackage.ARCHITECTURE_FRAMEWORK__AF_VIEWPOINTS, null, msgs);
			msgs = basicSetAf_viewpoints(newAf_viewpoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfdescPackage.ARCHITECTURE_FRAMEWORK__AF_VIEWPOINTS, newAf_viewpoints, newAf_viewpoints));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Configuration getOwned_configuration() {

		return owned_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwned_configuration(
			Configuration newOwned_configuration, NotificationChain msgs) {

		Configuration oldOwned_configuration = owned_configuration;
		owned_configuration = newOwned_configuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AfdescPackage.ARCHITECTURE_FRAMEWORK__OWNED_CONFIGURATION, oldOwned_configuration, newOwned_configuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOwned_configuration(Configuration newOwned_configuration) {

		if (newOwned_configuration != owned_configuration) {
			NotificationChain msgs = null;
			if (owned_configuration != null)
				msgs = ((InternalEObject)owned_configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AfdescPackage.ARCHITECTURE_FRAMEWORK__OWNED_CONFIGURATION, null, msgs);
			if (newOwned_configuration != null)
				msgs = ((InternalEObject)newOwned_configuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AfdescPackage.ARCHITECTURE_FRAMEWORK__OWNED_CONFIGURATION, null, msgs);
			msgs = basicSetOwned_configuration(newOwned_configuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfdescPackage.ARCHITECTURE_FRAMEWORK__OWNED_CONFIGURATION, newOwned_configuration, newOwned_configuration));

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
			case AfdescPackage.ARCHITECTURE_FRAMEWORK__AF_ASPECTS:
				return ((InternalEList<?>)getAf_aspects()).basicRemove(otherEnd, msgs);
			case AfdescPackage.ARCHITECTURE_FRAMEWORK__AF_VIEWPOINTS:
				return basicSetAf_viewpoints(null, msgs);
			case AfdescPackage.ARCHITECTURE_FRAMEWORK__OWNED_CONFIGURATION:
				return basicSetOwned_configuration(null, msgs);
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
			case AfdescPackage.ARCHITECTURE_FRAMEWORK__AF_ASPECTS:
				return getAf_aspects();
			case AfdescPackage.ARCHITECTURE_FRAMEWORK__AF_VIEWPOINTS:
				return getAf_viewpoints();
			case AfdescPackage.ARCHITECTURE_FRAMEWORK__OWNED_CONFIGURATION:
				return getOwned_configuration();
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
			case AfdescPackage.ARCHITECTURE_FRAMEWORK__AF_ASPECTS:
				getAf_aspects().clear();
				getAf_aspects().addAll((Collection<? extends Aspect>)newValue);
				return;
			case AfdescPackage.ARCHITECTURE_FRAMEWORK__AF_VIEWPOINTS:
				setAf_viewpoints((Viewpoints)newValue);
				return;
			case AfdescPackage.ARCHITECTURE_FRAMEWORK__OWNED_CONFIGURATION:
				setOwned_configuration((Configuration)newValue);
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
			case AfdescPackage.ARCHITECTURE_FRAMEWORK__AF_ASPECTS:
				getAf_aspects().clear();
				return;
			case AfdescPackage.ARCHITECTURE_FRAMEWORK__AF_VIEWPOINTS:
				setAf_viewpoints((Viewpoints)null);
				return;
			case AfdescPackage.ARCHITECTURE_FRAMEWORK__OWNED_CONFIGURATION:
				setOwned_configuration((Configuration)null);
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
			case AfdescPackage.ARCHITECTURE_FRAMEWORK__AF_ASPECTS:
				return af_aspects != null && !af_aspects.isEmpty();
			case AfdescPackage.ARCHITECTURE_FRAMEWORK__AF_VIEWPOINTS:
				return af_viewpoints != null;
			case AfdescPackage.ARCHITECTURE_FRAMEWORK__OWNED_CONFIGURATION:
				return owned_configuration != null;
		}
		return super.eIsSet(featureID);
	}

} //ArchitectureFrameworkImpl
