
package org.polarsys.kitalpha.example.tags.tags;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.History#getOldStatus <em>Old Status</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.History#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.History#getUser <em>User</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.History#getChangeComment <em>Change Comment</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getHistory()
 * @model
 * @generated
 */

public interface History extends AbstractTagEntity {

	/**
	 * Returns the value of the '<em><b>Old Status</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Status</em>' reference.
	 * @see #setOldStatus(Status)
	 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getHistory_OldStatus()
	 * @model
	 * @generated
	 */

	Status getOldStatus();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.example.tags.tags.History#getOldStatus <em>Old Status</em>}' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Status</em>' reference.
	 * @see #getOldStatus()
	 * @generated
	 */

	void setOldStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Change Date</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Date</em>' attribute.
	 * @see #setChangeDate(Date)
	 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getHistory_ChangeDate()
	 * @model
	 * @generated
	 */

	Date getChangeDate();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.example.tags.tags.History#getChangeDate <em>Change Date</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Date</em>' attribute.
	 * @see #getChangeDate()
	 * @generated
	 */

	void setChangeDate(Date value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getHistory_User()
	 * @model
	 * @generated
	 */

	String getUser();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.example.tags.tags.History#getUser <em>User</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */

	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Change Comment</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Comment</em>' attribute.
	 * @see #setChangeComment(String)
	 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getHistory_ChangeComment()
	 * @model
	 * @generated
	 */

	String getChangeComment();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.example.tags.tags.History#getChangeComment <em>Change Comment</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Comment</em>' attribute.
	 * @see #getChangeComment()
	 * @generated
	 */

	void setChangeComment(String value);

} // History
