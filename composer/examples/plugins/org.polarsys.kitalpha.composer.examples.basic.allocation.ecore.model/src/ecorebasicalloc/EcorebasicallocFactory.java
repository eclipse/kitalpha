/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecorebasicalloc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecorebasicalloc.EcorebasicallocPackage
 * @generated
 */
public interface EcorebasicallocFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcorebasicallocFactory eINSTANCE = ecorebasicalloc.impl.EcorebasicallocFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ecore Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore Class</em>'.
	 * @generated
	 */
	EcoreClass createEcoreClass();

	/**
	 * Returns a new object of class '<em>Ecore File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore File</em>'.
	 * @generated
	 */
	EcoreFile createEcoreFile();

	/**
	 * Returns a new object of class '<em>Ecore Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore Root</em>'.
	 * @generated
	 */
	EcoreRoot createEcoreRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcorebasicallocPackage getEcorebasicallocPackage();

} //EcorebasicallocFactory
