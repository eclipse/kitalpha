/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/extension extensibleProviderFactory='true' childCreationExtenders='true' useUUIDs='true' useIDAttributes='false'"
 * @generated
 */
public interface AfdescPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "afdesc"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/af/dsl/as/afdesc/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "afdesc"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AfdescPackage eINSTANCE = org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AfdescPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.NamedElementImpl
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AfdescPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__SHORT_NAME = 2;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ArchitectureFrameworkImpl <em>Architecture Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ArchitectureFrameworkImpl
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AfdescPackageImpl#getArchitectureFramework()
	 * @generated
	 */
	int ARCHITECTURE_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FRAMEWORK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FRAMEWORK__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FRAMEWORK__SHORT_NAME = NAMED_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Af aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FRAMEWORK__AF_ASPECTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Af viewpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FRAMEWORK__AF_VIEWPOINTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FRAMEWORK__OWNED_CONFIGURATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Architecture Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FRAMEWORK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AspectImpl
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AfdescPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__SHORT_NAME = NAMED_ELEMENT__SHORT_NAME;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ConfigurationImpl
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AfdescPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Owned element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__OWNED_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ConfigurationElementImpl <em>Configuration Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ConfigurationElementImpl
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AfdescPackageImpl#getConfigurationElement()
	 * @generated
	 */
	int CONFIGURATION_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Configuration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.GenerationConfigurationImpl <em>Generation Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.GenerationConfigurationImpl
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AfdescPackageImpl#getGenerationConfiguration()
	 * @generated
	 */
	int GENERATION_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Root Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION__ROOT_PROJECT_NAME = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ViewpointsImpl <em>Viewpoints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ViewpointsImpl
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AfdescPackageImpl#getViewpoints()
	 * @generated
	 */
	int VIEWPOINTS = 6;

	/**
	 * The feature id for the '<em><b>Owned viewpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINTS__OWNED_VIEWPOINTS = 0;

	/**
	 * The number of structural features of the '<em>Viewpoints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINTS_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework <em>Architecture Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Framework</em>'.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework
	 * @generated
	 */
	EClass getArchitectureFramework();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework#getAf_aspects <em>Af aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Af aspects</em>'.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework#getAf_aspects()
	 * @see #getArchitectureFramework()
	 * @generated
	 */
	EReference getArchitectureFramework_Af_aspects();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework#getAf_viewpoints <em>Af viewpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Af viewpoints</em>'.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework#getAf_viewpoints()
	 * @see #getArchitectureFramework()
	 * @generated
	 */
	EReference getArchitectureFramework_Af_viewpoints();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework#getOwned_configuration <em>Owned configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned configuration</em>'.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework#getOwned_configuration()
	 * @see #getArchitectureFramework()
	 * @generated
	 */
	EReference getArchitectureFramework_Owned_configuration();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.NamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.NamedElement#getDescription()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.NamedElement#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.NamedElement#getShortName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_ShortName();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Configuration#getOwned_element <em>Owned element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned element</em>'.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Configuration#getOwned_element()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Owned_element();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ConfigurationElement <em>Configuration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Element</em>'.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ConfigurationElement
	 * @generated
	 */
	EClass getConfigurationElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.GenerationConfiguration <em>Generation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation Configuration</em>'.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.GenerationConfiguration
	 * @generated
	 */
	EClass getGenerationConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.GenerationConfiguration#getRootProjectName <em>Root Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Project Name</em>'.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.GenerationConfiguration#getRootProjectName()
	 * @see #getGenerationConfiguration()
	 * @generated
	 */
	EAttribute getGenerationConfiguration_RootProjectName();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Viewpoints <em>Viewpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoints</em>'.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Viewpoints
	 * @generated
	 */
	EClass getViewpoints();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Viewpoints#getOwned_viewpoints <em>Owned viewpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned viewpoints</em>'.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Viewpoints#getOwned_viewpoints()
	 * @see #getViewpoints()
	 * @generated
	 */
	EReference getViewpoints_Owned_viewpoints();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AfdescFactory getAfdescFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ArchitectureFrameworkImpl <em>Architecture Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ArchitectureFrameworkImpl
		 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AfdescPackageImpl#getArchitectureFramework()
		 * @generated
		 */
		EClass ARCHITECTURE_FRAMEWORK = eINSTANCE.getArchitectureFramework();

		/**
		 * The meta object literal for the '<em><b>Af aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_FRAMEWORK__AF_ASPECTS = eINSTANCE.getArchitectureFramework_Af_aspects();

		/**
		 * The meta object literal for the '<em><b>Af viewpoints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_FRAMEWORK__AF_VIEWPOINTS = eINSTANCE.getArchitectureFramework_Af_viewpoints();

		/**
		 * The meta object literal for the '<em><b>Owned configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_FRAMEWORK__OWNED_CONFIGURATION = eINSTANCE.getArchitectureFramework_Owned_configuration();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AspectImpl
		 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AfdescPackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.NamedElementImpl
		 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AfdescPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getNamedElement_Description();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__SHORT_NAME = eINSTANCE.getNamedElement_ShortName();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ConfigurationImpl
		 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AfdescPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Owned element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__OWNED_ELEMENT = eINSTANCE.getConfiguration_Owned_element();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ConfigurationElementImpl <em>Configuration Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ConfigurationElementImpl
		 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AfdescPackageImpl#getConfigurationElement()
		 * @generated
		 */
		EClass CONFIGURATION_ELEMENT = eINSTANCE.getConfigurationElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.GenerationConfigurationImpl <em>Generation Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.GenerationConfigurationImpl
		 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AfdescPackageImpl#getGenerationConfiguration()
		 * @generated
		 */
		EClass GENERATION_CONFIGURATION = eINSTANCE.getGenerationConfiguration();

		/**
		 * The meta object literal for the '<em><b>Root Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_CONFIGURATION__ROOT_PROJECT_NAME = eINSTANCE.getGenerationConfiguration_RootProjectName();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ViewpointsImpl <em>Viewpoints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.ViewpointsImpl
		 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.AfdescPackageImpl#getViewpoints()
		 * @generated
		 */
		EClass VIEWPOINTS = eINSTANCE.getViewpoints();

		/**
		 * The meta object literal for the '<em><b>Owned viewpoints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINTS__OWNED_VIEWPOINTS = eINSTANCE.getViewpoints_Owned_viewpoints();

	}

} //AfdescPackage
