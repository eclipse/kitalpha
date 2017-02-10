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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Protocol Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getProtocolType()
 * @model
 * @generated
 */
public enum ProtocolType implements Enumerator {
	/**
	 * The '<em><b>Git</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIT_VALUE
	 * @generated
	 * @ordered
	 */
	GIT(0, "git", "git"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Svn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SVN_VALUE
	 * @generated
	 * @ordered
	 */
	SVN(1, "svn", "svn"),
	/**
	 * The '<em><b>Svnssh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SVNSSH_VALUE
	 * @generated
	 * @ordered
	 */
	SVNSSH(2, "svnssh", "svnssh"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Git</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Git</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GIT
	 * @model name="git"
	 * @generated
	 * @ordered
	 */
	public static final int GIT_VALUE = 0;

	/**
	 * The '<em><b>Svn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Svn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SVN
	 * @model name="svn"
	 * @generated
	 * @ordered
	 */
	public static final int SVN_VALUE = 1;

	/**
	 * The '<em><b>Svnssh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Svnssh</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SVNSSH
	 * @model name="svnssh"
	 * @generated
	 * @ordered
	 */
	public static final int SVNSSH_VALUE = 2;

	/**
	 * An array of all the '<em><b>Protocol Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProtocolType[] VALUES_ARRAY = new ProtocolType[] { GIT, SVN, SVNSSH, };

	/**
	 * A public read-only list of all the '<em><b>Protocol Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProtocolType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Protocol Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolType get(int value) {
		switch (value) {
		case GIT_VALUE:
			return GIT;
		case SVN_VALUE:
			return SVN;
		case SVNSSH_VALUE:
			return SVNSSH;
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
	private ProtocolType(int value, String name, String literal) {
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

} //ProtocolType
