/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataPackage
 * @generated
 */
public interface DataFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DataFactory eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spec</em>'.
   * @generated
   */
  DataSpec createDataSpec();

  /**
   * Returns a new object of class '<em>Abstract Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Import</em>'.
   * @generated
   */
  AbstractImport createAbstractImport();

  /**
   * Returns a new object of class '<em>Import Namespace</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Namespace</em>'.
   * @generated
   */
  ImportNamespace createImportNamespace();

  /**
   * Returns a new object of class '<em>Import URI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import URI</em>'.
   * @generated
   */
  ImportURI createImportURI();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DataPackage getDataPackage();

} //DataFactory
