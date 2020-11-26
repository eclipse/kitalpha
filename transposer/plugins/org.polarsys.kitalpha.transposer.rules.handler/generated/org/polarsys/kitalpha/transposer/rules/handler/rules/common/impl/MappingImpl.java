/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl;

import org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.MappingResolutionException;

import org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPurpose;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility;

import java.util.Collection;

import org.eclipse.core.runtime.IStatus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getExtendedMapping <em>Extended Mapping</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getExtenders <em>Extenders</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getOwnedPackages <em>Owned Packages</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getOwnedMappingElements <em>Owned Mapping Elements</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getOwnedDomainHelper <em>Owned Domain Helper</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getDomainHelper <em>Domain Helper</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getAllOwnedMappingElements <em>All Owned Mapping Elements</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getCompleteDescription <em>Complete Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getOwnedContext <em>Owned Context</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#isPrivate <em>Private</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends EObjectImpl implements Mapping {

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;


  

	/**
	 * The cached value of the '{@link #getExtendedMapping() <em>Extended Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedMapping()
	 * @generated
	 * @ordered
	 */
	protected Mapping extendedMapping;


  

	/**
	 * The cached value of the '{@link #getExtenders() <em>Extenders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtenders()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> extenders;


  

	/**
	 * The cached value of the '{@link #getOwnedPackages() <em>Owned Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingPackage> ownedPackages;


  

	/**
	 * The cached value of the '{@link #getOwnedMappingElements() <em>Owned Mapping Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMappingElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingElement> ownedMappingElements;


  

	/**
	 * The default value of the '{@link #getOwnedDomainHelper() <em>Owned Domain Helper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDomainHelper()
	 * @generated
	 * @ordered
	 */
	protected static final IDomainHelper OWNED_DOMAIN_HELPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwnedDomainHelper() <em>Owned Domain Helper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDomainHelper()
	 * @generated
	 * @ordered
	 */
	protected IDomainHelper ownedDomainHelper = OWNED_DOMAIN_HELPER_EDEFAULT;


  

	/**
	 * The default value of the '{@link #getDomainHelper() <em>Domain Helper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainHelper()
	 * @generated
	 * @ordered
	 */
	protected static final IDomainHelper DOMAIN_HELPER_EDEFAULT = null;


  


  


  

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;


  

	/**
	 * The default value of the '{@link #getCompleteDescription() <em>Complete Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETE_DESCRIPTION_EDEFAULT = null;


  

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;


  

	/**
	 * The default value of the '{@link #getOwnedContext() <em>Owned Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedContext()
	 * @generated
	 * @ordered
	 */
	protected static final IContext OWNED_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwnedContext() <em>Owned Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedContext()
	 * @generated
	 * @ordered
	 */
	protected IContext ownedContext = OWNED_CONTEXT_EDEFAULT;


  

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final IContext CONTEXT_EDEFAULT = null;


  
	/**
	 * The default value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIVATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected boolean private_ = PRIVATE_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.MAPPING;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getName() {

		return name;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setName(String newName) {

		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING__NAME, oldName, name));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Mapping getExtendedMapping() {

		if (extendedMapping != null && extendedMapping.eIsProxy()) {
			InternalEObject oldExtendedMapping = (InternalEObject)extendedMapping;
			extendedMapping = (Mapping)eResolveProxy(oldExtendedMapping);
			if (extendedMapping != oldExtendedMapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.MAPPING__EXTENDED_MAPPING, oldExtendedMapping, extendedMapping));
			}
		}
		return extendedMapping;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Mapping basicGetExtendedMapping() {

		return extendedMapping;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetExtendedMapping(Mapping newExtendedMapping, NotificationChain msgs) {

		Mapping oldExtendedMapping = extendedMapping;
		extendedMapping = newExtendedMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING__EXTENDED_MAPPING, oldExtendedMapping, newExtendedMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setExtendedMapping(Mapping newExtendedMapping) {

		if (newExtendedMapping != extendedMapping) {
			NotificationChain msgs = null;
			if (extendedMapping != null)
				msgs = ((InternalEObject)extendedMapping).eInverseRemove(this, CommonPackage.MAPPING__EXTENDERS, Mapping.class, msgs);
			if (newExtendedMapping != null)
				msgs = ((InternalEObject)newExtendedMapping).eInverseAdd(this, CommonPackage.MAPPING__EXTENDERS, Mapping.class, msgs);
			msgs = basicSetExtendedMapping(newExtendedMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING__EXTENDED_MAPPING, newExtendedMapping, newExtendedMapping));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Mapping> getExtenders() {

		if (extenders == null) {
			extenders = new EObjectWithInverseResolvingEList<Mapping>(Mapping.class, this, CommonPackage.MAPPING__EXTENDERS, CommonPackage.MAPPING__EXTENDED_MAPPING);
		}
		return extenders;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<MappingPackage> getOwnedPackages() {

		if (ownedPackages == null) {
			ownedPackages = new EObjectContainmentEList<MappingPackage>(MappingPackage.class, this, CommonPackage.MAPPING__OWNED_PACKAGES);
		}
		return ownedPackages;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<MappingElement> getOwnedMappingElements() {

		if (ownedMappingElements == null) {
			ownedMappingElements = new EObjectContainmentEList<MappingElement>(MappingElement.class, this, CommonPackage.MAPPING__OWNED_MAPPING_ELEMENTS);
		}
		return ownedMappingElements;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public IDomainHelper getOwnedDomainHelper() {

		return ownedDomainHelper;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOwnedDomainHelper(IDomainHelper newOwnedDomainHelper) {

		IDomainHelper oldOwnedDomainHelper = ownedDomainHelper;
		ownedDomainHelper = newOwnedDomainHelper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING__OWNED_DOMAIN_HELPER, oldOwnedDomainHelper, ownedDomainHelper));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public IDomainHelper getDomainHelper() {


		// TODO: implement this method to return the 'Domain Helper' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<MappingElement> getAllOwnedMappingElements() {


		// TODO: implement this method to return the 'All Owned Mapping Elements' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public IPurpose getPurpose() {


		// TODO: implement this method to return the 'Purpose' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getDescription() {

		return description;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setDescription(String newDescription) {

		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING__DESCRIPTION, oldDescription, description));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getCompleteDescription() {


		// TODO: implement this method to return the 'Complete Description' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getId() {

		return id;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setId(String newId) {

		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING__ID, oldId, id));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public IContext getOwnedContext() {

		return ownedContext;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOwnedContext(IContext newOwnedContext) {

		IContext oldOwnedContext = ownedContext;
		ownedContext = newOwnedContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING__OWNED_CONTEXT, oldOwnedContext, ownedContext));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public IContext getContext() {


		// TODO: implement this method to return the 'Context' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isPrivate() {

		return private_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setPrivate(boolean newPrivate) {

		boolean oldPrivate = private_;
		private_ = newPrivate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING__PRIVATE, oldPrivate, private_));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public IStatus validate() {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public MappingElement getOwnedMappingElement(Class<?> domainClass_p) {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public MappingPossibility resolveApplicablePossibility(Object object_p, IDomainHelper domainHelper_p) throws MappingPossibilityResolutionException {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public MappingElement resolveUniqueAvailableMappingElement(Object object_p, IDomainHelper domainHelper_p) throws MappingResolutionException {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<MappingElement> resolveAllAvailableMappingElements(Class<?> domainClass_p) {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Mapping> getExtendersWithSamePurpose() {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.MAPPING__EXTENDED_MAPPING:
				if (extendedMapping != null)
					msgs = ((InternalEObject)extendedMapping).eInverseRemove(this, CommonPackage.MAPPING__EXTENDERS, Mapping.class, msgs);
				return basicSetExtendedMapping((Mapping)otherEnd, msgs);
			case CommonPackage.MAPPING__EXTENDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtenders()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.MAPPING__EXTENDED_MAPPING:
				return basicSetExtendedMapping(null, msgs);
			case CommonPackage.MAPPING__EXTENDERS:
				return ((InternalEList<?>)getExtenders()).basicRemove(otherEnd, msgs);
			case CommonPackage.MAPPING__OWNED_PACKAGES:
				return ((InternalEList<?>)getOwnedPackages()).basicRemove(otherEnd, msgs);
			case CommonPackage.MAPPING__OWNED_MAPPING_ELEMENTS:
				return ((InternalEList<?>)getOwnedMappingElements()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.MAPPING__NAME:
				return getName();
			case CommonPackage.MAPPING__EXTENDED_MAPPING:
				if (resolve) return getExtendedMapping();
				return basicGetExtendedMapping();
			case CommonPackage.MAPPING__EXTENDERS:
				return getExtenders();
			case CommonPackage.MAPPING__OWNED_PACKAGES:
				return getOwnedPackages();
			case CommonPackage.MAPPING__OWNED_MAPPING_ELEMENTS:
				return getOwnedMappingElements();
			case CommonPackage.MAPPING__OWNED_DOMAIN_HELPER:
				return getOwnedDomainHelper();
			case CommonPackage.MAPPING__DOMAIN_HELPER:
				return getDomainHelper();
			case CommonPackage.MAPPING__ALL_OWNED_MAPPING_ELEMENTS:
				return getAllOwnedMappingElements();
			case CommonPackage.MAPPING__PURPOSE:
				return getPurpose();
			case CommonPackage.MAPPING__DESCRIPTION:
				return getDescription();
			case CommonPackage.MAPPING__COMPLETE_DESCRIPTION:
				return getCompleteDescription();
			case CommonPackage.MAPPING__ID:
				return getId();
			case CommonPackage.MAPPING__OWNED_CONTEXT:
				return getOwnedContext();
			case CommonPackage.MAPPING__CONTEXT:
				return getContext();
			case CommonPackage.MAPPING__PRIVATE:
				return isPrivate();
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
			case CommonPackage.MAPPING__NAME:
				setName((String)newValue);
				return;
			case CommonPackage.MAPPING__EXTENDED_MAPPING:
				setExtendedMapping((Mapping)newValue);
				return;
			case CommonPackage.MAPPING__OWNED_PACKAGES:
				getOwnedPackages().clear();
				getOwnedPackages().addAll((Collection<? extends MappingPackage>)newValue);
				return;
			case CommonPackage.MAPPING__OWNED_MAPPING_ELEMENTS:
				getOwnedMappingElements().clear();
				getOwnedMappingElements().addAll((Collection<? extends MappingElement>)newValue);
				return;
			case CommonPackage.MAPPING__OWNED_DOMAIN_HELPER:
				setOwnedDomainHelper((IDomainHelper)newValue);
				return;
			case CommonPackage.MAPPING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CommonPackage.MAPPING__ID:
				setId((String)newValue);
				return;
			case CommonPackage.MAPPING__OWNED_CONTEXT:
				setOwnedContext((IContext)newValue);
				return;
			case CommonPackage.MAPPING__PRIVATE:
				setPrivate((Boolean)newValue);
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
			case CommonPackage.MAPPING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommonPackage.MAPPING__EXTENDED_MAPPING:
				setExtendedMapping((Mapping)null);
				return;
			case CommonPackage.MAPPING__OWNED_PACKAGES:
				getOwnedPackages().clear();
				return;
			case CommonPackage.MAPPING__OWNED_MAPPING_ELEMENTS:
				getOwnedMappingElements().clear();
				return;
			case CommonPackage.MAPPING__OWNED_DOMAIN_HELPER:
				setOwnedDomainHelper(OWNED_DOMAIN_HELPER_EDEFAULT);
				return;
			case CommonPackage.MAPPING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CommonPackage.MAPPING__ID:
				setId(ID_EDEFAULT);
				return;
			case CommonPackage.MAPPING__OWNED_CONTEXT:
				setOwnedContext(OWNED_CONTEXT_EDEFAULT);
				return;
			case CommonPackage.MAPPING__PRIVATE:
				setPrivate(PRIVATE_EDEFAULT);
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
			case CommonPackage.MAPPING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CommonPackage.MAPPING__EXTENDED_MAPPING:
				return extendedMapping != null;
			case CommonPackage.MAPPING__EXTENDERS:
				return extenders != null && !extenders.isEmpty();
			case CommonPackage.MAPPING__OWNED_PACKAGES:
				return ownedPackages != null && !ownedPackages.isEmpty();
			case CommonPackage.MAPPING__OWNED_MAPPING_ELEMENTS:
				return ownedMappingElements != null && !ownedMappingElements.isEmpty();
			case CommonPackage.MAPPING__OWNED_DOMAIN_HELPER:
				return OWNED_DOMAIN_HELPER_EDEFAULT == null ? ownedDomainHelper != null : !OWNED_DOMAIN_HELPER_EDEFAULT.equals(ownedDomainHelper);
			case CommonPackage.MAPPING__DOMAIN_HELPER:
				return DOMAIN_HELPER_EDEFAULT == null ? getDomainHelper() != null : !DOMAIN_HELPER_EDEFAULT.equals(getDomainHelper());
			case CommonPackage.MAPPING__ALL_OWNED_MAPPING_ELEMENTS:
				return !getAllOwnedMappingElements().isEmpty();
			case CommonPackage.MAPPING__PURPOSE:
				return getPurpose() != null;
			case CommonPackage.MAPPING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CommonPackage.MAPPING__COMPLETE_DESCRIPTION:
				return COMPLETE_DESCRIPTION_EDEFAULT == null ? getCompleteDescription() != null : !COMPLETE_DESCRIPTION_EDEFAULT.equals(getCompleteDescription());
			case CommonPackage.MAPPING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CommonPackage.MAPPING__OWNED_CONTEXT:
				return OWNED_CONTEXT_EDEFAULT == null ? ownedContext != null : !OWNED_CONTEXT_EDEFAULT.equals(ownedContext);
			case CommonPackage.MAPPING__CONTEXT:
				return CONTEXT_EDEFAULT == null ? getContext() != null : !CONTEXT_EDEFAULT.equals(getContext());
			case CommonPackage.MAPPING__PRIVATE:
				return private_ != PRIVATE_EDEFAULT;
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", ownedDomainHelper: "); //$NON-NLS-1$
		result.append(ownedDomainHelper);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", ownedContext: "); //$NON-NLS-1$
		result.append(ownedContext);
		result.append(", private: "); //$NON-NLS-1$
		result.append(private_);
		result.append(')');
		return result.toString();
	}


} //MappingImpl
