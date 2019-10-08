
package org.polarsys.capella.example.capellatags.CapellaTags.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.impl.CapellacorePackageImpl;
import org.polarsys.capella.example.capellatags.CapellaTags.CapellaTag;
import org.polarsys.capella.example.capellatags.CapellaTags.CapellaTagsFactory;
import org.polarsys.capella.example.capellatags.CapellaTags.CapellaTagsPackage;
import org.polarsys.kitalpha.emde.model.EmdePackage;
import org.polarsys.kitalpha.example.tags.tags.TagsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapellaTagsPackageImpl extends EPackageImpl implements CapellaTagsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capellaTagEClass = null;

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
	 * @see org.polarsys.capella.example.capellatags.CapellaTags.CapellaTagsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CapellaTagsPackageImpl() {
		super(eNS_URI, CapellaTagsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CapellaTagsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CapellaTagsPackage init() {
		if (isInited)
			return (CapellaTagsPackage) EPackage.Registry.INSTANCE.getEPackage(CapellaTagsPackage.eNS_URI);

		// Obtain or create and register package
		CapellaTagsPackageImpl theCapellaTagsPackage = (CapellaTagsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CapellaTagsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new CapellaTagsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		EmdePackage.eINSTANCE.eClass();
		TagsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CapellacorePackageImpl theCapellacorePackage = (CapellacorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CapellacorePackage.eNS_URI) instanceof CapellacorePackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI)
						: CapellacorePackage.eINSTANCE);

		// Create package meta-data objects
		theCapellaTagsPackage.createPackageContents();
		theCapellacorePackage.createPackageContents();

		// Initialize created meta-data
		theCapellaTagsPackage.initializePackageContents();
		theCapellacorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCapellaTagsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CapellaTagsPackage.eNS_URI, theCapellaTagsPackage);
		return theCapellaTagsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapellaTag() {
		return capellaTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapellaTag_ModelElement() {
		return (EReference) capellaTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellaTagsFactory getCapellaTagsFactory() {
		return (CapellaTagsFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		capellaTagEClass = createEClass(CAPELLA_TAG);
		createEReference(capellaTagEClass, CAPELLA_TAG__MODEL_ELEMENT);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TagsPackage theTagsPackage = (TagsPackage) EPackage.Registry.INSTANCE.getEPackage(TagsPackage.eNS_URI);
		EmdePackage theEmdePackage = (EmdePackage) EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI);
		CapellacorePackage theCapellacorePackage = (CapellacorePackage) EPackage.Registry.INSTANCE
				.getEPackage(CapellacorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		capellaTagEClass.getESuperTypes().add(theTagsPackage.getTag());
		capellaTagEClass.getESuperTypes().add(theEmdePackage.getElementExtension());

		// Initialize classes and features; add operations and parameters
		initEClass(capellaTagEClass, CapellaTag.class, "CapellaTag", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapellaTag_ModelElement(), theCapellacorePackage.getNamedElement(), null, "modelElement", //$NON-NLS-1$
				null, 1, 1, CapellaTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraint
		createConstraintAnnotations();
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping
		createConstraintMappingAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraint</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraint"; //$NON-NLS-1$	
		addAnnotation(capellaTagEClass, source,
				new String[] { "ExtendedElement", " http://www.polarsys.org/capella/core/core/1.0.0#//CapellaElement" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintMappingAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping"; //$NON-NLS-1$	
		addAnnotation(capellaTagEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/plugin/org.polarsys.capella.core.data.gen/model/CapellaCore.ecore#//CapellaElement" //$NON-NLS-1$
		});
	}

} //CapellaTagsPackageImpl
