/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ExtensionGeneratrionConfiguration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation Generation Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocumentationGenerationConfiguration#isEcoreToHtml <em>Ecore To Html</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocGenConfigurationPackage#getDocumentationGenerationConfiguration()
 * @model
 * @generated
 */

public interface DocumentationGenerationConfiguration extends ExtensionGeneratrionConfiguration {





	/**
	 * Returns the value of the '<em><b>Ecore To Html</b></em>' attribute.
	 * The default value is <code>"false"</code>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore To Html</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore To Html</em>' attribute.
	 * @see #setEcoreToHtml(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocGenConfigurationPackage#getDocumentationGenerationConfiguration_EcoreToHtml()
	 * @model default="false"
	 * @generated
	 */

	boolean isEcoreToHtml();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocumentationGenerationConfiguration#isEcoreToHtml <em>Ecore To Html</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore To Html</em>' attribute.
	 * @see #isEcoreToHtml()
	 * @generated
	 */

	void setEcoreToHtml(boolean value);





} // DocumentationGenerationConfiguration
