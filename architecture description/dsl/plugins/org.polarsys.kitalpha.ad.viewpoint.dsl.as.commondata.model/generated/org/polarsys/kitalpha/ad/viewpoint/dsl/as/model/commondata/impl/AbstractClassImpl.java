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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAttribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAttribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAttribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractClassImpl extends EObjectImpl implements
		AbstractClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractClassImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private EList<AbstractAttribute> convertAttribute(
			EList<Attribute> attributes) {
		EList<AbstractAttribute> result = new BasicEList<AbstractAttribute>();
		for (Attribute iAttribute : attributes) {
			LocalAttribute local_attribute = CommondataFactory.eINSTANCE
					.createLocalAttribute();
			local_attribute.setAttribute(iAttribute);
			result.add(local_attribute);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private EList<AbstractAttribute> convertEAttribute(
			EList<EAttribute> attributes) {
		EList<AbstractAttribute> result = new BasicEList<AbstractAttribute>();
		for (EAttribute iEAttribute : attributes) {
			ExternalAttribute external_attribute = CommondataFactory.eINSTANCE
					.createExternalAttribute();
			external_attribute.setAttribute(iEAttribute);
			result.add(external_attribute);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommondataPackage.Literals.ABSTRACT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * This create a list of all AbstractAttribute of a given AbstractClass.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public EList<AbstractAttribute> getAbstractAttributes() {
		EList<AbstractAttribute> result = new BasicEList<AbstractAttribute>();
		if (this instanceof LocalClass) {
			LocalClass local_clazz = (LocalClass) this;
			Class clazz = local_clazz.getClass_();
			if (clazz != null) {
				EList<AbstractAttribute> attribute_list = convertAttribute(clazz
						.getVP_Class_Attributes());
				if (attribute_list.size() > 0)
					result.addAll(attribute_list);
			}
		}

		if (this instanceof ExternalClass) {
			ExternalClass external_clazz = (ExternalClass) this;
			EClass clazz = external_clazz.getClass_();
			if (clazz != null) {
				EList<AbstractAttribute> attribute_list = convertEAttribute(clazz
						.getEAttributes());
				if (attribute_list.size() > 0)
					result.addAll(attribute_list);
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public EList<AbstractAttribute> getAllAbstractAttributes() {
		EList<AbstractAttribute> result = new BasicEList<AbstractAttribute>();
		result.addAll(this.getAbstractAttributes());

		if (this instanceof LocalClass) {
			LocalClass local_clazz = (LocalClass) this;
			Class clazz = local_clazz.getClass_();
			if (clazz != null) {
				EList<AbstractSuperClass> abstract_super_class_list = clazz
						.getInheritences();
				for (AbstractSuperClass abstract_super_class : abstract_super_class_list) {

					if (abstract_super_class instanceof ExternalSuperClass) {
						ExternalSuperClass external_super_class = (ExternalSuperClass) abstract_super_class;
						EClass eclazz = external_super_class.getSuperClass();

						if (eclazz != null) {
							EList<AbstractAttribute> attribute_list = convertEAttribute(eclazz
									.getEAllAttributes());
							if (attribute_list.size() > 0)
								result.addAll(attribute_list);
						}
					}

					if (abstract_super_class instanceof LocalSuperClass) {
						LocalSuperClass local_super_class = (LocalSuperClass) abstract_super_class;
						Class vp_clazz = local_super_class.getSuperClass();
						if (vp_clazz != null) {
							LocalClass local_class = CommondataFactory.eINSTANCE
									.createLocalClass();
							local_class.setClass(local_super_class
									.getSuperClass());
							EList<AbstractAttribute> attribute_list = local_class
									.getAllAbstractAttributes();
							if (attribute_list.size() > 0)
								result.addAll(attribute_list);
						}
					}
				}
			}
		}

		if (this instanceof ExternalClass) {
			ExternalClass external_clazz = (ExternalClass) this;
			EClass clazz = external_clazz.getClass_();
			if (clazz != null) {
				for (EAttribute iEAttribute : clazz.getEAllAttributes()) {
					ExternalAttribute external_attribute = CommondataFactory.eINSTANCE
							.createExternalAttribute();
					external_attribute.setAttribute(iEAttribute);
					result.add(external_attribute);
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

	public EList<AbstractAssociation> getAbstractAssociations() {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<AbstractAssociation> getAllAbstractAssociation() {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<AbstractClass> getSuperAbstractTypes() {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<AbstractClass> getAllSuperAbstractTypes() {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (this instanceof LocalClass) {
			Class clazz = ((LocalClass) this).getClass_();
			return (clazz != null ? clazz.getName() : "");
		}

		if (this instanceof ExternalClass) {
			EClass clazz = ((ExternalClass) this).getClass_();
			return (clazz != null ? clazz.getName() : "");
		}

		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public String getEPackageName() {
		if (this instanceof LocalClass) 
		{
			Class clazz = ((LocalClass)this).getClass_();
			if (clazz != null)
			{
				Data data = (Data) clazz.eContainer();
				if (data != null)
				{
					Viewpoint dslVP = (Viewpoint) data.eContainer();
					if (dslVP != null )
						return dslVP.getShortName();
				}
			}
		}

		if (this instanceof ExternalClass) 
		{
			EClass clazz = ((ExternalClass) this).getClass_();
			if (clazz != null)
			{
				EPackage ePackage = clazz.getEPackage();
				if (ePackage != null)
					return ePackage.getName();
			}
		}

		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFQN() {
		String eClassName = this.getName();
		String ePackageName = "";
		try {
			ePackageName = this.getEPackageName();
			if (ePackageName.trim().length() > 0)
				return ePackageName+"."+eClassName;
		} catch (UnsupportedOperationException e) {
			return eClassName;
		}
		throw new UnsupportedOperationException();
	}

} //AbstractClassImpl
