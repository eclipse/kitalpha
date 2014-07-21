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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAttribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAttribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAttribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractAttributeImpl extends EObjectImpl implements
		AbstractAttribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractAttributeImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommondataPackage.Literals.ABSTRACT_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public String getName() {

		if (this instanceof ExternalAttribute) {
			EAttribute eAttribute = ((ExternalAttribute) this).getAttribute();
			return (eAttribute != null ? eAttribute.getName() : "");
		}

		if (this instanceof LocalAttribute) {
			Attribute attribute = ((LocalAttribute) this).getAttribute();
			return (attribute != null ? attribute.getName() : "");
		}

		throw new UnsupportedOperationException();

	}

} //AbstractAttributeImpl
