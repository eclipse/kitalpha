/**
 */
package PatternDependencyAnalysis.impl;

import PatternDependencyAnalysis.PatternAnalysis;
import PatternDependencyAnalysis.PatternDependencyAnalysisFactory;
import PatternDependencyAnalysis.PatternDependencyAnalysisPackage;
import PatternDependencyAnalysis.PatternMethodAnalysis;
import PatternDependencyAnalysis.PatternParameterAnalysis;
import PatternDependencyAnalysis.Root;

import PatternDependencyAnalysis.SectionAnalysis;
import org.eclipse.egf.model.fcore.FcorePackage;

import org.eclipse.egf.model.pattern.PatternPackage;

import org.eclipse.egf.model.types.TypesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternDependencyAnalysisPackageImpl extends EPackageImpl implements PatternDependencyAnalysisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2020 THALES GLOBAL SERVICES.\nThis program and the accompanying materials are made available under the\nterms of the Eclipse Public License 2.0 which is available at\nhttp://www.eclipse.org/legal/epl-2.0\n\nSPDX-License-Identifier: EPL-2.0\n \nContributors:\n  Thales - initial API and implementation";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternMethodAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternParameterAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionAnalysisEClass = null;

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
	 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatternDependencyAnalysisPackageImpl() {
		super(eNS_URI, PatternDependencyAnalysisFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PatternDependencyAnalysisPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatternDependencyAnalysisPackage init() {
		if (isInited) return (PatternDependencyAnalysisPackage)EPackage.Registry.INSTANCE.getEPackage(PatternDependencyAnalysisPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPatternDependencyAnalysisPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PatternDependencyAnalysisPackageImpl thePatternDependencyAnalysisPackage = registeredPatternDependencyAnalysisPackage instanceof PatternDependencyAnalysisPackageImpl ? (PatternDependencyAnalysisPackageImpl)registeredPatternDependencyAnalysisPackage : new PatternDependencyAnalysisPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		FcorePackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePatternDependencyAnalysisPackage.createPackageContents();

		// Initialize created meta-data
		thePatternDependencyAnalysisPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePatternDependencyAnalysisPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatternDependencyAnalysisPackage.eNS_URI, thePatternDependencyAnalysisPackage);
		return thePatternDependencyAnalysisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Patterns() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_SectionsAnalyses() {
		return (EReference)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternAnalysis() {
		return patternAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternAnalysis_Pattern() {
		return (EReference)patternAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternAnalysis_SuperPattern() {
		return (EReference)patternAnalysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternAnalysis_Methods() {
		return (EReference)patternAnalysisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternAnalysis_Parameters() {
		return (EReference)patternAnalysisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternAnalysis_CalledBy() {
		return (EReference)patternAnalysisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternAnalysis_InheritedBy() {
		return (EReference)patternAnalysisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternMethodAnalysis() {
		return patternMethodAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternMethodAnalysis_Method() {
		return (EReference)patternMethodAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternMethodAnalysis_Calls() {
		return (EReference)patternMethodAnalysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternMethodAnalysis_Content() {
		return (EAttribute)patternMethodAnalysisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternMethodAnalysis_SectionContributions() {
		return (EAttribute)patternMethodAnalysisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternParameterAnalysis() {
		return patternParameterAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternParameterAnalysis_Name() {
		return (EAttribute)patternParameterAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternParameterAnalysis_Type() {
		return (EAttribute)patternParameterAnalysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSectionAnalysis() {
		return sectionAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionAnalysis_SectionName() {
		return (EAttribute)sectionAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionAnalysis_ContributingPatterns() {
		return (EReference)sectionAnalysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternDependencyAnalysisFactory getPatternDependencyAnalysisFactory() {
		return (PatternDependencyAnalysisFactory)getEFactoryInstance();
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
		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__PATTERNS);
		createEReference(rootEClass, ROOT__SECTIONS_ANALYSES);

		patternAnalysisEClass = createEClass(PATTERN_ANALYSIS);
		createEReference(patternAnalysisEClass, PATTERN_ANALYSIS__PATTERN);
		createEReference(patternAnalysisEClass, PATTERN_ANALYSIS__SUPER_PATTERN);
		createEReference(patternAnalysisEClass, PATTERN_ANALYSIS__METHODS);
		createEReference(patternAnalysisEClass, PATTERN_ANALYSIS__PARAMETERS);
		createEReference(patternAnalysisEClass, PATTERN_ANALYSIS__CALLED_BY);
		createEReference(patternAnalysisEClass, PATTERN_ANALYSIS__INHERITED_BY);

		patternMethodAnalysisEClass = createEClass(PATTERN_METHOD_ANALYSIS);
		createEReference(patternMethodAnalysisEClass, PATTERN_METHOD_ANALYSIS__METHOD);
		createEReference(patternMethodAnalysisEClass, PATTERN_METHOD_ANALYSIS__CALLS);
		createEAttribute(patternMethodAnalysisEClass, PATTERN_METHOD_ANALYSIS__CONTENT);
		createEAttribute(patternMethodAnalysisEClass, PATTERN_METHOD_ANALYSIS__SECTION_CONTRIBUTIONS);

		patternParameterAnalysisEClass = createEClass(PATTERN_PARAMETER_ANALYSIS);
		createEAttribute(patternParameterAnalysisEClass, PATTERN_PARAMETER_ANALYSIS__NAME);
		createEAttribute(patternParameterAnalysisEClass, PATTERN_PARAMETER_ANALYSIS__TYPE);

		sectionAnalysisEClass = createEClass(SECTION_ANALYSIS);
		createEAttribute(sectionAnalysisEClass, SECTION_ANALYSIS__SECTION_NAME);
		createEReference(sectionAnalysisEClass, SECTION_ANALYSIS__CONTRIBUTING_PATTERNS);
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
		PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Patterns(), this.getPatternAnalysis(), null, "patterns", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_SectionsAnalyses(), this.getSectionAnalysis(), null, "sectionsAnalyses", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternAnalysisEClass, PatternAnalysis.class, "PatternAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternAnalysis_Pattern(), thePatternPackage.getPattern(), null, "pattern", null, 1, 1, PatternAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternAnalysis_SuperPattern(), thePatternPackage.getPattern(), null, "superPattern", null, 0, 1, PatternAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternAnalysis_Methods(), this.getPatternMethodAnalysis(), null, "methods", null, 0, -1, PatternAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternAnalysis_Parameters(), this.getPatternParameterAnalysis(), null, "parameters", null, 0, -1, PatternAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternAnalysis_CalledBy(), thePatternPackage.getPattern(), null, "calledBy", null, 0, -1, PatternAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternAnalysis_InheritedBy(), thePatternPackage.getPattern(), null, "inheritedBy", null, 0, -1, PatternAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternMethodAnalysisEClass, PatternMethodAnalysis.class, "PatternMethodAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternMethodAnalysis_Method(), thePatternPackage.getPatternMethod(), null, "method", null, 1, 1, PatternMethodAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternMethodAnalysis_Calls(), this.getPatternAnalysis(), null, "calls", null, 0, -1, PatternMethodAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternMethodAnalysis_Content(), ecorePackage.getEString(), "content", null, 0, 1, PatternMethodAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternMethodAnalysis_SectionContributions(), ecorePackage.getEString(), "sectionContributions", null, 0, -1, PatternMethodAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternParameterAnalysisEClass, PatternParameterAnalysis.class, "PatternParameterAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternParameterAnalysis_Name(), ecorePackage.getEString(), "name", null, 1, 1, PatternParameterAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternParameterAnalysis_Type(), ecorePackage.getEString(), "type", null, 0, 1, PatternParameterAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionAnalysisEClass, SectionAnalysis.class, "SectionAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSectionAnalysis_SectionName(), theEcorePackage.getEString(), "sectionName", null, 1, 1, SectionAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSectionAnalysis_ContributingPatterns(), thePatternPackage.getPattern(), null, "contributingPatterns", null, 0, -1, SectionAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PatternDependencyAnalysisPackageImpl
