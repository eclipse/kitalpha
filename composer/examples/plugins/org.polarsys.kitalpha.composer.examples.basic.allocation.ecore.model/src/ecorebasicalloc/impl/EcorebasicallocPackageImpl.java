/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecorebasicalloc.impl;

import org.polarsys.kitalpha.composer.metamodel.allocation.base.BasePackage;

import ecorebasicalloc.EcoreClass;
import ecorebasicalloc.EcoreFile;
import ecorebasicalloc.EcoreRoot;
import ecorebasicalloc.EcorebasicallocFactory;
import ecorebasicalloc.EcorebasicallocPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcorebasicallocPackageImpl extends EPackageImpl implements EcorebasicallocPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreRootEClass = null;

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
	 * @see ecorebasicalloc.EcorebasicallocPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcorebasicallocPackageImpl() {
		super(eNS_URI, EcorebasicallocFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcorebasicallocPackage init() {
		if (isInited) return (EcorebasicallocPackage)EPackage.Registry.INSTANCE.getEPackage(EcorebasicallocPackage.eNS_URI);

		// Obtain or create and register package
		EcorebasicallocPackageImpl theEcorebasicallocPackage = (EcorebasicallocPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof EcorebasicallocPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new EcorebasicallocPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEcorebasicallocPackage.createPackageContents();

		// Initialize created meta-data
		theEcorebasicallocPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcorebasicallocPackage.freeze();

		return theEcorebasicallocPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreClass() {
		return ecoreClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreFile() {
		return ecoreFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreRoot() {
		return ecoreRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcorebasicallocFactory getEcorebasicallocFactory() {
		return (EcorebasicallocFactory)getEFactoryInstance();
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
		ecoreClassEClass = createEClass(ECORE_CLASS);

		ecoreFileEClass = createEClass(ECORE_FILE);

		ecoreRootEClass = createEClass(ECORE_ROOT);
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
		ecoreClassEClass.getESuperTypes().add(theBasePackage.getType());
		ecoreFileEClass.getESuperTypes().add(theBasePackage.getFile());
		ecoreRootEClass.getESuperTypes().add(theBasePackage.getRoot());

		// Initialize classes and features; add operations and parameters
		initEClass(ecoreClassEClass, EcoreClass.class, "EcoreClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ecoreFileEClass, EcoreFile.class, "EcoreFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ecoreRootEClass, EcoreRoot.class, "EcoreRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EcorebasicallocPackageImpl
