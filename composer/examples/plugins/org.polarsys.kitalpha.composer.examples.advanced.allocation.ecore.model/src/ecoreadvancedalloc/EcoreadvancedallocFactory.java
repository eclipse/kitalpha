/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecoreadvancedalloc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecoreadvancedalloc.EcoreadvancedallocPackage
 * @generated
 */
public interface EcoreadvancedallocFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreadvancedallocFactory eINSTANCE = ecoreadvancedalloc.impl.EcoreadvancedallocFactoryImpl.init();

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
	 * Returns a new object of class '<em>Forward Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forward Declaration</em>'.
	 * @generated
	 */
	ForwardDeclaration createForwardDeclaration();

	/**
	 * Returns a new object of class '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaration</em>'.
	 * @generated
	 */
	Declaration createDeclaration();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcoreadvancedallocPackage getEcoreadvancedallocPackage();

} //EcoreadvancedallocFactory
