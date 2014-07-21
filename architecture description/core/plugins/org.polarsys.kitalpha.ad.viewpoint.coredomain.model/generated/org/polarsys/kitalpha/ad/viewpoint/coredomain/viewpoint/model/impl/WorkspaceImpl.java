/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.PropertySet;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RuleSet;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ServiceSet;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.WorkspaceImpl#getRuleSets <em>Rule Sets</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.WorkspaceImpl#getServiceSets <em>Service Sets</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.WorkspaceImpl#getActiveViewpoints <em>Active Viewpoints</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.WorkspaceImpl#getPropertySets <em>Property Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkspaceImpl extends EObjectImpl implements Workspace {

	/**
	 * The cached value of the '{@link #getRuleSets() <em>Rule Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleSets()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleSet> ruleSets;




	/**
	 * The cached value of the '{@link #getServiceSets() <em>Service Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceSet> serviceSets;




	/**
	 * The cached value of the '{@link #getActiveViewpoints() <em>Active Viewpoints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveViewpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Viewpoint> activeViewpoints;




	/**
	 * The cached value of the '{@link #getPropertySets() <em>Property Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertySets()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertySet> propertySets;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkspaceImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointPackage.Literals.WORKSPACE;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<RuleSet> getRuleSets() {

		if (ruleSets == null) {
			ruleSets = new EObjectContainmentEList<RuleSet>(RuleSet.class, this, ViewpointPackage.WORKSPACE__RULE_SETS);
		}
		return ruleSets;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ServiceSet> getServiceSets() {

		if (serviceSets == null) {
			serviceSets = new EObjectContainmentEList<ServiceSet>(ServiceSet.class, this, ViewpointPackage.WORKSPACE__SERVICE_SETS);
		}
		return serviceSets;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Viewpoint> getActiveViewpoints() {

		if (activeViewpoints == null) {
			activeViewpoints = new EObjectResolvingEList<Viewpoint>(Viewpoint.class, this, ViewpointPackage.WORKSPACE__ACTIVE_VIEWPOINTS);
		}
		return activeViewpoints;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<PropertySet> getPropertySets() {

		if (propertySets == null) {
			propertySets = new EObjectContainmentEList<PropertySet>(PropertySet.class, this, ViewpointPackage.WORKSPACE__PROPERTY_SETS);
		}
		return propertySets;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public RuleSet getRuleSet(Viewpoint vp) {
		RuleSet result = null;
		for (RuleSet set : getRuleSets()) {
			if (vp.equals(set.getTarget())) {
				if (result != null)
					throw new IllegalStateException("Multple ruleset is not expected");
				result = set;
			}
		}
		return result;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ServiceSet getServiceSet(Viewpoint vp) {
		ServiceSet result = null;
		for (ServiceSet set : getServiceSets()) {
			if (vp.equals(set.getTarget())) {
				if (result != null)
					throw new IllegalStateException("Multple ServiceSet is not expected");
				result = set;
			}
		}
		return result;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public PropertySet getPropertySet(Viewpoint vp) {
		PropertySet result = null;
		for (PropertySet set : getPropertySets()) {
			if (vp.equals(set.getTarget())) {
				if (result != null)
					throw new IllegalStateException("Multple propertyset is not expected");
				result = set;
			}
		}
		return result;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewpointPackage.WORKSPACE__RULE_SETS:
				return ((InternalEList<?>)getRuleSets()).basicRemove(otherEnd, msgs);
			case ViewpointPackage.WORKSPACE__SERVICE_SETS:
				return ((InternalEList<?>)getServiceSets()).basicRemove(otherEnd, msgs);
			case ViewpointPackage.WORKSPACE__PROPERTY_SETS:
				return ((InternalEList<?>)getPropertySets()).basicRemove(otherEnd, msgs);
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
			case ViewpointPackage.WORKSPACE__RULE_SETS:
				return getRuleSets();
			case ViewpointPackage.WORKSPACE__SERVICE_SETS:
				return getServiceSets();
			case ViewpointPackage.WORKSPACE__ACTIVE_VIEWPOINTS:
				return getActiveViewpoints();
			case ViewpointPackage.WORKSPACE__PROPERTY_SETS:
				return getPropertySets();
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
			case ViewpointPackage.WORKSPACE__RULE_SETS:
				getRuleSets().clear();
				getRuleSets().addAll((Collection<? extends RuleSet>)newValue);
				return;
			case ViewpointPackage.WORKSPACE__SERVICE_SETS:
				getServiceSets().clear();
				getServiceSets().addAll((Collection<? extends ServiceSet>)newValue);
				return;
			case ViewpointPackage.WORKSPACE__ACTIVE_VIEWPOINTS:
				getActiveViewpoints().clear();
				getActiveViewpoints().addAll((Collection<? extends Viewpoint>)newValue);
				return;
			case ViewpointPackage.WORKSPACE__PROPERTY_SETS:
				getPropertySets().clear();
				getPropertySets().addAll((Collection<? extends PropertySet>)newValue);
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
			case ViewpointPackage.WORKSPACE__RULE_SETS:
				getRuleSets().clear();
				return;
			case ViewpointPackage.WORKSPACE__SERVICE_SETS:
				getServiceSets().clear();
				return;
			case ViewpointPackage.WORKSPACE__ACTIVE_VIEWPOINTS:
				getActiveViewpoints().clear();
				return;
			case ViewpointPackage.WORKSPACE__PROPERTY_SETS:
				getPropertySets().clear();
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
			case ViewpointPackage.WORKSPACE__RULE_SETS:
				return ruleSets != null && !ruleSets.isEmpty();
			case ViewpointPackage.WORKSPACE__SERVICE_SETS:
				return serviceSets != null && !serviceSets.isEmpty();
			case ViewpointPackage.WORKSPACE__ACTIVE_VIEWPOINTS:
				return activeViewpoints != null && !activeViewpoints.isEmpty();
			case ViewpointPackage.WORKSPACE__PROPERTY_SETS:
				return propertySets != null && !propertySets.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //WorkspaceImpl
