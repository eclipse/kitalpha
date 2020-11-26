/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.sirius.viewpoint.description.SystemColors;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorUseCase;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ColorCustomizationImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ColorCustomizationImpl#getAppliedOn <em>Applied On</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.ColorCustomizationImpl#getColorUseCase <em>Color Use Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorCustomizationImpl extends AbstractCustomizationImpl implements ColorCustomization {

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated NOT
	 * @ordered
	 */
	protected static final SystemColors COLOR_EDEFAULT = null;




	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected SystemColors color = COLOR_EDEFAULT;




	/**
	 * The cached value of the '{@link #getAppliedOn() <em>Applied On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> appliedOn;




	/**
	 * The default value of the '{@link #getColorUseCase() <em>Color Use Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorUseCase()
	 * @generated
	 * @ordered
	 */
	protected static final ColorUseCase COLOR_USE_CASE_EDEFAULT = ColorUseCase.BORDER;

	/**
	 * The cached value of the '{@link #getColorUseCase() <em>Color Use Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorUseCase()
	 * @generated
	 * @ordered
	 */
	protected ColorUseCase colorUseCase = COLOR_USE_CASE_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorCustomizationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.COLOR_CUSTOMIZATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public SystemColors getColor() {

		return color;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setColor(SystemColors newColor) {

		SystemColors oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.COLOR_CUSTOMIZATION__COLOR, oldColor, color));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<EObject> getAppliedOn() {

		if (appliedOn == null) {
			appliedOn = new EObjectResolvingEList<EObject>(EObject.class, this, VpstylecustomizationPackage.COLOR_CUSTOMIZATION__APPLIED_ON);
		}
		return appliedOn;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ColorUseCase getColorUseCase() {

		return colorUseCase;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setColorUseCase(ColorUseCase newColorUseCase) {

		ColorUseCase oldColorUseCase = colorUseCase;
		colorUseCase = newColorUseCase == null ? COLOR_USE_CASE_EDEFAULT : newColorUseCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.COLOR_CUSTOMIZATION__COLOR_USE_CASE, oldColorUseCase, colorUseCase));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpstylecustomizationPackage.COLOR_CUSTOMIZATION__COLOR:
				return getColor();
			case VpstylecustomizationPackage.COLOR_CUSTOMIZATION__APPLIED_ON:
				return getAppliedOn();
			case VpstylecustomizationPackage.COLOR_CUSTOMIZATION__COLOR_USE_CASE:
				return getColorUseCase();
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
			case VpstylecustomizationPackage.COLOR_CUSTOMIZATION__COLOR:
				setColor((SystemColors)newValue);
				return;
			case VpstylecustomizationPackage.COLOR_CUSTOMIZATION__APPLIED_ON:
				getAppliedOn().clear();
				getAppliedOn().addAll((Collection<? extends EObject>)newValue);
				return;
			case VpstylecustomizationPackage.COLOR_CUSTOMIZATION__COLOR_USE_CASE:
				setColorUseCase((ColorUseCase)newValue);
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
			case VpstylecustomizationPackage.COLOR_CUSTOMIZATION__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case VpstylecustomizationPackage.COLOR_CUSTOMIZATION__APPLIED_ON:
				getAppliedOn().clear();
				return;
			case VpstylecustomizationPackage.COLOR_CUSTOMIZATION__COLOR_USE_CASE:
				setColorUseCase(COLOR_USE_CASE_EDEFAULT);
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
			case VpstylecustomizationPackage.COLOR_CUSTOMIZATION__COLOR:
				return color != COLOR_EDEFAULT;
			case VpstylecustomizationPackage.COLOR_CUSTOMIZATION__APPLIED_ON:
				return appliedOn != null && !appliedOn.isEmpty();
			case VpstylecustomizationPackage.COLOR_CUSTOMIZATION__COLOR_USE_CASE:
				return colorUseCase != COLOR_USE_CASE_EDEFAULT;
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
		result.append(" (color: ");
		result.append(color);
		result.append(", colorUseCase: ");
		result.append(colorUseCase);
		result.append(')');
		return result.toString();
	}


} //ColorCustomizationImpl
