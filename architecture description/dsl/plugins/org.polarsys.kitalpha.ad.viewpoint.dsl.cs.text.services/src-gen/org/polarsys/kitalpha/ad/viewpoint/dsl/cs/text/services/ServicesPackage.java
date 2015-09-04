/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ServicesFactory
 * @model kind="package"
 * @generated
 */
public interface ServicesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "services";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/cs/text/vpservices/1.0.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "services";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ServicesPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.impl.ServicesPackageImpl.init();

  /**
   * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.impl.ServicesImpl <em>Services</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.impl.ServicesImpl
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.impl.ServicesPackageImpl#getServices()
   * @generated
   */
  int SERVICES = 0;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICES__SERVICES = 0;

  /**
   * The number of structural features of the '<em>Services</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICES_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.Services <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Services</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.Services
   * @generated
   */
  EClass getServices();

  /**
   * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.Services#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Services</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.Services#getServices()
   * @see #getServices()
   * @generated
   */
  EReference getServices_Services();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ServicesFactory getServicesFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.impl.ServicesImpl <em>Services</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.impl.ServicesImpl
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.impl.ServicesPackageImpl#getServices()
     * @generated
     */
    EClass SERVICES = eINSTANCE.getServices();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICES__SERVICES = eINSTANCE.getServices_Services();

  }

} //ServicesPackage
