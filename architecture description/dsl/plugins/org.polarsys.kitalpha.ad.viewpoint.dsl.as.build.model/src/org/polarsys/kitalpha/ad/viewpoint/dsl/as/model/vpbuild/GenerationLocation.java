/**
 *
 * Copyright (c) Polarsys, 2014. All rights reserved.
 *
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generation Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.GenerationLocation#getFolder <em>Folder</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.GenerationLocation#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getGenerationLocation()
 * @model
 * @generated
 */

public interface GenerationLocation extends EObject {

	/**
	 * Returns the value of the '<em><b>Folder</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' attribute.
	 * @see #setFolder(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getGenerationLocation_Folder()
	 * @model
	 * @generated
	 */

	String getFolder();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.GenerationLocation#getFolder <em>Folder</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' attribute.
	 * @see #getFolder()
	 * @generated
	 */

	void setFolder(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getGenerationLocation_Url()
	 * @model
	 * @generated
	 */

	String getUrl();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.GenerationLocation#getUrl <em>Url</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */

	void setUrl(String value);

} // GenerationLocation
