/**
 * ******************************************************************************
 *  Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *  Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 * *******************************************************************************
 * 
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.metadata.metadata;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage#getVpId <em>Vp Id</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage#getVersion <em>Version</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage#isFiltered <em>Filtered</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage#getViewpointUsage()
 * @model
 * @generated
 */

public interface ViewpointUsage extends EObject {





	/**
	 * Returns the value of the '<em><b>Vp Id</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vp Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vp Id</em>' attribute.
	 * @see #setVpId(String)
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage#getViewpointUsage_VpId()
	 * @model required="true"
	 * @generated
	 */

	String getVpId();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage#getVpId <em>Vp Id</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vp Id</em>' attribute.
	 * @see #getVpId()
	 * @generated
	 */

	void setVpId(String value);







	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage#getViewpointUsage_Version()
	 * @model
	 * @generated
	 */

	String getVersion();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage#getVersion <em>Version</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */

	void setVersion(String value);







	/**
	 * Returns the value of the '<em><b>Filtered</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filtered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtered</em>' attribute.
	 * @see #setFiltered(boolean)
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage#getViewpointUsage_Filtered()
	 * @model
	 * @generated
	 */

	boolean isFiltered();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage#isFiltered <em>Filtered</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filtered</em>' attribute.
	 * @see #isFiltered()
	 * @generated
	 */

	void setFiltered(boolean value);





} // ViewpointUsage
