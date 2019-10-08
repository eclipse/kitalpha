/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage
 * @generated
 */
public interface VpspecFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VpspecFactory eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl.VpspecFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Viewpoint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Viewpoint</em>'.
   * @generated
   */
  Viewpoint createViewpoint();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VpspecPackage getVpspecPackage();

} //VpspecFactory
