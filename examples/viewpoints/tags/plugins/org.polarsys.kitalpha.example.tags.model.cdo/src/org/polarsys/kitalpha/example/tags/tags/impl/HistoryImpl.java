
package org.polarsys.kitalpha.example.tags.tags.impl;

import java.util.Date;
import org.eclipse.emf.ecore.EClass;
import org.polarsys.kitalpha.example.tags.tags.History;
import org.polarsys.kitalpha.example.tags.tags.Status;
import org.polarsys.kitalpha.example.tags.tags.TagsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.HistoryImpl#getOldStatus <em>Old Status</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.HistoryImpl#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.HistoryImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.impl.HistoryImpl#getChangeComment <em>Change Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoryImpl extends AbstractTagEntityImpl implements History {

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

		return (Status) eGet(TagsPackage.Literals.HISTORY__OLD_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOldStatus(Status newOldStatus) {

		eSet(TagsPackage.Literals.HISTORY__OLD_STATUS, newOldStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Date getChangeDate() {

		return (Date) eGet(TagsPackage.Literals.HISTORY__CHANGE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setChangeDate(Date newChangeDate) {

		eSet(TagsPackage.Literals.HISTORY__CHANGE_DATE, newChangeDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getUser() {

		return (String) eGet(TagsPackage.Literals.HISTORY__USER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setUser(String newUser) {

		eSet(TagsPackage.Literals.HISTORY__USER, newUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getChangeComment() {

		return (String) eGet(TagsPackage.Literals.HISTORY__CHANGE_COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setChangeComment(String newChangeComment) {

		eSet(TagsPackage.Literals.HISTORY__CHANGE_COMMENT, newChangeComment);
	}

} //HistoryImpl