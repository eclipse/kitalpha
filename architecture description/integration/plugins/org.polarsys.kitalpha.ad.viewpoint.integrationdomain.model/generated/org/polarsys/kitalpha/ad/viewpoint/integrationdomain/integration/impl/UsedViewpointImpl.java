/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.IntegrationPackage;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Used Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.UsedViewpointImpl#getVpId <em>Vp Id</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.UsedViewpointImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.UsedViewpointImpl#isFiltered <em>Filtered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsedViewpointImpl extends EObjectImpl implements UsedViewpoint {

	/**
	 * The default value of the '{@link #getVpId() <em>Vp Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpId()
	 * @generated
	 * @ordered
	 */
	protected static final String VP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpId() <em>Vp Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpId()
	 * @generated
	 * @ordered
	 */
	protected String vpId = VP_ID_EDEFAULT;




	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;



	/**
	 * The default value of the '{@link #isFiltered() <em>Filtered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiltered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILTERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFiltered() <em>Filtered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiltered()
	 * @generated
	 * @ordered
	 */
	protected boolean filtered = FILTERED_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsedViewpointImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntegrationPackage.Literals.USED_VIEWPOINT;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getVpId() {

		return vpId;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setVpId(String newVpId) {

		String oldVpId = vpId;
		vpId = newVpId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrationPackage.USED_VIEWPOINT__VP_ID, oldVpId, vpId));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getVersion() {

		return version;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setVersion(String newVersion) {

		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrationPackage.USED_VIEWPOINT__VERSION, oldVersion, version));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isFiltered() {

		return filtered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setFiltered(boolean newFiltered) {

		boolean oldFiltered = filtered;
		filtered = newFiltered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrationPackage.USED_VIEWPOINT__FILTERED, oldFiltered, filtered));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntegrationPackage.USED_VIEWPOINT__VP_ID:
				return getVpId();
			case IntegrationPackage.USED_VIEWPOINT__VERSION:
				return getVersion();
			case IntegrationPackage.USED_VIEWPOINT__FILTERED:
				return isFiltered();
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
			case IntegrationPackage.USED_VIEWPOINT__VP_ID:
				setVpId((String)newValue);
				return;
			case IntegrationPackage.USED_VIEWPOINT__VERSION:
				setVersion((String)newValue);
				return;
			case IntegrationPackage.USED_VIEWPOINT__FILTERED:
				setFiltered((Boolean)newValue);
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
			case IntegrationPackage.USED_VIEWPOINT__VP_ID:
				setVpId(VP_ID_EDEFAULT);
				return;
			case IntegrationPackage.USED_VIEWPOINT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case IntegrationPackage.USED_VIEWPOINT__FILTERED:
				setFiltered(FILTERED_EDEFAULT);
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
			case IntegrationPackage.USED_VIEWPOINT__VP_ID:
				return VP_ID_EDEFAULT == null ? vpId != null : !VP_ID_EDEFAULT.equals(vpId);
			case IntegrationPackage.USED_VIEWPOINT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case IntegrationPackage.USED_VIEWPOINT__FILTERED:
				return filtered != FILTERED_EDEFAULT;
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
		result.append(" (vpId: ");
		result.append(vpId);
		result.append(", version: ");
		result.append(version);
		result.append(", filtered: ");
		result.append(filtered);
		result.append(')');
		return result.toString();
	}


} //UsedViewpointImpl
