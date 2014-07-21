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

package org.polarsys.kitalpha.report.model.impl;

import org.polarsys.kitalpha.report.model.LogEntry;
import org.polarsys.kitalpha.report.model.ReportElementPackage;
import org.polarsys.kitalpha.report.model.ReportElementPackage;
import org.polarsys.kitalpha.report.model.Severity;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.report.model.impl.LogEntryImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.report.model.impl.LogEntryImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.report.model.impl.LogEntryImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.report.model.impl.LogEntryImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.report.model.impl.LogEntryImpl#getReferencedObject <em>Referenced Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogEntryImpl extends EObjectImpl implements LogEntry {

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;




	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;




	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Severity severity;




	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<LogEntry> details;




	/**
	 * The cached value of the '{@link #getReferencedObject() <em>Referenced Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedObject()
	 * @generated
	 * @ordered
	 */
	protected EObject referencedObject;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogEntryImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportElementPackage.Literals.LOG_ENTRY;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getMessage() {

		return message;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMessage(String newMessage) {

		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportElementPackage.LOG_ENTRY__MESSAGE, oldMessage, message));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Date getDate() {

		return date;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setDate(Date newDate) {

		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportElementPackage.LOG_ENTRY__DATE, oldDate, date));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Severity getSeverity() {

		return severity;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetSeverity(Severity newSeverity, NotificationChain msgs) {

		Severity oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportElementPackage.LOG_ENTRY__SEVERITY, oldSeverity, newSeverity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setSeverity(Severity newSeverity) {

		if (newSeverity != severity) {
			NotificationChain msgs = null;
			if (severity != null)
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportElementPackage.LOG_ENTRY__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportElementPackage.LOG_ENTRY__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportElementPackage.LOG_ENTRY__SEVERITY, newSeverity, newSeverity));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<LogEntry> getDetails() {

		if (details == null) {
			details = new EObjectContainmentEList<LogEntry>(LogEntry.class, this, ReportElementPackage.LOG_ENTRY__DETAILS);
		}
		return details;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EObject getReferencedObject() {

		if (referencedObject != null && referencedObject.eIsProxy()) {
			InternalEObject oldReferencedObject = (InternalEObject)referencedObject;
			referencedObject = eResolveProxy(oldReferencedObject);
			if (referencedObject != oldReferencedObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportElementPackage.LOG_ENTRY__REFERENCED_OBJECT, oldReferencedObject, referencedObject));
			}
		}
		return referencedObject;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EObject basicGetReferencedObject() {

		return referencedObject;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setReferencedObject(EObject newReferencedObject) {

		EObject oldReferencedObject = referencedObject;
		referencedObject = newReferencedObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportElementPackage.LOG_ENTRY__REFERENCED_OBJECT, oldReferencedObject, referencedObject));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportElementPackage.LOG_ENTRY__SEVERITY:
				return basicSetSeverity(null, msgs);
			case ReportElementPackage.LOG_ENTRY__DETAILS:
				return ((InternalEList<?>)getDetails()).basicRemove(otherEnd, msgs);
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
			case ReportElementPackage.LOG_ENTRY__MESSAGE:
				return getMessage();
			case ReportElementPackage.LOG_ENTRY__DATE:
				return getDate();
			case ReportElementPackage.LOG_ENTRY__SEVERITY:
				return getSeverity();
			case ReportElementPackage.LOG_ENTRY__DETAILS:
				return getDetails();
			case ReportElementPackage.LOG_ENTRY__REFERENCED_OBJECT:
				if (resolve) return getReferencedObject();
				return basicGetReferencedObject();
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
			case ReportElementPackage.LOG_ENTRY__MESSAGE:
				setMessage((String)newValue);
				return;
			case ReportElementPackage.LOG_ENTRY__DATE:
				setDate((Date)newValue);
				return;
			case ReportElementPackage.LOG_ENTRY__SEVERITY:
				setSeverity((Severity)newValue);
				return;
			case ReportElementPackage.LOG_ENTRY__DETAILS:
				getDetails().clear();
				getDetails().addAll((Collection<? extends LogEntry>)newValue);
				return;
			case ReportElementPackage.LOG_ENTRY__REFERENCED_OBJECT:
				setReferencedObject((EObject)newValue);
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
			case ReportElementPackage.LOG_ENTRY__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case ReportElementPackage.LOG_ENTRY__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ReportElementPackage.LOG_ENTRY__SEVERITY:
				setSeverity((Severity)null);
				return;
			case ReportElementPackage.LOG_ENTRY__DETAILS:
				getDetails().clear();
				return;
			case ReportElementPackage.LOG_ENTRY__REFERENCED_OBJECT:
				setReferencedObject((EObject)null);
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
			case ReportElementPackage.LOG_ENTRY__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case ReportElementPackage.LOG_ENTRY__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ReportElementPackage.LOG_ENTRY__SEVERITY:
				return severity != null;
			case ReportElementPackage.LOG_ENTRY__DETAILS:
				return details != null && !details.isEmpty();
			case ReportElementPackage.LOG_ENTRY__REFERENCED_OBJECT:
				return referencedObject != null;
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
		result.append(" (message: ");
		result.append(message);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}


} //LogEntryImpl
