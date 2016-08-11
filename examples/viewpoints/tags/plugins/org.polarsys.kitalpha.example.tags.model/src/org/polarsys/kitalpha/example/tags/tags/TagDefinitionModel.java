
package org.polarsys.kitalpha.example.tags.tags;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Definition Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.TagDefinitionModel#getOwnedStatuses <em>Owned Statuses</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.TagDefinitionModel#getOwnedKinds <em>Owned Kinds</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.TagDefinitionModel#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getTagDefinitionModel()
 * @model
 * @generated
 */

public interface TagDefinitionModel extends AbstractNamedEntity {

	/**
	 * Returns the value of the '<em><b>Owned Statuses</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.example.tags.tags.Status}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Statuses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Statuses</em>' containment reference list.
	 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getTagDefinitionModel_OwnedStatuses()
	 * @model containment="true"
	 * @generated
	 */

	EList<Status> getOwnedStatuses();

	/**
	 * Returns the value of the '<em><b>Owned Kinds</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.example.tags.tags.Kind}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Kinds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Kinds</em>' containment reference list.
	 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getTagDefinitionModel_OwnedKinds()
	 * @model containment="true"
	 * @generated
	 */

	EList<Kind> getOwnedKinds();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getTagDefinitionModel_Description()
	 * @model
	 * @generated
	 */

	String getDescription();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.example.tags.tags.TagDefinitionModel#getDescription <em>Description</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */

	void setDescription(String value);

} // TagDefinitionModel
