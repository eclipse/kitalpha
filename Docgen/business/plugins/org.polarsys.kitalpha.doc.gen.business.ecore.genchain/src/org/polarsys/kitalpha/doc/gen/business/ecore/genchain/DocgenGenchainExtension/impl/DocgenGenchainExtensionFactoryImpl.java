/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocgenGenchainExtensionFactoryImpl extends EFactoryImpl implements DocgenGenchainExtensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DocgenGenchainExtensionFactory init() {
		try {
			DocgenGenchainExtensionFactory theDocgenGenchainExtensionFactory = (DocgenGenchainExtensionFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/kitalpha/docgen/ecore/genchain/1.0.0"); 
			if (theDocgenGenchainExtensionFactory != null) {
				return theDocgenGenchainExtensionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DocgenGenchainExtensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocgenGenchainExtensionFactoryImpl() {
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
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION: return createKitalphaDocumentationGeneration();
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION_BRANDING: return createKitalphaDocumentationGenerationBranding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KitalphaDocumentationGeneration createKitalphaDocumentationGeneration() {
		KitalphaDocumentationGenerationImpl kitalphaDocumentationGeneration = new KitalphaDocumentationGenerationImpl();
		return kitalphaDocumentationGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KitalphaDocumentationGenerationBranding createKitalphaDocumentationGenerationBranding() {
		KitalphaDocumentationGenerationBrandingImpl kitalphaDocumentationGenerationBranding = new KitalphaDocumentationGenerationBrandingImpl();
		return kitalphaDocumentationGenerationBranding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocgenGenchainExtensionPackage getDocgenGenchainExtensionPackage() {
		return (DocgenGenchainExtensionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DocgenGenchainExtensionPackage getPackage() {
		return DocgenGenchainExtensionPackage.eINSTANCE;
	}

} //DocgenGenchainExtensionFactoryImpl
