/**
 */
package PatternDependencyAnalysis.impl;

import PatternDependencyAnalysis.PatternAnalysis;
import PatternDependencyAnalysis.PatternDependencyAnalysisPackage;
import PatternDependencyAnalysis.PatternMethodAnalysis;
import PatternDependencyAnalysis.PatternParameterAnalysis;

import java.util.Collection;

import org.eclipse.egf.model.pattern.Pattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PatternDependencyAnalysis.impl.PatternAnalysisImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.impl.PatternAnalysisImpl#getSuperPattern <em>Super Pattern</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.impl.PatternAnalysisImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.impl.PatternAnalysisImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.impl.PatternAnalysisImpl#getCalledBy <em>Called By</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.impl.PatternAnalysisImpl#getInheritedBy <em>Inherited By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternAnalysisImpl extends MinimalEObjectImpl.Container implements PatternAnalysis {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2020 THALES GLOBAL SERVICES.\nThis program and the accompanying materials are made available under the\nterms of the Eclipse Public License 2.0 which is available at\nhttp://www.eclipse.org/legal/epl-2.0\n\nSPDX-License-Identifier: EPL-2.0\n \nContributors:\n  Thales - initial API and implementation";

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected Pattern pattern;

	/**
	 * The cached value of the '{@link #getSuperPattern() <em>Super Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperPattern()
	 * @generated
	 * @ordered
	 */
	protected Pattern superPattern;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternMethodAnalysis> methods;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternParameterAnalysis> parameters;

	/**
	 * The cached value of the '{@link #getCalledBy() <em>Called By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern> calledBy;

	/**
	 * The cached value of the '{@link #getInheritedBy() <em>Inherited By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern> inheritedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternDependencyAnalysisPackage.Literals.PATTERN_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern getPattern() {
		if (pattern != null && pattern.eIsProxy()) {
			InternalEObject oldPattern = (InternalEObject)pattern;
			pattern = (Pattern)eResolveProxy(oldPattern);
			if (pattern != oldPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__PATTERN, oldPattern, pattern));
			}
		}
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern basicGetPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(Pattern newPattern) {
		Pattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern getSuperPattern() {
		if (superPattern != null && superPattern.eIsProxy()) {
			InternalEObject oldSuperPattern = (InternalEObject)superPattern;
			superPattern = (Pattern)eResolveProxy(oldSuperPattern);
			if (superPattern != oldSuperPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__SUPER_PATTERN, oldSuperPattern, superPattern));
			}
		}
		return superPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern basicGetSuperPattern() {
		return superPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperPattern(Pattern newSuperPattern) {
		Pattern oldSuperPattern = superPattern;
		superPattern = newSuperPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__SUPER_PATTERN, oldSuperPattern, superPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatternMethodAnalysis> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<PatternMethodAnalysis>(PatternMethodAnalysis.class, this, PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatternParameterAnalysis> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<PatternParameterAnalysis>(PatternParameterAnalysis.class, this, PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern> getCalledBy() {
		if (calledBy == null) {
			calledBy = new EObjectResolvingEList<Pattern>(Pattern.class, this, PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__CALLED_BY);
		}
		return calledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern> getInheritedBy() {
		if (inheritedBy == null) {
			inheritedBy = new EObjectResolvingEList<Pattern>(Pattern.class, this, PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__INHERITED_BY);
		}
		return inheritedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__PATTERN:
				if (resolve) return getPattern();
				return basicGetPattern();
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__SUPER_PATTERN:
				if (resolve) return getSuperPattern();
				return basicGetSuperPattern();
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__METHODS:
				return getMethods();
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__PARAMETERS:
				return getParameters();
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__CALLED_BY:
				return getCalledBy();
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__INHERITED_BY:
				return getInheritedBy();
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
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__PATTERN:
				setPattern((Pattern)newValue);
				return;
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__SUPER_PATTERN:
				setSuperPattern((Pattern)newValue);
				return;
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends PatternMethodAnalysis>)newValue);
				return;
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends PatternParameterAnalysis>)newValue);
				return;
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__CALLED_BY:
				getCalledBy().clear();
				getCalledBy().addAll((Collection<? extends Pattern>)newValue);
				return;
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__INHERITED_BY:
				getInheritedBy().clear();
				getInheritedBy().addAll((Collection<? extends Pattern>)newValue);
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
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__PATTERN:
				setPattern((Pattern)null);
				return;
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__SUPER_PATTERN:
				setSuperPattern((Pattern)null);
				return;
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__METHODS:
				getMethods().clear();
				return;
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__PARAMETERS:
				getParameters().clear();
				return;
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__CALLED_BY:
				getCalledBy().clear();
				return;
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__INHERITED_BY:
				getInheritedBy().clear();
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
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__PATTERN:
				return pattern != null;
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__SUPER_PATTERN:
				return superPattern != null;
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__METHODS:
				return methods != null && !methods.isEmpty();
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__CALLED_BY:
				return calledBy != null && !calledBy.isEmpty();
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__INHERITED_BY:
				return inheritedBy != null && !inheritedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PatternAnalysisImpl
