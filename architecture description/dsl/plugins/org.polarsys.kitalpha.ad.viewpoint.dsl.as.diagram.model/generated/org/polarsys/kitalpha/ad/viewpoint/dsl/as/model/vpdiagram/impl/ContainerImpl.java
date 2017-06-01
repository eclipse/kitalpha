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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerChildren;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerImpl#getThe_domain <em>The domain</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerImpl#getContentLayout <em>Content Layout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends DiagramChildrenImpl implements Container {

	/**
	 * The cached value of the '{@link #getThe_domain() <em>The domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThe_domain()
	 * @generated
	 * @ordered
	 */
	protected NodeDomainElement the_domain;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerDescription> style;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected ContainerMapping imports;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected ContainerChildren children;

	/**
	 * The default value of the '{@link #getContentLayout() <em>Content Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentLayout()
	 * @generated
	 * @ordered
	 */
	protected static final ContainerLayout CONTENT_LAYOUT_EDEFAULT = ContainerLayout.FREE_FORM;

	/**
	 * The cached value of the '{@link #getContentLayout() <em>Content Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentLayout()
	 * @generated
	 * @ordered
	 */
	protected ContainerLayout contentLayout = CONTENT_LAYOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NodeDomainElement getThe_domain() {

		return the_domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetThe_domain(
			NodeDomainElement newThe_domain, NotificationChain msgs) {

		NodeDomainElement oldThe_domain = the_domain;
		the_domain = newThe_domain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.CONTAINER__THE_DOMAIN, oldThe_domain, newThe_domain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setThe_domain(NodeDomainElement newThe_domain) {

		if (newThe_domain != the_domain) {
			NotificationChain msgs = null;
			if (the_domain != null)
				msgs = ((InternalEObject)the_domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.CONTAINER__THE_DOMAIN, null, msgs);
			if (newThe_domain != null)
				msgs = ((InternalEObject)newThe_domain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.CONTAINER__THE_DOMAIN, null, msgs);
			msgs = basicSetThe_domain(newThe_domain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.CONTAINER__THE_DOMAIN, newThe_domain, newThe_domain));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ContainerDescription> getStyle() {

		if (style == null) {
			style = new EObjectContainmentEList<ContainerDescription>(ContainerDescription.class, this, VpdiagramPackage.CONTAINER__STYLE);
		}
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ContainerMapping getImports() {

		if (imports != null && imports.eIsProxy()) {
			InternalEObject oldImports = (InternalEObject)imports;
			imports = (ContainerMapping)eResolveProxy(oldImports);
			if (imports != oldImports) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VpdiagramPackage.CONTAINER__IMPORTS, oldImports, imports));
			}
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ContainerMapping basicGetImports() {

		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setImports(ContainerMapping newImports) {

		ContainerMapping oldImports = imports;
		imports = newImports;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.CONTAINER__IMPORTS, oldImports, imports));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ContainerChildren getChildren() {

		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetChildren(ContainerChildren newChildren,
			NotificationChain msgs) {

		ContainerChildren oldChildren = children;
		children = newChildren;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.CONTAINER__CHILDREN, oldChildren, newChildren);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setChildren(ContainerChildren newChildren) {

		if (newChildren != children) {
			NotificationChain msgs = null;
			if (children != null)
				msgs = ((InternalEObject)children).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.CONTAINER__CHILDREN, null, msgs);
			if (newChildren != null)
				msgs = ((InternalEObject)newChildren).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.CONTAINER__CHILDREN, null, msgs);
			msgs = basicSetChildren(newChildren, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.CONTAINER__CHILDREN, newChildren, newChildren));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ContainerLayout getContentLayout() {

		return contentLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setContentLayout(ContainerLayout newContentLayout) {

		ContainerLayout oldContentLayout = contentLayout;
		contentLayout = newContentLayout == null ? CONTENT_LAYOUT_EDEFAULT : newContentLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.CONTAINER__CONTENT_LAYOUT, oldContentLayout, contentLayout));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpdiagramPackage.CONTAINER__THE_DOMAIN:
				return basicSetThe_domain(null, msgs);
			case VpdiagramPackage.CONTAINER__STYLE:
				return ((InternalEList<?>)getStyle()).basicRemove(otherEnd, msgs);
			case VpdiagramPackage.CONTAINER__CHILDREN:
				return basicSetChildren(null, msgs);
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
			case VpdiagramPackage.CONTAINER__THE_DOMAIN:
				return getThe_domain();
			case VpdiagramPackage.CONTAINER__STYLE:
				return getStyle();
			case VpdiagramPackage.CONTAINER__IMPORTS:
				if (resolve) return getImports();
				return basicGetImports();
			case VpdiagramPackage.CONTAINER__CHILDREN:
				return getChildren();
			case VpdiagramPackage.CONTAINER__CONTENT_LAYOUT:
				return getContentLayout();
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
			case VpdiagramPackage.CONTAINER__THE_DOMAIN:
				setThe_domain((NodeDomainElement)newValue);
				return;
			case VpdiagramPackage.CONTAINER__STYLE:
				getStyle().clear();
				getStyle().addAll((Collection<? extends ContainerDescription>)newValue);
				return;
			case VpdiagramPackage.CONTAINER__IMPORTS:
				setImports((ContainerMapping)newValue);
				return;
			case VpdiagramPackage.CONTAINER__CHILDREN:
				setChildren((ContainerChildren)newValue);
				return;
			case VpdiagramPackage.CONTAINER__CONTENT_LAYOUT:
				setContentLayout((ContainerLayout)newValue);
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
			case VpdiagramPackage.CONTAINER__THE_DOMAIN:
				setThe_domain((NodeDomainElement)null);
				return;
			case VpdiagramPackage.CONTAINER__STYLE:
				getStyle().clear();
				return;
			case VpdiagramPackage.CONTAINER__IMPORTS:
				setImports((ContainerMapping)null);
				return;
			case VpdiagramPackage.CONTAINER__CHILDREN:
				setChildren((ContainerChildren)null);
				return;
			case VpdiagramPackage.CONTAINER__CONTENT_LAYOUT:
				setContentLayout(CONTENT_LAYOUT_EDEFAULT);
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
			case VpdiagramPackage.CONTAINER__THE_DOMAIN:
				return the_domain != null;
			case VpdiagramPackage.CONTAINER__STYLE:
				return style != null && !style.isEmpty();
			case VpdiagramPackage.CONTAINER__IMPORTS:
				return imports != null;
			case VpdiagramPackage.CONTAINER__CHILDREN:
				return children != null;
			case VpdiagramPackage.CONTAINER__CONTENT_LAYOUT:
				return contentLayout != CONTENT_LAYOUT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractNode.class) {
			switch (derivedFeatureID) {
				case VpdiagramPackage.CONTAINER__THE_DOMAIN: return VpdiagramPackage.ABSTRACT_NODE__THE_DOMAIN;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractNode.class) {
			switch (baseFeatureID) {
				case VpdiagramPackage.ABSTRACT_NODE__THE_DOMAIN: return VpdiagramPackage.CONTAINER__THE_DOMAIN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (contentLayout: ");
		result.append(contentLayout);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
