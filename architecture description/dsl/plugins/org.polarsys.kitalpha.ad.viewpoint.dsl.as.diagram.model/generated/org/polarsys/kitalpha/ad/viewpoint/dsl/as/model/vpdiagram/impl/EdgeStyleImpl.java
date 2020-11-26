/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.sirius.diagram.EdgeArrows;
import org.eclipse.sirius.diagram.LineStyle;
import org.eclipse.sirius.viewpoint.description.SystemColors;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeStyleImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeStyleImpl#getBeginDecorator <em>Begin Decorator</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeStyleImpl#getEndDecorator <em>End Decorator</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeStyleImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeStyleImpl extends EObjectImpl implements EdgeStyle {

	/**
	 * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected static final LineStyle LINE_STYLE_EDEFAULT = LineStyle.SOLID_LITERAL;

	/**
	 * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected LineStyle lineStyle = LINE_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeginDecorator() <em>Begin Decorator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginDecorator()
	 * @generated
	 * @ordered
	 */
	protected static final EdgeArrows BEGIN_DECORATOR_EDEFAULT = EdgeArrows.NO_DECORATION_LITERAL;

	/**
	 * The cached value of the '{@link #getBeginDecorator() <em>Begin Decorator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginDecorator()
	 * @generated
	 * @ordered
	 */
	protected EdgeArrows beginDecorator = BEGIN_DECORATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDecorator() <em>End Decorator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDecorator()
	 * @generated
	 * @ordered
	 */
	protected static final EdgeArrows END_DECORATOR_EDEFAULT = EdgeArrows.NO_DECORATION_LITERAL;

	/**
	 * The cached value of the '{@link #getEndDecorator() <em>End Decorator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDecorator()
	 * @generated
	 * @ordered
	 */
	protected EdgeArrows endDecorator = END_DECORATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final SystemColors COLOR_EDEFAULT = SystemColors.BLACK_LITERAL;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeStyleImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.EDGE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public LineStyle getLineStyle() {

		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setLineStyle(LineStyle newLineStyle) {

		LineStyle oldLineStyle = lineStyle;
		lineStyle = newLineStyle == null ? LINE_STYLE_EDEFAULT : newLineStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_STYLE__LINE_STYLE, oldLineStyle, lineStyle));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EdgeArrows getBeginDecorator() {

		return beginDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setBeginDecorator(EdgeArrows newBeginDecorator) {

		EdgeArrows oldBeginDecorator = beginDecorator;
		beginDecorator = newBeginDecorator == null ? BEGIN_DECORATOR_EDEFAULT : newBeginDecorator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_STYLE__BEGIN_DECORATOR, oldBeginDecorator, beginDecorator));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EdgeArrows getEndDecorator() {

		return endDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setEndDecorator(EdgeArrows newEndDecorator) {

		EdgeArrows oldEndDecorator = endDecorator;
		endDecorator = newEndDecorator == null ? END_DECORATOR_EDEFAULT : newEndDecorator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_STYLE__END_DECORATOR, oldEndDecorator, endDecorator));

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
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.EDGE_STYLE__COLOR, oldColor, color));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpdiagramPackage.EDGE_STYLE__LINE_STYLE:
				return getLineStyle();
			case VpdiagramPackage.EDGE_STYLE__BEGIN_DECORATOR:
				return getBeginDecorator();
			case VpdiagramPackage.EDGE_STYLE__END_DECORATOR:
				return getEndDecorator();
			case VpdiagramPackage.EDGE_STYLE__COLOR:
				return getColor();
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
			case VpdiagramPackage.EDGE_STYLE__LINE_STYLE:
				setLineStyle((LineStyle)newValue);
				return;
			case VpdiagramPackage.EDGE_STYLE__BEGIN_DECORATOR:
				setBeginDecorator((EdgeArrows)newValue);
				return;
			case VpdiagramPackage.EDGE_STYLE__END_DECORATOR:
				setEndDecorator((EdgeArrows)newValue);
				return;
			case VpdiagramPackage.EDGE_STYLE__COLOR:
				setColor((SystemColors)newValue);
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
			case VpdiagramPackage.EDGE_STYLE__LINE_STYLE:
				setLineStyle(LINE_STYLE_EDEFAULT);
				return;
			case VpdiagramPackage.EDGE_STYLE__BEGIN_DECORATOR:
				setBeginDecorator(BEGIN_DECORATOR_EDEFAULT);
				return;
			case VpdiagramPackage.EDGE_STYLE__END_DECORATOR:
				setEndDecorator(END_DECORATOR_EDEFAULT);
				return;
			case VpdiagramPackage.EDGE_STYLE__COLOR:
				setColor(COLOR_EDEFAULT);
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
			case VpdiagramPackage.EDGE_STYLE__LINE_STYLE:
				return lineStyle != LINE_STYLE_EDEFAULT;
			case VpdiagramPackage.EDGE_STYLE__BEGIN_DECORATOR:
				return beginDecorator != BEGIN_DECORATOR_EDEFAULT;
			case VpdiagramPackage.EDGE_STYLE__END_DECORATOR:
				return endDecorator != END_DECORATOR_EDEFAULT;
			case VpdiagramPackage.EDGE_STYLE__COLOR:
				return color != COLOR_EDEFAULT;
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
		result.append(" (lineStyle: ");
		result.append(lineStyle);
		result.append(", beginDecorator: ");
		result.append(beginDecorator);
		result.append(", endDecorator: ");
		result.append(endDecorator);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //EdgeStyleImpl
