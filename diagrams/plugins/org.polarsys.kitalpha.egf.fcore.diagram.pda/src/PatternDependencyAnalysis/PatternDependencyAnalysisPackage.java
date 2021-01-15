/**
 */
package PatternDependencyAnalysis;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see PatternDependencyAnalysis.PatternDependencyAnalysisFactory
 * @model kind="package"
 * @generated
 */
public interface PatternDependencyAnalysisPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2020 THALES GLOBAL SERVICES.\nThis program and the accompanying materials are made available under the\nterms of the Eclipse Public License 2.0 which is available at\nhttp://www.eclipse.org/legal/epl-2.0\n\nSPDX-License-Identifier: EPL-2.0\n \nContributors:\n  Thales - initial API and implementation";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PatternDependencyAnalysis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://org.polarsys.kitalpha.ecore.diagram/PatternDependencyAnalysis/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PatternDependencyAnalysis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternDependencyAnalysisPackage eINSTANCE = PatternDependencyAnalysis.impl.PatternDependencyAnalysisPackageImpl.init();

	/**
	 * The meta object id for the '{@link PatternDependencyAnalysis.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PatternDependencyAnalysis.impl.RootImpl
	 * @see PatternDependencyAnalysis.impl.PatternDependencyAnalysisPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__PATTERNS = 0;

	/**
	 * The feature id for the '<em><b>Sections Analyses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__SECTIONS_ANALYSES = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PatternDependencyAnalysis.impl.PatternAnalysisImpl <em>Pattern Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PatternDependencyAnalysis.impl.PatternAnalysisImpl
	 * @see PatternDependencyAnalysis.impl.PatternDependencyAnalysisPackageImpl#getPatternAnalysis()
	 * @generated
	 */
	int PATTERN_ANALYSIS = 1;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ANALYSIS__PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Super Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ANALYSIS__SUPER_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ANALYSIS__METHODS = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ANALYSIS__PARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Called By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ANALYSIS__CALLED_BY = 4;

	/**
	 * The feature id for the '<em><b>Inherited By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ANALYSIS__INHERITED_BY = 5;

	/**
	 * The number of structural features of the '<em>Pattern Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ANALYSIS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Pattern Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ANALYSIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PatternDependencyAnalysis.impl.PatternMethodAnalysisImpl <em>Pattern Method Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PatternDependencyAnalysis.impl.PatternMethodAnalysisImpl
	 * @see PatternDependencyAnalysis.impl.PatternDependencyAnalysisPackageImpl#getPatternMethodAnalysis()
	 * @generated
	 */
	int PATTERN_METHOD_ANALYSIS = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_METHOD_ANALYSIS__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_METHOD_ANALYSIS__CALLS = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_METHOD_ANALYSIS__CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Section Contributions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_METHOD_ANALYSIS__SECTION_CONTRIBUTIONS = 3;

	/**
	 * The number of structural features of the '<em>Pattern Method Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_METHOD_ANALYSIS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pattern Method Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_METHOD_ANALYSIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PatternDependencyAnalysis.impl.PatternParameterAnalysisImpl <em>Pattern Parameter Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PatternDependencyAnalysis.impl.PatternParameterAnalysisImpl
	 * @see PatternDependencyAnalysis.impl.PatternDependencyAnalysisPackageImpl#getPatternParameterAnalysis()
	 * @generated
	 */
	int PATTERN_PARAMETER_ANALYSIS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_ANALYSIS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_ANALYSIS__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Pattern Parameter Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_ANALYSIS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pattern Parameter Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_ANALYSIS_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link PatternDependencyAnalysis.impl.SectionAnalysisImpl <em>Section Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PatternDependencyAnalysis.impl.SectionAnalysisImpl
	 * @see PatternDependencyAnalysis.impl.PatternDependencyAnalysisPackageImpl#getSectionAnalysis()
	 * @generated
	 */
	int SECTION_ANALYSIS = 4;

	/**
	 * The feature id for the '<em><b>Section Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_ANALYSIS__SECTION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Contributing Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_ANALYSIS__CONTRIBUTING_PATTERNS = 1;

	/**
	 * The number of structural features of the '<em>Section Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_ANALYSIS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Section Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_ANALYSIS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link PatternDependencyAnalysis.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see PatternDependencyAnalysis.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link PatternDependencyAnalysis.Root#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patterns</em>'.
	 * @see PatternDependencyAnalysis.Root#getPatterns()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Patterns();

	/**
	 * Returns the meta object for the containment reference list '{@link PatternDependencyAnalysis.Root#getSectionsAnalyses <em>Sections Analyses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections Analyses</em>'.
	 * @see PatternDependencyAnalysis.Root#getSectionsAnalyses()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_SectionsAnalyses();

	/**
	 * Returns the meta object for class '{@link PatternDependencyAnalysis.PatternAnalysis <em>Pattern Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Analysis</em>'.
	 * @see PatternDependencyAnalysis.PatternAnalysis
	 * @generated
	 */
	EClass getPatternAnalysis();

	/**
	 * Returns the meta object for the reference '{@link PatternDependencyAnalysis.PatternAnalysis#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pattern</em>'.
	 * @see PatternDependencyAnalysis.PatternAnalysis#getPattern()
	 * @see #getPatternAnalysis()
	 * @generated
	 */
	EReference getPatternAnalysis_Pattern();

	/**
	 * Returns the meta object for the reference '{@link PatternDependencyAnalysis.PatternAnalysis#getSuperPattern <em>Super Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Pattern</em>'.
	 * @see PatternDependencyAnalysis.PatternAnalysis#getSuperPattern()
	 * @see #getPatternAnalysis()
	 * @generated
	 */
	EReference getPatternAnalysis_SuperPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link PatternDependencyAnalysis.PatternAnalysis#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see PatternDependencyAnalysis.PatternAnalysis#getMethods()
	 * @see #getPatternAnalysis()
	 * @generated
	 */
	EReference getPatternAnalysis_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link PatternDependencyAnalysis.PatternAnalysis#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see PatternDependencyAnalysis.PatternAnalysis#getParameters()
	 * @see #getPatternAnalysis()
	 * @generated
	 */
	EReference getPatternAnalysis_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link PatternDependencyAnalysis.PatternAnalysis#getCalledBy <em>Called By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Called By</em>'.
	 * @see PatternDependencyAnalysis.PatternAnalysis#getCalledBy()
	 * @see #getPatternAnalysis()
	 * @generated
	 */
	EReference getPatternAnalysis_CalledBy();

	/**
	 * Returns the meta object for the reference list '{@link PatternDependencyAnalysis.PatternAnalysis#getInheritedBy <em>Inherited By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherited By</em>'.
	 * @see PatternDependencyAnalysis.PatternAnalysis#getInheritedBy()
	 * @see #getPatternAnalysis()
	 * @generated
	 */
	EReference getPatternAnalysis_InheritedBy();

	/**
	 * Returns the meta object for class '{@link PatternDependencyAnalysis.PatternMethodAnalysis <em>Pattern Method Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Method Analysis</em>'.
	 * @see PatternDependencyAnalysis.PatternMethodAnalysis
	 * @generated
	 */
	EClass getPatternMethodAnalysis();

	/**
	 * Returns the meta object for the reference '{@link PatternDependencyAnalysis.PatternMethodAnalysis#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see PatternDependencyAnalysis.PatternMethodAnalysis#getMethod()
	 * @see #getPatternMethodAnalysis()
	 * @generated
	 */
	EReference getPatternMethodAnalysis_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link PatternDependencyAnalysis.PatternMethodAnalysis#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls</em>'.
	 * @see PatternDependencyAnalysis.PatternMethodAnalysis#getCalls()
	 * @see #getPatternMethodAnalysis()
	 * @generated
	 */
	EReference getPatternMethodAnalysis_Calls();

	/**
	 * Returns the meta object for the attribute '{@link PatternDependencyAnalysis.PatternMethodAnalysis#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see PatternDependencyAnalysis.PatternMethodAnalysis#getContent()
	 * @see #getPatternMethodAnalysis()
	 * @generated
	 */
	EAttribute getPatternMethodAnalysis_Content();

	/**
	 * Returns the meta object for the attribute list '{@link PatternDependencyAnalysis.PatternMethodAnalysis#getSectionContributions <em>Section Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Section Contributions</em>'.
	 * @see PatternDependencyAnalysis.PatternMethodAnalysis#getSectionContributions()
	 * @see #getPatternMethodAnalysis()
	 * @generated
	 */
	EAttribute getPatternMethodAnalysis_SectionContributions();

	/**
	 * Returns the meta object for class '{@link PatternDependencyAnalysis.PatternParameterAnalysis <em>Pattern Parameter Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Parameter Analysis</em>'.
	 * @see PatternDependencyAnalysis.PatternParameterAnalysis
	 * @generated
	 */
	EClass getPatternParameterAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link PatternDependencyAnalysis.PatternParameterAnalysis#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PatternDependencyAnalysis.PatternParameterAnalysis#getName()
	 * @see #getPatternParameterAnalysis()
	 * @generated
	 */
	EAttribute getPatternParameterAnalysis_Name();

	/**
	 * Returns the meta object for the attribute '{@link PatternDependencyAnalysis.PatternParameterAnalysis#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see PatternDependencyAnalysis.PatternParameterAnalysis#getType()
	 * @see #getPatternParameterAnalysis()
	 * @generated
	 */
	EAttribute getPatternParameterAnalysis_Type();

	/**
	 * Returns the meta object for class '{@link PatternDependencyAnalysis.SectionAnalysis <em>Section Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Analysis</em>'.
	 * @see PatternDependencyAnalysis.SectionAnalysis
	 * @generated
	 */
	EClass getSectionAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link PatternDependencyAnalysis.SectionAnalysis#getSectionName <em>Section Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section Name</em>'.
	 * @see PatternDependencyAnalysis.SectionAnalysis#getSectionName()
	 * @see #getSectionAnalysis()
	 * @generated
	 */
	EAttribute getSectionAnalysis_SectionName();

	/**
	 * Returns the meta object for the reference list '{@link PatternDependencyAnalysis.SectionAnalysis#getContributingPatterns <em>Contributing Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributing Patterns</em>'.
	 * @see PatternDependencyAnalysis.SectionAnalysis#getContributingPatterns()
	 * @see #getSectionAnalysis()
	 * @generated
	 */
	EReference getSectionAnalysis_ContributingPatterns();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternDependencyAnalysisFactory getPatternDependencyAnalysisFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link PatternDependencyAnalysis.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PatternDependencyAnalysis.impl.RootImpl
		 * @see PatternDependencyAnalysis.impl.PatternDependencyAnalysisPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__PATTERNS = eINSTANCE.getRoot_Patterns();

		/**
		 * The meta object literal for the '<em><b>Sections Analyses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__SECTIONS_ANALYSES = eINSTANCE.getRoot_SectionsAnalyses();

		/**
		 * The meta object literal for the '{@link PatternDependencyAnalysis.impl.PatternAnalysisImpl <em>Pattern Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PatternDependencyAnalysis.impl.PatternAnalysisImpl
		 * @see PatternDependencyAnalysis.impl.PatternDependencyAnalysisPackageImpl#getPatternAnalysis()
		 * @generated
		 */
		EClass PATTERN_ANALYSIS = eINSTANCE.getPatternAnalysis();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ANALYSIS__PATTERN = eINSTANCE.getPatternAnalysis_Pattern();

		/**
		 * The meta object literal for the '<em><b>Super Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ANALYSIS__SUPER_PATTERN = eINSTANCE.getPatternAnalysis_SuperPattern();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ANALYSIS__METHODS = eINSTANCE.getPatternAnalysis_Methods();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ANALYSIS__PARAMETERS = eINSTANCE.getPatternAnalysis_Parameters();

		/**
		 * The meta object literal for the '<em><b>Called By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ANALYSIS__CALLED_BY = eINSTANCE.getPatternAnalysis_CalledBy();

		/**
		 * The meta object literal for the '<em><b>Inherited By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ANALYSIS__INHERITED_BY = eINSTANCE.getPatternAnalysis_InheritedBy();

		/**
		 * The meta object literal for the '{@link PatternDependencyAnalysis.impl.PatternMethodAnalysisImpl <em>Pattern Method Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PatternDependencyAnalysis.impl.PatternMethodAnalysisImpl
		 * @see PatternDependencyAnalysis.impl.PatternDependencyAnalysisPackageImpl#getPatternMethodAnalysis()
		 * @generated
		 */
		EClass PATTERN_METHOD_ANALYSIS = eINSTANCE.getPatternMethodAnalysis();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_METHOD_ANALYSIS__METHOD = eINSTANCE.getPatternMethodAnalysis_Method();

		/**
		 * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_METHOD_ANALYSIS__CALLS = eINSTANCE.getPatternMethodAnalysis_Calls();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_METHOD_ANALYSIS__CONTENT = eINSTANCE.getPatternMethodAnalysis_Content();

		/**
		 * The meta object literal for the '<em><b>Section Contributions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_METHOD_ANALYSIS__SECTION_CONTRIBUTIONS = eINSTANCE.getPatternMethodAnalysis_SectionContributions();

		/**
		 * The meta object literal for the '{@link PatternDependencyAnalysis.impl.PatternParameterAnalysisImpl <em>Pattern Parameter Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PatternDependencyAnalysis.impl.PatternParameterAnalysisImpl
		 * @see PatternDependencyAnalysis.impl.PatternDependencyAnalysisPackageImpl#getPatternParameterAnalysis()
		 * @generated
		 */
		EClass PATTERN_PARAMETER_ANALYSIS = eINSTANCE.getPatternParameterAnalysis();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PARAMETER_ANALYSIS__NAME = eINSTANCE.getPatternParameterAnalysis_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PARAMETER_ANALYSIS__TYPE = eINSTANCE.getPatternParameterAnalysis_Type();

		/**
		 * The meta object literal for the '{@link PatternDependencyAnalysis.impl.SectionAnalysisImpl <em>Section Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PatternDependencyAnalysis.impl.SectionAnalysisImpl
		 * @see PatternDependencyAnalysis.impl.PatternDependencyAnalysisPackageImpl#getSectionAnalysis()
		 * @generated
		 */
		EClass SECTION_ANALYSIS = eINSTANCE.getSectionAnalysis();

		/**
		 * The meta object literal for the '<em><b>Section Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_ANALYSIS__SECTION_NAME = eINSTANCE.getSectionAnalysis_SectionName();

		/**
		 * The meta object literal for the '<em><b>Contributing Patterns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_ANALYSIS__CONTRIBUTING_PATTERNS = eINSTANCE.getSectionAnalysis_ContributingPatterns();

	}

} //PatternDependencyAnalysisPackage
