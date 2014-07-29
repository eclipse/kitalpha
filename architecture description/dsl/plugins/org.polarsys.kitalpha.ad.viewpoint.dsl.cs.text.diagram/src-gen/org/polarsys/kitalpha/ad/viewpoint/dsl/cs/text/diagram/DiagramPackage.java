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
   * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.AbstractImportImpl <em>Abstract Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.AbstractImportImpl
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramPackageImpl#getAbstractImport()
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
  int ABSTRACT_IMPORT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.ImportNameSpaceImpl <em>Import Name Space</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.ImportNameSpaceImpl
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramPackageImpl#getImportNameSpace()
   * @generated
   */
  int IMPORT_NAME_SPACE = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_NAME_SPACE__IMPORTED_NAMESPACE = ABSTRACT_IMPORT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import Name Space</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_NAME_SPACE_FEATURE_COUNT = ABSTRACT_IMPORT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.ImportGroupImpl <em>Import Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.ImportGroupImpl
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramPackageImpl#getImportGroup()
   * @generated
   */
  int IMPORT_GROUP = 3;

  /**
   * The feature id for the '<em><b>Imported Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_GROUP__IMPORTED_GROUP = ABSTRACT_IMPORT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_GROUP_FEATURE_COUNT = ABSTRACT_IMPORT_FEATURE_COUNT + 1;


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
   * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.AbstractImport <em>Abstract Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Import</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.AbstractImport
   * @generated
   */
  EClass getAbstractImport();

  /**
   * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.ImportNameSpace <em>Import Name Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Name Space</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.ImportNameSpace
   * @generated
   */
  EClass getImportNameSpace();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.ImportNameSpace#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.ImportNameSpace#getImportedNamespace()
   * @see #getImportNameSpace()
   * @generated
   */
  EAttribute getImportNameSpace_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.ImportGroup <em>Import Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Group</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.ImportGroup
   * @generated
   */
  EClass getImportGroup();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.ImportGroup#getImportedGroup <em>Imported Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Group</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.ImportGroup#getImportedGroup()
   * @see #getImportGroup()
   * @generated
   */
  EAttribute getImportGroup_ImportedGroup();

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
     * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.AbstractImportImpl <em>Abstract Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.AbstractImportImpl
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramPackageImpl#getAbstractImport()
     * @generated
     */
    EClass ABSTRACT_IMPORT = eINSTANCE.getAbstractImport();

    /**
     * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.ImportNameSpaceImpl <em>Import Name Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.ImportNameSpaceImpl
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramPackageImpl#getImportNameSpace()
     * @generated
     */
    EClass IMPORT_NAME_SPACE = eINSTANCE.getImportNameSpace();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_NAME_SPACE__IMPORTED_NAMESPACE = eINSTANCE.getImportNameSpace_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.ImportGroupImpl <em>Import Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.ImportGroupImpl
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramPackageImpl#getImportGroup()
     * @generated
     */
    EClass IMPORT_GROUP = eINSTANCE.getImportGroup();

    /**
     * The meta object literal for the '<em><b>Imported Group</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_GROUP__IMPORTED_GROUP = eINSTANCE.getImportGroup_ImportedGroup();

  }

} //DiagramPackage
