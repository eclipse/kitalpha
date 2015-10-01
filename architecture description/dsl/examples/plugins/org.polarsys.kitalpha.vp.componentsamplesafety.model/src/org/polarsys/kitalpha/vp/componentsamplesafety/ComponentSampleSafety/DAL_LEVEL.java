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
package org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DAL LEVEL</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.ComponentSampleSafetyPackage#getDAL_LEVEL()
 * @model
 * @generated
 */
public enum DAL_LEVEL implements Enumerator {
	/**
	 * The '<em><b>DAL A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAL_A_VALUE
	 * @generated
	 * @ordered
	 */
	DAL_A(0, "DAL_A", "DAL_A"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DAL B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAL_B_VALUE
	 * @generated
	 * @ordered
	 */
	DAL_B(1, "DAL_B", "DAL_B"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DAL C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAL_C_VALUE
	 * @generated
	 * @ordered
	 */
	DAL_C(2, "DAL_C", "DAL_C"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DAL D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAL_D_VALUE
	 * @generated
	 * @ordered
	 */
	DAL_D(3, "DAL_D", "DAL_D"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DAL E</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAL_E_VALUE
	 * @generated
	 * @ordered
	 */
	DAL_E(4, "DAL_E", "DAL_E"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DAL A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAL A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAL_A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAL_A_VALUE = 0;

	/**
	 * The '<em><b>DAL B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAL B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAL_B
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAL_B_VALUE = 1;

	/**
	 * The '<em><b>DAL C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAL C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAL_C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAL_C_VALUE = 2;

	/**
	 * The '<em><b>DAL D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAL D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAL_D
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAL_D_VALUE = 3;

	/**
	 * The '<em><b>DAL E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAL E</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAL_E
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAL_E_VALUE = 4;

	/**
	 * An array of all the '<em><b>DAL LEVEL</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DAL_LEVEL[] VALUES_ARRAY = new DAL_LEVEL[] { DAL_A, DAL_B, DAL_C, DAL_D, DAL_E, };

	/**
	 * A public read-only list of all the '<em><b>DAL LEVEL</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DAL_LEVEL> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DAL LEVEL</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DAL_LEVEL get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DAL_LEVEL result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DAL LEVEL</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DAL_LEVEL getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DAL_LEVEL result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DAL LEVEL</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DAL_LEVEL get(int value) {
		switch (value) {
		case DAL_A_VALUE:
			return DAL_A;
		case DAL_B_VALUE:
			return DAL_B;
		case DAL_C_VALUE:
			return DAL_C;
		case DAL_D_VALUE:
			return DAL_D;
		case DAL_E_VALUE:
			return DAL_E;
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
	private DAL_LEVEL(int value, String name, String literal) {
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

} //DAL_LEVEL
