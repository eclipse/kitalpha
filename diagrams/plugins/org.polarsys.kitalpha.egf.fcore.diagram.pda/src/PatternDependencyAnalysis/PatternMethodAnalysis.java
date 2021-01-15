/**
 */
package PatternDependencyAnalysis;

import org.eclipse.egf.model.pattern.PatternMethod;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Method Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PatternDependencyAnalysis.PatternMethodAnalysis#getMethod <em>Method</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.PatternMethodAnalysis#getCalls <em>Calls</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.PatternMethodAnalysis#getContent <em>Content</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.PatternMethodAnalysis#getSectionContributions <em>Section Contributions</em>}</li>
 * </ul>
 *
 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getPatternMethodAnalysis()
 * @model
 * @generated
 */
public interface PatternMethodAnalysis extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2020 THALES GLOBAL SERVICES.\nThis program and the accompanying materials are made available under the\nterms of the Eclipse Public License 2.0 which is available at\nhttp://www.eclipse.org/legal/epl-2.0\n\nSPDX-License-Identifier: EPL-2.0\n \nContributors:\n  Thales - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(PatternMethod)
	 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getPatternMethodAnalysis_Method()
	 * @model required="true"
	 * @generated
	 */
	PatternMethod getMethod();

	/**
	 * Sets the value of the '{@link PatternDependencyAnalysis.PatternMethodAnalysis#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(PatternMethod value);

	/**
	 * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
	 * The list contents are of type {@link PatternDependencyAnalysis.PatternAnalysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' containment reference list.
	 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getPatternMethodAnalysis_Calls()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatternAnalysis> getCalls();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getPatternMethodAnalysis_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link PatternDependencyAnalysis.PatternMethodAnalysis#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Section Contributions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Contributions</em>' attribute list.
	 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getPatternMethodAnalysis_SectionContributions()
	 * @model
	 * @generated
	 */
	EList<String> getSectionContributions();

} // PatternMethodAnalysis
