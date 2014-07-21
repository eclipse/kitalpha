/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram;

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
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.DiagramFactory
 * @model kind="package"
 * @generated
 */
public interface DiagramPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "diagram";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/cs/text/vpdiagram/1.0.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "diagram";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DiagramPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramPackageImpl.init();

  /**
   * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramsImpl <em>Diagrams</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramsImpl
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramPackageImpl#getDiagrams()
   * @generated
   */
  int DIAGRAMS = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAMS__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Diagrams</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAMS__DIAGRAMS = 1;

  /**
   * The number of structural features of the '<em>Diagrams</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAMS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.ImportImpl
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Diagrams <em>Diagrams</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagrams</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Diagrams
   * @generated
   */
  EClass getDiagrams();

  /**
   * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Diagrams#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Diagrams#getImports()
   * @see #getDiagrams()
   * @generated
   */
  EReference getDiagrams_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Diagrams#getDiagrams <em>Diagrams</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Diagrams</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Diagrams#getDiagrams()
   * @see #getDiagrams()
   * @generated
   */
  EReference getDiagrams_Diagrams();

  /**
   * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DiagramFactory getDiagramFactory();

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
     * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramsImpl <em>Diagrams</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramsImpl
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramPackageImpl#getDiagrams()
     * @generated
     */
    EClass DIAGRAMS = eINSTANCE.getDiagrams();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAMS__IMPORTS = eINSTANCE.getDiagrams_Imports();

    /**
     * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAMS__DIAGRAMS = eINSTANCE.getDiagrams_Diagrams();

    /**
     * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.ImportImpl
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

  }

} //DiagramPackage
