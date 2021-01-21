/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyPackage#getModes <em>Modes</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.ComponentSampleSafetyPatternPackage#getSafetyPackage()
 * @model
 * @generated
 */

public interface SafetyPackage extends org.polarsys.kitalpha.vp.componentsample.ComponentSample.Package {

	/**
	 * Returns the value of the '<em><b>Modes</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyMode}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes</em>' containment reference list.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.ComponentSampleSafetyPatternPackage#getSafetyPackage_Modes()
	 * @model containment="true"
	 * @generated
	 */

	EList<SafetyMode> getModes();

} // SafetyPackage
