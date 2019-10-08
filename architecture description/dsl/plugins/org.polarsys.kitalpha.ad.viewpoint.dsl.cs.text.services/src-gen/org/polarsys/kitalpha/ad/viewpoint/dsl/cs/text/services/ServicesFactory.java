/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ServicesPackage
 * @generated
 */
public interface ServicesFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ServicesFactory eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.impl.ServicesFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Services</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Services</em>'.
   * @generated
   */
  Services createServices();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ServicesPackage getServicesPackage();

} //ServicesFactory
