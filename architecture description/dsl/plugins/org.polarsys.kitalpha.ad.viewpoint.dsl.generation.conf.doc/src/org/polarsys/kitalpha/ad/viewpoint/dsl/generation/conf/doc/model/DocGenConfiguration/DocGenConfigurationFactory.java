/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.DocGenConfigurationPackage
 * @generated
 */
public interface DocGenConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocGenConfigurationFactory eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.impl.DocGenConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Documentation Generation Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documentation Generation Configuration</em>'.
	 * @generated
	 */
	DocumentationGenerationConfiguration createDocumentationGenerationConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DocGenConfigurationPackage getDocGenConfigurationPackage();

} //DocGenConfigurationFactory
