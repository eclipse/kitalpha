/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.SynchronizationMode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bordered Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.BorderedNodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.BorderedNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.BorderedNodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.BorderedNodeImpl#getSynchronizationMode <em>Synchronization Mode</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.BorderedNodeImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.BorderedNodeImpl#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BorderedNodeImpl extends AbstractNodeImpl implements BorderedNode {

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
	 * The default value of the '{@link #getSynchronizationMode() <em>Synchronization Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizationMode()
	 * @generated
	 * @ordered
	 */
	protected static final SynchronizationMode SYNCHRONIZATION_MODE_EDEFAULT = SynchronizationMode.DEFAULT;

	/**
	 * The cached value of the '{@link #getSynchronizationMode() <em>Synchronization Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizationMode()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationMode synchronizationMode = SYNCHRONIZATION_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected NodeMapping imports;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeDescription> style;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BorderedNodeImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.BORDERED_NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.BORDERED_NODE__ID, oldId, id));

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
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.BORDERED_NODE__NAME, oldName, name));

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
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.BORDERED_NODE__DESCRIPTION, oldDescription, description));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public SynchronizationMode getSynchronizationMode() {

		return synchronizationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setSynchronizationMode(SynchronizationMode newSynchronizationMode) {

		SynchronizationMode oldSynchronizationMode = synchronizationMode;
		synchronizationMode = newSynchronizationMode == null ? SYNCHRONIZATION_MODE_EDEFAULT : newSynchronizationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.BORDERED_NODE__SYNCHRONIZATION_MODE, oldSynchronizationMode, synchronizationMode));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NodeMapping getImports() {

		if (imports != null && imports.eIsProxy()) {
			InternalEObject oldImports = (InternalEObject)imports;
			imports = (NodeMapping)eResolveProxy(oldImports);
			if (imports != oldImports) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VpdiagramPackage.BORDERED_NODE__IMPORTS, oldImports, imports));
			}
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NodeMapping basicGetImports() {

		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setImports(NodeMapping newImports) {

		NodeMapping oldImports = imports;
		imports = newImports;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdiagramPackage.BORDERED_NODE__IMPORTS, oldImports, imports));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<NodeDescription> getStyle() {

		if (style == null) {
			style = new EObjectContainmentEList<NodeDescription>(NodeDescription.class, this, VpdiagramPackage.BORDERED_NODE__STYLE);
		}
		return style;
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
			case VpdiagramPackage.BORDERED_NODE__STYLE:
				return ((InternalEList<?>)getStyle()).basicRemove(otherEnd, msgs);
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
			case VpdiagramPackage.BORDERED_NODE__ID:
				return getId();
			case VpdiagramPackage.BORDERED_NODE__NAME:
				return getName();
			case VpdiagramPackage.BORDERED_NODE__DESCRIPTION:
				return getDescription();
			case VpdiagramPackage.BORDERED_NODE__SYNCHRONIZATION_MODE:
				return getSynchronizationMode();
			case VpdiagramPackage.BORDERED_NODE__IMPORTS:
				if (resolve) return getImports();
				return basicGetImports();
			case VpdiagramPackage.BORDERED_NODE__STYLE:
				return getStyle();
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
			case VpdiagramPackage.BORDERED_NODE__ID:
				setId((String)newValue);
				return;
			case VpdiagramPackage.BORDERED_NODE__NAME:
				setName((String)newValue);
				return;
			case VpdiagramPackage.BORDERED_NODE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case VpdiagramPackage.BORDERED_NODE__SYNCHRONIZATION_MODE:
				setSynchronizationMode((SynchronizationMode)newValue);
				return;
			case VpdiagramPackage.BORDERED_NODE__IMPORTS:
				setImports((NodeMapping)newValue);
				return;
			case VpdiagramPackage.BORDERED_NODE__STYLE:
				getStyle().clear();
				getStyle().addAll((Collection<? extends NodeDescription>)newValue);
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
			case VpdiagramPackage.BORDERED_NODE__ID:
				setId(ID_EDEFAULT);
				return;
			case VpdiagramPackage.BORDERED_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VpdiagramPackage.BORDERED_NODE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case VpdiagramPackage.BORDERED_NODE__SYNCHRONIZATION_MODE:
				setSynchronizationMode(SYNCHRONIZATION_MODE_EDEFAULT);
				return;
			case VpdiagramPackage.BORDERED_NODE__IMPORTS:
				setImports((NodeMapping)null);
				return;
			case VpdiagramPackage.BORDERED_NODE__STYLE:
				getStyle().clear();
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
			case VpdiagramPackage.BORDERED_NODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case VpdiagramPackage.BORDERED_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VpdiagramPackage.BORDERED_NODE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case VpdiagramPackage.BORDERED_NODE__SYNCHRONIZATION_MODE:
				return synchronizationMode != SYNCHRONIZATION_MODE_EDEFAULT;
			case VpdiagramPackage.BORDERED_NODE__IMPORTS:
				return imports != null;
			case VpdiagramPackage.BORDERED_NODE__STYLE:
				return style != null && !style.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ViewpointElement.class) {
			switch (derivedFeatureID) {
				case VpdiagramPackage.BORDERED_NODE__ID: return VpdescPackage.VIEWPOINT_ELEMENT__ID;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case VpdiagramPackage.BORDERED_NODE__NAME: return VpdescPackage.NAMED_ELEMENT__NAME;
				case VpdiagramPackage.BORDERED_NODE__DESCRIPTION: return VpdescPackage.NAMED_ELEMENT__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == DiagramElement.class) {
			switch (derivedFeatureID) {
				case VpdiagramPackage.BORDERED_NODE__SYNCHRONIZATION_MODE: return VpdiagramPackage.DIAGRAM_ELEMENT__SYNCHRONIZATION_MODE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ViewpointElement.class) {
			switch (baseFeatureID) {
				case VpdescPackage.VIEWPOINT_ELEMENT__ID: return VpdiagramPackage.BORDERED_NODE__ID;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case VpdescPackage.NAMED_ELEMENT__NAME: return VpdiagramPackage.BORDERED_NODE__NAME;
				case VpdescPackage.NAMED_ELEMENT__DESCRIPTION: return VpdiagramPackage.BORDERED_NODE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == DiagramElement.class) {
			switch (baseFeatureID) {
				case VpdiagramPackage.DIAGRAM_ELEMENT__SYNCHRONIZATION_MODE: return VpdiagramPackage.BORDERED_NODE__SYNCHRONIZATION_MODE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", synchronizationMode: ");
		result.append(synchronizationMode);
		result.append(')');
		return result.toString();
	}

} //BorderedNodeImpl
