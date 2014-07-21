/**
 */
package ecorerecursivealloc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecorerecursivealloc.EcorerecursiveallocPackage
 * @generated
 */
public interface EcorerecursiveallocFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcorerecursiveallocFactory eINSTANCE = ecorerecursivealloc.impl.EcorerecursiveallocFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ecore Alloc Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore Alloc Root</em>'.
	 * @generated
	 */
	EcoreAllocRoot createEcoreAllocRoot();

	/**
	 * Returns a new object of class '<em>Ecore Alloc File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore Alloc File</em>'.
	 * @generated
	 */
	EcoreAllocFile createEcoreAllocFile();

	/**
	 * Returns a new object of class '<em>Ecore Alloc Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore Alloc Type</em>'.
	 * @generated
	 */
	EcoreAllocType createEcoreAllocType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcorerecursiveallocPackage getEcorerecursiveallocPackage();

} //EcorerecursiveallocFactory
