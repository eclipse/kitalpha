/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ViewConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ViewConfigurationImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ViewConfigurationImpl#isActivable <em>Activable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewConfigurationImpl extends ConfigurationElementImpl implements ViewConfiguration {
	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isActivable() <em>Activable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActivable() <em>Activable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivable()
	 * @generated
	 * @ordered
	 */
	protected boolean activable = ACTIVABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewConfigurationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpconfPackage.Literals.VIEW_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {

		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {

		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpconfPackage.VIEW_CONFIGURATION__VISIBLE, oldVisible, visible));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActivable() {

		return activable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivable(boolean newActivable) {

		boolean oldActivable = activable;
		activable = newActivable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpconfPackage.VIEW_CONFIGURATION__ACTIVABLE, oldActivable, activable));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpconfPackage.VIEW_CONFIGURATION__VISIBLE:
				return isVisible();
			case VpconfPackage.VIEW_CONFIGURATION__ACTIVABLE:
				return isActivable();
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
			case VpconfPackage.VIEW_CONFIGURATION__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case VpconfPackage.VIEW_CONFIGURATION__ACTIVABLE:
				setActivable((Boolean)newValue);
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
			case VpconfPackage.VIEW_CONFIGURATION__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case VpconfPackage.VIEW_CONFIGURATION__ACTIVABLE:
				setActivable(ACTIVABLE_EDEFAULT);
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
			case VpconfPackage.VIEW_CONFIGURATION__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case VpconfPackage.VIEW_CONFIGURATION__ACTIVABLE:
				return activable != ACTIVABLE_EDEFAULT;
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
		result.append(" (visible: ");
		result.append(visible);
		result.append(", activable: ");
		result.append(activable);
		result.append(')');
		return result.toString();
	}

} //ViewConfigurationImpl
