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
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeChildren;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeImpl#getThe_domain <em>The domain</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends DiagramChildrenImpl implements Node {

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
	protected EList<NodeDescription> style;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected NodeMapping imports;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected NodeChildren children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.NODE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.NODE__THE_DOMAIN, oldThe_domain, newThe_domain);
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
				msgs = ((InternalEObject)the_domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.NODE__THE_DOMAIN, null, msgs);
			if (newThe_domain != null)
				msgs = ((InternalEObject)newThe_domain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.NODE__THE_DOMAIN, null, msgs);
			msgs = basicSetThe_domain(newThe_domain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.NODE__THE_DOMAIN, newThe_domain, newThe_domain));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<NodeDescription> getStyle() {

		if (style == null) {
			style = new EObjectContainmentEList<NodeDescription>(NodeDescription.class, this, VpdiagramPackage.NODE__STYLE);
		}
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NodeMapping getImports() {

		if (imports != null && imports.eIsProxy()) {
			InternalEObject oldImports = (InternalEObject)imports;
			imports = (NodeMapping)eResolveProxy(oldImports);
			if (imports != oldImports) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VpdiagramPackage.NODE__IMPORTS, oldImports, imports));
			}
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NodeMapping basicGetImports() {

		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setImports(NodeMapping newImports) {

		NodeMapping oldImports = imports;
		imports = newImports;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.NODE__IMPORTS, oldImports, imports));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NodeChildren getChildren() {

		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetChildren(NodeChildren newChildren,
			NotificationChain msgs) {

		NodeChildren oldChildren = children;
		children = newChildren;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.NODE__CHILDREN, oldChildren, newChildren);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setChildren(NodeChildren newChildren) {

		if (newChildren != children) {
			NotificationChain msgs = null;
			if (children != null)
				msgs = ((InternalEObject)children).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.NODE__CHILDREN, null, msgs);
			if (newChildren != null)
				msgs = ((InternalEObject)newChildren).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.NODE__CHILDREN, null, msgs);
			msgs = basicSetChildren(newChildren, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.NODE__CHILDREN, newChildren, newChildren));

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
			case VpdiagramPackage.NODE__THE_DOMAIN:
				return basicSetThe_domain(null, msgs);
			case VpdiagramPackage.NODE__STYLE:
				return ((InternalEList<?>)getStyle()).basicRemove(otherEnd, msgs);
			case VpdiagramPackage.NODE__CHILDREN:
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
			case VpdiagramPackage.NODE__THE_DOMAIN:
				return getThe_domain();
			case VpdiagramPackage.NODE__STYLE:
				return getStyle();
			case VpdiagramPackage.NODE__IMPORTS:
				if (resolve) return getImports();
				return basicGetImports();
			case VpdiagramPackage.NODE__CHILDREN:
				return getChildren();
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
			case VpdiagramPackage.NODE__THE_DOMAIN:
				setThe_domain((NodeDomainElement)newValue);
				return;
			case VpdiagramPackage.NODE__STYLE:
				getStyle().clear();
				getStyle().addAll((Collection<? extends NodeDescription>)newValue);
				return;
			case VpdiagramPackage.NODE__IMPORTS:
				setImports((NodeMapping)newValue);
				return;
			case VpdiagramPackage.NODE__CHILDREN:
				setChildren((NodeChildren)newValue);
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
			case VpdiagramPackage.NODE__THE_DOMAIN:
				setThe_domain((NodeDomainElement)null);
				return;
			case VpdiagramPackage.NODE__STYLE:
				getStyle().clear();
				return;
			case VpdiagramPackage.NODE__IMPORTS:
				setImports((NodeMapping)null);
				return;
			case VpdiagramPackage.NODE__CHILDREN:
				setChildren((NodeChildren)null);
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
			case VpdiagramPackage.NODE__THE_DOMAIN:
				return the_domain != null;
			case VpdiagramPackage.NODE__STYLE:
				return style != null && !style.isEmpty();
			case VpdiagramPackage.NODE__IMPORTS:
				return imports != null;
			case VpdiagramPackage.NODE__CHILDREN:
				return children != null;
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
				case VpdiagramPackage.NODE__THE_DOMAIN: return VpdiagramPackage.ABSTRACT_NODE__THE_DOMAIN;
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
				case VpdiagramPackage.ABSTRACT_NODE__THE_DOMAIN: return VpdiagramPackage.NODE__THE_DOMAIN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //NodeImpl
