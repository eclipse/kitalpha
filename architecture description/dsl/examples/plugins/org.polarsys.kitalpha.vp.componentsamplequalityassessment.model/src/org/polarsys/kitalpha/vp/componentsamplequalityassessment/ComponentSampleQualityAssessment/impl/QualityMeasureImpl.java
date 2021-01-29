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
package org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentElementImpl;
import org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentPackage;
import org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityMeasure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.QualityMeasureImpl#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.QualityMeasureImpl#getMeasureValue <em>Measure Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityMeasureImpl extends ComponentElementImpl implements QualityMeasure {

	/**
	 * The default value of the '{@link #getCriterion() <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITERION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCriterion() <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected String criterion = CRITERION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasureValue() <em>Measure Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MEASURE_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMeasureValue() <em>Measure Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureValue()
	 * @generated
	 * @ordered
	 */
	protected int measureValue = MEASURE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityMeasureImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentSampleQualityAssessmentPackage.Literals.QUALITY_MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getCriterion() {

		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setCriterion(String newCriterion) {

		String oldCriterion = criterion;
		criterion = newCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentSampleQualityAssessmentPackage.QUALITY_MEASURE__CRITERION, oldCriterion, criterion));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getMeasureValue() {

		return measureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMeasureValue(int newMeasureValue) {

		int oldMeasureValue = measureValue;
		measureValue = newMeasureValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentSampleQualityAssessmentPackage.QUALITY_MEASURE__MEASURE_VALUE, oldMeasureValue,
					measureValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentSampleQualityAssessmentPackage.QUALITY_MEASURE__CRITERION:
			return getCriterion();
		case ComponentSampleQualityAssessmentPackage.QUALITY_MEASURE__MEASURE_VALUE:
			return getMeasureValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ComponentSampleQualityAssessmentPackage.QUALITY_MEASURE__CRITERION:
			setCriterion((String) newValue);
			return;
		case ComponentSampleQualityAssessmentPackage.QUALITY_MEASURE__MEASURE_VALUE:
			setMeasureValue((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ComponentSampleQualityAssessmentPackage.QUALITY_MEASURE__CRITERION:
			setCriterion(CRITERION_EDEFAULT);
			return;
		case ComponentSampleQualityAssessmentPackage.QUALITY_MEASURE__MEASURE_VALUE:
			setMeasureValue(MEASURE_VALUE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ComponentSampleQualityAssessmentPackage.QUALITY_MEASURE__CRITERION:
			return CRITERION_EDEFAULT == null ? criterion != null : !CRITERION_EDEFAULT.equals(criterion);
		case ComponentSampleQualityAssessmentPackage.QUALITY_MEASURE__MEASURE_VALUE:
			return measureValue != MEASURE_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (criterion: "); //$NON-NLS-1$
		result.append(criterion);
		result.append(", measureValue: "); //$NON-NLS-1$
		result.append(measureValue);
		result.append(')');
		return result.toString();
	}

} //QualityMeasureImpl