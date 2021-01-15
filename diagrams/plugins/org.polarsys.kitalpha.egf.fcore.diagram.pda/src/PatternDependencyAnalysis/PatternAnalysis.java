/**
 */
package PatternDependencyAnalysis;

import org.eclipse.egf.model.pattern.Pattern;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PatternDependencyAnalysis.PatternAnalysis#getPattern <em>Pattern</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.PatternAnalysis#getSuperPattern <em>Super Pattern</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.PatternAnalysis#getMethods <em>Methods</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.PatternAnalysis#getParameters <em>Parameters</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.PatternAnalysis#getCalledBy <em>Called By</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.PatternAnalysis#getInheritedBy <em>Inherited By</em>}</li>
 * </ul>
 *
 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getPatternAnalysis()
 * @model
 * @generated
 */
public interface PatternAnalysis extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2020 THALES GLOBAL SERVICES.\nThis program and the accompanying materials are made available under the\nterms of the Eclipse Public License 2.0 which is available at\nhttp://www.eclipse.org/legal/epl-2.0\n\nSPDX-License-Identifier: EPL-2.0\n \nContributors:\n  Thales - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' reference.
	 * @see #setPattern(Pattern)
	 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getPatternAnalysis_Pattern()
	 * @model required="true"
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link PatternDependencyAnalysis.PatternAnalysis#getPattern <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

	/**
	 * Returns the value of the '<em><b>Super Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Pattern</em>' reference.
	 * @see #setSuperPattern(Pattern)
	 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getPatternAnalysis_SuperPattern()
	 * @model
	 * @generated
	 */
	Pattern getSuperPattern();

	/**
	 * Sets the value of the '{@link PatternDependencyAnalysis.PatternAnalysis#getSuperPattern <em>Super Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Pattern</em>' reference.
	 * @see #getSuperPattern()
	 * @generated
	 */
	void setSuperPattern(Pattern value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link PatternDependencyAnalysis.PatternMethodAnalysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getPatternAnalysis_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatternMethodAnalysis> getMethods();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link PatternDependencyAnalysis.PatternParameterAnalysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getPatternAnalysis_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatternParameterAnalysis> getParameters();

	/**
	 * Returns the value of the '<em><b>Called By</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.egf.model.pattern.Pattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called By</em>' reference list.
	 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getPatternAnalysis_CalledBy()
	 * @model
	 * @generated
	 */
	EList<Pattern> getCalledBy();

	/**
	 * Returns the value of the '<em><b>Inherited By</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.egf.model.pattern.Pattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited By</em>' reference list.
	 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getPatternAnalysis_InheritedBy()
	 * @model
	 * @generated
	 */
	EList<Pattern> getInheritedBy();

} // PatternAnalysis
