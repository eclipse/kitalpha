/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocGenConfigurationFactoryImpl extends EFactoryImpl implements DocGenConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DocGenConfigurationFactory init() {
		try {
			DocGenConfigurationFactory theDocGenConfigurationFactory = (DocGenConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory(DocGenConfigurationPackage.eNS_URI);
			if (theDocGenConfigurationFactory != null) {
				return theDocGenConfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DocGenConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocGenConfigurationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DocGenConfigurationPackage.DOCUMENTATION_GENERATION_CONFIGURATION: return createDocumentationGenerationConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationGenerationConfiguration createDocumentationGenerationConfiguration() {
		DocumentationGenerationConfigurationImpl documentationGenerationConfiguration = new DocumentationGenerationConfigurationImpl();
		return documentationGenerationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocGenConfigurationPackage getDocGenConfigurationPackage() {
		return (DocGenConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DocGenConfigurationPackage getPackage() {
		return DocGenConfigurationPackage.eINSTANCE;
	}

} //DocGenConfigurationFactoryImpl
