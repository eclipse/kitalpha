/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.AirdGenerationConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.DescAirdGenConfFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.DescAirdGenConfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescAirdGenConfPackageImpl extends EPackageImpl implements DescAirdGenConfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass airdGenerationConfigurationEClass = null;

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
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.DescAirdGenConfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DescAirdGenConfPackageImpl() {
		super(eNS_URI, DescAirdGenConfFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DescAirdGenConfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DescAirdGenConfPackage init() {
		if (isInited) {
			return (DescAirdGenConfPackage)EPackage.Registry.INSTANCE.getEPackage(DescAirdGenConfPackage.eNS_URI);
		}

		// Obtain or create and register package
		DescAirdGenConfPackageImpl theDescAirdGenConfPackage = (DescAirdGenConfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DescAirdGenConfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DescAirdGenConfPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		VpconfPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDescAirdGenConfPackage.createPackageContents();

		// Initialize created meta-data
		theDescAirdGenConfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDescAirdGenConfPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DescAirdGenConfPackage.eNS_URI, theDescAirdGenConfPackage);
		return theDescAirdGenConfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAirdGenerationConfiguration() {
		return airdGenerationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAirdGenerationConfiguration_GenRepresentations() {
		return (EAttribute)airdGenerationConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescAirdGenConfFactory getDescAirdGenConfFactory() {
		return (DescAirdGenConfFactory)getEFactoryInstance();
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
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		airdGenerationConfigurationEClass = createEClass(AIRD_GENERATION_CONFIGURATION);
		createEAttribute(airdGenerationConfigurationEClass, AIRD_GENERATION_CONFIGURATION__GEN_REPRESENTATIONS);
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
		if (isInitialized) {
			return;
		}
		
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		VpconfPackage theVpconfPackage = (VpconfPackage)EPackage.Registry.INSTANCE.getEPackage(VpconfPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		airdGenerationConfigurationEClass.getESuperTypes().add(theVpconfPackage.getExtensionGeneratrionConfiguration());

		// Initialize classes and features; add operations and parameters
		initEClass(airdGenerationConfigurationEClass, AirdGenerationConfiguration.class, "AirdGenerationConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAirdGenerationConfiguration_GenRepresentations(), ecorePackage.getEBoolean(), "genRepresentations", "false", 0, 1, AirdGenerationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DescAirdGenConfPackageImpl
