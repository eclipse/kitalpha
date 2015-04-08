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

import org.polarsys.kitalpha.emde.model.ElementExtension;

import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety#getDal <em>Dal</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.ComponentSampleSafetyPackage#getSafety()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/kitalpha/ComponentSample/1.0.0#//AbstractComponent'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/resource/org.polarsys.kitalpha.vp.componentsample/models/ComponentSample.ecore#//AbstractComponent'"
 * @generated
 */

public interface Safety extends ComponentElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Criticality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.CRITICALITY}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criticality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criticality</em>' attribute.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.CRITICALITY
	 * @see #setCriticality(CRITICALITY)
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.ComponentSampleSafetyPackage#getSafety_Criticality()
	 * @model
	 * @generated
	 */

	CRITICALITY getCriticality();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety#getCriticality <em>Criticality</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality</em>' attribute.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.CRITICALITY
	 * @see #getCriticality()
	 * @generated
	 */

	void setCriticality(CRITICALITY value);

	/**
	 * Returns the value of the '<em><b>Dal</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.DAL_LEVEL}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dal</em>' attribute.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.DAL_LEVEL
	 * @see #setDal(DAL_LEVEL)
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.ComponentSampleSafetyPackage#getSafety_Dal()
	 * @model
	 * @generated
	 */

	DAL_LEVEL getDal();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety#getDal <em>Dal</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dal</em>' attribute.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.DAL_LEVEL
	 * @see #getDal()
	 * @generated
	 */

	void setDal(DAL_LEVEL value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.STATE}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.STATE
	 * @see #setState(STATE)
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.ComponentSampleSafetyPackage#getSafety_State()
	 * @model
	 * @generated
	 */

	STATE getState();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety#getState <em>State</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.STATE
	 * @see #getState()
	 * @generated
	 */

	void setState(STATE value);

} // Safety
