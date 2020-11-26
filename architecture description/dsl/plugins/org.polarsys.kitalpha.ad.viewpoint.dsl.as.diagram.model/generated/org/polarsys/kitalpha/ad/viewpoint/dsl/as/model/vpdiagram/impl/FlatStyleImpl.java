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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.sirius.diagram.BackgroundStyle;
import org.eclipse.sirius.viewpoint.description.SystemColors;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flat Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.FlatStyleImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.FlatStyleImpl#getForgroundColor <em>Forground Color</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.FlatStyleImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.FlatStyleImpl#getBackgroundStyle <em>Background Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlatStyleImpl extends AbstractContainerStyleImpl implements
		FlatStyle {

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final SystemColors BACKGROUND_COLOR_EDEFAULT = SystemColors.BLACK_LITERAL;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected SystemColors backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getForgroundColor() <em>Forground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final SystemColors FORGROUND_COLOR_EDEFAULT = SystemColors.BLACK_LITERAL;

	/**
	 * The cached value of the '{@link #getForgroundColor() <em>Forground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForgroundColor()
	 * @generated
	 * @ordered
	 */
	protected SystemColors forgroundColor = FORGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected static final SystemColors BORDER_COLOR_EDEFAULT = SystemColors.BLACK_LITERAL;

	/**
	 * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected SystemColors borderColor = BORDER_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundStyle() <em>Background Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundStyle()
	 * @generated
	 * @ordered
	 */
	protected static final BackgroundStyle BACKGROUND_STYLE_EDEFAULT = BackgroundStyle.GRADIENT_LEFT_TO_RIGHT_LITERAL;

	/**
	 * The cached value of the '{@link #getBackgroundStyle() <em>Background Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundStyle()
	 * @generated
	 * @ordered
	 */
	protected BackgroundStyle backgroundStyle = BACKGROUND_STYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlatStyleImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.FLAT_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public SystemColors getBackgroundColor() {

		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setBackgroundColor(SystemColors newBackgroundColor) {

		SystemColors oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor == null ? BACKGROUND_COLOR_EDEFAULT : newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.FLAT_STYLE__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public SystemColors getForgroundColor() {

		return forgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setForgroundColor(SystemColors newForgroundColor) {

		SystemColors oldForgroundColor = forgroundColor;
		forgroundColor = newForgroundColor == null ? FORGROUND_COLOR_EDEFAULT : newForgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.FLAT_STYLE__FORGROUND_COLOR, oldForgroundColor, forgroundColor));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public SystemColors getBorderColor() {

		return borderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setBorderColor(SystemColors newBorderColor) {

		SystemColors oldBorderColor = borderColor;
		borderColor = newBorderColor == null ? BORDER_COLOR_EDEFAULT : newBorderColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.FLAT_STYLE__BORDER_COLOR, oldBorderColor, borderColor));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public BackgroundStyle getBackgroundStyle() {

		return backgroundStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setBackgroundStyle(BackgroundStyle newBackgroundStyle) {

		BackgroundStyle oldBackgroundStyle = backgroundStyle;
		backgroundStyle = newBackgroundStyle == null ? BACKGROUND_STYLE_EDEFAULT : newBackgroundStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.FLAT_STYLE__BACKGROUND_STYLE, oldBackgroundStyle, backgroundStyle));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpdiagramPackage.FLAT_STYLE__BACKGROUND_COLOR:
				return getBackgroundColor();
			case VpdiagramPackage.FLAT_STYLE__FORGROUND_COLOR:
				return getForgroundColor();
			case VpdiagramPackage.FLAT_STYLE__BORDER_COLOR:
				return getBorderColor();
			case VpdiagramPackage.FLAT_STYLE__BACKGROUND_STYLE:
				return getBackgroundStyle();
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
			case VpdiagramPackage.FLAT_STYLE__BACKGROUND_COLOR:
				setBackgroundColor((SystemColors)newValue);
				return;
			case VpdiagramPackage.FLAT_STYLE__FORGROUND_COLOR:
				setForgroundColor((SystemColors)newValue);
				return;
			case VpdiagramPackage.FLAT_STYLE__BORDER_COLOR:
				setBorderColor((SystemColors)newValue);
				return;
			case VpdiagramPackage.FLAT_STYLE__BACKGROUND_STYLE:
				setBackgroundStyle((BackgroundStyle)newValue);
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
			case VpdiagramPackage.FLAT_STYLE__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case VpdiagramPackage.FLAT_STYLE__FORGROUND_COLOR:
				setForgroundColor(FORGROUND_COLOR_EDEFAULT);
				return;
			case VpdiagramPackage.FLAT_STYLE__BORDER_COLOR:
				setBorderColor(BORDER_COLOR_EDEFAULT);
				return;
			case VpdiagramPackage.FLAT_STYLE__BACKGROUND_STYLE:
				setBackgroundStyle(BACKGROUND_STYLE_EDEFAULT);
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
			case VpdiagramPackage.FLAT_STYLE__BACKGROUND_COLOR:
				return backgroundColor != BACKGROUND_COLOR_EDEFAULT;
			case VpdiagramPackage.FLAT_STYLE__FORGROUND_COLOR:
				return forgroundColor != FORGROUND_COLOR_EDEFAULT;
			case VpdiagramPackage.FLAT_STYLE__BORDER_COLOR:
				return borderColor != BORDER_COLOR_EDEFAULT;
			case VpdiagramPackage.FLAT_STYLE__BACKGROUND_STYLE:
				return backgroundStyle != BACKGROUND_STYLE_EDEFAULT;
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
		result.append(" (backgroundColor: ");
		result.append(backgroundColor);
		result.append(", forgroundColor: ");
		result.append(forgroundColor);
		result.append(", borderColor: ");
		result.append(borderColor);
		result.append(", backgroundStyle: ");
		result.append(backgroundStyle);
		result.append(')');
		return result.toString();
	}

} //FlatStyleImpl
