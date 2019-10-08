/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation#getOwnedDataGenerationConf <em>Owned Data Generation Conf</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation#getOwnedExtensionGenConf <em>Owned Extension Gen Conf</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage#getGeneration()
 * @model
 * @generated
 */
public interface Generation extends ConfigurationElement {





	/**
	 * Returns the value of the '<em><b>Owned Data Generation Conf</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Data Generation Conf</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Data Generation Conf</em>' containment reference.
	 * @see #setOwnedDataGenerationConf(GData)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage#getGeneration_OwnedDataGenerationConf()
	 * @model containment="true"
	 * @generated
	 */

	GData getOwnedDataGenerationConf();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation#getOwnedDataGenerationConf <em>Owned Data Generation Conf</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Data Generation Conf</em>' containment reference.
	 * @see #getOwnedDataGenerationConf()
	 * @generated
	 */

	void setOwnedDataGenerationConf(GData value);




	/**
	 * Returns the value of the '<em><b>Owned Extension Gen Conf</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ExtensionGeneratrionConfiguration}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Extension Gen Conf</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Extension Gen Conf</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage#getGeneration_OwnedExtensionGenConf()
	 * @model containment="true"
	 * @generated
	 */

	EList<ExtensionGeneratrionConfiguration> getOwnedExtensionGenConf();





} // Generation
