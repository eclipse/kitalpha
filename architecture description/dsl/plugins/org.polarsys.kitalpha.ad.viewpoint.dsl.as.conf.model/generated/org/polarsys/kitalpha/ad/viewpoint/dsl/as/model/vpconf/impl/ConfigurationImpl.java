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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ConfigurationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.util.ConfigurationElementsAdditionsHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AspectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ConfigurationImpl#getVpConfigurationElements <em>Vp Configuration Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends AspectImpl implements Configuration {

	/**
	 * The cached value of the '{@link #getVpConfigurationElements() <em>Vp Configuration Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpConfigurationElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationElement> vpConfigurationElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpconfPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public EList<ConfigurationElement> getVpConfigurationElements() {

		if (vpConfigurationElements == null) {
			vpConfigurationElements = new EObjectContainmentEList<ConfigurationElement>(
					ConfigurationElement.class, this,
					VpconfPackage.CONFIGURATION__VP_CONFIGURATION_ELEMENTS) {
				/**
				 * 
				 */
				private static final long serialVersionUID = 6829178693120879849L;

				public boolean add(ConfigurationElement object) {
					if (ConfigurationElementsAdditionsHelper
							.canAddMoreConfigurationElement(this, object)) {
						return super.add(object);
					}
					return false;
				};

				public void add(int index, ConfigurationElement object) {
					if (ConfigurationElementsAdditionsHelper
							.canAddMoreConfigurationElement(this, object)) {
						super.add(index, object);
					}
				};

				public boolean addAll(
						java.util.Collection<? extends ConfigurationElement> collection) {
					if (ConfigurationElementsAdditionsHelper
							.canAddMoreConfigurationElements(this, collection)) {
						return super.addAll(collection);
					}
					return false;
				};

				public boolean addAll(
						int index,
						java.util.Collection<? extends ConfigurationElement> collection) {
					if (ConfigurationElementsAdditionsHelper
							.canAddMoreConfigurationElements(this, collection)) {
						return super.addAll(index, collection);
					}
					return false;

				};
			};
		}
		return vpConfigurationElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpconfPackage.CONFIGURATION__VP_CONFIGURATION_ELEMENTS:
				return ((InternalEList<?>)getVpConfigurationElements()).basicRemove(otherEnd, msgs);
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
			case VpconfPackage.CONFIGURATION__VP_CONFIGURATION_ELEMENTS:
				return getVpConfigurationElements();
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
			case VpconfPackage.CONFIGURATION__VP_CONFIGURATION_ELEMENTS:
				getVpConfigurationElements().clear();
				getVpConfigurationElements().addAll((Collection<? extends ConfigurationElement>)newValue);
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
			case VpconfPackage.CONFIGURATION__VP_CONFIGURATION_ELEMENTS:
				getVpConfigurationElements().clear();
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
			case VpconfPackage.CONFIGURATION__VP_CONFIGURATION_ELEMENTS:
				return vpConfigurationElements != null && !vpConfigurationElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
