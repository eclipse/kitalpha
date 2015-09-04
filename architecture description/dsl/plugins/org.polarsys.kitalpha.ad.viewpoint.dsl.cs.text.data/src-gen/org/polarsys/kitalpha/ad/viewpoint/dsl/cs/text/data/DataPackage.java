/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "data";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/cs/text/data/1.0.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "data";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DataPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataPackageImpl.init();

  /**
   * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataSpecImpl <em>Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataSpecImpl
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataPackageImpl#getDataSpec()
   * @generated
   */
  int DATA_SPEC = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SPEC__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SPEC__DATA = 1;

  /**
   * The number of structural features of the '<em>Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SPEC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.ImportImpl
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 4;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.AbstractImportImpl <em>Abstract Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.AbstractImportImpl
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataPackageImpl#getAbstractImport()
   * @generated
   */
  int ABSTRACT_IMPORT = 1;

  /**
   * The number of structural features of the '<em>Abstract Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.ImportNamespaceImpl <em>Import Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.ImportNamespaceImpl
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataPackageImpl#getImportNamespace()
   * @generated
   */
  int IMPORT_NAMESPACE = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_NAMESPACE__IMPORTED_NAMESPACE = ABSTRACT_IMPORT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_NAMESPACE_FEATURE_COUNT = ABSTRACT_IMPORT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.ImportURIImpl <em>Import URI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.ImportURIImpl
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataPackageImpl#getImportURI()
   * @generated
   */
  int IMPORT_URI = 3;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_URI__IMPORT_URI = ABSTRACT_IMPORT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import URI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_URI_FEATURE_COUNT = ABSTRACT_IMPORT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spec</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec
   * @generated
   */
  EClass getDataSpec();

  /**
   * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec#getImports()
   * @see #getDataSpec()
   * @generated
   */
  EReference getDataSpec_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec#getData()
   * @see #getDataSpec()
   * @generated
   */
  EReference getDataSpec_Data();

  /**
   * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.AbstractImport <em>Abstract Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Import</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.AbstractImport
   * @generated
   */
  EClass getAbstractImport();

  /**
   * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportNamespace <em>Import Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Namespace</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportNamespace
   * @generated
   */
  EClass getImportNamespace();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportNamespace#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportNamespace#getImportedNamespace()
   * @see #getImportNamespace()
   * @generated
   */
  EAttribute getImportNamespace_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import URI</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportURI
   * @generated
   */
  EClass getImportURI();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportURI#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportURI#getImportURI()
   * @see #getImportURI()
   * @generated
   */
  EAttribute getImportURI_ImportURI();

  /**
   * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DataFactory getDataFactory();

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
     * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataSpecImpl <em>Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataSpecImpl
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataPackageImpl#getDataSpec()
     * @generated
     */
    EClass DATA_SPEC = eINSTANCE.getDataSpec();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SPEC__IMPORTS = eINSTANCE.getDataSpec_Imports();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SPEC__DATA = eINSTANCE.getDataSpec_Data();

    /**
     * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.AbstractImportImpl <em>Abstract Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.AbstractImportImpl
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataPackageImpl#getAbstractImport()
     * @generated
     */
    EClass ABSTRACT_IMPORT = eINSTANCE.getAbstractImport();

    /**
     * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.ImportNamespaceImpl <em>Import Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.ImportNamespaceImpl
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataPackageImpl#getImportNamespace()
     * @generated
     */
    EClass IMPORT_NAMESPACE = eINSTANCE.getImportNamespace();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_NAMESPACE__IMPORTED_NAMESPACE = eINSTANCE.getImportNamespace_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.ImportURIImpl <em>Import URI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.ImportURIImpl
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataPackageImpl#getImportURI()
     * @generated
     */
    EClass IMPORT_URI = eINSTANCE.getImportURI();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_URI__IMPORT_URI = eINSTANCE.getImportURI_ImportURI();

    /**
     * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.ImportImpl
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

  }

} //DataPackage
