
package org.polarsys.kitalpha.example.tags.tags;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.Status#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.Status#getIcone <em>Icone</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.example.tags.tags.Status#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getStatus()
 * @model
 * @generated
 */

public interface Status extends AbstractNamedEntity {

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' reference.
	 * @see #setKind(Kind)
	 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getStatus_Kind()
	 * @model
	 * @generated
	 */

	Kind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.example.tags.tags.Status#getKind <em>Kind</em>}' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' reference.
	 * @see #getKind()
	 * @generated
	 */

	void setKind(Kind value);

	/**
	 * Returns the value of the '<em><b>Icone</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icone</em>' attribute.
	 * @see #setIcone(String)
	 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getStatus_Icone()
	 * @model
	 * @generated
	 */

	String getIcone();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.example.tags.tags.Status#getIcone <em>Icone</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icone</em>' attribute.
	 * @see #getIcone()
	 * @generated
	 */

	void setIcone(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.example.tags.tags.Color}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see org.polarsys.kitalpha.example.tags.tags.Color
	 * @see #setColor(Color)
	 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#getStatus_Color()
	 * @model
	 * @generated
	 */

	Color getColor();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.example.tags.tags.Status#getColor <em>Color</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see org.polarsys.kitalpha.example.tags.tags.Color
	 * @see #getColor()
	 * @generated
	 */

	void setColor(Color value);

} // Status
