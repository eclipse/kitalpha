/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.viewpoint.description.DecorationDistributionDirection;
import org.eclipse.sirius.viewpoint.description.Position;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.NamedElementImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDecorator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractDecoratorImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractDecoratorImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractDecoratorImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractDecoratorImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractDecoratorImpl#getTooltip <em>Tooltip</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractDecoratorImpl extends NamedElementImpl implements AbstractDecorator {

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Position POSITION_EDEFAULT = Position.NORTH_LITERAL;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position = POSITION_EDEFAULT;




	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DecorationDistributionDirection DIRECTION_EDEFAULT = DecorationDistributionDirection.VERTICAL;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected DecorationDistributionDirection direction = DIRECTION_EDEFAULT;




	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected ExpressionElement precondition;




	/**
	 * The cached value of the '{@link #getTooltip() <em>Tooltip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected ExpressionElement tooltip;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractDecoratorImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.ABSTRACT_DECORATOR;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Position getPosition() {

		return position;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setPosition(Position newPosition) {

		Position oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.ABSTRACT_DECORATOR__POSITION, oldPosition, position));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public DecorationDistributionDirection getDirection() {

		return direction;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setDirection(DecorationDistributionDirection newDirection) {

		DecorationDistributionDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.ABSTRACT_DECORATOR__DIRECTION, oldDirection, direction));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getIcon() {

		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIcon(String newIcon) {

		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.ABSTRACT_DECORATOR__ICON, oldIcon, icon));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ExpressionElement getPrecondition() {

		return precondition;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetPrecondition(ExpressionElement newPrecondition, NotificationChain msgs) {

		ExpressionElement oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.ABSTRACT_DECORATOR__PRECONDITION, oldPrecondition, newPrecondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setPrecondition(ExpressionElement newPrecondition) {

		if (newPrecondition != precondition) {
			NotificationChain msgs = null;
			if (precondition != null)
				msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.ABSTRACT_DECORATOR__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.ABSTRACT_DECORATOR__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.ABSTRACT_DECORATOR__PRECONDITION, newPrecondition, newPrecondition));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ExpressionElement getTooltip() {

		return tooltip;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetTooltip(ExpressionElement newTooltip, NotificationChain msgs) {

		ExpressionElement oldTooltip = tooltip;
		tooltip = newTooltip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.ABSTRACT_DECORATOR__TOOLTIP, oldTooltip, newTooltip);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setTooltip(ExpressionElement newTooltip) {

		if (newTooltip != tooltip) {
			NotificationChain msgs = null;
			if (tooltip != null)
				msgs = ((InternalEObject)tooltip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.ABSTRACT_DECORATOR__TOOLTIP, null, msgs);
			if (newTooltip != null)
				msgs = ((InternalEObject)newTooltip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.ABSTRACT_DECORATOR__TOOLTIP, null, msgs);
			msgs = basicSetTooltip(newTooltip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.ABSTRACT_DECORATOR__TOOLTIP, newTooltip, newTooltip));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpdiagramPackage.ABSTRACT_DECORATOR__PRECONDITION:
				return basicSetPrecondition(null, msgs);
			case VpdiagramPackage.ABSTRACT_DECORATOR__TOOLTIP:
				return basicSetTooltip(null, msgs);
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
			case VpdiagramPackage.ABSTRACT_DECORATOR__POSITION:
				return getPosition();
			case VpdiagramPackage.ABSTRACT_DECORATOR__DIRECTION:
				return getDirection();
			case VpdiagramPackage.ABSTRACT_DECORATOR__ICON:
				return getIcon();
			case VpdiagramPackage.ABSTRACT_DECORATOR__PRECONDITION:
				return getPrecondition();
			case VpdiagramPackage.ABSTRACT_DECORATOR__TOOLTIP:
				return getTooltip();
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
			case VpdiagramPackage.ABSTRACT_DECORATOR__POSITION:
				setPosition((Position)newValue);
				return;
			case VpdiagramPackage.ABSTRACT_DECORATOR__DIRECTION:
				setDirection((DecorationDistributionDirection)newValue);
				return;
			case VpdiagramPackage.ABSTRACT_DECORATOR__ICON:
				setIcon((String)newValue);
				return;
			case VpdiagramPackage.ABSTRACT_DECORATOR__PRECONDITION:
				setPrecondition((ExpressionElement)newValue);
				return;
			case VpdiagramPackage.ABSTRACT_DECORATOR__TOOLTIP:
				setTooltip((ExpressionElement)newValue);
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
			case VpdiagramPackage.ABSTRACT_DECORATOR__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case VpdiagramPackage.ABSTRACT_DECORATOR__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case VpdiagramPackage.ABSTRACT_DECORATOR__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case VpdiagramPackage.ABSTRACT_DECORATOR__PRECONDITION:
				setPrecondition((ExpressionElement)null);
				return;
			case VpdiagramPackage.ABSTRACT_DECORATOR__TOOLTIP:
				setTooltip((ExpressionElement)null);
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
			case VpdiagramPackage.ABSTRACT_DECORATOR__POSITION:
				return position != POSITION_EDEFAULT;
			case VpdiagramPackage.ABSTRACT_DECORATOR__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case VpdiagramPackage.ABSTRACT_DECORATOR__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case VpdiagramPackage.ABSTRACT_DECORATOR__PRECONDITION:
				return precondition != null;
			case VpdiagramPackage.ABSTRACT_DECORATOR__TOOLTIP:
				return tooltip != null;
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
		result.append(" (position: ");
		result.append(position);
		result.append(", direction: ");
		result.append(direction);
		result.append(", icon: ");
		result.append(icon);
		result.append(')');
		return result.toString();
	}


} //AbstractDecoratorImpl
