/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.af.coredomain.af.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.kitalpha.ad.af.coredomain.af.model.AF;
import org.polarsys.kitalpha.ad.af.coredomain.af.model.AfPackage;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.NameElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.af.coredomain.af.model.impl.AFImpl#getViewpoints <em>Viewpoints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AFImpl extends NameElementImpl implements AF {

	/**
	 * The cached value of the '{@link #getViewpoints() <em>Viewpoints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Viewpoint> viewpoints;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AFImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfPackage.Literals.AF;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Viewpoint> getViewpoints() {

		if (viewpoints == null) {
			viewpoints = new EObjectResolvingEList<Viewpoint>(Viewpoint.class, this, AfPackage.AF__VIEWPOINTS);
		}
		return viewpoints;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public Viewpoint getViewpoint(String id) {
		for (Viewpoint vp : getViewpoints()) {
			if (id.equals(vp.getId()))
				return vp;
		}
		return null;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfPackage.AF__VIEWPOINTS:
				return getViewpoints();
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
			case AfPackage.AF__VIEWPOINTS:
				getViewpoints().clear();
				getViewpoints().addAll((Collection<? extends Viewpoint>)newValue);
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
			case AfPackage.AF__VIEWPOINTS:
				getViewpoints().clear();
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
			case AfPackage.AF__VIEWPOINTS:
				return viewpoints != null && !viewpoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //AFImpl
