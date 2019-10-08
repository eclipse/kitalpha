/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
/**
 */
package TestModel.impl;

import TestModel.Person;
import TestModel.TestModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestModel.impl.PersonImpl#isMarried <em>Married</em>}</li>
 *   <li>{@link TestModel.impl.PersonImpl#getSalary <em>Salary</em>}</li>
 *   <li>{@link TestModel.impl.PersonImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link TestModel.impl.PersonImpl#getFriends <em>Friends</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PersonImpl extends EntityImpl implements Person {
	/**
	 * The default value of the '{@link #isMarried() <em>Married</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarried()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARRIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMarried() <em>Married</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarried()
	 * @generated
	 * @ordered
	 */
	protected boolean married = MARRIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected static final double SALARY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected double salary = SALARY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> children;

	/**
	 * The cached value of the '{@link #getFriends() <em>Friends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriends()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> friends;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestModelPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMarried() {
		return married;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarried(boolean newMarried) {
		boolean oldMarried = married;
		married = newMarried;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.PERSON__MARRIED, oldMarried, married));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalary(double newSalary) {
		double oldSalary = salary;
		salary = newSalary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.PERSON__SALARY, oldSalary, salary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<Person>(Person.class, this, TestModelPackage.PERSON__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getFriends() {
		if (friends == null) {
			friends = new EObjectResolvingEList<Person>(Person.class, this, TestModelPackage.PERSON__FRIENDS);
		}
		return friends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestModelPackage.PERSON__MARRIED:
				return isMarried();
			case TestModelPackage.PERSON__SALARY:
				return getSalary();
			case TestModelPackage.PERSON__CHILDREN:
				return getChildren();
			case TestModelPackage.PERSON__FRIENDS:
				return getFriends();
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
			case TestModelPackage.PERSON__MARRIED:
				setMarried((Boolean)newValue);
				return;
			case TestModelPackage.PERSON__SALARY:
				setSalary((Double)newValue);
				return;
			case TestModelPackage.PERSON__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Person>)newValue);
				return;
			case TestModelPackage.PERSON__FRIENDS:
				getFriends().clear();
				getFriends().addAll((Collection<? extends Person>)newValue);
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
			case TestModelPackage.PERSON__MARRIED:
				setMarried(MARRIED_EDEFAULT);
				return;
			case TestModelPackage.PERSON__SALARY:
				setSalary(SALARY_EDEFAULT);
				return;
			case TestModelPackage.PERSON__CHILDREN:
				getChildren().clear();
				return;
			case TestModelPackage.PERSON__FRIENDS:
				getFriends().clear();
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
			case TestModelPackage.PERSON__MARRIED:
				return married != MARRIED_EDEFAULT;
			case TestModelPackage.PERSON__SALARY:
				return salary != SALARY_EDEFAULT;
			case TestModelPackage.PERSON__CHILDREN:
				return children != null && !children.isEmpty();
			case TestModelPackage.PERSON__FRIENDS:
				return friends != null && !friends.isEmpty();
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
		result.append(" (married: ");
		result.append(married);
		result.append(", salary: ");
		result.append(salary);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
