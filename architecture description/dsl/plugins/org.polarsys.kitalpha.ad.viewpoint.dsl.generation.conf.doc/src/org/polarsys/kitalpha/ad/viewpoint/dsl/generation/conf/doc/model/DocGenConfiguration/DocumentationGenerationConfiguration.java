/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ExtensionGeneratrionConfiguration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation Generation Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.DocumentationGenerationConfiguration#isGenerateDocumentation <em>Generate Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.DocGenConfigurationPackage#getDocumentationGenerationConfiguration()
 * @model
 * @generated
 */

public interface DocumentationGenerationConfiguration extends ExtensionGeneratrionConfiguration {





	/**
	 * Returns the value of the '<em><b>Generate Documentation</b></em>' attribute.
	 * The default value is <code>"false"</code>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Documentation</em>' attribute.
	 * @see #setGenerateDocumentation(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.DocGenConfigurationPackage#getDocumentationGenerationConfiguration_GenerateDocumentation()
	 * @model default="false"
	 * @generated
	 */

	boolean isGenerateDocumentation();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.DocumentationGenerationConfiguration#isGenerateDocumentation <em>Generate Documentation</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Documentation</em>' attribute.
	 * @see #isGenerateDocumentation()
	 * @generated
	 */

	void setGenerateDocumentation(boolean value);





} // DocumentationGenerationConfiguration
