/*******************************************************************************
 * Copyright (c) 2006, 2018 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.diffmerge.patterns.core.CorePatternsPlugin;
import org.eclipse.emf.diffmerge.patterns.core.api.IIdentifiedElement;
import org.eclipse.emf.diffmerge.patterns.core.api.IPatternInstanceMarker;
import org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.AbstractIdentifiedElement;
import org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.CorepatternsPackage;
import org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.CommonPatternInstance;
import org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.CommonPatternInstanceSet;
import org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.CommonpatternsupportPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.kitalpha.emde.model.impl.ElementExtensionImpl;
import org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.EmdePatternInstanceSet;
import org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.EmdepatternsupportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emde Pattern Instance Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.impl.EmdePatternInstanceSetImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.impl.EmdePatternInstanceSetImpl#getOwnedInstances <em>Owned Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmdePatternInstanceSetImpl extends ElementExtensionImpl implements EmdePatternInstanceSet {
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
	 * The cached value of the '{@link #getOwnedInstances() <em>Owned Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOwnedInstances()
	 * @generated
	 * @ordered
	 */
  protected EList<CommonPatternInstance> ownedInstances;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated NOT
	 */
  protected EmdePatternInstanceSetImpl() {
		super();
    CorePatternsPlugin.getDefault().setNewId(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return EmdepatternsupportPackage.Literals.EMDE_PATTERN_INSTANCE_SET;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public String getId() {
		return id;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EmdepatternsupportPackage.EMDE_PATTERN_INSTANCE_SET__ID, oldId, id));
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public EList<CommonPatternInstance> getOwnedInstances() {
		if (ownedInstances == null) {
			ownedInstances = new EObjectContainmentEList<CommonPatternInstance>(CommonPatternInstance.class, this, EmdepatternsupportPackage.EMDE_PATTERN_INSTANCE_SET__OWNED_INSTANCES);
		}
		return ownedInstances;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmdepatternsupportPackage.EMDE_PATTERN_INSTANCE_SET__OWNED_INSTANCES:
				return ((InternalEList<?>)getOwnedInstances()).basicRemove(otherEnd, msgs);
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
			case EmdepatternsupportPackage.EMDE_PATTERN_INSTANCE_SET__ID:
				return getId();
			case EmdepatternsupportPackage.EMDE_PATTERN_INSTANCE_SET__OWNED_INSTANCES:
				return getOwnedInstances();
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
			case EmdepatternsupportPackage.EMDE_PATTERN_INSTANCE_SET__ID:
				setId((String)newValue);
				return;
			case EmdepatternsupportPackage.EMDE_PATTERN_INSTANCE_SET__OWNED_INSTANCES:
				getOwnedInstances().clear();
				getOwnedInstances().addAll((Collection<? extends CommonPatternInstance>)newValue);
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
			case EmdepatternsupportPackage.EMDE_PATTERN_INSTANCE_SET__ID:
				setId(ID_EDEFAULT);
				return;
			case EmdepatternsupportPackage.EMDE_PATTERN_INSTANCE_SET__OWNED_INSTANCES:
				getOwnedInstances().clear();
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
			case EmdepatternsupportPackage.EMDE_PATTERN_INSTANCE_SET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EmdepatternsupportPackage.EMDE_PATTERN_INSTANCE_SET__OWNED_INSTANCES:
				return ownedInstances != null && !ownedInstances.isEmpty();
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
		if (baseClass == IIdentifiedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractIdentifiedElement.class) {
			switch (derivedFeatureID) {
				case EmdepatternsupportPackage.EMDE_PATTERN_INSTANCE_SET__ID: return CorepatternsPackage.ABSTRACT_IDENTIFIED_ELEMENT__ID;
				default: return -1;
			}
		}
		if (baseClass == IPatternInstanceMarker.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CommonPatternInstanceSet.class) {
			switch (derivedFeatureID) {
				case EmdepatternsupportPackage.EMDE_PATTERN_INSTANCE_SET__OWNED_INSTANCES: return CommonpatternsupportPackage.COMMON_PATTERN_INSTANCE_SET__OWNED_INSTANCES;
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
		if (baseClass == IIdentifiedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractIdentifiedElement.class) {
			switch (baseFeatureID) {
				case CorepatternsPackage.ABSTRACT_IDENTIFIED_ELEMENT__ID: return EmdepatternsupportPackage.EMDE_PATTERN_INSTANCE_SET__ID;
				default: return -1;
			}
		}
		if (baseClass == IPatternInstanceMarker.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CommonPatternInstanceSet.class) {
			switch (baseFeatureID) {
				case CommonpatternsupportPackage.COMMON_PATTERN_INSTANCE_SET__OWNED_INSTANCES: return EmdepatternsupportPackage.EMDE_PATTERN_INSTANCE_SET__OWNED_INSTANCES;
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EmdePatternInstanceSetImpl
