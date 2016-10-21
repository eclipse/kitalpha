/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ExtensionGeneratrionConfiguration;

import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocGenConfigurationPackage
 * @generated
 */
public class DocGenConfigurationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DocGenConfigurationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocGenConfigurationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DocGenConfigurationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocGenConfigurationSwitch<Adapter> modelSwitch =
		new DocGenConfigurationSwitch<Adapter>() {
			@Override
			public Adapter caseDocumentationGenerationConfiguration(DocumentationGenerationConfiguration object) {
				return createDocumentationGenerationConfigurationAdapter();
			}
			@Override
			public Adapter caseExtensionGeneratrionConfiguration(ExtensionGeneratrionConfiguration object) {
				return createExtensionGeneratrionConfigurationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocumentationGenerationConfiguration <em>Documentation Generation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocumentationGenerationConfiguration
	 * @generated
	 */
	public Adapter createDocumentationGenerationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ExtensionGeneratrionConfiguration <em>Extension Generatrion Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ExtensionGeneratrionConfiguration
	 * @generated
	 */
	public Adapter createExtensionGeneratrionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DocGenConfigurationAdapterFactory
