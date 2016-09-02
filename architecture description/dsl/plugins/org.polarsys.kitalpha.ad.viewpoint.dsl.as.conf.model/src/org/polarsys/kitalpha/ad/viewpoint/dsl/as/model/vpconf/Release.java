/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf;

import org.eclipse.emf.common.util.EList;
import org.osgi.framework.Version;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release#getViewpointVersion <em>Viewpoint Version</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release#getViewpointDescription <em>Viewpoint Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release#getRequiredExecutionEnvironment <em>Required Execution Environment</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage#getRelease()
 * @model
 * @generated
 */

public interface Release extends ConfigurationElement {





	/**
	 * Returns the value of the '<em><b>Viewpoint Version</b></em>' attribute.
	 * The default value is <code>"0.0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewpoint Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewpoint Version</em>' attribute.
	 * @see #setViewpointVersion(Version)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage#getRelease_ViewpointVersion()
	 * @model default="0.0.0" dataType="org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Version"
	 * @generated
	 */

	Version getViewpointVersion();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release#getViewpointVersion <em>Viewpoint Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewpoint Version</em>' attribute.
	 * @see #getViewpointVersion()
	 * @generated
	 */

	void setViewpointVersion(Version value);




	/**
	 * Returns the value of the '<em><b>Viewpoint Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewpoint Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewpoint Description</em>' attribute.
	 * @see #setViewpointDescription(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage#getRelease_ViewpointDescription()
	 * @model
	 * @generated
	 */

	String getViewpointDescription();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release#getViewpointDescription <em>Viewpoint Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewpoint Description</em>' attribute.
	 * @see #getViewpointDescription()
	 * @generated
	 */

	void setViewpointDescription(String value);







	/**
	 * Returns the value of the '<em><b>Required Execution Environment</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Execution Environment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Execution Environment</em>' attribute list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage#getRelease_RequiredExecutionEnvironment()
	 * @model default="JavaSE-1.7"
	 * @generated
	 */

	EList<String> getRequiredExecutionEnvironment();





} // Release
