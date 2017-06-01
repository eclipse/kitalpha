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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIContainerImpl#getUI_fields <em>UI fields</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.impl.UIContainerImpl#getSubContainers <em>Sub Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIContainerImpl extends DisplayableElementImpl implements
		UIContainer {

	/**
	 * The cached value of the '{@link #getUI_fields() <em>UI fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUI_fields()
	 * @generated
	 * @ordered
	 */
	protected EList<UIField> uI_fields;

	/**
	 * The cached value of the '{@link #getSubContainers() <em>Sub Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<UIContainer> subContainers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIContainerImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpuiPackage.Literals.UI_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<UIField> getUI_fields() {

		if (uI_fields == null) {
			uI_fields = new EObjectContainmentEList<UIField>(UIField.class, this, VpuiPackage.UI_CONTAINER__UI_FIELDS);
		}
		return uI_fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<UIContainer> getSubContainers() {

		if (subContainers == null) {
			subContainers = new EObjectContainmentEList<UIContainer>(UIContainer.class, this, VpuiPackage.UI_CONTAINER__SUB_CONTAINERS);
		}
		return subContainers;
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
			case VpuiPackage.UI_CONTAINER__UI_FIELDS:
				return ((InternalEList<?>)getUI_fields()).basicRemove(otherEnd, msgs);
			case VpuiPackage.UI_CONTAINER__SUB_CONTAINERS:
				return ((InternalEList<?>)getSubContainers()).basicRemove(otherEnd, msgs);
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
			case VpuiPackage.UI_CONTAINER__UI_FIELDS:
				return getUI_fields();
			case VpuiPackage.UI_CONTAINER__SUB_CONTAINERS:
				return getSubContainers();
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
			case VpuiPackage.UI_CONTAINER__UI_FIELDS:
				getUI_fields().clear();
				getUI_fields().addAll((Collection<? extends UIField>)newValue);
				return;
			case VpuiPackage.UI_CONTAINER__SUB_CONTAINERS:
				getSubContainers().clear();
				getSubContainers().addAll((Collection<? extends UIContainer>)newValue);
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
			case VpuiPackage.UI_CONTAINER__UI_FIELDS:
				getUI_fields().clear();
				return;
			case VpuiPackage.UI_CONTAINER__SUB_CONTAINERS:
				getSubContainers().clear();
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
			case VpuiPackage.UI_CONTAINER__UI_FIELDS:
				return uI_fields != null && !uI_fields.isEmpty();
			case VpuiPackage.UI_CONTAINER__SUB_CONTAINERS:
				return subContainers != null && !subContainers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UIContainerImpl
