/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package componentSampleAllocation.impl;

import componentSampleAllocation.ComponentSampleAllocationPackage;
import componentSampleAllocation.ComponentSampleRoot;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.composer.metamodel.allocation.base.File;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Sample Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link componentSampleAllocation.impl.ComponentSampleRootImpl#getOwnedFiles <em>Owned Files</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentSampleRootImpl extends EObjectImpl implements ComponentSampleRoot {
	/**
	 * The cached value of the '{@link #getOwnedFiles() <em>Owned Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> ownedFiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSampleRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentSampleAllocationPackage.Literals.COMPONENT_SAMPLE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getOwnedFiles() {
		if (ownedFiles == null) {
			ownedFiles = new EObjectContainmentEList<File>(File.class, this, ComponentSampleAllocationPackage.COMPONENT_SAMPLE_ROOT__OWNED_FILES);
		}
		return ownedFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentSampleAllocationPackage.COMPONENT_SAMPLE_ROOT__OWNED_FILES:
				return ((InternalEList<?>)getOwnedFiles()).basicRemove(otherEnd, msgs);
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
			case ComponentSampleAllocationPackage.COMPONENT_SAMPLE_ROOT__OWNED_FILES:
				return getOwnedFiles();
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
			case ComponentSampleAllocationPackage.COMPONENT_SAMPLE_ROOT__OWNED_FILES:
				getOwnedFiles().clear();
				getOwnedFiles().addAll((Collection<? extends File>)newValue);
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
			case ComponentSampleAllocationPackage.COMPONENT_SAMPLE_ROOT__OWNED_FILES:
				getOwnedFiles().clear();
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
			case ComponentSampleAllocationPackage.COMPONENT_SAMPLE_ROOT__OWNED_FILES:
				return ownedFiles != null && !ownedFiles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentSampleRootImpl
