/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.DiagramPackage
 * @generated
 */
public interface DiagramFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DiagramFactory eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Diagrams</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Diagrams</em>'.
   * @generated
   */
  Diagrams createDiagrams();

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
  DiagramPackage getDiagramPackage();

} //DiagramFactory
