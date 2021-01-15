/**
 */
package PatternDependencyAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PatternDependencyAnalysis.Root#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.Root#getSectionsAnalyses <em>Sections Analyses</em>}</li>
 * </ul>
 *
 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2020 THALES GLOBAL SERVICES.\nThis program and the accompanying materials are made available under the\nterms of the Eclipse Public License 2.0 which is available at\nhttp://www.eclipse.org/legal/epl-2.0\n\nSPDX-License-Identifier: EPL-2.0\n \nContributors:\n  Thales - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link PatternDependencyAnalysis.PatternAnalysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference list.
	 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getRoot_Patterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatternAnalysis> getPatterns();

	/**
	 * Returns the value of the '<em><b>Sections Analyses</b></em>' containment reference list.
	 * The list contents are of type {@link PatternDependencyAnalysis.SectionAnalysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections Analyses</em>' containment reference list.
	 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getRoot_SectionsAnalyses()
	 * @model containment="true"
	 * @generated
	 */
	EList<SectionAnalysis> getSectionsAnalyses();

} // Root
