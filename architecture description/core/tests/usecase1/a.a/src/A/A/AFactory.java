
package A.A;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see A.A.APackage
 * @generated
 */
public interface AFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AFactory eINSTANCE = A.A.impl.AFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>root</em>'.
	 * @generated
	 */
	root createroot();

	/**
	 * Returns a new object of class '<em>Chlid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chlid</em>'.
	 * @generated
	 */
	AChlid createAChlid();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	APackage getAPackage();

} //AFactory
