/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Condition;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDescriptionImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDescriptionImpl#getBegin_Label <em>Begin Label</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDescriptionImpl#getCenter_label <em>Center label</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDescriptionImpl#getEnd_label <em>End label</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDescriptionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeDescriptionImpl extends EObjectImpl implements EdgeDescription {

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EdgeStyle style;

	/**
	 * The cached value of the '{@link #getBegin_Label() <em>Begin Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin_Label()
	 * @generated
	 * @ordered
	 */
	protected Label begin_Label;

	/**
	 * The cached value of the '{@link #getCenter_label() <em>Center label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter_label()
	 * @generated
	 * @ordered
	 */
	protected Label center_label;

	/**
	 * The cached value of the '{@link #getEnd_label() <em>End label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd_label()
	 * @generated
	 * @ordered
	 */
	protected Label end_label;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeDescriptionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.EDGE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EdgeStyle getStyle() {

		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetStyle(EdgeStyle newStyle,
			NotificationChain msgs) {

		EdgeStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DESCRIPTION__STYLE, oldStyle, newStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setStyle(EdgeStyle newStyle) {

		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.EDGE_DESCRIPTION__STYLE, null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.EDGE_DESCRIPTION__STYLE, null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DESCRIPTION__STYLE, newStyle, newStyle));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Label getBegin_Label() {

		return begin_Label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetBegin_Label(Label newBegin_Label,
			NotificationChain msgs) {

		Label oldBegin_Label = begin_Label;
		begin_Label = newBegin_Label;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DESCRIPTION__BEGIN_LABEL, oldBegin_Label, newBegin_Label);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setBegin_Label(Label newBegin_Label) {

		if (newBegin_Label != begin_Label) {
			NotificationChain msgs = null;
			if (begin_Label != null)
				msgs = ((InternalEObject)begin_Label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.EDGE_DESCRIPTION__BEGIN_LABEL, null, msgs);
			if (newBegin_Label != null)
				msgs = ((InternalEObject)newBegin_Label).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.EDGE_DESCRIPTION__BEGIN_LABEL, null, msgs);
			msgs = basicSetBegin_Label(newBegin_Label, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DESCRIPTION__BEGIN_LABEL, newBegin_Label, newBegin_Label));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Label getCenter_label() {

		return center_label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetCenter_label(Label newCenter_label,
			NotificationChain msgs) {

		Label oldCenter_label = center_label;
		center_label = newCenter_label;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DESCRIPTION__CENTER_LABEL, oldCenter_label, newCenter_label);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setCenter_label(Label newCenter_label) {

		if (newCenter_label != center_label) {
			NotificationChain msgs = null;
			if (center_label != null)
				msgs = ((InternalEObject)center_label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.EDGE_DESCRIPTION__CENTER_LABEL, null, msgs);
			if (newCenter_label != null)
				msgs = ((InternalEObject)newCenter_label).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.EDGE_DESCRIPTION__CENTER_LABEL, null, msgs);
			msgs = basicSetCenter_label(newCenter_label, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DESCRIPTION__CENTER_LABEL, newCenter_label, newCenter_label));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Label getEnd_label() {

		return end_label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetEnd_label(Label newEnd_label,
			NotificationChain msgs) {

		Label oldEnd_label = end_label;
		end_label = newEnd_label;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DESCRIPTION__END_LABEL, oldEnd_label, newEnd_label);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setEnd_label(Label newEnd_label) {

		if (newEnd_label != end_label) {
			NotificationChain msgs = null;
			if (end_label != null)
				msgs = ((InternalEObject)end_label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.EDGE_DESCRIPTION__END_LABEL, null, msgs);
			if (newEnd_label != null)
				msgs = ((InternalEObject)newEnd_label).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.EDGE_DESCRIPTION__END_LABEL, null, msgs);
			msgs = basicSetEnd_label(newEnd_label, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DESCRIPTION__END_LABEL, newEnd_label, newEnd_label));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Condition getCondition() {

		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetCondition(Condition newCondition,
			NotificationChain msgs) {

		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DESCRIPTION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setCondition(Condition newCondition) {

		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.EDGE_DESCRIPTION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.EDGE_DESCRIPTION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_DESCRIPTION__CONDITION, newCondition, newCondition));

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
			case VpdiagramPackage.EDGE_DESCRIPTION__STYLE:
				return basicSetStyle(null, msgs);
			case VpdiagramPackage.EDGE_DESCRIPTION__BEGIN_LABEL:
				return basicSetBegin_Label(null, msgs);
			case VpdiagramPackage.EDGE_DESCRIPTION__CENTER_LABEL:
				return basicSetCenter_label(null, msgs);
			case VpdiagramPackage.EDGE_DESCRIPTION__END_LABEL:
				return basicSetEnd_label(null, msgs);
			case VpdiagramPackage.EDGE_DESCRIPTION__CONDITION:
				return basicSetCondition(null, msgs);
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
			case VpdiagramPackage.EDGE_DESCRIPTION__STYLE:
				return getStyle();
			case VpdiagramPackage.EDGE_DESCRIPTION__BEGIN_LABEL:
				return getBegin_Label();
			case VpdiagramPackage.EDGE_DESCRIPTION__CENTER_LABEL:
				return getCenter_label();
			case VpdiagramPackage.EDGE_DESCRIPTION__END_LABEL:
				return getEnd_label();
			case VpdiagramPackage.EDGE_DESCRIPTION__CONDITION:
				return getCondition();
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
			case VpdiagramPackage.EDGE_DESCRIPTION__STYLE:
				setStyle((EdgeStyle)newValue);
				return;
			case VpdiagramPackage.EDGE_DESCRIPTION__BEGIN_LABEL:
				setBegin_Label((Label)newValue);
				return;
			case VpdiagramPackage.EDGE_DESCRIPTION__CENTER_LABEL:
				setCenter_label((Label)newValue);
				return;
			case VpdiagramPackage.EDGE_DESCRIPTION__END_LABEL:
				setEnd_label((Label)newValue);
				return;
			case VpdiagramPackage.EDGE_DESCRIPTION__CONDITION:
				setCondition((Condition)newValue);
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
			case VpdiagramPackage.EDGE_DESCRIPTION__STYLE:
				setStyle((EdgeStyle)null);
				return;
			case VpdiagramPackage.EDGE_DESCRIPTION__BEGIN_LABEL:
				setBegin_Label((Label)null);
				return;
			case VpdiagramPackage.EDGE_DESCRIPTION__CENTER_LABEL:
				setCenter_label((Label)null);
				return;
			case VpdiagramPackage.EDGE_DESCRIPTION__END_LABEL:
				setEnd_label((Label)null);
				return;
			case VpdiagramPackage.EDGE_DESCRIPTION__CONDITION:
				setCondition((Condition)null);
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
			case VpdiagramPackage.EDGE_DESCRIPTION__STYLE:
				return style != null;
			case VpdiagramPackage.EDGE_DESCRIPTION__BEGIN_LABEL:
				return begin_Label != null;
			case VpdiagramPackage.EDGE_DESCRIPTION__CENTER_LABEL:
				return center_label != null;
			case VpdiagramPackage.EDGE_DESCRIPTION__END_LABEL:
				return end_label != null;
			case VpdiagramPackage.EDGE_DESCRIPTION__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //EdgeDescriptionImpl
