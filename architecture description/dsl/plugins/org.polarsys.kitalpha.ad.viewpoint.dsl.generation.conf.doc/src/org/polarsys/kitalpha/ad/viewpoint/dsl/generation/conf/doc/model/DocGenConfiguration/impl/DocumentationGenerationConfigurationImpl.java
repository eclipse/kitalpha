/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ExtensionGeneratrionConfigurationImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.DocGenConfigurationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.DocumentationGenerationConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation Generation Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.DocGenConfiguration.impl.DocumentationGenerationConfigurationImpl#isGenerateDocumentation <em>Generate Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentationGenerationConfigurationImpl extends ExtensionGeneratrionConfigurationImpl implements DocumentationGenerationConfiguration {

	/**
	 * The default value of the '{@link #isGenerateDocumentation() <em>Generate Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_DOCUMENTATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateDocumentation() <em>Generate Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateDocumentation()
	 * @generated
	 * @ordered
	 */
	protected boolean generateDocumentation = GENERATE_DOCUMENTATION_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationGenerationConfigurationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocGenConfigurationPackage.Literals.DOCUMENTATION_GENERATION_CONFIGURATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isGenerateDocumentation() {

		return generateDocumentation;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setGenerateDocumentation(boolean newGenerateDocumentation) {

		boolean oldGenerateDocumentation = generateDocumentation;
		generateDocumentation = newGenerateDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocGenConfigurationPackage.DOCUMENTATION_GENERATION_CONFIGURATION__GENERATE_DOCUMENTATION, oldGenerateDocumentation, generateDocumentation));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocGenConfigurationPackage.DOCUMENTATION_GENERATION_CONFIGURATION__GENERATE_DOCUMENTATION:
				return isGenerateDocumentation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocGenConfigurationPackage.DOCUMENTATION_GENERATION_CONFIGURATION__GENERATE_DOCUMENTATION:
				setGenerateDocumentation((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DocGenConfigurationPackage.DOCUMENTATION_GENERATION_CONFIGURATION__GENERATE_DOCUMENTATION:
				setGenerateDocumentation(GENERATE_DOCUMENTATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DocGenConfigurationPackage.DOCUMENTATION_GENERATION_CONFIGURATION__GENERATE_DOCUMENTATION:
				return generateDocumentation != GENERATE_DOCUMENTATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (generateDocumentation: ");
		result.append(generateDocumentation);
		result.append(')');
		return result.toString();
	}


} //DocumentationGenerationConfigurationImpl
