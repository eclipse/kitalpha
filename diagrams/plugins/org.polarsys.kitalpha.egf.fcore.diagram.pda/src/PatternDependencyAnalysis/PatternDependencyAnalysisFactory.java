/**
 */
package PatternDependencyAnalysis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage
 * @generated
 */
public interface PatternDependencyAnalysisFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2020 THALES GLOBAL SERVICES.\nThis program and the accompanying materials are made available under the\nterms of the Eclipse Public License 2.0 which is available at\nhttp://www.eclipse.org/legal/epl-2.0\n\nSPDX-License-Identifier: EPL-2.0\n \nContributors:\n  Thales - initial API and implementation";
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternDependencyAnalysisFactory eINSTANCE = PatternDependencyAnalysis.impl.PatternDependencyAnalysisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>Pattern Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Analysis</em>'.
	 * @generated
	 */
	PatternAnalysis createPatternAnalysis();

	/**
	 * Returns a new object of class '<em>Pattern Method Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Method Analysis</em>'.
	 * @generated
	 */
	PatternMethodAnalysis createPatternMethodAnalysis();

	/**
	 * Returns a new object of class '<em>Pattern Parameter Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Parameter Analysis</em>'.
	 * @generated
	 */
	PatternParameterAnalysis createPatternParameterAnalysis();

	/**
	 * Returns a new object of class '<em>Section Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section Analysis</em>'.
	 * @generated
	 */
	SectionAnalysis createSectionAnalysis();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatternDependencyAnalysisPackage getPatternDependencyAnalysisPackage();

} //PatternDependencyAnalysisFactory
