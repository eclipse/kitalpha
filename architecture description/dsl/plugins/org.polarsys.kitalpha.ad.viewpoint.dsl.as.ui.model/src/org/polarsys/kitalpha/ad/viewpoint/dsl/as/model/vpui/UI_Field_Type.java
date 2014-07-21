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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>UI Field Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage#getUI_Field_Type()
 * @model
 * @generated
 */
public enum UI_Field_Type implements Enumerator {
	/**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(0, "text", "text"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Textarea</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTAREA_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTAREA(1, "textarea", "textarea"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Checkbox</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKBOX(2, "checkbox", "checkbox"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Radiobox</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIOBOX_VALUE
	 * @generated
	 * @ordered
	 */
	RADIOBOX(3, "radiobox", "radiobox"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Simple Choice List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_CHOICE_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_CHOICE_LIST(4, "simpleChoiceList", "simpleChoiceList"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Multiple Choice List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_CHOICE_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_CHOICE_LIST(5, "multipleChoiceList", "multipleChoiceList"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model name="text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 0;

	/**
	 * The '<em><b>Textarea</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Textarea</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXTAREA
	 * @model name="textarea"
	 * @generated
	 * @ordered
	 */
	public static final int TEXTAREA_VALUE = 1;

	/**
	 * The '<em><b>Checkbox</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Checkbox</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX
	 * @model name="checkbox"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKBOX_VALUE = 2;

	/**
	 * The '<em><b>Radiobox</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Radiobox</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIOBOX
	 * @model name="radiobox"
	 * @generated
	 * @ordered
	 */
	public static final int RADIOBOX_VALUE = 3;

	/**
	 * The '<em><b>Simple Choice List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Simple Choice List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_CHOICE_LIST
	 * @model name="simpleChoiceList"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_CHOICE_LIST_VALUE = 4;

	/**
	 * The '<em><b>Multiple Choice List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiple Choice List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_CHOICE_LIST
	 * @model name="multipleChoiceList"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_CHOICE_LIST_VALUE = 5;

	/**
	 * An array of all the '<em><b>UI Field Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UI_Field_Type[] VALUES_ARRAY = new UI_Field_Type[] {
			TEXT,
			TEXTAREA,
			CHECKBOX,
			RADIOBOX,
			SIMPLE_CHOICE_LIST,
			MULTIPLE_CHOICE_LIST,
		};

	/**
	 * A public read-only list of all the '<em><b>UI Field Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UI_Field_Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>UI Field Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UI_Field_Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UI_Field_Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>UI Field Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UI_Field_Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UI_Field_Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>UI Field Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UI_Field_Type get(int value) {
		switch (value) {
			case TEXT_VALUE: return TEXT;
			case TEXTAREA_VALUE: return TEXTAREA;
			case CHECKBOX_VALUE: return CHECKBOX;
			case RADIOBOX_VALUE: return RADIOBOX;
			case SIMPLE_CHOICE_LIST_VALUE: return SIMPLE_CHOICE_LIST;
			case MULTIPLE_CHOICE_LIST_VALUE: return MULTIPLE_CHOICE_LIST;
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
	private UI_Field_Type(int value, String name, String literal) {
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

} //UI_Field_Type
