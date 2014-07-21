/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ExtensionGeneratrionConfigurationImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.ConfigurationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.DiagramGenerationConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Generation Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.configuration.impl.DiagramGenerationConfigurationImpl#isOverwriteVSM <em>Overwrite VSM</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramGenerationConfigurationImpl extends ExtensionGeneratrionConfigurationImpl implements DiagramGenerationConfiguration {
	/**
	 * The default value of the '{@link #isOverwriteVSM() <em>Overwrite VSM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverwriteVSM()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERWRITE_VSM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverwriteVSM() <em>Overwrite VSM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverwriteVSM()
	 * @generated
	 * @ordered
	 */
	protected boolean overwriteVSM = OVERWRITE_VSM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramGenerationConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.DIAGRAM_GENERATION_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverwriteVSM() {
		return overwriteVSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverwriteVSM(boolean newOverwriteVSM) {
		boolean oldOverwriteVSM = overwriteVSM;
		overwriteVSM = newOverwriteVSM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DIAGRAM_GENERATION_CONFIGURATION__OVERWRITE_VSM, oldOverwriteVSM, overwriteVSM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.DIAGRAM_GENERATION_CONFIGURATION__OVERWRITE_VSM:
				return isOverwriteVSM();
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
			case ConfigurationPackage.DIAGRAM_GENERATION_CONFIGURATION__OVERWRITE_VSM:
				setOverwriteVSM((Boolean)newValue);
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
			case ConfigurationPackage.DIAGRAM_GENERATION_CONFIGURATION__OVERWRITE_VSM:
				setOverwriteVSM(OVERWRITE_VSM_EDEFAULT);
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
			case ConfigurationPackage.DIAGRAM_GENERATION_CONFIGURATION__OVERWRITE_VSM:
				return overwriteVSM != OVERWRITE_VSM_EDEFAULT;
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
		result.append(" (overwriteVSM: ");
		result.append(overwriteVSM);
		result.append(')');
		return result.toString();
	}

} //DiagramGenerationConfigurationImpl
