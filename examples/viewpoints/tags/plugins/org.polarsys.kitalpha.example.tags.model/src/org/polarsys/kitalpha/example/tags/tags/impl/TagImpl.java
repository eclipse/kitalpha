
package org.polarsys.kitalpha.example.tags.tags.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.example.tags.tags.History;
import org.polarsys.kitalpha.example.tags.tags.Status;
import org.polarsys.kitalpha.example.tags.tags.Tag;
import org.polarsys.kitalpha.example.tags.tags.TagsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.TagImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.TagImpl#getStatusHistory <em>Status History</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TagImpl extends AbstractTagEntityImpl implements Tag {

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getStatusHistory() <em>Status History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<History> statusHistory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TagsPackage.Literals.TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Status getStatus() {

		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject) status;
			status = (Status) eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TagsPackage.TAG__STATUS, oldStatus,
							status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Status basicGetStatus() {

		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setStatus(Status newStatus) {

		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TagsPackage.TAG__STATUS, oldStatus, status));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<History> getStatusHistory() {

		if (statusHistory == null) {
			statusHistory = new EObjectContainmentEList<History>(History.class, this, TagsPackage.TAG__STATUS_HISTORY);
		}
		return statusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TagsPackage.TAG__STATUS_HISTORY:
			return ((InternalEList<?>) getStatusHistory()).basicRemove(otherEnd, msgs);
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
		case TagsPackage.TAG__STATUS:
			if (resolve)
				return getStatus();
			return basicGetStatus();
		case TagsPackage.TAG__STATUS_HISTORY:
			return getStatusHistory();
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
		case TagsPackage.TAG__STATUS:
			setStatus((Status) newValue);
			return;
		case TagsPackage.TAG__STATUS_HISTORY:
			getStatusHistory().clear();
			getStatusHistory().addAll((Collection<? extends History>) newValue);
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
		case TagsPackage.TAG__STATUS:
			setStatus((Status) null);
			return;
		case TagsPackage.TAG__STATUS_HISTORY:
			getStatusHistory().clear();
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
		case TagsPackage.TAG__STATUS:
			return status != null;
		case TagsPackage.TAG__STATUS_HISTORY:
			return statusHistory != null && !statusHistory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TagImpl