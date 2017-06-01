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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.Customizations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramExtensionImpl#getExtented_diagram <em>Extented diagram</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramExtensionImpl#getOwnedCustomizations <em>Owned Customizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramExtensionImpl extends DiagramRepresentationImpl implements
		DiagramExtension {

	/**
	 * The cached value of the '{@link #getExtented_diagram() <em>Extented diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtented_diagram()
	 * @generated
	 * @ordered
	 */
	protected DiagramDescription extented_diagram;

	/**
	 * The cached value of the '{@link #getOwnedCustomizations() <em>Owned Customizations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCustomizations()
	 * @generated
	 * @ordered
	 */
	protected Customizations ownedCustomizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramExtensionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.DIAGRAM_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public DiagramDescription getExtented_diagram() {

		if (extented_diagram != null && extented_diagram.eIsProxy()) {
			InternalEObject oldExtented_diagram = (InternalEObject)extented_diagram;
			extented_diagram = (DiagramDescription)eResolveProxy(oldExtented_diagram);
			if (extented_diagram != oldExtented_diagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VpdiagramPackage.DIAGRAM_EXTENSION__EXTENTED_DIAGRAM, oldExtented_diagram, extented_diagram));
			}
		}
		return extented_diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public DiagramDescription basicGetExtented_diagram() {

		return extented_diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setExtented_diagram(DiagramDescription newExtented_diagram) {

		DiagramDescription oldExtented_diagram = extented_diagram;
		extented_diagram = newExtented_diagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.DIAGRAM_EXTENSION__EXTENTED_DIAGRAM, oldExtented_diagram, extented_diagram));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Customizations getOwnedCustomizations() {

		return ownedCustomizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedCustomizations(Customizations newOwnedCustomizations, NotificationChain msgs) {

		Customizations oldOwnedCustomizations = ownedCustomizations;
		ownedCustomizations = newOwnedCustomizations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpdiagramPackage.DIAGRAM_EXTENSION__OWNED_CUSTOMIZATIONS, oldOwnedCustomizations, newOwnedCustomizations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOwnedCustomizations(Customizations newOwnedCustomizations) {

		if (newOwnedCustomizations != ownedCustomizations) {
			NotificationChain msgs = null;
			if (ownedCustomizations != null)
				msgs = ((InternalEObject)ownedCustomizations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.DIAGRAM_EXTENSION__OWNED_CUSTOMIZATIONS, null, msgs);
			if (newOwnedCustomizations != null)
				msgs = ((InternalEObject)newOwnedCustomizations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpdiagramPackage.DIAGRAM_EXTENSION__OWNED_CUSTOMIZATIONS, null, msgs);
			msgs = basicSetOwnedCustomizations(newOwnedCustomizations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.DIAGRAM_EXTENSION__OWNED_CUSTOMIZATIONS, newOwnedCustomizations, newOwnedCustomizations));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpdiagramPackage.DIAGRAM_EXTENSION__OWNED_CUSTOMIZATIONS:
				return basicSetOwnedCustomizations(null, msgs);
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
			case VpdiagramPackage.DIAGRAM_EXTENSION__EXTENTED_DIAGRAM:
				if (resolve) return getExtented_diagram();
				return basicGetExtented_diagram();
			case VpdiagramPackage.DIAGRAM_EXTENSION__OWNED_CUSTOMIZATIONS:
				return getOwnedCustomizations();
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
			case VpdiagramPackage.DIAGRAM_EXTENSION__EXTENTED_DIAGRAM:
				setExtented_diagram((DiagramDescription)newValue);
				return;
			case VpdiagramPackage.DIAGRAM_EXTENSION__OWNED_CUSTOMIZATIONS:
				setOwnedCustomizations((Customizations)newValue);
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
			case VpdiagramPackage.DIAGRAM_EXTENSION__EXTENTED_DIAGRAM:
				setExtented_diagram((DiagramDescription)null);
				return;
			case VpdiagramPackage.DIAGRAM_EXTENSION__OWNED_CUSTOMIZATIONS:
				setOwnedCustomizations((Customizations)null);
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
			case VpdiagramPackage.DIAGRAM_EXTENSION__EXTENTED_DIAGRAM:
				return extented_diagram != null;
			case VpdiagramPackage.DIAGRAM_EXTENSION__OWNED_CUSTOMIZATIONS:
				return ownedCustomizations != null;
		}
		return super.eIsSet(featureID);
	}

} //DiagramExtensionImpl
