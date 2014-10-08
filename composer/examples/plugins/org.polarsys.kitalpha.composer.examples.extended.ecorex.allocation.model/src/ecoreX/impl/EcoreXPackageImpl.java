/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecoreX.impl;

import ecoreX.EcoreXFactory;
import ecoreX.EcoreXPackage;
import ecoreX.ExtendedEPackage;
import ecoreX.ExtentedEClass;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreXPackageImpl extends EPackageImpl implements EcoreXPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extentedEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedEPackageEClass = null;

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
	 * @see ecoreX.EcoreXPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcoreXPackageImpl() {
		super(eNS_URI, EcoreXFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EcoreXPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcoreXPackage init() {
		if (isInited) return (EcoreXPackage)EPackage.Registry.INSTANCE.getEPackage(EcoreXPackage.eNS_URI);

		// Obtain or create and register package
		EcoreXPackageImpl theEcoreXPackage = (EcoreXPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcoreXPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcoreXPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEcoreXPackage.createPackageContents();

		// Initialize created meta-data
		theEcoreXPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcoreXPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcoreXPackage.eNS_URI, theEcoreXPackage);
		return theEcoreXPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtentedEClass() {
		return extentedEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtentedEClass_Description() {
		return (EAttribute)extentedEClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedEPackage() {
		return extendedEPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreXFactory getEcoreXFactory() {
		return (EcoreXFactory)getEFactoryInstance();
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
		extentedEClassEClass = createEClass(EXTENTED_ECLASS);
		createEAttribute(extentedEClassEClass, EXTENTED_ECLASS__DESCRIPTION);

		extendedEPackageEClass = createEClass(EXTENDED_EPACKAGE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		extentedEClassEClass.getESuperTypes().add(theEcorePackage.getEClass());
		extendedEPackageEClass.getESuperTypes().add(theEcorePackage.getEPackage());

		// Initialize classes and features; add operations and parameters
		initEClass(extentedEClassEClass, ExtentedEClass.class, "ExtentedEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtentedEClass_Description(), theEcorePackage.getEString(), "description", null, 0, 1, ExtentedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedEPackageEClass, ExtendedEPackage.class, "ExtendedEPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EcoreXPackageImpl
