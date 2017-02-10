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

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractFeatureImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractFeatureImpl#isChangeable <em>Changeable</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractFeatureImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractFeatureImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractFeatureImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractFeatureImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractFeatureImpl#isUnsettable <em>Unsettable</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractFeatureImpl#isVolatile <em>Volatile</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractFeatureImpl extends AnnotatableElementImpl
		implements AbstractFeature {
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
	 * The default value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGEABLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeable()
	 * @generated
	 * @ordered
	 */
	protected boolean changeable = CHANGEABLE_EDEFAULT;
	/**
	 * The default value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERIVED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean derived = DERIVED_EDEFAULT;
	/**
	 * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean ordered = ORDERED_EDEFAULT;
	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;
	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;
	/**
	 * The default value of the '{@link #isUnsettable() <em>Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsettable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNSETTABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isUnsettable() <em>Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsettable()
	 * @generated
	 * @ordered
	 */
	protected boolean unsettable = UNSETTABLE_EDEFAULT;
	/**
	 * The default value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOLATILE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean volatile_ = VOLATILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFeatureImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdescPackage.Literals.ABSTRACT_FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.ABSTRACT_FEATURE__CARDINALITY, oldCardinality, cardinality));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isChangeable() {

		return changeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setChangeable(boolean newChangeable) {

		boolean oldChangeable = changeable;
		changeable = newChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.ABSTRACT_FEATURE__CHANGEABLE, oldChangeable, changeable));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isDerived() {

		return derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setDerived(boolean newDerived) {

		boolean oldDerived = derived;
		derived = newDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.ABSTRACT_FEATURE__DERIVED, oldDerived, derived));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isOrdered() {

		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOrdered(boolean newOrdered) {

		boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.ABSTRACT_FEATURE__ORDERED, oldOrdered, ordered));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isTransient() {

		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setTransient(boolean newTransient) {

		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.ABSTRACT_FEATURE__TRANSIENT, oldTransient, transient_));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isUnique() {

		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setUnique(boolean newUnique) {

		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.ABSTRACT_FEATURE__UNIQUE, oldUnique, unique));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isUnsettable() {

		return unsettable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setUnsettable(boolean newUnsettable) {

		boolean oldUnsettable = unsettable;
		unsettable = newUnsettable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.ABSTRACT_FEATURE__UNSETTABLE, oldUnsettable, unsettable));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isVolatile() {

		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setVolatile(boolean newVolatile) {

		boolean oldVolatile = volatile_;
		volatile_ = newVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.ABSTRACT_FEATURE__VOLATILE, oldVolatile, volatile_));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpdescPackage.ABSTRACT_FEATURE__CARDINALITY:
				return getCardinality();
			case VpdescPackage.ABSTRACT_FEATURE__CHANGEABLE:
				return isChangeable();
			case VpdescPackage.ABSTRACT_FEATURE__DERIVED:
				return isDerived();
			case VpdescPackage.ABSTRACT_FEATURE__ORDERED:
				return isOrdered();
			case VpdescPackage.ABSTRACT_FEATURE__TRANSIENT:
				return isTransient();
			case VpdescPackage.ABSTRACT_FEATURE__UNIQUE:
				return isUnique();
			case VpdescPackage.ABSTRACT_FEATURE__UNSETTABLE:
				return isUnsettable();
			case VpdescPackage.ABSTRACT_FEATURE__VOLATILE:
				return isVolatile();
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
			case VpdescPackage.ABSTRACT_FEATURE__CARDINALITY:
				setCardinality((Cardinalities)newValue);
				return;
			case VpdescPackage.ABSTRACT_FEATURE__CHANGEABLE:
				setChangeable((Boolean)newValue);
				return;
			case VpdescPackage.ABSTRACT_FEATURE__DERIVED:
				setDerived((Boolean)newValue);
				return;
			case VpdescPackage.ABSTRACT_FEATURE__ORDERED:
				setOrdered((Boolean)newValue);
				return;
			case VpdescPackage.ABSTRACT_FEATURE__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case VpdescPackage.ABSTRACT_FEATURE__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case VpdescPackage.ABSTRACT_FEATURE__UNSETTABLE:
				setUnsettable((Boolean)newValue);
				return;
			case VpdescPackage.ABSTRACT_FEATURE__VOLATILE:
				setVolatile((Boolean)newValue);
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
			case VpdescPackage.ABSTRACT_FEATURE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case VpdescPackage.ABSTRACT_FEATURE__CHANGEABLE:
				setChangeable(CHANGEABLE_EDEFAULT);
				return;
			case VpdescPackage.ABSTRACT_FEATURE__DERIVED:
				setDerived(DERIVED_EDEFAULT);
				return;
			case VpdescPackage.ABSTRACT_FEATURE__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case VpdescPackage.ABSTRACT_FEATURE__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case VpdescPackage.ABSTRACT_FEATURE__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case VpdescPackage.ABSTRACT_FEATURE__UNSETTABLE:
				setUnsettable(UNSETTABLE_EDEFAULT);
				return;
			case VpdescPackage.ABSTRACT_FEATURE__VOLATILE:
				setVolatile(VOLATILE_EDEFAULT);
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
			case VpdescPackage.ABSTRACT_FEATURE__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case VpdescPackage.ABSTRACT_FEATURE__CHANGEABLE:
				return changeable != CHANGEABLE_EDEFAULT;
			case VpdescPackage.ABSTRACT_FEATURE__DERIVED:
				return derived != DERIVED_EDEFAULT;
			case VpdescPackage.ABSTRACT_FEATURE__ORDERED:
				return ordered != ORDERED_EDEFAULT;
			case VpdescPackage.ABSTRACT_FEATURE__TRANSIENT:
				return transient_ != TRANSIENT_EDEFAULT;
			case VpdescPackage.ABSTRACT_FEATURE__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case VpdescPackage.ABSTRACT_FEATURE__UNSETTABLE:
				return unsettable != UNSETTABLE_EDEFAULT;
			case VpdescPackage.ABSTRACT_FEATURE__VOLATILE:
				return volatile_ != VOLATILE_EDEFAULT;
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
		result.append(", changeable: ");
		result.append(changeable);
		result.append(", derived: ");
		result.append(derived);
		result.append(", ordered: ");
		result.append(ordered);
		result.append(", transient: ");
		result.append(transient_);
		result.append(", unique: ");
		result.append(unique);
		result.append(", unsettable: ");
		result.append(unsettable);
		result.append(", volatile: ");
		result.append(volatile_);
		result.append(')');
		return result.toString();
	}

} //AbstractFeatureImpl
