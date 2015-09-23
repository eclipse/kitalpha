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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Node Form</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getNode_Form()
 * @model
 * @generated
 */
public enum Node_Form implements Enumerator {
	/**
	 * The '<em><b>Square</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE_VALUE
	 * @generated
	 * @ordered
	 */
	SQUARE(0, "Square", "Square"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Lozenge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOZENGE_VALUE
	 * @generated
	 * @ordered
	 */
	LOZENGE(1, "Lozenge", "Lozenge"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Eclipse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECLIPSE_VALUE
	 * @generated
	 * @ordered
	 */
	ECLIPSE(2, "Eclipse", "Eclipse"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Note</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTE_VALUE
	 * @generated
	 * @ordered
	 */
	NOTE(3, "Note", "Note"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Dot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOT_VALUE
	 * @generated
	 * @ordered
	 */
	DOT(4, "Dot", "Dot"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Triangle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	TRIANGLE(5, "Triangle", "Triangle"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Stroke</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STROKE_VALUE
	 * @generated
	 * @ordered
	 */
	STROKE(6, "Stroke", "Stroke"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Ring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RING_VALUE
	 * @generated
	 * @ordered
	 */
	RING(7, "Ring", "Ring"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Square</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Square</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQUARE
	 * @model name="Square"
	 * @generated
	 * @ordered
	 */
	public static final int SQUARE_VALUE = 0;

	/**
	 * The '<em><b>Lozenge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lozenge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOZENGE
	 * @model name="Lozenge"
	 * @generated
	 * @ordered
	 */
	public static final int LOZENGE_VALUE = 1;

	/**
	 * The '<em><b>Eclipse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eclipse</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ECLIPSE
	 * @model name="Eclipse"
	 * @generated
	 * @ordered
	 */
	public static final int ECLIPSE_VALUE = 2;

	/**
	 * The '<em><b>Note</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Note</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTE
	 * @model name="Note"
	 * @generated
	 * @ordered
	 */
	public static final int NOTE_VALUE = 3;

	/**
	 * The '<em><b>Dot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOT
	 * @model name="Dot"
	 * @generated
	 * @ordered
	 */
	public static final int DOT_VALUE = 4;

	/**
	 * The '<em><b>Triangle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Triangle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIANGLE
	 * @model name="Triangle"
	 * @generated
	 * @ordered
	 */
	public static final int TRIANGLE_VALUE = 5;

	/**
	 * The '<em><b>Stroke</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stroke</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STROKE
	 * @model name="Stroke"
	 * @generated
	 * @ordered
	 */
	public static final int STROKE_VALUE = 6;

	/**
	 * The '<em><b>Ring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ring</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RING
	 * @model name="Ring"
	 * @generated
	 * @ordered
	 */
	public static final int RING_VALUE = 7;

	/**
	 * An array of all the '<em><b>Node Form</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Node_Form[] VALUES_ARRAY = new Node_Form[] {
			SQUARE,
			LOZENGE,
			ECLIPSE,
			NOTE,
			DOT,
			TRIANGLE,
			STROKE,
			RING,
		};

	/**
	 * A public read-only list of all the '<em><b>Node Form</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Node_Form> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Node Form</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Node_Form get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Node_Form result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Form</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Node_Form getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Node_Form result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Form</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Node_Form get(int value) {
		switch (value) {
			case SQUARE_VALUE: return SQUARE;
			case LOZENGE_VALUE: return LOZENGE;
			case ECLIPSE_VALUE: return ECLIPSE;
			case NOTE_VALUE: return NOTE;
			case DOT_VALUE: return DOT;
			case TRIANGLE_VALUE: return TRIANGLE;
			case STROKE_VALUE: return STROKE;
			case RING_VALUE: return RING;
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
	private Node_Form(int value, String name, String literal) {
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

} //Node_Form
