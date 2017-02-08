/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointResources;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.util.AspectsAdditionsHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointImpl#getVP_Data <em>VP Data</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointImpl#getVP_Aspects <em>VP Aspects</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointImpl#getUseViewpoint <em>Use Viewpoint</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointImpl#getViewpointResources <em>Viewpoint Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewpointImpl extends ShortNamedElementImpl implements Viewpoint {

	/**
	 * The cached value of the '{@link #getVP_Data() <em>VP Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVP_Data()
	 * @generated
	 * @ordered
	 */
	protected Data vP_Data;

	/**
	 * The cached value of the '{@link #getVP_Aspects() <em>VP Aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVP_Aspects()
	 * @generated
	 * @ordered
	 */
	protected EList<Aspect> vP_Aspects;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Viewpoint> dependencies;

	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Viewpoint> parents;

	/**
	 * The cached value of the '{@link #getUseViewpoint() <em>Use Viewpoint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseViewpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Viewpoint> useViewpoint;

	/**
	 * The cached value of the '{@link #getViewpointResources() <em>Viewpoint Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpointResources()
	 * @generated
	 * @ordered
	 */
	protected ViewpointResources viewpointResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewpointImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdescPackage.Literals.VIEWPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Data getVP_Data() {

		return vP_Data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetVP_Data(Data newVP_Data,
			NotificationChain msgs) {

		Data oldVP_Data = vP_Data;
		vP_Data = newVP_Data;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdescPackage.VIEWPOINT__VP_DATA, oldVP_Data, newVP_Data);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setVP_Data(Data newVP_Data) {

		if (newVP_Data != vP_Data) {
			NotificationChain msgs = null;
			if (vP_Data != null)
				msgs = ((InternalEObject)vP_Data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdescPackage.VIEWPOINT__VP_DATA, null, msgs);
			if (newVP_Data != null)
				msgs = ((InternalEObject)newVP_Data).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdescPackage.VIEWPOINT__VP_DATA, null, msgs);
			msgs = basicSetVP_Data(newVP_Data, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.VIEWPOINT__VP_DATA, newVP_Data, newVP_Data));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public EList<Aspect> getVP_Aspects() {

		if (vP_Aspects == null) {
			vP_Aspects = new EObjectContainmentEList<Aspect>(Aspect.class,
					this, VpdescPackage.VIEWPOINT__VP_ASPECTS)//;
			{
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				public void add(int index, Aspect object) {
					if (AspectsAdditionsHelper.canAddMoreAspect(this, object)) {
						super.add(index, object);
					}
				};

				public boolean addAll(
						java.util.Collection<? extends Aspect> collection) {
					if (AspectsAdditionsHelper.canAddMoreAspects(this,
							collection)) {
						return super.addAll(collection);
					}
					return false;
				};

				public boolean addAll(int index,
						java.util.Collection<? extends Aspect> collection) {
					if (AspectsAdditionsHelper.canAddMoreAspects(this,
							collection)) {
						return super.addAll(index, collection);
					}
					return false;
				};

				public boolean add(Aspect object) {
					if (AspectsAdditionsHelper.canAddMoreAspect(this, object)) {
						return super.add(object);
					}
					return false;
				};
			};
		}
		return vP_Aspects;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Viewpoint> getDependencies() {

		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<Viewpoint>(Viewpoint.class, this, VpdescPackage.VIEWPOINT__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Viewpoint> getParents() {

		if (parents == null) {
			parents = new EObjectResolvingEList<Viewpoint>(Viewpoint.class, this, VpdescPackage.VIEWPOINT__PARENTS);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Viewpoint> getUseViewpoint() {

		if (useViewpoint == null) {
			useViewpoint = new EObjectResolvingEList<Viewpoint>(Viewpoint.class, this, VpdescPackage.VIEWPOINT__USE_VIEWPOINT);
		}
		return useViewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ViewpointResources getViewpointResources() {

		return viewpointResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetViewpointResources(ViewpointResources newViewpointResources, NotificationChain msgs) {

		ViewpointResources oldViewpointResources = viewpointResources;
		viewpointResources = newViewpointResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdescPackage.VIEWPOINT__VIEWPOINT_RESOURCES, oldViewpointResources, newViewpointResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setViewpointResources(ViewpointResources newViewpointResources) {

		if (newViewpointResources != viewpointResources) {
			NotificationChain msgs = null;
			if (viewpointResources != null)
				msgs = ((InternalEObject)viewpointResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdescPackage.VIEWPOINT__VIEWPOINT_RESOURCES, null, msgs);
			if (newViewpointResources != null)
				msgs = ((InternalEObject)newViewpointResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdescPackage.VIEWPOINT__VIEWPOINT_RESOURCES, null, msgs);
			msgs = basicSetViewpointResources(newViewpointResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.VIEWPOINT__VIEWPOINT_RESOURCES, newViewpointResources, newViewpointResources));

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
			case VpdescPackage.VIEWPOINT__VP_DATA:
				return basicSetVP_Data(null, msgs);
			case VpdescPackage.VIEWPOINT__VP_ASPECTS:
				return ((InternalEList<?>)getVP_Aspects()).basicRemove(otherEnd, msgs);
			case VpdescPackage.VIEWPOINT__VIEWPOINT_RESOURCES:
				return basicSetViewpointResources(null, msgs);
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
			case VpdescPackage.VIEWPOINT__VP_DATA:
				return getVP_Data();
			case VpdescPackage.VIEWPOINT__VP_ASPECTS:
				return getVP_Aspects();
			case VpdescPackage.VIEWPOINT__DEPENDENCIES:
				return getDependencies();
			case VpdescPackage.VIEWPOINT__PARENTS:
				return getParents();
			case VpdescPackage.VIEWPOINT__USE_VIEWPOINT:
				return getUseViewpoint();
			case VpdescPackage.VIEWPOINT__VIEWPOINT_RESOURCES:
				return getViewpointResources();
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
			case VpdescPackage.VIEWPOINT__VP_DATA:
				setVP_Data((Data)newValue);
				return;
			case VpdescPackage.VIEWPOINT__VP_ASPECTS:
				getVP_Aspects().clear();
				getVP_Aspects().addAll((Collection<? extends Aspect>)newValue);
				return;
			case VpdescPackage.VIEWPOINT__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Viewpoint>)newValue);
				return;
			case VpdescPackage.VIEWPOINT__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends Viewpoint>)newValue);
				return;
			case VpdescPackage.VIEWPOINT__USE_VIEWPOINT:
				getUseViewpoint().clear();
				getUseViewpoint().addAll((Collection<? extends Viewpoint>)newValue);
				return;
			case VpdescPackage.VIEWPOINT__VIEWPOINT_RESOURCES:
				setViewpointResources((ViewpointResources)newValue);
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
			case VpdescPackage.VIEWPOINT__VP_DATA:
				setVP_Data((Data)null);
				return;
			case VpdescPackage.VIEWPOINT__VP_ASPECTS:
				getVP_Aspects().clear();
				return;
			case VpdescPackage.VIEWPOINT__DEPENDENCIES:
				getDependencies().clear();
				return;
			case VpdescPackage.VIEWPOINT__PARENTS:
				getParents().clear();
				return;
			case VpdescPackage.VIEWPOINT__USE_VIEWPOINT:
				getUseViewpoint().clear();
				return;
			case VpdescPackage.VIEWPOINT__VIEWPOINT_RESOURCES:
				setViewpointResources((ViewpointResources)null);
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
			case VpdescPackage.VIEWPOINT__VP_DATA:
				return vP_Data != null;
			case VpdescPackage.VIEWPOINT__VP_ASPECTS:
				return vP_Aspects != null && !vP_Aspects.isEmpty();
			case VpdescPackage.VIEWPOINT__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case VpdescPackage.VIEWPOINT__PARENTS:
				return parents != null && !parents.isEmpty();
			case VpdescPackage.VIEWPOINT__USE_VIEWPOINT:
				return useViewpoint != null && !useViewpoint.isEmpty();
			case VpdescPackage.VIEWPOINT__VIEWPOINT_RESOURCES:
				return viewpointResources != null;
		}
		return super.eIsSet(featureID);
	}

} //ViewpointImpl
