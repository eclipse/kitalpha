/**
 */
package PatternDependencyAnalysis.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import PatternDependencyAnalysis.PatternAnalysis;
import PatternDependencyAnalysis.PatternDependencyAnalysisPackage;
import PatternDependencyAnalysis.Root;
import PatternDependencyAnalysis.SectionAnalysis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PatternDependencyAnalysis.impl.RootImpl#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.impl.RootImpl#getSectionsAnalyses <em>Sections Analyses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2020 THALES GLOBAL SERVICES.\nThis program and the accompanying materials are made available under the\nterms of the Eclipse Public License 2.0 which is available at\nhttp://www.eclipse.org/legal/epl-2.0\n\nSPDX-License-Identifier: EPL-2.0\n \nContributors:\n  Thales - initial API and implementation";
	/**
	 * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternAnalysis> patterns;

	/**
	 * The cached value of the '{@link #getSectionsAnalyses() <em>Sections Analyses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionsAnalyses()
	 * @generated
	 * @ordered
	 */
	protected EList<SectionAnalysis> sectionsAnalyses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternDependencyAnalysisPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatternAnalysis> getPatterns() {
		if (patterns == null) {
			patterns = new EObjectContainmentEList<PatternAnalysis>(PatternAnalysis.class, this, PatternDependencyAnalysisPackage.ROOT__PATTERNS);
		}
		return patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SectionAnalysis> getSectionsAnalyses() {
		if (sectionsAnalyses == null) {
			sectionsAnalyses = new EObjectContainmentEList<SectionAnalysis>(SectionAnalysis.class, this, PatternDependencyAnalysisPackage.ROOT__SECTIONS_ANALYSES);
		}
		return sectionsAnalyses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternDependencyAnalysisPackage.ROOT__PATTERNS:
				return ((InternalEList<?>)getPatterns()).basicRemove(otherEnd, msgs);
			case PatternDependencyAnalysisPackage.ROOT__SECTIONS_ANALYSES:
				return ((InternalEList<?>)getSectionsAnalyses()).basicRemove(otherEnd, msgs);
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
			case PatternDependencyAnalysisPackage.ROOT__PATTERNS:
				return getPatterns();
			case PatternDependencyAnalysisPackage.ROOT__SECTIONS_ANALYSES:
				return getSectionsAnalyses();
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
			case PatternDependencyAnalysisPackage.ROOT__PATTERNS:
				getPatterns().clear();
				getPatterns().addAll((Collection<? extends PatternAnalysis>)newValue);
				return;
			case PatternDependencyAnalysisPackage.ROOT__SECTIONS_ANALYSES:
				getSectionsAnalyses().clear();
				getSectionsAnalyses().addAll((Collection<? extends SectionAnalysis>)newValue);
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
			case PatternDependencyAnalysisPackage.ROOT__PATTERNS:
				getPatterns().clear();
				return;
			case PatternDependencyAnalysisPackage.ROOT__SECTIONS_ANALYSES:
				getSectionsAnalyses().clear();
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
			case PatternDependencyAnalysisPackage.ROOT__PATTERNS:
				return patterns != null && !patterns.isEmpty();
			case PatternDependencyAnalysisPackage.ROOT__SECTIONS_ANALYSES:
				return sectionsAnalyses != null && !sectionsAnalyses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
