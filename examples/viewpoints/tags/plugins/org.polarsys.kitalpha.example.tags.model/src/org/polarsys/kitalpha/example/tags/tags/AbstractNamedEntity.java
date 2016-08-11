
package org.polarsys.kitalpha.example.tags.tags;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Named Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.AbstractNamedEntity#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getAbstractNamedEntity()
 * @model abstract="true"
 * @generated
 */

public interface AbstractNamedEntity extends AbstractTagEntity {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getAbstractNamedEntity_Name()
	 * @model
	 * @generated
	 */

	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.example.tags.tags.AbstractNamedEntity#getName <em>Name</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */

	void setName(String value);

} // AbstractNamedEntity
