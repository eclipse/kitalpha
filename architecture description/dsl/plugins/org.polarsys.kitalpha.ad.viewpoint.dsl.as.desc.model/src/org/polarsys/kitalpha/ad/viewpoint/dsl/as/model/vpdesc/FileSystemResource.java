/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File System Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.FileSystemResource#getPath <em>Path</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.FileSystemResource#isWorkspace <em>Workspace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getFileSystemResource()
 * @model
 * @generated
 */

public interface FileSystemResource extends AbstractResource {





	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getFileSystemResource_Path()
	 * @model
	 * @generated
	 */

	String getPath();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.FileSystemResource#getPath <em>Path</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */

	void setPath(String value);







	/**
	 * Returns the value of the '<em><b>Workspace</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workspace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workspace</em>' attribute.
	 * @see #setWorkspace(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getFileSystemResource_Workspace()
	 * @model
	 * @generated
	 */

	boolean isWorkspace();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.FileSystemResource#isWorkspace <em>Workspace</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workspace</em>' attribute.
	 * @see #isWorkspace()
	 * @generated
	 */

	void setWorkspace(boolean value);





} // FileSystemResource
