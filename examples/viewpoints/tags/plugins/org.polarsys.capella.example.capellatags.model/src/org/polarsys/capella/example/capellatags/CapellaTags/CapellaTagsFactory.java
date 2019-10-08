
package org.polarsys.capella.example.capellatags.CapellaTags;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.example.capellatags.CapellaTags.CapellaTagsPackage
 * @generated
 */
public interface CapellaTagsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CapellaTagsFactory eINSTANCE = org.polarsys.capella.example.capellatags.CapellaTags.impl.CapellaTagsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Capella Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capella Tag</em>'.
	 * @generated
	 */
	CapellaTag createCapellaTag();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CapellaTagsPackage getCapellaTagsPackage();

} //CapellaTagsFactory
