/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.diagram.DiagramPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.ConfigurationFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.ConfigurationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.DiagramGenerationConfiguration;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationPackageImpl extends EPackageImpl implements ConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramGenerationConfigurationEClass = null;

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
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.ConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationPackageImpl() {
		super(eNS_URI, ConfigurationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigurationPackage init() {
		if (isInited) return (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfigurationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommondataPackage.eINSTANCE.eClass();
		DiagramPackage.eINSTANCE.eClass();
		ExpressionPackage.eINSTANCE.eClass();
		VpconfPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		VpdiagramPackageImpl theVpdiagramPackage = (VpdiagramPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VpdiagramPackage.eNS_URI) instanceof VpdiagramPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VpdiagramPackage.eNS_URI) : VpdiagramPackage.eINSTANCE);

		// Create package meta-data objects
		theConfigurationPackage.createPackageContents();
		theVpdiagramPackage.createPackageContents();

		// Initialize created meta-data
		theConfigurationPackage.initializePackageContents();
		theVpdiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigurationPackage.eNS_URI, theConfigurationPackage);
		return theConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramGenerationConfiguration() {
		return diagramGenerationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramGenerationConfiguration_OverwriteVSM() {
		return (EAttribute)diagramGenerationConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFactory getConfigurationFactory() {
		return (ConfigurationFactory)getEFactoryInstance();
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
		diagramGenerationConfigurationEClass = createEClass(DIAGRAM_GENERATION_CONFIGURATION);
		createEAttribute(diagramGenerationConfigurationEClass, DIAGRAM_GENERATION_CONFIGURATION__OVERWRITE_VSM);
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

		// Obtain other dependent packages
		VpconfPackage theVpconfPackage = (VpconfPackage)EPackage.Registry.INSTANCE.getEPackage(VpconfPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		diagramGenerationConfigurationEClass.getESuperTypes().add(theVpconfPackage.getExtensionGeneratrionConfiguration());

		// Initialize classes and features; add operations and parameters
		initEClass(diagramGenerationConfigurationEClass, DiagramGenerationConfiguration.class, "DiagramGenerationConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagramGenerationConfiguration_OverwriteVSM(), ecorePackage.getEBoolean(), "overwriteVSM", null, 0, 1, DiagramGenerationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ConfigurationPackageImpl
