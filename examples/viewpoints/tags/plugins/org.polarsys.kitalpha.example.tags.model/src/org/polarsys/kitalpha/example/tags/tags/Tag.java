
package org.polarsys.kitalpha.example.tags.tags;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.Tag#getStatus <em>Status</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.Tag#getStatusHistory <em>Status History</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getTag()
 * @model
 * @generated
 */

public interface Tag extends AbstractTagEntity {

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getTag_Status()
	 * @model
	 * @generated
	 */

	Status getStatus();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.example.tags.tags.Tag#getStatus <em>Status</em>}' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */

	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Status History</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.example.tags.tags.History}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status History</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status History</em>' containment reference list.
	 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getTag_StatusHistory()
	 * @model containment="true"
	 * @generated
	 */

	EList<History> getStatusHistory();

} // Tag
