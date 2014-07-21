/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cardinalities</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getCardinalities()
 * @model
 * @generated
 */
public enum Cardinalities implements Enumerator {
	//$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Nothing Or One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTHING_OR_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	NOTHING_OR_ONE(0, "Nothing_Or_One", "0..1"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Only One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONLY_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ONLY_ONE(1, "Only_One", "1"), /**
	 * The '<em><b>Nothing Or Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
													 * <!-- end-user-doc -->
	 * @see #NOTHING_OR_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	NOTHING_OR_MANY(2, "Nothing_Or_Many", "0..*"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>One Or Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_OR_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_OR_MANY(3, "One_Or_Many", "1..*"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Nothing Or One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nothing Or One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTHING_OR_ONE
	 * @model name="Nothing_Or_One" literal="0..1"
	 * @generated
	 * @ordered
	 */
	public static final int NOTHING_OR_ONE_VALUE = 0;

	/**
	 * The '<em><b>Only One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Only One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONLY_ONE
	 * @model name="Only_One" literal="1"
	 * @generated
	 * @ordered
	 */
	public static final int ONLY_ONE_VALUE = 1;

	/**
	 * The '<em><b>Nothing Or Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nothing Or Many</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTHING_OR_MANY
	 * @model name="Nothing_Or_Many" literal="0..*"
	 * @generated
	 * @ordered
	 */
	public static final int NOTHING_OR_MANY_VALUE = 2;

	/**
	 * The '<em><b>One Or Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One Or Many</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_OR_MANY
	 * @model name="One_Or_Many" literal="1..*"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_OR_MANY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Cardinalities</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Cardinalities[] VALUES_ARRAY = new Cardinalities[] {
			NOTHING_OR_ONE,
			ONLY_ONE,
			NOTHING_OR_MANY,
			ONE_OR_MANY,
		};

	/**
	 * A public read-only list of all the '<em><b>Cardinalities</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Cardinalities> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cardinalities</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cardinalities get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Cardinalities result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cardinalities</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cardinalities getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Cardinalities result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cardinalities</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cardinalities get(int value) {
		switch (value) {
			case NOTHING_OR_ONE_VALUE: return NOTHING_OR_ONE;
			case ONLY_ONE_VALUE: return ONLY_ONE;
			case NOTHING_OR_MANY_VALUE: return NOTHING_OR_MANY;
			case ONE_OR_MANY_VALUE: return ONE_OR_MANY;
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
	private Cardinalities(int value, String name, String literal) {
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
	
	/**
	 * @return True if multiple cardinality. false otherwise
	 * @generated NOT
	 */
	public boolean isMultiple(){
		switch (value) {
			case NOTHING_OR_ONE_VALUE: 
			case ONLY_ONE_VALUE: return false;
			case NOTHING_OR_MANY_VALUE: 
			case ONE_OR_MANY_VALUE: return true;
		}
		return false;
	}

} //Cardinalities
