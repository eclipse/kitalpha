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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sirius.viewpoint.FontFormat;

import org.eclipse.sirius.viewpoint.description.SystemColors;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.CustomizationExpression;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelAlignmentCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelCustomizationImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelCustomizationImpl#getOwnedLabelAlignment <em>Owned Label Alignment</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelCustomizationImpl#getAppliedOn <em>Applied On</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelCustomizationImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelCustomizationImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelCustomizationImpl#isShowIcon <em>Show Icon</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelCustomizationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LabelCustomizationImpl#getIconPath <em>Icon Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelCustomizationImpl extends AbstractCustomizationImpl implements LabelCustomization {

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
	 * The cached value of the '{@link #getOwnedLabelAlignment() <em>Owned Label Alignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLabelAlignment()
	 * @generated
	 * @ordered
	 */
	protected LabelAlignmentCustomization ownedLabelAlignment;




	/**
	 * The cached value of the '{@link #getAppliedOn() <em>Applied On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicLabelStyleDescription> appliedOn;




	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated NOT
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;




	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated NOT
	 * @ordered
	 */
	protected static final FontFormat FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected FontFormat format = FORMAT_EDEFAULT;




	/**
	 * The default value of the '{@link #isShowIcon() <em>Show Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowIcon()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Boolean SHOW_ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #isShowIcon() <em>Show Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowIcon()
	 * @generated NOT
	 * @ordered
	 */
	protected Boolean showIcon = SHOW_ICON_EDEFAULT;




	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected CustomizationExpression expression;




	/**
	 * The default value of the '{@link #getIconPath() <em>Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconPath()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconPath() <em>Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconPath()
	 * @generated
	 * @ordered
	 */
	protected String iconPath = ICON_PATH_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelCustomizationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.LABEL_CUSTOMIZATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.LABEL_CUSTOMIZATION__COLOR, oldColor, color));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public LabelAlignmentCustomization getOwnedLabelAlignment() {

		return ownedLabelAlignment;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedLabelAlignment(LabelAlignmentCustomization newOwnedLabelAlignment, NotificationChain msgs) {

		LabelAlignmentCustomization oldOwnedLabelAlignment = ownedLabelAlignment;
		ownedLabelAlignment = newOwnedLabelAlignment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.LABEL_CUSTOMIZATION__OWNED_LABEL_ALIGNMENT, oldOwnedLabelAlignment, newOwnedLabelAlignment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOwnedLabelAlignment(LabelAlignmentCustomization newOwnedLabelAlignment) {

		if (newOwnedLabelAlignment != ownedLabelAlignment) {
			NotificationChain msgs = null;
			if (ownedLabelAlignment != null)
				msgs = ((InternalEObject)ownedLabelAlignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.LABEL_CUSTOMIZATION__OWNED_LABEL_ALIGNMENT, null, msgs);
			if (newOwnedLabelAlignment != null)
				msgs = ((InternalEObject)newOwnedLabelAlignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.LABEL_CUSTOMIZATION__OWNED_LABEL_ALIGNMENT, null, msgs);
			msgs = basicSetOwnedLabelAlignment(newOwnedLabelAlignment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.LABEL_CUSTOMIZATION__OWNED_LABEL_ALIGNMENT, newOwnedLabelAlignment, newOwnedLabelAlignment));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<BasicLabelStyleDescription> getAppliedOn() {

		if (appliedOn == null) {
			appliedOn = new EObjectResolvingEList<BasicLabelStyleDescription>(BasicLabelStyleDescription.class, this, VpstylecustomizationPackage.LABEL_CUSTOMIZATION__APPLIED_ON);
		}
		return appliedOn;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getSize() {

		return size;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setSize(int newSize) {

		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.LABEL_CUSTOMIZATION__SIZE, oldSize, size));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public FontFormat getFormat() {

		return format;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setFormat(FontFormat newFormat) {

		FontFormat oldFormat = format;
		format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.LABEL_CUSTOMIZATION__FORMAT, oldFormat, format));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isShowIcon() {

		return showIcon;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public void setShowIcon(boolean newShowIcon) {

		Boolean oldShowIcon = showIcon;
		showIcon = newShowIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.LABEL_CUSTOMIZATION__SHOW_ICON, oldShowIcon, showIcon));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public void setShowIcon(Boolean newShowIcon) {
		Boolean oldShowIcon = showIcon;
		showIcon = newShowIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.LABEL_CUSTOMIZATION__SHOW_ICON, oldShowIcon, showIcon));
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CustomizationExpression getExpression() {

		return expression;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetExpression(CustomizationExpression newExpression, NotificationChain msgs) {

		CustomizationExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.LABEL_CUSTOMIZATION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setExpression(CustomizationExpression newExpression) {

		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.LABEL_CUSTOMIZATION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.LABEL_CUSTOMIZATION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.LABEL_CUSTOMIZATION__EXPRESSION, newExpression, newExpression));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getIconPath() {

		return iconPath;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIconPath(String newIconPath) {

		String oldIconPath = iconPath;
		iconPath = newIconPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.LABEL_CUSTOMIZATION__ICON_PATH, oldIconPath, iconPath));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__OWNED_LABEL_ALIGNMENT:
				return basicSetOwnedLabelAlignment(null, msgs);
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__COLOR:
				return getColor();
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__OWNED_LABEL_ALIGNMENT:
				return getOwnedLabelAlignment();
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__APPLIED_ON:
				return getAppliedOn();
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__SIZE:
				return getSize();
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__FORMAT:
				return getFormat();
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__SHOW_ICON:
				return isShowIcon();
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__EXPRESSION:
				return getExpression();
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__ICON_PATH:
				return getIconPath();
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
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__COLOR:
				setColor((SystemColors)newValue);
				return;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__OWNED_LABEL_ALIGNMENT:
				setOwnedLabelAlignment((LabelAlignmentCustomization)newValue);
				return;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__APPLIED_ON:
				getAppliedOn().clear();
				getAppliedOn().addAll((Collection<? extends BasicLabelStyleDescription>)newValue);
				return;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__SIZE:
				setSize((Integer)newValue);
				return;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__FORMAT:
				setFormat((FontFormat)newValue);
				return;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__SHOW_ICON:
				setShowIcon((Boolean)newValue);
				return;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__EXPRESSION:
				setExpression((CustomizationExpression)newValue);
				return;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__ICON_PATH:
				setIconPath((String)newValue);
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
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__OWNED_LABEL_ALIGNMENT:
				setOwnedLabelAlignment((LabelAlignmentCustomization)null);
				return;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__APPLIED_ON:
				getAppliedOn().clear();
				return;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__SHOW_ICON:
				setShowIcon(SHOW_ICON_EDEFAULT);
				return;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__EXPRESSION:
				setExpression((CustomizationExpression)null);
				return;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__ICON_PATH:
				setIconPath(ICON_PATH_EDEFAULT);
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
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__COLOR:
				return color != COLOR_EDEFAULT;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__OWNED_LABEL_ALIGNMENT:
				return ownedLabelAlignment != null;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__APPLIED_ON:
				return appliedOn != null && !appliedOn.isEmpty();
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__SIZE:
				return size != SIZE_EDEFAULT;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__FORMAT:
				return format != FORMAT_EDEFAULT;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__SHOW_ICON:
				return showIcon != SHOW_ICON_EDEFAULT;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__EXPRESSION:
				return expression != null;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__ICON_PATH:
				return ICON_PATH_EDEFAULT == null ? iconPath != null : !ICON_PATH_EDEFAULT.equals(iconPath);
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
		result.append(", size: ");
		result.append(size);
		result.append(", format: ");
		result.append(format);
		result.append(", showIcon: ");
		result.append(showIcon);
		result.append(", iconPath: ");
		result.append(iconPath);
		result.append(')');
		return result.toString();
	}


} //LabelCustomizationImpl
