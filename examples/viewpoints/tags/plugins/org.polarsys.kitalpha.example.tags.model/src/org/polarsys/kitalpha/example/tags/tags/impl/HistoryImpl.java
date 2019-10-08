
package org.polarsys.kitalpha.example.tags.tags.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.example.tags.tags.History;
import org.polarsys.kitalpha.example.tags.tags.Status;
import org.polarsys.kitalpha.example.tags.tags.TagsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.HistoryImpl#getOldStatus <em>Old Status</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.HistoryImpl#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.HistoryImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.HistoryImpl#getChangeComment <em>Change Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryImpl extends AbstractTagEntityImpl implements History {

	/**
	 * The cached value of the '{@link #getOldStatus() <em>Old Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldStatus()
	 * @generated
	 * @ordered
	 */
	protected Status oldStatus;

	/**
	 * The default value of the '{@link #getChangeDate() <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHANGE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeDate() <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDate()
	 * @generated
	 * @ordered
	 */
	protected Date changeDate = CHANGE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeComment() <em>Change Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeComment()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeComment() <em>Change Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeComment()
	 * @generated
	 * @ordered
	 */
	protected String changeComment = CHANGE_COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TagsPackage.Literals.HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Status getOldStatus() {

		if (oldStatus != null && oldStatus.eIsProxy()) {
			InternalEObject oldOldStatus = (InternalEObject) oldStatus;
			oldStatus = (Status) eResolveProxy(oldOldStatus);
			if (oldStatus != oldOldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TagsPackage.HISTORY__OLD_STATUS,
							oldOldStatus, oldStatus));
			}
		}
		return oldStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Status basicGetOldStatus() {

		return oldStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOldStatus(Status newOldStatus) {

		Status oldOldStatus = oldStatus;
		oldStatus = newOldStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TagsPackage.HISTORY__OLD_STATUS, oldOldStatus,
					oldStatus));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Date getChangeDate() {

		return changeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setChangeDate(Date newChangeDate) {

		Date oldChangeDate = changeDate;
		changeDate = newChangeDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TagsPackage.HISTORY__CHANGE_DATE, oldChangeDate,
					changeDate));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getUser() {

		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setUser(String newUser) {

		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TagsPackage.HISTORY__USER, oldUser, user));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getChangeComment() {

		return changeComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setChangeComment(String newChangeComment) {

		String oldChangeComment = changeComment;
		changeComment = newChangeComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TagsPackage.HISTORY__CHANGE_COMMENT, oldChangeComment,
					changeComment));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TagsPackage.HISTORY__OLD_STATUS:
			if (resolve)
				return getOldStatus();
			return basicGetOldStatus();
		case TagsPackage.HISTORY__CHANGE_DATE:
			return getChangeDate();
		case TagsPackage.HISTORY__USER:
			return getUser();
		case TagsPackage.HISTORY__CHANGE_COMMENT:
			return getChangeComment();
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
		case TagsPackage.HISTORY__OLD_STATUS:
			setOldStatus((Status) newValue);
			return;
		case TagsPackage.HISTORY__CHANGE_DATE:
			setChangeDate((Date) newValue);
			return;
		case TagsPackage.HISTORY__USER:
			setUser((String) newValue);
			return;
		case TagsPackage.HISTORY__CHANGE_COMMENT:
			setChangeComment((String) newValue);
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
		case TagsPackage.HISTORY__OLD_STATUS:
			setOldStatus((Status) null);
			return;
		case TagsPackage.HISTORY__CHANGE_DATE:
			setChangeDate(CHANGE_DATE_EDEFAULT);
			return;
		case TagsPackage.HISTORY__USER:
			setUser(USER_EDEFAULT);
			return;
		case TagsPackage.HISTORY__CHANGE_COMMENT:
			setChangeComment(CHANGE_COMMENT_EDEFAULT);
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
		case TagsPackage.HISTORY__OLD_STATUS:
			return oldStatus != null;
		case TagsPackage.HISTORY__CHANGE_DATE:
			return CHANGE_DATE_EDEFAULT == null ? changeDate != null : !CHANGE_DATE_EDEFAULT.equals(changeDate);
		case TagsPackage.HISTORY__USER:
			return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
		case TagsPackage.HISTORY__CHANGE_COMMENT:
			return CHANGE_COMMENT_EDEFAULT == null ? changeComment != null
					: !CHANGE_COMMENT_EDEFAULT.equals(changeComment);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (changeDate: "); //$NON-NLS-1$
		result.append(changeDate);
		result.append(", user: "); //$NON-NLS-1$
		result.append(user);
		result.append(", changeComment: "); //$NON-NLS-1$
		result.append(changeComment);
		result.append(')');
		return result.toString();
	}

} //HistoryImpl