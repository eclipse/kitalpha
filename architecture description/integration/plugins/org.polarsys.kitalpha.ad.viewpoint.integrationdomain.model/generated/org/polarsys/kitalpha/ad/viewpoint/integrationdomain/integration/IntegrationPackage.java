/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration;

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
 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.IntegrationFactory
 * @model kind="package"
 * @generated
 */
public interface IntegrationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "integration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/integration/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "integ";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntegrationPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.IntegrationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.IntegrationImpl <em>Integration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.IntegrationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.IntegrationPackageImpl#getIntegration()
	 * @generated
	 */
	int INTEGRATION = 0;

	/**
	 * The feature id for the '<em><b>Used Viewpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION__USED_VIEWPOINTS = 0;

	/**
	 * The number of structural features of the '<em>Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.UsedViewpointImpl <em>Used Viewpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.UsedViewpointImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.IntegrationPackageImpl#getUsedViewpoint()
	 * @generated
	 */
	int USED_VIEWPOINT = 1;

	/**
	 * The feature id for the '<em><b>Vp Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_VIEWPOINT__VP_ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_VIEWPOINT__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Filtered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_VIEWPOINT__FILTERED = 2;

	/**
	 * The number of structural features of the '<em>Used Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_VIEWPOINT_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.Integration <em>Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.Integration
	 * @generated
	 */
	EClass getIntegration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.Integration#getUsedViewpoints <em>Used Viewpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Used Viewpoints</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.Integration#getUsedViewpoints()
	 * @see #getIntegration()
	 * @generated
	 */
	EReference getIntegration_UsedViewpoints();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint <em>Used Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Used Viewpoint</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint
	 * @generated
	 */
	EClass getUsedViewpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint#getVpId <em>Vp Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vp Id</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint#getVpId()
	 * @see #getUsedViewpoint()
	 * @generated
	 */
	EAttribute getUsedViewpoint_VpId();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint#getVersion()
	 * @see #getUsedViewpoint()
	 * @generated
	 */
	EAttribute getUsedViewpoint_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint#isFiltered <em>Filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filtered</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint#isFiltered()
	 * @see #getUsedViewpoint()
	 * @generated
	 */
	EAttribute getUsedViewpoint_Filtered();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntegrationFactory getIntegrationFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.IntegrationImpl <em>Integration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.IntegrationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.IntegrationPackageImpl#getIntegration()
		 * @generated
		 */
		EClass INTEGRATION = eINSTANCE.getIntegration();

		/**
		 * The meta object literal for the '<em><b>Used Viewpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION__USED_VIEWPOINTS = eINSTANCE.getIntegration_UsedViewpoints();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.UsedViewpointImpl <em>Used Viewpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.UsedViewpointImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.IntegrationPackageImpl#getUsedViewpoint()
		 * @generated
		 */
		EClass USED_VIEWPOINT = eINSTANCE.getUsedViewpoint();

		/**
		 * The meta object literal for the '<em><b>Vp Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USED_VIEWPOINT__VP_ID = eINSTANCE.getUsedViewpoint_VpId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USED_VIEWPOINT__VERSION = eINSTANCE.getUsedViewpoint_Version();

		/**
		 * The meta object literal for the '<em><b>Filtered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USED_VIEWPOINT__FILTERED = eINSTANCE.getUsedViewpoint_Filtered();

	}

} //IntegrationPackage
