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

package org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.PropertySet;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.PropertySetImpl#getHiddenProperties <em>Hidden Properties</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.PropertySetImpl#getNewProperties <em>New Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertySetImpl extends ElementSetImpl implements PropertySet {

	/**
	 * The cached value of the '{@link #getHiddenProperties() <em>Hidden Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> hiddenProperties;




	/**
	 * The cached value of the '{@link #getNewProperties() <em>New Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> newProperties;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertySetImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointPackage.Literals.PROPERTY_SET;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Property> getHiddenProperties() {

		if (hiddenProperties == null) {
			hiddenProperties = new EObjectResolvingEList<Property>(Property.class, this, ViewpointPackage.PROPERTY_SET__HIDDEN_PROPERTIES);
		}
		return hiddenProperties;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Property> getNewProperties() {

		if (newProperties == null) {
			newProperties = new EObjectContainmentEList<Property>(Property.class, this, ViewpointPackage.PROPERTY_SET__NEW_PROPERTIES);
		}
		return newProperties;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewpointPackage.PROPERTY_SET__NEW_PROPERTIES:
				return ((InternalEList<?>)getNewProperties()).basicRemove(otherEnd, msgs);
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
			case ViewpointPackage.PROPERTY_SET__HIDDEN_PROPERTIES:
				return getHiddenProperties();
			case ViewpointPackage.PROPERTY_SET__NEW_PROPERTIES:
				return getNewProperties();
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
			case ViewpointPackage.PROPERTY_SET__HIDDEN_PROPERTIES:
				getHiddenProperties().clear();
				getHiddenProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case ViewpointPackage.PROPERTY_SET__NEW_PROPERTIES:
				getNewProperties().clear();
				getNewProperties().addAll((Collection<? extends Property>)newValue);
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
			case ViewpointPackage.PROPERTY_SET__HIDDEN_PROPERTIES:
				getHiddenProperties().clear();
				return;
			case ViewpointPackage.PROPERTY_SET__NEW_PROPERTIES:
				getNewProperties().clear();
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
			case ViewpointPackage.PROPERTY_SET__HIDDEN_PROPERTIES:
				return hiddenProperties != null && !hiddenProperties.isEmpty();
			case ViewpointPackage.PROPERTY_SET__NEW_PROPERTIES:
				return newProperties != null && !newProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //PropertySetImpl
