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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentElementImpl;
import org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentPackage;
import org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment;
import org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityMeasure;
import org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.confidenceLevel_Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.QualityAssessmentImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.QualityAssessmentImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.QualityAssessmentImpl#getMeasures <em>Measures</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.QualityAssessmentImpl#getMaturityLevel <em>Maturity Level</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.QualityAssessmentImpl#getConfidenceLevel <em>Confidence Level</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.impl.QualityAssessmentImpl#isAssessed <em>Assessed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityAssessmentImpl extends ComponentElementImpl implements QualityAssessment {

	/**
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityAssessment> basedOn;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentElement> context;

	/**
	 * The cached value of the '{@link #getMeasures() <em>Measures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityMeasure> measures;

	/**
	 * The default value of the '{@link #getMaturityLevel() <em>Maturity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaturityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String MATURITY_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaturityLevel() <em>Maturity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaturityLevel()
	 * @generated
	 * @ordered
	 */
	protected String maturityLevel = MATURITY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfidenceLevel() <em>Confidence Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidenceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final confidenceLevel_Type CONFIDENCE_LEVEL_EDEFAULT = confidenceLevel_Type.NOT_ASSESSED;

	/**
	 * The cached value of the '{@link #getConfidenceLevel() <em>Confidence Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidenceLevel()
	 * @generated
	 * @ordered
	 */
	protected confidenceLevel_Type confidenceLevel = CONFIDENCE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isAssessed() <em>Assessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssessed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASSESSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAssessed() <em>Assessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssessed()
	 * @generated
	 * @ordered
	 */
	protected boolean assessed = ASSESSED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityAssessmentImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentSampleQualityAssessmentPackage.Literals.QUALITY_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<QualityAssessment> getBasedOn() {

		if (basedOn == null) {
			basedOn = new EObjectResolvingEList<QualityAssessment>(QualityAssessment.class, this,
					ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ComponentElement> getContext() {

		if (context == null) {
			context = new EObjectResolvingEList<ComponentElement>(ComponentElement.class, this,
					ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<QualityMeasure> getMeasures() {

		if (measures == null) {
			measures = new EObjectContainmentEList<QualityMeasure>(QualityMeasure.class, this,
					ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__MEASURES);
		}
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getMaturityLevel() {

		return maturityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMaturityLevel(String newMaturityLevel) {

		String oldMaturityLevel = maturityLevel;
		maturityLevel = newMaturityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__MATURITY_LEVEL, oldMaturityLevel,
					maturityLevel));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public confidenceLevel_Type getConfidenceLevel() {

		return confidenceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setConfidenceLevel(confidenceLevel_Type newConfidenceLevel) {

		confidenceLevel_Type oldConfidenceLevel = confidenceLevel;
		confidenceLevel = newConfidenceLevel == null ? CONFIDENCE_LEVEL_EDEFAULT : newConfidenceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__CONFIDENCE_LEVEL, oldConfidenceLevel,
					confidenceLevel));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isAssessed() {

		return assessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setAssessed(boolean newAssessed) {

		boolean oldAssessed = assessed;
		assessed = newAssessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__ASSESSED, oldAssessed, assessed));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__MEASURES:
			return ((InternalEList<?>) getMeasures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__BASED_ON:
			return getBasedOn();
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__CONTEXT:
			return getContext();
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__MEASURES:
			return getMeasures();
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__MATURITY_LEVEL:
			return getMaturityLevel();
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__CONFIDENCE_LEVEL:
			return getConfidenceLevel();
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__ASSESSED:
			return isAssessed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__BASED_ON:
			getBasedOn().clear();
			getBasedOn().addAll((Collection<? extends QualityAssessment>) newValue);
			return;
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__CONTEXT:
			getContext().clear();
			getContext().addAll((Collection<? extends ComponentElement>) newValue);
			return;
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__MEASURES:
			getMeasures().clear();
			getMeasures().addAll((Collection<? extends QualityMeasure>) newValue);
			return;
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__MATURITY_LEVEL:
			setMaturityLevel((String) newValue);
			return;
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__CONFIDENCE_LEVEL:
			setConfidenceLevel((confidenceLevel_Type) newValue);
			return;
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__ASSESSED:
			setAssessed((Boolean) newValue);
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
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__BASED_ON:
			getBasedOn().clear();
			return;
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__CONTEXT:
			getContext().clear();
			return;
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__MEASURES:
			getMeasures().clear();
			return;
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__MATURITY_LEVEL:
			setMaturityLevel(MATURITY_LEVEL_EDEFAULT);
			return;
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__CONFIDENCE_LEVEL:
			setConfidenceLevel(CONFIDENCE_LEVEL_EDEFAULT);
			return;
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__ASSESSED:
			setAssessed(ASSESSED_EDEFAULT);
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
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__BASED_ON:
			return basedOn != null && !basedOn.isEmpty();
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__CONTEXT:
			return context != null && !context.isEmpty();
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__MEASURES:
			return measures != null && !measures.isEmpty();
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__MATURITY_LEVEL:
			return MATURITY_LEVEL_EDEFAULT == null ? maturityLevel != null
					: !MATURITY_LEVEL_EDEFAULT.equals(maturityLevel);
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__CONFIDENCE_LEVEL:
			return confidenceLevel != CONFIDENCE_LEVEL_EDEFAULT;
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__ASSESSED:
			return assessed != ASSESSED_EDEFAULT;
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
		result.append(" (maturityLevel: "); //$NON-NLS-1$
		result.append(maturityLevel);
		result.append(", confidenceLevel: "); //$NON-NLS-1$
		result.append(confidenceLevel);
		result.append(", assessed: "); //$NON-NLS-1$
		result.append(assessed);
		result.append(')');
		return result.toString();
	}

} //QualityAssessmentImpl