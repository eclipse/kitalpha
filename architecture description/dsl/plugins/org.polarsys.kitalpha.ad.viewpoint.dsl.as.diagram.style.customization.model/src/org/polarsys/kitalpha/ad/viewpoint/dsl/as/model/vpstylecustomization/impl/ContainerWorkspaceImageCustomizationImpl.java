/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerWorkspaceImageCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Workspace Image Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ContainerWorkspaceImageCustomizationImpl#getWorkspacePath <em>Workspace Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerWorkspaceImageCustomizationImpl extends SpecificContainerStyleCustomizationImpl implements ContainerWorkspaceImageCustomization {

	/**
	 * The default value of the '{@link #getWorkspacePath() <em>Workspace Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkspacePath()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKSPACE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkspacePath() <em>Workspace Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkspacePath()
	 * @generated
	 * @ordered
	 */
	protected String workspacePath = WORKSPACE_PATH_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerWorkspaceImageCustomizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getWorkspacePath() {

		return workspacePath;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setWorkspacePath(String newWorkspacePath) {

		String oldWorkspacePath = workspacePath;
		workspacePath = newWorkspacePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION__WORKSPACE_PATH, oldWorkspacePath, workspacePath));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpstylecustomizationPackage.CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION__WORKSPACE_PATH:
				return getWorkspacePath();
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
			case VpstylecustomizationPackage.CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION__WORKSPACE_PATH:
				setWorkspacePath((String)newValue);
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
			case VpstylecustomizationPackage.CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION__WORKSPACE_PATH:
				setWorkspacePath(WORKSPACE_PATH_EDEFAULT);
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
			case VpstylecustomizationPackage.CONTAINER_WORKSPACE_IMAGE_CUSTOMIZATION__WORKSPACE_PATH:
				return WORKSPACE_PATH_EDEFAULT == null ? workspacePath != null : !WORKSPACE_PATH_EDEFAULT.equals(workspacePath);
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
		result.append(" (workspacePath: ");
		result.append(workspacePath);
		result.append(')');
		return result.toString();
	}


} //ContainerWorkspaceImageCustomizationImpl
