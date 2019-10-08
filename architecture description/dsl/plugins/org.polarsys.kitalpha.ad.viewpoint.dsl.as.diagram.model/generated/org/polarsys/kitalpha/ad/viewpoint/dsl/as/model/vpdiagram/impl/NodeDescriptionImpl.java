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
import org.eclipse.sirius.diagram.LabelPosition;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNodeStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeDescriptionImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeDescriptionImpl#getLabel_position <em>Label position</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeDescriptionImpl#getLabel_alignement <em>Label alignement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeDescriptionImpl extends AbstractDescriptionImpl implements
		NodeDescription {

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected AbstractNodeStyle style;

	/**
	 * The default value of the '{@link #getLabel_position() <em>Label position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel_position()
	 * @generated
	 * @ordered
	 */
	protected static final LabelPosition LABEL_POSITION_EDEFAULT = LabelPosition.BORDER_LITERAL;

	/**
	 * The cached value of the '{@link #getLabel_position() <em>Label position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel_position()
	 * @generated
	 * @ordered
	 */
	protected LabelPosition label_position = LABEL_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel_alignement() <em>Label alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel_alignement()
	 * @generated
	 * @ordered
	 */
	protected static final LabelAlignment LABEL_ALIGNEMENT_EDEFAULT = LabelAlignment.CENTER;

	/**
	 * The cached value of the '{@link #getLabel_alignement() <em>Label alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel_alignement()
	 * @generated
	 * @ordered
	 */
	protected LabelAlignment label_alignement = LABEL_ALIGNEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeDescriptionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.NODE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractNodeStyle getStyle() {

		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetStyle(AbstractNodeStyle newStyle,
			NotificationChain msgs) {

		AbstractNodeStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.NODE_DESCRIPTION__STYLE, oldStyle, newStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setStyle(AbstractNodeStyle newStyle) {

		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.NODE_DESCRIPTION__STYLE, null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.NODE_DESCRIPTION__STYLE, null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.NODE_DESCRIPTION__STYLE, newStyle, newStyle));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public LabelPosition getLabel_position() {

		return label_position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setLabel_position(LabelPosition newLabel_position) {

		LabelPosition oldLabel_position = label_position;
		label_position = newLabel_position == null ? LABEL_POSITION_EDEFAULT : newLabel_position;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.NODE_DESCRIPTION__LABEL_POSITION, oldLabel_position, label_position));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public LabelAlignment getLabel_alignement() {

		return label_alignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setLabel_alignement(LabelAlignment newLabel_alignement) {

		LabelAlignment oldLabel_alignement = label_alignement;
		label_alignement = newLabel_alignement == null ? LABEL_ALIGNEMENT_EDEFAULT : newLabel_alignement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.NODE_DESCRIPTION__LABEL_ALIGNEMENT, oldLabel_alignement, label_alignement));

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
			case VpdiagramPackage.NODE_DESCRIPTION__STYLE:
				return basicSetStyle(null, msgs);
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
			case VpdiagramPackage.NODE_DESCRIPTION__STYLE:
				return getStyle();
			case VpdiagramPackage.NODE_DESCRIPTION__LABEL_POSITION:
				return getLabel_position();
			case VpdiagramPackage.NODE_DESCRIPTION__LABEL_ALIGNEMENT:
				return getLabel_alignement();
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
			case VpdiagramPackage.NODE_DESCRIPTION__STYLE:
				setStyle((AbstractNodeStyle)newValue);
				return;
			case VpdiagramPackage.NODE_DESCRIPTION__LABEL_POSITION:
				setLabel_position((LabelPosition)newValue);
				return;
			case VpdiagramPackage.NODE_DESCRIPTION__LABEL_ALIGNEMENT:
				setLabel_alignement((LabelAlignment)newValue);
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
			case VpdiagramPackage.NODE_DESCRIPTION__STYLE:
				setStyle((AbstractNodeStyle)null);
				return;
			case VpdiagramPackage.NODE_DESCRIPTION__LABEL_POSITION:
				setLabel_position(LABEL_POSITION_EDEFAULT);
				return;
			case VpdiagramPackage.NODE_DESCRIPTION__LABEL_ALIGNEMENT:
				setLabel_alignement(LABEL_ALIGNEMENT_EDEFAULT);
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
			case VpdiagramPackage.NODE_DESCRIPTION__STYLE:
				return style != null;
			case VpdiagramPackage.NODE_DESCRIPTION__LABEL_POSITION:
				return label_position != LABEL_POSITION_EDEFAULT;
			case VpdiagramPackage.NODE_DESCRIPTION__LABEL_ALIGNEMENT:
				return label_alignement != LABEL_ALIGNEMENT_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (label_position: ");
		result.append(label_position);
		result.append(", label_alignement: ");
		result.append(label_alignement);
		result.append(')');
		return result.toString();
	}

} //NodeDescriptionImpl
