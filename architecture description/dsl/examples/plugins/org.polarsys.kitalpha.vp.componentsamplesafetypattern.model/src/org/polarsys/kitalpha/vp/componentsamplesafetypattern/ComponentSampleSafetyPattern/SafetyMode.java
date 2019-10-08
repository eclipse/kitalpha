/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern;

import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyMode#getInvolvedComponents <em>Involved Components</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyMode#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.ComponentSampleSafetyPatternPackage#getSafetyMode()
 * @model
 * @generated
 */

public interface SafetyMode extends Safety {

	/**
	 * Returns the value of the '<em><b>Involved Components</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Components</em>' reference list.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.ComponentSampleSafetyPatternPackage#getSafetyMode_InvolvedComponents()
	 * @model
	 * @generated
	 */

	EList<Safety> getInvolvedComponents();

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SAFETY_PATTERN}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SAFETY_PATTERN
	 * @see #setPattern(SAFETY_PATTERN)
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.ComponentSampleSafetyPatternPackage#getSafetyMode_Pattern()
	 * @model
	 * @generated
	 */

	SAFETY_PATTERN getPattern();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyMode#getPattern <em>Pattern</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SAFETY_PATTERN
	 * @see #getPattern()
	 * @generated
	 */

	void setPattern(SAFETY_PATTERN value);

} // SafetyMode
