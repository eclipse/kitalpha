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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractAssociationImpl extends EObjectImpl implements
		AbstractAssociation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractAssociationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommondataPackage.Literals.ABSTRACT_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public String getName() {
		String empty = "";
		if (this instanceof ExternalAssociation) {
			EReference eReference = ((ExternalAssociation) this).getReference();
			return (eReference != null ? eReference.getName() : empty);
		}

		if (this instanceof LocalAssociation) {
			NamedElement reference = ((LocalAssociation) this).getReference();
			return (reference != null ? reference.getName() : empty);
		}
		return empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public boolean isMany() {
		if (this instanceof ExternalAssociation) {
			EReference eReference = ((ExternalAssociation) this).getReference();
			return (eReference != null ? eReference.isMany() : false);
		}

		if (this instanceof LocalAssociation) {
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation reference = ((LocalAssociation) this).getReference();
			if (reference != null)
				switch (reference.getCardinality()) {
				case NOTHING_OR_MANY:
				case ONE_OR_MANY:
					return true;
				}
		}
		return false;
	}

} //AbstractAssociationImpl
