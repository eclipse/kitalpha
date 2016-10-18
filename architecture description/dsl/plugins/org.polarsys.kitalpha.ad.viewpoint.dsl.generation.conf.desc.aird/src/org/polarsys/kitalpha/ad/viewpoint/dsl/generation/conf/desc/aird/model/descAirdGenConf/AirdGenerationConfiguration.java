/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ExtensionGeneratrionConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aird Generation Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.AirdGenerationConfiguration#isGenRepresentations <em>Gen Representations</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.DescAirdGenConfPackage#getAirdGenerationConfiguration()
 * @model
 * @generated
 */
public interface AirdGenerationConfiguration extends ExtensionGeneratrionConfiguration {
	/**
	 * Returns the value of the '<em><b>Gen Representations</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Representations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Representations</em>' attribute.
	 * @see #setGenRepresentations(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.DescAirdGenConfPackage#getAirdGenerationConfiguration_GenRepresentations()
	 * @model default="false"
	 * @generated
	 */
	boolean isGenRepresentations();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.AirdGenerationConfiguration#isGenRepresentations <em>Gen Representations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Representations</em>' attribute.
	 * @see #isGenRepresentations()
	 * @generated
	 */
	void setGenRepresentations(boolean value);

} // AirdGenerationConfiguration
