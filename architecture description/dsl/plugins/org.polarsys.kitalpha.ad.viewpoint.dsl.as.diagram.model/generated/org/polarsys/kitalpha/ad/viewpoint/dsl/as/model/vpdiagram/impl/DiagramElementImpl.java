/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
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
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.NamedElementImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.SynchronizationMode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramElementImpl#getSynchronizationMode <em>Synchronization Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiagramElementImpl extends NamedElementImpl implements
		DiagramElement {
	/**
	 * The default value of the '{@link #getSynchronizationMode() <em>Synchronization Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizationMode()
	 * @generated
	 * @ordered
	 */
	protected static final SynchronizationMode SYNCHRONIZATION_MODE_EDEFAULT = SynchronizationMode.DEFAULT;
	/**
	 * The cached value of the '{@link #getSynchronizationMode() <em>Synchronization Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizationMode()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationMode synchronizationMode = SYNCHRONIZATION_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramElementImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.DIAGRAM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public SynchronizationMode getSynchronizationMode() {

		return synchronizationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setSynchronizationMode(SynchronizationMode newSynchronizationMode) {

		SynchronizationMode oldSynchronizationMode = synchronizationMode;
		synchronizationMode = newSynchronizationMode == null ? SYNCHRONIZATION_MODE_EDEFAULT : newSynchronizationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.DIAGRAM_ELEMENT__SYNCHRONIZATION_MODE, oldSynchronizationMode, synchronizationMode));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpdiagramPackage.DIAGRAM_ELEMENT__SYNCHRONIZATION_MODE:
				return getSynchronizationMode();
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
			case VpdiagramPackage.DIAGRAM_ELEMENT__SYNCHRONIZATION_MODE:
				setSynchronizationMode((SynchronizationMode)newValue);
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
			case VpdiagramPackage.DIAGRAM_ELEMENT__SYNCHRONIZATION_MODE:
				setSynchronizationMode(SYNCHRONIZATION_MODE_EDEFAULT);
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
			case VpdiagramPackage.DIAGRAM_ELEMENT__SYNCHRONIZATION_MODE:
				return synchronizationMode != SYNCHRONIZATION_MODE_EDEFAULT;
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
		result.append(" (synchronizationMode: ");
		result.append(synchronizationMode);
		result.append(')');
		return result.toString();
	}

} //DiagramElementImpl
