/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ExtensionGeneratrionConfigurationImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.AirdGenerationConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.DescAirdGenConfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aird Generation Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.descAirdGenConf.impl.AirdGenerationConfigurationImpl#isGenRepresentations <em>Gen Representations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AirdGenerationConfigurationImpl extends ExtensionGeneratrionConfigurationImpl implements AirdGenerationConfiguration {
	/**
	 * The default value of the '{@link #isGenRepresentations() <em>Gen Representations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenRepresentations()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GEN_REPRESENTATIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenRepresentations() <em>Gen Representations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenRepresentations()
	 * @generated
	 * @ordered
	 */
	protected boolean genRepresentations = GEN_REPRESENTATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirdGenerationConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescAirdGenConfPackage.Literals.AIRD_GENERATION_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenRepresentations() {
		return genRepresentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenRepresentations(boolean newGenRepresentations) {
		boolean oldGenRepresentations = genRepresentations;
		genRepresentations = newGenRepresentations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescAirdGenConfPackage.AIRD_GENERATION_CONFIGURATION__GEN_REPRESENTATIONS, oldGenRepresentations, genRepresentations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DescAirdGenConfPackage.AIRD_GENERATION_CONFIGURATION__GEN_REPRESENTATIONS:
				return isGenRepresentations();
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
			case DescAirdGenConfPackage.AIRD_GENERATION_CONFIGURATION__GEN_REPRESENTATIONS:
				setGenRepresentations((Boolean)newValue);
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
			case DescAirdGenConfPackage.AIRD_GENERATION_CONFIGURATION__GEN_REPRESENTATIONS:
				setGenRepresentations(GEN_REPRESENTATIONS_EDEFAULT);
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
			case DescAirdGenConfPackage.AIRD_GENERATION_CONFIGURATION__GEN_REPRESENTATIONS:
				return genRepresentations != GEN_REPRESENTATIONS_EDEFAULT;
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (genRepresentations: ");
		result.append(genRepresentations);
		result.append(')');
		return result.toString();
	}

} //AirdGenerationConfigurationImpl
