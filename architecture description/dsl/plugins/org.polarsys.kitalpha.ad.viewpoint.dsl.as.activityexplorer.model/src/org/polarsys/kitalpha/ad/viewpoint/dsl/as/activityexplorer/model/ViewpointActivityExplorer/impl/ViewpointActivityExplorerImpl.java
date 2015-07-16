/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Activities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Pages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Sections;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AspectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewpoint Activity Explorer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerImpl#getOwnedNewPages <em>Owned New Pages</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerImpl#getOwnedSectionsExtension <em>Owned Sections Extension</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerImpl#getOwnedActivitiesExtension <em>Owned Activities Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewpointActivityExplorerImpl extends AspectImpl implements ViewpointActivityExplorer {

	/**
	 * The cached value of the '{@link #getOwnedNewPages() <em>Owned New Pages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNewPages()
	 * @generated
	 * @ordered
	 */
	protected Pages ownedNewPages;




	/**
	 * The cached value of the '{@link #getOwnedSectionsExtension() <em>Owned Sections Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSectionsExtension()
	 * @generated
	 * @ordered
	 */
	protected Sections ownedSectionsExtension;




	/**
	 * The cached value of the '{@link #getOwnedActivitiesExtension() <em>Owned Activities Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActivitiesExtension()
	 * @generated
	 * @ordered
	 */
	protected Activities ownedActivitiesExtension;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewpointActivityExplorerImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointActivityExplorerPackage.Literals.VIEWPOINT_ACTIVITY_EXPLORER;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Pages getOwnedNewPages() {

		return ownedNewPages;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedNewPages(Pages newOwnedNewPages, NotificationChain msgs) {

		Pages oldOwnedNewPages = ownedNewPages;
		ownedNewPages = newOwnedNewPages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_NEW_PAGES, oldOwnedNewPages, newOwnedNewPages);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOwnedNewPages(Pages newOwnedNewPages) {

		if (newOwnedNewPages != ownedNewPages) {
			NotificationChain msgs = null;
			if (ownedNewPages != null)
				msgs = ((InternalEObject)ownedNewPages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_NEW_PAGES, null, msgs);
			if (newOwnedNewPages != null)
				msgs = ((InternalEObject)newOwnedNewPages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_NEW_PAGES, null, msgs);
			msgs = basicSetOwnedNewPages(newOwnedNewPages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_NEW_PAGES, newOwnedNewPages, newOwnedNewPages));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Sections getOwnedSectionsExtension() {

		return ownedSectionsExtension;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedSectionsExtension(Sections newOwnedSectionsExtension, NotificationChain msgs) {

		Sections oldOwnedSectionsExtension = ownedSectionsExtension;
		ownedSectionsExtension = newOwnedSectionsExtension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTIONS_EXTENSION, oldOwnedSectionsExtension, newOwnedSectionsExtension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOwnedSectionsExtension(Sections newOwnedSectionsExtension) {

		if (newOwnedSectionsExtension != ownedSectionsExtension) {
			NotificationChain msgs = null;
			if (ownedSectionsExtension != null)
				msgs = ((InternalEObject)ownedSectionsExtension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTIONS_EXTENSION, null, msgs);
			if (newOwnedSectionsExtension != null)
				msgs = ((InternalEObject)newOwnedSectionsExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTIONS_EXTENSION, null, msgs);
			msgs = basicSetOwnedSectionsExtension(newOwnedSectionsExtension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTIONS_EXTENSION, newOwnedSectionsExtension, newOwnedSectionsExtension));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Activities getOwnedActivitiesExtension() {

		return ownedActivitiesExtension;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedActivitiesExtension(Activities newOwnedActivitiesExtension, NotificationChain msgs) {

		Activities oldOwnedActivitiesExtension = ownedActivitiesExtension;
		ownedActivitiesExtension = newOwnedActivitiesExtension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_ACTIVITIES_EXTENSION, oldOwnedActivitiesExtension, newOwnedActivitiesExtension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOwnedActivitiesExtension(Activities newOwnedActivitiesExtension) {

		if (newOwnedActivitiesExtension != ownedActivitiesExtension) {
			NotificationChain msgs = null;
			if (ownedActivitiesExtension != null)
				msgs = ((InternalEObject)ownedActivitiesExtension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_ACTIVITIES_EXTENSION, null, msgs);
			if (newOwnedActivitiesExtension != null)
				msgs = ((InternalEObject)newOwnedActivitiesExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_ACTIVITIES_EXTENSION, null, msgs);
			msgs = basicSetOwnedActivitiesExtension(newOwnedActivitiesExtension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_ACTIVITIES_EXTENSION, newOwnedActivitiesExtension, newOwnedActivitiesExtension));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_NEW_PAGES:
				return basicSetOwnedNewPages(null, msgs);
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTIONS_EXTENSION:
				return basicSetOwnedSectionsExtension(null, msgs);
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_ACTIVITIES_EXTENSION:
				return basicSetOwnedActivitiesExtension(null, msgs);
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
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_NEW_PAGES:
				return getOwnedNewPages();
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTIONS_EXTENSION:
				return getOwnedSectionsExtension();
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_ACTIVITIES_EXTENSION:
				return getOwnedActivitiesExtension();
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
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_NEW_PAGES:
				setOwnedNewPages((Pages)newValue);
				return;
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTIONS_EXTENSION:
				setOwnedSectionsExtension((Sections)newValue);
				return;
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_ACTIVITIES_EXTENSION:
				setOwnedActivitiesExtension((Activities)newValue);
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
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_NEW_PAGES:
				setOwnedNewPages((Pages)null);
				return;
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTIONS_EXTENSION:
				setOwnedSectionsExtension((Sections)null);
				return;
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_ACTIVITIES_EXTENSION:
				setOwnedActivitiesExtension((Activities)null);
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
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_NEW_PAGES:
				return ownedNewPages != null;
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTIONS_EXTENSION:
				return ownedSectionsExtension != null;
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_ACTIVITIES_EXTENSION:
				return ownedActivitiesExtension != null;
		}
		return super.eIsSet(featureID);
	}



} //ViewpointActivityExplorerImpl
