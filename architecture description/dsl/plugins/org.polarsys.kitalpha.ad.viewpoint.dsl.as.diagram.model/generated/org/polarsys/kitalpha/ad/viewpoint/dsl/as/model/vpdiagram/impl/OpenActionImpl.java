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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.NamedElementImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.OpenAction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.OpenActionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.OpenActionImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.OpenActionImpl#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenActionImpl extends NamedElementImpl implements OpenAction {

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected String precondition = PRECONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenActionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.OPEN_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getLabel() {

		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setLabel(String newLabel) {

		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.OPEN_ACTION__LABEL, oldLabel, label));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getPrecondition() {

		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setPrecondition(String newPrecondition) {

		String oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.OPEN_ACTION__PRECONDITION, oldPrecondition, precondition));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getIcon() {

		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIcon(String newIcon) {

		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.OPEN_ACTION__ICON, oldIcon, icon));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpdiagramPackage.OPEN_ACTION__LABEL:
				return getLabel();
			case VpdiagramPackage.OPEN_ACTION__PRECONDITION:
				return getPrecondition();
			case VpdiagramPackage.OPEN_ACTION__ICON:
				return getIcon();
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
			case VpdiagramPackage.OPEN_ACTION__LABEL:
				setLabel((String)newValue);
				return;
			case VpdiagramPackage.OPEN_ACTION__PRECONDITION:
				setPrecondition((String)newValue);
				return;
			case VpdiagramPackage.OPEN_ACTION__ICON:
				setIcon((String)newValue);
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
			case VpdiagramPackage.OPEN_ACTION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case VpdiagramPackage.OPEN_ACTION__PRECONDITION:
				setPrecondition(PRECONDITION_EDEFAULT);
				return;
			case VpdiagramPackage.OPEN_ACTION__ICON:
				setIcon(ICON_EDEFAULT);
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
			case VpdiagramPackage.OPEN_ACTION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case VpdiagramPackage.OPEN_ACTION__PRECONDITION:
				return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
			case VpdiagramPackage.OPEN_ACTION__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", precondition: ");
		result.append(precondition);
		result.append(", icon: ");
		result.append(icon);
		result.append(')');
		return result.toString();
	}

} //OpenActionImpl
