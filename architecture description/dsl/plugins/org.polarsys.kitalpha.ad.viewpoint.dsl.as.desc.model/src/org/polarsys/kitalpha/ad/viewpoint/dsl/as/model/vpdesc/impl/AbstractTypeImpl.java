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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointClassifier;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractTypeImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractTypeImpl extends EObjectImpl implements
		AbstractType {

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinalities CARDINALITY_EDEFAULT = Cardinalities.NOTHING_OR_ONE;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinalities cardinality = CARDINALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTypeImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdescPackage.Literals.ABSTRACT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Cardinalities getCardinality() {

		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setCardinality(Cardinalities newCardinality) {

		Cardinalities oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.ABSTRACT_TYPE__CARDINALITY, oldCardinality, cardinality));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public String getName() {
		if (this instanceof LocalType) {
			LocalType localType = (LocalType) this;
			ViewpointClassifier vpClassifier = localType.getType();
			if (vpClassifier != null
					&& (vpClassifier.getName() != null 
					&& vpClassifier.getName().trim().length() > 0))
				return vpClassifier.getName();
			
//			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class clazz = localType
//					.getType();
//			if (clazz != null
//					&& (clazz.getName() != null && clazz.getName().trim()
//							.length() > 0))
//				return clazz.getName();
		}

		if (this instanceof ExternalType) 
		{
			ExternalType externalType = (ExternalType) this;
			EClassifier clazz = externalType.getType();
			if (clazz != null && (clazz.getName() != null && clazz.getName().trim().length() > 0))
				return clazz.getName();
		}

		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject getConcretType() {
		if (this instanceof LocalType) {
			LocalType localType = (LocalType) this;
			ViewpointClassifier vpClassifier = localType.getType();
			if (vpClassifier != null
					&& (vpClassifier.getName() != null 
					&& vpClassifier.getName().trim().length() > 0))
				return vpClassifier;
		}

		if (this instanceof ExternalType) 
		{
			ExternalType externalType = (ExternalType) this;
			EClassifier clazz = externalType.getType();
			if (clazz != null && (clazz.getName() != null && clazz.getName().trim().length() > 0))
				return clazz;
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
			case VpdescPackage.ABSTRACT_TYPE__CARDINALITY:
				return getCardinality();
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
			case VpdescPackage.ABSTRACT_TYPE__CARDINALITY:
				setCardinality((Cardinalities)newValue);
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
			case VpdescPackage.ABSTRACT_TYPE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
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
			case VpdescPackage.ABSTRACT_TYPE__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(')');
		return result.toString();
	}

} //AbstractTypeImpl
