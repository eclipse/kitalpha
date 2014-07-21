/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ExtensionGeneratrionConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Generation Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.DiagramGenerationConfiguration#isOverwriteVSM <em>Overwrite VSM</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.ConfigurationPackage#getDiagramGenerationConfiguration()
 * @model
 * @generated
 */
public interface DiagramGenerationConfiguration extends ExtensionGeneratrionConfiguration {
	/**
	 * Returns the value of the '<em><b>Overwrite VSM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overwrite VSM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overwrite VSM</em>' attribute.
	 * @see #setOverwriteVSM(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.ConfigurationPackage#getDiagramGenerationConfiguration_OverwriteVSM()
	 * @model
	 * @generated
	 */
	boolean isOverwriteVSM();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.DiagramGenerationConfiguration#isOverwriteVSM <em>Overwrite VSM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overwrite VSM</em>' attribute.
	 * @see #isOverwriteVSM()
	 * @generated
	 */
	void setOverwriteVSM(boolean value);

} // DiagramGenerationConfiguration
