/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecoreX;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecoreX.EcoreXPackage
 * @generated
 */
public interface EcoreXFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreXFactory eINSTANCE = ecoreX.impl.EcoreXFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Extented EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extented EClass</em>'.
	 * @generated
	 */
	ExtentedEClass createExtentedEClass();

	/**
	 * Returns a new object of class '<em>Extended EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended EPackage</em>'.
	 * @generated
	 */
	ExtendedEPackage createExtendedEPackage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcoreXPackage getEcoreXPackage();

} //EcoreXFactory
