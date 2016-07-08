/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ExtensionGeneratrionConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GenerationImpl#getOwnedDataGenerationConf <em>Owned Data Generation Conf</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GenerationImpl#getOwnedExtensionGenConf <em>Owned Extension Gen Conf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenerationImpl extends ConfigurationElementImpl implements Generation {

	/**
	 * The cached value of the '{@link #getOwnedDataGenerationConf() <em>Owned Data Generation Conf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDataGenerationConf()
	 * @generated
	 * @ordered
	 */
	protected GData ownedDataGenerationConf;



	/**
	 * The cached value of the '{@link #getOwnedExtensionGenConf() <em>Owned Extension Gen Conf</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExtensionGenConf()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionGeneratrionConfiguration> ownedExtensionGenConf;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpconfPackage.Literals.GENERATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public GData getOwnedDataGenerationConf() {

		return ownedDataGenerationConf;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedDataGenerationConf(GData newOwnedDataGenerationConf, NotificationChain msgs) {

		GData oldOwnedDataGenerationConf = ownedDataGenerationConf;
		ownedDataGenerationConf = newOwnedDataGenerationConf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpconfPackage.GENERATION__OWNED_DATA_GENERATION_CONF, oldOwnedDataGenerationConf, newOwnedDataGenerationConf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOwnedDataGenerationConf(GData newOwnedDataGenerationConf) {

		if (newOwnedDataGenerationConf != ownedDataGenerationConf) {
			NotificationChain msgs = null;
			if (ownedDataGenerationConf != null)
				msgs = ((InternalEObject)ownedDataGenerationConf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpconfPackage.GENERATION__OWNED_DATA_GENERATION_CONF, null, msgs);
			if (newOwnedDataGenerationConf != null)
				msgs = ((InternalEObject)newOwnedDataGenerationConf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpconfPackage.GENERATION__OWNED_DATA_GENERATION_CONF, null, msgs);
			msgs = basicSetOwnedDataGenerationConf(newOwnedDataGenerationConf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpconfPackage.GENERATION__OWNED_DATA_GENERATION_CONF, newOwnedDataGenerationConf, newOwnedDataGenerationConf));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ExtensionGeneratrionConfiguration> getOwnedExtensionGenConf() {

		if (ownedExtensionGenConf == null) {
			ownedExtensionGenConf = new EObjectContainmentEList<ExtensionGeneratrionConfiguration>(ExtensionGeneratrionConfiguration.class, this, VpconfPackage.GENERATION__OWNED_EXTENSION_GEN_CONF);
		}
		return ownedExtensionGenConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpconfPackage.GENERATION__OWNED_DATA_GENERATION_CONF:
				return basicSetOwnedDataGenerationConf(null, msgs);
			case VpconfPackage.GENERATION__OWNED_EXTENSION_GEN_CONF:
				return ((InternalEList<?>)getOwnedExtensionGenConf()).basicRemove(otherEnd, msgs);
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
			case VpconfPackage.GENERATION__OWNED_DATA_GENERATION_CONF:
				return getOwnedDataGenerationConf();
			case VpconfPackage.GENERATION__OWNED_EXTENSION_GEN_CONF:
				return getOwnedExtensionGenConf();
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
			case VpconfPackage.GENERATION__OWNED_DATA_GENERATION_CONF:
				setOwnedDataGenerationConf((GData)newValue);
				return;
			case VpconfPackage.GENERATION__OWNED_EXTENSION_GEN_CONF:
				getOwnedExtensionGenConf().clear();
				getOwnedExtensionGenConf().addAll((Collection<? extends ExtensionGeneratrionConfiguration>)newValue);
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
			case VpconfPackage.GENERATION__OWNED_DATA_GENERATION_CONF:
				setOwnedDataGenerationConf((GData)null);
				return;
			case VpconfPackage.GENERATION__OWNED_EXTENSION_GEN_CONF:
				getOwnedExtensionGenConf().clear();
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
			case VpconfPackage.GENERATION__OWNED_DATA_GENERATION_CONF:
				return ownedDataGenerationConf != null;
			case VpconfPackage.GENERATION__OWNED_EXTENSION_GEN_CONF:
				return ownedExtensionGenConf != null && !ownedExtensionGenConf.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //GenerationImpl
