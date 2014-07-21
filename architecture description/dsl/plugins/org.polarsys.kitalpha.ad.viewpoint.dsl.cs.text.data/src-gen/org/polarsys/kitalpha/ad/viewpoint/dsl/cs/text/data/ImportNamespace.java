/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportNamespace#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataPackage#getImportNamespace()
 * @model
 * @generated
 */
public interface ImportNamespace extends AbstractImport
{
  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' attribute.
   * @see #setImportedNamespace(String)
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataPackage#getImportNamespace_ImportedNamespace()
   * @model
   * @generated
   */
  String getImportedNamespace();

  /**
   * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportNamespace#getImportedNamespace <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' attribute.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(String value);

} // ImportNamespace
