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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.NamedElementImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ActionSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramRepresentationImpl#getThe_MappingSet <em>The Mapping Set</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramRepresentationImpl#getThe_ActionSet <em>The Action Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DiagramRepresentationImpl extends NamedElementImpl
		implements DiagramRepresentation {

	/**
	 * The cached value of the '{@link #getThe_MappingSet() <em>The Mapping Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThe_MappingSet()
	 * @generated
	 * @ordered
	 */
	protected MappingSet the_MappingSet;

	/**
	 * The cached value of the '{@link #getThe_ActionSet() <em>The Action Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThe_ActionSet()
	 * @generated
	 * @ordered
	 */
	protected ActionSet the_ActionSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.DIAGRAM_REPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public MappingSet getThe_MappingSet() {
		return the_MappingSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetThe_MappingSet(
			MappingSet newThe_MappingSet, NotificationChain msgs) {
		MappingSet oldThe_MappingSet = the_MappingSet;
		the_MappingSet = newThe_MappingSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_MAPPING_SET, oldThe_MappingSet, newThe_MappingSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setThe_MappingSet(MappingSet newThe_MappingSet) {
		if (newThe_MappingSet != the_MappingSet) {
			NotificationChain msgs = null;
			if (the_MappingSet != null)
				msgs = ((InternalEObject)the_MappingSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_MAPPING_SET, null, msgs);
			if (newThe_MappingSet != null)
				msgs = ((InternalEObject)newThe_MappingSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_MAPPING_SET, null, msgs);
			msgs = basicSetThe_MappingSet(newThe_MappingSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_MAPPING_SET, newThe_MappingSet, newThe_MappingSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ActionSet getThe_ActionSet() {
		return the_ActionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetThe_ActionSet(ActionSet newThe_ActionSet,
			NotificationChain msgs) {
		ActionSet oldThe_ActionSet = the_ActionSet;
		the_ActionSet = newThe_ActionSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_ACTION_SET, oldThe_ActionSet, newThe_ActionSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setThe_ActionSet(ActionSet newThe_ActionSet) {
		if (newThe_ActionSet != the_ActionSet) {
			NotificationChain msgs = null;
			if (the_ActionSet != null)
				msgs = ((InternalEObject)the_ActionSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_ACTION_SET, null, msgs);
			if (newThe_ActionSet != null)
				msgs = ((InternalEObject)newThe_ActionSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_ACTION_SET, null, msgs);
			msgs = basicSetThe_ActionSet(newThe_ActionSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_ACTION_SET, newThe_ActionSet, newThe_ActionSet));
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
			case VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_MAPPING_SET:
				return basicSetThe_MappingSet(null, msgs);
			case VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_ACTION_SET:
				return basicSetThe_ActionSet(null, msgs);
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
			case VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_MAPPING_SET:
				return getThe_MappingSet();
			case VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_ACTION_SET:
				return getThe_ActionSet();
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
			case VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_MAPPING_SET:
				setThe_MappingSet((MappingSet)newValue);
				return;
			case VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_ACTION_SET:
				setThe_ActionSet((ActionSet)newValue);
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
			case VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_MAPPING_SET:
				setThe_MappingSet((MappingSet)null);
				return;
			case VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_ACTION_SET:
				setThe_ActionSet((ActionSet)null);
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
			case VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_MAPPING_SET:
				return the_MappingSet != null;
			case VpdiagramPackage.DIAGRAM_REPRESENTATION__THE_ACTION_SET:
				return the_ActionSet != null;
		}
		return super.eIsSet(featureID);
	}

} //DiagramRepresentationImpl
