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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommondataFactoryImpl extends EFactoryImpl implements
		CommondataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommondataFactory init() {
		try {
			CommondataFactory theCommondataFactory = (CommondataFactory)EPackage.Registry.INSTANCE.getEFactory(CommondataPackage.eNS_URI);
			if (theCommondataFactory != null) {
				return theCommondataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommondataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommondataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CommondataPackage.EXTERNAL_CLASS: return createExternalClass();
			case CommondataPackage.LOCAL_CLASS: return createLocalClass();
			case CommondataPackage.EXTERNAL_ASSOCIATION: return createExternalAssociation();
			case CommondataPackage.LOCAL_ASSOCIATION: return createLocalAssociation();
			case CommondataPackage.LOCAL_ATTRIBUTE: return createLocalAttribute();
			case CommondataPackage.EXTERNAL_ATTRIBUTE: return createExternalAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalClass createExternalClass() {
		ExternalClassImpl externalClass = new ExternalClassImpl();
		return externalClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalClass createLocalClass() {
		LocalClassImpl localClass = new LocalClassImpl();
		return localClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalAssociation createExternalAssociation() {
		ExternalAssociationImpl externalAssociation = new ExternalAssociationImpl();
		return externalAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAssociation createLocalAssociation() {
		LocalAssociationImpl localAssociation = new LocalAssociationImpl();
		return localAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAttribute createLocalAttribute() {
		LocalAttributeImpl localAttribute = new LocalAttributeImpl();
		return localAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalAttribute createExternalAttribute() {
		ExternalAttributeImpl externalAttribute = new ExternalAttributeImpl();
		return externalAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommondataPackage getCommondataPackage() {
		return (CommondataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommondataPackage getPackage() {
		return CommondataPackage.eINSTANCE;
	}

} //CommondataFactoryImpl
