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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;
import org.eclipse.sirius.viewpoint.description.style.LabelStyleDescription;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelAlignmentCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Alignment Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelAlignmentCustomizationImpl#getAppliedOn <em>Applied On</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelAlignmentCustomizationImpl#getAlignment <em>Alignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelAlignmentCustomizationImpl extends MinimalEObjectImpl.Container implements LabelAlignmentCustomization {

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated NOT
	 * @ordered
	 */
	protected static final LabelAlignment ALIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected LabelAlignment alignment = ALIGNMENT_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelAlignmentCustomizationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.LABEL_ALIGNMENT_CUSTOMIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public EList<LabelStyleDescription> getAppliedOn() {
		EList<LabelStyleDescription> result = new BasicEList<LabelStyleDescription>();
		if (eContainer instanceof LabelCustomization) 
		{
			LabelCustomization labelCustomization = (LabelCustomization) eContainer;
			final EList<BasicLabelStyleDescription> appliedOn = labelCustomization.getAppliedOn();
			for (BasicLabelStyleDescription basicLabelStyleDescription : appliedOn) 
			{
				if (basicLabelStyleDescription instanceof LabelStyleDescription)
				{
					result.add((LabelStyleDescription) basicLabelStyleDescription);
				}
			}
		}
		return result;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public LabelAlignment getAlignment() {

		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setAlignment(LabelAlignment newAlignment) {

		LabelAlignment oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.LABEL_ALIGNMENT_CUSTOMIZATION__ALIGNMENT, oldAlignment, alignment));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpstylecustomizationPackage.LABEL_ALIGNMENT_CUSTOMIZATION__APPLIED_ON:
				return getAppliedOn();
			case VpstylecustomizationPackage.LABEL_ALIGNMENT_CUSTOMIZATION__ALIGNMENT:
				return getAlignment();
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
			case VpstylecustomizationPackage.LABEL_ALIGNMENT_CUSTOMIZATION__APPLIED_ON:
				getAppliedOn().clear();
				getAppliedOn().addAll((Collection<? extends LabelStyleDescription>)newValue);
				return;
			case VpstylecustomizationPackage.LABEL_ALIGNMENT_CUSTOMIZATION__ALIGNMENT:
				setAlignment((LabelAlignment)newValue);
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
			case VpstylecustomizationPackage.LABEL_ALIGNMENT_CUSTOMIZATION__APPLIED_ON:
				getAppliedOn().clear();
				return;
			case VpstylecustomizationPackage.LABEL_ALIGNMENT_CUSTOMIZATION__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
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
			case VpstylecustomizationPackage.LABEL_ALIGNMENT_CUSTOMIZATION__APPLIED_ON:
				return !getAppliedOn().isEmpty();
			case VpstylecustomizationPackage.LABEL_ALIGNMENT_CUSTOMIZATION__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
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
		result.append(" (alignment: ");
		result.append(alignment);
		result.append(')');
		return result.toString();
	}


} //LabelAlignmentCustomizationImpl
