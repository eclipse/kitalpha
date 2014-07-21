/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Mapping Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl#getOwnedDefaultPossibility <em>Owned Default Possibility</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl#getDefaultPossibility <em>Default Possibility</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl#getOwnedPossibilities <em>Owned Possibilities</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl#getAllPossibilities <em>All Possibilities</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl#getDomainMetaClass <em>Domain Meta Class</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl#getExtendedMappingElement <em>Extended Mapping Element</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl#isReuseSuperPossibilities <em>Reuse Super Possibilities</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl#isReuseSuperDefaultPossibility <em>Reuse Super Default Possibility</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl#getExtenders <em>Extenders</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingElementImpl extends EObjectImpl implements MappingElement {

	/**
	 * The cached value of the '{@link #getOwnedDefaultPossibility() <em>Owned Default Possibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDefaultPossibility()
	 * @generated
	 * @ordered
	 */
	protected MappingPossibility ownedDefaultPossibility;


  


  

	/**
	 * The cached value of the '{@link #getOwnedPossibilities() <em>Owned Possibilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPossibilities()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingPossibility> ownedPossibilities;


  


  

	/**
	 * The cached value of the '{@link #getDomainMetaClass() <em>Domain Meta Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainMetaClass()
	 * @generated
	 * @ordered
	 */
	protected Class<?> domainMetaClass;


  

	/**
	 * The cached value of the '{@link #getExtendedMappingElement() <em>Extended Mapping Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedMappingElement()
	 * @generated
	 * @ordered
	 */
	protected MappingElement extendedMappingElement;


  

	/**
	 * The default value of the '{@link #isReuseSuperPossibilities() <em>Reuse Super Possibilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReuseSuperPossibilities()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REUSE_SUPER_POSSIBILITIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReuseSuperPossibilities() <em>Reuse Super Possibilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReuseSuperPossibilities()
	 * @generated
	 * @ordered
	 */
	protected boolean reuseSuperPossibilities = REUSE_SUPER_POSSIBILITIES_EDEFAULT;


  

	/**
	 * The default value of the '{@link #isReuseSuperDefaultPossibility() <em>Reuse Super Default Possibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReuseSuperDefaultPossibility()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REUSE_SUPER_DEFAULT_POSSIBILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReuseSuperDefaultPossibility() <em>Reuse Super Default Possibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReuseSuperDefaultPossibility()
	 * @generated
	 * @ordered
	 */
	protected boolean reuseSuperDefaultPossibility = REUSE_SUPER_DEFAULT_POSSIBILITY_EDEFAULT;


  

	/**
	 * The cached value of the '{@link #getExtenders() <em>Extenders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtenders()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingElement> extenders;


  

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingElementImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.MAPPING_ELEMENT;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public MappingPossibility getOwnedDefaultPossibility() {

		return ownedDefaultPossibility;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedDefaultPossibility(MappingPossibility newOwnedDefaultPossibility, NotificationChain msgs) {

		MappingPossibility oldOwnedDefaultPossibility = ownedDefaultPossibility;
		ownedDefaultPossibility = newOwnedDefaultPossibility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING_ELEMENT__OWNED_DEFAULT_POSSIBILITY, oldOwnedDefaultPossibility, newOwnedDefaultPossibility);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOwnedDefaultPossibility(MappingPossibility newOwnedDefaultPossibility) {

		if (newOwnedDefaultPossibility != ownedDefaultPossibility) {
			NotificationChain msgs = null;
			if (ownedDefaultPossibility != null)
				msgs = ((InternalEObject)ownedDefaultPossibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.MAPPING_ELEMENT__OWNED_DEFAULT_POSSIBILITY, null, msgs);
			if (newOwnedDefaultPossibility != null)
				msgs = ((InternalEObject)newOwnedDefaultPossibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.MAPPING_ELEMENT__OWNED_DEFAULT_POSSIBILITY, null, msgs);
			msgs = basicSetOwnedDefaultPossibility(newOwnedDefaultPossibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING_ELEMENT__OWNED_DEFAULT_POSSIBILITY, newOwnedDefaultPossibility, newOwnedDefaultPossibility));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public MappingPossibility getDefaultPossibility() {


		// TODO: implement this method to return the 'Default Possibility' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<MappingPossibility> getOwnedPossibilities() {

		if (ownedPossibilities == null) {
			ownedPossibilities = new EObjectContainmentEList<MappingPossibility>(MappingPossibility.class, this, CommonPackage.MAPPING_ELEMENT__OWNED_POSSIBILITIES);
		}
		return ownedPossibilities;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<MappingPossibility> getAllPossibilities() {


		// TODO: implement this method to return the 'All Possibilities' reference list
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

	public Class<?> getDomainMetaClass() {

		return domainMetaClass;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setDomainMetaClass(Class<?> newDomainMetaClass) {

		Class<?> oldDomainMetaClass = domainMetaClass;
		domainMetaClass = newDomainMetaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING_ELEMENT__DOMAIN_META_CLASS, oldDomainMetaClass, domainMetaClass));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public MappingElement getExtendedMappingElement() {

		if (extendedMappingElement != null && extendedMappingElement.eIsProxy()) {
			InternalEObject oldExtendedMappingElement = (InternalEObject)extendedMappingElement;
			extendedMappingElement = (MappingElement)eResolveProxy(oldExtendedMappingElement);
			if (extendedMappingElement != oldExtendedMappingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.MAPPING_ELEMENT__EXTENDED_MAPPING_ELEMENT, oldExtendedMappingElement, extendedMappingElement));
			}
		}
		return extendedMappingElement;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public MappingElement basicGetExtendedMappingElement() {

		return extendedMappingElement;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetExtendedMappingElement(MappingElement newExtendedMappingElement, NotificationChain msgs) {

		MappingElement oldExtendedMappingElement = extendedMappingElement;
		extendedMappingElement = newExtendedMappingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING_ELEMENT__EXTENDED_MAPPING_ELEMENT, oldExtendedMappingElement, newExtendedMappingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setExtendedMappingElement(MappingElement newExtendedMappingElement) {

		if (newExtendedMappingElement != extendedMappingElement) {
			NotificationChain msgs = null;
			if (extendedMappingElement != null)
				msgs = ((InternalEObject)extendedMappingElement).eInverseRemove(this, CommonPackage.MAPPING_ELEMENT__EXTENDERS, MappingElement.class, msgs);
			if (newExtendedMappingElement != null)
				msgs = ((InternalEObject)newExtendedMappingElement).eInverseAdd(this, CommonPackage.MAPPING_ELEMENT__EXTENDERS, MappingElement.class, msgs);
			msgs = basicSetExtendedMappingElement(newExtendedMappingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING_ELEMENT__EXTENDED_MAPPING_ELEMENT, newExtendedMappingElement, newExtendedMappingElement));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isReuseSuperPossibilities() {

		return reuseSuperPossibilities;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setReuseSuperPossibilities(boolean newReuseSuperPossibilities) {

		boolean oldReuseSuperPossibilities = reuseSuperPossibilities;
		reuseSuperPossibilities = newReuseSuperPossibilities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING_ELEMENT__REUSE_SUPER_POSSIBILITIES, oldReuseSuperPossibilities, reuseSuperPossibilities));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isReuseSuperDefaultPossibility() {

		return reuseSuperDefaultPossibility;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setReuseSuperDefaultPossibility(boolean newReuseSuperDefaultPossibility) {

		boolean oldReuseSuperDefaultPossibility = reuseSuperDefaultPossibility;
		reuseSuperDefaultPossibility = newReuseSuperDefaultPossibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING_ELEMENT__REUSE_SUPER_DEFAULT_POSSIBILITY, oldReuseSuperDefaultPossibility, reuseSuperDefaultPossibility));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<MappingElement> getExtenders() {

		if (extenders == null) {
			extenders = new EObjectWithInverseResolvingEList<MappingElement>(MappingElement.class, this, CommonPackage.MAPPING_ELEMENT__EXTENDERS, CommonPackage.MAPPING_ELEMENT__EXTENDED_MAPPING_ELEMENT);
		}
		return extenders;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING_ELEMENT__NAME, oldName, name));

	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public MappingPossibility getApplicablePossibility(Object object_p) {

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
			case CommonPackage.MAPPING_ELEMENT__EXTENDED_MAPPING_ELEMENT:
				if (extendedMappingElement != null)
					msgs = ((InternalEObject)extendedMappingElement).eInverseRemove(this, CommonPackage.MAPPING_ELEMENT__EXTENDERS, MappingElement.class, msgs);
				return basicSetExtendedMappingElement((MappingElement)otherEnd, msgs);
			case CommonPackage.MAPPING_ELEMENT__EXTENDERS:
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
			case CommonPackage.MAPPING_ELEMENT__OWNED_DEFAULT_POSSIBILITY:
				return basicSetOwnedDefaultPossibility(null, msgs);
			case CommonPackage.MAPPING_ELEMENT__OWNED_POSSIBILITIES:
				return ((InternalEList<?>)getOwnedPossibilities()).basicRemove(otherEnd, msgs);
			case CommonPackage.MAPPING_ELEMENT__EXTENDED_MAPPING_ELEMENT:
				return basicSetExtendedMappingElement(null, msgs);
			case CommonPackage.MAPPING_ELEMENT__EXTENDERS:
				return ((InternalEList<?>)getExtenders()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.MAPPING_ELEMENT__OWNED_DEFAULT_POSSIBILITY:
				return getOwnedDefaultPossibility();
			case CommonPackage.MAPPING_ELEMENT__DEFAULT_POSSIBILITY:
				return getDefaultPossibility();
			case CommonPackage.MAPPING_ELEMENT__OWNED_POSSIBILITIES:
				return getOwnedPossibilities();
			case CommonPackage.MAPPING_ELEMENT__ALL_POSSIBILITIES:
				return getAllPossibilities();
			case CommonPackage.MAPPING_ELEMENT__DOMAIN_META_CLASS:
				return getDomainMetaClass();
			case CommonPackage.MAPPING_ELEMENT__EXTENDED_MAPPING_ELEMENT:
				if (resolve) return getExtendedMappingElement();
				return basicGetExtendedMappingElement();
			case CommonPackage.MAPPING_ELEMENT__REUSE_SUPER_POSSIBILITIES:
				return isReuseSuperPossibilities();
			case CommonPackage.MAPPING_ELEMENT__REUSE_SUPER_DEFAULT_POSSIBILITY:
				return isReuseSuperDefaultPossibility();
			case CommonPackage.MAPPING_ELEMENT__EXTENDERS:
				return getExtenders();
			case CommonPackage.MAPPING_ELEMENT__NAME:
				return getName();
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
			case CommonPackage.MAPPING_ELEMENT__OWNED_DEFAULT_POSSIBILITY:
				setOwnedDefaultPossibility((MappingPossibility)newValue);
				return;
			case CommonPackage.MAPPING_ELEMENT__OWNED_POSSIBILITIES:
				getOwnedPossibilities().clear();
				getOwnedPossibilities().addAll((Collection<? extends MappingPossibility>)newValue);
				return;
			case CommonPackage.MAPPING_ELEMENT__DOMAIN_META_CLASS:
				setDomainMetaClass((Class<?>)newValue);
				return;
			case CommonPackage.MAPPING_ELEMENT__EXTENDED_MAPPING_ELEMENT:
				setExtendedMappingElement((MappingElement)newValue);
				return;
			case CommonPackage.MAPPING_ELEMENT__REUSE_SUPER_POSSIBILITIES:
				setReuseSuperPossibilities((Boolean)newValue);
				return;
			case CommonPackage.MAPPING_ELEMENT__REUSE_SUPER_DEFAULT_POSSIBILITY:
				setReuseSuperDefaultPossibility((Boolean)newValue);
				return;
			case CommonPackage.MAPPING_ELEMENT__NAME:
				setName((String)newValue);
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
			case CommonPackage.MAPPING_ELEMENT__OWNED_DEFAULT_POSSIBILITY:
				setOwnedDefaultPossibility((MappingPossibility)null);
				return;
			case CommonPackage.MAPPING_ELEMENT__OWNED_POSSIBILITIES:
				getOwnedPossibilities().clear();
				return;
			case CommonPackage.MAPPING_ELEMENT__DOMAIN_META_CLASS:
				setDomainMetaClass((Class<?>)null);
				return;
			case CommonPackage.MAPPING_ELEMENT__EXTENDED_MAPPING_ELEMENT:
				setExtendedMappingElement((MappingElement)null);
				return;
			case CommonPackage.MAPPING_ELEMENT__REUSE_SUPER_POSSIBILITIES:
				setReuseSuperPossibilities(REUSE_SUPER_POSSIBILITIES_EDEFAULT);
				return;
			case CommonPackage.MAPPING_ELEMENT__REUSE_SUPER_DEFAULT_POSSIBILITY:
				setReuseSuperDefaultPossibility(REUSE_SUPER_DEFAULT_POSSIBILITY_EDEFAULT);
				return;
			case CommonPackage.MAPPING_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case CommonPackage.MAPPING_ELEMENT__OWNED_DEFAULT_POSSIBILITY:
				return ownedDefaultPossibility != null;
			case CommonPackage.MAPPING_ELEMENT__DEFAULT_POSSIBILITY:
				return getDefaultPossibility() != null;
			case CommonPackage.MAPPING_ELEMENT__OWNED_POSSIBILITIES:
				return ownedPossibilities != null && !ownedPossibilities.isEmpty();
			case CommonPackage.MAPPING_ELEMENT__ALL_POSSIBILITIES:
				return !getAllPossibilities().isEmpty();
			case CommonPackage.MAPPING_ELEMENT__DOMAIN_META_CLASS:
				return domainMetaClass != null;
			case CommonPackage.MAPPING_ELEMENT__EXTENDED_MAPPING_ELEMENT:
				return extendedMappingElement != null;
			case CommonPackage.MAPPING_ELEMENT__REUSE_SUPER_POSSIBILITIES:
				return reuseSuperPossibilities != REUSE_SUPER_POSSIBILITIES_EDEFAULT;
			case CommonPackage.MAPPING_ELEMENT__REUSE_SUPER_DEFAULT_POSSIBILITY:
				return reuseSuperDefaultPossibility != REUSE_SUPER_DEFAULT_POSSIBILITY_EDEFAULT;
			case CommonPackage.MAPPING_ELEMENT__EXTENDERS:
				return extenders != null && !extenders.isEmpty();
			case CommonPackage.MAPPING_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (domainMetaClass: "); //$NON-NLS-1$
		result.append(domainMetaClass);
		result.append(", reuseSuperPossibilities: "); //$NON-NLS-1$
		result.append(reuseSuperPossibilities);
		result.append(", reuseSuperDefaultPossibility: "); //$NON-NLS-1$
		result.append(reuseSuperDefaultPossibility);
		result.append(", name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}


} //MappingElementImpl
