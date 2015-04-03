/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.Integration;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.IntegrationFactory;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.IntegrationPackage;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegrationPackageImpl extends EPackageImpl implements IntegrationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usedViewpointEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.IntegrationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegrationPackageImpl() {
		super(eNS_URI, IntegrationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IntegrationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntegrationPackage init() {
		if (isInited) return (IntegrationPackage)EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI);

		// Obtain or create and register package
		IntegrationPackageImpl theIntegrationPackage = (IntegrationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegrationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegrationPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIntegrationPackage.createPackageContents();

		// Initialize created meta-data
		theIntegrationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegrationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntegrationPackage.eNS_URI, theIntegrationPackage);
		return theIntegrationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegration() {
		return integrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegration_UsedViewpoints() {
		return (EReference)integrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsedViewpoint() {
		return usedViewpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsedViewpoint_VpId() {
		return (EAttribute)usedViewpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsedViewpoint_Version() {
		return (EAttribute)usedViewpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsedViewpoint_Filtered() {
		return (EAttribute)usedViewpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationFactory getIntegrationFactory() {
		return (IntegrationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		integrationEClass = createEClass(INTEGRATION);
		createEReference(integrationEClass, INTEGRATION__USED_VIEWPOINTS);

		usedViewpointEClass = createEClass(USED_VIEWPOINT);
		createEAttribute(usedViewpointEClass, USED_VIEWPOINT__VP_ID);
		createEAttribute(usedViewpointEClass, USED_VIEWPOINT__VERSION);
		createEAttribute(usedViewpointEClass, USED_VIEWPOINT__FILTERED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(integrationEClass, Integration.class, "Integration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegration_UsedViewpoints(), this.getUsedViewpoint(), null, "usedViewpoints", null, 0, -1, Integration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usedViewpointEClass, UsedViewpoint.class, "UsedViewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsedViewpoint_VpId(), ecorePackage.getEString(), "vpId", null, 1, 1, UsedViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsedViewpoint_Version(), ecorePackage.getEString(), "version", null, 0, 1, UsedViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsedViewpoint_Filtered(), ecorePackage.getEBoolean(), "filtered", null, 0, 1, UsedViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IntegrationPackageImpl
