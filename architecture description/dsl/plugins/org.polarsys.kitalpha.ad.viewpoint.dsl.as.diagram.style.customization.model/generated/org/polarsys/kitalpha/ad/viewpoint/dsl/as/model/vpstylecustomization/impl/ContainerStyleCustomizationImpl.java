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

import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Style Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ContainerStyleCustomizationImpl#getAppliedOn <em>Applied On</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ContainerStyleCustomizationImpl#getOwnedSpecificContainerStyleCustomization <em>Owned Specific Container Style Customization</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ContainerStyleCustomizationImpl#getArcWith <em>Arc With</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ContainerStyleCustomizationImpl#getArcHeight <em>Arc Height</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ContainerStyleCustomizationImpl#isRoundedCorner <em>Rounded Corner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerStyleCustomizationImpl extends AbstractNodeStyleCustomizationImpl implements ContainerStyleCustomization {

	/**
	 * The cached value of the '{@link #getAppliedOn() <em>Applied On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerStyleDescription> appliedOn;




	/**
	 * The cached value of the '{@link #getOwnedSpecificContainerStyleCustomization() <em>Owned Specific Container Style Customization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSpecificContainerStyleCustomization()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificContainerStyleCustomization> ownedSpecificContainerStyleCustomization;




	/**
	 * The default value of the '{@link #getArcWith() <em>Arc With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcWith()
	 * @generated NOT
	 * @ordered
	 */
	protected static final int ARC_WITH_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getArcWith() <em>Arc With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcWith()
	 * @generated
	 * @ordered
	 */
	protected int arcWith = ARC_WITH_EDEFAULT;




	/**
	 * The default value of the '{@link #getArcHeight() <em>Arc Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcHeight()
	 * @generated NOT
	 * @ordered
	 */
	protected static final int ARC_HEIGHT_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getArcHeight() <em>Arc Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcHeight()
	 * @generated
	 * @ordered
	 */
	protected int arcHeight = ARC_HEIGHT_EDEFAULT;




	/**
	 * The default value of the '{@link #isRoundedCorner() <em>Rounded Corner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoundedCorner()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Boolean ROUNDED_CORNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #isRoundedCorner() <em>Rounded Corner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoundedCorner()
	 * @generated NOT
	 * @ordered
	 */
	protected Boolean roundedCorner = ROUNDED_CORNER_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerStyleCustomizationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.CONTAINER_STYLE_CUSTOMIZATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ContainerStyleDescription> getAppliedOn() {

		if (appliedOn == null) {
			appliedOn = new EObjectResolvingEList<ContainerStyleDescription>(ContainerStyleDescription.class, this, VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON);
		}
		return appliedOn;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<SpecificContainerStyleCustomization> getOwnedSpecificContainerStyleCustomization() {

		if (ownedSpecificContainerStyleCustomization == null) {
			ownedSpecificContainerStyleCustomization = new EObjectContainmentEList<SpecificContainerStyleCustomization>(SpecificContainerStyleCustomization.class, this, VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION);
		}
		return ownedSpecificContainerStyleCustomization;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getArcWith() {

		return arcWith;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setArcWith(int newArcWith) {

		int oldArcWith = arcWith;
		arcWith = newArcWith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ARC_WITH, oldArcWith, arcWith));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getArcHeight() {

		return arcHeight;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setArcHeight(int newArcHeight) {

		int oldArcHeight = arcHeight;
		arcHeight = newArcHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ARC_HEIGHT, oldArcHeight, arcHeight));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isRoundedCorner() {

		return roundedCorner;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public void setRoundedCorner(boolean newRoundedCorner) {

		Boolean oldRoundedCorner = roundedCorner;
		roundedCorner = newRoundedCorner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ROUNDED_CORNER, oldRoundedCorner, roundedCorner));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public void setRoundedCorner(Boolean newRoundedCorner) {

		Boolean oldRoundedCorner = roundedCorner;
		roundedCorner = newRoundedCorner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ROUNDED_CORNER, oldRoundedCorner, roundedCorner));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION:
				return ((InternalEList<?>)getOwnedSpecificContainerStyleCustomization()).basicRemove(otherEnd, msgs);
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
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON:
				return getAppliedOn();
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION:
				return getOwnedSpecificContainerStyleCustomization();
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ARC_WITH:
				return getArcWith();
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ARC_HEIGHT:
				return getArcHeight();
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ROUNDED_CORNER:
				return isRoundedCorner();
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
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON:
				getAppliedOn().clear();
				getAppliedOn().addAll((Collection<? extends ContainerStyleDescription>)newValue);
				return;
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION:
				getOwnedSpecificContainerStyleCustomization().clear();
				getOwnedSpecificContainerStyleCustomization().addAll((Collection<? extends SpecificContainerStyleCustomization>)newValue);
				return;
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ARC_WITH:
				setArcWith((Integer)newValue);
				return;
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ARC_HEIGHT:
				setArcHeight((Integer)newValue);
				return;
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ROUNDED_CORNER:
				setRoundedCorner((Boolean)newValue);
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
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON:
				getAppliedOn().clear();
				return;
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION:
				getOwnedSpecificContainerStyleCustomization().clear();
				return;
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ARC_WITH:
				setArcWith(ARC_WITH_EDEFAULT);
				return;
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ARC_HEIGHT:
				setArcHeight(ARC_HEIGHT_EDEFAULT);
				return;
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ROUNDED_CORNER:
				setRoundedCorner(ROUNDED_CORNER_EDEFAULT);
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
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON:
				return appliedOn != null && !appliedOn.isEmpty();
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION:
				return ownedSpecificContainerStyleCustomization != null && !ownedSpecificContainerStyleCustomization.isEmpty();
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ARC_WITH:
				return arcWith != ARC_WITH_EDEFAULT;
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ARC_HEIGHT:
				return arcHeight != ARC_HEIGHT_EDEFAULT;
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ROUNDED_CORNER:
				return roundedCorner != ROUNDED_CORNER_EDEFAULT;
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
		result.append(" (arcWith: ");
		result.append(arcWith);
		result.append(", arcHeight: ");
		result.append(arcHeight);
		result.append(", roundedCorner: ");
		result.append(roundedCorner);
		result.append(')');
		return result.toString();
	}


} //ContainerStyleCustomizationImpl
