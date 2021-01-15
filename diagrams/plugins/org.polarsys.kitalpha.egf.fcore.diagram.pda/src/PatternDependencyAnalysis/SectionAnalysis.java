/**
 * Copyright (c) 2020 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 */
package PatternDependencyAnalysis;

import org.eclipse.egf.model.pattern.Pattern;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PatternDependencyAnalysis.SectionAnalysis#getSectionName <em>Section Name</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.SectionAnalysis#getContributingPatterns <em>Contributing Patterns</em>}</li>
 * </ul>
 *
 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getSectionAnalysis()
 * @model
 * @generated
 */
public interface SectionAnalysis extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2020 THALES GLOBAL SERVICES.\nThis program and the accompanying materials are made available under the\nterms of the Eclipse Public License 2.0 which is available at\nhttp://www.eclipse.org/legal/epl-2.0\n\nSPDX-License-Identifier: EPL-2.0\n \nContributors:\n  Thales - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Section Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Name</em>' attribute.
	 * @see #setSectionName(String)
	 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getSectionAnalysis_SectionName()
	 * @model required="true"
	 * @generated
	 */
	String getSectionName();

	/**
	 * Sets the value of the '{@link PatternDependencyAnalysis.SectionAnalysis#getSectionName <em>Section Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Name</em>' attribute.
	 * @see #getSectionName()
	 * @generated
	 */
	void setSectionName(String value);

	/**
	 * Returns the value of the '<em><b>Contributing Patterns</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.egf.model.pattern.Pattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributing Patterns</em>' reference list.
	 * @see PatternDependencyAnalysis.PatternDependencyAnalysisPackage#getSectionAnalysis_ContributingPatterns()
	 * @model
	 * @generated
	 */
	EList<Pattern> getContributingPatterns();

} // SectionAnalysis
