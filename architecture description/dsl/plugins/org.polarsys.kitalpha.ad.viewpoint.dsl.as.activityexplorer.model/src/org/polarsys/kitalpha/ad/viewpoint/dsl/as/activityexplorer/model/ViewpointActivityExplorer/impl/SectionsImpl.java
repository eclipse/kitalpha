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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Sections;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sections</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.SectionsImpl#getOwnedSectionsExtensions <em>Owned Sections Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionsImpl extends EObjectImpl implements Sections {

	/**
	 * The cached value of the '{@link #getOwnedSectionsExtensions() <em>Owned Sections Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSectionsExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<SectionExtension> ownedSectionsExtensions;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionsImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointActivityExplorerPackage.Literals.SECTIONS;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<SectionExtension> getOwnedSectionsExtensions() {

		if (ownedSectionsExtensions == null) {
			ownedSectionsExtensions = new EObjectContainmentEList<SectionExtension>(SectionExtension.class, this, ViewpointActivityExplorerPackage.SECTIONS__OWNED_SECTIONS_EXTENSIONS);
		}
		return ownedSectionsExtensions;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewpointActivityExplorerPackage.SECTIONS__OWNED_SECTIONS_EXTENSIONS:
				return ((InternalEList<?>)getOwnedSectionsExtensions()).basicRemove(otherEnd, msgs);
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
			case ViewpointActivityExplorerPackage.SECTIONS__OWNED_SECTIONS_EXTENSIONS:
				return getOwnedSectionsExtensions();
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
			case ViewpointActivityExplorerPackage.SECTIONS__OWNED_SECTIONS_EXTENSIONS:
				getOwnedSectionsExtensions().clear();
				getOwnedSectionsExtensions().addAll((Collection<? extends SectionExtension>)newValue);
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
			case ViewpointActivityExplorerPackage.SECTIONS__OWNED_SECTIONS_EXTENSIONS:
				getOwnedSectionsExtensions().clear();
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
			case ViewpointActivityExplorerPackage.SECTIONS__OWNED_SECTIONS_EXTENSIONS:
				return ownedSectionsExtensions != null && !ownedSectionsExtensions.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //SectionsImpl
