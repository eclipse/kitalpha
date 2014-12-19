/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.DescAirdGenConf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.DescAirdGenConf.DescAirdGenConfPackage
 * @generated
 */
public interface DescAirdGenConfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DescAirdGenConfFactory eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.DescAirdGenConf.impl.DescAirdGenConfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aird Generation Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aird Generation Configuration</em>'.
	 * @generated
	 */
	AirdGenerationConfiguration createAirdGenerationConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DescAirdGenConfPackage getDescAirdGenConfPackage();

} //DescAirdGenConfFactory
