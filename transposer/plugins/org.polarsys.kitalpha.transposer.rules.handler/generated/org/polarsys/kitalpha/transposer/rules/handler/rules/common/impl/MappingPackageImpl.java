/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPackageImpl#getOwnedPackages <em>Owned Packages</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPackageImpl#getOwnedMappingElements <em>Owned Mapping Elements</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPackageImpl#getAllMappingElements <em>All Mapping Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingPackageImpl extends EObjectImpl implements MappingPackage {

	/**
	 * The cached value of the '{@link #getOwnedPackages() <em>Owned Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingPackage> ownedPackages;


  

	/**
	 * The cached value of the '{@link #getOwnedMappingElements() <em>Owned Mapping Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMappingElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingElement> ownedMappingElements;


  

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;


  


  
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingPackageImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.MAPPING_PACKAGE;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<MappingPackage> getOwnedPackages() {

		if (ownedPackages == null) {
			ownedPackages = new EObjectContainmentEList<MappingPackage>(MappingPackage.class, this, CommonPackage.MAPPING_PACKAGE__OWNED_PACKAGES);
		}
		return ownedPackages;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<MappingElement> getOwnedMappingElements() {

		if (ownedMappingElements == null) {
			ownedMappingElements = new EObjectContainmentEList<MappingElement>(MappingElement.class, this, CommonPackage.MAPPING_PACKAGE__OWNED_MAPPING_ELEMENTS);
		}
		return ownedMappingElements;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getName() {

		return name;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setName(String newName) {

		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING_PACKAGE__NAME, oldName, name));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<MappingElement> getAllMappingElements() {


		// TODO: implement this method to return the 'All Mapping Elements' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.MAPPING_PACKAGE__OWNED_PACKAGES:
				return ((InternalEList<?>)getOwnedPackages()).basicRemove(otherEnd, msgs);
			case CommonPackage.MAPPING_PACKAGE__OWNED_MAPPING_ELEMENTS:
				return ((InternalEList<?>)getOwnedMappingElements()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.MAPPING_PACKAGE__OWNED_PACKAGES:
				return getOwnedPackages();
			case CommonPackage.MAPPING_PACKAGE__OWNED_MAPPING_ELEMENTS:
				return getOwnedMappingElements();
			case CommonPackage.MAPPING_PACKAGE__NAME:
				return getName();
			case CommonPackage.MAPPING_PACKAGE__ALL_MAPPING_ELEMENTS:
				return getAllMappingElements();
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
			case CommonPackage.MAPPING_PACKAGE__OWNED_PACKAGES:
				getOwnedPackages().clear();
				getOwnedPackages().addAll((Collection<? extends MappingPackage>)newValue);
				return;
			case CommonPackage.MAPPING_PACKAGE__OWNED_MAPPING_ELEMENTS:
				getOwnedMappingElements().clear();
				getOwnedMappingElements().addAll((Collection<? extends MappingElement>)newValue);
				return;
			case CommonPackage.MAPPING_PACKAGE__NAME:
				setName((String)newValue);
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
			case CommonPackage.MAPPING_PACKAGE__OWNED_PACKAGES:
				getOwnedPackages().clear();
				return;
			case CommonPackage.MAPPING_PACKAGE__OWNED_MAPPING_ELEMENTS:
				getOwnedMappingElements().clear();
				return;
			case CommonPackage.MAPPING_PACKAGE__NAME:
				setName(NAME_EDEFAULT);
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
			case CommonPackage.MAPPING_PACKAGE__OWNED_PACKAGES:
				return ownedPackages != null && !ownedPackages.isEmpty();
			case CommonPackage.MAPPING_PACKAGE__OWNED_MAPPING_ELEMENTS:
				return ownedMappingElements != null && !ownedMappingElements.isEmpty();
			case CommonPackage.MAPPING_PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CommonPackage.MAPPING_PACKAGE__ALL_MAPPING_ELEMENTS:
				return !getAllMappingElements().isEmpty();
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}


} //MappingPackageImpl
