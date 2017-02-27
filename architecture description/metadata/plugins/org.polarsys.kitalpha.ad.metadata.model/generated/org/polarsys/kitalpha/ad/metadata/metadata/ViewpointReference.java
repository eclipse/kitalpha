/**
 * ******************************************************************************
 *  Copyright (c) 2016-2017 Thales Global Services S.A.S.
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

import org.osgi.framework.Version;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference#getVpId <em>Vp Id</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference#getVersion <em>Version</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference#isInactive <em>Inactive</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage#getViewpointReference()
 * @model
 * @generated
 */

public interface ViewpointReference extends MetadataElement {





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
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage#getViewpointReference_VpId()
	 * @model required="true"
	 * @generated
	 */

	String getVpId();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference#getVpId <em>Vp Id</em>}' attribute.

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
	 * @see #setVersion(Version)
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage#getViewpointReference_Version()
	 * @model dataType="org.polarsys.kitalpha.ad.metadata.metadata.Version"
	 * @generated
	 */

	Version getVersion();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference#getVersion <em>Version</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */

	void setVersion(Version value);







	/**
	 * Returns the value of the '<em><b>Inactive</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inactive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inactive</em>' attribute.
	 * @see #setInactive(boolean)
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage#getViewpointReference_Inactive()
	 * @model
	 * @generated
	 */

	boolean isInactive();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference#isInactive <em>Inactive</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactive</em>' attribute.
	 * @see #isInactive()
	 * @generated
	 */

	void setInactive(boolean value);





} // ViewpointReference
