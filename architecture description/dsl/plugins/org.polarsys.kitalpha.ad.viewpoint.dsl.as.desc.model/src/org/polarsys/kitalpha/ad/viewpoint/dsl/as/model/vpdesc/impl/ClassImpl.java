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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Operation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ClassImpl#getVP_Classes_Associations <em>VP Classes Associations</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ClassImpl#getVP_Class_Attributes <em>VP Class Attributes</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ClassImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ClassImpl#getInheritences <em>Inheritences</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ClassImpl#getVP_Class_Operations <em>VP Class Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ViewpointClassifierImpl implements
		org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class {

	/**
	 * The cached value of the '{@link #getVP_Classes_Associations() <em>VP Classes Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVP_Classes_Associations()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractAssociation> vP_Classes_Associations;

	/**
	 * The cached value of the '{@link #getVP_Class_Attributes() <em>VP Class Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVP_Class_Attributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> vP_Class_Attributes;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> extends_;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInheritences() <em>Inheritences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritences()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractSuperClass> inheritences;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVP_Class_Operations() <em>VP Class Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVP_Class_Operations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> vP_Class_Operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdescPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<AbstractAssociation> getVP_Classes_Associations() {

		if (vP_Classes_Associations == null) {
			vP_Classes_Associations = new EObjectContainmentEList<AbstractAssociation>(AbstractAssociation.class, this, VpdescPackage.CLASS__VP_CLASSES_ASSOCIATIONS);
		}
		return vP_Classes_Associations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Attribute> getVP_Class_Attributes() {

		if (vP_Class_Attributes == null) {
			vP_Class_Attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, VpdescPackage.CLASS__VP_CLASS_ATTRIBUTES);
		}
		return vP_Class_Attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<EClass> getExtends() {

		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<EClass>(EClass.class, this, VpdescPackage.CLASS__EXTENDS);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getIcon() {

		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIcon(String newIcon) {

		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.CLASS__ICON, oldIcon, icon));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<AbstractSuperClass> getInheritences() {

		if (inheritences == null) {
			inheritences = new EObjectContainmentEList<AbstractSuperClass>(AbstractSuperClass.class, this, VpdescPackage.CLASS__INHERITENCES);
		}
		return inheritences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isAbstract() {

		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setAbstract(boolean newAbstract) {

		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpdescPackage.CLASS__ABSTRACT, oldAbstract, abstract_));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Operation> getVP_Class_Operations() {

		if (vP_Class_Operations == null) {
			vP_Class_Operations = new EObjectContainmentEList<Operation>(Operation.class, this, VpdescPackage.CLASS__VP_CLASS_OPERATIONS);
		}
		return vP_Class_Operations;
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
			case VpdescPackage.CLASS__VP_CLASSES_ASSOCIATIONS:
				return ((InternalEList<?>)getVP_Classes_Associations()).basicRemove(otherEnd, msgs);
			case VpdescPackage.CLASS__VP_CLASS_ATTRIBUTES:
				return ((InternalEList<?>)getVP_Class_Attributes()).basicRemove(otherEnd, msgs);
			case VpdescPackage.CLASS__INHERITENCES:
				return ((InternalEList<?>)getInheritences()).basicRemove(otherEnd, msgs);
			case VpdescPackage.CLASS__VP_CLASS_OPERATIONS:
				return ((InternalEList<?>)getVP_Class_Operations()).basicRemove(otherEnd, msgs);
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
			case VpdescPackage.CLASS__VP_CLASSES_ASSOCIATIONS:
				return getVP_Classes_Associations();
			case VpdescPackage.CLASS__VP_CLASS_ATTRIBUTES:
				return getVP_Class_Attributes();
			case VpdescPackage.CLASS__EXTENDS:
				return getExtends();
			case VpdescPackage.CLASS__ICON:
				return getIcon();
			case VpdescPackage.CLASS__INHERITENCES:
				return getInheritences();
			case VpdescPackage.CLASS__ABSTRACT:
				return isAbstract();
			case VpdescPackage.CLASS__VP_CLASS_OPERATIONS:
				return getVP_Class_Operations();
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
			case VpdescPackage.CLASS__VP_CLASSES_ASSOCIATIONS:
				getVP_Classes_Associations().clear();
				getVP_Classes_Associations().addAll((Collection<? extends AbstractAssociation>)newValue);
				return;
			case VpdescPackage.CLASS__VP_CLASS_ATTRIBUTES:
				getVP_Class_Attributes().clear();
				getVP_Class_Attributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case VpdescPackage.CLASS__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends EClass>)newValue);
				return;
			case VpdescPackage.CLASS__ICON:
				setIcon((String)newValue);
				return;
			case VpdescPackage.CLASS__INHERITENCES:
				getInheritences().clear();
				getInheritences().addAll((Collection<? extends AbstractSuperClass>)newValue);
				return;
			case VpdescPackage.CLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case VpdescPackage.CLASS__VP_CLASS_OPERATIONS:
				getVP_Class_Operations().clear();
				getVP_Class_Operations().addAll((Collection<? extends Operation>)newValue);
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
			case VpdescPackage.CLASS__VP_CLASSES_ASSOCIATIONS:
				getVP_Classes_Associations().clear();
				return;
			case VpdescPackage.CLASS__VP_CLASS_ATTRIBUTES:
				getVP_Class_Attributes().clear();
				return;
			case VpdescPackage.CLASS__EXTENDS:
				getExtends().clear();
				return;
			case VpdescPackage.CLASS__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case VpdescPackage.CLASS__INHERITENCES:
				getInheritences().clear();
				return;
			case VpdescPackage.CLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case VpdescPackage.CLASS__VP_CLASS_OPERATIONS:
				getVP_Class_Operations().clear();
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
			case VpdescPackage.CLASS__VP_CLASSES_ASSOCIATIONS:
				return vP_Classes_Associations != null && !vP_Classes_Associations.isEmpty();
			case VpdescPackage.CLASS__VP_CLASS_ATTRIBUTES:
				return vP_Class_Attributes != null && !vP_Class_Attributes.isEmpty();
			case VpdescPackage.CLASS__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case VpdescPackage.CLASS__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case VpdescPackage.CLASS__INHERITENCES:
				return inheritences != null && !inheritences.isEmpty();
			case VpdescPackage.CLASS__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case VpdescPackage.CLASS__VP_CLASS_OPERATIONS:
				return vP_Class_Operations != null && !vP_Class_Operations.isEmpty();
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
		result.append(" (icon: ");
		result.append(icon);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
