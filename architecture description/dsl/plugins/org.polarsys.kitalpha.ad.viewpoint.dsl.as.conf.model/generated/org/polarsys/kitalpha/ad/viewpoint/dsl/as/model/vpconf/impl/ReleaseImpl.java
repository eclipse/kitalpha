/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Release;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ReleaseImpl#getViewpointVersion <em>Viewpoint Version</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ReleaseImpl#getViewpointDescription <em>Viewpoint Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ReleaseImpl#getRequiredExecutionEnvironment <em>Required Execution Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseImpl extends ConfigurationElementImpl implements Release {

	/**
	 * The default value of the '{@link #getViewpointVersion() <em>Viewpoint Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpointVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Version VIEWPOINT_VERSION_EDEFAULT = (Version)VpconfFactory.eINSTANCE.createFromString(VpconfPackage.eINSTANCE.getVersion(), "0.0.0");

	/**
	 * The cached value of the '{@link #getViewpointVersion() <em>Viewpoint Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpointVersion()
	 * @generated
	 * @ordered
	 */
	protected Version viewpointVersion = VIEWPOINT_VERSION_EDEFAULT;




	/**
	 * The default value of the '{@link #getViewpointDescription() <em>Viewpoint Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpointDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEWPOINT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewpointDescription() <em>Viewpoint Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpointDescription()
	 * @generated
	 * @ordered
	 */
	protected String viewpointDescription = VIEWPOINT_DESCRIPTION_EDEFAULT;




	/**
	 * The cached value of the '{@link #getRequiredExecutionEnvironment() <em>Required Execution Environment</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<String> requiredExecutionEnvironment;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpconfPackage.Literals.RELEASE;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Version getViewpointVersion() {

		return viewpointVersion;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setViewpointVersion(Version newViewpointVersion) {

		Version oldViewpointVersion = viewpointVersion;
		viewpointVersion = newViewpointVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpconfPackage.RELEASE__VIEWPOINT_VERSION, oldViewpointVersion, viewpointVersion));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getViewpointDescription() {

		return viewpointDescription;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setViewpointDescription(String newViewpointDescription) {

		String oldViewpointDescription = viewpointDescription;
		viewpointDescription = newViewpointDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpconfPackage.RELEASE__VIEWPOINT_DESCRIPTION, oldViewpointDescription, viewpointDescription));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<String> getRequiredExecutionEnvironment() {

		if (requiredExecutionEnvironment == null) {
			requiredExecutionEnvironment = new EDataTypeUniqueEList<String>(String.class, this, VpconfPackage.RELEASE__REQUIRED_EXECUTION_ENVIRONMENT);
		}
		return requiredExecutionEnvironment;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpconfPackage.RELEASE__VIEWPOINT_VERSION:
				return getViewpointVersion();
			case VpconfPackage.RELEASE__VIEWPOINT_DESCRIPTION:
				return getViewpointDescription();
			case VpconfPackage.RELEASE__REQUIRED_EXECUTION_ENVIRONMENT:
				return getRequiredExecutionEnvironment();
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
			case VpconfPackage.RELEASE__VIEWPOINT_VERSION:
				setViewpointVersion((Version)newValue);
				return;
			case VpconfPackage.RELEASE__VIEWPOINT_DESCRIPTION:
				setViewpointDescription((String)newValue);
				return;
			case VpconfPackage.RELEASE__REQUIRED_EXECUTION_ENVIRONMENT:
				getRequiredExecutionEnvironment().clear();
				getRequiredExecutionEnvironment().addAll((Collection<? extends String>)newValue);
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
			case VpconfPackage.RELEASE__VIEWPOINT_VERSION:
				setViewpointVersion(VIEWPOINT_VERSION_EDEFAULT);
				return;
			case VpconfPackage.RELEASE__VIEWPOINT_DESCRIPTION:
				setViewpointDescription(VIEWPOINT_DESCRIPTION_EDEFAULT);
				return;
			case VpconfPackage.RELEASE__REQUIRED_EXECUTION_ENVIRONMENT:
				getRequiredExecutionEnvironment().clear();
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
			case VpconfPackage.RELEASE__VIEWPOINT_VERSION:
				return VIEWPOINT_VERSION_EDEFAULT == null ? viewpointVersion != null : !VIEWPOINT_VERSION_EDEFAULT.equals(viewpointVersion);
			case VpconfPackage.RELEASE__VIEWPOINT_DESCRIPTION:
				return VIEWPOINT_DESCRIPTION_EDEFAULT == null ? viewpointDescription != null : !VIEWPOINT_DESCRIPTION_EDEFAULT.equals(viewpointDescription);
			case VpconfPackage.RELEASE__REQUIRED_EXECUTION_ENVIRONMENT:
				return requiredExecutionEnvironment != null && !requiredExecutionEnvironment.isEmpty();
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
		result.append(" (viewpointVersion: ");
		result.append(viewpointVersion);
		result.append(", viewpointDescription: ");
		result.append(viewpointDescription);
		result.append(", requiredExecutionEnvironment: ");
		result.append(requiredExecutionEnvironment);
		result.append(')');
		return result.toString();
	}


} //ReleaseImpl
