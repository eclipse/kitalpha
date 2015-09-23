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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.viewpoint.description.Group;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AspectImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramSetImpl#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramSetImpl#getAdditionalExternalGroup <em>Additional External Group</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramSetImpl#getAdditionalExternalData <em>Additional External Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramSetImpl extends AspectImpl implements DiagramSet {

	/**
	 * The cached value of the '{@link #getDiagrams() <em>Diagrams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramRepresentation> diagrams;

	/**
	 * The cached value of the '{@link #getAdditionalExternalGroup() <em>Additional External Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalExternalGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> additionalExternalGroup;

	/**
	 * The cached value of the '{@link #getAdditionalExternalData() <em>Additional External Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalExternalData()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> additionalExternalData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.DIAGRAM_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<DiagramRepresentation> getDiagrams() {

		if (diagrams == null) {
			diagrams = new EObjectContainmentEList<DiagramRepresentation>(DiagramRepresentation.class, this, VpdiagramPackage.DIAGRAM_SET__DIAGRAMS);
		}
		return diagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getAdditionalExternalGroup() {

		if (additionalExternalGroup == null) {
			additionalExternalGroup = new EObjectResolvingEList<Group>(Group.class, this, VpdiagramPackage.DIAGRAM_SET__ADDITIONAL_EXTERNAL_GROUP);
		}
		return additionalExternalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getAdditionalExternalData() {

		if (additionalExternalData == null) {
			additionalExternalData = new EObjectResolvingEList<EPackage>(EPackage.class, this, VpdiagramPackage.DIAGRAM_SET__ADDITIONAL_EXTERNAL_DATA);
		}
		return additionalExternalData;
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
			case VpdiagramPackage.DIAGRAM_SET__DIAGRAMS:
				return ((InternalEList<?>)getDiagrams()).basicRemove(otherEnd, msgs);
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
			case VpdiagramPackage.DIAGRAM_SET__DIAGRAMS:
				return getDiagrams();
			case VpdiagramPackage.DIAGRAM_SET__ADDITIONAL_EXTERNAL_GROUP:
				return getAdditionalExternalGroup();
			case VpdiagramPackage.DIAGRAM_SET__ADDITIONAL_EXTERNAL_DATA:
				return getAdditionalExternalData();
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
			case VpdiagramPackage.DIAGRAM_SET__DIAGRAMS:
				getDiagrams().clear();
				getDiagrams().addAll((Collection<? extends DiagramRepresentation>)newValue);
				return;
			case VpdiagramPackage.DIAGRAM_SET__ADDITIONAL_EXTERNAL_GROUP:
				getAdditionalExternalGroup().clear();
				getAdditionalExternalGroup().addAll((Collection<? extends Group>)newValue);
				return;
			case VpdiagramPackage.DIAGRAM_SET__ADDITIONAL_EXTERNAL_DATA:
				getAdditionalExternalData().clear();
				getAdditionalExternalData().addAll((Collection<? extends EPackage>)newValue);
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
			case VpdiagramPackage.DIAGRAM_SET__DIAGRAMS:
				getDiagrams().clear();
				return;
			case VpdiagramPackage.DIAGRAM_SET__ADDITIONAL_EXTERNAL_GROUP:
				getAdditionalExternalGroup().clear();
				return;
			case VpdiagramPackage.DIAGRAM_SET__ADDITIONAL_EXTERNAL_DATA:
				getAdditionalExternalData().clear();
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
			case VpdiagramPackage.DIAGRAM_SET__DIAGRAMS:
				return diagrams != null && !diagrams.isEmpty();
			case VpdiagramPackage.DIAGRAM_SET__ADDITIONAL_EXTERNAL_GROUP:
				return additionalExternalGroup != null && !additionalExternalGroup.isEmpty();
			case VpdiagramPackage.DIAGRAM_SET__ADDITIONAL_EXTERNAL_DATA:
				return additionalExternalData != null && !additionalExternalData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagramSetImpl
