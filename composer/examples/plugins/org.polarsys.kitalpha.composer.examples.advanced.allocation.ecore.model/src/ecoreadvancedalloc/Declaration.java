/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecoreadvancedalloc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecoreadvancedalloc.Declaration#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecoreadvancedalloc.EcoreadvancedallocPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends GeneratedElement {
	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreadvancedalloc.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see ecoreadvancedalloc.EcoreadvancedallocPackage#getDeclaration_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

} // Declaration
