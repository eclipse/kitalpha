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
 
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.DataSource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIImpl#getUI_Containers <em>UI Containers</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIImpl#getUI_DataSource <em>UI Data Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIImpl extends DisplayableElementImpl implements UI {

	/**
	 * The cached value of the '{@link #getUI_Containers() <em>UI Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUI_Containers()
	 * @generated
	 * @ordered
	 */
	protected EList<UIContainer> uI_Containers;

	/**
	 * The cached value of the '{@link #getUI_DataSource() <em>UI Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUI_DataSource()
	 * @generated
	 * @ordered
	 */
	protected DataSource uI_DataSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpuiPackage.Literals.UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<UIContainer> getUI_Containers() {

		if (uI_Containers == null) {
			uI_Containers = new EObjectContainmentEList<UIContainer>(UIContainer.class, this, VpuiPackage.UI__UI_CONTAINERS);
		}
		return uI_Containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public DataSource getUI_DataSource() {

		return uI_DataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetUI_DataSource(DataSource newUI_DataSource,
			NotificationChain msgs) {

		DataSource oldUI_DataSource = uI_DataSource;
		uI_DataSource = newUI_DataSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpuiPackage.UI__UI_DATA_SOURCE, oldUI_DataSource, newUI_DataSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setUI_DataSource(DataSource newUI_DataSource) {

		if (newUI_DataSource != uI_DataSource) {
			NotificationChain msgs = null;
			if (uI_DataSource != null)
				msgs = ((InternalEObject)uI_DataSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpuiPackage.UI__UI_DATA_SOURCE, null, msgs);
			if (newUI_DataSource != null)
				msgs = ((InternalEObject)newUI_DataSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpuiPackage.UI__UI_DATA_SOURCE, null, msgs);
			msgs = basicSetUI_DataSource(newUI_DataSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpuiPackage.UI__UI_DATA_SOURCE, newUI_DataSource, newUI_DataSource));

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
			case VpuiPackage.UI__UI_CONTAINERS:
				return ((InternalEList<?>)getUI_Containers()).basicRemove(otherEnd, msgs);
			case VpuiPackage.UI__UI_DATA_SOURCE:
				return basicSetUI_DataSource(null, msgs);
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
			case VpuiPackage.UI__UI_CONTAINERS:
				return getUI_Containers();
			case VpuiPackage.UI__UI_DATA_SOURCE:
				return getUI_DataSource();
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
			case VpuiPackage.UI__UI_CONTAINERS:
				getUI_Containers().clear();
				getUI_Containers().addAll((Collection<? extends UIContainer>)newValue);
				return;
			case VpuiPackage.UI__UI_DATA_SOURCE:
				setUI_DataSource((DataSource)newValue);
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
			case VpuiPackage.UI__UI_CONTAINERS:
				getUI_Containers().clear();
				return;
			case VpuiPackage.UI__UI_DATA_SOURCE:
				setUI_DataSource((DataSource)null);
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
			case VpuiPackage.UI__UI_CONTAINERS:
				return uI_Containers != null && !uI_Containers.isEmpty();
			case VpuiPackage.UI__UI_DATA_SOURCE:
				return uI_DataSource != null;
		}
		return super.eIsSet(featureID);
	}

} //UIImpl
