/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>confidence Level Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentPackage#getconfidenceLevel_Type()
 * @model
 * @generated
 */
public enum confidenceLevel_Type implements Enumerator {
	/**
	 * The '<em><b>Not Assessed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_ASSESSED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_ASSESSED(0, "Not_Assessed", "Not Assessed"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Low</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_VALUE
	 * @generated
	 * @ordered
	 */
	LOW(1, "Low", "Low"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Medium</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUM(2, "Medium", "Medium"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>High</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH(3, "High", "High"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Not Assessed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Assessed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_ASSESSED
	 * @model name="Not_Assessed" literal="Not Assessed"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_ASSESSED_VALUE = 0;

	/**
	 * The '<em><b>Low</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Low</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOW
	 * @model name="Low"
	 * @generated
	 * @ordered
	 */
	public static final int LOW_VALUE = 1;

	/**
	 * The '<em><b>Medium</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medium</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIUM
	 * @model name="Medium"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_VALUE = 2;

	/**
	 * The '<em><b>High</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>High</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH
	 * @model name="High"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_VALUE = 3;

	/**
	 * An array of all the '<em><b>confidence Level Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final confidenceLevel_Type[] VALUES_ARRAY = new confidenceLevel_Type[] {
			NOT_ASSESSED, LOW, MEDIUM, HIGH, };

	/**
	 * A public read-only list of all the '<em><b>confidence Level Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<confidenceLevel_Type> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>confidence Level Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static confidenceLevel_Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			confidenceLevel_Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>confidence Level Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static confidenceLevel_Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			confidenceLevel_Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>confidence Level Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static confidenceLevel_Type get(int value) {
		switch (value) {
		case NOT_ASSESSED_VALUE:
			return NOT_ASSESSED;
		case LOW_VALUE:
			return LOW;
		case MEDIUM_VALUE:
			return MEDIUM;
		case HIGH_VALUE:
			return HIGH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private confidenceLevel_Type(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //confidenceLevel_Type
