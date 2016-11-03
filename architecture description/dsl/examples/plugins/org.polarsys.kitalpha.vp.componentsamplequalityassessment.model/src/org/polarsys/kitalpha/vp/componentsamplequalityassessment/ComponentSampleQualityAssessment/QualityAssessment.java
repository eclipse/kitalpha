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
package org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment;

import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getContext <em>Context</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getMeasures <em>Measures</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getMaturityLevel <em>Maturity Level</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getConfidenceLevel <em>Confidence Level</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#isAssessed <em>Assessed</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentPackage#getQualityAssessment()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/kitalpha/ComponentSample/1.0.0#//AbstractComponent'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/resource/org.polarsys.kitalpha.vp.componentsample/models/ComponentSample.ecore#//AbstractComponent'"
 * @generated
 */

public interface QualityAssessment extends ComponentElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On</em>' reference list.
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentPackage#getQualityAssessment_BasedOn()
	 * @model
	 * @generated
	 */

	EList<QualityAssessment> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference list.
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentPackage#getQualityAssessment_Context()
	 * @model
	 * @generated
	 */

	EList<ComponentElement> getContext();

	/**
	 * Returns the value of the '<em><b>Measures</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityMeasure}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measures</em>' containment reference list.
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentPackage#getQualityAssessment_Measures()
	 * @model containment="true"
	 * @generated
	 */

	EList<QualityMeasure> getMeasures();

	/**
	 * Returns the value of the '<em><b>Maturity Level</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maturity Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maturity Level</em>' attribute.
	 * @see #setMaturityLevel(String)
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentPackage#getQualityAssessment_MaturityLevel()
	 * @model
	 * @generated
	 */

	String getMaturityLevel();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getMaturityLevel <em>Maturity Level</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maturity Level</em>' attribute.
	 * @see #getMaturityLevel()
	 * @generated
	 */

	void setMaturityLevel(String value);

	/**
	 * Returns the value of the '<em><b>Confidence Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.confidenceLevel_Type}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confidence Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidence Level</em>' attribute.
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.confidenceLevel_Type
	 * @see #setConfidenceLevel(confidenceLevel_Type)
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentPackage#getQualityAssessment_ConfidenceLevel()
	 * @model
	 * @generated
	 */

	confidenceLevel_Type getConfidenceLevel();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#getConfidenceLevel <em>Confidence Level</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence Level</em>' attribute.
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.confidenceLevel_Type
	 * @see #getConfidenceLevel()
	 * @generated
	 */

	void setConfidenceLevel(confidenceLevel_Type value);

	/**
	 * Returns the value of the '<em><b>Assessed</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessed</em>' attribute.
	 * @see #setAssessed(boolean)
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentPackage#getQualityAssessment_Assessed()
	 * @model
	 * @generated
	 */

	boolean isAssessed();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment#isAssessed <em>Assessed</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessed</em>' attribute.
	 * @see #isAssessed()
	 * @generated
	 */

	void setAssessed(boolean value);

} // QualityAssessment
