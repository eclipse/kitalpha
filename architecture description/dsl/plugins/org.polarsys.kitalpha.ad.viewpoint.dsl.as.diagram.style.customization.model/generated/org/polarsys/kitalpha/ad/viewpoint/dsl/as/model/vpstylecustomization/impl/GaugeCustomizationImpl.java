/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sirius.diagram.AlignmentKind;

import org.eclipse.sirius.diagram.description.style.GaugeSectionDescription;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gauge Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.GaugeCustomizationImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.GaugeCustomizationImpl#getAlignement <em>Alignement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GaugeCustomizationImpl extends SpecificNodeStyleCustomizationImpl implements GaugeCustomization {

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<GaugeSectionDescription> sections;




	/**
	 * The default value of the '{@link #getAlignement() <em>Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignement()
	 * @generated NOT
	 * @ordered
	 */
	protected static final AlignmentKind ALIGNEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlignement() <em>Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignement()
	 * @generated
	 * @ordered
	 */
	protected AlignmentKind alignement = ALIGNEMENT_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaugeCustomizationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.GAUGE_CUSTOMIZATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<GaugeSectionDescription> getSections() {

		if (sections == null) {
			sections = new EObjectResolvingEList<GaugeSectionDescription>(GaugeSectionDescription.class, this, VpstylecustomizationPackage.GAUGE_CUSTOMIZATION__SECTIONS);
		}
		return sections;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AlignmentKind getAlignement() {

		return alignement;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setAlignement(AlignmentKind newAlignement) {

		AlignmentKind oldAlignement = alignement;
		alignement = newAlignement == null ? ALIGNEMENT_EDEFAULT : newAlignement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.GAUGE_CUSTOMIZATION__ALIGNEMENT, oldAlignement, alignement));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpstylecustomizationPackage.GAUGE_CUSTOMIZATION__SECTIONS:
				return getSections();
			case VpstylecustomizationPackage.GAUGE_CUSTOMIZATION__ALIGNEMENT:
				return getAlignement();
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
			case VpstylecustomizationPackage.GAUGE_CUSTOMIZATION__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends GaugeSectionDescription>)newValue);
				return;
			case VpstylecustomizationPackage.GAUGE_CUSTOMIZATION__ALIGNEMENT:
				setAlignement((AlignmentKind)newValue);
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
			case VpstylecustomizationPackage.GAUGE_CUSTOMIZATION__SECTIONS:
				getSections().clear();
				return;
			case VpstylecustomizationPackage.GAUGE_CUSTOMIZATION__ALIGNEMENT:
				setAlignement(ALIGNEMENT_EDEFAULT);
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
			case VpstylecustomizationPackage.GAUGE_CUSTOMIZATION__SECTIONS:
				return sections != null && !sections.isEmpty();
			case VpstylecustomizationPackage.GAUGE_CUSTOMIZATION__ALIGNEMENT:
				return alignement != ALIGNEMENT_EDEFAULT;
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
		result.append(" (alignement: ");
		result.append(alignement);
		result.append(')');
		return result.toString();
	}


} //GaugeCustomizationImpl
