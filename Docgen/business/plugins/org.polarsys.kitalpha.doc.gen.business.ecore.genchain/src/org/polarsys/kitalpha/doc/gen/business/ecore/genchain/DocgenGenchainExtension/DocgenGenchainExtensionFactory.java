/**
 */
package org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.DocgenGenchainExtensionPackage
 * @generated
 */
public interface DocgenGenchainExtensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocgenGenchainExtensionFactory eINSTANCE = org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.DocgenGenchainExtensionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Kitalpha Documentation Generation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kitalpha Documentation Generation</em>'.
	 * @generated
	 */
	KitalphaDocumentationGeneration createKitalphaDocumentationGeneration();

	/**
	 * Returns a new object of class '<em>Kitalpha Documentation Generation Branding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kitalpha Documentation Generation Branding</em>'.
	 * @generated
	 */
	KitalphaDocumentationGenerationBranding createKitalphaDocumentationGenerationBranding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DocgenGenchainExtensionPackage getDocgenGenchainExtensionPackage();

} //DocgenGenchainExtensionFactory
