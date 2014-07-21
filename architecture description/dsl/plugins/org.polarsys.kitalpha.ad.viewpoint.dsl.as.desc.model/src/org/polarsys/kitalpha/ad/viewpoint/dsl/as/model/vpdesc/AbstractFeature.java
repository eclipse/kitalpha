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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isChangeable <em>Changeable</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isDerived <em>Derived</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isTransient <em>Transient</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isUnsettable <em>Unsettable</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isVolatile <em>Volatile</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getAbstractFeature()
 * @model abstract="true"
 * @generated
 */
public interface AbstractFeature extends AnnotatableElement {

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The default value is <code>"0..1"</code>.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities
	 * @see #setCardinality(Cardinalities)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getAbstractFeature_Cardinality()
	 * @model default="0..1"
	 * @generated
	 */

	Cardinalities getCardinality();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#getCardinality <em>Cardinality</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities
	 * @see #getCardinality()
	 * @generated
	 */

	void setCardinality(Cardinalities value);

	/**
	 * Returns the value of the '<em><b>Changeable</b></em>' attribute.
	 * The default value is <code>"true"</code>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable</em>' attribute.
	 * @see #setChangeable(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getAbstractFeature_Changeable()
	 * @model default="true"
	 * @generated
	 */

	boolean isChangeable();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isChangeable <em>Changeable</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeable</em>' attribute.
	 * @see #isChangeable()
	 * @generated
	 */

	void setChangeable(boolean value);

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getAbstractFeature_Derived()
	 * @model
	 * @generated
	 */

	boolean isDerived();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isDerived <em>Derived</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */

	void setDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * The default value is <code>"true"</code>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getAbstractFeature_Ordered()
	 * @model default="true"
	 * @generated
	 */

	boolean isOrdered();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isOrdered <em>Ordered</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */

	void setOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getAbstractFeature_Transient()
	 * @model
	 * @generated
	 */

	boolean isTransient();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isTransient <em>Transient</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */

	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getAbstractFeature_Unique()
	 * @model default="true"
	 * @generated
	 */

	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isUnique <em>Unique</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */

	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Unsettable</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsettable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsettable</em>' attribute.
	 * @see #setUnsettable(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getAbstractFeature_Unsettable()
	 * @model
	 * @generated
	 */

	boolean isUnsettable();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isUnsettable <em>Unsettable</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsettable</em>' attribute.
	 * @see #isUnsettable()
	 * @generated
	 */

	void setUnsettable(boolean value);

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getAbstractFeature_Volatile()
	 * @model
	 * @generated
	 */

	boolean isVolatile();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isVolatile <em>Volatile</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #isVolatile()
	 * @generated
	 */

	void setVolatile(boolean value);

} // AbstractFeature
