
package A.A;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link A.A.root#getChilds <em>Childs</em>}</li>
 * </ul>
 *
 * @see A.A.APackage#getroot()
 * @model
 * @generated
 */

public interface root extends EObject {

	/**
	 * Returns the value of the '<em><b>Childs</b></em>' containment reference list.
	 * The list contents are of type {@link A.A.AChlid}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Childs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childs</em>' containment reference list.
	 * @see A.A.APackage#getroot_Childs()
	 * @model containment="true"
	 * @generated
	 */

	EList<AChlid> getChilds();

} // root
