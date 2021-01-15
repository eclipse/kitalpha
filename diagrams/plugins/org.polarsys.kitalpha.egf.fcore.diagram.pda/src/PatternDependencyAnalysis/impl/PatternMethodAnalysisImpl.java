/**
 */
package PatternDependencyAnalysis.impl;

import PatternDependencyAnalysis.PatternAnalysis;
import PatternDependencyAnalysis.PatternDependencyAnalysisPackage;
import PatternDependencyAnalysis.PatternMethodAnalysis;

import java.util.Collection;

import org.eclipse.egf.model.pattern.PatternMethod;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Method Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PatternDependencyAnalysis.impl.PatternMethodAnalysisImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.impl.PatternMethodAnalysisImpl#getCalls <em>Calls</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.impl.PatternMethodAnalysisImpl#getContent <em>Content</em>}</li>
 *   <li>{@link PatternDependencyAnalysis.impl.PatternMethodAnalysisImpl#getSectionContributions <em>Section Contributions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternMethodAnalysisImpl extends MinimalEObjectImpl.Container implements PatternMethodAnalysis {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2020 THALES GLOBAL SERVICES.\nThis program and the accompanying materials are made available under the\nterms of the Eclipse Public License 2.0 which is available at\nhttp://www.eclipse.org/legal/epl-2.0\n\nSPDX-License-Identifier: EPL-2.0\n \nContributors:\n  Thales - initial API and implementation";

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected PatternMethod method;

	/**
	 * The cached value of the '{@link #getCalls() <em>Calls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternAnalysis> calls;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSectionContributions() <em>Section Contributions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionContributions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> sectionContributions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternMethodAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternDependencyAnalysisPackage.Literals.PATTERN_METHOD_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternMethod getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject)method;
			method = (PatternMethod)eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternMethod basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(PatternMethod newMethod) {
		PatternMethod oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatternAnalysis> getCalls() {
		if (calls == null) {
			calls = new EObjectContainmentEList<PatternAnalysis>(PatternAnalysis.class, this, PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__CALLS);
		}
		return calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSectionContributions() {
		if (sectionContributions == null) {
			sectionContributions = new EDataTypeUniqueEList<String>(String.class, this, PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__SECTION_CONTRIBUTIONS);
		}
		return sectionContributions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__CALLS:
				return ((InternalEList<?>)getCalls()).basicRemove(otherEnd, msgs);
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
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__CALLS:
				return getCalls();
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__CONTENT:
				return getContent();
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__SECTION_CONTRIBUTIONS:
				return getSectionContributions();
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
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__METHOD:
				setMethod((PatternMethod)newValue);
				return;
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__CALLS:
				getCalls().clear();
				getCalls().addAll((Collection<? extends PatternAnalysis>)newValue);
				return;
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__CONTENT:
				setContent((String)newValue);
				return;
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__SECTION_CONTRIBUTIONS:
				getSectionContributions().clear();
				getSectionContributions().addAll((Collection<? extends String>)newValue);
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
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__METHOD:
				setMethod((PatternMethod)null);
				return;
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__CALLS:
				getCalls().clear();
				return;
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__SECTION_CONTRIBUTIONS:
				getSectionContributions().clear();
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
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__METHOD:
				return method != null;
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__CALLS:
				return calls != null && !calls.isEmpty();
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case PatternDependencyAnalysisPackage.PATTERN_METHOD_ANALYSIS__SECTION_CONTRIBUTIONS:
				return sectionContributions != null && !sectionContributions.isEmpty();
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
		result.append(" (content: ");
		result.append(content);
		result.append(", sectionContributions: ");
		result.append(sectionContributions);
		result.append(')');
		return result.toString();
	}

} //PatternMethodAnalysisImpl
