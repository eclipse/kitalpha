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

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.AbstractPage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Activity;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Section;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension;

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
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerImpl#getOwnedPages <em>Owned Pages</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerImpl#getOwnedSectionExtensions <em>Owned Section Extensions</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ViewpointActivityExplorerImpl#getAllActivities <em>All Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewpointActivityExplorerImpl extends AspectImpl implements ViewpointActivityExplorer {

	/**
	 * The cached value of the '{@link #getOwnedPages() <em>Owned Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPages()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPage> ownedPages;




	/**
	 * The cached value of the '{@link #getOwnedSectionExtensions() <em>Owned Section Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSectionExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<SectionExtension> ownedSectionExtensions;




	/**
	 * The cached value of the '{@link #getAllActivities() <em>All Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> allActivities;




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
	public EList<AbstractPage> getOwnedPages() {

		if (ownedPages == null) {
			ownedPages = new EObjectContainmentEList<AbstractPage>(AbstractPage.class, this, ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_PAGES);
		}
		return ownedPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SectionExtension> getOwnedSectionExtensions() {

		if (ownedSectionExtensions == null) {
			ownedSectionExtensions = new EObjectContainmentEList<SectionExtension>(SectionExtension.class, this, ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTION_EXTENSIONS);
		}
		return ownedSectionExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Activity> getAllActivities() {
		EList<Activity> result = new BasicEList<Activity>();
		
		// Get activities of Sections extensions.
		final EList<SectionExtension> sectionExtensions = getOwnedSectionExtensions();
		for (SectionExtension sectionExtension : sectionExtensions) 
		{
			final EList<Activity> ownedActivities = sectionExtension.getOwnedActivities();
			if (! ownedActivities.isEmpty())
				result.addAll(ownedActivities);
		}
		
		// Get Activities of new pages sections
		final EList<AbstractPage> abstractPages = getOwnedPages();
		for (AbstractPage abstractPage : abstractPages) 
		{
			if (abstractPage instanceof Page)
			{
				final Page page = (Page) abstractPage;
				final EList<Section> ownedSections = page.getOwnedSections();
				for (Section section : ownedSections) 
				{
					final EList<Activity> ownedActivities = section.getOwnedActivities();
					if (! ownedActivities.isEmpty())
					{
						result.addAll(ownedActivities);
					}
				}
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
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_PAGES:
				return ((InternalEList<?>)getOwnedPages()).basicRemove(otherEnd, msgs);
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTION_EXTENSIONS:
				return ((InternalEList<?>)getOwnedSectionExtensions()).basicRemove(otherEnd, msgs);
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
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_PAGES:
				return getOwnedPages();
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTION_EXTENSIONS:
				return getOwnedSectionExtensions();
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__ALL_ACTIVITIES:
				return getAllActivities();
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
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_PAGES:
				getOwnedPages().clear();
				getOwnedPages().addAll((Collection<? extends AbstractPage>)newValue);
				return;
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTION_EXTENSIONS:
				getOwnedSectionExtensions().clear();
				getOwnedSectionExtensions().addAll((Collection<? extends SectionExtension>)newValue);
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
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_PAGES:
				getOwnedPages().clear();
				return;
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTION_EXTENSIONS:
				getOwnedSectionExtensions().clear();
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
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_PAGES:
				return ownedPages != null && !ownedPages.isEmpty();
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTION_EXTENSIONS:
				return ownedSectionExtensions != null && !ownedSectionExtensions.isEmpty();
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__ALL_ACTIVITIES:
				return allActivities != null && !allActivities.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //ViewpointActivityExplorerImpl
