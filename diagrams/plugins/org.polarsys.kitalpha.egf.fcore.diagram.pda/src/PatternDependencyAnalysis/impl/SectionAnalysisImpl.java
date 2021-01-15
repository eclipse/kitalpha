/**
 * Copyright (c) 2020 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 */
package PatternDependencyAnalysis.impl;

import PatternDependencyAnalysis.PatternDependencyAnalysisPackage;
import PatternDependencyAnalysis.SectionAnalysis;

import java.util.Collection;

import org.eclipse.egf.model.pattern.Pattern;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PatternDependencyAnalysis.impl.SectionAnalysisImpl#getSectionName <em>Section Name</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.impl.SectionAnalysisImpl#getContributingPatterns <em>Contributing Patterns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionAnalysisImpl extends MinimalEObjectImpl.Container implements SectionAnalysis {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2020 THALES GLOBAL SERVICES.\nThis program and the accompanying materials are made available under the\nterms of the Eclipse Public License 2.0 which is available at\nhttp://www.eclipse.org/legal/epl-2.0\n\nSPDX-License-Identifier: EPL-2.0\n \nContributors:\n  Thales - initial API and implementation";

	/**
	 * The default value of the '{@link #getSectionName() <em>Section Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionName()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSectionName() <em>Section Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionName()
	 * @generated
	 * @ordered
	 */
	protected String sectionName = SECTION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContributingPatterns() <em>Contributing Patterns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributingPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern> contributingPatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternDependencyAnalysisPackage.Literals.SECTION_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSectionName() {
		return sectionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionName(String newSectionName) {
		String oldSectionName = sectionName;
		sectionName = newSectionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternDependencyAnalysisPackage.SECTION_ANALYSIS__SECTION_NAME, oldSectionName, sectionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern> getContributingPatterns() {
		if (contributingPatterns == null) {
			contributingPatterns = new EObjectResolvingEList<Pattern>(Pattern.class, this, PatternDependencyAnalysisPackage.SECTION_ANALYSIS__CONTRIBUTING_PATTERNS);
		}
		return contributingPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternDependencyAnalysisPackage.SECTION_ANALYSIS__SECTION_NAME:
				return getSectionName();
			case PatternDependencyAnalysisPackage.SECTION_ANALYSIS__CONTRIBUTING_PATTERNS:
				return getContributingPatterns();
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
			case PatternDependencyAnalysisPackage.SECTION_ANALYSIS__SECTION_NAME:
				setSectionName((String)newValue);
				return;
			case PatternDependencyAnalysisPackage.SECTION_ANALYSIS__CONTRIBUTING_PATTERNS:
				getContributingPatterns().clear();
				getContributingPatterns().addAll((Collection<? extends Pattern>)newValue);
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
			case PatternDependencyAnalysisPackage.SECTION_ANALYSIS__SECTION_NAME:
				setSectionName(SECTION_NAME_EDEFAULT);
				return;
			case PatternDependencyAnalysisPackage.SECTION_ANALYSIS__CONTRIBUTING_PATTERNS:
				getContributingPatterns().clear();
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
			case PatternDependencyAnalysisPackage.SECTION_ANALYSIS__SECTION_NAME:
				return SECTION_NAME_EDEFAULT == null ? sectionName != null : !SECTION_NAME_EDEFAULT.equals(sectionName);
			case PatternDependencyAnalysisPackage.SECTION_ANALYSIS__CONTRIBUTING_PATTERNS:
				return contributingPatterns != null && !contributingPatterns.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sectionName: ");
		result.append(sectionName);
		result.append(')');
		return result.toString();
	}

} //SectionAnalysisImpl
