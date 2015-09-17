/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagrams</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Diagrams#getImports <em>Imports</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Diagrams#getDiagrams <em>Diagrams</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.DiagramPackage#getDiagrams()
 * @model
 * @generated
 */
public interface Diagrams extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.AbstractImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.DiagramPackage#getDiagrams_Imports()
   * @model containment="true"
   * @generated
   */
  EList<AbstractImport> getImports();

  /**
   * Returns the value of the '<em><b>Diagrams</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Diagrams</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Diagrams</em>' containment reference.
   * @see #setDiagrams(Aspect)
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.DiagramPackage#getDiagrams_Diagrams()
   * @model containment="true"
   * @generated
   */
  Aspect getDiagrams();

  /**
   * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Diagrams#getDiagrams <em>Diagrams</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Diagrams</em>' containment reference.
   * @see #getDiagrams()
   * @generated
   */
  void setDiagrams(Aspect value);

} // Diagrams
