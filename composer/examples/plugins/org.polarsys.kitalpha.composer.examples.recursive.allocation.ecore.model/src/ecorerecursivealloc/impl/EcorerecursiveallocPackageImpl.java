/**
 */
package ecorerecursivealloc.impl;

import org.polarsys.kitalpha.composer.metamodel.allocation.base.BasePackage;

import ecorerecursivealloc.EcoreAllocFile;
import ecorerecursivealloc.EcoreAllocRoot;
import ecorerecursivealloc.EcoreAllocType;
import ecorerecursivealloc.EcorerecursiveallocFactory;
import ecorerecursivealloc.EcorerecursiveallocPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcorerecursiveallocPackageImpl extends EPackageImpl implements EcorerecursiveallocPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreAllocRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreAllocFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreAllocTypeEClass = null;

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
	 * @see ecorerecursivealloc.EcorerecursiveallocPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcorerecursiveallocPackageImpl() {
		super(eNS_URI, EcorerecursiveallocFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EcorerecursiveallocPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcorerecursiveallocPackage init() {
		if (isInited) return (EcorerecursiveallocPackage)EPackage.Registry.INSTANCE.getEPackage(EcorerecursiveallocPackage.eNS_URI);

		// Obtain or create and register package
		EcorerecursiveallocPackageImpl theEcorerecursiveallocPackage = (EcorerecursiveallocPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcorerecursiveallocPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcorerecursiveallocPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEcorerecursiveallocPackage.createPackageContents();

		// Initialize created meta-data
		theEcorerecursiveallocPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcorerecursiveallocPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcorerecursiveallocPackage.eNS_URI, theEcorerecursiveallocPackage);
		return theEcorerecursiveallocPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreAllocRoot() {
		return ecoreAllocRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreAllocFile() {
		return ecoreAllocFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreAllocType() {
		return ecoreAllocTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcorerecursiveallocFactory getEcorerecursiveallocFactory() {
		return (EcorerecursiveallocFactory)getEFactoryInstance();
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
		ecoreAllocRootEClass = createEClass(ECORE_ALLOC_ROOT);

		ecoreAllocFileEClass = createEClass(ECORE_ALLOC_FILE);

		ecoreAllocTypeEClass = createEClass(ECORE_ALLOC_TYPE);
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
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ecoreAllocRootEClass.getESuperTypes().add(theBasePackage.getRoot());
		ecoreAllocFileEClass.getESuperTypes().add(theBasePackage.getFile());
		ecoreAllocTypeEClass.getESuperTypes().add(theBasePackage.getType());

		// Initialize classes and features; add operations and parameters
		initEClass(ecoreAllocRootEClass, EcoreAllocRoot.class, "EcoreAllocRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ecoreAllocFileEClass, EcoreAllocFile.class, "EcoreAllocFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ecoreAllocTypeEClass, EcoreAllocType.class, "EcoreAllocType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EcorerecursiveallocPackageImpl
