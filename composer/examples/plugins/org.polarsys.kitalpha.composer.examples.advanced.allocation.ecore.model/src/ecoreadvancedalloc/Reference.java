/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecoreadvancedalloc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecoreadvancedalloc.Reference#getName <em>Name</em>}</li>
 *   <li>{@link ecoreadvancedalloc.Reference#getHyperlinkRef <em>Hyperlink Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecoreadvancedalloc.EcoreadvancedallocPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends EObject {
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
	 * @see ecoreadvancedalloc.EcoreadvancedallocPackage#getReference_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecoreadvancedalloc.Reference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hyperlink Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hyperlink Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyperlink Ref</em>' attribute.
	 * @see #setHyperlinkRef(String)
	 * @see ecoreadvancedalloc.EcoreadvancedallocPackage#getReference_HyperlinkRef()
	 * @model required="true"
	 * @generated
	 */
	String getHyperlinkRef();

	/**
	 * Sets the value of the '{@link ecoreadvancedalloc.Reference#getHyperlinkRef <em>Hyperlink Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyperlink Ref</em>' attribute.
	 * @see #getHyperlinkRef()
	 * @generated
	 */
	void setHyperlinkRef(String value);

} // Reference
