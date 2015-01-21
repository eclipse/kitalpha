/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec#getImports <em>Imports</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataPackage#getDataSpec()
 * @model
 * @generated
 */
public interface DataSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataPackage#getDataSpec_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference.
   * @see #setData(Data)
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataPackage#getDataSpec_Data()
   * @model containment="true"
   * @generated
   */
  Data getData();

  /**
   * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec#getData <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' containment reference.
   * @see #getData()
   * @generated
   */
  void setData(Data value);

} // DataSpec
