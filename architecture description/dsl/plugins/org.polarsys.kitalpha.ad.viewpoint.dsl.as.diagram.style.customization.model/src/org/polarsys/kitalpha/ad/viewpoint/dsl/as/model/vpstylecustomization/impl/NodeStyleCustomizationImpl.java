/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl;

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

import org.eclipse.sirius.diagram.LabelPosition;
import org.eclipse.sirius.diagram.ResizeKind;

import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.CustomizationExpression;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificNodeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Style Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.NodeStyleCustomizationImpl#getAppliedOn <em>Applied On</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.NodeStyleCustomizationImpl#getOwnedSpecificNodeStyleCustomization <em>Owned Specific Node Style Customization</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.NodeStyleCustomizationImpl#getSizeComputationExpression <em>Size Computation Expression</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.NodeStyleCustomizationImpl#getLabelPosition <em>Label Position</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.NodeStyleCustomizationImpl#isHideLabelByDefault <em>Hide Label By Default</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.NodeStyleCustomizationImpl#getResizeKind <em>Resize Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeStyleCustomizationImpl extends AbstractNodeStyleCustomizationImpl implements NodeStyleCustomization {

	/**
	 * The cached value of the '{@link #getAppliedOn() <em>Applied On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeStyleDescription> appliedOn;




	/**
	 * The cached value of the '{@link #getOwnedSpecificNodeStyleCustomization() <em>Owned Specific Node Style Customization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSpecificNodeStyleCustomization()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificNodeStyleCustomization> ownedSpecificNodeStyleCustomization;




	/**
	 * The cached value of the '{@link #getSizeComputationExpression() <em>Size Computation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeComputationExpression()
	 * @generated
	 * @ordered
	 */
	protected CustomizationExpression sizeComputationExpression;




	/**
	 * The default value of the '{@link #getLabelPosition() <em>Label Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelPosition()
	 * @generated
	 * @ordered
	 */
	protected static final LabelPosition LABEL_POSITION_EDEFAULT = LabelPosition.BORDER_LITERAL;

	/**
	 * The cached value of the '{@link #getLabelPosition() <em>Label Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelPosition()
	 * @generated
	 * @ordered
	 */
	protected LabelPosition labelPosition = LABEL_POSITION_EDEFAULT;




	/**
	 * The default value of the '{@link #isHideLabelByDefault() <em>Hide Label By Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideLabelByDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_LABEL_BY_DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHideLabelByDefault() <em>Hide Label By Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideLabelByDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean hideLabelByDefault = HIDE_LABEL_BY_DEFAULT_EDEFAULT;




	/**
	 * The default value of the '{@link #getResizeKind() <em>Resize Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResizeKind()
	 * @generated
	 * @ordered
	 */
	protected static final ResizeKind RESIZE_KIND_EDEFAULT = ResizeKind.NONE_LITERAL;

	/**
	 * The cached value of the '{@link #getResizeKind() <em>Resize Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResizeKind()
	 * @generated
	 * @ordered
	 */
	protected ResizeKind resizeKind = RESIZE_KIND_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeStyleCustomizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.NODE_STYLE_CUSTOMIZATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<NodeStyleDescription> getAppliedOn() {

		if (appliedOn == null) {
			appliedOn = new EObjectResolvingEList<NodeStyleDescription>(NodeStyleDescription.class, this, VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__APPLIED_ON);
		}
		return appliedOn;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<SpecificNodeStyleCustomization> getOwnedSpecificNodeStyleCustomization() {

		if (ownedSpecificNodeStyleCustomization == null) {
			ownedSpecificNodeStyleCustomization = new EObjectContainmentEList<SpecificNodeStyleCustomization>(SpecificNodeStyleCustomization.class, this, VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION);
		}
		return ownedSpecificNodeStyleCustomization;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CustomizationExpression getSizeComputationExpression() {

		return sizeComputationExpression;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetSizeComputationExpression(CustomizationExpression newSizeComputationExpression, NotificationChain msgs) {

		CustomizationExpression oldSizeComputationExpression = sizeComputationExpression;
		sizeComputationExpression = newSizeComputationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION, oldSizeComputationExpression, newSizeComputationExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setSizeComputationExpression(CustomizationExpression newSizeComputationExpression) {

		if (newSizeComputationExpression != sizeComputationExpression) {
			NotificationChain msgs = null;
			if (sizeComputationExpression != null)
				msgs = ((InternalEObject)sizeComputationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION, null, msgs);
			if (newSizeComputationExpression != null)
				msgs = ((InternalEObject)newSizeComputationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION, null, msgs);
			msgs = basicSetSizeComputationExpression(newSizeComputationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION, newSizeComputationExpression, newSizeComputationExpression));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public LabelPosition getLabelPosition() {

		return labelPosition;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setLabelPosition(LabelPosition newLabelPosition) {

		LabelPosition oldLabelPosition = labelPosition;
		labelPosition = newLabelPosition == null ? LABEL_POSITION_EDEFAULT : newLabelPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__LABEL_POSITION, oldLabelPosition, labelPosition));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isHideLabelByDefault() {

		return hideLabelByDefault;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setHideLabelByDefault(boolean newHideLabelByDefault) {

		boolean oldHideLabelByDefault = hideLabelByDefault;
		hideLabelByDefault = newHideLabelByDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__HIDE_LABEL_BY_DEFAULT, oldHideLabelByDefault, hideLabelByDefault));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ResizeKind getResizeKind() {

		return resizeKind;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setResizeKind(ResizeKind newResizeKind) {

		ResizeKind oldResizeKind = resizeKind;
		resizeKind = newResizeKind == null ? RESIZE_KIND_EDEFAULT : newResizeKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__RESIZE_KIND, oldResizeKind, resizeKind));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION:
				return ((InternalEList<?>)getOwnedSpecificNodeStyleCustomization()).basicRemove(otherEnd, msgs);
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION:
				return basicSetSizeComputationExpression(null, msgs);
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
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__APPLIED_ON:
				return getAppliedOn();
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION:
				return getOwnedSpecificNodeStyleCustomization();
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION:
				return getSizeComputationExpression();
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__LABEL_POSITION:
				return getLabelPosition();
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__HIDE_LABEL_BY_DEFAULT:
				return isHideLabelByDefault();
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__RESIZE_KIND:
				return getResizeKind();
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
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__APPLIED_ON:
				getAppliedOn().clear();
				getAppliedOn().addAll((Collection<? extends NodeStyleDescription>)newValue);
				return;
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION:
				getOwnedSpecificNodeStyleCustomization().clear();
				getOwnedSpecificNodeStyleCustomization().addAll((Collection<? extends SpecificNodeStyleCustomization>)newValue);
				return;
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION:
				setSizeComputationExpression((CustomizationExpression)newValue);
				return;
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__LABEL_POSITION:
				setLabelPosition((LabelPosition)newValue);
				return;
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__HIDE_LABEL_BY_DEFAULT:
				setHideLabelByDefault((Boolean)newValue);
				return;
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__RESIZE_KIND:
				setResizeKind((ResizeKind)newValue);
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
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__APPLIED_ON:
				getAppliedOn().clear();
				return;
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION:
				getOwnedSpecificNodeStyleCustomization().clear();
				return;
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION:
				setSizeComputationExpression((CustomizationExpression)null);
				return;
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__LABEL_POSITION:
				setLabelPosition(LABEL_POSITION_EDEFAULT);
				return;
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__HIDE_LABEL_BY_DEFAULT:
				setHideLabelByDefault(HIDE_LABEL_BY_DEFAULT_EDEFAULT);
				return;
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__RESIZE_KIND:
				setResizeKind(RESIZE_KIND_EDEFAULT);
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
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__APPLIED_ON:
				return appliedOn != null && !appliedOn.isEmpty();
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION:
				return ownedSpecificNodeStyleCustomization != null && !ownedSpecificNodeStyleCustomization.isEmpty();
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION:
				return sizeComputationExpression != null;
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__LABEL_POSITION:
				return labelPosition != LABEL_POSITION_EDEFAULT;
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__HIDE_LABEL_BY_DEFAULT:
				return hideLabelByDefault != HIDE_LABEL_BY_DEFAULT_EDEFAULT;
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__RESIZE_KIND:
				return resizeKind != RESIZE_KIND_EDEFAULT;
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
		result.append(" (labelPosition: ");
		result.append(labelPosition);
		result.append(", hideLabelByDefault: ");
		result.append(hideLabelByDefault);
		result.append(", resizeKind: ");
		result.append(resizeKind);
		result.append(')');
		return result.toString();
	}


} //NodeStyleCustomizationImpl
