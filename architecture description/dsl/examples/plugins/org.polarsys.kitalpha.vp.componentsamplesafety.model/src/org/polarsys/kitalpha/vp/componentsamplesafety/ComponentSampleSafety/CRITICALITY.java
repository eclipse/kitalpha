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
package org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CRITICALITY</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.ComponentSampleSafetyPackage#getCRITICALITY()
 * @model
 * @generated
 */
public enum CRITICALITY implements Enumerator {
	/**
	 * The '<em><b>Catastrophic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATASTROPHIC_VALUE
	 * @generated
	 * @ordered
	 */
	CATASTROPHIC(0, "Catastrophic", "Catastrophic"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Hazardous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAZARDOUS_VALUE
	 * @generated
	 * @ordered
	 */
	HAZARDOUS(1, "Hazardous", "Hazardous"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Major</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJOR_VALUE
	 * @generated
	 * @ordered
	 */
	MAJOR(2, "Major", "Major"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Minor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR_VALUE
	 * @generated
	 * @ordered
	 */
	MINOR(3, "Minor", "Minor"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>No Safety Effect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SAFETY_EFFECT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_SAFETY_EFFECT(4, "No_Safety_Effect", "No_Safety_Effect"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Catastrophic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Catastrophic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CATASTROPHIC
	 * @model name="Catastrophic"
	 * @generated
	 * @ordered
	 */
	public static final int CATASTROPHIC_VALUE = 0;

	/**
	 * The '<em><b>Hazardous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hazardous</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HAZARDOUS
	 * @model name="Hazardous"
	 * @generated
	 * @ordered
	 */
	public static final int HAZARDOUS_VALUE = 1;

	/**
	 * The '<em><b>Major</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Major</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAJOR
	 * @model name="Major"
	 * @generated
	 * @ordered
	 */
	public static final int MAJOR_VALUE = 2;

	/**
	 * The '<em><b>Minor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINOR
	 * @model name="Minor"
	 * @generated
	 * @ordered
	 */
	public static final int MINOR_VALUE = 3;

	/**
	 * The '<em><b>No Safety Effect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Safety Effect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_SAFETY_EFFECT
	 * @model name="No_Safety_Effect"
	 * @generated
	 * @ordered
	 */
	public static final int NO_SAFETY_EFFECT_VALUE = 4;

	/**
	 * An array of all the '<em><b>CRITICALITY</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CRITICALITY[] VALUES_ARRAY = new CRITICALITY[] { CATASTROPHIC, HAZARDOUS, MAJOR, MINOR,
			NO_SAFETY_EFFECT, };

	/**
	 * A public read-only list of all the '<em><b>CRITICALITY</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CRITICALITY> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CRITICALITY</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CRITICALITY get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CRITICALITY result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CRITICALITY</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CRITICALITY getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CRITICALITY result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CRITICALITY</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CRITICALITY get(int value) {
		switch (value) {
		case CATASTROPHIC_VALUE:
			return CATASTROPHIC;
		case HAZARDOUS_VALUE:
			return HAZARDOUS;
		case MAJOR_VALUE:
			return MAJOR;
		case MINOR_VALUE:
			return MINOR;
		case NO_SAFETY_EFFECT_VALUE:
			return NO_SAFETY_EFFECT;
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
	private CRITICALITY(int value, String name, String literal) {
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

} //CRITICALITY
