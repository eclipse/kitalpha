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

package org.polarsys.kitalpha.ad.integration.sirius.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.viewpoint.description.Group;

import org.polarsys.kitalpha.ad.integration.sirius.model.SiriusPackage;
import org.polarsys.kitalpha.ad.integration.sirius.model.SiriusRepresentation;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RepresentationElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.integration.sirius.model.impl.SiriusRepresentationImpl#getOdesign <em>Odesign</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiriusRepresentationImpl extends RepresentationElementImpl implements SiriusRepresentation {

	/**
	 * The cached value of the '{@link #getOdesign() <em>Odesign</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdesign()
	 * @generated
	 * @ordered
	 */
	protected Group odesign;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiriusRepresentationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiriusPackage.Literals.SIRIUS_REPRESENTATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Group getOdesign() {

		if (odesign != null && odesign.eIsProxy()) {
			InternalEObject oldOdesign = (InternalEObject)odesign;
			odesign = (Group)eResolveProxy(oldOdesign);
			if (odesign != oldOdesign) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiriusPackage.SIRIUS_REPRESENTATION__ODESIGN, oldOdesign, odesign));
			}
		}
		return odesign;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Group basicGetOdesign() {

		return odesign;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOdesign(Group newOdesign) {

		Group oldOdesign = odesign;
		odesign = newOdesign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiriusPackage.SIRIUS_REPRESENTATION__ODESIGN, oldOdesign, odesign));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiriusPackage.SIRIUS_REPRESENTATION__ODESIGN:
				if (resolve) return getOdesign();
				return basicGetOdesign();
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
			case SiriusPackage.SIRIUS_REPRESENTATION__ODESIGN:
				setOdesign((Group)newValue);
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
			case SiriusPackage.SIRIUS_REPRESENTATION__ODESIGN:
				setOdesign((Group)null);
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
			case SiriusPackage.SIRIUS_REPRESENTATION__ODESIGN:
				return odesign != null;
		}
		return super.eIsSet(featureID);
	}



} //SiriusRepresentationImpl
