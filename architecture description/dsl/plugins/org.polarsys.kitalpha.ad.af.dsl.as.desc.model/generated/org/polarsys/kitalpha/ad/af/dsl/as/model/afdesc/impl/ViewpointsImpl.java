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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Viewpoints;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewpoints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ViewpointsImpl#getOwned_viewpoints <em>Owned viewpoints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewpointsImpl extends EObjectImpl implements Viewpoints {

	/**
	 * The cached value of the '{@link #getOwned_viewpoints() <em>Owned viewpoints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwned_viewpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Viewpoint> owned_viewpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewpointsImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfdescPackage.Literals.VIEWPOINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Viewpoint> getOwned_viewpoints() {

		if (owned_viewpoints == null) {
			owned_viewpoints = new EObjectResolvingEList<Viewpoint>(Viewpoint.class, this, AfdescPackage.VIEWPOINTS__OWNED_VIEWPOINTS);
		}
		return owned_viewpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfdescPackage.VIEWPOINTS__OWNED_VIEWPOINTS:
				return getOwned_viewpoints();
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
			case AfdescPackage.VIEWPOINTS__OWNED_VIEWPOINTS:
				getOwned_viewpoints().clear();
				getOwned_viewpoints().addAll((Collection<? extends Viewpoint>)newValue);
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
			case AfdescPackage.VIEWPOINTS__OWNED_VIEWPOINTS:
				getOwned_viewpoints().clear();
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
			case AfdescPackage.VIEWPOINTS__OWNED_VIEWPOINTS:
				return owned_viewpoints != null && !owned_viewpoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewpointsImpl
