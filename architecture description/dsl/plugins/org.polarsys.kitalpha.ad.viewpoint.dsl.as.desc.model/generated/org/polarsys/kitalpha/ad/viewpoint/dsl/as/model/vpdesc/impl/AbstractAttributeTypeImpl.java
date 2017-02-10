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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractAttributeTypeImpl extends EObjectImpl implements AbstractAttributeType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractAttributeTypeImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdescPackage.Literals.ABSTRACT_ATTRIBUTE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public String getName() {
		switch (eClass().getClassifierID()) {
		case VpdescPackage.LOCAL_ATTRIBUTE_TYPE:
			LocalAttributeType localType = (LocalAttributeType) this;
			NamedElement namedElement = localType.getType();
			if (namedElement != null)
				return namedElement.getName();
			
			break;
			
		case VpdescPackage.EXTERNAL_ATTRIBUTE_TYPE:
			ExternalAttributeType externalType = (ExternalAttributeType) this;
			EDataType dataType = externalType.getType();
			if (dataType != null)
				return dataType.getName();
			
			break;
		}
		return "Unknown";
	}




} //AbstractAttributeTypeImpl
