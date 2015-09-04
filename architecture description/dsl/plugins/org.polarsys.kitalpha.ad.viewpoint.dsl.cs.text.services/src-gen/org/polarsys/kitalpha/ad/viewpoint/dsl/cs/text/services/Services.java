/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.Services#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ServicesPackage#getServices()
 * @model
 * @generated
 */
public interface Services extends EObject
{
  /**
   * Returns the value of the '<em><b>Services</b></em>' containment reference list.
   * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Services</em>' containment reference list.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ServicesPackage#getServices_Services()
   * @model containment="true"
   * @generated
   */
  EList<Aspect> getServices();

} // Services
