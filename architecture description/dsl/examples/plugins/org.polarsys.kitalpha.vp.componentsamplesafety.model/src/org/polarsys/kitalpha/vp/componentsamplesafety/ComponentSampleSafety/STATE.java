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
package org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>STATE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.ComponentSampleSafetyPackage#getSTATE()
 * @model
 * @generated
 */
public enum STATE implements Enumerator {
	/**
	 * The '<em><b>OPERATIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATIVE(0, "OPERATIVE", "OPERATIVE"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>LOST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOST_VALUE
	 * @generated
	 * @ordered
	 */
	LOST(1, "LOST", "LOST"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>ERRONEOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERRONEOUS_VALUE
	 * @generated
	 * @ordered
	 */
	ERRONEOUS(2, "ERRONEOUS", "ERRONEOUS"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>OPERATIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPERATIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIVE_VALUE = 0;

	/**
	 * The '<em><b>LOST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOST_VALUE = 1;

	/**
	 * The '<em><b>ERRONEOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERRONEOUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERRONEOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERRONEOUS_VALUE = 2;

	/**
	 * An array of all the '<em><b>STATE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final STATE[] VALUES_ARRAY = new STATE[] { OPERATIVE, LOST, ERRONEOUS, };

	/**
	 * A public read-only list of all the '<em><b>STATE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<STATE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>STATE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static STATE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			STATE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>STATE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static STATE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			STATE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>STATE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static STATE get(int value) {
		switch (value) {
		case OPERATIVE_VALUE:
			return OPERATIVE;
		case LOST_VALUE:
			return LOST;
		case ERRONEOUS_VALUE:
			return ERRONEOUS;
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
	private STATE(int value, String name, String literal) {
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

} //STATE
